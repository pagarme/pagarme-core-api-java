
# Get Billing Address Response

Response object for getting a billing address

## Structure

`GetBillingAddressResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Required | - | String getStreet() | setStreet(String street) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `ZipCode` | `String` | Required | - | String getZipCode() | setZipCode(String zipCode) |
| `Neighborhood` | `String` | Required | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Country` | `String` | Required | - | String getCountry() | setCountry(String country) |
| `Complement` | `String` | Required | - | String getComplement() | setComplement(String complement) |
| `Line1` | `String` | Required | Line 1 for address | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Required | Line 2 for address | String getLine2() | setLine2(String line2) |

## Example (as JSON)

```json
{
  "street": "street0",
  "number": "number2",
  "zip_code": "zip_code4",
  "neighborhood": "neighborhood6",
  "city": "city0",
  "state": "state4",
  "country": "country4",
  "complement": "complement4",
  "line_1": "line_16",
  "line_2": "line_28"
}
```

