/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cloudhsm.model.*;

/**
 * Interface for accessing AWSCloudHSM asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS CloudHSM Service
 */
public interface AWSCloudHSMAsync extends AWSCloudHSM {
    /**
     * <p>
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     *
     * @param getConfigRequest Container for the necessary parameters to
     *           execute the GetConfig operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         GetConfig service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     *
     * @param getConfigRequest Container for the necessary parameters to
     *           execute the GetConfig operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetConfig service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest,
            AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     *
     * @param createHapgRequest Container for the necessary parameters to
     *           execute the CreateHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     *
     * @param createHapgRequest Container for the necessary parameters to
     *           execute the CreateHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest,
            AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     *
     * @param describeHapgRequest Container for the necessary parameters to
     *           execute the DescribeHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     *
     * @param describeHapgRequest Container for the necessary parameters to
     *           execute the DescribeHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest,
            AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     *
     * @param listAvailableZonesRequest Container for the necessary
     *           parameters to execute the ListAvailableZones operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableZones service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     *
     * @param listAvailableZonesRequest Container for the necessary
     *           parameters to execute the ListAvailableZones operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableZones service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest,
            AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     *
     * @param modifyHsmRequest Container for the necessary parameters to
     *           execute the ModifyHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     *
     * @param modifyHsmRequest Container for the necessary parameters to
     *           execute the ModifyHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest,
            AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListLunaClients to retrieve the next set of items.
     * </p>
     *
     * @param listLunaClientsRequest Container for the necessary parameters
     *           to execute the ListLunaClients operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListLunaClients service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListLunaClients to retrieve the next set of items.
     * </p>
     *
     * @param listLunaClientsRequest Container for the necessary parameters
     *           to execute the ListLunaClients operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListLunaClients service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest,
            AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHapgs to retrieve the next set of items.
     * </p>
     *
     * @param listHapgsRequest Container for the necessary parameters to
     *           execute the ListHapgs operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListHapgs service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHapgs to retrieve the next set of items.
     * </p>
     *
     * @param listHapgsRequest Container for the necessary parameters to
     *           execute the ListHapgs operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHapgs service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest,
            AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and
     * your key material cannot be recovered.
     * </p>
     *
     * @param deleteHsmRequest Container for the necessary parameters to
     *           execute the DeleteHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and
     * your key material cannot be recovered.
     * </p>
     *
     * @param deleteHsmRequest Container for the necessary parameters to
     *           execute the DeleteHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest,
            AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command
     * provisions an HSM appliance and will result in charges to your AWS
     * account for the HSM.
     * </p>
     *
     * @param createHsmRequest Container for the necessary parameters to
     *           execute the CreateHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command
     * provisions an HSM appliance and will result in charges to your AWS
     * account for the HSM.
     * </p>
     *
     * @param createHsmRequest Container for the necessary parameters to
     *           execute the CreateHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest,
            AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the
     * current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHsms to retrieve the next set of items.
     * </p>
     *
     * @param listHsmsRequest Container for the necessary parameters to
     *           execute the ListHsms operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the ListHsms
     *         service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the
     * current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHsms to retrieve the next set of items.
     * </p>
     *
     * @param listHsmsRequest Container for the necessary parameters to
     *           execute the ListHsms operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListHsms
     *         service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest,
            AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     *
     * @param describeHsmRequest Container for the necessary parameters to
     *           execute the DescribeHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     *
     * @param describeHsmRequest Container for the necessary parameters to
     *           execute the DescribeHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest,
            AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     *
     * @param deleteHapgRequest Container for the necessary parameters to
     *           execute the DeleteHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     *
     * @param deleteHapgRequest Container for the necessary parameters to
     *           execute the DeleteHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest,
            AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     *
     * @param modifyHapgRequest Container for the necessary parameters to
     *           execute the ModifyHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     *
     * @param modifyHapgRequest Container for the necessary parameters to
     *           execute the ModifyHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest,
            AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     *
     * @param createLunaClientRequest Container for the necessary parameters
     *           to execute the CreateLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     *
     * @param createLunaClientRequest Container for the necessary parameters
     *           to execute the CreateLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest,
            AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a client.
     * </p>
     *
     * @param deleteLunaClientRequest Container for the necessary parameters
     *           to execute the DeleteLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a client.
     * </p>
     *
     * @param deleteLunaClientRequest Container for the necessary parameters
     *           to execute the DeleteLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest,
            AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new
     * certificate on the client's HSMs.
     * </p>
     *
     * @param modifyLunaClientRequest Container for the necessary parameters
     *           to execute the ModifyLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new
     * certificate on the client's HSMs.
     * </p>
     *
     * @param modifyLunaClientRequest Container for the necessary parameters
     *           to execute the ModifyLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest,
            AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     *
     * @param describeLunaClientRequest Container for the necessary
     *           parameters to execute the DescribeLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     *
     * @param describeLunaClientRequest Container for the necessary
     *           parameters to execute the DescribeLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest,
            AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        