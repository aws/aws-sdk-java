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
package com.amazonaws.services.omics;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;

/**
 * Interface for accessing Amazon Omics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.omics.AbstractAmazonOmicsAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>AWS HealthOmics API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/omics/latest/dev/">What is AWS HealthOmics?</a> in the <i>AWS HealthOmics User
 * Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonOmicsAsync extends AmazonOmics {

    /**
     * <p>
     * Stops a multipart upload.
     * </p>
     * 
     * @param abortMultipartReadSetUploadRequest
     * @return A Java Future containing the result of the AbortMultipartReadSetUpload operation returned by the service.
     * @sample AmazonOmicsAsync.AbortMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AbortMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AbortMultipartReadSetUploadResult> abortMultipartReadSetUploadAsync(
            AbortMultipartReadSetUploadRequest abortMultipartReadSetUploadRequest);

    /**
     * <p>
     * Stops a multipart upload.
     * </p>
     * 
     * @param abortMultipartReadSetUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AbortMultipartReadSetUpload operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.AbortMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AbortMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AbortMultipartReadSetUploadResult> abortMultipartReadSetUploadAsync(
            AbortMultipartReadSetUploadRequest abortMultipartReadSetUploadRequest,
            com.amazonaws.handlers.AsyncHandler<AbortMultipartReadSetUploadRequest, AbortMultipartReadSetUploadResult> asyncHandler);

    /**
     * <p>
     * Accept a resource share request.
     * </p>
     * 
     * @param acceptShareRequest
     * @return A Java Future containing the result of the AcceptShare operation returned by the service.
     * @sample AmazonOmicsAsync.AcceptShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AcceptShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptShareResult> acceptShareAsync(AcceptShareRequest acceptShareRequest);

    /**
     * <p>
     * Accept a resource share request.
     * </p>
     * 
     * @param acceptShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptShare operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.AcceptShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AcceptShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptShareResult> acceptShareAsync(AcceptShareRequest acceptShareRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptShareRequest, AcceptShareResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more read sets.
     * </p>
     * 
     * @param batchDeleteReadSetRequest
     * @return A Java Future containing the result of the BatchDeleteReadSet operation returned by the service.
     * @sample AmazonOmicsAsync.BatchDeleteReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/BatchDeleteReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(BatchDeleteReadSetRequest batchDeleteReadSetRequest);

    /**
     * <p>
     * Deletes one or more read sets.
     * </p>
     * 
     * @param batchDeleteReadSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteReadSet operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.BatchDeleteReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/BatchDeleteReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteReadSetResult> batchDeleteReadSetAsync(BatchDeleteReadSetRequest batchDeleteReadSetRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteReadSetRequest, BatchDeleteReadSetResult> asyncHandler);

    /**
     * <p>
     * Cancels an annotation import job.
     * </p>
     * 
     * @param cancelAnnotationImportJobRequest
     * @return A Java Future containing the result of the CancelAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.CancelAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelAnnotationImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(
            CancelAnnotationImportJobRequest cancelAnnotationImportJobRequest);

    /**
     * <p>
     * Cancels an annotation import job.
     * </p>
     * 
     * @param cancelAnnotationImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CancelAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelAnnotationImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelAnnotationImportJobResult> cancelAnnotationImportJobAsync(
            CancelAnnotationImportJobRequest cancelAnnotationImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelAnnotationImportJobRequest, CancelAnnotationImportJobResult> asyncHandler);

    /**
     * <p>
     * Cancels a run.
     * </p>
     * 
     * @param cancelRunRequest
     * @return A Java Future containing the result of the CancelRun operation returned by the service.
     * @sample AmazonOmicsAsync.CancelRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelRunResult> cancelRunAsync(CancelRunRequest cancelRunRequest);

    /**
     * <p>
     * Cancels a run.
     * </p>
     * 
     * @param cancelRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelRun operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CancelRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelRunResult> cancelRunAsync(CancelRunRequest cancelRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelRunRequest, CancelRunResult> asyncHandler);

    /**
     * <p>
     * Cancels a variant import job.
     * </p>
     * 
     * @param cancelVariantImportJobRequest
     * @return A Java Future containing the result of the CancelVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.CancelVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(CancelVariantImportJobRequest cancelVariantImportJobRequest);

    /**
     * <p>
     * Cancels a variant import job.
     * </p>
     * 
     * @param cancelVariantImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CancelVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelVariantImportJobResult> cancelVariantImportJobAsync(CancelVariantImportJobRequest cancelVariantImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelVariantImportJobRequest, CancelVariantImportJobResult> asyncHandler);

    /**
     * <p>
     * Concludes a multipart upload once you have uploaded all the components.
     * </p>
     * 
     * @param completeMultipartReadSetUploadRequest
     * @return A Java Future containing the result of the CompleteMultipartReadSetUpload operation returned by the
     *         service.
     * @sample AmazonOmicsAsync.CompleteMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CompleteMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteMultipartReadSetUploadResult> completeMultipartReadSetUploadAsync(
            CompleteMultipartReadSetUploadRequest completeMultipartReadSetUploadRequest);

    /**
     * <p>
     * Concludes a multipart upload once you have uploaded all the components.
     * </p>
     * 
     * @param completeMultipartReadSetUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteMultipartReadSetUpload operation returned by the
     *         service.
     * @sample AmazonOmicsAsyncHandler.CompleteMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CompleteMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteMultipartReadSetUploadResult> completeMultipartReadSetUploadAsync(
            CompleteMultipartReadSetUploadRequest completeMultipartReadSetUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteMultipartReadSetUploadRequest, CompleteMultipartReadSetUploadResult> asyncHandler);

    /**
     * <p>
     * Creates an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreRequest
     * @return A Java Future containing the result of the CreateAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsync.CreateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(CreateAnnotationStoreRequest createAnnotationStoreRequest);

    /**
     * <p>
     * Creates an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnnotationStoreResult> createAnnotationStoreAsync(CreateAnnotationStoreRequest createAnnotationStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnnotationStoreRequest, CreateAnnotationStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreVersionRequest
     * @return A Java Future containing the result of the CreateAnnotationStoreVersion operation returned by the
     *         service.
     * @sample AmazonOmicsAsync.CreateAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnnotationStoreVersionResult> createAnnotationStoreVersionAsync(
            CreateAnnotationStoreVersionRequest createAnnotationStoreVersionRequest);

    /**
     * <p>
     * Creates a new version of an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnnotationStoreVersion operation returned by the
     *         service.
     * @sample AmazonOmicsAsyncHandler.CreateAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnnotationStoreVersionResult> createAnnotationStoreVersionAsync(
            CreateAnnotationStoreVersionRequest createAnnotationStoreVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnnotationStoreVersionRequest, CreateAnnotationStoreVersionResult> asyncHandler);

    /**
     * <p>
     * Begins a multipart read set upload.
     * </p>
     * 
     * @param createMultipartReadSetUploadRequest
     * @return A Java Future containing the result of the CreateMultipartReadSetUpload operation returned by the
     *         service.
     * @sample AmazonOmicsAsync.CreateMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultipartReadSetUploadResult> createMultipartReadSetUploadAsync(
            CreateMultipartReadSetUploadRequest createMultipartReadSetUploadRequest);

    /**
     * <p>
     * Begins a multipart read set upload.
     * </p>
     * 
     * @param createMultipartReadSetUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMultipartReadSetUpload operation returned by the
     *         service.
     * @sample AmazonOmicsAsyncHandler.CreateMultipartReadSetUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateMultipartReadSetUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultipartReadSetUploadResult> createMultipartReadSetUploadAsync(
            CreateMultipartReadSetUploadRequest createMultipartReadSetUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMultipartReadSetUploadRequest, CreateMultipartReadSetUploadResult> asyncHandler);

    /**
     * <p>
     * Creates a reference store.
     * </p>
     * 
     * @param createReferenceStoreRequest
     * @return A Java Future containing the result of the CreateReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.CreateReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(CreateReferenceStoreRequest createReferenceStoreRequest);

    /**
     * <p>
     * Creates a reference store.
     * </p>
     * 
     * @param createReferenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReferenceStoreResult> createReferenceStoreAsync(CreateReferenceStoreRequest createReferenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReferenceStoreRequest, CreateReferenceStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a run group.
     * </p>
     * 
     * @param createRunGroupRequest
     * @return A Java Future containing the result of the CreateRunGroup operation returned by the service.
     * @sample AmazonOmicsAsync.CreateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(CreateRunGroupRequest createRunGroupRequest);

    /**
     * <p>
     * Creates a run group.
     * </p>
     * 
     * @param createRunGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRunGroup operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRunGroupResult> createRunGroupAsync(CreateRunGroupRequest createRunGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRunGroupRequest, CreateRunGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a sequence store.
     * </p>
     * 
     * @param createSequenceStoreRequest
     * @return A Java Future containing the result of the CreateSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.CreateSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(CreateSequenceStoreRequest createSequenceStoreRequest);

    /**
     * <p>
     * Creates a sequence store.
     * </p>
     * 
     * @param createSequenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSequenceStoreResult> createSequenceStoreAsync(CreateSequenceStoreRequest createSequenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSequenceStoreRequest, CreateSequenceStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a cross-account shared resource. The resource owner makes an offer to share the resource with the
     * principal subscriber (an AWS user with a different account than the resource owner).
     * </p>
     * <p>
     * The following resources support cross-account sharing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Healthomics variant stores
     * </p>
     * </li>
     * <li>
     * <p>
     * Healthomics annotation stores
     * </p>
     * </li>
     * <li>
     * <p>
     * Private workflows
     * </p>
     * </li>
     * </ul>
     * 
     * @param createShareRequest
     * @return A Java Future containing the result of the CreateShare operation returned by the service.
     * @sample AmazonOmicsAsync.CreateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateShareResult> createShareAsync(CreateShareRequest createShareRequest);

    /**
     * <p>
     * Creates a cross-account shared resource. The resource owner makes an offer to share the resource with the
     * principal subscriber (an AWS user with a different account than the resource owner).
     * </p>
     * <p>
     * The following resources support cross-account sharing:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Healthomics variant stores
     * </p>
     * </li>
     * <li>
     * <p>
     * Healthomics annotation stores
     * </p>
     * </li>
     * <li>
     * <p>
     * Private workflows
     * </p>
     * </li>
     * </ul>
     * 
     * @param createShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateShare operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateShareResult> createShareAsync(CreateShareRequest createShareRequest,
            com.amazonaws.handlers.AsyncHandler<CreateShareRequest, CreateShareResult> asyncHandler);

    /**
     * <p>
     * Creates a variant store.
     * </p>
     * 
     * @param createVariantStoreRequest
     * @return A Java Future containing the result of the CreateVariantStore operation returned by the service.
     * @sample AmazonOmicsAsync.CreateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(CreateVariantStoreRequest createVariantStoreRequest);

    /**
     * <p>
     * Creates a variant store.
     * </p>
     * 
     * @param createVariantStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVariantStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVariantStoreResult> createVariantStoreAsync(CreateVariantStoreRequest createVariantStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVariantStoreRequest, CreateVariantStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AmazonOmicsAsync.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Creates a workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkflow operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkflowResult> createWorkflowAsync(CreateWorkflowRequest createWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkflowRequest, CreateWorkflowResult> asyncHandler);

    /**
     * <p>
     * Deletes an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreRequest
     * @return A Java Future containing the result of the DeleteAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(DeleteAnnotationStoreRequest deleteAnnotationStoreRequest);

    /**
     * <p>
     * Deletes an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnnotationStoreResult> deleteAnnotationStoreAsync(DeleteAnnotationStoreRequest deleteAnnotationStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnnotationStoreRequest, DeleteAnnotationStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes one or multiple versions of an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreVersionsRequest
     * @return A Java Future containing the result of the DeleteAnnotationStoreVersions operation returned by the
     *         service.
     * @sample AmazonOmicsAsync.DeleteAnnotationStoreVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStoreVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnnotationStoreVersionsResult> deleteAnnotationStoreVersionsAsync(
            DeleteAnnotationStoreVersionsRequest deleteAnnotationStoreVersionsRequest);

    /**
     * <p>
     * Deletes one or multiple versions of an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnnotationStoreVersions operation returned by the
     *         service.
     * @sample AmazonOmicsAsyncHandler.DeleteAnnotationStoreVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStoreVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnnotationStoreVersionsResult> deleteAnnotationStoreVersionsAsync(
            DeleteAnnotationStoreVersionsRequest deleteAnnotationStoreVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnnotationStoreVersionsRequest, DeleteAnnotationStoreVersionsResult> asyncHandler);

    /**
     * <p>
     * Deletes a genome reference.
     * </p>
     * 
     * @param deleteReferenceRequest
     * @return A Java Future containing the result of the DeleteReference operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReference" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(DeleteReferenceRequest deleteReferenceRequest);

    /**
     * <p>
     * Deletes a genome reference.
     * </p>
     * 
     * @param deleteReferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReference operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReference" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReferenceResult> deleteReferenceAsync(DeleteReferenceRequest deleteReferenceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReferenceRequest, DeleteReferenceResult> asyncHandler);

    /**
     * <p>
     * Deletes a genome reference store.
     * </p>
     * 
     * @param deleteReferenceStoreRequest
     * @return A Java Future containing the result of the DeleteReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(DeleteReferenceStoreRequest deleteReferenceStoreRequest);

    /**
     * <p>
     * Deletes a genome reference store.
     * </p>
     * 
     * @param deleteReferenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReferenceStoreResult> deleteReferenceStoreAsync(DeleteReferenceStoreRequest deleteReferenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReferenceStoreRequest, DeleteReferenceStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a workflow run.
     * </p>
     * 
     * @param deleteRunRequest
     * @return A Java Future containing the result of the DeleteRun operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest deleteRunRequest);

    /**
     * <p>
     * Deletes a workflow run.
     * </p>
     * 
     * @param deleteRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRun operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRunResult> deleteRunAsync(DeleteRunRequest deleteRunRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRunRequest, DeleteRunResult> asyncHandler);

    /**
     * <p>
     * Deletes a workflow run group.
     * </p>
     * 
     * @param deleteRunGroupRequest
     * @return A Java Future containing the result of the DeleteRunGroup operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(DeleteRunGroupRequest deleteRunGroupRequest);

    /**
     * <p>
     * Deletes a workflow run group.
     * </p>
     * 
     * @param deleteRunGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRunGroup operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRunGroupResult> deleteRunGroupAsync(DeleteRunGroupRequest deleteRunGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRunGroupRequest, DeleteRunGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a sequence store.
     * </p>
     * 
     * @param deleteSequenceStoreRequest
     * @return A Java Future containing the result of the DeleteSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(DeleteSequenceStoreRequest deleteSequenceStoreRequest);

    /**
     * <p>
     * Deletes a sequence store.
     * </p>
     * 
     * @param deleteSequenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSequenceStoreResult> deleteSequenceStoreAsync(DeleteSequenceStoreRequest deleteSequenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSequenceStoreRequest, DeleteSequenceStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource share. If you are the resource owner, the subscriber will no longer have access to the shared
     * resource. If you are the subscriber, this operation deletes your access to the share.
     * </p>
     * 
     * @param deleteShareRequest
     * @return A Java Future containing the result of the DeleteShare operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteShareResult> deleteShareAsync(DeleteShareRequest deleteShareRequest);

    /**
     * <p>
     * Deletes a resource share. If you are the resource owner, the subscriber will no longer have access to the shared
     * resource. If you are the subscriber, this operation deletes your access to the share.
     * </p>
     * 
     * @param deleteShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteShare operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteShareResult> deleteShareAsync(DeleteShareRequest deleteShareRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteShareRequest, DeleteShareResult> asyncHandler);

    /**
     * <p>
     * Deletes a variant store.
     * </p>
     * 
     * @param deleteVariantStoreRequest
     * @return A Java Future containing the result of the DeleteVariantStore operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(DeleteVariantStoreRequest deleteVariantStoreRequest);

    /**
     * <p>
     * Deletes a variant store.
     * </p>
     * 
     * @param deleteVariantStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVariantStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVariantStoreResult> deleteVariantStoreAsync(DeleteVariantStoreRequest deleteVariantStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVariantStoreRequest, DeleteVariantStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AmazonOmicsAsync.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkflow operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkflowResult> deleteWorkflowAsync(DeleteWorkflowRequest deleteWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkflowRequest, DeleteWorkflowResult> asyncHandler);

    /**
     * <p>
     * Gets information about an annotation import job.
     * </p>
     * 
     * @param getAnnotationImportJobRequest
     * @return A Java Future containing the result of the GetAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(GetAnnotationImportJobRequest getAnnotationImportJobRequest);

    /**
     * <p>
     * Gets information about an annotation import job.
     * </p>
     * 
     * @param getAnnotationImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationImportJobResult> getAnnotationImportJobAsync(GetAnnotationImportJobRequest getAnnotationImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnnotationImportJobRequest, GetAnnotationImportJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about an annotation store.
     * </p>
     * 
     * @param getAnnotationStoreRequest
     * @return A Java Future containing the result of the GetAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsync.GetAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(GetAnnotationStoreRequest getAnnotationStoreRequest);

    /**
     * <p>
     * Gets information about an annotation store.
     * </p>
     * 
     * @param getAnnotationStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationStoreResult> getAnnotationStoreAsync(GetAnnotationStoreRequest getAnnotationStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnnotationStoreRequest, GetAnnotationStoreResult> asyncHandler);

    /**
     * <p>
     * Retrieves the metadata for an annotation store version.
     * </p>
     * 
     * @param getAnnotationStoreVersionRequest
     * @return A Java Future containing the result of the GetAnnotationStoreVersion operation returned by the service.
     * @sample AmazonOmicsAsync.GetAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationStoreVersionResult> getAnnotationStoreVersionAsync(
            GetAnnotationStoreVersionRequest getAnnotationStoreVersionRequest);

    /**
     * <p>
     * Retrieves the metadata for an annotation store version.
     * </p>
     * 
     * @param getAnnotationStoreVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnnotationStoreVersion operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAnnotationStoreVersionResult> getAnnotationStoreVersionAsync(
            GetAnnotationStoreVersionRequest getAnnotationStoreVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnnotationStoreVersionRequest, GetAnnotationStoreVersionResult> asyncHandler);

    /**
     * <p>
     * Gets a file from a read set.
     * </p>
     * 
     * @param getReadSetRequest
     * @return A Java Future containing the result of the GetReadSet operation returned by the service.
     * @sample AmazonOmicsAsync.GetReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(GetReadSetRequest getReadSetRequest);

    /**
     * <p>
     * Gets a file from a read set.
     * </p>
     * 
     * @param getReadSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadSet operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetResult> getReadSetAsync(GetReadSetRequest getReadSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadSetRequest, GetReadSetResult> asyncHandler);

    /**
     * <p>
     * Gets information about a read set activation job.
     * </p>
     * 
     * @param getReadSetActivationJobRequest
     * @return A Java Future containing the result of the GetReadSetActivationJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetActivationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(GetReadSetActivationJobRequest getReadSetActivationJobRequest);

    /**
     * <p>
     * Gets information about a read set activation job.
     * </p>
     * 
     * @param getReadSetActivationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadSetActivationJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetActivationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetActivationJobResult> getReadSetActivationJobAsync(GetReadSetActivationJobRequest getReadSetActivationJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadSetActivationJobRequest, GetReadSetActivationJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a read set export job.
     * </p>
     * 
     * @param getReadSetExportJobRequest
     * @return A Java Future containing the result of the GetReadSetExportJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(GetReadSetExportJobRequest getReadSetExportJobRequest);

    /**
     * <p>
     * Gets information about a read set export job.
     * </p>
     * 
     * @param getReadSetExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadSetExportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetExportJobResult> getReadSetExportJobAsync(GetReadSetExportJobRequest getReadSetExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadSetExportJobRequest, GetReadSetExportJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a read set import job.
     * </p>
     * 
     * @param getReadSetImportJobRequest
     * @return A Java Future containing the result of the GetReadSetImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(GetReadSetImportJobRequest getReadSetImportJobRequest);

    /**
     * <p>
     * Gets information about a read set import job.
     * </p>
     * 
     * @param getReadSetImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadSetImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetImportJobResult> getReadSetImportJobAsync(GetReadSetImportJobRequest getReadSetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadSetImportJobRequest, GetReadSetImportJobResult> asyncHandler);

    /**
     * <p>
     * Gets details about a read set.
     * </p>
     * 
     * @param getReadSetMetadataRequest
     * @return A Java Future containing the result of the GetReadSetMetadata operation returned by the service.
     * @sample AmazonOmicsAsync.GetReadSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(GetReadSetMetadataRequest getReadSetMetadataRequest);

    /**
     * <p>
     * Gets details about a read set.
     * </p>
     * 
     * @param getReadSetMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadSetMetadata operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReadSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReadSetMetadataResult> getReadSetMetadataAsync(GetReadSetMetadataRequest getReadSetMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadSetMetadataRequest, GetReadSetMetadataResult> asyncHandler);

    /**
     * <p>
     * Gets a reference file.
     * </p>
     * 
     * @param getReferenceRequest
     * @return A Java Future containing the result of the GetReference operation returned by the service.
     * @sample AmazonOmicsAsync.GetReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReference" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(GetReferenceRequest getReferenceRequest);

    /**
     * <p>
     * Gets a reference file.
     * </p>
     * 
     * @param getReferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReference operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReference" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceResult> getReferenceAsync(GetReferenceRequest getReferenceRequest,
            com.amazonaws.handlers.AsyncHandler<GetReferenceRequest, GetReferenceResult> asyncHandler);

    /**
     * <p>
     * Gets information about a reference import job.
     * </p>
     * 
     * @param getReferenceImportJobRequest
     * @return A Java Future containing the result of the GetReferenceImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(GetReferenceImportJobRequest getReferenceImportJobRequest);

    /**
     * <p>
     * Gets information about a reference import job.
     * </p>
     * 
     * @param getReferenceImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReferenceImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceImportJobResult> getReferenceImportJobAsync(GetReferenceImportJobRequest getReferenceImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetReferenceImportJobRequest, GetReferenceImportJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a genome reference's metadata.
     * </p>
     * 
     * @param getReferenceMetadataRequest
     * @return A Java Future containing the result of the GetReferenceMetadata operation returned by the service.
     * @sample AmazonOmicsAsync.GetReferenceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(GetReferenceMetadataRequest getReferenceMetadataRequest);

    /**
     * <p>
     * Gets information about a genome reference's metadata.
     * </p>
     * 
     * @param getReferenceMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReferenceMetadata operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReferenceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceMetadataResult> getReferenceMetadataAsync(GetReferenceMetadataRequest getReferenceMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetReferenceMetadataRequest, GetReferenceMetadataResult> asyncHandler);

    /**
     * <p>
     * Gets information about a reference store.
     * </p>
     * 
     * @param getReferenceStoreRequest
     * @return A Java Future containing the result of the GetReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.GetReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(GetReferenceStoreRequest getReferenceStoreRequest);

    /**
     * <p>
     * Gets information about a reference store.
     * </p>
     * 
     * @param getReferenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReferenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReferenceStoreResult> getReferenceStoreAsync(GetReferenceStoreRequest getReferenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetReferenceStoreRequest, GetReferenceStoreResult> asyncHandler);

    /**
     * <p>
     * Gets information about a workflow run.
     * </p>
     * <p>
     * If a workflow is shared with you, you cannot export information about the run.
     * </p>
     * 
     * @param getRunRequest
     * @return A Java Future containing the result of the GetRun operation returned by the service.
     * @sample AmazonOmicsAsync.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest getRunRequest);

    /**
     * <p>
     * Gets information about a workflow run.
     * </p>
     * <p>
     * If a workflow is shared with you, you cannot export information about the run.
     * </p>
     * 
     * @param getRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRun operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunResult> getRunAsync(GetRunRequest getRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetRunRequest, GetRunResult> asyncHandler);

    /**
     * <p>
     * Gets information about a workflow run group.
     * </p>
     * 
     * @param getRunGroupRequest
     * @return A Java Future containing the result of the GetRunGroup operation returned by the service.
     * @sample AmazonOmicsAsync.GetRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(GetRunGroupRequest getRunGroupRequest);

    /**
     * <p>
     * Gets information about a workflow run group.
     * </p>
     * 
     * @param getRunGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRunGroup operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunGroupResult> getRunGroupAsync(GetRunGroupRequest getRunGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRunGroupRequest, GetRunGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about a workflow run task.
     * </p>
     * 
     * @param getRunTaskRequest
     * @return A Java Future containing the result of the GetRunTask operation returned by the service.
     * @sample AmazonOmicsAsync.GetRunTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(GetRunTaskRequest getRunTaskRequest);

    /**
     * <p>
     * Gets information about a workflow run task.
     * </p>
     * 
     * @param getRunTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRunTask operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetRunTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRunTaskResult> getRunTaskAsync(GetRunTaskRequest getRunTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetRunTaskRequest, GetRunTaskResult> asyncHandler);

    /**
     * <p>
     * Gets information about a sequence store.
     * </p>
     * 
     * @param getSequenceStoreRequest
     * @return A Java Future containing the result of the GetSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsync.GetSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(GetSequenceStoreRequest getSequenceStoreRequest);

    /**
     * <p>
     * Gets information about a sequence store.
     * </p>
     * 
     * @param getSequenceStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSequenceStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSequenceStoreResult> getSequenceStoreAsync(GetSequenceStoreRequest getSequenceStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetSequenceStoreRequest, GetSequenceStoreResult> asyncHandler);

    /**
     * <p>
     * Retrieves the metadata for the specified resource share.
     * </p>
     * 
     * @param getShareRequest
     * @return A Java Future containing the result of the GetShare operation returned by the service.
     * @sample AmazonOmicsAsync.GetShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetShareResult> getShareAsync(GetShareRequest getShareRequest);

    /**
     * <p>
     * Retrieves the metadata for the specified resource share.
     * </p>
     * 
     * @param getShareRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetShare operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetShare
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetShare" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetShareResult> getShareAsync(GetShareRequest getShareRequest,
            com.amazonaws.handlers.AsyncHandler<GetShareRequest, GetShareResult> asyncHandler);

    /**
     * <p>
     * Gets information about a variant import job.
     * </p>
     * 
     * @param getVariantImportJobRequest
     * @return A Java Future containing the result of the GetVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.GetVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(GetVariantImportJobRequest getVariantImportJobRequest);

    /**
     * <p>
     * Gets information about a variant import job.
     * </p>
     * 
     * @param getVariantImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariantImportJobResult> getVariantImportJobAsync(GetVariantImportJobRequest getVariantImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetVariantImportJobRequest, GetVariantImportJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a variant store.
     * </p>
     * 
     * @param getVariantStoreRequest
     * @return A Java Future containing the result of the GetVariantStore operation returned by the service.
     * @sample AmazonOmicsAsync.GetVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(GetVariantStoreRequest getVariantStoreRequest);

    /**
     * <p>
     * Gets information about a variant store.
     * </p>
     * 
     * @param getVariantStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVariantStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVariantStoreResult> getVariantStoreAsync(GetVariantStoreRequest getVariantStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetVariantStoreRequest, GetVariantStoreResult> asyncHandler);

    /**
     * <p>
     * Gets information about a workflow.
     * </p>
     * <p>
     * If a workflow is shared with you, you cannot export the workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AmazonOmicsAsync.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Gets information about a workflow.
     * </p>
     * <p>
     * If a workflow is shared with you, you cannot export the workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflow operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkflowResult> getWorkflowAsync(GetWorkflowRequest getWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowRequest, GetWorkflowResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of annotation import jobs.
     * </p>
     * 
     * @param listAnnotationImportJobsRequest
     * @return A Java Future containing the result of the ListAnnotationImportJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListAnnotationImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(ListAnnotationImportJobsRequest listAnnotationImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of annotation import jobs.
     * </p>
     * 
     * @param listAnnotationImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnnotationImportJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListAnnotationImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationImportJobsResult> listAnnotationImportJobsAsync(ListAnnotationImportJobsRequest listAnnotationImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnnotationImportJobsRequest, ListAnnotationImportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of an annotation store.
     * </p>
     * 
     * @param listAnnotationStoreVersionsRequest
     * @return A Java Future containing the result of the ListAnnotationStoreVersions operation returned by the service.
     * @sample AmazonOmicsAsync.ListAnnotationStoreVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStoreVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationStoreVersionsResult> listAnnotationStoreVersionsAsync(
            ListAnnotationStoreVersionsRequest listAnnotationStoreVersionsRequest);

    /**
     * <p>
     * Lists the versions of an annotation store.
     * </p>
     * 
     * @param listAnnotationStoreVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnnotationStoreVersions operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListAnnotationStoreVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStoreVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationStoreVersionsResult> listAnnotationStoreVersionsAsync(
            ListAnnotationStoreVersionsRequest listAnnotationStoreVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnnotationStoreVersionsRequest, ListAnnotationStoreVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of annotation stores.
     * </p>
     * 
     * @param listAnnotationStoresRequest
     * @return A Java Future containing the result of the ListAnnotationStores operation returned by the service.
     * @sample AmazonOmicsAsync.ListAnnotationStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(ListAnnotationStoresRequest listAnnotationStoresRequest);

    /**
     * <p>
     * Retrieves a list of annotation stores.
     * </p>
     * 
     * @param listAnnotationStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnnotationStores operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListAnnotationStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAnnotationStoresResult> listAnnotationStoresAsync(ListAnnotationStoresRequest listAnnotationStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnnotationStoresRequest, ListAnnotationStoresResult> asyncHandler);

    /**
     * <p>
     * Lists multipart read set uploads and for in progress uploads. Once the upload is completed, a read set is created
     * and the upload will no longer be returned in the response.
     * </p>
     * 
     * @param listMultipartReadSetUploadsRequest
     * @return A Java Future containing the result of the ListMultipartReadSetUploads operation returned by the service.
     * @sample AmazonOmicsAsync.ListMultipartReadSetUploads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListMultipartReadSetUploads"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultipartReadSetUploadsResult> listMultipartReadSetUploadsAsync(
            ListMultipartReadSetUploadsRequest listMultipartReadSetUploadsRequest);

    /**
     * <p>
     * Lists multipart read set uploads and for in progress uploads. Once the upload is completed, a read set is created
     * and the upload will no longer be returned in the response.
     * </p>
     * 
     * @param listMultipartReadSetUploadsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMultipartReadSetUploads operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListMultipartReadSetUploads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListMultipartReadSetUploads"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultipartReadSetUploadsResult> listMultipartReadSetUploadsAsync(
            ListMultipartReadSetUploadsRequest listMultipartReadSetUploadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMultipartReadSetUploadsRequest, ListMultipartReadSetUploadsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of read set activation jobs.
     * </p>
     * 
     * @param listReadSetActivationJobsRequest
     * @return A Java Future containing the result of the ListReadSetActivationJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListReadSetActivationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetActivationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(
            ListReadSetActivationJobsRequest listReadSetActivationJobsRequest);

    /**
     * <p>
     * Retrieves a list of read set activation jobs.
     * </p>
     * 
     * @param listReadSetActivationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadSetActivationJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReadSetActivationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetActivationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetActivationJobsResult> listReadSetActivationJobsAsync(
            ListReadSetActivationJobsRequest listReadSetActivationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadSetActivationJobsRequest, ListReadSetActivationJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of read set export jobs.
     * </p>
     * 
     * @param listReadSetExportJobsRequest
     * @return A Java Future containing the result of the ListReadSetExportJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListReadSetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(ListReadSetExportJobsRequest listReadSetExportJobsRequest);

    /**
     * <p>
     * Retrieves a list of read set export jobs.
     * </p>
     * 
     * @param listReadSetExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadSetExportJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReadSetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetExportJobsResult> listReadSetExportJobsAsync(ListReadSetExportJobsRequest listReadSetExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadSetExportJobsRequest, ListReadSetExportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of read set import jobs.
     * </p>
     * 
     * @param listReadSetImportJobsRequest
     * @return A Java Future containing the result of the ListReadSetImportJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListReadSetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(ListReadSetImportJobsRequest listReadSetImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of read set import jobs.
     * </p>
     * 
     * @param listReadSetImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadSetImportJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReadSetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetImportJobsResult> listReadSetImportJobsAsync(ListReadSetImportJobsRequest listReadSetImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadSetImportJobsRequest, ListReadSetImportJobsResult> asyncHandler);

    /**
     * <p>
     * This operation will list all parts in a requested multipart upload for a sequence store.
     * </p>
     * 
     * @param listReadSetUploadPartsRequest
     * @return A Java Future containing the result of the ListReadSetUploadParts operation returned by the service.
     * @sample AmazonOmicsAsync.ListReadSetUploadParts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetUploadParts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetUploadPartsResult> listReadSetUploadPartsAsync(ListReadSetUploadPartsRequest listReadSetUploadPartsRequest);

    /**
     * <p>
     * This operation will list all parts in a requested multipart upload for a sequence store.
     * </p>
     * 
     * @param listReadSetUploadPartsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadSetUploadParts operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReadSetUploadParts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetUploadParts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetUploadPartsResult> listReadSetUploadPartsAsync(ListReadSetUploadPartsRequest listReadSetUploadPartsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadSetUploadPartsRequest, ListReadSetUploadPartsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of read sets.
     * </p>
     * 
     * @param listReadSetsRequest
     * @return A Java Future containing the result of the ListReadSets operation returned by the service.
     * @sample AmazonOmicsAsync.ListReadSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(ListReadSetsRequest listReadSetsRequest);

    /**
     * <p>
     * Retrieves a list of read sets.
     * </p>
     * 
     * @param listReadSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadSets operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReadSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReadSetsResult> listReadSetsAsync(ListReadSetsRequest listReadSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadSetsRequest, ListReadSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of reference import jobs.
     * </p>
     * 
     * @param listReferenceImportJobsRequest
     * @return A Java Future containing the result of the ListReferenceImportJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListReferenceImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(ListReferenceImportJobsRequest listReferenceImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of reference import jobs.
     * </p>
     * 
     * @param listReferenceImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReferenceImportJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReferenceImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReferenceImportJobsResult> listReferenceImportJobsAsync(ListReferenceImportJobsRequest listReferenceImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReferenceImportJobsRequest, ListReferenceImportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of reference stores.
     * </p>
     * 
     * @param listReferenceStoresRequest
     * @return A Java Future containing the result of the ListReferenceStores operation returned by the service.
     * @sample AmazonOmicsAsync.ListReferenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(ListReferenceStoresRequest listReferenceStoresRequest);

    /**
     * <p>
     * Retrieves a list of reference stores.
     * </p>
     * 
     * @param listReferenceStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReferenceStores operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReferenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReferenceStoresResult> listReferenceStoresAsync(ListReferenceStoresRequest listReferenceStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListReferenceStoresRequest, ListReferenceStoresResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of references.
     * </p>
     * 
     * @param listReferencesRequest
     * @return A Java Future containing the result of the ListReferences operation returned by the service.
     * @sample AmazonOmicsAsync.ListReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(ListReferencesRequest listReferencesRequest);

    /**
     * <p>
     * Retrieves a list of references.
     * </p>
     * 
     * @param listReferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReferences operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferences" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReferencesResult> listReferencesAsync(ListReferencesRequest listReferencesRequest,
            com.amazonaws.handlers.AsyncHandler<ListReferencesRequest, ListReferencesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of run groups.
     * </p>
     * 
     * @param listRunGroupsRequest
     * @return A Java Future containing the result of the ListRunGroups operation returned by the service.
     * @sample AmazonOmicsAsync.ListRunGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(ListRunGroupsRequest listRunGroupsRequest);

    /**
     * <p>
     * Retrieves a list of run groups.
     * </p>
     * 
     * @param listRunGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRunGroups operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListRunGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunGroupsResult> listRunGroupsAsync(ListRunGroupsRequest listRunGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunGroupsRequest, ListRunGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of tasks for a run.
     * </p>
     * 
     * @param listRunTasksRequest
     * @return A Java Future containing the result of the ListRunTasks operation returned by the service.
     * @sample AmazonOmicsAsync.ListRunTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(ListRunTasksRequest listRunTasksRequest);

    /**
     * <p>
     * Retrieves a list of tasks for a run.
     * </p>
     * 
     * @param listRunTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRunTasks operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListRunTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunTasks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunTasksResult> listRunTasksAsync(ListRunTasksRequest listRunTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunTasksRequest, ListRunTasksResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of runs.
     * </p>
     * 
     * @param listRunsRequest
     * @return A Java Future containing the result of the ListRuns operation returned by the service.
     * @sample AmazonOmicsAsync.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Retrieves a list of runs.
     * </p>
     * 
     * @param listRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuns operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRunsResult> listRunsAsync(ListRunsRequest listRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRunsRequest, ListRunsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of sequence stores.
     * </p>
     * 
     * @param listSequenceStoresRequest
     * @return A Java Future containing the result of the ListSequenceStores operation returned by the service.
     * @sample AmazonOmicsAsync.ListSequenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListSequenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(ListSequenceStoresRequest listSequenceStoresRequest);

    /**
     * <p>
     * Retrieves a list of sequence stores.
     * </p>
     * 
     * @param listSequenceStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSequenceStores operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListSequenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListSequenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSequenceStoresResult> listSequenceStoresAsync(ListSequenceStoresRequest listSequenceStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListSequenceStoresRequest, ListSequenceStoresResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource shares associated with an account. Use the filter parameter to retrieve a specific subset
     * of the shares.
     * </p>
     * 
     * @param listSharesRequest
     * @return A Java Future containing the result of the ListShares operation returned by the service.
     * @sample AmazonOmicsAsync.ListShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListShares" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSharesResult> listSharesAsync(ListSharesRequest listSharesRequest);

    /**
     * <p>
     * Retrieves the resource shares associated with an account. Use the filter parameter to retrieve a specific subset
     * of the shares.
     * </p>
     * 
     * @param listSharesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListShares operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListShares
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListShares" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSharesResult> listSharesAsync(ListSharesRequest listSharesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSharesRequest, ListSharesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonOmicsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of variant import jobs.
     * </p>
     * 
     * @param listVariantImportJobsRequest
     * @return A Java Future containing the result of the ListVariantImportJobs operation returned by the service.
     * @sample AmazonOmicsAsync.ListVariantImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(ListVariantImportJobsRequest listVariantImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of variant import jobs.
     * </p>
     * 
     * @param listVariantImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVariantImportJobs operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListVariantImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVariantImportJobsResult> listVariantImportJobsAsync(ListVariantImportJobsRequest listVariantImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVariantImportJobsRequest, ListVariantImportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of variant stores.
     * </p>
     * 
     * @param listVariantStoresRequest
     * @return A Java Future containing the result of the ListVariantStores operation returned by the service.
     * @sample AmazonOmicsAsync.ListVariantStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(ListVariantStoresRequest listVariantStoresRequest);

    /**
     * <p>
     * Retrieves a list of variant stores.
     * </p>
     * 
     * @param listVariantStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVariantStores operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListVariantStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantStores" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVariantStoresResult> listVariantStoresAsync(ListVariantStoresRequest listVariantStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListVariantStoresRequest, ListVariantStoresResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AmazonOmicsAsync.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Retrieves a list of workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflows operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkflowsResult> listWorkflowsAsync(ListWorkflowsRequest listWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowsRequest, ListWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Starts an annotation import job.
     * </p>
     * 
     * @param startAnnotationImportJobRequest
     * @return A Java Future containing the result of the StartAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(StartAnnotationImportJobRequest startAnnotationImportJobRequest);

    /**
     * <p>
     * Starts an annotation import job.
     * </p>
     * 
     * @param startAnnotationImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAnnotationImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAnnotationImportJobResult> startAnnotationImportJobAsync(StartAnnotationImportJobRequest startAnnotationImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartAnnotationImportJobRequest, StartAnnotationImportJobResult> asyncHandler);

    /**
     * <p>
     * Activates an archived read set. To reduce storage charges, Amazon Omics archives unused read sets after 30 days.
     * </p>
     * 
     * @param startReadSetActivationJobRequest
     * @return A Java Future containing the result of the StartReadSetActivationJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetActivationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(
            StartReadSetActivationJobRequest startReadSetActivationJobRequest);

    /**
     * <p>
     * Activates an archived read set. To reduce storage charges, Amazon Omics archives unused read sets after 30 days.
     * </p>
     * 
     * @param startReadSetActivationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReadSetActivationJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetActivationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetActivationJobResult> startReadSetActivationJobAsync(
            StartReadSetActivationJobRequest startReadSetActivationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartReadSetActivationJobRequest, StartReadSetActivationJobResult> asyncHandler);

    /**
     * <p>
     * Exports a read set to Amazon S3.
     * </p>
     * 
     * @param startReadSetExportJobRequest
     * @return A Java Future containing the result of the StartReadSetExportJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(StartReadSetExportJobRequest startReadSetExportJobRequest);

    /**
     * <p>
     * Exports a read set to Amazon S3.
     * </p>
     * 
     * @param startReadSetExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReadSetExportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetExportJobResult> startReadSetExportJobAsync(StartReadSetExportJobRequest startReadSetExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartReadSetExportJobRequest, StartReadSetExportJobResult> asyncHandler);

    /**
     * <p>
     * Starts a read set import job.
     * </p>
     * 
     * @param startReadSetImportJobRequest
     * @return A Java Future containing the result of the StartReadSetImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(StartReadSetImportJobRequest startReadSetImportJobRequest);

    /**
     * <p>
     * Starts a read set import job.
     * </p>
     * 
     * @param startReadSetImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReadSetImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReadSetImportJobResult> startReadSetImportJobAsync(StartReadSetImportJobRequest startReadSetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartReadSetImportJobRequest, StartReadSetImportJobResult> asyncHandler);

    /**
     * <p>
     * Starts a reference import job.
     * </p>
     * 
     * @param startReferenceImportJobRequest
     * @return A Java Future containing the result of the StartReferenceImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(StartReferenceImportJobRequest startReferenceImportJobRequest);

    /**
     * <p>
     * Starts a reference import job.
     * </p>
     * 
     * @param startReferenceImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReferenceImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartReferenceImportJobResult> startReferenceImportJobAsync(StartReferenceImportJobRequest startReferenceImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartReferenceImportJobRequest, StartReferenceImportJobResult> asyncHandler);

    /**
     * <p>
     * Starts a workflow run. To duplicate a run, specify the run's ID and a role ARN. The remaining parameters are
     * copied from the previous run.
     * </p>
     * <p>
     * StartRun will not support re-run for a workflow that is shared with you.
     * </p>
     * <p>
     * The total number of runs in your account is subject to a quota per Region. To avoid needing to delete runs
     * manually, you can set the retention mode to <code>REMOVE</code>. Runs with this setting are deleted automatically
     * when the run quoata is exceeded.
     * </p>
     * <p>
     * By default, the run uses STATIC storage. For STATIC storage, set the <code>storageCapacity</code> field. You can
     * set the storage type to DYNAMIC. You do not set <code>storageCapacity</code>, because HealthOmics dynamically
     * scales the storage up or down as required. For more information about static and dynamic storage, see <a
     * href="https://docs.aws.amazon.com/omics/latest/dev/Using-workflows.html">Running workflows</a> in the <i>AWS
     * HealthOmics User Guide</i>.
     * </p>
     * 
     * @param startRunRequest
     * @return A Java Future containing the result of the StartRun operation returned by the service.
     * @sample AmazonOmicsAsync.StartRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRunResult> startRunAsync(StartRunRequest startRunRequest);

    /**
     * <p>
     * Starts a workflow run. To duplicate a run, specify the run's ID and a role ARN. The remaining parameters are
     * copied from the previous run.
     * </p>
     * <p>
     * StartRun will not support re-run for a workflow that is shared with you.
     * </p>
     * <p>
     * The total number of runs in your account is subject to a quota per Region. To avoid needing to delete runs
     * manually, you can set the retention mode to <code>REMOVE</code>. Runs with this setting are deleted automatically
     * when the run quoata is exceeded.
     * </p>
     * <p>
     * By default, the run uses STATIC storage. For STATIC storage, set the <code>storageCapacity</code> field. You can
     * set the storage type to DYNAMIC. You do not set <code>storageCapacity</code>, because HealthOmics dynamically
     * scales the storage up or down as required. For more information about static and dynamic storage, see <a
     * href="https://docs.aws.amazon.com/omics/latest/dev/Using-workflows.html">Running workflows</a> in the <i>AWS
     * HealthOmics User Guide</i>.
     * </p>
     * 
     * @param startRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRun operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRunResult> startRunAsync(StartRunRequest startRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartRunRequest, StartRunResult> asyncHandler);

    /**
     * <p>
     * Starts a variant import job.
     * </p>
     * 
     * @param startVariantImportJobRequest
     * @return A Java Future containing the result of the StartVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsync.StartVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(StartVariantImportJobRequest startVariantImportJobRequest);

    /**
     * <p>
     * Starts a variant import job.
     * </p>
     * 
     * @param startVariantImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartVariantImportJob operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.StartVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartVariantImportJobResult> startVariantImportJobAsync(StartVariantImportJobRequest startVariantImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartVariantImportJobRequest, StartVariantImportJobResult> asyncHandler);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonOmicsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonOmicsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an annotation store.
     * </p>
     * 
     * @param updateAnnotationStoreRequest
     * @return A Java Future containing the result of the UpdateAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsync.UpdateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(UpdateAnnotationStoreRequest updateAnnotationStoreRequest);

    /**
     * <p>
     * Updates an annotation store.
     * </p>
     * 
     * @param updateAnnotationStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnnotationStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UpdateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnnotationStoreResult> updateAnnotationStoreAsync(UpdateAnnotationStoreRequest updateAnnotationStoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnnotationStoreRequest, UpdateAnnotationStoreResult> asyncHandler);

    /**
     * <p>
     * Updates the description of an annotation store version.
     * </p>
     * 
     * @param updateAnnotationStoreVersionRequest
     * @return A Java Future containing the result of the UpdateAnnotationStoreVersion operation returned by the
     *         service.
     * @sample AmazonOmicsAsync.UpdateAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnnotationStoreVersionResult> updateAnnotationStoreVersionAsync(
            UpdateAnnotationStoreVersionRequest updateAnnotationStoreVersionRequest);

    /**
     * <p>
     * Updates the description of an annotation store version.
     * </p>
     * 
     * @param updateAnnotationStoreVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnnotationStoreVersion operation returned by the
     *         service.
     * @sample AmazonOmicsAsyncHandler.UpdateAnnotationStoreVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStoreVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnnotationStoreVersionResult> updateAnnotationStoreVersionAsync(
            UpdateAnnotationStoreVersionRequest updateAnnotationStoreVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnnotationStoreVersionRequest, UpdateAnnotationStoreVersionResult> asyncHandler);

    /**
     * <p>
     * Updates a run group.
     * </p>
     * 
     * @param updateRunGroupRequest
     * @return A Java Future containing the result of the UpdateRunGroup operation returned by the service.
     * @sample AmazonOmicsAsync.UpdateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(UpdateRunGroupRequest updateRunGroupRequest);

    /**
     * <p>
     * Updates a run group.
     * </p>
     * 
     * @param updateRunGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRunGroup operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UpdateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRunGroupResult> updateRunGroupAsync(UpdateRunGroupRequest updateRunGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRunGroupRequest, UpdateRunGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a variant store.
     * </p>
     * 
     * @param updateVariantStoreRequest
     * @return A Java Future containing the result of the UpdateVariantStore operation returned by the service.
     * @sample AmazonOmicsAsync.UpdateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(UpdateVariantStoreRequest updateVariantStoreRequest);

    /**
     * <p>
     * Updates a variant store.
     * </p>
     * 
     * @param updateVariantStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVariantStore operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UpdateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVariantStoreResult> updateVariantStoreAsync(UpdateVariantStoreRequest updateVariantStoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVariantStoreRequest, UpdateVariantStoreResult> asyncHandler);

    /**
     * <p>
     * Updates a workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AmazonOmicsAsync.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * <p>
     * Updates a workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkflow operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkflowResult> updateWorkflowAsync(UpdateWorkflowRequest updateWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkflowRequest, UpdateWorkflowResult> asyncHandler);

    /**
     * <p>
     * This operation uploads a specific part of a read set. If you upload a new part using a previously used part
     * number, the previously uploaded part will be overwritten.
     * </p>
     * 
     * @param uploadReadSetPartRequest
     * @return A Java Future containing the result of the UploadReadSetPart operation returned by the service.
     * @sample AmazonOmicsAsync.UploadReadSetPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UploadReadSetPart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UploadReadSetPartResult> uploadReadSetPartAsync(UploadReadSetPartRequest uploadReadSetPartRequest);

    /**
     * <p>
     * This operation uploads a specific part of a read set. If you upload a new part using a previously used part
     * number, the previously uploaded part will be overwritten.
     * </p>
     * 
     * @param uploadReadSetPartRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadReadSetPart operation returned by the service.
     * @sample AmazonOmicsAsyncHandler.UploadReadSetPart
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UploadReadSetPart" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UploadReadSetPartResult> uploadReadSetPartAsync(UploadReadSetPartRequest uploadReadSetPartRequest,
            com.amazonaws.handlers.AsyncHandler<UploadReadSetPartRequest, UploadReadSetPartResult> asyncHandler);

}
