import android.content.Context
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

object SecuredPreference {
    private const val PREF_NAME = "secured_prefs"
    private lateinit var sharedPreferences: EncryptedSharedPreferences

    fun init(context: Context) {
        val masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
        sharedPreferences = EncryptedSharedPreferences.create(
            PREF_NAME,
            masterKeyAlias,
            context,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    fun putDouble(key: String, value: Double) {
        sharedPreferences.edit().putString(key, value.toString()).apply()
    }

    fun getDouble(key: String, default: Double = 0.0): Double {
        return sharedPreferences.getString(key, default.toString())?.toDoubleOrNull() ?: default
    }

    enum class EnvironmentKey {
        CURRENT_LATITUDE,
        CURRENT_LONGITUDE
    }
} 