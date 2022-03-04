
# Get Split Options Response

## Structure

`GetSplitOptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Liable` | `boolean` | Required | - | boolean getLiable() | setLiable(boolean liable) |
| `ChargeProcessingFee` | `boolean` | Required | - | boolean getChargeProcessingFee() | setChargeProcessingFee(boolean chargeProcessingFee) |
| `ChargeRemainderFee` | `String` | Required | - | String getChargeRemainderFee() | setChargeRemainderFee(String chargeRemainderFee) |

## Example (as JSON)

```json
{
  "liable": false,
  "charge_processing_fee": false,
  "charge_remainder_fee": "charge_remainder_fee8"
}
```

