/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging;

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

import com.amazonaws.services.medicalimaging.AWSMedicalImagingClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.medicalimaging.model.*;

import com.amazonaws.services.medicalimaging.model.transform.*;

/**
 * Client for accessing AWS Health Imaging. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is the <i>AWS HealthImaging API Reference</i>. AWS HealthImaging is a HIPAA eligible service that empowers
 * healthcare providers, life science organizations, and their software partners to store, analyze, and share medical
 * images in the cloud at petabyte scale. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/what-is.html"> <i>AWS HealthImaging Developer
 * Guide</i> </a>.
 * </p>
 * <note>
 * <p>
 * We recommend using one of the AWS Software Development Kits (SDKs) for your programming language, as they take care
 * of request authentication, serialization, and connection management. For more information, see <a
 * href="http://aws.amazon.com/developer/tools">Tools to build on AWS</a>.
 * </p>
 * </note>
 * <p>
 * The following sections list AWS HealthImaging API actions categorized according to functionality. Links are provided
 * to actions within this Reference, along with links back to corresponding sections in the <i>AWS HealthImaging
 * Developer Guide</i> where you can view tested code examples.
 * </p>
 * <p class="title">
 * <b>Data store actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_CreateDatastore.html">CreateDatastore</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/create-data-store.html">Creating a data
 * store</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetDatastore.html">GetDatastore</a> – See
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-data-store.html">Getting data store
 * properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListDatastores.html">ListDatastores</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-data-stores.html">Listing data
 * stores</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_DeleteDatastore.html">DeleteDatastore</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/delete-data-store.html">Deleting a data
 * store</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Import job actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_StartDICOMImportJob.html">
 * StartDICOMImportJob</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/start-dicom-import-job.html">Starting an import
 * job</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetDICOMImportJob.html">GetDICOMImportJob</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-dicom-import-job.html">Getting import
 * job properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListDICOMImportJobs.html">
 * ListDICOMImportJobs</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-dicom-import-jobs.html">Listing import jobs</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Image set access actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_SearchImageSets.html">SearchImageSets</a>
 * – See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/search-image-sets.html">Searching image
 * sets</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageSet.html">GetImageSet</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-set-properties.html">Getting image set
 * properties</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageSetMetadata.html">
 * GetImageSetMetadata</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-set-metadata.html">Getting image set
 * metadata</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_GetImageFrame.html">GetImageFrame</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/get-image-frame.html">Getting image set pixel
 * data</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Image set modification actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListImageSetVersions.html">
 * ListImageSetVersions</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-image-set-versions.html">Listing image set
 * versions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_UpdateImageSetMetadata.html">
 * UpdateImageSetMetadata</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/update-image-set-metadata.html">Updating image set
 * metadata</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_CopyImageSet.html">CopyImageSet</a> – See
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/copy-image-set.html">Copying an image set</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_DeleteImageSet.html">DeleteImageSet</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/delete-image-set.html">Deleting an image
 * set</a>.
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Tagging actions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_TagResource.html">TagResource</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/tag-resource.html">Tagging a resource</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_ListTagsForResource.html">
 * ListTagsForResource</a> – See <a
 * href="https://docs.aws.amazon.com/healthimaging/latest/devguide/list-tag-resource.html">Listing tags for a
 * resource</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/healthimaging/latest/APIReference/API_UntagResource.html">UntagResource</a> –
 * See <a href="https://docs.aws.amazon.com/healthimaging/latest/devguide/untag-resource.html">Untagging a resource</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMedicalImagingClient extends AmazonWebServiceClient implements AWSMedicalImaging {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMedicalImaging.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "medical-imaging";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.medicalimaging.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.medicalimaging.model.AWSMedicalImagingException.class));

    public static AWSMedicalImagingClientBuilder builder() {
        return AWSMedicalImagingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Health Imaging using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMedicalImagingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Health Imaging using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMedicalImagingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("medical-imaging.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/medicalimaging/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/medicalimaging/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Copy an image set.
     * </p>
     * 
     * @param copyImageSetRequest
     * @return Result of the CopyImageSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ServiceQuotaExceededException
     *         The request caused a service quota to be exceeded.
     * @sample AWSMedicalImaging.CopyImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CopyImageSetResult copyImageSet(CopyImageSetRequest request) {
        request = beforeClientExecution(request);
        return executeCopyImageSet(request);
    }

    @SdkInternalApi
    final CopyImageSetResult executeCopyImageSet(CopyImageSetRequest copyImageSetRequest) {

        ExecutionContext executionContext = createExecutionContext(copyImageSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyImageSetRequest> request = null;
        Response<CopyImageSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyImageSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyImageSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyImageSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyImageSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyImageSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a data store.
     * </p>
     * 
     * @param createDatastoreRequest
     * @return Result of the CreateDatastore operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ServiceQuotaExceededException
     *         The request caused a service quota to be exceeded.
     * @sample AWSMedicalImaging.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CreateDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatastoreResult createDatastore(CreateDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatastore(request);
    }

    @SdkInternalApi
    final CreateDatastoreResult executeCreateDatastore(CreateDatastoreRequest createDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatastoreRequest> request = null;
        Response<CreateDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a data store.
     * </p>
     * <note>
     * <p>
     * Before a data store can be deleted, you must first delete all image sets within it.
     * </p>
     * </note>
     * 
     * @param deleteDatastoreRequest
     * @return Result of the DeleteDatastore operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatastoreResult deleteDatastore(DeleteDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatastore(request);
    }

    @SdkInternalApi
    final DeleteDatastoreResult executeDeleteDatastore(DeleteDatastoreRequest deleteDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatastoreRequest> request = null;
        Response<DeleteDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an image set.
     * </p>
     * 
     * @param deleteImageSetRequest
     * @return Result of the DeleteImageSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.DeleteImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteImageSetResult deleteImageSet(DeleteImageSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImageSet(request);
    }

    @SdkInternalApi
    final DeleteImageSetResult executeDeleteImageSet(DeleteImageSetRequest deleteImageSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImageSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImageSetRequest> request = null;
        Response<DeleteImageSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImageSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteImageSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImageSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImageSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteImageSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the import job properties to learn more about the job or job progress.
     * </p>
     * <note>
     * <p>
     * The <code>jobStatus</code> refers to the execution of the import job. Therefore, an import job can return a
     * <code>jobStatus</code> as <code>COMPLETED</code> even if validation issues are discovered during the import
     * process. If a <code>jobStatus</code> returns as <code>COMPLETED</code>, we still recommend you review the output
     * manifests written to S3, as they provide details on the success or failure of individual P10 object imports.
     * </p>
     * </note>
     * 
     * @param getDICOMImportJobRequest
     * @return Result of the GetDICOMImportJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.GetDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDICOMImportJobResult getDICOMImportJob(GetDICOMImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeGetDICOMImportJob(request);
    }

    @SdkInternalApi
    final GetDICOMImportJobResult executeGetDICOMImportJob(GetDICOMImportJobRequest getDICOMImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(getDICOMImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDICOMImportJobRequest> request = null;
        Response<GetDICOMImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDICOMImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDICOMImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDICOMImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDICOMImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDICOMImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get data store properties.
     * </p>
     * 
     * @param getDatastoreRequest
     * @return Result of the GetDatastore operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.GetDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDatastoreResult getDatastore(GetDatastoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetDatastore(request);
    }

    @SdkInternalApi
    final GetDatastoreResult executeGetDatastore(GetDatastoreRequest getDatastoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getDatastoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDatastoreRequest> request = null;
        Response<GetDatastoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDatastoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDatastoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDatastore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDatastoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDatastoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get an image frame (pixel data) for an image set.
     * </p>
     * 
     * @param getImageFrameRequest
     * @return Result of the GetImageFrame operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.GetImageFrame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageFrame" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImageFrameResult getImageFrame(GetImageFrameRequest request) {
        request = beforeClientExecution(request);
        return executeGetImageFrame(request);
    }

    @SdkInternalApi
    final GetImageFrameResult executeGetImageFrame(GetImageFrameRequest getImageFrameRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageFrameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageFrameRequest> request = null;
        Response<GetImageFrameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageFrameRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageFrameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImageFrame");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageFrameResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetImageFrameResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get image set properties.
     * </p>
     * 
     * @param getImageSetRequest
     * @return Result of the GetImageSet operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.GetImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetImageSetResult getImageSet(GetImageSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetImageSet(request);
    }

    @SdkInternalApi
    final GetImageSetResult executeGetImageSet(GetImageSetRequest getImageSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageSetRequest> request = null;
        Response<GetImageSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageSetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImageSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImageSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get metadata attributes for an image set.
     * </p>
     * 
     * @param getImageSetMetadataRequest
     * @return Result of the GetImageSetMetadata operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.GetImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetImageSetMetadataResult getImageSetMetadata(GetImageSetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeGetImageSetMetadata(request);
    }

    @SdkInternalApi
    final GetImageSetMetadataResult executeGetImageSetMetadata(GetImageSetMetadataRequest getImageSetMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(getImageSetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImageSetMetadataRequest> request = null;
        Response<GetImageSetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImageSetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImageSetMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImageSetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImageSetMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(false).withHasStreamingSuccessResponse(true), new GetImageSetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            request.addHandlerContext(HandlerContextKey.HAS_STREAMING_OUTPUT, Boolean.TRUE);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List import jobs created for a specific data store.
     * </p>
     * 
     * @param listDICOMImportJobsRequest
     * @return Result of the ListDICOMImportJobs operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.ListDICOMImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDICOMImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDICOMImportJobsResult listDICOMImportJobs(ListDICOMImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDICOMImportJobs(request);
    }

    @SdkInternalApi
    final ListDICOMImportJobsResult executeListDICOMImportJobs(ListDICOMImportJobsRequest listDICOMImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDICOMImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDICOMImportJobsRequest> request = null;
        Response<ListDICOMImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDICOMImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDICOMImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDICOMImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDICOMImportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDICOMImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @return Result of the ListDatastores operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @sample AWSMedicalImaging.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDatastoresResult listDatastores(ListDatastoresRequest request) {
        request = beforeClientExecution(request);
        return executeListDatastores(request);
    }

    @SdkInternalApi
    final ListDatastoresResult executeListDatastores(ListDatastoresRequest listDatastoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatastoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatastoresRequest> request = null;
        Response<ListDatastoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatastoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatastoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatastores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatastoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatastoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List image set versions.
     * </p>
     * 
     * @param listImageSetVersionsRequest
     * @return Result of the ListImageSetVersions operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.ListImageSetVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListImageSetVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListImageSetVersionsResult listImageSetVersions(ListImageSetVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListImageSetVersions(request);
    }

    @SdkInternalApi
    final ListImageSetVersionsResult executeListImageSetVersions(ListImageSetVersionsRequest listImageSetVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImageSetVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImageSetVersionsRequest> request = null;
        Response<ListImageSetVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImageSetVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImageSetVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImageSetVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImageSetVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImageSetVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a medical imaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
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
     * Search image sets based on defined input attributes.
     * </p>
     * <note>
     * <p>
     * <code>SearchImageSets</code> accepts a single search query parameter and returns a paginated response of all
     * image sets that have the matching criteria. All date range queries must be input as
     * <code>(lowerBound, upperBound)</code>.
     * </p>
     * <p>
     * By default, <code>SearchImageSets</code> uses the <code>updatedAt</code> field for sorting in descending order
     * from newest to oldest.
     * </p>
     * </note>
     * 
     * @param searchImageSetsRequest
     * @return Result of the SearchImageSets operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.SearchImageSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchImageSets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchImageSetsResult searchImageSets(SearchImageSetsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchImageSets(request);
    }

    @SdkInternalApi
    final SearchImageSetsResult executeSearchImageSets(SearchImageSetsRequest searchImageSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchImageSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchImageSetsRequest> request = null;
        Response<SearchImageSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchImageSetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchImageSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchImageSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SearchImageSetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchImageSetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Start importing bulk data into an <code>ACTIVE</code> data store. The import job imports DICOM P10 files found in
     * the S3 prefix specified by the <code>inputS3Uri</code> parameter. The import job stores processing results in the
     * file specified by the <code>outputS3Uri</code> parameter.
     * </p>
     * 
     * @param startDICOMImportJobRequest
     * @return Result of the StartDICOMImportJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ServiceQuotaExceededException
     *         The request caused a service quota to be exceeded.
     * @sample AWSMedicalImaging.StartDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/StartDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDICOMImportJobResult startDICOMImportJob(StartDICOMImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeStartDICOMImportJob(request);
    }

    @SdkInternalApi
    final StartDICOMImportJobResult executeStartDICOMImportJob(StartDICOMImportJobRequest startDICOMImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(startDICOMImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDICOMImportJobRequest> request = null;
        Response<StartDICOMImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDICOMImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDICOMImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDICOMImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDICOMImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDICOMImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a user-specifed key and value tag to a medical imaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
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
     * Removes tags from a medical imaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @sample AWSMedicalImaging.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
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
     * Update image set metadata attributes.
     * </p>
     * 
     * @param updateImageSetMetadataRequest
     * @return Result of the UpdateImageSetMetadata operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to throttling.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         The user does not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints set by the service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a resource which does not exist.
     * @throws ServiceQuotaExceededException
     *         The request caused a service quota to be exceeded.
     * @sample AWSMedicalImaging.UpdateImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UpdateImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateImageSetMetadataResult updateImageSetMetadata(UpdateImageSetMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateImageSetMetadata(request);
    }

    @SdkInternalApi
    final UpdateImageSetMetadataResult executeUpdateImageSetMetadata(UpdateImageSetMetadataRequest updateImageSetMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateImageSetMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateImageSetMetadataRequest> request = null;
        Response<UpdateImageSetMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateImageSetMetadataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateImageSetMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Medical Imaging");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateImageSetMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI endpointTraitHost = null;
            if (!clientConfiguration.isDisableHostPrefixInjection()) {

                String hostPrefix = "runtime-";
                String resolvedHostPrefix = String.format("runtime-");

                endpointTraitHost = UriResourcePathUtils.updateUriHost(endpoint, resolvedHostPrefix);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateImageSetMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateImageSetMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext, null, endpointTraitHost);

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
