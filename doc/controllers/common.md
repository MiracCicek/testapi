# Common

```java
CommonController commonController = client.getCommonController();
```

## Class Name

`CommonController`


# Getuserpid

Gets user physicalid from username

```java
CompletableFuture<String> getuserpidAsync(
    final String u)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `u` | `String` | Query, Required | - |

## Server

`Server.BACKEND`

## Response Type

`String`

## Example Usage

```java
String u = "{{username}}";

commonController.getuserpidAsync(u).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"5D10960500001CFC635196510000011A"
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | `ApiException` |

