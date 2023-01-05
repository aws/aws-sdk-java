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
package com.amazonaws.services.appintegrations;

import javax.annotation.Generated;

import com.amazonaws.services.appintegrations.model.*;

/**
 * Interface for accessing Amazon AppIntegrations Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appintegrations.AbstractAmazonAppIntegrationsAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.
 * </p>
 * <p>
 * For information about how you can use external applications with Amazon Connect, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/crm.html">Set up pre-built integrations</a> and <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-wisdom.html">Deliver information to agents
 * using Amazon Connect Wisdom</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppIntegrationsAsync extends AmazonAppIntegrations {

    /**
     * <p>
     * Creates and persists a DataIntegration resource.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <code>CreateDataIntegration</code> API.
     * </p>
     * </note>
     * 
     * @param createDataIntegrationRequest
     * @return A Java Future containing the result of the CreateDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.CreateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(CreateDataIntegrationRequest createDataIntegrationRequest);

    /**
     * <p>
     * Creates and persists a DataIntegration resource.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <code>CreateDataIntegration</code> API.
     * </p>
     * </note>
     * 
     * @param createDataIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.CreateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataIntegrationResult> createDataIntegrationAsync(CreateDataIntegrationRequest createDataIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataIntegrationRequest, CreateDataIntegrationResult> asyncHandler);

    /**
     * <p>
     * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon EventBridge bus in
     * your account and a partner event source that pushes events to that bus. No objects are created in the your
     * account, only metadata that is persisted on the EventIntegration control plane.
     * </p>
     * 
     * @param createEventIntegrationRequest
     * @return A Java Future containing the result of the CreateEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.CreateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(CreateEventIntegrationRequest createEventIntegrationRequest);

    /**
     * <p>
     * Creates an EventIntegration, given a specified name, description, and a reference to an Amazon EventBridge bus in
     * your account and a partner event source that pushes events to that bus. No objects are created in the your
     * account, only metadata that is persisted on the EventIntegration control plane.
     * </p>
     * 
     * @param createEventIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.CreateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventIntegrationResult> createEventIntegrationAsync(CreateEventIntegrationRequest createEventIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventIntegrationRequest, CreateEventIntegrationResult> asyncHandler);

    /**
     * <p>
     * Deletes the DataIntegration. Only DataIntegrations that don't have any DataIntegrationAssociations can be
     * deleted. Deleting a DataIntegration also deletes the underlying Amazon AppFlow flow and service linked role.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param deleteDataIntegrationRequest
     * @return A Java Future containing the result of the DeleteDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.DeleteDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(DeleteDataIntegrationRequest deleteDataIntegrationRequest);

    /**
     * <p>
     * Deletes the DataIntegration. Only DataIntegrations that don't have any DataIntegrationAssociations can be
     * deleted. Deleting a DataIntegration also deletes the underlying Amazon AppFlow flow and service linked role.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param deleteDataIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.DeleteDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataIntegrationResult> deleteDataIntegrationAsync(DeleteDataIntegrationRequest deleteDataIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataIntegrationRequest, DeleteDataIntegrationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified existing event integration. If the event integration is associated with clients, the
     * request is rejected.
     * </p>
     * 
     * @param deleteEventIntegrationRequest
     * @return A Java Future containing the result of the DeleteEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.DeleteEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(DeleteEventIntegrationRequest deleteEventIntegrationRequest);

    /**
     * <p>
     * Deletes the specified existing event integration. If the event integration is associated with clients, the
     * request is rejected.
     * </p>
     * 
     * @param deleteEventIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.DeleteEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/DeleteEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventIntegrationResult> deleteEventIntegrationAsync(DeleteEventIntegrationRequest deleteEventIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventIntegrationRequest, DeleteEventIntegrationResult> asyncHandler);

    /**
     * <p>
     * Returns information about the DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param getDataIntegrationRequest
     * @return A Java Future containing the result of the GetDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.GetDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(GetDataIntegrationRequest getDataIntegrationRequest);

    /**
     * <p>
     * Returns information about the DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param getDataIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.GetDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataIntegrationResult> getDataIntegrationAsync(GetDataIntegrationRequest getDataIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataIntegrationRequest, GetDataIntegrationResult> asyncHandler);

    /**
     * <p>
     * Returns information about the event integration.
     * </p>
     * 
     * @param getEventIntegrationRequest
     * @return A Java Future containing the result of the GetEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.GetEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(GetEventIntegrationRequest getEventIntegrationRequest);

    /**
     * <p>
     * Returns information about the event integration.
     * </p>
     * 
     * @param getEventIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.GetEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/GetEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEventIntegrationResult> getEventIntegrationAsync(GetEventIntegrationRequest getEventIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventIntegrationRequest, GetEventIntegrationResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of DataIntegration associations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationAssociationsRequest
     * @return A Java Future containing the result of the ListDataIntegrationAssociations operation returned by the
     *         service.
     * @sample AmazonAppIntegrationsAsync.ListDataIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            ListDataIntegrationAssociationsRequest listDataIntegrationAssociationsRequest);

    /**
     * <p>
     * Returns a paginated list of DataIntegration associations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataIntegrationAssociations operation returned by the
     *         service.
     * @sample AmazonAppIntegrationsAsyncHandler.ListDataIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIntegrationAssociationsResult> listDataIntegrationAssociationsAsync(
            ListDataIntegrationAssociationsRequest listDataIntegrationAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataIntegrationAssociationsRequest, ListDataIntegrationAssociationsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of DataIntegrations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationsRequest
     * @return A Java Future containing the result of the ListDataIntegrations operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.ListDataIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(ListDataIntegrationsRequest listDataIntegrationsRequest);

    /**
     * <p>
     * Returns a paginated list of DataIntegrations in the account.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param listDataIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataIntegrations operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.ListDataIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListDataIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataIntegrationsResult> listDataIntegrationsAsync(ListDataIntegrationsRequest listDataIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataIntegrationsRequest, ListDataIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of event integration associations in the account.
     * </p>
     * 
     * @param listEventIntegrationAssociationsRequest
     * @return A Java Future containing the result of the ListEventIntegrationAssociations operation returned by the
     *         service.
     * @sample AmazonAppIntegrationsAsync.ListEventIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            ListEventIntegrationAssociationsRequest listEventIntegrationAssociationsRequest);

    /**
     * <p>
     * Returns a paginated list of event integration associations in the account.
     * </p>
     * 
     * @param listEventIntegrationAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventIntegrationAssociations operation returned by the
     *         service.
     * @sample AmazonAppIntegrationsAsyncHandler.ListEventIntegrationAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrationAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventIntegrationAssociationsResult> listEventIntegrationAssociationsAsync(
            ListEventIntegrationAssociationsRequest listEventIntegrationAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventIntegrationAssociationsRequest, ListEventIntegrationAssociationsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of event integrations in the account.
     * </p>
     * 
     * @param listEventIntegrationsRequest
     * @return A Java Future containing the result of the ListEventIntegrations operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.ListEventIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(ListEventIntegrationsRequest listEventIntegrationsRequest);

    /**
     * <p>
     * Returns a paginated list of event integrations in the account.
     * </p>
     * 
     * @param listEventIntegrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventIntegrations operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.ListEventIntegrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListEventIntegrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEventIntegrationsResult> listEventIntegrationsAsync(ListEventIntegrationsRequest listEventIntegrationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventIntegrationsRequest, ListEventIntegrationsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the description of a DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param updateDataIntegrationRequest
     * @return A Java Future containing the result of the UpdateDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.UpdateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(UpdateDataIntegrationRequest updateDataIntegrationRequest);

    /**
     * <p>
     * Updates the description of a DataIntegration.
     * </p>
     * <note>
     * <p>
     * You cannot create a DataIntegration association for a DataIntegration that has been previously associated. Use a
     * different DataIntegration, or recreate the DataIntegration using the <a
     * href="https://docs.aws.amazon.com/appintegrations/latest/APIReference/API_CreateDataIntegration.html"
     * >CreateDataIntegration</a> API.
     * </p>
     * </note>
     * 
     * @param updateDataIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.UpdateDataIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateDataIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataIntegrationResult> updateDataIntegrationAsync(UpdateDataIntegrationRequest updateDataIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataIntegrationRequest, UpdateDataIntegrationResult> asyncHandler);

    /**
     * <p>
     * Updates the description of an event integration.
     * </p>
     * 
     * @param updateEventIntegrationRequest
     * @return A Java Future containing the result of the UpdateEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsync.UpdateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(UpdateEventIntegrationRequest updateEventIntegrationRequest);

    /**
     * <p>
     * Updates the description of an event integration.
     * </p>
     * 
     * @param updateEventIntegrationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEventIntegration operation returned by the service.
     * @sample AmazonAppIntegrationsAsyncHandler.UpdateEventIntegration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateEventIntegration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEventIntegrationResult> updateEventIntegrationAsync(UpdateEventIntegrationRequest updateEventIntegrationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEventIntegrationRequest, UpdateEventIntegrationResult> asyncHandler);

}
