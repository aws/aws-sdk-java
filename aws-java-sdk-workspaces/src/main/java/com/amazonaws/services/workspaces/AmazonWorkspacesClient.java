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

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.services.workspaces.model.transform.*;

/**
 * Client for accessing AmazonWorkspaces.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon WorkSpaces Service <p>
 * This is the <i>Amazon WorkSpaces API Reference</i> . This guide
 * provides detailed information about Amazon WorkSpaces operations, data
 * types, parameters, and errors.
 * </p>
 */
public class AmazonWorkspacesClient extends AmazonWebServiceClient implements AmazonWorkspaces {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonWorkspaces.class);

    /**
     * List of exception unmarshallers for all AmazonWorkspaces exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonWorkspacesClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonWorkspaces
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonWorkspacesClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonWorkspacesClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonWorkspaces
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonWorkspacesClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonWorkspaces
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonWorkspaces
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonWorkspacesClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new ResourceLimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceUnavailableExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidParameterValuesExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("workspaces.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/workspaces/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/workspaces/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

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
    public CreateWorkspacesResult createWorkspaces(CreateWorkspacesRequest createWorkspacesRequest) {
        ExecutionContext executionContext = createExecutionContext(createWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWorkspacesRequest> request = null;
        Response<CreateWorkspacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWorkspacesRequestMarshaller().marshall(super.beforeMarshalling(createWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateWorkspacesResult, JsonUnmarshallerContext> unmarshaller =
                new CreateWorkspacesResultJsonUnmarshaller();
            JsonResponseHandler<CreateWorkspacesResult> responseHandler =
                new JsonResponseHandler<CreateWorkspacesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles(DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkspaceBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceBundlesRequest> request = null;
        Response<DescribeWorkspaceBundlesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceBundlesRequestMarshaller().marshall(super.beforeMarshalling(describeWorkspaceBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeWorkspaceBundlesResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeWorkspaceBundlesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkspaceBundlesResult> responseHandler =
                new JsonResponseHandler<DescribeWorkspaceBundlesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public RebootWorkspacesResult rebootWorkspaces(RebootWorkspacesRequest rebootWorkspacesRequest) {
        ExecutionContext executionContext = createExecutionContext(rebootWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootWorkspacesRequest> request = null;
        Response<RebootWorkspacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootWorkspacesRequestMarshaller().marshall(super.beforeMarshalling(rebootWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<RebootWorkspacesResult, JsonUnmarshallerContext> unmarshaller =
                new RebootWorkspacesResultJsonUnmarshaller();
            JsonResponseHandler<RebootWorkspacesResult> responseHandler =
                new JsonResponseHandler<RebootWorkspacesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeWorkspacesResult describeWorkspaces(DescribeWorkspacesRequest describeWorkspacesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspacesRequest> request = null;
        Response<DescribeWorkspacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspacesRequestMarshaller().marshall(super.beforeMarshalling(describeWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeWorkspacesResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeWorkspacesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkspacesResult> responseHandler =
                new JsonResponseHandler<DescribeWorkspacesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeWorkspaceDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWorkspaceDirectoriesRequest> request = null;
        Response<DescribeWorkspaceDirectoriesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWorkspaceDirectoriesRequestMarshaller().marshall(super.beforeMarshalling(describeWorkspaceDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeWorkspaceDirectoriesResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeWorkspaceDirectoriesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeWorkspaceDirectoriesResult> responseHandler =
                new JsonResponseHandler<DescribeWorkspaceDirectoriesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public RebuildWorkspacesResult rebuildWorkspaces(RebuildWorkspacesRequest rebuildWorkspacesRequest) {
        ExecutionContext executionContext = createExecutionContext(rebuildWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildWorkspacesRequest> request = null;
        Response<RebuildWorkspacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebuildWorkspacesRequestMarshaller().marshall(super.beforeMarshalling(rebuildWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<RebuildWorkspacesResult, JsonUnmarshallerContext> unmarshaller =
                new RebuildWorkspacesResultJsonUnmarshaller();
            JsonResponseHandler<RebuildWorkspacesResult> responseHandler =
                new JsonResponseHandler<RebuildWorkspacesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public TerminateWorkspacesResult terminateWorkspaces(TerminateWorkspacesRequest terminateWorkspacesRequest) {
        ExecutionContext executionContext = createExecutionContext(terminateWorkspacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateWorkspacesRequest> request = null;
        Response<TerminateWorkspacesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateWorkspacesRequestMarshaller().marshall(super.beforeMarshalling(terminateWorkspacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<TerminateWorkspacesResult, JsonUnmarshallerContext> unmarshaller =
                new TerminateWorkspacesResultJsonUnmarshaller();
            JsonResponseHandler<TerminateWorkspacesResult> responseHandler =
                new JsonResponseHandler<TerminateWorkspacesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeWorkspaceBundlesResult describeWorkspaceBundles() throws AmazonServiceException, AmazonClientException {
        return describeWorkspaceBundles(new DescribeWorkspaceBundlesRequest());
    }
    
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
    public DescribeWorkspacesResult describeWorkspaces() throws AmazonServiceException, AmazonClientException {
        return describeWorkspaces(new DescribeWorkspacesRequest());
    }
    
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
    public DescribeWorkspaceDirectoriesResult describeWorkspaceDirectories() throws AmazonServiceException, AmazonClientException {
        return describeWorkspaceDirectories(new DescribeWorkspaceDirectoriesRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        