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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.cloudhsm.model.*;

/**
 * Interface for accessing AWSCloudHSM.
 * AWS CloudHSM Service
 */
public interface AWSCloudHSM {

    /**
     * Overrides the default endpoint for this client ("https://cloudhsm.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudhsm.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://cloudhsm.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "cloudhsm.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://cloudhsm.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSCloudHSM#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     *
     * @param getConfigRequest Container for the necessary parameters to
     *           execute the GetConfig service method on AWSCloudHSM.
     * 
     * @return The response from the GetConfig service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetConfigResult getConfig(GetConfigRequest getConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     *
     * @param createHapgRequest Container for the necessary parameters to
     *           execute the CreateHapg service method on AWSCloudHSM.
     * 
     * @return The response from the CreateHapg service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateHapgResult createHapg(CreateHapgRequest createHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     *
     * @param describeHapgRequest Container for the necessary parameters to
     *           execute the DescribeHapg service method on AWSCloudHSM.
     * 
     * @return The response from the DescribeHapg service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHapgResult describeHapg(DescribeHapgRequest describeHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     *
     * @param listAvailableZonesRequest Container for the necessary
     *           parameters to execute the ListAvailableZones service method on
     *           AWSCloudHSM.
     * 
     * @return The response from the ListAvailableZones service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableZonesResult listAvailableZones(ListAvailableZonesRequest listAvailableZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     *
     * @param modifyHsmRequest Container for the necessary parameters to
     *           execute the ModifyHsm service method on AWSCloudHSM.
     * 
     * @return The response from the ModifyHsm service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyHsmResult modifyHsm(ModifyHsmRequest modifyHsmRequest) 
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
     *           to execute the ListLunaClients service method on AWSCloudHSM.
     * 
     * @return The response from the ListLunaClients service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListLunaClientsResult listLunaClients(ListLunaClientsRequest listLunaClientsRequest) 
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
     *           execute the ListHapgs service method on AWSCloudHSM.
     * 
     * @return The response from the ListHapgs service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHapgsResult listHapgs(ListHapgsRequest listHapgsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and
     * your key material cannot be recovered.
     * </p>
     *
     * @param deleteHsmRequest Container for the necessary parameters to
     *           execute the DeleteHsm service method on AWSCloudHSM.
     * 
     * @return The response from the DeleteHsm service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command
     * provisions an HSM appliance and will result in charges to your AWS
     * account for the HSM.
     * </p>
     *
     * @param createHsmRequest Container for the necessary parameters to
     *           execute the CreateHsm service method on AWSCloudHSM.
     * 
     * @return The response from the CreateHsm service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateHsmResult createHsm(CreateHsmRequest createHsmRequest) 
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
     *           execute the ListHsms service method on AWSCloudHSM.
     * 
     * @return The response from the ListHsms service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHsmsResult listHsms(ListHsmsRequest listHsmsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     *
     * @param describeHsmRequest Container for the necessary parameters to
     *           execute the DescribeHsm service method on AWSCloudHSM.
     * 
     * @return The response from the DescribeHsm service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmResult describeHsm(DescribeHsmRequest describeHsmRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     *
     * @param deleteHapgRequest Container for the necessary parameters to
     *           execute the DeleteHapg service method on AWSCloudHSM.
     * 
     * @return The response from the DeleteHapg service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteHapgResult deleteHapg(DeleteHapgRequest deleteHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     *
     * @param modifyHapgRequest Container for the necessary parameters to
     *           execute the ModifyHapg service method on AWSCloudHSM.
     * 
     * @return The response from the ModifyHapg service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyHapgResult modifyHapg(ModifyHapgRequest modifyHapgRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     *
     * @param createLunaClientRequest Container for the necessary parameters
     *           to execute the CreateLunaClient service method on AWSCloudHSM.
     * 
     * @return The response from the CreateLunaClient service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLunaClientResult createLunaClient(CreateLunaClientRequest createLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a client.
     * </p>
     *
     * @param deleteLunaClientRequest Container for the necessary parameters
     *           to execute the DeleteLunaClient service method on AWSCloudHSM.
     * 
     * @return The response from the DeleteLunaClient service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteLunaClientResult deleteLunaClient(DeleteLunaClientRequest deleteLunaClientRequest) 
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
     *           to execute the ModifyLunaClient service method on AWSCloudHSM.
     * 
     * @return The response from the ModifyLunaClient service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyLunaClientResult modifyLunaClient(ModifyLunaClientRequest modifyLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     *
     * @param describeLunaClientRequest Container for the necessary
     *           parameters to execute the DescribeLunaClient service method on
     *           AWSCloudHSM.
     * 
     * @return The response from the DescribeLunaClient service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLunaClientResult describeLunaClient(DescribeLunaClientRequest describeLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     * 
     * @return The response from the ListAvailableZones service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListAvailableZonesResult listAvailableZones() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the ListLunaClients service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListLunaClientsResult listLunaClients() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the ListHapgs service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHapgsResult listHapgs() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the ListHsms service method, as returned by
     *         AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHsmsResult listHsms() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     * 
     * @return The response from the DescribeHsm service method, as returned
     *         by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHsmResult describeHsm() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @return The response from the DescribeLunaClient service method, as
     *         returned by AWSCloudHSM.
     * 
     * @throws InvalidRequestException
     * @throws CloudHsmInternalException
     * @throws CloudHsmServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLunaClientResult describeLunaClient() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        