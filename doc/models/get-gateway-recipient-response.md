
# Get Gateway Recipient Response

Information about the recipient on the gateway

## Structure

`GetGatewayRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Gateway` | `String` | Required | Gateway name | String getGateway() | setGateway(String gateway) |
| `Status` | `String` | Required | Status of the recipient on the gateway | String getStatus() | setStatus(String status) |
| `Pgid` | `String` | Required | Recipient id on the gateway | String getPgid() | setPgid(String pgid) |
| `CreatedAt` | `String` | Required | Creation date | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Required | Last update date | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "gateway": "gateway0",
  "status": "status8",
  "pgid": "pgid4",
  "created_at": "created_at2",
  "updated_at": "updated_at4"
}
```

