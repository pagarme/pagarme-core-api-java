
# Get Checkout Boleto Payment Response

## Structure

`GetCheckoutBoletoPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueAt` | `LocalDateTime` | Required | Data de vencimento do boleto | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `Instructions` | `String` | Required | Instruções do boleto | String getInstructions() | setInstructions(String instructions) |

## Example (as JSON)

```json
{
  "due_at": "2016-03-13T12:52:32.123Z",
  "instructions": "instructions2"
}
```

