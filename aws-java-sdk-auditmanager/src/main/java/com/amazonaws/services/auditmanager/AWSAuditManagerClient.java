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
package com.amazonaws.services.auditmanager;

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

import com.amazonaws.services.auditmanager.AWSAuditManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.services.auditmanager.model.transform.*;

/**
 * Client for accessing AWS Audit Manager. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the Audit Manager API reference. This guide is for developers who need detailed information about the
 * Audit Manager API operations, data types, and errors.
 * </p>
 * <p>
 * Audit Manager is a service that provides automated evidence collection so that you can continually audit your Amazon
 * Web Services usage. You can use it to assess the effectiveness of your controls, manage risk, and simplify
 * compliance.
 * </p>
 * <p>
 * Audit Manager provides prebuilt frameworks that structure and automate assessments for a given compliance standard.
 * Frameworks include a prebuilt collection of controls with descriptions and testing procedures. These controls are
 * grouped according to the requirements of the specified compliance standard or regulation. You can also customize
 * frameworks and controls to support internal audits with specific requirements.
 * </p>
 * <p>
 * Use the following links to get started with the Audit Manager API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Operations.html">Actions</a>: An
 * alphabetical list of all Audit Manager API operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Types.html">Data types</a>: An
 * alphabetical list of all Audit Manager data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/CommonParameters.html">Common parameters</a>:
 * Parameters that all operations can use.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/CommonErrors.html">Common errors</a>: Client
 * and server errors that all operations can return.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you're new to Audit Manager, we recommend that you review the <a
 * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/what-is.html"> Audit Manager User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAuditManagerClient extends AmazonWebServiceClient implements AWSAuditManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAuditManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "auditmanager";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.auditmanager.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.auditmanager.model.AWSAuditManagerException.class));

    public static AWSAuditManagerClientBuilder builder() {
        return AWSAuditManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Audit Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAuditManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Audit Manager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAuditManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("auditmanager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/auditmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/auditmanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates an evidence folder to an assessment report in an Audit Manager assessment.
     * </p>
     * 
     * @param associateAssessmentReportEvidenceFolderRequest
     * @return Result of the AssociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.AssociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateAssessmentReportEvidenceFolderResult associateAssessmentReportEvidenceFolder(AssociateAssessmentReportEvidenceFolderRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateAssessmentReportEvidenceFolder(request);
    }

    @SdkInternalApi
    final AssociateAssessmentReportEvidenceFolderResult executeAssociateAssessmentReportEvidenceFolder(
            AssociateAssessmentReportEvidenceFolderRequest associateAssessmentReportEvidenceFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(associateAssessmentReportEvidenceFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateAssessmentReportEvidenceFolderRequest> request = null;
        Response<AssociateAssessmentReportEvidenceFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateAssessmentReportEvidenceFolderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateAssessmentReportEvidenceFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateAssessmentReportEvidenceFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateAssessmentReportEvidenceFolderResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateAssessmentReportEvidenceFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a list of evidence to an assessment report in an Audit Manager assessment.
     * </p>
     * 
     * @param batchAssociateAssessmentReportEvidenceRequest
     * @return Result of the BatchAssociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.BatchAssociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchAssociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchAssociateAssessmentReportEvidenceResult batchAssociateAssessmentReportEvidence(BatchAssociateAssessmentReportEvidenceRequest request) {
        request = beforeClientExecution(request);
        return executeBatchAssociateAssessmentReportEvidence(request);
    }

    @SdkInternalApi
    final BatchAssociateAssessmentReportEvidenceResult executeBatchAssociateAssessmentReportEvidence(
            BatchAssociateAssessmentReportEvidenceRequest batchAssociateAssessmentReportEvidenceRequest) {

        ExecutionContext executionContext = createExecutionContext(batchAssociateAssessmentReportEvidenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchAssociateAssessmentReportEvidenceRequest> request = null;
        Response<BatchAssociateAssessmentReportEvidenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchAssociateAssessmentReportEvidenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchAssociateAssessmentReportEvidenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchAssociateAssessmentReportEvidence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchAssociateAssessmentReportEvidenceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchAssociateAssessmentReportEvidenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a batch of delegations for an assessment in Audit Manager.
     * </p>
     * 
     * @param batchCreateDelegationByAssessmentRequest
     * @return Result of the BatchCreateDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchCreateDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchCreateDelegationByAssessmentResult batchCreateDelegationByAssessment(BatchCreateDelegationByAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeBatchCreateDelegationByAssessment(request);
    }

    @SdkInternalApi
    final BatchCreateDelegationByAssessmentResult executeBatchCreateDelegationByAssessment(
            BatchCreateDelegationByAssessmentRequest batchCreateDelegationByAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(batchCreateDelegationByAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchCreateDelegationByAssessmentRequest> request = null;
        Response<BatchCreateDelegationByAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchCreateDelegationByAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchCreateDelegationByAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchCreateDelegationByAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchCreateDelegationByAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchCreateDelegationByAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a batch of delegations for an assessment in Audit Manager.
     * </p>
     * 
     * @param batchDeleteDelegationByAssessmentRequest
     * @return Result of the BatchDeleteDelegationByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchDeleteDelegationByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteDelegationByAssessmentResult batchDeleteDelegationByAssessment(BatchDeleteDelegationByAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteDelegationByAssessment(request);
    }

    @SdkInternalApi
    final BatchDeleteDelegationByAssessmentResult executeBatchDeleteDelegationByAssessment(
            BatchDeleteDelegationByAssessmentRequest batchDeleteDelegationByAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteDelegationByAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteDelegationByAssessmentRequest> request = null;
        Response<BatchDeleteDelegationByAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteDelegationByAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDeleteDelegationByAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteDelegationByAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDeleteDelegationByAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchDeleteDelegationByAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a list of evidence from an assessment report in Audit Manager.
     * </p>
     * 
     * @param batchDisassociateAssessmentReportEvidenceRequest
     * @return Result of the BatchDisassociateAssessmentReportEvidence operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.BatchDisassociateAssessmentReportEvidence
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDisassociateAssessmentReportEvidenceResult batchDisassociateAssessmentReportEvidence(BatchDisassociateAssessmentReportEvidenceRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDisassociateAssessmentReportEvidence(request);
    }

    @SdkInternalApi
    final BatchDisassociateAssessmentReportEvidenceResult executeBatchDisassociateAssessmentReportEvidence(
            BatchDisassociateAssessmentReportEvidenceRequest batchDisassociateAssessmentReportEvidenceRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDisassociateAssessmentReportEvidenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDisassociateAssessmentReportEvidenceRequest> request = null;
        Response<BatchDisassociateAssessmentReportEvidenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDisassociateAssessmentReportEvidenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchDisassociateAssessmentReportEvidenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDisassociateAssessmentReportEvidence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchDisassociateAssessmentReportEvidenceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchDisassociateAssessmentReportEvidenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads one or more pieces of evidence to a control in an Audit Manager assessment. You can upload manual
     * evidence from any Amazon Simple Storage Service (Amazon S3) bucket by specifying the S3 URI of the evidence.
     * </p>
     * <p>
     * You must upload manual evidence to your S3 bucket before you can upload it to your assessment. For instructions,
     * see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">CreateBucket</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a> in the <i>Amazon Simple
     * Storage Service API Reference.</i>
     * </p>
     * <p>
     * The following restrictions apply to this action:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum size of an individual evidence file: 100 MB
     * </p>
     * </li>
     * <li>
     * <p>
     * Number of daily manual evidence uploads per control: 100
     * </p>
     * </li>
     * <li>
     * <p>
     * Supported file formats: See <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Audit Manager service restrictions, see <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and restrictions for
     * Audit Manager</a>.
     * </p>
     * 
     * @param batchImportEvidenceToAssessmentControlRequest
     * @return Result of the BatchImportEvidenceToAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.BatchImportEvidenceToAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchImportEvidenceToAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchImportEvidenceToAssessmentControlResult batchImportEvidenceToAssessmentControl(BatchImportEvidenceToAssessmentControlRequest request) {
        request = beforeClientExecution(request);
        return executeBatchImportEvidenceToAssessmentControl(request);
    }

    @SdkInternalApi
    final BatchImportEvidenceToAssessmentControlResult executeBatchImportEvidenceToAssessmentControl(
            BatchImportEvidenceToAssessmentControlRequest batchImportEvidenceToAssessmentControlRequest) {

        ExecutionContext executionContext = createExecutionContext(batchImportEvidenceToAssessmentControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchImportEvidenceToAssessmentControlRequest> request = null;
        Response<BatchImportEvidenceToAssessmentControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchImportEvidenceToAssessmentControlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchImportEvidenceToAssessmentControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchImportEvidenceToAssessmentControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchImportEvidenceToAssessmentControlResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new BatchImportEvidenceToAssessmentControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment in Audit Manager.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return Result of the CreateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAssessmentResult createAssessment(CreateAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssessment(request);
    }

    @SdkInternalApi
    final CreateAssessmentResult executeCreateAssessment(CreateAssessmentRequest createAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentRequest> request = null;
        Response<CreateAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a custom framework in Audit Manager.
     * </p>
     * 
     * @param createAssessmentFrameworkRequest
     * @return Result of the CreateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAssessmentFrameworkResult createAssessmentFramework(CreateAssessmentFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssessmentFramework(request);
    }

    @SdkInternalApi
    final CreateAssessmentFrameworkResult executeCreateAssessmentFramework(CreateAssessmentFrameworkRequest createAssessmentFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssessmentFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentFrameworkRequest> request = null;
        Response<CreateAssessmentFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createAssessmentFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssessmentFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment report for the specified assessment.
     * </p>
     * 
     * @param createAssessmentReportRequest
     * @return Result of the CreateAssessmentReport operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.CreateAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAssessmentReportResult createAssessmentReport(CreateAssessmentReportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssessmentReport(request);
    }

    @SdkInternalApi
    final CreateAssessmentReportResult executeCreateAssessmentReport(CreateAssessmentReportRequest createAssessmentReportRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssessmentReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentReportRequest> request = null;
        Response<CreateAssessmentReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssessmentReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssessmentReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom control in Audit Manager.
     * </p>
     * 
     * @param createControlRequest
     * @return Result of the CreateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.CreateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateControlResult createControl(CreateControlRequest request) {
        request = beforeClientExecution(request);
        return executeCreateControl(request);
    }

    @SdkInternalApi
    final CreateControlResult executeCreateControl(CreateControlRequest createControlRequest) {

        ExecutionContext executionContext = createExecutionContext(createControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateControlRequest> request = null;
        Response<CreateControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an assessment in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return Result of the DeleteAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteAssessmentResult deleteAssessment(DeleteAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessment(request);
    }

    @SdkInternalApi
    final DeleteAssessmentResult executeDeleteAssessment(DeleteAssessmentRequest deleteAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentRequest> request = null;
        Response<DeleteAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkRequest
     * @return Result of the DeleteAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssessmentFrameworkResult deleteAssessmentFramework(DeleteAssessmentFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentFramework(request);
    }

    @SdkInternalApi
    final DeleteAssessmentFrameworkResult executeDeleteAssessmentFramework(DeleteAssessmentFrameworkRequest deleteAssessmentFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentFrameworkRequest> request = null;
        Response<DeleteAssessmentFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAssessmentFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param deleteAssessmentFrameworkShareRequest
     * @return Result of the DeleteAssessmentFrameworkShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssessmentFrameworkShareResult deleteAssessmentFrameworkShare(DeleteAssessmentFrameworkShareRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentFrameworkShare(request);
    }

    @SdkInternalApi
    final DeleteAssessmentFrameworkShareResult executeDeleteAssessmentFrameworkShare(DeleteAssessmentFrameworkShareRequest deleteAssessmentFrameworkShareRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentFrameworkShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentFrameworkShareRequest> request = null;
        Response<DeleteAssessmentFrameworkShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentFrameworkShareRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteAssessmentFrameworkShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentFrameworkShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentFrameworkShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentFrameworkShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an assessment report in Audit Manager.
     * </p>
     * <p>
     * When you run the <code>DeleteAssessmentReport</code> operation, Audit Manager attempts to delete the following
     * data:
     * </p>
     * <ol>
     * <li>
     * <p>
     * The specified assessment report that’s stored in your S3 bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * The associated metadata that’s stored in Audit Manager
     * </p>
     * </li>
     * </ol>
     * <p>
     * If Audit Manager can’t access the assessment report in your S3 bucket, the report isn’t deleted. In this event,
     * the <code>DeleteAssessmentReport</code> operation doesn’t fail. Instead, it proceeds to delete the associated
     * metadata only. You must then delete the assessment report from the S3 bucket yourself.
     * </p>
     * <p>
     * This scenario happens when Audit Manager receives a <code>403 (Forbidden)</code> or <code>404 (Not Found)</code>
     * error from Amazon S3. To avoid this, make sure that your S3 bucket is available, and that you configured the
     * correct permissions for Audit Manager to delete resources in your S3 bucket. For an example permissions policy
     * that you can use, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/security_iam_id-based-policy-examples.html#full-administrator-access-assessment-report-destination"
     * >Assessment report destination permissions</a> in the <i>Audit Manager User Guide</i>. For information about the
     * issues that could cause a <code>403 (Forbidden)</code> or <code>404 (Not Found</code>) error from Amazon S3, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#ErrorCodeList">List of Error
     * Codes</a> in the <i>Amazon Simple Storage Service API Reference</i>.
     * </p>
     * 
     * @param deleteAssessmentReportRequest
     * @return Result of the DeleteAssessmentReport operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeleteAssessmentReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAssessmentReportResult deleteAssessmentReport(DeleteAssessmentReportRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssessmentReport(request);
    }

    @SdkInternalApi
    final DeleteAssessmentReportResult executeDeleteAssessmentReport(DeleteAssessmentReportRequest deleteAssessmentReportRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssessmentReportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentReportRequest> request = null;
        Response<DeleteAssessmentReportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentReportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentReportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssessmentReport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentReportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentReportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom control in Audit Manager.
     * </p>
     * 
     * @param deleteControlRequest
     * @return Result of the DeleteControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.DeleteControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteControlResult deleteControl(DeleteControlRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteControl(request);
    }

    @SdkInternalApi
    final DeleteControlResult executeDeleteControl(DeleteControlRequest deleteControlRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteControlRequest> request = null;
        Response<DeleteControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters an account in Audit Manager.
     * </p>
     * <note>
     * <p>
     * Before you deregister, you can use the <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_UpdateSettings.html">UpdateSettings</a>
     * API operation to set your preferred data retention policy. By default, Audit Manager retains your data. If you
     * want to delete your data, you can use the <code>DeregistrationPolicy</code> attribute to request the deletion of
     * your data.
     * </p>
     * <p>
     * For more information about data retention, see <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/data-protection.html">Data Protection</a> in the
     * <i>Audit Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deregisterAccountRequest
     * @return Result of the DeregisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeregisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterAccountResult deregisterAccount(DeregisterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterAccount(request);
    }

    @SdkInternalApi
    final DeregisterAccountResult executeDeregisterAccount(DeregisterAccountRequest deregisterAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterAccountRequest> request = null;
        Response<DeregisterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deregisterAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeregisterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified Amazon Web Services account as a delegated administrator for Audit Manager.
     * </p>
     * <p>
     * When you remove a delegated administrator from your Audit Manager settings, you continue to have access to the
     * evidence that you previously collected under that account. This is also the case when you deregister a delegated
     * administrator from Organizations. However, Audit Manager stops collecting and attaching evidence to that
     * delegated administrator account moving forward.
     * </p>
     * <important>
     * <p>
     * Keep in mind the following cleanup task if you use evidence finder:
     * </p>
     * <p>
     * Before you use your management account to remove a delegated administrator, make sure that the current delegated
     * administrator account signs in to Audit Manager and disables evidence finder first. Disabling evidence finder
     * automatically deletes the event data store that was created in their account when they enabled evidence finder.
     * If this task isn’t completed, the event data store remains in their account. In this case, we recommend that the
     * original delegated administrator goes to CloudTrail Lake and manually <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-eds-disable-termination.html">deletes the
     * event data store</a>.
     * </p>
     * <p>
     * This cleanup task is necessary to ensure that you don't end up with multiple event data stores. Audit Manager
     * ignores an unused event data store after you remove or change a delegated administrator account. However, the
     * unused event data store continues to incur storage costs from CloudTrail Lake if you don't delete it.
     * </p>
     * </important>
     * <p>
     * When you deregister a delegated administrator account for Audit Manager, the data for that account isn’t deleted.
     * If you want to delete resource data for a delegated administrator account, you must perform that task separately
     * before you deregister the account. Either, you can do this in the Audit Manager console. Or, you can use one of
     * the delete API operations that are provided by Audit Manager.
     * </p>
     * <p>
     * To delete your Audit Manager resource data, see the following instructions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessment.html">DeleteAssessment
     * </a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-assessment.html">Deleting an
     * assessment</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFramework.html">
     * DeleteAssessmentFramework</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-custom-framework.html">Deleting a custom
     * framework</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentFrameworkShare.html">
     * DeleteAssessmentFrameworkShare</a> (see also: <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/userguide/deleting-shared-framework-requests.html"
     * >Deleting a share request</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteAssessmentReport.html">
     * DeleteAssessmentReport</a> (see also: <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/generate-assessment-report.html#delete-assessment-report-steps"
     * >Deleting an assessment report</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_DeleteControl.html">DeleteControl</a>
     * (see also: <a href="https://docs.aws.amazon.com/audit-manager/latest/userguide/delete-controls.html">Deleting a
     * custom control</a> in the <i>Audit Manager User Guide</i>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * At this time, Audit Manager doesn't provide an option to delete evidence for a specific delegated administrator.
     * Instead, when your management account deregisters Audit Manager, we perform a cleanup for the current delegated
     * administrator account at the time of deregistration.
     * </p>
     * 
     * @param deregisterOrganizationAdminAccountRequest
     * @return Result of the DeregisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DeregisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeregisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterOrganizationAdminAccountResult deregisterOrganizationAdminAccount(DeregisterOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final DeregisterOrganizationAdminAccountResult executeDeregisterOrganizationAdminAccount(
            DeregisterOrganizationAdminAccountRequest deregisterOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOrganizationAdminAccountRequest> request = null;
        Response<DeregisterOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an evidence folder from the specified assessment report in Audit Manager.
     * </p>
     * 
     * @param disassociateAssessmentReportEvidenceFolderRequest
     * @return Result of the DisassociateAssessmentReportEvidenceFolder operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.DisassociateAssessmentReportEvidenceFolder
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DisassociateAssessmentReportEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateAssessmentReportEvidenceFolderResult disassociateAssessmentReportEvidenceFolder(DisassociateAssessmentReportEvidenceFolderRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateAssessmentReportEvidenceFolder(request);
    }

    @SdkInternalApi
    final DisassociateAssessmentReportEvidenceFolderResult executeDisassociateAssessmentReportEvidenceFolder(
            DisassociateAssessmentReportEvidenceFolderRequest disassociateAssessmentReportEvidenceFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateAssessmentReportEvidenceFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateAssessmentReportEvidenceFolderRequest> request = null;
        Response<DisassociateAssessmentReportEvidenceFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateAssessmentReportEvidenceFolderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateAssessmentReportEvidenceFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateAssessmentReportEvidenceFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateAssessmentReportEvidenceFolderResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisassociateAssessmentReportEvidenceFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the registration status of an account in Audit Manager.
     * </p>
     * 
     * @param getAccountStatusRequest
     * @return Result of the GetAccountStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAccountStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccountStatusResult getAccountStatus(GetAccountStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccountStatus(request);
    }

    @SdkInternalApi
    final GetAccountStatusResult executeGetAccountStatus(GetAccountStatusRequest getAccountStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccountStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccountStatusRequest> request = null;
        Response<GetAccountStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccountStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccountStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccountStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccountStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccountStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an assessment from Audit Manager.
     * </p>
     * 
     * @param getAssessmentRequest
     * @return Result of the GetAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessment" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAssessmentResult getAssessment(GetAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssessment(request);
    }

    @SdkInternalApi
    final GetAssessmentResult executeGetAssessment(GetAssessmentRequest getAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentRequest> request = null;
        Response<GetAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a framework from Audit Manager.
     * </p>
     * 
     * @param getAssessmentFrameworkRequest
     * @return Result of the GetAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssessmentFrameworkResult getAssessmentFramework(GetAssessmentFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssessmentFramework(request);
    }

    @SdkInternalApi
    final GetAssessmentFrameworkResult executeGetAssessmentFramework(GetAssessmentFrameworkRequest getAssessmentFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssessmentFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentFrameworkRequest> request = null;
        Response<GetAssessmentFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssessmentFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssessmentFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssessmentFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssessmentFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the URL of an assessment report in Audit Manager.
     * </p>
     * 
     * @param getAssessmentReportUrlRequest
     * @return Result of the GetAssessmentReportUrl operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.GetAssessmentReportUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAssessmentReportUrlResult getAssessmentReportUrl(GetAssessmentReportUrlRequest request) {
        request = beforeClientExecution(request);
        return executeGetAssessmentReportUrl(request);
    }

    @SdkInternalApi
    final GetAssessmentReportUrlResult executeGetAssessmentReportUrl(GetAssessmentReportUrlRequest getAssessmentReportUrlRequest) {

        ExecutionContext executionContext = createExecutionContext(getAssessmentReportUrlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentReportUrlRequest> request = null;
        Response<GetAssessmentReportUrlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentReportUrlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAssessmentReportUrlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAssessmentReportUrl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAssessmentReportUrlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAssessmentReportUrlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of changelogs from Audit Manager.
     * </p>
     * 
     * @param getChangeLogsRequest
     * @return Result of the GetChangeLogs operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetChangeLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetChangeLogs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChangeLogsResult getChangeLogs(GetChangeLogsRequest request) {
        request = beforeClientExecution(request);
        return executeGetChangeLogs(request);
    }

    @SdkInternalApi
    final GetChangeLogsResult executeGetChangeLogs(GetChangeLogsRequest getChangeLogsRequest) {

        ExecutionContext executionContext = createExecutionContext(getChangeLogsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeLogsRequest> request = null;
        Response<GetChangeLogsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeLogsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChangeLogsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChangeLogs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChangeLogsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChangeLogsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a control from Audit Manager.
     * </p>
     * 
     * @param getControlRequest
     * @return Result of the GetControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetControlResult getControl(GetControlRequest request) {
        request = beforeClientExecution(request);
        return executeGetControl(request);
    }

    @SdkInternalApi
    final GetControlResult executeGetControl(GetControlRequest getControlRequest) {

        ExecutionContext executionContext = createExecutionContext(getControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetControlRequest> request = null;
        Response<GetControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetControlResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of delegations from an audit owner to a delegate.
     * </p>
     * 
     * @param getDelegationsRequest
     * @return Result of the GetDelegations operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetDelegations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetDelegations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDelegationsResult getDelegations(GetDelegationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDelegations(request);
    }

    @SdkInternalApi
    final GetDelegationsResult executeGetDelegations(GetDelegationsRequest getDelegationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDelegationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDelegationsRequest> request = null;
        Response<GetDelegationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDelegationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDelegationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDelegations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDelegationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDelegationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns evidence from Audit Manager.
     * </p>
     * 
     * @param getEvidenceRequest
     * @return Result of the GetEvidence operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidence
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEvidenceResult getEvidence(GetEvidenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvidence(request);
    }

    @SdkInternalApi
    final GetEvidenceResult executeGetEvidence(GetEvidenceRequest getEvidenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvidenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvidenceRequest> request = null;
        Response<GetEvidenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvidenceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEvidenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvidence");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvidenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEvidenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all evidence from a specified evidence folder in Audit Manager.
     * </p>
     * 
     * @param getEvidenceByEvidenceFolderRequest
     * @return Result of the GetEvidenceByEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceByEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceByEvidenceFolder"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEvidenceByEvidenceFolderResult getEvidenceByEvidenceFolder(GetEvidenceByEvidenceFolderRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvidenceByEvidenceFolder(request);
    }

    @SdkInternalApi
    final GetEvidenceByEvidenceFolderResult executeGetEvidenceByEvidenceFolder(GetEvidenceByEvidenceFolderRequest getEvidenceByEvidenceFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvidenceByEvidenceFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvidenceByEvidenceFolderRequest> request = null;
        Response<GetEvidenceByEvidenceFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvidenceByEvidenceFolderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEvidenceByEvidenceFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvidenceByEvidenceFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvidenceByEvidenceFolderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEvidenceByEvidenceFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an evidence folder from the specified assessment in Audit Manager.
     * </p>
     * 
     * @param getEvidenceFolderRequest
     * @return Result of the GetEvidenceFolder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFolder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFolder" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetEvidenceFolderResult getEvidenceFolder(GetEvidenceFolderRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvidenceFolder(request);
    }

    @SdkInternalApi
    final GetEvidenceFolderResult executeGetEvidenceFolder(GetEvidenceFolderRequest getEvidenceFolderRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvidenceFolderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvidenceFolderRequest> request = null;
        Response<GetEvidenceFolderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvidenceFolderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEvidenceFolderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvidenceFolder");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvidenceFolderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEvidenceFolderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the evidence folders from a specified assessment in Audit Manager.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentRequest
     * @return Result of the GetEvidenceFoldersByAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFoldersByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEvidenceFoldersByAssessmentResult getEvidenceFoldersByAssessment(GetEvidenceFoldersByAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvidenceFoldersByAssessment(request);
    }

    @SdkInternalApi
    final GetEvidenceFoldersByAssessmentResult executeGetEvidenceFoldersByAssessment(GetEvidenceFoldersByAssessmentRequest getEvidenceFoldersByAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvidenceFoldersByAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvidenceFoldersByAssessmentRequest> request = null;
        Response<GetEvidenceFoldersByAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvidenceFoldersByAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEvidenceFoldersByAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvidenceFoldersByAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvidenceFoldersByAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEvidenceFoldersByAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of evidence folders that are associated with a specified control in an Audit Manager assessment.
     * </p>
     * 
     * @param getEvidenceFoldersByAssessmentControlRequest
     * @return Result of the GetEvidenceFoldersByAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetEvidenceFoldersByAssessmentControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFoldersByAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEvidenceFoldersByAssessmentControlResult getEvidenceFoldersByAssessmentControl(GetEvidenceFoldersByAssessmentControlRequest request) {
        request = beforeClientExecution(request);
        return executeGetEvidenceFoldersByAssessmentControl(request);
    }

    @SdkInternalApi
    final GetEvidenceFoldersByAssessmentControlResult executeGetEvidenceFoldersByAssessmentControl(
            GetEvidenceFoldersByAssessmentControlRequest getEvidenceFoldersByAssessmentControlRequest) {

        ExecutionContext executionContext = createExecutionContext(getEvidenceFoldersByAssessmentControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvidenceFoldersByAssessmentControlRequest> request = null;
        Response<GetEvidenceFoldersByAssessmentControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvidenceFoldersByAssessmentControlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEvidenceFoldersByAssessmentControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEvidenceFoldersByAssessmentControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEvidenceFoldersByAssessmentControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEvidenceFoldersByAssessmentControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the latest analytics data for all your current active assessments.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInsightsResult getInsights(GetInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsights(request);
    }

    @SdkInternalApi
    final GetInsightsResult executeGetInsights(GetInsightsRequest getInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightsRequest> request = null;
        Response<GetInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the latest analytics data for a specific active assessment.
     * </p>
     * 
     * @param getInsightsByAssessmentRequest
     * @return Result of the GetInsightsByAssessment operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetInsightsByAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInsightsByAssessmentResult getInsightsByAssessment(GetInsightsByAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsightsByAssessment(request);
    }

    @SdkInternalApi
    final GetInsightsByAssessmentResult executeGetInsightsByAssessment(GetInsightsByAssessmentRequest getInsightsByAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightsByAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightsByAssessmentRequest> request = null;
        Response<GetInsightsByAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightsByAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInsightsByAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsightsByAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightsByAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInsightsByAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the name of the delegated Amazon Web Services administrator account for the organization.
     * </p>
     * 
     * @param getOrganizationAdminAccountRequest
     * @return Result of the GetOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.GetOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOrganizationAdminAccountResult getOrganizationAdminAccount(GetOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeGetOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final GetOrganizationAdminAccountResult executeGetOrganizationAdminAccount(GetOrganizationAdminAccountRequest getOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(getOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOrganizationAdminAccountRequest> request = null;
        Response<GetOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all of the Amazon Web Services that you can choose to include in your assessment. When you <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_CreateAssessment.html">create an
     * assessment</a>, specify which of these services you want to include to narrow the assessment's <a
     * href="https://docs.aws.amazon.com/audit-manager/latest/APIReference/API_Scope.html">scope</a>.
     * </p>
     * 
     * @param getServicesInScopeRequest
     * @return Result of the GetServicesInScope operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetServicesInScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetServicesInScope"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetServicesInScopeResult getServicesInScope(GetServicesInScopeRequest request) {
        request = beforeClientExecution(request);
        return executeGetServicesInScope(request);
    }

    @SdkInternalApi
    final GetServicesInScopeResult executeGetServicesInScope(GetServicesInScopeRequest getServicesInScopeRequest) {

        ExecutionContext executionContext = createExecutionContext(getServicesInScopeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServicesInScopeRequest> request = null;
        Response<GetServicesInScopeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServicesInScopeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServicesInScopeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServicesInScope");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServicesInScopeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServicesInScopeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the settings for the specified Amazon Web Services account.
     * </p>
     * 
     * @param getSettingsRequest
     * @return Result of the GetSettings operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.GetSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSettingsResult getSettings(GetSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSettings(request);
    }

    @SdkInternalApi
    final GetSettingsResult executeGetSettings(GetSettingsRequest getSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSettingsRequest> request = null;
        Response<GetSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the latest analytics data for controls within a specific control domain and a specific active assessment.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain and assessment that was specified.
     * Moreover, the control must have collected evidence on the <code>lastUpdated</code> date of
     * <code>controlInsightsByAssessment</code>. If neither of these conditions are met, no data is listed for that
     * control.
     * </p>
     * </note>
     * 
     * @param listAssessmentControlInsightsByControlDomainRequest
     * @return Result of the ListAssessmentControlInsightsByControlDomain operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentControlInsightsByControlDomain
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentControlInsightsByControlDomainResult listAssessmentControlInsightsByControlDomain(
            ListAssessmentControlInsightsByControlDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentControlInsightsByControlDomain(request);
    }

    @SdkInternalApi
    final ListAssessmentControlInsightsByControlDomainResult executeListAssessmentControlInsightsByControlDomain(
            ListAssessmentControlInsightsByControlDomainRequest listAssessmentControlInsightsByControlDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentControlInsightsByControlDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentControlInsightsByControlDomainRequest> request = null;
        Response<ListAssessmentControlInsightsByControlDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentControlInsightsByControlDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssessmentControlInsightsByControlDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentControlInsightsByControlDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentControlInsightsByControlDomainResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssessmentControlInsightsByControlDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of sent or received share requests for custom frameworks in Audit Manager.
     * </p>
     * 
     * @param listAssessmentFrameworkShareRequestsRequest
     * @return Result of the ListAssessmentFrameworkShareRequests operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentFrameworkShareRequests
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworkShareRequests"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentFrameworkShareRequestsResult listAssessmentFrameworkShareRequests(ListAssessmentFrameworkShareRequestsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentFrameworkShareRequests(request);
    }

    @SdkInternalApi
    final ListAssessmentFrameworkShareRequestsResult executeListAssessmentFrameworkShareRequests(
            ListAssessmentFrameworkShareRequestsRequest listAssessmentFrameworkShareRequestsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentFrameworkShareRequestsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentFrameworkShareRequestsRequest> request = null;
        Response<ListAssessmentFrameworkShareRequestsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentFrameworkShareRequestsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssessmentFrameworkShareRequestsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentFrameworkShareRequests");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentFrameworkShareRequestsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentFrameworkShareRequestsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the frameworks that are available in the Audit Manager framework library.
     * </p>
     * 
     * @param listAssessmentFrameworksRequest
     * @return Result of the ListAssessmentFrameworks operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentFrameworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentFrameworks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentFrameworksResult listAssessmentFrameworks(ListAssessmentFrameworksRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentFrameworks(request);
    }

    @SdkInternalApi
    final ListAssessmentFrameworksResult executeListAssessmentFrameworks(ListAssessmentFrameworksRequest listAssessmentFrameworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentFrameworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentFrameworksRequest> request = null;
        Response<ListAssessmentFrameworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentFrameworksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssessmentFrameworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentFrameworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentFrameworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentFrameworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of assessment reports created in Audit Manager.
     * </p>
     * 
     * @param listAssessmentReportsRequest
     * @return Result of the ListAssessmentReports operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessmentReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessmentReports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAssessmentReportsResult listAssessmentReports(ListAssessmentReportsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessmentReports(request);
    }

    @SdkInternalApi
    final ListAssessmentReportsResult executeListAssessmentReports(ListAssessmentReportsRequest listAssessmentReportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentReportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentReportsRequest> request = null;
        Response<ListAssessmentReportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentReportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentReportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessmentReports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentReportsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssessmentReportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of current and past assessments from Audit Manager.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return Result of the ListAssessments operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListAssessments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssessmentsResult listAssessments(ListAssessmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssessments(request);
    }

    @SdkInternalApi
    final ListAssessmentsResult executeListAssessments(ListAssessmentsRequest listAssessmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentsRequest> request = null;
        Response<ListAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssessments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssessmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the latest analytics data for control domains across all of your active assessments.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that control domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsRequest
     * @return Result of the ListControlDomainInsights operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @sample AWSAuditManager.ListControlDomainInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsights"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListControlDomainInsightsResult listControlDomainInsights(ListControlDomainInsightsRequest request) {
        request = beforeClientExecution(request);
        return executeListControlDomainInsights(request);
    }

    @SdkInternalApi
    final ListControlDomainInsightsResult executeListControlDomainInsights(ListControlDomainInsightsRequest listControlDomainInsightsRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlDomainInsightsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlDomainInsightsRequest> request = null;
        Response<ListControlDomainInsightsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlDomainInsightsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listControlDomainInsightsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControlDomainInsights");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlDomainInsightsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListControlDomainInsightsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists analytics data for control domains within a specified active assessment.
     * </p>
     * <note>
     * <p>
     * A control domain is listed only if at least one of the controls within that domain collected evidence on the
     * <code>lastUpdated</code> date of <code>controlDomainInsights</code>. If this condition isn’t met, no data is
     * listed for that domain.
     * </p>
     * </note>
     * 
     * @param listControlDomainInsightsByAssessmentRequest
     * @return Result of the ListControlDomainInsightsByAssessment operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListControlDomainInsightsByAssessment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlDomainInsightsByAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListControlDomainInsightsByAssessmentResult listControlDomainInsightsByAssessment(ListControlDomainInsightsByAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeListControlDomainInsightsByAssessment(request);
    }

    @SdkInternalApi
    final ListControlDomainInsightsByAssessmentResult executeListControlDomainInsightsByAssessment(
            ListControlDomainInsightsByAssessmentRequest listControlDomainInsightsByAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlDomainInsightsByAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlDomainInsightsByAssessmentRequest> request = null;
        Response<ListControlDomainInsightsByAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlDomainInsightsByAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listControlDomainInsightsByAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControlDomainInsightsByAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlDomainInsightsByAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListControlDomainInsightsByAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the latest analytics data for controls within a specific control domain across all active assessments.
     * </p>
     * <note>
     * <p>
     * Control insights are listed only if the control belongs to the control domain that was specified and the control
     * collected evidence on the <code>lastUpdated</code> date of <code>controlInsightsMetadata</code>. If neither of
     * these conditions are met, no data is listed for that control.
     * </p>
     * </note>
     * 
     * @param listControlInsightsByControlDomainRequest
     * @return Result of the ListControlInsightsByControlDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @sample AWSAuditManager.ListControlInsightsByControlDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControlInsightsByControlDomain"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListControlInsightsByControlDomainResult listControlInsightsByControlDomain(ListControlInsightsByControlDomainRequest request) {
        request = beforeClientExecution(request);
        return executeListControlInsightsByControlDomain(request);
    }

    @SdkInternalApi
    final ListControlInsightsByControlDomainResult executeListControlInsightsByControlDomain(
            ListControlInsightsByControlDomainRequest listControlInsightsByControlDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlInsightsByControlDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlInsightsByControlDomainRequest> request = null;
        Response<ListControlInsightsByControlDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlInsightsByControlDomainRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listControlInsightsByControlDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControlInsightsByControlDomain");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlInsightsByControlDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListControlInsightsByControlDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of controls from Audit Manager.
     * </p>
     * 
     * @param listControlsRequest
     * @return Result of the ListControls operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListControls" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListControlsResult listControls(ListControlsRequest request) {
        request = beforeClientExecution(request);
        return executeListControls(request);
    }

    @SdkInternalApi
    final ListControlsResult executeListControls(ListControlsRequest listControlsRequest) {

        ExecutionContext executionContext = createExecutionContext(listControlsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListControlsRequest> request = null;
        Response<ListControlsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListControlsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listControlsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListControls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListControlsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListControlsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of keywords that are pre-mapped to the specified control data source.
     * </p>
     * 
     * @param listKeywordsForDataSourceRequest
     * @return Result of the ListKeywordsForDataSource operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListKeywordsForDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListKeywordsForDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListKeywordsForDataSourceResult listKeywordsForDataSource(ListKeywordsForDataSourceRequest request) {
        request = beforeClientExecution(request);
        return executeListKeywordsForDataSource(request);
    }

    @SdkInternalApi
    final ListKeywordsForDataSourceResult executeListKeywordsForDataSource(ListKeywordsForDataSourceRequest listKeywordsForDataSourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeywordsForDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeywordsForDataSourceRequest> request = null;
        Response<ListKeywordsForDataSourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeywordsForDataSourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listKeywordsForDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeywordsForDataSource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeywordsForDataSourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListKeywordsForDataSourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all Audit Manager notifications.
     * </p>
     * 
     * @param listNotificationsRequest
     * @return Result of the ListNotifications operation returned by the service.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.ListNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListNotifications" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListNotificationsResult listNotifications(ListNotificationsRequest request) {
        request = beforeClientExecution(request);
        return executeListNotifications(request);
    }

    @SdkInternalApi
    final ListNotificationsResult executeListNotifications(ListNotificationsRequest listNotificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listNotificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListNotificationsRequest> request = null;
        Response<ListNotificationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListNotificationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listNotificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListNotifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListNotificationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListNotificationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of tags for the specified resource in Audit Manager.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
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
     * Enables Audit Manager for the specified Amazon Web Services account.
     * </p>
     * 
     * @param registerAccountRequest
     * @return Result of the RegisterAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSAuditManager.RegisterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RegisterAccountResult registerAccount(RegisterAccountRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterAccount(request);
    }

    @SdkInternalApi
    final RegisterAccountResult executeRegisterAccount(RegisterAccountRequest registerAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(registerAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAccountRequest> request = null;
        Response<RegisterAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAccountRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables an Amazon Web Services account within the organization as the delegated administrator for Audit Manager.
     * </p>
     * 
     * @param registerOrganizationAdminAccountRequest
     * @return Result of the RegisterOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.RegisterOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/RegisterOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterOrganizationAdminAccountResult registerOrganizationAdminAccount(RegisterOrganizationAdminAccountRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterOrganizationAdminAccount(request);
    }

    @SdkInternalApi
    final RegisterOrganizationAdminAccountResult executeRegisterOrganizationAdminAccount(
            RegisterOrganizationAdminAccountRequest registerOrganizationAdminAccountRequest) {

        ExecutionContext executionContext = createExecutionContext(registerOrganizationAdminAccountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOrganizationAdminAccountRequest> request = null;
        Response<RegisterOrganizationAdminAccountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOrganizationAdminAccountRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerOrganizationAdminAccountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterOrganizationAdminAccount");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterOrganizationAdminAccountResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterOrganizationAdminAccountResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a share request for a custom framework in Audit Manager.
     * </p>
     * <p>
     * The share request specifies a recipient and notifies them that a custom framework is available. Recipients have
     * 120 days to accept or decline the request. If no action is taken, the share request expires.
     * </p>
     * <p>
     * When you create a share request, Audit Manager stores a snapshot of your custom framework in the US East (N.
     * Virginia) Amazon Web Services Region. Audit Manager also stores a backup of the same snapshot in the US West
     * (Oregon) Amazon Web Services Region.
     * </p>
     * <p>
     * Audit Manager deletes the snapshot and the backup snapshot when one of the following events occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The sender revokes the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient declines the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The recipient encounters an error and doesn't successfully accept the share request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The share request expires before the recipient responds to the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a sender <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/framework-sharing.html#framework-sharing-resend"
     * >resends a share request</a>, the snapshot is replaced with an updated version that corresponds with the latest
     * version of the custom framework.
     * </p>
     * <p>
     * When a recipient accepts a share request, the snapshot is replicated into their Amazon Web Services account under
     * the Amazon Web Services Region that was specified in the share request.
     * </p>
     * <important>
     * <p>
     * When you invoke the <code>StartAssessmentFrameworkShare</code> API, you are about to share a custom framework
     * with another Amazon Web Services account. You may not share a custom framework that is derived from a standard
     * framework if the standard framework is designated as not eligible for sharing by Amazon Web Services, unless you
     * have obtained permission to do so from the owner of the standard framework. To learn more about which standard
     * frameworks are eligible for sharing, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/share-custom-framework-concepts-and-terminology.html#eligibility"
     * >Framework sharing eligibility</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * </important>
     * 
     * @param startAssessmentFrameworkShareRequest
     * @return Result of the StartAssessmentFrameworkShare operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.StartAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/StartAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartAssessmentFrameworkShareResult startAssessmentFrameworkShare(StartAssessmentFrameworkShareRequest request) {
        request = beforeClientExecution(request);
        return executeStartAssessmentFrameworkShare(request);
    }

    @SdkInternalApi
    final StartAssessmentFrameworkShareResult executeStartAssessmentFrameworkShare(StartAssessmentFrameworkShareRequest startAssessmentFrameworkShareRequest) {

        ExecutionContext executionContext = createExecutionContext(startAssessmentFrameworkShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssessmentFrameworkShareRequest> request = null;
        Response<StartAssessmentFrameworkShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssessmentFrameworkShareRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startAssessmentFrameworkShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAssessmentFrameworkShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAssessmentFrameworkShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAssessmentFrameworkShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags the specified resource in Audit Manager.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
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
     * Removes a tag from a resource in Audit Manager.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
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
     * Edits an Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return Result of the UpdateAssessment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAssessmentResult updateAssessment(UpdateAssessmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessment(request);
    }

    @SdkInternalApi
    final UpdateAssessmentResult executeUpdateAssessment(UpdateAssessmentRequest updateAssessmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentRequest> request = null;
        Response<UpdateAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssessmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a control within an assessment in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentControlRequest
     * @return Result of the UpdateAssessmentControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControl"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentControlResult updateAssessmentControl(UpdateAssessmentControlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentControl(request);
    }

    @SdkInternalApi
    final UpdateAssessmentControlResult executeUpdateAssessmentControl(UpdateAssessmentControlRequest updateAssessmentControlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentControlRequest> request = null;
        Response<UpdateAssessmentControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentControlRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAssessmentControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of a control set in an Audit Manager assessment.
     * </p>
     * 
     * @param updateAssessmentControlSetStatusRequest
     * @return Result of the UpdateAssessmentControlSetStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentControlSetStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentControlSetStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentControlSetStatusResult updateAssessmentControlSetStatus(UpdateAssessmentControlSetStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentControlSetStatus(request);
    }

    @SdkInternalApi
    final UpdateAssessmentControlSetStatusResult executeUpdateAssessmentControlSetStatus(
            UpdateAssessmentControlSetStatusRequest updateAssessmentControlSetStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentControlSetStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentControlSetStatusRequest> request = null;
        Response<UpdateAssessmentControlSetStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentControlSetStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAssessmentControlSetStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentControlSetStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentControlSetStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentControlSetStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkRequest
     * @return Result of the UpdateAssessmentFramework operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentFramework
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFramework"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentFrameworkResult updateAssessmentFramework(UpdateAssessmentFrameworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentFramework(request);
    }

    @SdkInternalApi
    final UpdateAssessmentFrameworkResult executeUpdateAssessmentFramework(UpdateAssessmentFrameworkRequest updateAssessmentFrameworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentFrameworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentFrameworkRequest> request = null;
        Response<UpdateAssessmentFrameworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentFrameworkRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAssessmentFrameworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentFramework");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentFrameworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentFrameworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a share request for a custom framework in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentFrameworkShareRequest
     * @return Result of the UpdateAssessmentFrameworkShare operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateAssessmentFrameworkShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFrameworkShare"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentFrameworkShareResult updateAssessmentFrameworkShare(UpdateAssessmentFrameworkShareRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentFrameworkShare(request);
    }

    @SdkInternalApi
    final UpdateAssessmentFrameworkShareResult executeUpdateAssessmentFrameworkShare(UpdateAssessmentFrameworkShareRequest updateAssessmentFrameworkShareRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentFrameworkShareRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentFrameworkShareRequest> request = null;
        Response<UpdateAssessmentFrameworkShareResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentFrameworkShareRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAssessmentFrameworkShareRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentFrameworkShare");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentFrameworkShareResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentFrameworkShareResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of an assessment in Audit Manager.
     * </p>
     * 
     * @param updateAssessmentStatusRequest
     * @return Result of the UpdateAssessmentStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ServiceQuotaExceededException
     *         You've reached your account quota for this resource type. To perform the requested action, delete some
     *         existing resources or <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">request a quota increase</a>
     *         from the Service Quotas console. For a list of Audit Manager service quotas, see <a
     *         href="https://docs.aws.amazon.com/audit-manager/latest/userguide/service-quotas.html">Quotas and
     *         restrictions for Audit Manager</a>.
     * @sample AWSAuditManager.UpdateAssessmentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAssessmentStatusResult updateAssessmentStatus(UpdateAssessmentStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssessmentStatus(request);
    }

    @SdkInternalApi
    final UpdateAssessmentStatusResult executeUpdateAssessmentStatus(UpdateAssessmentStatusRequest updateAssessmentStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssessmentStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentStatusRequest> request = null;
        Response<UpdateAssessmentStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssessmentStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssessmentStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a custom control in Audit Manager.
     * </p>
     * 
     * @param updateControlRequest
     * @return Result of the UpdateControl operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateControlResult updateControl(UpdateControlRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateControl(request);
    }

    @SdkInternalApi
    final UpdateControlResult executeUpdateControl(UpdateControlRequest updateControlRequest) {

        ExecutionContext executionContext = createExecutionContext(updateControlRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateControlRequest> request = null;
        Response<UpdateControlResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateControlRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateControlRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateControl");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateControlResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateControlResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates Audit Manager settings for the current user account.
     * </p>
     * 
     * @param updateSettingsRequest
     * @return Result of the UpdateSettings operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @sample AWSAuditManager.UpdateSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateSettings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateSettingsResult updateSettings(UpdateSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSettings(request);
    }

    @SdkInternalApi
    final UpdateSettingsResult executeUpdateSettings(UpdateSettingsRequest updateSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSettingsRequest> request = null;
        Response<UpdateSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSettingsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSettingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSettingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates the integrity of an assessment report in Audit Manager.
     * </p>
     * 
     * @param validateAssessmentReportIntegrityRequest
     * @return Result of the ValidateAssessmentReportIntegrity operation returned by the service.
     * @throws ValidationException
     *         The request has invalid or missing parameters.
     * @throws AccessDeniedException
     *         Your account isn't registered with Audit Manager. Check the delegated administrator setup on the Audit
     *         Manager settings page, and try again.
     * @throws InternalServerException
     *         An internal service error occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The resource that's specified in the request can't be found.
     * @sample AWSAuditManager.ValidateAssessmentReportIntegrity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ValidateAssessmentReportIntegrity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateAssessmentReportIntegrityResult validateAssessmentReportIntegrity(ValidateAssessmentReportIntegrityRequest request) {
        request = beforeClientExecution(request);
        return executeValidateAssessmentReportIntegrity(request);
    }

    @SdkInternalApi
    final ValidateAssessmentReportIntegrityResult executeValidateAssessmentReportIntegrity(
            ValidateAssessmentReportIntegrityRequest validateAssessmentReportIntegrityRequest) {

        ExecutionContext executionContext = createExecutionContext(validateAssessmentReportIntegrityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateAssessmentReportIntegrityRequest> request = null;
        Response<ValidateAssessmentReportIntegrityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateAssessmentReportIntegrityRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(validateAssessmentReportIntegrityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "AuditManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateAssessmentReportIntegrity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ValidateAssessmentReportIntegrityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ValidateAssessmentReportIntegrityResultJsonUnmarshaller());
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
