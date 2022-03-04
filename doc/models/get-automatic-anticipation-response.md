
# Get Automatic Anticipation Response

## Structure

`GetAutomaticAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | - | boolean getEnabled() | setEnabled(boolean enabled) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `VolumePercentage` | `int` | Required | - | int getVolumePercentage() | setVolumePercentage(int volumePercentage) |
| `Delay` | `int` | Required | - | int getDelay() | setDelay(int delay) |
| `Days` | `List<Integer>` | Required | - | List<Integer> getDays() | setDays(List<Integer> days) |

## Example (as JSON)

```json
{
  "enabled": false,
  "type": "type0",
  "volume_percentage": 62,
  "delay": 228,
  "days": [
    188,
    189,
    190
  ]
}
```

