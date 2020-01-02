/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Elastic Kubernetes Service (Amazon EKS) is a managed service that makes it easy for you to run Kubernetes on
 * AWS without needing to stand up or maintain your own Kubernetes control plane. Kubernetes is an open-source system
 * for automating the deployment, scaling, and management of containerized applications.
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
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedAvailabilityZoneException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.UnsupportedAvailabilityZoneExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClientException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ClientExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ServiceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.ResourceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.eks.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
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
     * The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as
     * <code>etcd</code> and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API
     * is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and
     * unique and runs on its own set of Amazon EC2 instances.
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
     * enabled, and private access is disabled. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint Access
     * Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <p>
     * You can use the <code>logging</code> parameter to enable or disable exporting the Kubernetes control plane logs
     * for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs.
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
     * Creates an AWS Fargate profile for your Amazon EKS cluster. You must have at least one Fargate profile in a
     * cluster to be able to run pods on Fargate.
     * </p>
     * <p>
     * The Fargate profile allows an administrator to declare which pods run on Fargate and specify which pods run on
     * which Fargate profile. This declaration is done through the profile’s selectors. Each profile can have up to five
     * selectors that contain a namespace and labels. A namespace is required for every selector. The label field
     * consists of multiple optional key-value pairs. Pods that match the selectors are scheduled on Fargate. If a
     * to-be-scheduled pod matches any of the selectors in the Fargate profile, then that pod is run on Fargate.
     * </p>
     * <p>
     * When you create a Fargate profile, you must specify a pod execution role to use with the pods that are scheduled
     * with the profile. This role is added to the cluster's Kubernetes <a
     * href="https://kubernetes.io/docs/admin/authorization/rbac/">Role Based Access Control</a> (RBAC) for
     * authorization so that the <code>kubelet</code> that is running on the Fargate infrastructure can register with
     * your Amazon EKS cluster so that it can appear in your cluster as a node. The pod execution role also provides IAM
     * permissions to the Fargate infrastructure to allow read access to Amazon ECR image repositories. For more
     * information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html">Pod Execution
     * Role</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * Fargate profiles are immutable. However, you can create a new updated profile to replace an existing profile and
     * then delete the original after the updated profile has finished creating.
     * </p>
     * <p>
     * If any Fargate profiles in a cluster are in the <code>DELETING</code> status, you must wait for that Fargate
     * profile to finish deleting before you can create any other profiles in that cluster.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html">AWS
     * Fargate Profile</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createFargateProfileRequest
     * @return Result of the CreateFargateProfile operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws UnsupportedAvailabilityZoneException
     *         At least one of your specified cluster subnets is in an Availability Zone that does not support Amazon
     *         EKS. The exception output specifies the supported Availability Zones for your account, from which you can
     *         choose subnets for your cluster.
     * @sample AmazonEKS.CreateFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFargateProfileResult createFargateProfile(CreateFargateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFargateProfile(request);
    }

    @SdkInternalApi
    final CreateFargateProfileResult executeCreateFargateProfile(CreateFargateProfileRequest createFargateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createFargateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFargateProfileRequest> request = null;
        Response<CreateFargateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFargateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFargateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFargateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFargateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFargateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a managed worker node group for an Amazon EKS cluster. You can only create a node group for your cluster
     * that is equal to the current Kubernetes version for the cluster. All node groups are created with the latest AMI
     * release version for the respective minor Kubernetes version of the cluster.
     * </p>
     * <p>
     * An Amazon EKS managed node group is an Amazon EC2 Auto Scaling group and associated Amazon EC2 instances that are
     * managed by AWS for an Amazon EKS cluster. Each node group uses a version of the Amazon EKS-optimized Amazon Linux
     * 2 AMI. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html">Managed Node Groups</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param createNodegroupRequest
     * @return Result of the CreateNodegroup operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceLimitExceededException
     *         You have encountered a service limit on the specified resource.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
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
     * @sample AmazonEKS.CreateNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/CreateNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateNodegroupResult createNodegroup(CreateNodegroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateNodegroup(request);
    }

    @SdkInternalApi
    final CreateNodegroupResult executeCreateNodegroup(CreateNodegroupRequest createNodegroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createNodegroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateNodegroupRequest> request = null;
        Response<CreateNodegroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateNodegroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createNodegroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateNodegroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateNodegroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateNodegroupResultJsonUnmarshaller());
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
     * <p>
     * If you have active services in your cluster that are associated with a load balancer, you must delete those
     * services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have
     * orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/delete-cluster.html">Deleting a Cluster</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * If you have managed node groups or Fargate profiles attached to the cluster, you must delete them first. For more
     * information, see <a>DeleteNodegroup</a> and<a>DeleteFargateProfile</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Deletes an AWS Fargate profile.
     * </p>
     * <p>
     * When you delete a Fargate profile, any pods running on Fargate that were created with the profile are deleted. If
     * those pods match another Fargate profile, then they are scheduled on Fargate with that profile. If they no longer
     * match any Fargate profiles, then they are not scheduled on Fargate and they may remain in a pending state.
     * </p>
     * <p>
     * Only one Fargate profile in a cluster can be in the <code>DELETING</code> status at a time. You must wait for a
     * Fargate profile to finish deleting before you can delete any other profiles in that cluster.
     * </p>
     * 
     * @param deleteFargateProfileRequest
     * @return Result of the DeleteFargateProfile operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.DeleteFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFargateProfileResult deleteFargateProfile(DeleteFargateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFargateProfile(request);
    }

    @SdkInternalApi
    final DeleteFargateProfileResult executeDeleteFargateProfile(DeleteFargateProfileRequest deleteFargateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFargateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFargateProfileRequest> request = null;
        Response<DeleteFargateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFargateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFargateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFargateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFargateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFargateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon EKS node group for a cluster.
     * </p>
     * 
     * @param deleteNodegroupRequest
     * @return Result of the DeleteNodegroup operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * @sample AmazonEKS.DeleteNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DeleteNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteNodegroupResult deleteNodegroup(DeleteNodegroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNodegroup(request);
    }

    @SdkInternalApi
    final DeleteNodegroupResult executeDeleteNodegroup(DeleteNodegroupRequest deleteNodegroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNodegroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNodegroupRequest> request = null;
        Response<DeleteNodegroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNodegroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteNodegroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNodegroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteNodegroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteNodegroupResultJsonUnmarshaller());
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
     * The API server endpoint and certificate authority data aren't available until the cluster reaches the
     * <code>ACTIVE</code> state.
     * </p>
     * </note>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Returns descriptive information about an AWS Fargate profile.
     * </p>
     * 
     * @param describeFargateProfileRequest
     * @return Result of the DescribeFargateProfile operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.DescribeFargateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeFargateProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFargateProfileResult describeFargateProfile(DescribeFargateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFargateProfile(request);
    }

    @SdkInternalApi
    final DescribeFargateProfileResult executeDescribeFargateProfile(DescribeFargateProfileRequest describeFargateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFargateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFargateProfileRequest> request = null;
        Response<DescribeFargateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFargateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFargateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFargateProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFargateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFargateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptive information about an Amazon EKS node group.
     * </p>
     * 
     * @param describeNodegroupRequest
     * @return Result of the DescribeNodegroup operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonEKS.DescribeNodegroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeNodegroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeNodegroupResult describeNodegroup(DescribeNodegroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNodegroup(request);
    }

    @SdkInternalApi
    final DescribeNodegroupResult executeDescribeNodegroup(DescribeNodegroupRequest describeNodegroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNodegroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNodegroupRequest> request = null;
        Response<DescribeNodegroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNodegroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeNodegroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNodegroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNodegroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeNodegroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptive information about an update against your Amazon EKS cluster or associated managed node group.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Lists the AWS Fargate profiles associated with the specified cluster in your AWS account in the specified Region.
     * </p>
     * 
     * @param listFargateProfilesRequest
     * @return Result of the ListFargateProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available parameters for the API request.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws ClientException
     *         These errors are usually caused by a client action. Actions can include using an action or resource on
     *         behalf of a user that doesn't have permissions to use the action or resource or specifying an identifier
     *         that is not valid.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonEKS.ListFargateProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListFargateProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListFargateProfilesResult listFargateProfiles(ListFargateProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListFargateProfiles(request);
    }

    @SdkInternalApi
    final ListFargateProfilesResult executeListFargateProfiles(ListFargateProfilesRequest listFargateProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFargateProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFargateProfilesRequest> request = null;
        Response<ListFargateProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFargateProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFargateProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFargateProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFargateProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFargateProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Amazon EKS node groups associated with the specified cluster in your AWS account in the specified
     * Region.
     * </p>
     * 
     * @param listNodegroupsRequest
     * @return Result of the ListNodegroups operation returned by the service.
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
     * @throws ResourceNotFoundException
     *         The specified resource could not be found. You can view your available clusters with <a>ListClusters</a>.
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @sample AmazonEKS.ListNodegroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListNodegroupsResult listNodegroups(ListNodegroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListNodegroups(request);
    }

    @SdkInternalApi
    final ListNodegroupsResult executeListNodegroups(ListNodegroupsRequest listNodegroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNodegroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNodegroupsRequest> request = null;
        Response<ListNodegroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNodegroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNodegroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNodegroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNodegroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNodegroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags for an Amazon EKS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
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
     * Lists the updates associated with an Amazon EKS cluster or managed node group in your AWS account, in the
     * specified Region.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are deleted as well. Tags that you create for Amazon EKS resources do not propagate
     * to any other resources associated with the cluster. For example, if you tag a cluster with this operation, that
     * tag does not automatically propagate to the subnets and worker nodes associated with the cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         This exception is thrown if the request contains a semantic error. The precise meaning will depend on the
     *         API, and will be documented in the error message.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonEKS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
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
     * <p>
     * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response
     * output includes an update ID that you can use to track the status of your cluster update with the
     * <a>DescribeUpdate</a> API operation.
     * </p>
     * <p>
     * You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster
     * to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more
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
     * You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes
     * API server endpoint. By default, public access is enabled, and private access is disabled. For more information,
     * see <a href="https://docs.aws.amazon.com/eks/latest/userguide/cluster-endpoint.html">Amazon EKS Cluster Endpoint
     * Access Control</a> in the <i> <i>Amazon EKS User Guide</i> </i>.
     * </p>
     * <important>
     * <p>
     * At this time, you can not update the subnets or security group IDs for an existing cluster.
     * </p>
     * </important>
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * <p>
     * If your cluster has managed node groups attached to it, all of your node groups’ Kubernetes versions must match
     * the cluster’s Kubernetes version in order to update the cluster to a new Kubernetes version.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
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
     * <p>
     * Updates an Amazon EKS managed node group configuration. Your node group continues to function during the update.
     * The response output includes an update ID that you can use to track the status of your node group update with the
     * <a>DescribeUpdate</a> API operation. Currently you can update the Kubernetes labels for a node group or the
     * scaling configuration.
     * </p>
     * 
     * @param updateNodegroupConfigRequest
     * @return Result of the UpdateNodegroupConfig operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateNodegroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupConfig" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateNodegroupConfigResult updateNodegroupConfig(UpdateNodegroupConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNodegroupConfig(request);
    }

    @SdkInternalApi
    final UpdateNodegroupConfigResult executeUpdateNodegroupConfig(UpdateNodegroupConfigRequest updateNodegroupConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNodegroupConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNodegroupConfigRequest> request = null;
        Response<UpdateNodegroupConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNodegroupConfigRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNodegroupConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNodegroupConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNodegroupConfigResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateNodegroupConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Kubernetes version or AMI version of an Amazon EKS managed node group.
     * </p>
     * <p>
     * You can update to the latest available AMI version of a node group's current Kubernetes version by not specifying
     * a Kubernetes version in the request. You can update to the latest AMI version of your cluster's current
     * Kubernetes version by specifying your cluster's Kubernetes version in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/eks-linux-ami-versions.html">Amazon EKS-Optimized Linux
     * AMI Versions</a> in the <i>Amazon EKS User Guide</i>.
     * </p>
     * <p>
     * You cannot roll back a node group to an earlier Kubernetes version or AMI version.
     * </p>
     * <p>
     * When a node in a managed node group is terminated due to a scaling action or update, the pods in that node are
     * drained first. Amazon EKS attempts to drain the nodes gracefully and will fail if it is unable to do so. You can
     * <code>force</code> the update if Amazon EKS is unable to drain the nodes as a result of a pod disruption budget
     * issue.
     * </p>
     * 
     * @param updateNodegroupVersionRequest
     * @return Result of the UpdateNodegroupVersion operation returned by the service.
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
     *         You can view your available managed node groups with <a>ListNodegroups</a>. Amazon EKS clusters and node
     *         groups are Region-specific.
     * @throws InvalidRequestException
     *         The request is invalid given the state of the cluster. Check the state of the cluster and the associated
     *         operations.
     * @sample AmazonEKS.UpdateNodegroupVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/UpdateNodegroupVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateNodegroupVersionResult updateNodegroupVersion(UpdateNodegroupVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNodegroupVersion(request);
    }

    @SdkInternalApi
    final UpdateNodegroupVersionResult executeUpdateNodegroupVersion(UpdateNodegroupVersionRequest updateNodegroupVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNodegroupVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNodegroupVersionRequest> request = null;
        Response<UpdateNodegroupVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNodegroupVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateNodegroupVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "EKS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNodegroupVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNodegroupVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNodegroupVersionResultJsonUnmarshaller());
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
