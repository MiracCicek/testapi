# Test

```java
TestController testController = client.getTestController();
```

## Class Name

`TestController`


# Create Dummy Structure With Documents

```java
CompletableFuture<Void> createDummyStructureWithDocumentsAsync(
    final int count,
    final String pid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `count` | `int` | Query, Required | - |
| `pid` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
int count = 1;
String pid = "pid8";

testController.createDummyStructureWithDocumentsAsync(count, pid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

