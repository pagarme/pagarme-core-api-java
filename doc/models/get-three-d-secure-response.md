
# Get Three D Secure Response

3D-S payment authentication response

## Structure

`GetThreeDSecureResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mpi` | `String` | Required | MPI Vendor | String getMpi() | setMpi(String mpi) |
| `Eci` | `String` | Required | Electronic Commerce Indicator (ECI) (Opcional) | String getEci() | setEci(String eci) |
| `Cavv` | `String` | Required | Online payment cryptogram, definido pelo 3-D Secure. | String getCavv() | setCavv(String cavv) |
| `TransactionId` | `String` | Required | Identificador da transação (XID) | String getTransactionId() | setTransactionId(String transactionId) |
| `SuccessUrl` | `String` | Required | Url de redirecionamento de sucessso | String getSuccessUrl() | setSuccessUrl(String successUrl) |

## Example (as JSON)

```json
{
  "mpi": "mpi2",
  "eci": "eci0",
  "cavv": "cavv4",
  "transaction_Id": "transaction_Id4",
  "success_url": "success_url2"
}
```

