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
package com.amazonaws.services.cloudhsmv2;

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

import com.amazonaws.services.cloudhsmv2.AWSCloudHSMV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudhsmv2.model.*;
import com.amazonaws.services.cloudhsmv2.model.transform.*;

/**
 * Client for accessing CloudHSM V2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * For more information about AWS CloudHSM, see <a href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a> and the <a
 * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudHSMV2Client extends AmazonWebServiceClient implements AWSCloudHSMV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudHSMV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudhsm";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmInternalFailureException").withModeledClass(
                                    com.amazonaws.services.cloudhsmv2.model.CloudHsmInternalFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmServiceException").withModeledClass(
                                    com.amazonaws.services.cloudhsmv2.model.CloudHsmServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmAccessDeniedException").withModeledClass(
                                    com.amazonaws.services.cloudhsmv2.model.CloudHsmAccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.cloudhsmv2.model.CloudHsmResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmInvalidRequestException").withModeledClass(
                                    com.amazonaws.services.cloudhsmv2.model.CloudHsmInvalidRequestException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudhsmv2.model.AWSCloudHSMV2Exception.class));

    public static AWSCloudHSMV2ClientBuilder builder() {
        return AWSCloudHSMV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudHSMV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudHSM V2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudHSMV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloudhsmv2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudhsmv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudhsmv2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Copy an AWS CloudHSM cluster backup to a different region.
     * </p>
     * 
     * @param copyBackupToRegionRequest
     * @return Result of the CopyBackupToRegion operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CopyBackupToRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CopyBackupToRegion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CopyBackupToRegionResult copyBackupToRegion(CopyBackupToRegionRequest request) {
        request = beforeClientExecution(request);
        return executeCopyBackupToRegion(request);
    }

    @SdkInternalApi
    final CopyBackupToRegionResult executeCopyBackupToRegion(CopyBackupToRegionRequest copyBackupToRegionRequest) {

        ExecutionContext executionContext = createExecutionContext(copyBackupToRegionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyBackupToRegionRequest> request = null;
        Response<CopyBackupToRegionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyBackupToRegionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyBackupToRegionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyBackupToRegion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyBackupToRegionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyBackupToRegionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new AWS CloudHSM cluster.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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
     * Creates a new hardware security module (HSM) in the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param createHsmRequest
     * @return Result of the CreateHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateHsmResult createHsm(CreateHsmRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHsm(request);
    }

    @SdkInternalApi
    final CreateHsmResult executeCreateHsm(CreateHsmRequest createHsmRequest) {

        ExecutionContext executionContext = createExecutionContext(createHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmRequest> request = null;
        Response<CreateHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHsm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateHsmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateHsmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified AWS CloudHSM backup. A backup can be restored up to 7 days after the DeleteBackup request.
     * For more information on restoring a backup, see <a>RestoreBackup</a>
     * </p>
     * 
     * @param deleteBackupRequest
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackup(request);
    }

    @SdkInternalApi
    final DeleteBackupResult executeDeleteBackup(DeleteBackupRequest deleteBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified AWS CloudHSM cluster. Before you can delete a cluster, you must delete all HSMs in the
     * cluster. To see if the cluster contains any HSMs, use <a>DescribeClusters</a>. To delete an HSM, use
     * <a>DeleteHsm</a>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteCluster" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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
     * Deletes the specified HSM. To specify an HSM, you can use its identifier (ID), the IP address of the HSM's
     * elastic network interface (ENI), or the ID of the HSM's ENI. You need to specify only one of these values. To
     * find these values, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param deleteHsmRequest
     * @return Result of the DeleteHsm operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteHsmResult deleteHsm(DeleteHsmRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHsm(request);
    }

    @SdkInternalApi
    final DeleteHsmResult executeDeleteHsm(DeleteHsmRequest deleteHsmRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHsmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmRequest> request = null;
        Response<DeleteHsmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteHsmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHsm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteHsmResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteHsmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about backups of AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the backups.
     * When the response contains only a subset of backups, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeBackups</code> request to get more backups. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more backups to get.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackups(request);
    }

    @SdkInternalApi
    final DescribeBackupsResult executeDescribeBackups(DescribeBackupsRequest describeBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupsRequest> request = null;
        Response<DescribeBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS CloudHSM clusters.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the clusters.
     * When the response contains only a subset of clusters, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>DescribeClusters</code> request to get more clusters. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more clusters to get.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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
     * Claims an AWS CloudHSM cluster by submitting the cluster certificate issued by your issuing certificate authority
     * (CA) and the CA's root certificate. Before you can claim a cluster, you must sign the cluster's certificate
     * signing request (CSR) with your issuing CA. To get the cluster's CSR, use <a>DescribeClusters</a>.
     * </p>
     * 
     * @param initializeClusterRequest
     * @return Result of the InitializeCluster operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.InitializeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/InitializeCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public InitializeClusterResult initializeCluster(InitializeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeInitializeCluster(request);
    }

    @SdkInternalApi
    final InitializeClusterResult executeInitializeCluster(InitializeClusterRequest initializeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(initializeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<InitializeClusterRequest> request = null;
        Response<InitializeClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new InitializeClusterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(initializeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "InitializeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<InitializeClusterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new InitializeClusterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of tags for the specified AWS CloudHSM cluster.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTags</code> request to get more tags. When you receive a response with no
     * <code>NextToken</code> (or an empty or null value), that means there are no more tags to get.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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
     * Restores a specified AWS CloudHSM backup that is in the <code>PENDING_DELETION</code> state. For more information
     * on deleting a backup, see <a>DeleteBackup</a>.
     * </p>
     * 
     * @param restoreBackupRequest
     * @return Result of the RestoreBackup operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.RestoreBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/RestoreBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestoreBackupResult restoreBackup(RestoreBackupRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreBackup(request);
    }

    @SdkInternalApi
    final RestoreBackupResult executeRestoreBackup(RestoreBackupRequest restoreBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreBackupRequest> request = null;
        Response<RestoreBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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
     * Removes the specified tag or tags from the specified AWS CloudHSM cluster.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws CloudHsmInternalFailureException
     *         The request was rejected because of an AWS CloudHSM internal failure. The request can be retried.
     * @throws CloudHsmServiceException
     *         The request was rejected because an error occurred.
     * @throws CloudHsmResourceNotFoundException
     *         The request was rejected because it refers to a resource that cannot be found.
     * @throws CloudHsmInvalidRequestException
     *         The request was rejected because it is not a valid request.
     * @throws CloudHsmAccessDeniedException
     *         The request was rejected because the requester does not have permission to perform the requested
     *         operation.
     * @sample AWSCloudHSMV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudHSM V2");
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

}
