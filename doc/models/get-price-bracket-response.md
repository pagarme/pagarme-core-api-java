
# Get Price Bracket Response

Response object for getting a price bracket

## Structure

`GetPriceBracketResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartQuantity` | `int` | Required | - | int getStartQuantity() | setStartQuantity(int startQuantity) |
| `Price` | `int` | Required | - | int getPrice() | setPrice(int price) |
| `EndQuantity` | `Integer` | Optional | - | Integer getEndQuantity() | setEndQuantity(Integer endQuantity) |
| `OveragePrice` | `Integer` | Optional | - | Integer getOveragePrice() | setOveragePrice(Integer overagePrice) |

## Example (as JSON)

```json
{
  "start_quantity": 46,
  "price": 16,
  "end_quantity": null,
  "overage_price": null
}
```

