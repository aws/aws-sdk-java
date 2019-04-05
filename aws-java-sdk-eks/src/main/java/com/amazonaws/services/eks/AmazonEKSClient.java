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
package com.amazonaws.services.eks;

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

import com.amazonaws.services.eks.AmazonEKSClientBuilder;
import com.amazonaws.services.eks.waiters.AmazonEKSWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.eks.model.*;
import com.amazonaws.services.eks.model.transform.*;

/**
 * Client for accessing Amazon EKS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon Elastic Container Service for Kubernetes (Amazon EKS) is a managed service that makes it easy for you to run
 * Kubernetes on AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an
 * open-source system for automating the deployment, scaling, and management of containerized applications.
 * </p>
 * <p>
 * Amazon EKS runs up-to-date versions of the open-source Kubernetes software, so you can use all the existing plugins
 * and tooling from the Kubernetes community. Applications running on Amazon EKS are fully compatible with applications
 * running on any standard Kubernetes environment, whether running in on-premises data centers or public clouds. This
 * means that you can easily migrate any standard Kubernetes application to Amazon EKS without any code modification
 * required.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEKSClient extends AmazonWebServiceClient implements AmazonEKS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonEKS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "eks";

    private volatile AmazonEKSWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedAvailabilityZoneException").withModeledClass(
                                    com.amazonaws.services.eks.model.UnsupportedAvailabilityZoneException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.eks.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                                    com.amazonaws.services.eks.model.InvalidParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.eks.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withModeledClass(
                                    com.amazonaws.services.eks.model.InvalidRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.eks.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerException").withModeledClass(
                                    com.amazonaws.services.eks.model.ServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.eks.model.ResourceLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withModeledClass(
                                    com.amazonaws.services.eks.model.ClientException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.eks.model.AmazonEKSException.class));

    public static AmazonEKSClientBuilder builder() {
        return AmazonEKSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EKS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEKSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon EKS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonEKSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("eks.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/eks/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/eks/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Amazon EKS control plane.
     * </p>
     * <p>
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like
     * <code>etcd</code> and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API
     * is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and
     * unique, and runs on its own set of Amazon EC2 instances.
     * </p>
     * <p>
     * The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load
     * Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to
     * provide connectivity from the control plane instances to the worker nodes (for example, to support
     * <code>kubectl exec</code>, <code>logs</code>, and <code>proxy</code> data flows).
     * </p>
     * <p>
     * Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes
     * API server endpoint and a certificate file that is created for your cluster.
     * </p>
     * <p>
     * You can use the <code>endpointPublicAccess</code> and <code>endpointPrivateAccess</code> parameters to enable or
     * disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is
     * enabled and private access is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can use the <code>logging</code> parameter to enable or disable exporting the Kubernetes control plane logs
     * for your cluster to CloudWatch Logs. By default, cluster control plane logs are not exported to CloudWatch Logs.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS Cluster Control Plane
     * Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must
     * configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster.
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/managing-auth.html">Managing
     * Cluster Authentication</a> and <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-workers.html">Launching Amazon EKS Worker Nodes</a>
     * in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @throws UnsupportedAvailabilityZoneException
     *         At least one of your specified cluster subnets is in an Availability Zone that does not support Amazon
     *         EKS. The exception output specifies the supported Availability Zones for your account, from which you can
     *         choose subnets for your cluster.
     * @sample AmazonEKS.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final CreateClusterResult executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<CreateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Amazon EKS cluster control plane.
     * </p>
     * <note>
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a Cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final DeleteClusterResult executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<DeleteClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS cluster.
     * </p>
     * <p>
     * The API server endpoint and certificate authority data returned by this operation are required for
     * <code>kubelet</code> and <code>kubectl</code> to communicate with your Kubernetes API server. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/create-kubeconfig.html">Create a
     * kubeconfig for Amazon EKS</a>.
     * </p>
     * <note>
     * <p>
     * The API server endpoint and certificate authority data are not available until the cluster reaches the
     * <code>ACTIVE</code> state.
     * </p>
     * </note>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClusterResult describeCluster(DescribeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCluster(request);
    }

    @SdkInternalApi
    final DescribeClusterResult executeDescribeCluster(DescribeClusterRequest describeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterRequest> request = null;
        Response<DescribeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptive information about an update against your Amazon EKS cluster.
     * </p>
     * <p>
     * When the status of the update is <code>Succeeded</code>, the update is complete. If an update fails, the status
     * is <code>Failed</code>, and an error detail explains the reason for the failure.
     * </p>
     * 
     * @param describeUpdateRequest
     * @return Result of the DescribeUpdate operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @sample AmazonEKS.DescribeUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUpdateResult describeUpdate(DescribeUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUpdate(request);
    }

    @SdkInternalApi
    final DescribeUpdateResult executeDescribeUpdate(DescribeUpdateRequest describeUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUpdateRequest> request = null;
        Response<DescribeUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUpdateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        request = beforeClientExecution(request);
        return executeListClusters(request);
    }

    @SdkInternalApi
    final ListClustersResult executeListClusters(ListClustersRequest listClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(listClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListClustersRequest> request = null;
        Response<ListClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
     * </p>
     * 
     * @param listUpdatesRequest
     * @return Result of the ListUpdates operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @sample AmazonEKS.ListUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListUpdates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListUpdatesResult listUpdates(ListUpdatesRequest request) {
        request = beforeClientExecution(request);
        return executeListUpdates(request);
    }

    @SdkInternalApi
    final ListUpdatesResult executeListUpdates(ListUpdatesRequest listUpdatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListUpdatesRequest> request = null;
        Response<ListUpdatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListUpdatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listUpdatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListUpdates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListUpdatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListUpdatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
     * output includes an update ID that you can use to track the status of your cluster update with the
     * <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * You can use this API operation to enable or disable public and private access to your cluster's Kubernetes API
     * server endpoint. By default, public access is enabled and private access is disabled. For more information, see
     * <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     * Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can also use this API operation to enable or disable exporting the Kubernetes control plane logs for your
     * cluster to CloudWatch Logs. By default, cluster control plane logs are not exported to CloudWatch Logs. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html">Amazon EKS
     * Cluster Control Plane Logs</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For
     * more information, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
     * status moves to <code>UPDATING</code> (this status transition is eventually consistent). When the update is
     * complete (either <code>Failed</code> or <code>Successful</code>), the cluster status moves to <code>Active</code>
     * .
     * </p>
     * 
     * @param updateClusterConfigRequest
     * @return Result of the UpdateClusterConfig operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateClusterConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateClusterConfigResult updateClusterConfig(UpdateClusterConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClusterConfig(request);
    }

    @SdkInternalApi
    final UpdateClusterConfigResult executeUpdateClusterConfig(UpdateClusterConfigRequest updateClusterConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterConfigRequest> request = null;
        Response<UpdateClusterConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClusterConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateClusterConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClusterConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the
     * update. The response output includes an update ID that you can use to track the status of your cluster update
     * with the <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster
     * status moves to <code>UPDATING</code> (this status transition is eventually consistent). When the update is
     * complete (either <code>Failed</code> or <code>Successful</code>), the cluster status moves to <code>Active</code>
     * .
     * </p>
     * 
     * @param updateClusterVersionRequest
     * @return Result of the UpdateClusterVersion operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         Amazon EKS clusters are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateClusterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateClusterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateClusterVersionResult updateClusterVersion(UpdateClusterVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateClusterVersion(request);
    }

    @SdkInternalApi
    final UpdateClusterVersionResult executeUpdateClusterVersion(UpdateClusterVersionRequest updateClusterVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterVersionRequest> request = null;
        Response<UpdateClusterVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClusterVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateClusterVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClusterVersionResultJsonUnmarshaller());
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
    public AmazonEKSWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonEKSWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
