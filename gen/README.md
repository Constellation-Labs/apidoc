# openapi-java-client

Node Public API
- API version: 1.0.0
  - Build date: 2022-09-14T20:15:22.967531+02:00[Europe/Warsaw]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClusterApi* | [**clusterInfoGet**](docs/ClusterApi.md#clusterInfoGet) | **GET** /cluster/info | Get current cluster observation
*MetadataApi* | [**addressAddressGet**](docs/MetadataApi.md#addressAddressGet) | **GET** /address/{address} | Get wallet balance for given address
*MetricsApi* | [**metricsGet**](docs/MetricsApi.md#metricsGet) | **GET** /metrics | Get node&#39;s metrics
*MetricsApi* | [**micrometerMetricsGet**](docs/MetricsApi.md#micrometerMetricsGet) | **GET** /micrometer-metrics | Get node&#39;s micrometer metrics
*TransactionApi* | [**transactionHashGet**](docs/TransactionApi.md#transactionHashGet) | **GET** /transaction/{hash} | Get transaction from node
*TransactionApi* | [**transactionLastRefAddressGet**](docs/TransactionApi.md#transactionLastRefAddressGet) | **GET** /transaction/last-ref/{address} | Get last reference of a given address
*TransactionApi* | [**transactionPost**](docs/TransactionApi.md#transactionPost) | **POST** /transaction | Send transaction to network


## Documentation for Models

 - [Balance](docs/Balance.md)
 - [Id](docs/Id.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [NodeState](docs/NodeState.md)
 - [NodeStateIp](docs/NodeStateIp.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

operators@constellationnetwork.io
