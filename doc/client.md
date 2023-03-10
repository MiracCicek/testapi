
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
EnoviaRestAPIClient client = new EnoviaRestAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.PRODUCTION)
    .build();
```

## Enovia Rest APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getCommonController()` | Provides access to Common controller. | `CommonController` |
| `getDownloadPackageController()` | Provides access to DownloadPackage controller. | `DownloadPackageController` |
| `getTestController()` | Provides access to Test controller. | `TestController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

