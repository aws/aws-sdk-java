/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb;

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

import com.amazonaws.services.memorydb.AmazonMemoryDBClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.services.memorydb.model.transform.*;

/**
 * Client for accessing Amazon MemoryDB. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * MemoryDB for Redis is a fully managed, Redis-compatible, in-memory database that delivers ultra-fast performance and
 * Multi-AZ durability for modern applications built using microservices architectures. MemoryDB stores the entire
 * database in-memory, enabling low latency and high throughput data access. It is compatible with Redis, a popular open
 * source data store, enabling you to leverage Redis’ flexible and friendly data structures, APIs, and commands.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMemoryDBClient extends AmazonWebServiceClient implements AmazonMemoryDB {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMemoryDB.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "memorydb";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetGroupNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetGroupQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ParameterGroupAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetInUse").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReservedNodesOfferingNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ReservedNodesOfferingNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidParameterValueExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SnapshotAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SnapshotAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ACLAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ACLAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ACLQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ACLQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SnapshotQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SnapshotQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidACLStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidACLStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TestFailoverNotAvailableFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.TestFailoverNotAvailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DefaultUserRequired").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.DefaultUserRequiredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NodeQuotaForCustomerExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.NodeQuotaForCustomerExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.UserAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateUserNameFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.DuplicateUserNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetNotAllowedFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetNotAllowedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.TagNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterQuotaForCustomerExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ClusterQuotaForCustomerExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterGroupStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidParameterGroupStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ParameterGroupNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLinkedRoleNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ServiceLinkedRoleNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NodeQuotaForClusterExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.NodeQuotaForClusterExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterGroupQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ParameterGroupQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUpdateNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ServiceUpdateNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.UserNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidVPCNetworkStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidVPCNetworkStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReservedNodeQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ReservedNodeQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ACLNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ACLNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ClusterNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSnapshotStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidSnapshotStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNodeStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidNodeStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("APICallRateForCustomerExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.APICallRateForCustomerExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ShardsPerClusterQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ShardsPerClusterQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKMSKeyFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidKMSKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCredentialsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidCredentialsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReservedNodeAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ReservedNodeAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ReservedNodeNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ReservedNodeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidParameterCombinationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUserStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidUserStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SnapshotNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SnapshotNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidClusterStateFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidClusterStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientClusterCapacityFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InsufficientClusterCapacityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UserQuotaExceededFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.UserQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidARNFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidARNExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagQuotaPerResourceExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.TagQuotaPerResourceExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupInUseFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetGroupInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSubnet").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.InvalidSubnetExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ClusterAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ClusterAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoOperationFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.NoOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ShardNotFoundFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.ShardNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubnetGroupAlreadyExistsFault").withExceptionUnmarshaller(
                                    com.amazonaws.services.memorydb.model.transform.SubnetGroupAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.memorydb.model.AmazonMemoryDBException.class));

    public static AmazonMemoryDBClientBuilder builder() {
        return AmazonMemoryDBClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon MemoryDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMemoryDBClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon MemoryDB using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonMemoryDBClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("memory-db.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/memorydb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/memorydb/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Apply the service update to a list of clusters supplied. For more information on service updates and applying
     * them, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/managing-updates.html#applying-updates">Applying the
     * service updates</a>.
     * </p>
     * 
     * @param batchUpdateClusterRequest
     * @return Result of the BatchUpdateCluster operation returned by the service.
     * @throws ServiceUpdateNotFoundException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.BatchUpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public BatchUpdateClusterResult batchUpdateCluster(BatchUpdateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeBatchUpdateCluster(request);
    }

    @SdkInternalApi
    final BatchUpdateClusterResult executeBatchUpdateCluster(BatchUpdateClusterRequest batchUpdateClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(batchUpdateClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchUpdateClusterRequest> request = null;
        Response<BatchUpdateClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchUpdateClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchUpdateClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchUpdateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchUpdateClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchUpdateClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Makes a copy of an existing snapshot.
     * </p>
     * 
     * @param copySnapshotRequest
     * @return Result of the CopySnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     * @throws SnapshotNotFoundException
     * @throws SnapshotQuotaExceededException
     * @throws InvalidSnapshotStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CopySnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CopySnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopySnapshotResult copySnapshot(CopySnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopySnapshot(request);
    }

    @SdkInternalApi
    final CopySnapshotResult executeCopySnapshot(CopySnapshotRequest copySnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copySnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopySnapshotRequest> request = null;
        Response<CopySnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopySnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copySnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopySnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopySnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopySnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Access Control List. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createACLRequest
     * @return Result of the CreateACL operation returned by the service.
     * @throws UserNotFoundException
     * @throws DuplicateUserNameException
     * @throws ACLAlreadyExistsException
     * @throws DefaultUserRequiredException
     * @throws ACLQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateACLResult createACL(CreateACLRequest request) {
        request = beforeClientExecution(request);
        return executeCreateACL(request);
    }

    @SdkInternalApi
    final CreateACLResult executeCreateACL(CreateACLRequest createACLRequest) {

        ExecutionContext executionContext = createExecutionContext(createACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateACLRequest> request = null;
        Response<CreateACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateACLResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a cluster. All nodes in the cluster run the same protocol-compliant engine software.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     * @throws SubnetGroupNotFoundException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws NodeQuotaForClusterExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws ParameterGroupNotFoundException
     * @throws InsufficientClusterCapacityException
     * @throws InvalidVPCNetworkStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws ShardsPerClusterQuotaExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws InvalidCredentialsException
     * @throws TagQuotaPerResourceExceededException
     * @throws ACLNotFoundException
     * @throws InvalidACLStateException
     * @sample AmazonMemoryDB.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Creates a new MemoryDB parameter group. A parameter group is a collection of parameters and their values that are
     * applied to all of the nodes in any cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/parametergroups.html">Configuring engine parameters
     * using parameter groups</a>.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return Result of the CreateParameterGroup operation returned by the service.
     * @throws ParameterGroupQuotaExceededException
     * @throws ParameterGroupAlreadyExistsException
     * @throws InvalidParameterGroupStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateParameterGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Creates a copy of an entire cluster at a specific moment in time.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws SnapshotAlreadyExistsException
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotQuotaExceededException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final CreateSnapshotResult executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a subnet group. A subnet group is a collection of subnets (typically private) that you can designate for
     * your clusters running in an Amazon Virtual Private Cloud (VPC) environment. When you create a cluster in an
     * Amazon VPC, you must specify a subnet group. MemoryDB uses that subnet group to choose a subnet and IP addresses
     * within that subnet to associate with your nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/subnetgroups.html">Subnets and subnet groups</a>.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @return Result of the CreateSubnetGroup operation returned by the service.
     * @throws SubnetGroupAlreadyExistsException
     * @throws SubnetGroupQuotaExceededException
     * @throws SubnetQuotaExceededException
     * @throws InvalidSubnetException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws SubnetNotAllowedException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateSubnetGroup" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Creates a MemoryDB user. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws UserAlreadyExistsException
     * @throws UserQuotaExceededException
     * @throws DuplicateUserNameException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @throws TagQuotaPerResourceExceededException
     * @sample AmazonMemoryDB.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Access Control List. The ACL must first be disassociated from the cluster before it can be deleted.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/clusters.acls.html">Authenticating users with Access
     * Contol Lists (ACLs)</a>.
     * </p>
     * 
     * @param deleteACLRequest
     * @return Result of the DeleteACL operation returned by the service.
     * @throws ACLNotFoundException
     * @throws InvalidACLStateException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.DeleteACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteACLResult deleteACL(DeleteACLRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteACL(request);
    }

    @SdkInternalApi
    final DeleteACLResult executeDeleteACL(DeleteACLRequest deleteACLRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteACLRequest> request = null;
        Response<DeleteACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteACLResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cluster. It also deletes all associated nodes and node endpoints
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotAlreadyExistsException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any clusters.
     * You cannot delete the default parameter groups in your account.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return Result of the DeleteParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteParameterGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Deletes an existing snapshot. When you receive a successful response from this operation, MemoryDB immediately
     * begins deleting the snapshot; you cannot cancel or revert this operation.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws SnapshotNotFoundException
     * @throws InvalidSnapshotStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshot(request);
    }

    @SdkInternalApi
    final DeleteSnapshotResult executeDeleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a subnet group. You cannot delete a default subnet group or one that is associated with any clusters.
     * </p>
     * 
     * @param deleteSubnetGroupRequest
     * @return Result of the DeleteSubnetGroup operation returned by the service.
     * @throws SubnetGroupInUseException
     * @throws SubnetGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteSubnetGroup" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Deletes a user. The user will be removed from all ACLs and in turn removed from all clusters.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws InvalidUserStateException
     * @throws UserNotFoundException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of ACLs
     * </p>
     * 
     * @param describeACLsRequest
     * @return Result of the DescribeACLs operation returned by the service.
     * @throws ACLNotFoundException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeACLs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeACLsResult describeACLs(DescribeACLsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeACLs(request);
    }

    @SdkInternalApi
    final DescribeACLsResult executeDescribeACLs(DescribeACLsRequest describeACLsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeACLsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeACLsRequest> request = null;
        Response<DescribeACLsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeACLsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeACLsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeACLs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeACLsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeACLsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all provisioned clusters if no cluster identifier is specified, or about a specific
     * cluster if a cluster name is supplied.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeClusters" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Returns a list of the available Redis engine versions.
     * </p>
     * 
     * @param describeEngineVersionsRequest
     * @return Result of the DescribeEngineVersions operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEngineVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEngineVersionsResult describeEngineVersions(DescribeEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngineVersions(request);
    }

    @SdkInternalApi
    final DescribeEngineVersionsResult executeDescribeEngineVersions(DescribeEngineVersionsRequest describeEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineVersionsRequest> request = null;
        Response<DescribeEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEngineVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEngineVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns events related to clusters, security groups, and parameter groups. You can obtain events specific to a
     * particular cluster, security group, or parameter group by providing the name as a parameter. By default, only the
     * events occurring within the last hour are returned; however, you can retrieve up to 14 days' worth of events if
     * necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeEvents" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list contains only
     * the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return Result of the DescribeParameterGroups operation returned by the service.
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameterGroups"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeParameters" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Returns information about reserved nodes for this account, or about a specified reserved node.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return Result of the DescribeReservedNodes operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The requested node does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedNodes(request);
    }

    @SdkInternalApi
    final DescribeReservedNodesResult executeDescribeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodesRequest> request = null;
        Response<DescribeReservedNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeReservedNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedNodesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeReservedNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists available reserved node offerings.
     * </p>
     * 
     * @param describeReservedNodesOfferingsRequest
     * @return Result of the DescribeReservedNodesOfferings operation returned by the service.
     * @throws ReservedNodesOfferingNotFoundException
     *         The requested node offering does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeReservedNodesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedNodesOfferingsResult describeReservedNodesOfferings(DescribeReservedNodesOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedNodesOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedNodesOfferingsResult executeDescribeReservedNodesOfferings(DescribeReservedNodesOfferingsRequest describeReservedNodesOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedNodesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodesOfferingsRequest> request = null;
        Response<DescribeReservedNodesOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodesOfferingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeReservedNodesOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedNodesOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeReservedNodesOfferingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeReservedNodesOfferingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details of the service updates
     * </p>
     * 
     * @param describeServiceUpdatesRequest
     * @return Result of the DescribeServiceUpdates operation returned by the service.
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeServiceUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeServiceUpdatesResult describeServiceUpdates(DescribeServiceUpdatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServiceUpdates(request);
    }

    @SdkInternalApi
    final DescribeServiceUpdatesResult executeDescribeServiceUpdates(DescribeServiceUpdatesRequest describeServiceUpdatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServiceUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceUpdatesRequest> request = null;
        Response<DescribeServiceUpdatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceUpdatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServiceUpdatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServiceUpdates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServiceUpdatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeServiceUpdatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about cluster snapshots. By default, DescribeSnapshots lists all of your snapshots; it can
     * optionally describe a single snapshot, or just the snapshots associated with a particular cluster.
     * </p>
     * 
     * @param describeSnapshotsRequest
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws SnapshotNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshots(request);
    }

    @SdkInternalApi
    final DescribeSnapshotsResult executeDescribeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list contains only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return Result of the DescribeSubnetGroups operation returned by the service.
     * @throws SubnetGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSubnetGroups" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Returns a list of users.
     * </p>
     * 
     * @param describeUsersRequest
     * @return Result of the DescribeUsers operation returned by the service.
     * @throws UserNotFoundException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.DescribeUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeUsers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeUsersResult describeUsers(DescribeUsersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeUsers(request);
    }

    @SdkInternalApi
    final DescribeUsersResult executeDescribeUsers(DescribeUsersRequest describeUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeUsersRequest> request = null;
        Response<DescribeUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeUsers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Used to failover a shard. This API is designed for testing the behavior of your application in case of MemoryDB
     * failover. It is not designed to be used as a production-level tool for initiating a failover to overcome a
     * problem you may have with the cluster. Moreover, in certain conditions such as large scale operational events,
     * Amazon may block this API.
     * </p>
     * 
     * @param failoverShardRequest
     * @return Result of the FailoverShard operation returned by the service.
     * @throws APICallRateForCustomerExceededException
     * @throws InvalidClusterStateException
     * @throws ShardNotFoundException
     * @throws ClusterNotFoundException
     * @throws TestFailoverNotAvailableException
     * @throws InvalidKMSKeyException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.FailoverShard
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/FailoverShard" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public FailoverShardResult failoverShard(FailoverShardRequest request) {
        request = beforeClientExecution(request);
        return executeFailoverShard(request);
    }

    @SdkInternalApi
    final FailoverShardResult executeFailoverShard(FailoverShardRequest failoverShardRequest) {

        ExecutionContext executionContext = createExecutionContext(failoverShardRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FailoverShardRequest> request = null;
        Response<FailoverShardResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FailoverShardRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(failoverShardRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FailoverShard");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<FailoverShardResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new FailoverShardResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available node types that you can scale to from your cluster's current node type. When you use the
     * UpdateCluster operation to scale your cluster, the value of the NodeType parameter must be one of the node types
     * returned by this operation.
     * </p>
     * 
     * @param listAllowedNodeTypeUpdatesRequest
     * @return Result of the ListAllowedNodeTypeUpdates operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterCombinationException
     * @throws InvalidParameterValueException
     * @sample AmazonMemoryDB.ListAllowedNodeTypeUpdates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListAllowedNodeTypeUpdates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAllowedNodeTypeUpdatesResult listAllowedNodeTypeUpdates(ListAllowedNodeTypeUpdatesRequest request) {
        request = beforeClientExecution(request);
        return executeListAllowedNodeTypeUpdates(request);
    }

    @SdkInternalApi
    final ListAllowedNodeTypeUpdatesResult executeListAllowedNodeTypeUpdates(ListAllowedNodeTypeUpdatesRequest listAllowedNodeTypeUpdatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAllowedNodeTypeUpdatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAllowedNodeTypeUpdatesRequest> request = null;
        Response<ListAllowedNodeTypeUpdatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAllowedNodeTypeUpdatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAllowedNodeTypeUpdatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAllowedNodeTypeUpdates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAllowedNodeTypeUpdatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAllowedNodeTypeUpdatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags currently on a named resource. A tag is a key-value pair where the key and value are
     * case-sensitive. You can use tags to categorize and track your MemoryDB resources. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/Tagging-Resources.html">Tagging your MemoryDB
     * resources</a>
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @sample AmazonMemoryDB.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ListTags" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Allows you to purchase a reserved node offering. Reserved nodes are not eligible for cancellation and are
     * non-refundable.
     * </p>
     * 
     * @param purchaseReservedNodesOfferingRequest
     * @return Result of the PurchaseReservedNodesOffering operation returned by the service.
     * @throws ReservedNodesOfferingNotFoundException
     *         The requested node offering does not exist.
     * @throws ReservedNodeAlreadyExistsException
     *         You already have a reservation with the given identifier.
     * @throws ReservedNodeQuotaExceededException
     *         The request cannot be processed because it would exceed the user's node quota.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.PurchaseReservedNodesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PurchaseReservedNodesOfferingResult purchaseReservedNodesOffering(PurchaseReservedNodesOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedNodesOffering(request);
    }

    @SdkInternalApi
    final PurchaseReservedNodesOfferingResult executePurchaseReservedNodesOffering(PurchaseReservedNodesOfferingRequest purchaseReservedNodesOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedNodesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedNodesOfferingRequest> request = null;
        Response<PurchaseReservedNodesOfferingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedNodesOfferingRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(purchaseReservedNodesOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedNodesOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PurchaseReservedNodesOfferingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PurchaseReservedNodesOfferingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a parameter group to the engine or system default value. You can reset specific
     * parameters by submitting a list of parameter names. To reset the entire parameter group, specify the
     * AllParameters and ParameterGroupName parameters.
     * </p>
     * 
     * @param resetParameterGroupRequest
     * @return Result of the ResetParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     * @throws ParameterGroupNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.ResetParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ResetParameterGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResetParameterGroupResult resetParameterGroup(ResetParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeResetParameterGroup(request);
    }

    @SdkInternalApi
    final ResetParameterGroupResult executeResetParameterGroup(ResetParameterGroupRequest resetParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(resetParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetParameterGroupRequest> request = null;
        Response<ResetParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetParameterGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetParameterGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetParameterGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A tag is a key-value pair where the key and value are case-sensitive. You can use tags to categorize and track
     * all your MemoryDB resources. When you add or remove tags on clusters, those actions will be replicated to all
     * nodes in the cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/iam.resourcelevelpermissions.html">Resource-level
     * permissions</a>.
     * </p>
     * <p>
     * For example, you can use cost-allocation tags to your MemoryDB resources, Amazon generates a cost allocation
     * report as a comma-separated value (CSV) file with your usage and costs aggregated by your tags. You can apply
     * tags that represent business categories (such as cost centers, application names, or owners) to organize your
     * costs across multiple services. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/tagging.html">Using Cost Allocation Tags</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws InvalidClusterStateException
     * @throws SnapshotNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @throws TagQuotaPerResourceExceededException
     * @throws InvalidARNException
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonMemoryDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Use this operation to remove tags on a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws ParameterGroupNotFoundException
     * @throws SubnetGroupNotFoundException
     * @throws SnapshotNotFoundException
     * @throws InvalidARNException
     * @throws TagNotFoundException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws UserNotFoundException
     * @throws ACLNotFoundException
     * @sample AmazonMemoryDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Changes the list of users that belong to the Access Control List.
     * </p>
     * 
     * @param updateACLRequest
     * @return Result of the UpdateACL operation returned by the service.
     * @throws ACLNotFoundException
     * @throws UserNotFoundException
     * @throws DuplicateUserNameException
     * @throws DefaultUserRequiredException
     * @throws InvalidACLStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateACLResult updateACL(UpdateACLRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateACL(request);
    }

    @SdkInternalApi
    final UpdateACLResult executeUpdateACL(UpdateACLRequest updateACLRequest) {

        ExecutionContext executionContext = createExecutionContext(updateACLRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateACLRequest> request = null;
        Response<UpdateACLResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateACLRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateACLRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateACL");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateACLResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateACLResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a cluster. You can use this operation to change one or more cluster configuration
     * settings by specifying the settings and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws ClusterNotFoundException
     * @throws InvalidClusterStateException
     * @throws InvalidNodeStateException
     * @throws ParameterGroupNotFoundException
     * @throws InvalidVPCNetworkStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidKMSKeyException
     * @throws NodeQuotaForClusterExceededException
     * @throws ClusterQuotaForCustomerExceededException
     * @throws ShardsPerClusterQuotaExceededException
     * @throws NodeQuotaForCustomerExceededException
     * @throws NoOperationException
     * @throws InvalidACLStateException
     * @throws ACLNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Updates the parameters of a parameter group. You can modify up to 20 parameters in a single request by submitting
     * a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return Result of the UpdateParameterGroup operation returned by the service.
     * @throws ParameterGroupNotFoundException
     * @throws InvalidParameterGroupStateException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateParameterGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * Updates a subnet group. For more information, see <a
     * href="https://docs.aws.amazon.com/MemoryDB/latest/devguide/ubnetGroups.Modifying.html">Updating a subnet
     * group</a>
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return Result of the UpdateSubnetGroup operation returned by the service.
     * @throws SubnetGroupNotFoundException
     * @throws SubnetQuotaExceededException
     * @throws SubnetInUseException
     * @throws InvalidSubnetException
     * @throws ServiceLinkedRoleNotFoundException
     * @throws SubnetNotAllowedException
     * @sample AmazonMemoryDB.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateSubnetGroup" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
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
     * <p>
     * Changes user password(s) and/or access string.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws UserNotFoundException
     * @throws InvalidUserStateException
     * @throws InvalidParameterValueException
     * @throws InvalidParameterCombinationException
     * @sample AmazonMemoryDB.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateUserResult updateUser(UpdateUserRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateUser(request);
    }

    @SdkInternalApi
    final UpdateUserResult executeUpdateUser(UpdateUserRequest updateUserRequest) {

        ExecutionContext executionContext = createExecutionContext(updateUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateUserRequest> request = null;
        Response<UpdateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MemoryDB");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateUser");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateUserResultJsonUnmarshaller());
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
