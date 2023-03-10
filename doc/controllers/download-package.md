# Download Package

```java
DownloadPackageController downloadPackageController = client.getDownloadPackageController();
```

## Class Name

`DownloadPackageController`

## Methods

* [Downloadpackage Structured](../../doc/controllers/download-package.md#downloadpackage-structured)
* [Downloadpackage Flat](../../doc/controllers/download-package.md#downloadpackage-flat)
* [Gettabledata](../../doc/controllers/download-package.md#gettabledata)
* [Csvreport](../../doc/controllers/download-package.md#csvreport)


# Downloadpackage Structured

```java
CompletableFuture<Void> downloadpackageStructuredAsync(
    final String filter,
    final String u,
    final String docType,
    final String pid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `filter` | `String` | Query, Required | - |
| `u` | `String` | Query, Required | - |
| `docType` | `String` | Query, Required | - |
| `pid` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String filter = "none";
String u = "{{upid}}";
String docType = "all";
String pid = "pid8";

downloadPackageController.downloadpackageStructuredAsync(filter, u, docType, pid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Downloadpackage Flat

```java
CompletableFuture<Void> downloadpackageFlatAsync(
    final String filter,
    final String u,
    final String docType,
    final String pid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `filter` | `String` | Query, Required | - |
| `u` | `String` | Query, Required | - |
| `docType` | `String` | Query, Required | - |
| `pid` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String filter = "none";
String u = "{{upid}}";
String docType = "all";
String pid = "pid8";

downloadPackageController.downloadpackageFlatAsync(filter, u, docType, pid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Gettabledata

```java
CompletableFuture<Void> gettabledataAsync(
    final String u)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `u` | `String` | Query, Required | - |

## Response Type

`void`

## Example Usage

```java
String u = "5D10960500001CFC635196510000011A";

downloadPackageController.gettabledataAsync(u).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Csvreport

```java
CompletableFuture<Void> csvreportAsync(
    final String u,
    final String docType,
    final String pid)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `u` | `String` | Query, Required | - |
| `docType` | `String` | Query, Required | - |
| `pid` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String u = "{{upid}}";
String docType = "all";
String pid = "pid8";

downloadPackageController.csvreportAsync(u, docType, pid).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

