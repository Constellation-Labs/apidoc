# ClusterApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterInfoGet**](ClusterApi.md#clusterInfoGet) | **GET** /cluster/info | Get current cluster observation


<a name="clusterInfoGet"></a>
# **clusterInfoGet**
> List&lt;NodeState&gt; clusterInfoGet()

Get current cluster observation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClusterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ClusterApi apiInstance = new ClusterApi(defaultClient);
    try {
      List<NodeState> result = apiInstance.clusterInfoGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClusterApi#clusterInfoGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NodeState&gt;**](NodeState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cluster observation |  -  |

