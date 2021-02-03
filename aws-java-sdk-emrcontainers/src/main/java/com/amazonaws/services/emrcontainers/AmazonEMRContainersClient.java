/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.emrcontainers.AmazonEMRContainersClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.emrcontainers.model.*;
import com.amazonaws.services.emrcontainers.model.transform.*;

/**
 * Client for accessing Amazon EMR Containers. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Amazon EMR on EKS provides a deployment option for Amazon EMR that allows you to run open-source big data frameworks
 * on Amazon Elastic Kubernetes Service (Amazon EKS). With this deployment option, you can focus on running analytics
 * workloads while Amazon EMR on EKS builds, configures, and manages containers for open-source applications. For more
 * information about Amazon EMR on EKS concepts and tasks, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/emr-eks.html">What is Amazon EMR on EKS</a>.
 * </p>
 * <p>
 * <i>Amazon EMR containers</i> is the API name for Amazon EMR on EKS. The <code>emr-containers</code> prefix is used in
 * the following scenarios:
 * </p>
 * <ul>
 * <li>
 * <p>
 * It is the prefix in the CLI commands for Amazon EMR on EKS. For example,
 * <code>aws emr-containers start-job-run</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix before IAM policy actions for Amazon EMR on EKS. For example,
 * <code>"Action": [ "emr-containers:StartJobRun"]</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/security_iam_service-with-iam.html#security_iam_service-with-iam-id-based-policies-actions"
 * >Policy actions for Amazon EMR on EKS</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * It is the prefix used in Amazon EMR on EKS service endpoints. For example,
 * <code>emr-containers.us-east-2.amazonaws.com</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/emr/latest/EMR-on-EKS-DevelopmentGuide/service-quotas.html#service-endpoints"
 * >Amazon EMR on EKS Service Endpoints</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEMRContainersClient extends AmazonWebServiceClient implements AmazonEMRContainers {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonEMRContainers.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "emr-containers";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrcontainers.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrcontainers.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.emrcontainers.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.emrcontainers.model.AmazonEMRContainersException.class));

    public static AmazonEMRContainersClientBuilder builder() {
        return AmazonEMRContainersClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR Containers using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEMRContainersClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EMR Containers using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEMRContainersClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("emr-containers.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/emrcontainers/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/emrcontainers/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param cancelJobRunRequest
     * @return Result of the CancelJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CancelJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CancelJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelJobRunResult cancelJobRun(CancelJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeCancelJobRun(request);
    }

    @SdkInternalApi
    final CancelJobRunResult executeCancelJobRun(CancelJobRunRequest cancelJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelJobRunRequest> request = null;
        Response<CancelJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param createManagedEndpointRequest
     * @return Result of the CreateManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CreateManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateManagedEndpointResult createManagedEndpoint(CreateManagedEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateManagedEndpoint(request);
    }

    @SdkInternalApi
    final CreateManagedEndpointResult executeCreateManagedEndpoint(CreateManagedEndpointRequest createManagedEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createManagedEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateManagedEndpointRequest> request = null;
        Response<CreateManagedEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateManagedEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createManagedEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateManagedEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateManagedEndpointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateManagedEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param createVirtualClusterRequest
     * @return Result of the CreateVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.CreateVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVirtualClusterResult createVirtualCluster(CreateVirtualClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVirtualCluster(request);
    }

    @SdkInternalApi
    final CreateVirtualClusterResult executeCreateVirtualCluster(CreateVirtualClusterRequest createVirtualClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createVirtualClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualClusterRequest> request = null;
        Response<CreateVirtualClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVirtualClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVirtualCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVirtualClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVirtualClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a managed endpoint. A managed endpoint is a gateway that connects EMR Studio to Amazon EMR on EKS so that
     * EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param deleteManagedEndpointRequest
     * @return Result of the DeleteManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DeleteManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteManagedEndpointResult deleteManagedEndpoint(DeleteManagedEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteManagedEndpoint(request);
    }

    @SdkInternalApi
    final DeleteManagedEndpointResult executeDeleteManagedEndpoint(DeleteManagedEndpointRequest deleteManagedEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteManagedEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteManagedEndpointRequest> request = null;
        Response<DeleteManagedEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteManagedEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteManagedEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteManagedEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteManagedEndpointResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteManagedEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe,
     * list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual
     * cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same
     * way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param deleteVirtualClusterRequest
     * @return Result of the DeleteVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DeleteVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DeleteVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVirtualClusterResult deleteVirtualCluster(DeleteVirtualClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualCluster(request);
    }

    @SdkInternalApi
    final DeleteVirtualClusterResult executeDeleteVirtualCluster(DeleteVirtualClusterRequest deleteVirtualClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVirtualClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualClusterRequest> request = null;
        Response<DeleteVirtualClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVirtualClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVirtualClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVirtualClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script,
     * or SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param describeJobRunRequest
     * @return Result of the DescribeJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeJobRunResult describeJobRun(DescribeJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeJobRun(request);
    }

    @SdkInternalApi
    final DescribeJobRunResult executeDescribeJobRun(DescribeJobRunRequest describeJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(describeJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeJobRunRequest> request = null;
        Response<DescribeJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects EMR Studio
     * to Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param describeManagedEndpointRequest
     * @return Result of the DescribeManagedEndpoint operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeManagedEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeManagedEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeManagedEndpointResult describeManagedEndpoint(DescribeManagedEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeManagedEndpoint(request);
    }

    @SdkInternalApi
    final DescribeManagedEndpointResult executeDescribeManagedEndpoint(DescribeManagedEndpointRequest describeManagedEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(describeManagedEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeManagedEndpointRequest> request = null;
        Response<DescribeManagedEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeManagedEndpointRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeManagedEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeManagedEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeManagedEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeManagedEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon
     * EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional
     * resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship,
     * you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param describeVirtualClusterRequest
     * @return Result of the DescribeVirtualCluster operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.DescribeVirtualCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeVirtualCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVirtualClusterResult describeVirtualCluster(DescribeVirtualClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualCluster(request);
    }

    @SdkInternalApi
    final DescribeVirtualClusterResult executeDescribeVirtualCluster(DescribeVirtualClusterRequest describeVirtualClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualClusterRequest> request = null;
        Response<DescribeVirtualClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVirtualClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVirtualClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or
     * SparkSQL query, that you submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListJobRunsResult listJobRuns(ListJobRunsRequest request) {
        request = beforeClientExecution(request);
        return executeListJobRuns(request);
    }

    @SdkInternalApi
    final ListJobRunsResult executeListJobRuns(ListJobRunsRequest listJobRunsRequest) {

        ExecutionContext executionContext = createExecutionContext(listJobRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListJobRunsRequest> request = null;
        Response<ListJobRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListJobRunsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listJobRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListJobRuns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListJobRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListJobRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects EMR Studio to
     * Amazon EMR on EKS so that EMR Studio can communicate with your virtual cluster.
     * </p>
     * 
     * @param listManagedEndpointsRequest
     * @return Result of the ListManagedEndpoints operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListManagedEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListManagedEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListManagedEndpointsResult listManagedEndpoints(ListManagedEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListManagedEndpoints(request);
    }

    @SdkInternalApi
    final ListManagedEndpointsResult executeListManagedEndpoints(ListManagedEndpointsRequest listManagedEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listManagedEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListManagedEndpointsRequest> request = null;
        Response<ListManagedEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListManagedEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listManagedEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListManagedEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListManagedEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListManagedEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to the resources.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS.
     * You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your
     * system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model
     * virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
     * </p>
     * 
     * @param listVirtualClustersRequest
     * @return Result of the ListVirtualClusters operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.ListVirtualClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListVirtualClustersResult listVirtualClusters(ListVirtualClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualClusters(request);
    }

    @SdkInternalApi
    final ListVirtualClustersResult executeListVirtualClusters(ListVirtualClustersRequest listVirtualClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listVirtualClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualClustersRequest> request = null;
        Response<ListVirtualClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVirtualClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVirtualClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVirtualClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you
     * submit to Amazon EMR on EKS.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @sample AmazonEMRContainers.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartJobRunResult startJobRun(StartJobRunRequest request) {
        request = beforeClientExecution(request);
        return executeStartJobRun(request);
    }

    @SdkInternalApi
    final StartJobRunResult executeStartJobRun(StartJobRunRequest startJobRunRequest) {

        ExecutionContext executionContext = createExecutionContext(startJobRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartJobRunRequest> request = null;
        Response<StartJobRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartJobRunRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startJobRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartJobRun");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartJobRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartJobRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an
     * optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as
     * purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a
     * specific resource based on the tags you've assigned to it. For example, you can define a set of tags for your
     * Amazon EMR on EKS clusters to help you track each cluster's owner and stack level. We recommend that you devise a
     * consistent set of tag keys for each resource type. You can then search and filter the resources based on the tags
     * that you add.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from resources.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This is an internal server exception.
     * @throws ValidationException
     *         There are invalid parameters in the client request.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonEMRContainers.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EMR containers");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
