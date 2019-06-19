/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mq.model.*;

/**
 * Interface for accessing AmazonMQ.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mq.AbstractAmazonMQ} instead.
 * </p>
 * <p>
 * Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message
 * brokers in the cloud. A message broker allows software applications and components to communicate using various
 * programming languages, operating systems, and formal messaging protocols.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMQ {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mq";

    /**
     * Creates a broker. Note: This API is asynchronous.
     * 
     * @param createBrokerRequest
     *        Creates a broker using the specified properties.
     * @return Result of the CreateBroker operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws UnauthorizedException
     *         HTTP Status Code 401: Unauthorized request. The provided credentials couldn't be validated.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. This broker name already exists. Retry your request with another name.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBrokerResult createBroker(CreateBrokerRequest createBrokerRequest);

    /**
     * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the
     * engine type and version).
     * 
     * @param createConfigurationRequest
     *        Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration
     *        (the engine type and version).
     * @return Result of the CreateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. This configuration name already exists. Retry your request with another
     *         configuration name.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your input and then retry your request.
     * @sample AmazonMQ.CreateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConfigurationResult createConfiguration(CreateConfigurationRequest createConfigurationRequest);

    /**
     * Add a tag to a resource.
     * 
     * @param createTagsRequest
     *        A map of the key-value pairs for the resource tag.
     * @return Result of the CreateTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTagsResult createTags(CreateTagsRequest createTagsRequest);

    /**
     * Creates an ActiveMQ user.
     * 
     * @param createUserRequest
     *        Creates a new ActiveMQ user.
     * @return Result of the CreateUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * Deletes a broker. Note: This API is asynchronous.
     * 
     * @param deleteBrokerRequest
     * @return Result of the DeleteBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteBroker" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBrokerResult deleteBroker(DeleteBrokerRequest deleteBrokerRequest);

    /**
     * Removes a tag from a resource.
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * Deletes an ActiveMQ user.
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * Returns information about the specified broker.
     * 
     * @param describeBrokerRequest
     * @return Result of the DescribeBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBrokerResult describeBroker(DescribeBrokerRequest describeBrokerRequest);

    /**
     * Describe available engine types and versions.
     * 
     * @param describeBrokerEngineTypesRequest
     * @return Result of the DescribeBrokerEngineTypes operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBrokerEngineTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerEngineTypes" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeBrokerEngineTypesResult describeBrokerEngineTypes(DescribeBrokerEngineTypesRequest describeBrokerEngineTypesRequest);

    /**
     * Describe available broker instance options.
     * 
     * @param describeBrokerInstanceOptionsRequest
     * @return Result of the DescribeBrokerInstanceOptions operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeBrokerInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBrokerInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBrokerInstanceOptionsResult describeBrokerInstanceOptions(DescribeBrokerInstanceOptionsRequest describeBrokerInstanceOptionsRequest);

    /**
     * Returns information about the specified configuration.
     * 
     * @param describeConfigurationRequest
     * @return Result of the DescribeConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeConfigurationResult describeConfiguration(DescribeConfigurationRequest describeConfigurationRequest);

    /**
     * Returns the specified configuration revision for the specified configuration.
     * 
     * @param describeConfigurationRevisionRequest
     * @return Result of the DescribeConfigurationRevision operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeConfigurationRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfigurationRevision"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationRevisionResult describeConfigurationRevision(DescribeConfigurationRevisionRequest describeConfigurationRevisionRequest);

    /**
     * Returns information about an ActiveMQ user.
     * 
     * @param describeUserRequest
     * @return Result of the DescribeUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.DescribeUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeUser" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeUserResult describeUser(DescribeUserRequest describeUserRequest);

    /**
     * Returns a list of all brokers.
     * 
     * @param listBrokersRequest
     * @return Result of the ListBrokers operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListBrokers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListBrokers" target="_top">AWS API
     *      Documentation</a>
     */
    ListBrokersResult listBrokers(ListBrokersRequest listBrokersRequest);

    /**
     * Returns a list of all revisions for the specified configuration.
     * 
     * @param listConfigurationRevisionsRequest
     * @return Result of the ListConfigurationRevisions operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListConfigurationRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS
     *      API Documentation</a>
     */
    ListConfigurationRevisionsResult listConfigurationRevisions(ListConfigurationRevisionsRequest listConfigurationRevisionsRequest);

    /**
     * Returns a list of all configurations.
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurations" target="_top">AWS API
     *      Documentation</a>
     */
    ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest);

    /**
     * Lists tags for a resource.
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * Returns a list of all ActiveMQ users.
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * Reboots a broker. Note: This API is asynchronous.
     * 
     * @param rebootBrokerRequest
     * @return Result of the RebootBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.RebootBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/RebootBroker" target="_top">AWS API
     *      Documentation</a>
     */
    RebootBrokerResult rebootBroker(RebootBrokerRequest rebootBrokerRequest);

    /**
     * Adds a pending configuration change to a broker.
     * 
     * @param updateBrokerRequest
     *        Updates the broker using the specified properties.
     * @return Result of the UpdateBroker operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Concurrent broker update detected. Retrying your request might resolve
     *         the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.UpdateBroker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateBroker" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBrokerResult updateBroker(UpdateBrokerRequest updateBrokerRequest);

    /**
     * Updates the specified configuration.
     * 
     * @param updateConfigurationRequest
     *        Updates the specified configuration.
     * @return Result of the UpdateConfiguration operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Concurrent update to configuration. Retry to create a new revision.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your input and then retry your request.
     * @sample AmazonMQ.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateConfigurationResult updateConfiguration(UpdateConfigurationRequest updateConfigurationRequest);

    /**
     * Updates the information for an ActiveMQ user.
     * 
     * @param updateUserRequest
     *        Updates the information for an ActiveMQ user.
     * @return Result of the UpdateUser operation returned by the service.
     * @throws NotFoundException
     *         HTTP Status Code 404: Resource not found due to incorrect input. Correct your request and then retry it.
     * @throws BadRequestException
     *         HTTP Status Code 400: Bad request due to incorrect input. Correct your request and then retry it.
     * @throws InternalServerErrorException
     *         HTTP Status Code 500: Unexpected internal server error. Retrying your request might resolve the issue.
     * @throws ConflictException
     *         HTTP Status Code 409: Conflict. Retrying your request might resolve the issue.
     * @throws ForbiddenException
     *         HTTP Status Code 403: Access forbidden. Correct your credentials and then retry your request.
     * @sample AmazonMQ.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

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
