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
package com.amazonaws.services.dax;

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

import com.amazonaws.services.dax.AmazonDaxClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.dax.model.*;
import com.amazonaws.services.dax.model.transform.*;

/**
 * Client for accessing Amazon DAX. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * DAX is a managed caching service engineered for Amazon DynamoDB. DAX dramatically speeds up database reads by caching
 * frequently-accessed data from DynamoDB, so applications can access that data with sub-millisecond latency. You can
 * create a DAX cluster easily, using the AWS Management Console. With a few simple modifications to your code, your
 * application can begin taking advantage of the DAX cluster and realize significant improvements in read performance.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDaxClient extends AmazonWebServiceClient implements AmazonDax {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDax.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dax";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetQuotaExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetQuotaExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetGroupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupQuotaExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetGroupQuotaExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidVPCNetworkStateFault").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidVPCNetworkStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupAlreadyExistsFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ParameterGroupAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetInUse").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ClusterNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidParameterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NodeNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.NodeNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidParameterCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NodeQuotaForCustomerExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.NodeQuotaForCustomerExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClusterStateFault").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidClusterStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientClusterCapacityFault").withModeledClass(
                                    com.amazonaws.services.dax.model.InsufficientClusterCapacityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.TagNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidARNFault").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidARNException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagQuotaPerResourceExceeded").withModeledClass(
                                    com.amazonaws.services.dax.model.TagQuotaPerResourceExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterQuotaForCustomerExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ClusterQuotaForCustomerExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupInUseFault").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetGroupInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterGroupStateFault").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidParameterGroupStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ParameterGroupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnet").withModeledClass(
                                    com.amazonaws.services.dax.model.InvalidSubnetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterAlreadyExistsFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ClusterAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLinkedRoleNotFoundFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ServiceLinkedRoleNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NodeQuotaForClusterExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.NodeQuotaForClusterExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupQuotaExceededFault").withModeledClass(
                                    com.amazonaws.services.dax.model.ParameterGroupQuotaExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupAlreadyExistsFault").withModeledClass(
                                    com.amazonaws.services.dax.model.SubnetGroupAlreadyExistsException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.dax.model.AmazonDaxException.class));

    public static AmazonDaxClientBuilder builder() {
        return AmazonDaxClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DAX using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDaxClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DAX using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDaxClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("dax.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/dax/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/dax/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     *         You already have a DAX cluster with the given identifier.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws InsufficientClusterCapacityException
     *         There are not enough system resources to create the cluster you requested (or to resize an
     *         already-existing cluster).
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ClusterQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of DAX clusters for your AWS account.
     * @throws NodeQuotaForClusterExceededException
     *         You have attempted to exceed the maximum number of nodes for a DAX cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of nodes for your AWS account.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         You have exceeded the maximum number of tags for this DAX cluster.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
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
     * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
     * in a DAX cluster.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return Result of the CreateParameterGroup operation returned by the service.
     * @throws ParameterGroupQuotaExceededException
     *         You have attempted to exceed the maximum number of parameter groups.
     * @throws ParameterGroupAlreadyExistsException
     *         The specified parameter group already exists.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateParameterGroupResult createParameterGroup(CreateParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateParameterGroup(request);
    }

    @SdkInternalApi
    final CreateParameterGroupResult executeCreateParameterGroup(CreateParameterGroupRequest createParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateParameterGroupRequest> request = null;
        Response<CreateParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateParameterGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateParameterGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateParameterGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new subnet group.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @return Result of the CreateSubnetGroup operation returned by the service.
     * @throws SubnetGroupAlreadyExistsException
     *         The specified subnet group already exists.
     * @throws SubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws SubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSubnetGroupResult createSubnetGroup(CreateSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSubnetGroup(request);
    }

    @SdkInternalApi
    final CreateSubnetGroupResult executeCreateSubnetGroup(CreateSubnetGroupRequest createSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSubnetGroupRequest> request = null;
        Response<CreateSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSubnetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes one or more nodes from a DAX cluster.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>DecreaseReplicationFactor</code> to remove the last node in a DAX cluster. If you need to do
     * this, use <code>DeleteCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param decreaseReplicationFactorRequest
     * @return Result of the DecreaseReplicationFactor operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws NodeNotFoundException
     *         None of the nodes in the cluster have the given node ID.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DecreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DecreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DecreaseReplicationFactorResult decreaseReplicationFactor(DecreaseReplicationFactorRequest request) {
        request = beforeClientExecution(request);
        return executeDecreaseReplicationFactor(request);
    }

    @SdkInternalApi
    final DecreaseReplicationFactorResult executeDecreaseReplicationFactor(DecreaseReplicationFactorRequest decreaseReplicationFactorRequest) {

        ExecutionContext executionContext = createExecutionContext(decreaseReplicationFactorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecreaseReplicationFactorRequest> request = null;
        Response<DecreaseReplicationFactorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecreaseReplicationFactorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(decreaseReplicationFactorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DecreaseReplicationFactor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DecreaseReplicationFactorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DecreaseReplicationFactorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned DAX cluster. <i>DeleteCluster</i> deletes all associated nodes, node endpoints
     * and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
     * deleting the cluster; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
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
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
     * clusters.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return Result of the DeleteParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteParameterGroupResult deleteParameterGroup(DeleteParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteParameterGroup(request);
    }

    @SdkInternalApi
    final DeleteParameterGroupResult executeDeleteParameterGroup(DeleteParameterGroupRequest deleteParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteParameterGroupRequest> request = null;
        Response<DeleteParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteParameterGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteParameterGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteParameterGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a subnet group if it is associated with any DAX clusters.
     * </p>
     * </note>
     * 
     * @param deleteSubnetGroupRequest
     * @return Result of the DeleteSubnetGroup operation returned by the service.
     * @throws SubnetGroupInUseException
     *         The specified subnet group is currently in use.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSubnetGroupResult deleteSubnetGroup(DeleteSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSubnetGroup(request);
    }

    @SdkInternalApi
    final DeleteSubnetGroupResult executeDeleteSubnetGroup(DeleteSubnetGroupRequest deleteSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSubnetGroupRequest> request = null;
        Response<DeleteSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSubnetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific
     * DAX cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes
     * are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information will be displayed.
     * </p>
     * <p>
     * If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the
     * additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusters(request);
    }

    @SdkInternalApi
    final DescribeClustersResult executeDescribeClusters(DescribeClustersRequest describeClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeClustersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeClustersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the default system parameter information for the DAX caching software.
     * </p>
     * 
     * @param describeDefaultParametersRequest
     * @return Result of the DescribeDefaultParameters operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeDefaultParameters" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDefaultParametersResult describeDefaultParameters(DescribeDefaultParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDefaultParameters(request);
    }

    @SdkInternalApi
    final DescribeDefaultParametersResult executeDescribeDefaultParameters(DescribeDefaultParametersRequest describeDefaultParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultParametersRequest> request = null;
        Response<DescribeDefaultParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDefaultParametersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDefaultParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDefaultParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDefaultParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDefaultParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
     * cluster or parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
     * only the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return Result of the DescribeParameterGroups operation returned by the service.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeParameterGroupsResult describeParameterGroups(DescribeParameterGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeParameterGroups(request);
    }

    @SdkInternalApi
    final DescribeParameterGroupsResult executeDescribeParameterGroups(DescribeParameterGroupsRequest describeParameterGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeParameterGroupsRequest> request = null;
        Response<DescribeParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeParameterGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeParameterGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeParameterGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeParameterGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeParametersResult describeParameters(DescribeParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeParameters(request);
    }

    @SdkInternalApi
    final DescribeParametersResult executeDescribeParameters(DescribeParametersRequest describeParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeParametersRequest> request = null;
        Response<DescribeParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeParametersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return Result of the DescribeSubnetGroups operation returned by the service.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSubnetGroupsResult describeSubnetGroups(DescribeSubnetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSubnetGroups(request);
    }

    @SdkInternalApi
    final DescribeSubnetGroupsResult executeDescribeSubnetGroups(DescribeSubnetGroupsRequest describeSubnetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSubnetGroupsRequest> request = null;
        Response<DescribeSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSubnetGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSubnetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSubnetGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSubnetGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more nodes to a DAX cluster.
     * </p>
     * 
     * @param increaseReplicationFactorRequest
     * @return Result of the IncreaseReplicationFactor operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws InsufficientClusterCapacityException
     *         There are not enough system resources to create the cluster you requested (or to resize an
     *         already-existing cluster).
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws NodeQuotaForClusterExceededException
     *         You have attempted to exceed the maximum number of nodes for a DAX cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of nodes for your AWS account.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.IncreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/IncreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public IncreaseReplicationFactorResult increaseReplicationFactor(IncreaseReplicationFactorRequest request) {
        request = beforeClientExecution(request);
        return executeIncreaseReplicationFactor(request);
    }

    @SdkInternalApi
    final IncreaseReplicationFactorResult executeIncreaseReplicationFactor(IncreaseReplicationFactorRequest increaseReplicationFactorRequest) {

        ExecutionContext executionContext = createExecutionContext(increaseReplicationFactorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IncreaseReplicationFactorRequest> request = null;
        Response<IncreaseReplicationFactorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IncreaseReplicationFactorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(increaseReplicationFactorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IncreaseReplicationFactor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IncreaseReplicationFactorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new IncreaseReplicationFactorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all of the tags for a DAX cluster. You can call <code>ListTags</code> up to 10 times per second, per
     * account.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
     * node status is set to REBOOTING.
     * </p>
     * 
     * @param rebootNodeRequest
     * @return Result of the RebootNode operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws NodeNotFoundException
     *         None of the nodes in the cluster have the given node ID.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.RebootNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/RebootNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RebootNodeResult rebootNode(RebootNodeRequest request) {
        request = beforeClientExecution(request);
        return executeRebootNode(request);
    }

    @SdkInternalApi
    final RebootNodeResult executeRebootNode(RebootNodeRequest rebootNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootNodeRequest> request = null;
        Response<RebootNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootNodeResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a set of tags with a DAX resource. You can call <code>TagResource</code> up to 5 times per second, per
     * account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws TagQuotaPerResourceExceededException
     *         You have exceeded the maximum number of tags for this DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
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
     * Removes the association of tags from a DAX resource. You can call <code>UntagResource</code> up to 5 times per
     * second, per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws TagNotFoundException
     *         The tag does not exist.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
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
     * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateClusterResult updateCluster(UpdateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCluster(request);
    }

    @SdkInternalApi
    final UpdateClusterResult executeUpdateCluster(UpdateClusterRequest updateClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateClusterRequest> request = null;
        Response<UpdateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return Result of the UpdateParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateParameterGroup(request);
    }

    @SdkInternalApi
    final UpdateParameterGroupResult executeUpdateParameterGroup(UpdateParameterGroupRequest updateParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateParameterGroupRequest> request = null;
        Response<UpdateParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateParameterGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateParameterGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateParameterGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing subnet group.
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return Result of the UpdateSubnetGroup operation returned by the service.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws SubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSubnetGroupResult updateSubnetGroup(UpdateSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubnetGroup(request);
    }

    @SdkInternalApi
    final UpdateSubnetGroupResult executeUpdateSubnetGroup(UpdateSubnetGroupRequest updateSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubnetGroupRequest> request = null;
        Response<UpdateSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubnetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "DAX");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubnetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSubnetGroupResultJsonUnmarshaller());
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

}
