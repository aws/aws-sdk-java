/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kafkaconnect;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kafkaconnect.model.*;

/**
 * Interface for accessing Kafka Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kafkaconnect.AbstractAWSKafkaConnect} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSKafkaConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kafkaconnect";

    /**
     * <p>
     * Creates a connector using the specified properties.
     * </p>
     * 
     * @param createConnectorRequest
     * @return Result of the CreateConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConnectorResult createConnector(CreateConnectorRequest createConnectorRequest);

    /**
     * <p>
     * Creates a custom plugin using the specified properties.
     * </p>
     * 
     * @param createCustomPluginRequest
     * @return Result of the CreateCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomPluginResult createCustomPlugin(CreateCustomPluginRequest createCustomPluginRequest);

    /**
     * <p>
     * Creates a worker configuration using the specified properties.
     * </p>
     * 
     * @param createWorkerConfigurationRequest
     * @return Result of the CreateWorkerConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. A resource with this name already exists. Retry your request with another
     *         name.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.CreateWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkerConfigurationResult createWorkerConfiguration(CreateWorkerConfigurationRequest createWorkerConfigurationRequest);

    /**
     * <p>
     * Deletes the specified connector.
     * </p>
     * 
     * @param deleteConnectorRequest
     * @return Result of the DeleteConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DeleteConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteConnector" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConnectorResult deleteConnector(DeleteConnectorRequest deleteConnectorRequest);

    /**
     * <p>
     * Deletes a custom plugin.
     * </p>
     * 
     * @param deleteCustomPluginRequest
     * @return Result of the DeleteCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DeleteCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomPluginResult deleteCustomPlugin(DeleteCustomPluginRequest deleteCustomPluginRequest);

    /**
     * <p>
     * Returns summary information about the connector.
     * </p>
     * 
     * @param describeConnectorRequest
     * @return Result of the DescribeConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeConnector" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeConnectorResult describeConnector(DescribeConnectorRequest describeConnectorRequest);

    /**
     * <p>
     * A summary description of the custom plugin.
     * </p>
     * 
     * @param describeCustomPluginRequest
     * @return Result of the DescribeCustomPlugin operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeCustomPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeCustomPlugin"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomPluginResult describeCustomPlugin(DescribeCustomPluginRequest describeCustomPluginRequest);

    /**
     * <p>
     * Returns information about a worker configuration.
     * </p>
     * 
     * @param describeWorkerConfigurationRequest
     * @return Result of the DescribeWorkerConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.DescribeWorkerConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DescribeWorkerConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeWorkerConfigurationResult describeWorkerConfiguration(DescribeWorkerConfigurationRequest describeWorkerConfigurationRequest);

    /**
     * <p>
     * Returns a list of all the connectors in this account and Region. The list is limited to connectors whose name
     * starts with the specified prefix. The response also includes a description of each of the listed connectors.
     * </p>
     * 
     * @param listConnectorsRequest
     * @return Result of the ListConnectors operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListConnectors" target="_top">AWS
     *      API Documentation</a>
     */
    ListConnectorsResult listConnectors(ListConnectorsRequest listConnectorsRequest);

    /**
     * <p>
     * Returns a list of all of the custom plugins in this account and Region.
     * </p>
     * 
     * @param listCustomPluginsRequest
     * @return Result of the ListCustomPlugins operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListCustomPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListCustomPlugins" target="_top">AWS
     *      API Documentation</a>
     */
    ListCustomPluginsResult listCustomPlugins(ListCustomPluginsRequest listCustomPluginsRequest);

    /**
     * <p>
     * Returns a list of all of the worker configurations in this account and Region.
     * </p>
     * 
     * @param listWorkerConfigurationsRequest
     * @return Result of the ListWorkerConfigurations operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.ListWorkerConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ListWorkerConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkerConfigurationsResult listWorkerConfigurations(ListWorkerConfigurationsRequest listWorkerConfigurationsRequest);

    /**
     * <p>
     * Updates the specified connector.
     * </p>
     * 
     * @param updateConnectorRequest
     * @return Result of the UpdateConnector operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @throws ServiceUnavailableException
     *         HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
     * @throws TooManyRequestsException
     *         HTTP Status Code 429: Limit exceeded. Resource limit reached.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @sample AWSKafkaConnect.UpdateConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/UpdateConnector" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateConnectorResult updateConnector(UpdateConnectorRequest updateConnectorRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
