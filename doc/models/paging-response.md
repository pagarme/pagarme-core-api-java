
# Paging Response

Object used for returning lists of objects with pagination

## Structure

`PagingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Total` | `int` | Required | Total number of pages | int getTotal() | setTotal(int total) |
| `Previous` | `String` | Required | Previous page | String getPrevious() | setPrevious(String previous) |
| `Next` | `String` | Required | Next page | String getNext() | setNext(String next) |

## Example (as JSON)

```json
{
  "total": 10,
  "previous": "previous8",
  "next": "next2"
}
```

