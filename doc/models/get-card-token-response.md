
# Get Card Token Response

Card token data

## Structure

`GetCardTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastFourDigits` | `String` | Required | - | String getLastFourDigits() | setLastFourDigits(String lastFourDigits) |
| `HolderName` | `String` | Required | - | String getHolderName() | setHolderName(String holderName) |
| `HolderDocument` | `String` | Required | - | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `ExpMonth` | `String` | Required | - | String getExpMonth() | setExpMonth(String expMonth) |
| `ExpYear` | `String` | Required | - | String getExpYear() | setExpYear(String expYear) |
| `Brand` | `String` | Required | - | String getBrand() | setBrand(String brand) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |

## Example (as JSON)

```json
{
  "last_four_digits": "last_four_digits6",
  "holder_name": "holder_name4",
  "holder_document": "holder_document6",
  "exp_month": "exp_month6",
  "exp_year": "exp_year6",
  "brand": "brand4",
  "type": "type0",
  "label": "label0"
}
```

