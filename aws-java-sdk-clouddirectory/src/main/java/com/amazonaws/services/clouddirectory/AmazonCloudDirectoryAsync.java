/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;

/**
 * Interface for accessing Amazon CloudDirectory asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.clouddirectory.AbstractAmazonCloudDirectoryAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Cloud Directory</fullname>
 * <p>
 * Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of
 * cloud-scale web, mobile, and IoT applications. This guide describes the Cloud Directory operations that you can call
 * programmatically and includes detailed information on data types and errors. For information about AWS Directory
 * Services features, see <a href="https://aws.amazon.com/directoryservice/">AWS Directory Service</a> and the <a
 * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html">AWS Directory Service
 * Administration Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudDirectoryAsync extends AmazonCloudDirectory {

    /**
     * <p>
     * Adds a new <a>Facet</a> to an object.
     * </p>
     * 
     * @param addFacetToObjectRequest
     * @return A Java Future containing the result of the AddFacetToObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.AddFacetToObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AddFacetToObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFacetToObjectResult> addFacetToObjectAsync(AddFacetToObjectRequest addFacetToObjectRequest);

    /**
     * <p>
     * Adds a new <a>Facet</a> to an object.
     * </p>
     * 
     * @param addFacetToObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddFacetToObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.AddFacetToObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AddFacetToObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFacetToObjectResult> addFacetToObjectAsync(AddFacetToObjectRequest addFacetToObjectRequest,
            com.amazonaws.handlers.AsyncHandler<AddFacetToObjectRequest, AddFacetToObjectResult> asyncHandler);

    /**
     * <p>
     * Copies the input published schema, at the specified version, into the <a>Directory</a> with the same name and
     * version as that of the published schema.
     * </p>
     * 
     * @param applySchemaRequest
     * @return A Java Future containing the result of the ApplySchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ApplySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ApplySchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(ApplySchemaRequest applySchemaRequest);

    /**
     * <p>
     * Copies the input published schema, at the specified version, into the <a>Directory</a> with the same name and
     * version as that of the published schema.
     * </p>
     * 
     * @param applySchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplySchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ApplySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ApplySchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ApplySchemaResult> applySchemaAsync(ApplySchemaRequest applySchemaRequest,
            com.amazonaws.handlers.AsyncHandler<ApplySchemaRequest, ApplySchemaResult> asyncHandler);

    /**
     * <p>
     * Attaches an existing object to another object. An object can be accessed in two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Using the path
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>ObjectIdentifier</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param attachObjectRequest
     * @return A Java Future containing the result of the AttachObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.AttachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(AttachObjectRequest attachObjectRequest);

    /**
     * <p>
     * Attaches an existing object to another object. An object can be accessed in two ways:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Using the path
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>ObjectIdentifier</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param attachObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.AttachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachObjectResult> attachObjectAsync(AttachObjectRequest attachObjectRequest,
            com.amazonaws.handlers.AsyncHandler<AttachObjectRequest, AttachObjectResult> asyncHandler);

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler);

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndexRequest
     * @return A Java Future containing the result of the AttachToIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.AttachToIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachToIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(AttachToIndexRequest attachToIndexRequest);

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachToIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.AttachToIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachToIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachToIndexResult> attachToIndexAsync(AttachToIndexRequest attachToIndexRequest,
            com.amazonaws.handlers.AsyncHandler<AttachToIndexRequest, AttachToIndexResult> asyncHandler);

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param attachTypedLinkRequest
     * @return A Java Future containing the result of the AttachTypedLink operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.AttachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachTypedLinkResult> attachTypedLinkAsync(AttachTypedLinkRequest attachTypedLinkRequest);

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param attachTypedLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachTypedLink operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.AttachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AttachTypedLinkResult> attachTypedLinkAsync(AttachTypedLinkRequest attachTypedLinkRequest,
            com.amazonaws.handlers.AsyncHandler<AttachTypedLinkRequest, AttachTypedLinkResult> asyncHandler);

    /**
     * <p>
     * Performs all the read operations in a batch.
     * </p>
     * 
     * @param batchReadRequest
     * @return A Java Future containing the result of the BatchRead operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.BatchRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchRead" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchReadResult> batchReadAsync(BatchReadRequest batchReadRequest);

    /**
     * <p>
     * Performs all the read operations in a batch.
     * </p>
     * 
     * @param batchReadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchRead operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.BatchRead
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchRead" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchReadResult> batchReadAsync(BatchReadRequest batchReadRequest,
            com.amazonaws.handlers.AsyncHandler<BatchReadRequest, BatchReadResult> asyncHandler);

    /**
     * <p>
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     * </p>
     * 
     * @param batchWriteRequest
     * @return A Java Future containing the result of the BatchWrite operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.BatchWrite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchWrite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(BatchWriteRequest batchWriteRequest);

    /**
     * <p>
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     * </p>
     * 
     * @param batchWriteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchWrite operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.BatchWrite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchWrite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchWriteResult> batchWriteAsync(BatchWriteRequest batchWriteRequest,
            com.amazonaws.handlers.AsyncHandler<BatchWriteRequest, BatchWriteResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>Directory</a> by copying the published schema into the directory. A directory cannot be created
     * without a schema.
     * </p>
     * 
     * @param createDirectoryRequest
     * @return A Java Future containing the result of the CreateDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest);

    /**
     * <p>
     * Creates a <a>Directory</a> by copying the published schema into the directory. A directory cannot be created
     * without a schema.
     * </p>
     * 
     * @param createDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDirectoryResult> createDirectoryAsync(CreateDirectoryRequest createDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler);

    /**
     * <p>
     * Creates a new <a>Facet</a> in a schema. Facet creation is allowed only in development or applied schemas.
     * </p>
     * 
     * @param createFacetRequest
     * @return A Java Future containing the result of the CreateFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFacetResult> createFacetAsync(CreateFacetRequest createFacetRequest);

    /**
     * <p>
     * Creates a new <a>Facet</a> in a schema. Facet creation is allowed only in development or applied schemas.
     * </p>
     * 
     * @param createFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFacetResult> createFacetAsync(CreateFacetRequest createFacetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFacetRequest, CreateFacetResult> asyncHandler);

    /**
     * <p>
     * Creates an index object. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_indexing.html">Indexing</a> for more
     * information.
     * </p>
     * 
     * @param createIndexRequest
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates an index object. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_indexing.html">Indexing</a> for more
     * information.
     * </p>
     * 
     * @param createIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIndexResult> createIndexAsync(CreateIndexRequest createIndexRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIndexRequest, CreateIndexResult> asyncHandler);

    /**
     * <p>
     * Creates an object in a <a>Directory</a>. Additionally attaches the object to a parent, if a parent reference and
     * <code>LinkName</code> is specified. An object is simply a collection of <a>Facet</a> attributes. You can also use
     * this API call to create a policy object, if the facet from which you create the object is a policy facet.
     * </p>
     * 
     * @param createObjectRequest
     * @return A Java Future containing the result of the CreateObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateObjectResult> createObjectAsync(CreateObjectRequest createObjectRequest);

    /**
     * <p>
     * Creates an object in a <a>Directory</a>. Additionally attaches the object to a parent, if a parent reference and
     * <code>LinkName</code> is specified. An object is simply a collection of <a>Facet</a> attributes. You can also use
     * this API call to create a policy object, if the facet from which you create the object is a policy facet.
     * </p>
     * 
     * @param createObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateObjectResult> createObjectAsync(CreateObjectRequest createObjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateObjectRequest, CreateObjectResult> asyncHandler);

    /**
     * <p>
     * Creates a new schema in a development state. A schema can exist in three phases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Development:</i> This is a mutable phase of the schema. All new schemas are in the development phase. Once the
     * schema is finalized, it can be published.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Published:</i> Published schemas are immutable and have a version associated with them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Applied:</i> Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
     * new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Creates a new schema in a development state. A schema can exist in three phases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Development:</i> This is a mutable phase of the schema. All new schemas are in the development phase. Once the
     * schema is finalized, it can be published.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Published:</i> Published schemas are immutable and have a version associated with them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Applied:</i> Applied schemas are mutable in a way that allows you to add new schema facets. You can also add
     * new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler);

    /**
     * <p>
     * Creates a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param createTypedLinkFacetRequest
     * @return A Java Future containing the result of the CreateTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.CreateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTypedLinkFacetResult> createTypedLinkFacetAsync(CreateTypedLinkFacetRequest createTypedLinkFacetRequest);

    /**
     * <p>
     * Creates a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param createTypedLinkFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.CreateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/CreateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTypedLinkFacetResult> createTypedLinkFacetAsync(CreateTypedLinkFacetRequest createTypedLinkFacetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTypedLinkFacetRequest, CreateTypedLinkFacetResult> asyncHandler);

    /**
     * <p>
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
     * extreme caution when deleting directories.
     * </p>
     * 
     * @param deleteDirectoryRequest
     * @return A Java Future containing the result of the DeleteDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest);

    /**
     * <p>
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise
     * extreme caution when deleting directories.
     * </p>
     * 
     * @param deleteDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DeleteDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDirectoryResult> deleteDirectoryAsync(DeleteDirectoryRequest deleteDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler);

    /**
     * <p>
     * Deletes a given <a>Facet</a>. All attributes and <a>Rule</a>s that are associated with the facet will be deleted.
     * Only development schema facets are allowed deletion.
     * </p>
     * 
     * @param deleteFacetRequest
     * @return A Java Future containing the result of the DeleteFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DeleteFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(DeleteFacetRequest deleteFacetRequest);

    /**
     * <p>
     * Deletes a given <a>Facet</a>. All attributes and <a>Rule</a>s that are associated with the facet will be deleted.
     * Only development schema facets are allowed deletion.
     * </p>
     * 
     * @param deleteFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DeleteFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFacetResult> deleteFacetAsync(DeleteFacetRequest deleteFacetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFacetRequest, DeleteFacetResult> asyncHandler);

    /**
     * <p>
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest);

    /**
     * <p>
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     * </p>
     * 
     * @param deleteObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a given schema. Schemas in a development and published state can only be deleted.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Deletes a given schema. Schemas in a development and published state can only be deleted.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler);

    /**
     * <p>
     * Deletes a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param deleteTypedLinkFacetRequest
     * @return A Java Future containing the result of the DeleteTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DeleteTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTypedLinkFacetResult> deleteTypedLinkFacetAsync(DeleteTypedLinkFacetRequest deleteTypedLinkFacetRequest);

    /**
     * <p>
     * Deletes a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param deleteTypedLinkFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DeleteTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DeleteTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTypedLinkFacetResult> deleteTypedLinkFacetAsync(DeleteTypedLinkFacetRequest deleteTypedLinkFacetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTypedLinkFacetRequest, DeleteTypedLinkFacetResult> asyncHandler);

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndexRequest
     * @return A Java Future containing the result of the DetachFromIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DetachFromIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachFromIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(DetachFromIndexRequest detachFromIndexRequest);

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachFromIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DetachFromIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachFromIndex" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachFromIndexResult> detachFromIndexAsync(DetachFromIndexRequest detachFromIndexRequest,
            com.amazonaws.handlers.AsyncHandler<DetachFromIndexRequest, DetachFromIndexResult> asyncHandler);

    /**
     * <p>
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
     * the link name.
     * </p>
     * 
     * @param detachObjectRequest
     * @return A Java Future containing the result of the DetachObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DetachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(DetachObjectRequest detachObjectRequest);

    /**
     * <p>
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by
     * the link name.
     * </p>
     * 
     * @param detachObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DetachObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachObjectResult> detachObjectAsync(DetachObjectRequest detachObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DetachObjectRequest, DetachObjectResult> asyncHandler);

    /**
     * <p>
     * Detaches a policy from an object.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Detaches a policy from an object.
     * </p>
     * 
     * @param detachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler);

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param detachTypedLinkRequest
     * @return A Java Future containing the result of the DetachTypedLink operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DetachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachTypedLinkResult> detachTypedLinkAsync(DetachTypedLinkRequest detachTypedLinkRequest);

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param detachTypedLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachTypedLink operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DetachTypedLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DetachTypedLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetachTypedLinkResult> detachTypedLinkAsync(DetachTypedLinkRequest detachTypedLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DetachTypedLinkRequest, DetachTypedLinkResult> asyncHandler);

    /**
     * <p>
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
     * be disabled. Disabled directories may be reenabled.
     * </p>
     * 
     * @param disableDirectoryRequest
     * @return A Java Future containing the result of the DisableDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.DisableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DisableDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(DisableDirectoryRequest disableDirectoryRequest);

    /**
     * <p>
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can
     * be disabled. Disabled directories may be reenabled.
     * </p>
     * 
     * @param disableDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.DisableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/DisableDirectory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableDirectoryResult> disableDirectoryAsync(DisableDirectoryRequest disableDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<DisableDirectoryRequest, DisableDirectoryResult> asyncHandler);

    /**
     * <p>
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
     * be read and written to.
     * </p>
     * 
     * @param enableDirectoryRequest
     * @return A Java Future containing the result of the EnableDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.EnableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/EnableDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(EnableDirectoryRequest enableDirectoryRequest);

    /**
     * <p>
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then
     * be read and written to.
     * </p>
     * 
     * @param enableDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.EnableDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/EnableDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableDirectoryResult> enableDirectoryAsync(EnableDirectoryRequest enableDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<EnableDirectoryRequest, EnableDirectoryResult> asyncHandler);

    /**
     * <p>
     * Returns current applied schema version ARN, including the minor version in use.
     * </p>
     * 
     * @param getAppliedSchemaVersionRequest
     * @return A Java Future containing the result of the GetAppliedSchemaVersion operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.GetAppliedSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetAppliedSchemaVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppliedSchemaVersionResult> getAppliedSchemaVersionAsync(GetAppliedSchemaVersionRequest getAppliedSchemaVersionRequest);

    /**
     * <p>
     * Returns current applied schema version ARN, including the minor version in use.
     * </p>
     * 
     * @param getAppliedSchemaVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppliedSchemaVersion operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetAppliedSchemaVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetAppliedSchemaVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppliedSchemaVersionResult> getAppliedSchemaVersionAsync(GetAppliedSchemaVersionRequest getAppliedSchemaVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppliedSchemaVersionRequest, GetAppliedSchemaVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata about a directory.
     * </p>
     * 
     * @param getDirectoryRequest
     * @return A Java Future containing the result of the GetDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.GetDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(GetDirectoryRequest getDirectoryRequest);

    /**
     * <p>
     * Retrieves metadata about a directory.
     * </p>
     * 
     * @param getDirectoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDirectory operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetDirectory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetDirectory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDirectoryResult> getDirectoryAsync(GetDirectoryRequest getDirectoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetDirectoryRequest, GetDirectoryResult> asyncHandler);

    /**
     * <p>
     * Gets details of the <a>Facet</a>, such as facet name, attributes, <a>Rule</a>s, or <code>ObjectType</code>. You
     * can call this on all kinds of schema facets -- published, development, or applied.
     * </p>
     * 
     * @param getFacetRequest
     * @return A Java Future containing the result of the GetFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.GetFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFacetResult> getFacetAsync(GetFacetRequest getFacetRequest);

    /**
     * <p>
     * Gets details of the <a>Facet</a>, such as facet name, attributes, <a>Rule</a>s, or <code>ObjectType</code>. You
     * can call this on all kinds of schema facets -- published, development, or applied.
     * </p>
     * 
     * @param getFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFacetResult> getFacetAsync(GetFacetRequest getFacetRequest,
            com.amazonaws.handlers.AsyncHandler<GetFacetRequest, GetFacetResult> asyncHandler);

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformationRequest
     * @return A Java Future containing the result of the GetObjectInformation operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.GetObjectInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetObjectInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(GetObjectInformationRequest getObjectInformationRequest);

    /**
     * <p>
     * Retrieves metadata about an object.
     * </p>
     * 
     * @param getObjectInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetObjectInformation operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetObjectInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetObjectInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetObjectInformationResult> getObjectInformationAsync(GetObjectInformationRequest getObjectInformationRequest,
            com.amazonaws.handlers.AsyncHandler<GetObjectInformationRequest, GetObjectInformationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a JSON representation of the schema. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_schemas.html#jsonformat">JSON Schema
     * Format</a> for more information.
     * </p>
     * 
     * @param getSchemaAsJsonRequest
     * @return A Java Future containing the result of the GetSchemaAsJson operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.GetSchemaAsJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetSchemaAsJson" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(GetSchemaAsJsonRequest getSchemaAsJsonRequest);

    /**
     * <p>
     * Retrieves a JSON representation of the schema. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_schemas.html#jsonformat">JSON Schema
     * Format</a> for more information.
     * </p>
     * 
     * @param getSchemaAsJsonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchemaAsJson operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetSchemaAsJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetSchemaAsJson" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaAsJsonResult> getSchemaAsJsonAsync(GetSchemaAsJsonRequest getSchemaAsJsonRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaAsJsonRequest, GetSchemaAsJsonResult> asyncHandler);

    /**
     * <p>
     * Returns the identity attribute order for a specific <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param getTypedLinkFacetInformationRequest
     * @return A Java Future containing the result of the GetTypedLinkFacetInformation operation returned by the
     *         service.
     * @sample AmazonCloudDirectoryAsync.GetTypedLinkFacetInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetTypedLinkFacetInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTypedLinkFacetInformationResult> getTypedLinkFacetInformationAsync(
            GetTypedLinkFacetInformationRequest getTypedLinkFacetInformationRequest);

    /**
     * <p>
     * Returns the identity attribute order for a specific <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param getTypedLinkFacetInformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTypedLinkFacetInformation operation returned by the
     *         service.
     * @sample AmazonCloudDirectoryAsyncHandler.GetTypedLinkFacetInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/GetTypedLinkFacetInformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTypedLinkFacetInformationResult> getTypedLinkFacetInformationAsync(
            GetTypedLinkFacetInformationRequest getTypedLinkFacetInformationRequest,
            com.amazonaws.handlers.AsyncHandler<GetTypedLinkFacetInformationRequest, GetTypedLinkFacetInformationResult> asyncHandler);

    /**
     * <p>
     * Lists schema major versions applied to a directory. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listAppliedSchemaArnsRequest
     * @return A Java Future containing the result of the ListAppliedSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListAppliedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListAppliedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(ListAppliedSchemaArnsRequest listAppliedSchemaArnsRequest);

    /**
     * <p>
     * Lists schema major versions applied to a directory. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listAppliedSchemaArnsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppliedSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListAppliedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListAppliedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAppliedSchemaArnsResult> listAppliedSchemaArnsAsync(ListAppliedSchemaArnsRequest listAppliedSchemaArnsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppliedSchemaArnsRequest, ListAppliedSchemaArnsResult> asyncHandler);

    /**
     * <p>
     * Lists indices attached to the specified object.
     * </p>
     * 
     * @param listAttachedIndicesRequest
     * @return A Java Future containing the result of the ListAttachedIndices operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListAttachedIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListAttachedIndices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(ListAttachedIndicesRequest listAttachedIndicesRequest);

    /**
     * <p>
     * Lists indices attached to the specified object.
     * </p>
     * 
     * @param listAttachedIndicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttachedIndices operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListAttachedIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListAttachedIndices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAttachedIndicesResult> listAttachedIndicesAsync(ListAttachedIndicesRequest listAttachedIndicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedIndicesRequest, ListAttachedIndicesResult> asyncHandler);

    /**
     * <p>
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     * </p>
     * 
     * @param listDevelopmentSchemaArnsRequest
     * @return A Java Future containing the result of the ListDevelopmentSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListDevelopmentSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListDevelopmentSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(
            ListDevelopmentSchemaArnsRequest listDevelopmentSchemaArnsRequest);

    /**
     * <p>
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     * </p>
     * 
     * @param listDevelopmentSchemaArnsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevelopmentSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListDevelopmentSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListDevelopmentSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevelopmentSchemaArnsResult> listDevelopmentSchemaArnsAsync(
            ListDevelopmentSchemaArnsRequest listDevelopmentSchemaArnsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevelopmentSchemaArnsRequest, ListDevelopmentSchemaArnsResult> asyncHandler);

    /**
     * <p>
     * Lists directories created within an account.
     * </p>
     * 
     * @param listDirectoriesRequest
     * @return A Java Future containing the result of the ListDirectories operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(ListDirectoriesRequest listDirectoriesRequest);

    /**
     * <p>
     * Lists directories created within an account.
     * </p>
     * 
     * @param listDirectoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDirectories operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListDirectories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListDirectories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDirectoriesResult> listDirectoriesAsync(ListDirectoriesRequest listDirectoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDirectoriesRequest, ListDirectoriesResult> asyncHandler);

    /**
     * <p>
     * Retrieves attributes attached to the facet.
     * </p>
     * 
     * @param listFacetAttributesRequest
     * @return A Java Future containing the result of the ListFacetAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(ListFacetAttributesRequest listFacetAttributesRequest);

    /**
     * <p>
     * Retrieves attributes attached to the facet.
     * </p>
     * 
     * @param listFacetAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFacetAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFacetAttributesResult> listFacetAttributesAsync(ListFacetAttributesRequest listFacetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFacetAttributesRequest, ListFacetAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the names of facets that exist in a schema.
     * </p>
     * 
     * @param listFacetNamesRequest
     * @return A Java Future containing the result of the ListFacetNames operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListFacetNames" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(ListFacetNamesRequest listFacetNamesRequest);

    /**
     * <p>
     * Retrieves the names of facets that exist in a schema.
     * </p>
     * 
     * @param listFacetNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFacetNames operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListFacetNames" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFacetNamesResult> listFacetNamesAsync(ListFacetNamesRequest listFacetNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFacetNamesRequest, ListFacetNamesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listIncomingTypedLinksRequest
     * @return A Java Future containing the result of the ListIncomingTypedLinks operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListIncomingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListIncomingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIncomingTypedLinksResult> listIncomingTypedLinksAsync(ListIncomingTypedLinksRequest listIncomingTypedLinksRequest);

    /**
     * <p>
     * Returns a paginated list of all the incoming <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listIncomingTypedLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIncomingTypedLinks operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListIncomingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListIncomingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIncomingTypedLinksResult> listIncomingTypedLinksAsync(ListIncomingTypedLinksRequest listIncomingTypedLinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListIncomingTypedLinksRequest, ListIncomingTypedLinksResult> asyncHandler);

    /**
     * <p>
     * Lists objects and indexed values attached to the index.
     * </p>
     * 
     * @param listIndexRequest
     * @return A Java Future containing the result of the ListIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndexResult> listIndexAsync(ListIndexRequest listIndexRequest);

    /**
     * <p>
     * Lists objects and indexed values attached to the index.
     * </p>
     * 
     * @param listIndexRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIndex operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListIndex" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIndexResult> listIndexAsync(ListIndexRequest listIndexRequest,
            com.amazonaws.handlers.AsyncHandler<ListIndexRequest, ListIndexResult> asyncHandler);

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributesRequest
     * @return A Java Future containing the result of the ListObjectAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(ListObjectAttributesRequest listObjectAttributesRequest);

    /**
     * <p>
     * Lists all attributes that are associated with an object.
     * </p>
     * 
     * @param listObjectAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectAttributesResult> listObjectAttributesAsync(ListObjectAttributesRequest listObjectAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectAttributesRequest, ListObjectAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildrenRequest
     * @return A Java Future containing the result of the ListObjectChildren operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListObjectChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectChildren"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(ListObjectChildrenRequest listObjectChildrenRequest);

    /**
     * <p>
     * Returns a paginated list of child objects that are associated with a given object.
     * </p>
     * 
     * @param listObjectChildrenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectChildren operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListObjectChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectChildren"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectChildrenResult> listObjectChildrenAsync(ListObjectChildrenRequest listObjectChildrenRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectChildrenRequest, ListObjectChildrenResult> asyncHandler);

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_key_concepts.html#dirstructure">Directory
     * Structure</a>.
     * </p>
     * <p>
     * Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
     * up to the requested object. The API returns the number of paths based on user-defined <code>MaxResults</code>, in
     * case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
     * multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
     * from the target object.
     * </p>
     * 
     * @param listObjectParentPathsRequest
     * @return A Java Future containing the result of the ListObjectParentPaths operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListObjectParentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectParentPaths"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(ListObjectParentPathsRequest listObjectParentPathsRequest);

    /**
     * <p>
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node
     * objects. For more information about objects, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_key_concepts.html#dirstructure">Directory
     * Structure</a>.
     * </p>
     * <p>
     * Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory
     * up to the requested object. The API returns the number of paths based on user-defined <code>MaxResults</code>, in
     * case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among
     * multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored
     * from the target object.
     * </p>
     * 
     * @param listObjectParentPathsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectParentPaths operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListObjectParentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectParentPaths"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectParentPathsResult> listObjectParentPathsAsync(ListObjectParentPathsRequest listObjectParentPathsRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectParentPathsRequest, ListObjectParentPathsResult> asyncHandler);

    /**
     * <p>
     * Lists parent objects that are associated with a given object in pagination fashion.
     * </p>
     * 
     * @param listObjectParentsRequest
     * @return A Java Future containing the result of the ListObjectParents operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListObjectParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectParents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(ListObjectParentsRequest listObjectParentsRequest);

    /**
     * <p>
     * Lists parent objects that are associated with a given object in pagination fashion.
     * </p>
     * 
     * @param listObjectParentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectParents operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListObjectParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectParents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectParentsResult> listObjectParentsAsync(ListObjectParentsRequest listObjectParentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectParentsRequest, ListObjectParentsResult> asyncHandler);

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPoliciesRequest
     * @return A Java Future containing the result of the ListObjectPolicies operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListObjectPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(ListObjectPoliciesRequest listObjectPoliciesRequest);

    /**
     * <p>
     * Returns policies attached to an object in pagination fashion.
     * </p>
     * 
     * @param listObjectPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListObjectPolicies operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListObjectPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListObjectPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListObjectPoliciesResult> listObjectPoliciesAsync(ListObjectPoliciesRequest listObjectPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListObjectPoliciesRequest, ListObjectPoliciesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinksRequest
     * @return A Java Future containing the result of the ListOutgoingTypedLinks operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListOutgoingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListOutgoingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOutgoingTypedLinksResult> listOutgoingTypedLinksAsync(ListOutgoingTypedLinksRequest listOutgoingTypedLinksRequest);

    /**
     * <p>
     * Returns a paginated list of all the outgoing <a>TypedLinkSpecifier</a> information for an object. It also
     * supports filtering by typed link facet and identity attributes. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listOutgoingTypedLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOutgoingTypedLinks operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListOutgoingTypedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListOutgoingTypedLinks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOutgoingTypedLinksResult> listOutgoingTypedLinksAsync(ListOutgoingTypedLinksRequest listOutgoingTypedLinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListOutgoingTypedLinksRequest, ListOutgoingTypedLinksResult> asyncHandler);

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachmentsRequest
     * @return A Java Future containing the result of the ListPolicyAttachments operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListPolicyAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListPolicyAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(ListPolicyAttachmentsRequest listPolicyAttachmentsRequest);

    /**
     * <p>
     * Returns all of the <code>ObjectIdentifiers</code> to which a given policy is attached.
     * </p>
     * 
     * @param listPolicyAttachmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyAttachments operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListPolicyAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListPolicyAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyAttachmentsResult> listPolicyAttachmentsAsync(ListPolicyAttachmentsRequest listPolicyAttachmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyAttachmentsRequest, ListPolicyAttachmentsResult> asyncHandler);

    /**
     * <p>
     * Lists schema major versions for a published schema. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listPublishedSchemaArnsRequest
     * @return A Java Future containing the result of the ListPublishedSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListPublishedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListPublishedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(ListPublishedSchemaArnsRequest listPublishedSchemaArnsRequest);

    /**
     * <p>
     * Lists schema major versions for a published schema. If <code>SchemaArn</code> is provided, lists the minor
     * version.
     * </p>
     * 
     * @param listPublishedSchemaArnsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublishedSchemaArns operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListPublishedSchemaArns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListPublishedSchemaArns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishedSchemaArnsResult> listPublishedSchemaArnsAsync(ListPublishedSchemaArnsRequest listPublishedSchemaArnsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublishedSchemaArnsRequest, ListPublishedSchemaArnsResult> asyncHandler);

    /**
     * <p>
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
     * directory. All 50 tags are returned for a given directory with this API call.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per
     * directory. All 50 tags are returned for a given directory with this API call.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all attribute definitions for a particular <a>TypedLinkFacet</a>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listTypedLinkFacetAttributesRequest
     * @return A Java Future containing the result of the ListTypedLinkFacetAttributes operation returned by the
     *         service.
     * @sample AmazonCloudDirectoryAsync.ListTypedLinkFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTypedLinkFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypedLinkFacetAttributesResult> listTypedLinkFacetAttributesAsync(
            ListTypedLinkFacetAttributesRequest listTypedLinkFacetAttributesRequest);

    /**
     * <p>
     * Returns a paginated list of all attribute definitions for a particular <a>TypedLinkFacet</a>. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listTypedLinkFacetAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypedLinkFacetAttributes operation returned by the
     *         service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListTypedLinkFacetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTypedLinkFacetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypedLinkFacetAttributesResult> listTypedLinkFacetAttributesAsync(
            ListTypedLinkFacetAttributesRequest listTypedLinkFacetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypedLinkFacetAttributesRequest, ListTypedLinkFacetAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of <code>TypedLink</code> facet names for a particular schema. For more information, see
     * <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listTypedLinkFacetNamesRequest
     * @return A Java Future containing the result of the ListTypedLinkFacetNames operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.ListTypedLinkFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTypedLinkFacetNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypedLinkFacetNamesResult> listTypedLinkFacetNamesAsync(ListTypedLinkFacetNamesRequest listTypedLinkFacetNamesRequest);

    /**
     * <p>
     * Returns a paginated list of <code>TypedLink</code> facet names for a particular schema. For more information, see
     * <a href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param listTypedLinkFacetNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTypedLinkFacetNames operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.ListTypedLinkFacetNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListTypedLinkFacetNames"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTypedLinkFacetNamesResult> listTypedLinkFacetNamesAsync(ListTypedLinkFacetNamesRequest listTypedLinkFacetNamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTypedLinkFacetNamesRequest, ListTypedLinkFacetNamesResult> asyncHandler);

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_key_concepts.html#policies">Policies</a>.
     * </p>
     * 
     * @param lookupPolicyRequest
     * @return A Java Future containing the result of the LookupPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.LookupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/LookupPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(LookupPolicyRequest lookupPolicyRequest);

    /**
     * <p>
     * Lists all policies from the root of the <a>Directory</a> to the object specified. If there are no policies
     * present, an empty list is returned. If policies are present, and if some objects don't have the policies
     * attached, it returns the <code>ObjectIdentifier</code> for such objects. If policies are present, it returns
     * <code>ObjectIdentifier</code>, <code>policyId</code>, and <code>policyType</code>. Paths that don't lead to the
     * root from the target object are ignored. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_key_concepts.html#policies">Policies</a>.
     * </p>
     * 
     * @param lookupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LookupPolicy operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.LookupPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/LookupPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<LookupPolicyResult> lookupPolicyAsync(LookupPolicyRequest lookupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<LookupPolicyRequest, LookupPolicyResult> asyncHandler);

    /**
     * <p>
     * Publishes a development schema with a major version and a recommended minor version.
     * </p>
     * 
     * @param publishSchemaRequest
     * @return A Java Future containing the result of the PublishSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.PublishSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/PublishSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(PublishSchemaRequest publishSchemaRequest);

    /**
     * <p>
     * Publishes a development schema with a major version and a recommended minor version.
     * </p>
     * 
     * @param publishSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.PublishSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/PublishSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PublishSchemaResult> publishSchemaAsync(PublishSchemaRequest publishSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<PublishSchemaRequest, PublishSchemaResult> asyncHandler);

    /**
     * <p>
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_schemas.html#jsonformat">JSON Schema
     * Format</a> for more information.
     * </p>
     * 
     * @param putSchemaFromJsonRequest
     * @return A Java Future containing the result of the PutSchemaFromJson operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.PutSchemaFromJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/PutSchemaFromJson"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(PutSchemaFromJsonRequest putSchemaFromJsonRequest);

    /**
     * <p>
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/cd_schemas.html#jsonformat">JSON Schema
     * Format</a> for more information.
     * </p>
     * 
     * @param putSchemaFromJsonRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSchemaFromJson operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.PutSchemaFromJson
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/PutSchemaFromJson"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSchemaFromJsonResult> putSchemaFromJsonAsync(PutSchemaFromJsonRequest putSchemaFromJsonRequest,
            com.amazonaws.handlers.AsyncHandler<PutSchemaFromJsonRequest, PutSchemaFromJsonResult> asyncHandler);

    /**
     * <p>
     * Removes the specified facet from the specified object.
     * </p>
     * 
     * @param removeFacetFromObjectRequest
     * @return A Java Future containing the result of the RemoveFacetFromObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.RemoveFacetFromObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/RemoveFacetFromObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(RemoveFacetFromObjectRequest removeFacetFromObjectRequest);

    /**
     * <p>
     * Removes the specified facet from the specified object.
     * </p>
     * 
     * @param removeFacetFromObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFacetFromObject operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.RemoveFacetFromObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/RemoveFacetFromObject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFacetFromObjectResult> removeFacetFromObjectAsync(RemoveFacetFromObjectRequest removeFacetFromObjectRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFacetFromObjectRequest, RemoveFacetFromObjectResult> asyncHandler);

    /**
     * <p>
     * An API operation for adding tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * An API operation for adding tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * An API operation for removing tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * An API operation for removing tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Adds new <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateFacetRequest
     * @return A Java Future containing the result of the UpdateFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpdateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(UpdateFacetRequest updateFacetRequest);

    /**
     * <p>
     * Does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Adds new <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Updates existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes existing <code>Attributes</code>, <code>Rules</code>, or <code>ObjectTypes</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpdateFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateFacet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFacetResult> updateFacetAsync(UpdateFacetRequest updateFacetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFacetRequest, UpdateFacetResult> asyncHandler);

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributesRequest
     * @return A Java Future containing the result of the UpdateObjectAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpdateObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(UpdateObjectAttributesRequest updateObjectAttributesRequest);

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateObjectAttributes operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpdateObjectAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateObjectAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateObjectAttributesResult> updateObjectAttributesAsync(UpdateObjectAttributesRequest updateObjectAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateObjectAttributesRequest, UpdateObjectAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates the schema name with a new name. Only development schema names can be updated.
     * </p>
     * 
     * @param updateSchemaRequest
     * @return A Java Future containing the result of the UpdateSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest updateSchemaRequest);

    /**
     * <p>
     * Updates the schema name with a new name. Only development schema names can be updated.
     * </p>
     * 
     * @param updateSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpdateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaResult> updateSchemaAsync(UpdateSchemaRequest updateSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResult> asyncHandler);

    /**
     * <p>
     * Updates a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param updateTypedLinkFacetRequest
     * @return A Java Future containing the result of the UpdateTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpdateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTypedLinkFacetResult> updateTypedLinkFacetAsync(UpdateTypedLinkFacetRequest updateTypedLinkFacetRequest);

    /**
     * <p>
     * Updates a <a>TypedLinkFacet</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/directoryservice/latest/admin-guide/objectsandlinks.html#typedlink">Typed
     * link</a>.
     * </p>
     * 
     * @param updateTypedLinkFacetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTypedLinkFacet operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpdateTypedLinkFacet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpdateTypedLinkFacet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTypedLinkFacetResult> updateTypedLinkFacetAsync(UpdateTypedLinkFacetRequest updateTypedLinkFacetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTypedLinkFacetRequest, UpdateTypedLinkFacetResult> asyncHandler);

    /**
     * <p>
     * Upgrades a single directory in-place using the <code>PublishedSchemaArn</code> with schema updates found in
     * <code>MinorVersion</code>. Backwards-compatible minor version upgrades are instantaneously available for readers
     * on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
     * directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
     * directory.
     * </p>
     * 
     * @param upgradeAppliedSchemaRequest
     * @return A Java Future containing the result of the UpgradeAppliedSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpgradeAppliedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpgradeAppliedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeAppliedSchemaResult> upgradeAppliedSchemaAsync(UpgradeAppliedSchemaRequest upgradeAppliedSchemaRequest);

    /**
     * <p>
     * Upgrades a single directory in-place using the <code>PublishedSchemaArn</code> with schema updates found in
     * <code>MinorVersion</code>. Backwards-compatible minor version upgrades are instantaneously available for readers
     * on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given
     * directory per call. To upgrade multiple directories from one schema, you would need to call this API on each
     * directory.
     * </p>
     * 
     * @param upgradeAppliedSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradeAppliedSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpgradeAppliedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpgradeAppliedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradeAppliedSchemaResult> upgradeAppliedSchemaAsync(UpgradeAppliedSchemaRequest upgradeAppliedSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradeAppliedSchemaRequest, UpgradeAppliedSchemaResult> asyncHandler);

    /**
     * <p>
     * Upgrades a published schema under a new minor version revision using the current contents of
     * <code>DevelopmentSchemaArn</code>.
     * </p>
     * 
     * @param upgradePublishedSchemaRequest
     * @return A Java Future containing the result of the UpgradePublishedSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsync.UpgradePublishedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpgradePublishedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradePublishedSchemaResult> upgradePublishedSchemaAsync(UpgradePublishedSchemaRequest upgradePublishedSchemaRequest);

    /**
     * <p>
     * Upgrades a published schema under a new minor version revision using the current contents of
     * <code>DevelopmentSchemaArn</code>.
     * </p>
     * 
     * @param upgradePublishedSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpgradePublishedSchema operation returned by the service.
     * @sample AmazonCloudDirectoryAsyncHandler.UpgradePublishedSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/UpgradePublishedSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpgradePublishedSchemaResult> upgradePublishedSchemaAsync(UpgradePublishedSchemaRequest upgradePublishedSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<UpgradePublishedSchemaRequest, UpgradePublishedSchemaResult> asyncHandler);

}
