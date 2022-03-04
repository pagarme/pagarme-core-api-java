
# Update Subscription Start at Request

Request for updating the start date from a subscription

## Structure

`UpdateSubscriptionStartAtRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartAt` | `LocalDateTime` | Required | The date when the subscription periods will start | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |

## Example (as JSON)

```json
{
  "start_at": "2016-03-13T12:52:32.123Z"
}
```

