/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.schemas.model.*;
import com.amazonaws.services.schemas.waiters.AWSSchemasWaiters;

/**
 * Interface for accessing Schemas.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.schemas.AbstractAWSSchemas} instead.
 * </p>
 * <p>
 * <p>
 * AWS EventBridge Schemas
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSchemas {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "schemas";

    /**
     * <p>
     * Creates a discoverer.
     * </p>
     * 
     * @param createDiscovererRequest
     * @return Result of the CreateDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws UnauthorizedException
     * @throws ForbiddenException
     * @throws ServiceUnavailableException
     * @throws ConflictException
     * @sample AWSSchemas.CreateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDiscovererResult createDiscoverer(CreateDiscovererRequest createDiscovererRequest);

    /**
     * <p>
     * Creates a registry.
     * </p>
     * 
     * @param createRegistryRequest
     * @return Result of the CreateRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws UnauthorizedException
     * @throws ForbiddenException
     * @throws ServiceUnavailableException
     * @throws ConflictException
     * @sample AWSSchemas.CreateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRegistryResult createRegistry(CreateRegistryRequest createRegistryRequest);

    /**
     * <p>
     * Creates a schema definition.
     * </p>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Deletes a discoverer.
     * </p>
     * 
     * @param deleteDiscovererRequest
     * @return Result of the DeleteDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDiscovererResult deleteDiscoverer(DeleteDiscovererRequest deleteDiscovererRequest);

    /**
     * <p>
     * Deletes a Registry.
     * </p>
     * 
     * @param deleteRegistryRequest
     * @return Result of the DeleteRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRegistryResult deleteRegistry(DeleteRegistryRequest deleteRegistryRequest);

    /**
     * <p>
     * Delete a schema definition.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSchemaResult deleteSchema(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Delete the schema version definition
     * </p>
     * 
     * @param deleteSchemaVersionRequest
     * @return Result of the DeleteSchemaVersion operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DeleteSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DeleteSchemaVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSchemaVersionResult deleteSchemaVersion(DeleteSchemaVersionRequest deleteSchemaVersionRequest);

    /**
     * <p>
     * Describe the code binding URI.
     * </p>
     * 
     * @param describeCodeBindingRequest
     * @return Result of the DescribeCodeBinding operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.DescribeCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeCodeBinding" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCodeBindingResult describeCodeBinding(DescribeCodeBindingRequest describeCodeBindingRequest);

    /**
     * <p>
     * Describes the discoverer.
     * </p>
     * 
     * @param describeDiscovererRequest
     * @return Result of the DescribeDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDiscovererResult describeDiscoverer(DescribeDiscovererRequest describeDiscovererRequest);

    /**
     * <p>
     * Describes the registry.
     * </p>
     * 
     * @param describeRegistryRequest
     * @return Result of the DescribeRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRegistryResult describeRegistry(DescribeRegistryRequest describeRegistryRequest);

    /**
     * <p>
     * Retrieve the schema definition.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return Result of the DescribeSchema operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest);

    /**
     * <p>
     * Get the code binding source URI.
     * </p>
     * 
     * @param getCodeBindingSourceRequest
     * @return Result of the GetCodeBindingSource operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.GetCodeBindingSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetCodeBindingSource" target="_top">AWS
     *      API Documentation</a>
     */
    GetCodeBindingSourceResult getCodeBindingSource(GetCodeBindingSourceRequest getCodeBindingSourceRequest);

    /**
     * <p>
     * Get the discovered schema that was generated based on sampled events.
     * </p>
     * 
     * @param getDiscoveredSchemaRequest
     * @return Result of the GetDiscoveredSchema operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.GetDiscoveredSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/GetDiscoveredSchema" target="_top">AWS
     *      API Documentation</a>
     */
    GetDiscoveredSchemaResult getDiscoveredSchema(GetDiscoveredSchemaRequest getDiscoveredSchemaRequest);

    /**
     * <p>
     * List the discoverers.
     * </p>
     * 
     * @param listDiscoverersRequest
     * @return Result of the ListDiscoverers operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListDiscoverers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListDiscoverers" target="_top">AWS API
     *      Documentation</a>
     */
    ListDiscoverersResult listDiscoverers(ListDiscoverersRequest listDiscoverersRequest);

    /**
     * <p>
     * List the registries.
     * </p>
     * 
     * @param listRegistriesRequest
     * @return Result of the ListRegistries operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListRegistries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListRegistries" target="_top">AWS API
     *      Documentation</a>
     */
    ListRegistriesResult listRegistries(ListRegistriesRequest listRegistriesRequest);

    /**
     * <p>
     * Provides a list of the schema versions and related information.
     * </p>
     * 
     * @param listSchemaVersionsRequest
     * @return Result of the ListSchemaVersions operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.ListSchemaVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemaVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemaVersionsResult listSchemaVersions(ListSchemaVersionsRequest listSchemaVersionsRequest);

    /**
     * <p>
     * List the schemas.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Get tags for resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * @param lockServiceLinkedRoleRequest
     * @return Result of the LockServiceLinkedRole operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.LockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/LockServiceLinkedRole" target="_top">AWS
     *      API Documentation</a>
     */
    LockServiceLinkedRoleResult lockServiceLinkedRole(LockServiceLinkedRoleRequest lockServiceLinkedRoleRequest);

    /**
     * <p>
     * Put code binding URI
     * </p>
     * 
     * @param putCodeBindingRequest
     * @return Result of the PutCodeBinding operation returned by the service.
     * @throws GoneException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws TooManyRequestsException
     * @sample AWSSchemas.PutCodeBinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/PutCodeBinding" target="_top">AWS API
     *      Documentation</a>
     */
    PutCodeBindingResult putCodeBinding(PutCodeBindingRequest putCodeBindingRequest);

    /**
     * <p>
     * Search the schemas
     * </p>
     * 
     * @param searchSchemasRequest
     * @return Result of the SearchSchemas operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.SearchSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/SearchSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    SearchSchemasResult searchSchemas(SearchSchemasRequest searchSchemasRequest);

    /**
     * <p>
     * Starts the discoverer
     * </p>
     * 
     * @param startDiscovererRequest
     * @return Result of the StartDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.StartDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StartDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    StartDiscovererResult startDiscoverer(StartDiscovererRequest startDiscovererRequest);

    /**
     * <p>
     * Stops the discoverer
     * </p>
     * 
     * @param stopDiscovererRequest
     * @return Result of the StopDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.StopDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/StopDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    StopDiscovererResult stopDiscoverer(StopDiscovererRequest stopDiscovererRequest);

    /**
     * <p>
     * Add tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * @param unlockServiceLinkedRoleRequest
     * @return Result of the UnlockServiceLinkedRole operation returned by the service.
     * @throws ServiceUnavailableException
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.UnlockServiceLinkedRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UnlockServiceLinkedRole"
     *      target="_top">AWS API Documentation</a>
     */
    UnlockServiceLinkedRoleResult unlockServiceLinkedRole(UnlockServiceLinkedRoleRequest unlockServiceLinkedRoleRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @sample AWSSchemas.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the discoverer
     * </p>
     * 
     * @param updateDiscovererRequest
     * @return Result of the UpdateDiscoverer operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateDiscoverer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateDiscoverer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDiscovererResult updateDiscoverer(UpdateDiscovererRequest updateDiscovererRequest);

    /**
     * <p>
     * Updates a registry.
     * </p>
     * 
     * @param updateRegistryRequest
     * @return Result of the UpdateRegistry operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateRegistry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateRegistry" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRegistryResult updateRegistry(UpdateRegistryRequest updateRegistryRequest);

    /**
     * <p>
     * Updates the schema definition
     * </p>
     * 
     * @param updateSchemaRequest
     * @return Result of the UpdateSchema operation returned by the service.
     * @throws BadRequestException
     * @throws InternalServerErrorException
     * @throws ForbiddenException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @sample AWSSchemas.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSchemaResult updateSchema(UpdateSchemaRequest updateSchemaRequest);

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

    AWSSchemasWaiters waiters();

}
