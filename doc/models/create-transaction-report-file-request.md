
# Create Transaction Report File Request

## Structure

`CreateTransactionReportFileRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `StartAt` | `LocalDateTime` | Optional | - | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `EndAt` | `String` | Optional | - | String getEndAt() | setEndAt(String endAt) |

## Example (as JSON)

```json
{
  "name": "name0",
  "start_at": null,
  "end_at": null
}
```

