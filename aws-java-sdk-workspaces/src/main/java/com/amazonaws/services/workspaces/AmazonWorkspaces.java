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
package com.amazonaws.services.workspaces;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.workspaces.model.*;

/**
 * Interface for accessing AmazonWorkspaces.
 * Amazon WorkSpaces Service <p>
 * This is the <i>Amazon WorkSpaces API Reference</i> . This guide
 * provides detailed information about Amazon WorkSpaces operations, data
 * types, parameters, and errors.
 * </p>
 */
public interface AmazonWorkspaces {

    /**
     * Overrides the default endpoint for this client ("https://workspaces.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "workspaces.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://workspaces.us-east-1.amazonaws.com/"). If the
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
     *            The endpoint (ex: "workspaces.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://workspaces.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonWorkspaces#setEndpoint(String)}, sets the
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
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and returns before the
     * WorkSpaces are created.
     * </p>
     *
     * @param createWorkspacesRequest Container for the necessary parameters
     *           to execute the CreateWorkspaces service method on AmazonWorkspaces.
     * 
     * @return The response from the CreateWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     * @throws ResourceLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceBundlesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceBundles service method on
     *           AmazonWorkspaces.
     * 
     * @return The response from the DescribeWorkspaceBundles service method,
     *         as returned by AmazonWorkspaces.
     * 
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> , <code>IMPAIRED</code> , or
     * <code>INOPERABLE</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have rebooted.
     * </p>
     *
     * @param rebootWorkspacesRequest Container for the necessary parameters
     *           to execute the RebootWorkspaces service method on AmazonWorkspaces.
     * 
     * @return The response from the RebootWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspacesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaces service method on
     *           AmazonWorkspaces.
     * 
     * @return The response from the DescribeWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     * @throws ResourceUnavailableException
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceDirectories service method
     *           on AmazonWorkspaces.
     * 
     * @return The response from the DescribeWorkspaceDirectories service
     *         method, as returned by AmazonWorkspaces.
     * 
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can
     * result in the loss of data. Rebuilding a WorkSpace causes the
     * following to occur:
     * </p>
     * 
     * <ul>
     * <li>The system is restored to the image of the bundle that the
     * WorkSpace is created from. Any applications that have been installed,
     * or system settings that have been made since the WorkSpace was created
     * will be lost.</li>
     * <li>The data drive (D drive) is re-created from the last automatic
     * snapshot taken of the data drive. The current contents of the data
     * drive are overwritten. Automatic snapshots of the data drive are taken
     * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
     * 
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely rebuilt.
     * </p>
     *
     * @param rebuildWorkspacesRequest Container for the necessary parameters
     *           to execute the RebuildWorkspaces service method on AmazonWorkspaces.
     * 
     * @return The response from the RebuildWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone.
     * The user's data is not maintained and will be destroyed. If you need
     * to archive any user data, contact Amazon Web Services before
     * terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except
     * <code>SUSPENDED</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely terminated.
     * </p>
     *
     * @param terminateWorkspacesRequest Container for the necessary
     *           parameters to execute the TerminateWorkspaces service method on
     *           AmazonWorkspaces.
     * 
     * @return The response from the TerminateWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return The response from the DescribeWorkspaceBundles service method,
     *         as returned by AmazonWorkspaces.
     * 
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return The response from the DescribeWorkspaces service method, as
     *         returned by AmazonWorkspaces.
     * 
     * @throws ResourceUnavailableException
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspacesResult describeWorkspaces() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return The response from the DescribeWorkspaceDirectories service
     *         method, as returned by AmazonWorkspaces.
     * 
     * @throws InvalidParameterValuesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() throws AmazonServiceException, AmazonClientException;
    
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
        