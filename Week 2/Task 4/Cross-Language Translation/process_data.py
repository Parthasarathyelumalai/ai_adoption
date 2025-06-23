def process_data(records):
    """
    Processes a list of records, filtering and transforming data.
    Args:
        records (list of dict): Each dict contains 'id', 'value', and 'status'.
    Returns:
        dict: Mapping of 'id' to processed 'value' for valid records.
    """
    result = {}
    for record in records:
        try:
            if record['status'] != 'active':
                continue
            value = float(record['value'])
            if value < 0:
                raise ValueError("Negative value not allowed")
            result[record['id']] = value * 2
        except (KeyError, ValueError) as e:
            print(f"Skipping record due to error: {e}")
    return result 