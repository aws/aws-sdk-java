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

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.services.cloudhsm.model.transform.*;

/**
 * Client for accessing AWSCloudHSM.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS CloudHSM Service
 */
public class AWSCloudHSMClient extends AmazonWebServiceClient implements AWSCloudHSM {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudHSM.class);

    /**
     * List of exception unmarshallers for all AWSCloudHSM exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM.  A credentials provider chain will be used
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
    public AWSCloudHSMClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM.  A credentials provider chain will be used
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
     *                       client connects to AWSCloudHSM
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudHSMClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSCloudHSMClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSCloudHSM
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudHSMClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
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
     *                       client connects to AWSCloudHSM
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
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
     *                       client connects to AWSCloudHSM
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AWSCloudHSMClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new CloudHsmInternalExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudhsm.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudhsm/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudhsm/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

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
    public GetConfigResult getConfig(GetConfigRequest getConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfigRequest> request = null;
        Response<GetConfigResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfigRequestMarshaller().marshall(super.beforeMarshalling(getConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetConfigResult, JsonUnmarshallerContext> unmarshaller =
                new GetConfigResultJsonUnmarshaller();
            JsonResponseHandler<GetConfigResult> responseHandler =
                new JsonResponseHandler<GetConfigResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateHapgResult createHapg(CreateHapgRequest createHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(createHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHapgRequest> request = null;
        Response<CreateHapgResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHapgRequestMarshaller().marshall(super.beforeMarshalling(createHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateHapgResult, JsonUnmarshallerContext> unmarshaller =
                new CreateHapgResultJsonUnmarshaller();
            JsonResponseHandler<CreateHapgResult> responseHandler =
                new JsonResponseHandler<CreateHapgResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeHapgResult describeHapg(DescribeHapgRequest describeHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHapgRequest> request = null;
        Response<DescribeHapgResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHapgRequestMarshaller().marshall(super.beforeMarshalling(describeHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeHapgResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeHapgResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHapgResult> responseHandler =
                new JsonResponseHandler<DescribeHapgResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListAvailableZonesResult listAvailableZones(ListAvailableZonesRequest listAvailableZonesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAvailableZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableZonesRequest> request = null;
        Response<ListAvailableZonesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableZonesRequestMarshaller().marshall(super.beforeMarshalling(listAvailableZonesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListAvailableZonesResult, JsonUnmarshallerContext> unmarshaller =
                new ListAvailableZonesResultJsonUnmarshaller();
            JsonResponseHandler<ListAvailableZonesResult> responseHandler =
                new JsonResponseHandler<ListAvailableZonesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ModifyHsmResult modifyHsm(ModifyHsmRequest modifyHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyHsmRequest> request = null;
        Response<ModifyHsmResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyHsmRequestMarshaller().marshall(super.beforeMarshalling(modifyHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ModifyHsmResult, JsonUnmarshallerContext> unmarshaller =
                new ModifyHsmResultJsonUnmarshaller();
            JsonResponseHandler<ModifyHsmResult> responseHandler =
                new JsonResponseHandler<ModifyHsmResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListLunaClientsResult listLunaClients(ListLunaClientsRequest listLunaClientsRequest) {
        ExecutionContext executionContext = createExecutionContext(listLunaClientsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLunaClientsRequest> request = null;
        Response<ListLunaClientsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLunaClientsRequestMarshaller().marshall(super.beforeMarshalling(listLunaClientsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListLunaClientsResult, JsonUnmarshallerContext> unmarshaller =
                new ListLunaClientsResultJsonUnmarshaller();
            JsonResponseHandler<ListLunaClientsResult> responseHandler =
                new JsonResponseHandler<ListLunaClientsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListHapgsResult listHapgs(ListHapgsRequest listHapgsRequest) {
        ExecutionContext executionContext = createExecutionContext(listHapgsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHapgsRequest> request = null;
        Response<ListHapgsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHapgsRequestMarshaller().marshall(super.beforeMarshalling(listHapgsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListHapgsResult, JsonUnmarshallerContext> unmarshaller =
                new ListHapgsResultJsonUnmarshaller();
            JsonResponseHandler<ListHapgsResult> responseHandler =
                new JsonResponseHandler<ListHapgsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmRequest> request = null;
        Response<DeleteHsmResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmRequestMarshaller().marshall(super.beforeMarshalling(deleteHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteHsmResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteHsmResultJsonUnmarshaller();
            JsonResponseHandler<DeleteHsmResult> responseHandler =
                new JsonResponseHandler<DeleteHsmResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateHsmResult createHsm(CreateHsmRequest createHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(createHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmRequest> request = null;
        Response<CreateHsmResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmRequestMarshaller().marshall(super.beforeMarshalling(createHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateHsmResult, JsonUnmarshallerContext> unmarshaller =
                new CreateHsmResultJsonUnmarshaller();
            JsonResponseHandler<CreateHsmResult> responseHandler =
                new JsonResponseHandler<CreateHsmResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListHsmsResult listHsms(ListHsmsRequest listHsmsRequest) {
        ExecutionContext executionContext = createExecutionContext(listHsmsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHsmsRequest> request = null;
        Response<ListHsmsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHsmsRequestMarshaller().marshall(super.beforeMarshalling(listHsmsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ListHsmsResult, JsonUnmarshallerContext> unmarshaller =
                new ListHsmsResultJsonUnmarshaller();
            JsonResponseHandler<ListHsmsResult> responseHandler =
                new JsonResponseHandler<ListHsmsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeHsmResult describeHsm(DescribeHsmRequest describeHsmRequest) {
        ExecutionContext executionContext = createExecutionContext(describeHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmRequest> request = null;
        Response<DescribeHsmResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmRequestMarshaller().marshall(super.beforeMarshalling(describeHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeHsmResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeHsmResultJsonUnmarshaller();
            JsonResponseHandler<DescribeHsmResult> responseHandler =
                new JsonResponseHandler<DescribeHsmResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteHapgResult deleteHapg(DeleteHapgRequest deleteHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHapgRequest> request = null;
        Response<DeleteHapgResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHapgRequestMarshaller().marshall(super.beforeMarshalling(deleteHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteHapgResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteHapgResultJsonUnmarshaller();
            JsonResponseHandler<DeleteHapgResult> responseHandler =
                new JsonResponseHandler<DeleteHapgResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ModifyHapgResult modifyHapg(ModifyHapgRequest modifyHapgRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyHapgRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyHapgRequest> request = null;
        Response<ModifyHapgResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyHapgRequestMarshaller().marshall(super.beforeMarshalling(modifyHapgRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ModifyHapgResult, JsonUnmarshallerContext> unmarshaller =
                new ModifyHapgResultJsonUnmarshaller();
            JsonResponseHandler<ModifyHapgResult> responseHandler =
                new JsonResponseHandler<ModifyHapgResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public CreateLunaClientResult createLunaClient(CreateLunaClientRequest createLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(createLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLunaClientRequest> request = null;
        Response<CreateLunaClientResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLunaClientRequestMarshaller().marshall(super.beforeMarshalling(createLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateLunaClientResult, JsonUnmarshallerContext> unmarshaller =
                new CreateLunaClientResultJsonUnmarshaller();
            JsonResponseHandler<CreateLunaClientResult> responseHandler =
                new JsonResponseHandler<CreateLunaClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DeleteLunaClientResult deleteLunaClient(DeleteLunaClientRequest deleteLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLunaClientRequest> request = null;
        Response<DeleteLunaClientResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLunaClientRequestMarshaller().marshall(super.beforeMarshalling(deleteLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteLunaClientResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteLunaClientResultJsonUnmarshaller();
            JsonResponseHandler<DeleteLunaClientResult> responseHandler =
                new JsonResponseHandler<DeleteLunaClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ModifyLunaClientResult modifyLunaClient(ModifyLunaClientRequest modifyLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyLunaClientRequest> request = null;
        Response<ModifyLunaClientResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyLunaClientRequestMarshaller().marshall(super.beforeMarshalling(modifyLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<ModifyLunaClientResult, JsonUnmarshallerContext> unmarshaller =
                new ModifyLunaClientResultJsonUnmarshaller();
            JsonResponseHandler<ModifyLunaClientResult> responseHandler =
                new JsonResponseHandler<ModifyLunaClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public DescribeLunaClientResult describeLunaClient(DescribeLunaClientRequest describeLunaClientRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLunaClientRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLunaClientRequest> request = null;
        Response<DescribeLunaClientResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLunaClientRequestMarshaller().marshall(super.beforeMarshalling(describeLunaClientRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeLunaClientResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeLunaClientResultJsonUnmarshaller();
            JsonResponseHandler<DescribeLunaClientResult> responseHandler =
                new JsonResponseHandler<DescribeLunaClientResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

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
    public ListAvailableZonesResult listAvailableZones() throws AmazonServiceException, AmazonClientException {
        return listAvailableZones(new ListAvailableZonesRequest());
    }
    
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
    public ListLunaClientsResult listLunaClients() throws AmazonServiceException, AmazonClientException {
        return listLunaClients(new ListLunaClientsRequest());
    }
    
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
    public ListHapgsResult listHapgs() throws AmazonServiceException, AmazonClientException {
        return listHapgs(new ListHapgsRequest());
    }
    
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
    public ListHsmsResult listHsms() throws AmazonServiceException, AmazonClientException {
        return listHsms(new ListHsmsRequest());
    }
    
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
    public DescribeHsmResult describeHsm() throws AmazonServiceException, AmazonClientException {
        return describeHsm(new DescribeHsmRequest());
    }
    
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
    public DescribeLunaClientResult describeLunaClient() throws AmazonServiceException, AmazonClientException {
        return describeLunaClient(new DescribeLunaClientRequest());
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
        