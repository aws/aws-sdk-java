/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm;

import com.amazonaws.services.cloudhsm.model.*;

/**
 * Interface for accessing CloudHSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsm.AbstractAWSCloudHSMAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CloudHSM Service</fullname>
 */
public interface AWSCloudHSMAsync extends AWSCloudHSM {

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSCloudHSMAsync.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability partition group is a group of partitions that
     * spans multiple physical HSMs.
     * </p>
     * 
     * @param createHapgRequest
     *        Contains the inputs for the <a>CreateHapgRequest</a> action.
     * @return A Java Future containing the result of the CreateHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateHapg
     */
    java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest);

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability partition group is a group of partitions that
     * spans multiple physical HSMs.
     * </p>
     * 
     * @param createHapgRequest
     *        Contains the inputs for the <a>CreateHapgRequest</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateHapg
     */
    java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler);

    /**
     * <p>
     * Creates an uninitialized HSM instance.
     * </p>
     * <p>
     * There is an upfront fee charged for each HSM instance that you create with the <a>CreateHsm</a> operation. If you
     * accidentally provision an HSM and want to request a refund, delete the instance using the <a>DeleteHsm</a>
     * operation, go to the <a href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>, create a new
     * case, and select <b>Account and Billing Support</b>.
     * </p>
     * <important>
     * <p>
     * It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
     * <a>DescribeHsm</a> operation. The HSM is ready to be initialized when the status changes to <code>RUNNING</code>.
     * </p>
     * </important>
     * 
     * @param createHsmRequest
     *        Contains the inputs for the <a>CreateHsm</a> operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateHsm
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest);

    /**
     * <p>
     * Creates an uninitialized HSM instance.
     * </p>
     * <p>
     * There is an upfront fee charged for each HSM instance that you create with the <a>CreateHsm</a> operation. If you
     * accidentally provision an HSM and want to request a refund, delete the instance using the <a>DeleteHsm</a>
     * operation, go to the <a href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>, create a new
     * case, and select <b>Account and Billing Support</b>.
     * </p>
     * <important>
     * <p>
     * It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
     * <a>DescribeHsm</a> operation. The HSM is ready to be initialized when the status changes to <code>RUNNING</code>.
     * </p>
     * </important>
     * 
     * @param createHsmRequest
     *        Contains the inputs for the <a>CreateHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateHsm
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler);

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     * 
     * @param createLunaClientRequest
     *        Contains the inputs for the <a>CreateLunaClient</a> action.
     * @return A Java Future containing the result of the CreateLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateLunaClient
     */
    java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest);

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     * 
     * @param createLunaClientRequest
     *        Contains the inputs for the <a>CreateLunaClient</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateLunaClient
     */
    java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler);

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     * 
     * @param deleteHapgRequest
     *        Contains the inputs for the <a>DeleteHapg</a> action.
     * @return A Java Future containing the result of the DeleteHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteHapg
     */
    java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest);

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     * 
     * @param deleteHapgRequest
     *        Contains the inputs for the <a>DeleteHapg</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteHapg
     */
    java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler);

    /**
     * <p>
     * Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     * </p>
     * 
     * @param deleteHsmRequest
     *        Contains the inputs for the <a>DeleteHsm</a> operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteHsm
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest);

    /**
     * <p>
     * Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     * </p>
     * 
     * @param deleteHsmRequest
     *        Contains the inputs for the <a>DeleteHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteHsm
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler);

    /**
     * <p>
     * Deletes a client.
     * </p>
     * 
     * @param deleteLunaClientRequest
     * @return A Java Future containing the result of the DeleteLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteLunaClient
     */
    java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest);

    /**
     * <p>
     * Deletes a client.
     * </p>
     * 
     * @param deleteLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteLunaClient
     */
    java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     * 
     * @param describeHapgRequest
     *        Contains the inputs for the <a>DescribeHapg</a> action.
     * @return A Java Future containing the result of the DescribeHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeHapg
     */
    java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest);

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     * 
     * @param describeHapgRequest
     *        Contains the inputs for the <a>DescribeHapg</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeHapg
     */
    java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     * </p>
     * 
     * @param describeHsmRequest
     *        Contains the inputs for the <a>DescribeHsm</a> operation.
     * @return A Java Future containing the result of the DescribeHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeHsm
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest);

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     * </p>
     * 
     * @param describeHsmRequest
     *        Contains the inputs for the <a>DescribeHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeHsm
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeHsm operation.
     *
     * @see #describeHsmAsync(DescribeHsmRequest)
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync();

    /**
     * Simplified method form for invoking the DescribeHsm operation with an AsyncHandler.
     *
     * @see #describeHsmAsync(DescribeHsmRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @param describeLunaClientRequest
     * @return A Java Future containing the result of the DescribeLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeLunaClient
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest);

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @param describeLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeLunaClient
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLunaClient operation.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest)
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync();

    /**
     * Simplified method form for invoking the DescribeLunaClient operation with an AsyncHandler.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler);

    /**
     * <p>
     * Gets the configuration files necessary to connect to all high availability partition groups the client is
     * associated with.
     * </p>
     * 
     * @param getConfigRequest
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSCloudHSMAsync.GetConfig
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest);

    /**
     * <p>
     * Gets the configuration files necessary to connect to all high availability partition groups the client is
     * associated with.
     * </p>
     * 
     * @param getConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.GetConfig
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler);

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param listAvailableZonesRequest
     *        Contains the inputs for the <a>ListAvailableZones</a> action.
     * @return A Java Future containing the result of the ListAvailableZones operation returned by the service.
     * @sample AWSCloudHSMAsync.ListAvailableZones
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest);

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param listAvailableZonesRequest
     *        Contains the inputs for the <a>ListAvailableZones</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableZones operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListAvailableZones
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAvailableZones operation.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest)
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync();

    /**
     * Simplified method form for invoking the ListAvailableZones operation with an AsyncHandler.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler);

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to <a>ListHapgs</a>
     * to retrieve the next set of items.
     * </p>
     * 
     * @param listHapgsRequest
     * @return A Java Future containing the result of the ListHapgs operation returned by the service.
     * @sample AWSCloudHSMAsync.ListHapgs
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest);

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to <a>ListHapgs</a>
     * to retrieve the next set of items.
     * </p>
     * 
     * @param listHapgsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHapgs operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListHapgs
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHapgs operation.
     *
     * @see #listHapgsAsync(ListHapgsRequest)
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync();

    /**
     * Simplified method form for invoking the ListHapgs operation with an AsyncHandler.
     *
     * @see #listHapgsAsync(ListHapgsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to <a>ListHsms</a> to
     * retrieve the next set of items.
     * </p>
     * 
     * @param listHsmsRequest
     * @return A Java Future containing the result of the ListHsms operation returned by the service.
     * @sample AWSCloudHSMAsync.ListHsms
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest);

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to <a>ListHsms</a> to
     * retrieve the next set of items.
     * </p>
     * 
     * @param listHsmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHsms operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListHsms
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHsms operation.
     *
     * @see #listHsmsAsync(ListHsmsRequest)
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync();

    /**
     * Simplified method form for invoking the ListHsms operation with an AsyncHandler.
     *
     * @see #listHsmsAsync(ListHsmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * </p>
     * 
     * @param listLunaClientsRequest
     * @return A Java Future containing the result of the ListLunaClients operation returned by the service.
     * @sample AWSCloudHSMAsync.ListLunaClients
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest);

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i> member. If more results are available,
     * the <i>NextToken</i> member of the response contains a token that you pass in the next call to
     * <a>ListLunaClients</a> to retrieve the next set of items.
     * </p>
     * 
     * @param listLunaClientsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLunaClients operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListLunaClients
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListLunaClients operation.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest)
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync();

    /**
     * Simplified method form for invoking the ListLunaClients operation with an AsyncHandler.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all tags for the specified AWS CloudHSM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudHSMAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of all tags for the specified AWS CloudHSM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     * 
     * @param modifyHapgRequest
     * @return A Java Future containing the result of the ModifyHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyHapg
     */
    java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest);

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     * 
     * @param modifyHapgRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyHapg
     */
    java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler);

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     * <important>
     * <p>
     * This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
     * reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
     * configured for high availability, and consider executing this operation during a maintenance window.
     * </p>
     * </important>
     * 
     * @param modifyHsmRequest
     *        Contains the inputs for the <a>ModifyHsm</a> operation.
     * @return A Java Future containing the result of the ModifyHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyHsm
     */
    java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest);

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     * <important>
     * <p>
     * This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
     * reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
     * configured for high availability, and consider executing this operation during a maintenance window.
     * </p>
     * </important>
     * 
     * @param modifyHsmRequest
     *        Contains the inputs for the <a>ModifyHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyHsm
     */
    java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler);

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new certificate on the client's HSMs.
     * </p>
     * 
     * @param modifyLunaClientRequest
     * @return A Java Future containing the result of the ModifyLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyLunaClient
     */
    java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest);

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new certificate on the client's HSMs.
     * </p>
     * 
     * @param modifyLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyLunaClient
     */
    java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
     * use <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSCloudHSMAsync.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
     * use <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

}
