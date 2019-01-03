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
package com.amazonaws.services.appsync;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appsync.model.*;

/**
 * Interface for accessing AWSAppSync.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appsync.AbstractAWSAppSync} instead.
 * </p>
 * <p>
 * <p>
 * AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppSync {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appsync";

    /**
     * <p>
     * Creates a unique key that you can distribute to clients who are executing your API.
     * </p>
     * 
     * @param createApiKeyRequest
     * @return Result of the CreateApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiKeyLimitExceededException
     *         The API key exceeded a limit. Try your request again.
     * @throws ApiKeyValidityOutOfBoundsException
     *         The API key expiration must be set to a value between 1 and 365 days from creation (for
     *         <code>CreateApiKey</code>) or from update (for <code>UpdateApiKey</code>).
     * @sample AWSAppSync.CreateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    CreateApiKeyResult createApiKey(CreateApiKeyRequest createApiKeyRequest);

    /**
     * <p>
     * Creates a <code>DataSource</code> object.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates a <code>Function</code> object.
     * </p>
     * <p>
     * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Creates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param createGraphqlApiRequest
     * @return Result of the CreateGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiLimitExceededException
     *         The GraphQL API exceeded a limit. Try your request again.
     * @sample AWSAppSync.CreateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGraphqlApiResult createGraphqlApi(CreateGraphqlApiRequest createGraphqlApiRequest);

    /**
     * <p>
     * Creates a <code>Resolver</code> object.
     * </p>
     * <p>
     * A resolver converts incoming requests into a format that a data source can understand and converts the data
     * source's responses into GraphQL.
     * </p>
     * 
     * @param createResolverRequest
     * @return Result of the CreateResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    CreateResolverResult createResolver(CreateResolverRequest createResolverRequest);

    /**
     * <p>
     * Creates a <code>Type</code> object.
     * </p>
     * 
     * @param createTypeRequest
     * @return Result of the CreateType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.CreateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateType" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTypeResult createType(CreateTypeRequest createTypeRequest);

    /**
     * <p>
     * Deletes an API key.
     * </p>
     * 
     * @param deleteApiKeyRequest
     * @return Result of the DeleteApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest deleteApiKeyRequest);

    /**
     * <p>
     * Deletes a <code>DataSource</code> object.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a <code>Function</code>.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFunctionResult deleteFunction(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Deletes a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param deleteGraphqlApiRequest
     * @return Result of the DeleteGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGraphqlApiResult deleteGraphqlApi(DeleteGraphqlApiRequest deleteGraphqlApiRequest);

    /**
     * <p>
     * Deletes a <code>Resolver</code> object.
     * </p>
     * 
     * @param deleteResolverRequest
     * @return Result of the DeleteResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteResolver" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResolverResult deleteResolver(DeleteResolverRequest deleteResolverRequest);

    /**
     * <p>
     * Deletes a <code>Type</code> object.
     * </p>
     * 
     * @param deleteTypeRequest
     * @return Result of the DeleteType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.DeleteType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DeleteType" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTypeResult deleteType(DeleteTypeRequest deleteTypeRequest);

    /**
     * <p>
     * Retrieves a <code>DataSource</code> object.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Get a <code>Function</code>.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppSync.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Retrieves a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param getGraphqlApiRequest
     * @return Result of the GetGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    GetGraphqlApiResult getGraphqlApi(GetGraphqlApiRequest getGraphqlApiRequest);

    /**
     * <p>
     * Retrieves the introspection schema for a GraphQL API.
     * </p>
     * 
     * @param getIntrospectionSchemaRequest
     * @return Result of the GetIntrospectionSchema operation returned by the service.
     * @throws GraphQLSchemaException
     *         The GraphQL schema is not valid.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetIntrospectionSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetIntrospectionSchema" target="_top">AWS
     *      API Documentation</a>
     */
    GetIntrospectionSchemaResult getIntrospectionSchema(GetIntrospectionSchemaRequest getIntrospectionSchemaRequest);

    /**
     * <p>
     * Retrieves a <code>Resolver</code> object.
     * </p>
     * 
     * @param getResolverRequest
     * @return Result of the GetResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSAppSync.GetResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetResolver" target="_top">AWS API
     *      Documentation</a>
     */
    GetResolverResult getResolver(GetResolverRequest getResolverRequest);

    /**
     * <p>
     * Retrieves the current status of a schema creation operation.
     * </p>
     * 
     * @param getSchemaCreationStatusRequest
     * @return Result of the GetSchemaCreationStatus operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetSchemaCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSchemaCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetSchemaCreationStatusResult getSchemaCreationStatus(GetSchemaCreationStatusRequest getSchemaCreationStatusRequest);

    /**
     * <p>
     * Retrieves a <code>Type</code> object.
     * </p>
     * 
     * @param getTypeRequest
     * @return Result of the GetType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.GetType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetType" target="_top">AWS API
     *      Documentation</a>
     */
    GetTypeResult getType(GetTypeRequest getTypeRequest);

    /**
     * <p>
     * Lists the API keys for a given API.
     * </p>
     * <note>
     * <p>
     * API keys are deleted automatically sometime after they expire. However, they may still be included in the
     * response until they have actually been deleted. You can safely call <code>DeleteApiKey</code> to manually delete
     * a key before it's automatically deleted.
     * </p>
     * </note>
     * 
     * @param listApiKeysRequest
     * @return Result of the ListApiKeys operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListApiKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListApiKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListApiKeysResult listApiKeys(ListApiKeysRequest listApiKeysRequest);

    /**
     * <p>
     * Lists the data sources for a given API.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * List multiple functions.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest);

    /**
     * <p>
     * Lists your GraphQL APIs.
     * </p>
     * 
     * @param listGraphqlApisRequest
     * @return Result of the ListGraphqlApis operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListGraphqlApis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListGraphqlApis" target="_top">AWS API
     *      Documentation</a>
     */
    ListGraphqlApisResult listGraphqlApis(ListGraphqlApisRequest listGraphqlApisRequest);

    /**
     * <p>
     * Lists the resolvers for a given API and type.
     * </p>
     * 
     * @param listResolversRequest
     * @return Result of the ListResolvers operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListResolvers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolvers" target="_top">AWS API
     *      Documentation</a>
     */
    ListResolversResult listResolvers(ListResolversRequest listResolversRequest);

    /**
     * <p>
     * List the resolvers that are associated with a specific function.
     * </p>
     * 
     * @param listResolversByFunctionRequest
     * @return Result of the ListResolversByFunction operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListResolversByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListResolversByFunction"
     *      target="_top">AWS API Documentation</a>
     */
    ListResolversByFunctionResult listResolversByFunction(ListResolversByFunctionRequest listResolversByFunctionRequest);

    /**
     * <p>
     * Lists the types for a given API.
     * </p>
     * 
     * @param listTypesRequest
     * @return Result of the ListTypes operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.ListTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListTypes" target="_top">AWS API
     *      Documentation</a>
     */
    ListTypesResult listTypes(ListTypesRequest listTypesRequest);

    /**
     * <p>
     * Adds a new schema to your GraphQL API.
     * </p>
     * <p>
     * This operation is asynchronous. Use to determine when it has completed.
     * </p>
     * 
     * @param startSchemaCreationRequest
     * @return Result of the StartSchemaCreation operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.StartSchemaCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/StartSchemaCreation" target="_top">AWS
     *      API Documentation</a>
     */
    StartSchemaCreationResult startSchemaCreation(StartSchemaCreationRequest startSchemaCreationRequest);

    /**
     * <p>
     * Updates an API key.
     * </p>
     * 
     * @param updateApiKeyRequest
     * @return Result of the UpdateApiKey operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @throws ApiKeyValidityOutOfBoundsException
     *         The API key expiration must be set to a value between 1 and 365 days from creation (for
     *         <code>CreateApiKey</code>) or from update (for <code>UpdateApiKey</code>).
     * @sample AWSAppSync.UpdateApiKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateApiKey" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest updateApiKeyRequest);

    /**
     * <p>
     * Updates a <code>DataSource</code> object.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates a <code>Function</code> object.
     * </p>
     * 
     * @param updateFunctionRequest
     * @return Result of the UpdateFunction operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFunctionResult updateFunction(UpdateFunctionRequest updateFunctionRequest);

    /**
     * <p>
     * Updates a <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param updateGraphqlApiRequest
     * @return Result of the UpdateGraphqlApi operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateGraphqlApi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGraphqlApiResult updateGraphqlApi(UpdateGraphqlApiRequest updateGraphqlApiRequest);

    /**
     * <p>
     * Updates a <code>Resolver</code> object.
     * </p>
     * 
     * @param updateResolverRequest
     * @return Result of the UpdateResolver operation returned by the service.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateResolver
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateResolver" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateResolverResult updateResolver(UpdateResolverRequest updateResolverRequest);

    /**
     * <p>
     * Updates a <code>Type</code> object.
     * </p>
     * 
     * @param updateTypeRequest
     * @return Result of the UpdateType operation returned by the service.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and then try again.
     * @throws ConcurrentModificationException
     *         Another modification is in progress at this time and it must complete before you can make your change.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource, and then try again.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws InternalFailureException
     *         An internal AWS AppSync error occurred. Try your request again.
     * @sample AWSAppSync.UpdateType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateType" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTypeResult updateType(UpdateTypeRequest updateTypeRequest);

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
