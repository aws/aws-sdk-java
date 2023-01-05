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
package com.amazonaws.services.omics;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.services.omics.waiters.AmazonOmicsWaiters;

/**
 * Interface for accessing Amazon Omics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.omics.AbstractAmazonOmics} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Omics API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/omics/latest/dev/">What is Amazon Omics?</a> in the <i>Amazon Omics Developer
 * Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonOmics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "omics";

    /**
     * <p>
     * Deletes one or more read sets.
     * </p>
     * 
     * @param batchDeleteReadSetRequest
     * @return Result of the BatchDeleteReadSet operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.BatchDeleteReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/BatchDeleteReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteReadSetResult batchDeleteReadSet(BatchDeleteReadSetRequest batchDeleteReadSetRequest);

    /**
     * <p>
     * Cancels an annotation import job.
     * </p>
     * 
     * @param cancelAnnotationImportJobRequest
     * @return Result of the CancelAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CancelAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelAnnotationImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CancelAnnotationImportJobResult cancelAnnotationImportJob(CancelAnnotationImportJobRequest cancelAnnotationImportJobRequest);

    /**
     * <p>
     * Cancels a run.
     * </p>
     * 
     * @param cancelRunRequest
     * @return Result of the CancelRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CancelRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelRun" target="_top">AWS API
     *      Documentation</a>
     */
    CancelRunResult cancelRun(CancelRunRequest cancelRunRequest);

    /**
     * <p>
     * Cancels a variant import job.
     * </p>
     * 
     * @param cancelVariantImportJobRequest
     * @return Result of the CancelVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CancelVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CancelVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    CancelVariantImportJobResult cancelVariantImportJob(CancelVariantImportJobRequest cancelVariantImportJobRequest);

    /**
     * <p>
     * Creates an annotation store.
     * </p>
     * 
     * @param createAnnotationStoreRequest
     * @return Result of the CreateAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CreateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAnnotationStoreResult createAnnotationStore(CreateAnnotationStoreRequest createAnnotationStoreRequest);

    /**
     * <p>
     * Creates a reference store.
     * </p>
     * 
     * @param createReferenceStoreRequest
     * @return Result of the CreateReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    CreateReferenceStoreResult createReferenceStore(CreateReferenceStoreRequest createReferenceStoreRequest);

    /**
     * <p>
     * Creates a run group.
     * </p>
     * 
     * @param createRunGroupRequest
     * @return Result of the CreateRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRunGroupResult createRunGroup(CreateRunGroupRequest createRunGroupRequest);

    /**
     * <p>
     * Creates a sequence store.
     * </p>
     * 
     * @param createSequenceStoreRequest
     * @return Result of the CreateSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSequenceStoreResult createSequenceStore(CreateSequenceStoreRequest createSequenceStoreRequest);

    /**
     * <p>
     * Creates a variant store.
     * </p>
     * 
     * @param createVariantStoreRequest
     * @return Result of the CreateVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.CreateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVariantStoreResult createVariantStore(CreateVariantStoreRequest createVariantStoreRequest);

    /**
     * <p>
     * Creates a workflow.
     * </p>
     * 
     * @param createWorkflowRequest
     * @return Result of the CreateWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.CreateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkflowResult createWorkflow(CreateWorkflowRequest createWorkflowRequest);

    /**
     * <p>
     * Deletes an annotation store.
     * </p>
     * 
     * @param deleteAnnotationStoreRequest
     * @return Result of the DeleteAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.DeleteAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAnnotationStoreResult deleteAnnotationStore(DeleteAnnotationStoreRequest deleteAnnotationStoreRequest);

    /**
     * <p>
     * Deletes a genome reference.
     * </p>
     * 
     * @param deleteReferenceRequest
     * @return Result of the DeleteReference operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReference" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReferenceResult deleteReference(DeleteReferenceRequest deleteReferenceRequest);

    /**
     * <p>
     * Deletes a genome reference store.
     * </p>
     * 
     * @param deleteReferenceStoreRequest
     * @return Result of the DeleteReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteReferenceStoreResult deleteReferenceStore(DeleteReferenceStoreRequest deleteReferenceStoreRequest);

    /**
     * <p>
     * Deletes a workflow run.
     * </p>
     * 
     * @param deleteRunRequest
     * @return Result of the DeleteRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRun" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRunResult deleteRun(DeleteRunRequest deleteRunRequest);

    /**
     * <p>
     * Deletes a workflow run group.
     * </p>
     * 
     * @param deleteRunGroupRequest
     * @return Result of the DeleteRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRunGroupResult deleteRunGroup(DeleteRunGroupRequest deleteRunGroupRequest);

    /**
     * <p>
     * Deletes a sequence store.
     * </p>
     * 
     * @param deleteSequenceStoreRequest
     * @return Result of the DeleteSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSequenceStoreResult deleteSequenceStore(DeleteSequenceStoreRequest deleteSequenceStoreRequest);

    /**
     * <p>
     * Deletes a variant store.
     * </p>
     * 
     * @param deleteVariantStoreRequest
     * @return Result of the DeleteVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.DeleteVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVariantStoreResult deleteVariantStore(DeleteVariantStoreRequest deleteVariantStoreRequest);

    /**
     * <p>
     * Deletes a workflow.
     * </p>
     * 
     * @param deleteWorkflowRequest
     * @return Result of the DeleteWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.DeleteWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/DeleteWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkflowResult deleteWorkflow(DeleteWorkflowRequest deleteWorkflowRequest);

    /**
     * <p>
     * Gets information about an annotation import job.
     * </p>
     * 
     * @param getAnnotationImportJobRequest
     * @return Result of the GetAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetAnnotationImportJobResult getAnnotationImportJob(GetAnnotationImportJobRequest getAnnotationImportJobRequest);

    /**
     * <p>
     * Gets information about an annotation store.
     * </p>
     * 
     * @param getAnnotationStoreRequest
     * @return Result of the GetAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetAnnotationStore" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnnotationStoreResult getAnnotationStore(GetAnnotationStoreRequest getAnnotationStoreRequest);

    /**
     * <p>
     * Gets a file from a read set.
     * </p>
     * 
     * @param getReadSetRequest
     * @return Result of the GetReadSet operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws RangeNotSatisfiableException
     *         The ranges specified in the request are not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetReadSetResult getReadSet(GetReadSetRequest getReadSetRequest);

    /**
     * <p>
     * Gets information about a read set activation job.
     * </p>
     * 
     * @param getReadSetActivationJobRequest
     * @return Result of the GetReadSetActivationJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetActivationJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetReadSetActivationJobResult getReadSetActivationJob(GetReadSetActivationJobRequest getReadSetActivationJobRequest);

    /**
     * <p>
     * Gets information about a read set export job.
     * </p>
     * 
     * @param getReadSetExportJobRequest
     * @return Result of the GetReadSetExportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetReadSetExportJobResult getReadSetExportJob(GetReadSetExportJobRequest getReadSetExportJobRequest);

    /**
     * <p>
     * Gets information about a read set import job.
     * </p>
     * 
     * @param getReadSetImportJobRequest
     * @return Result of the GetReadSetImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetReadSetImportJobResult getReadSetImportJob(GetReadSetImportJobRequest getReadSetImportJobRequest);

    /**
     * <p>
     * Gets details about a read set.
     * </p>
     * 
     * @param getReadSetMetadataRequest
     * @return Result of the GetReadSetMetadata operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReadSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetReadSetMetadataResult getReadSetMetadata(GetReadSetMetadataRequest getReadSetMetadataRequest);

    /**
     * <p>
     * Gets a reference file.
     * </p>
     * 
     * @param getReferenceRequest
     * @return Result of the GetReference operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws RangeNotSatisfiableException
     *         The ranges specified in the request are not valid.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReference" target="_top">AWS API
     *      Documentation</a>
     */
    GetReferenceResult getReference(GetReferenceRequest getReferenceRequest);

    /**
     * <p>
     * Gets information about a reference import job.
     * </p>
     * 
     * @param getReferenceImportJobRequest
     * @return Result of the GetReferenceImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetReferenceImportJobResult getReferenceImportJob(GetReferenceImportJobRequest getReferenceImportJobRequest);

    /**
     * <p>
     * Gets information about a genome reference's metadata.
     * </p>
     * 
     * @param getReferenceMetadataRequest
     * @return Result of the GetReferenceMetadata operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetReferenceMetadataResult getReferenceMetadata(GetReferenceMetadataRequest getReferenceMetadataRequest);

    /**
     * <p>
     * Gets information about a reference store.
     * </p>
     * 
     * @param getReferenceStoreRequest
     * @return Result of the GetReferenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetReferenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReferenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    GetReferenceStoreResult getReferenceStore(GetReferenceStoreRequest getReferenceStoreRequest);

    /**
     * <p>
     * Gets information about a workflow run.
     * </p>
     * 
     * @param getRunRequest
     * @return Result of the GetRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API
     *      Documentation</a>
     */
    GetRunResult getRun(GetRunRequest getRunRequest);

    /**
     * <p>
     * Gets information about a workflow run group.
     * </p>
     * 
     * @param getRunGroupRequest
     * @return Result of the GetRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetRunGroupResult getRunGroup(GetRunGroupRequest getRunGroupRequest);

    /**
     * <p>
     * Gets information about a workflow run task.
     * </p>
     * 
     * @param getRunTaskRequest
     * @return Result of the GetRunTask operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetRunTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRunTask" target="_top">AWS API
     *      Documentation</a>
     */
    GetRunTaskResult getRunTask(GetRunTaskRequest getRunTaskRequest);

    /**
     * <p>
     * Gets information about a sequence store.
     * </p>
     * 
     * @param getSequenceStoreRequest
     * @return Result of the GetSequenceStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetSequenceStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetSequenceStore" target="_top">AWS API
     *      Documentation</a>
     */
    GetSequenceStoreResult getSequenceStore(GetSequenceStoreRequest getSequenceStoreRequest);

    /**
     * <p>
     * Gets information about a variant import job.
     * </p>
     * 
     * @param getVariantImportJobRequest
     * @return Result of the GetVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetVariantImportJobResult getVariantImportJob(GetVariantImportJobRequest getVariantImportJobRequest);

    /**
     * <p>
     * Gets information about a variant store.
     * </p>
     * 
     * @param getVariantStoreRequest
     * @return Result of the GetVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.GetVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    GetVariantStoreResult getVariantStore(GetVariantStoreRequest getVariantStoreRequest);

    /**
     * <p>
     * Gets information about a workflow.
     * </p>
     * 
     * @param getWorkflowRequest
     * @return Result of the GetWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.GetWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkflowResult getWorkflow(GetWorkflowRequest getWorkflowRequest);

    /**
     * <p>
     * Retrieves a list of annotation import jobs.
     * </p>
     * 
     * @param listAnnotationImportJobsRequest
     * @return Result of the ListAnnotationImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListAnnotationImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListAnnotationImportJobsResult listAnnotationImportJobs(ListAnnotationImportJobsRequest listAnnotationImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of annotation stores.
     * </p>
     * 
     * @param listAnnotationStoresRequest
     * @return Result of the ListAnnotationStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListAnnotationStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListAnnotationStores" target="_top">AWS API
     *      Documentation</a>
     */
    ListAnnotationStoresResult listAnnotationStores(ListAnnotationStoresRequest listAnnotationStoresRequest);

    /**
     * <p>
     * Retrieves a list of read set activation jobs.
     * </p>
     * 
     * @param listReadSetActivationJobsRequest
     * @return Result of the ListReadSetActivationJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetActivationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetActivationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListReadSetActivationJobsResult listReadSetActivationJobs(ListReadSetActivationJobsRequest listReadSetActivationJobsRequest);

    /**
     * <p>
     * Retrieves a list of read set export jobs.
     * </p>
     * 
     * @param listReadSetExportJobsRequest
     * @return Result of the ListReadSetExportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListReadSetExportJobsResult listReadSetExportJobs(ListReadSetExportJobsRequest listReadSetExportJobsRequest);

    /**
     * <p>
     * Retrieves a list of read set import jobs.
     * </p>
     * 
     * @param listReadSetImportJobsRequest
     * @return Result of the ListReadSetImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListReadSetImportJobsResult listReadSetImportJobs(ListReadSetImportJobsRequest listReadSetImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of read sets.
     * </p>
     * 
     * @param listReadSetsRequest
     * @return Result of the ListReadSets operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReadSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListReadSetsResult listReadSets(ListReadSetsRequest listReadSetsRequest);

    /**
     * <p>
     * Retrieves a list of reference import jobs.
     * </p>
     * 
     * @param listReferenceImportJobsRequest
     * @return Result of the ListReferenceImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferenceImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListReferenceImportJobsResult listReferenceImportJobs(ListReferenceImportJobsRequest listReferenceImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of reference stores.
     * </p>
     * 
     * @param listReferenceStoresRequest
     * @return Result of the ListReferenceStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    ListReferenceStoresResult listReferenceStores(ListReferenceStoresRequest listReferenceStoresRequest);

    /**
     * <p>
     * Retrieves a list of references.
     * </p>
     * 
     * @param listReferencesRequest
     * @return Result of the ListReferences operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListReferences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReferences" target="_top">AWS API
     *      Documentation</a>
     */
    ListReferencesResult listReferences(ListReferencesRequest listReferencesRequest);

    /**
     * <p>
     * Retrieves a list of run groups.
     * </p>
     * 
     * @param listRunGroupsRequest
     * @return Result of the ListRunGroups operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRunGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListRunGroupsResult listRunGroups(ListRunGroupsRequest listRunGroupsRequest);

    /**
     * <p>
     * Retrieves a list of tasks for a run.
     * </p>
     * 
     * @param listRunTasksRequest
     * @return Result of the ListRunTasks operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRunTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRunTasks" target="_top">AWS API
     *      Documentation</a>
     */
    ListRunTasksResult listRunTasks(ListRunTasksRequest listRunTasksRequest);

    /**
     * <p>
     * Retrieves a list of runs.
     * </p>
     * 
     * @param listRunsRequest
     * @return Result of the ListRuns operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListRunsResult listRuns(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Retrieves a list of sequence stores.
     * </p>
     * 
     * @param listSequenceStoresRequest
     * @return Result of the ListSequenceStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListSequenceStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListSequenceStores" target="_top">AWS API
     *      Documentation</a>
     */
    ListSequenceStoresResult listSequenceStores(ListSequenceStoresRequest listSequenceStoresRequest);

    /**
     * <p>
     * Retrieves a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of variant import jobs.
     * </p>
     * 
     * @param listVariantImportJobsRequest
     * @return Result of the ListVariantImportJobs operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListVariantImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListVariantImportJobsResult listVariantImportJobs(ListVariantImportJobsRequest listVariantImportJobsRequest);

    /**
     * <p>
     * Retrieves a list of variant stores.
     * </p>
     * 
     * @param listVariantStoresRequest
     * @return Result of the ListVariantStores operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.ListVariantStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantStores" target="_top">AWS API
     *      Documentation</a>
     */
    ListVariantStoresResult listVariantStores(ListVariantStoresRequest listVariantStoresRequest);

    /**
     * <p>
     * Retrieves a list of workflows.
     * </p>
     * 
     * @param listWorkflowsRequest
     * @return Result of the ListWorkflows operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.ListWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListWorkflows" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkflowsResult listWorkflows(ListWorkflowsRequest listWorkflowsRequest);

    /**
     * <p>
     * Starts an annotation import job.
     * </p>
     * 
     * @param startAnnotationImportJobRequest
     * @return Result of the StartAnnotationImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.StartAnnotationImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartAnnotationImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartAnnotationImportJobResult startAnnotationImportJob(StartAnnotationImportJobRequest startAnnotationImportJobRequest);

    /**
     * <p>
     * Starts a read set activation job.
     * </p>
     * 
     * @param startReadSetActivationJobRequest
     * @return Result of the StartReadSetActivationJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetActivationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetActivationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartReadSetActivationJobResult startReadSetActivationJob(StartReadSetActivationJobRequest startReadSetActivationJobRequest);

    /**
     * <p>
     * Starts a read set export job.
     * </p>
     * 
     * @param startReadSetExportJobRequest
     * @return Result of the StartReadSetExportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetExportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartReadSetExportJobResult startReadSetExportJob(StartReadSetExportJobRequest startReadSetExportJobRequest);

    /**
     * <p>
     * Starts a read set import job.
     * </p>
     * 
     * @param startReadSetImportJobRequest
     * @return Result of the StartReadSetImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReadSetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReadSetImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartReadSetImportJobResult startReadSetImportJob(StartReadSetImportJobRequest startReadSetImportJobRequest);

    /**
     * <p>
     * Starts a reference import job.
     * </p>
     * 
     * @param startReferenceImportJobRequest
     * @return Result of the StartReferenceImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartReferenceImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReferenceImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartReferenceImportJobResult startReferenceImportJob(StartReferenceImportJobRequest startReferenceImportJobRequest);

    /**
     * <p>
     * Starts a run.
     * </p>
     * 
     * @param startRunRequest
     * @return Result of the StartRun operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.StartRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartRunResult startRun(StartRunRequest startRunRequest);

    /**
     * <p>
     * Starts a variant import job.
     * </p>
     * 
     * @param startVariantImportJobRequest
     * @return Result of the StartVariantImportJob operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.StartVariantImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartVariantImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartVariantImportJobResult startVariantImportJob(StartVariantImportJobRequest startVariantImportJobRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an annotation store.
     * </p>
     * 
     * @param updateAnnotationStoreRequest
     * @return Result of the UpdateAnnotationStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.UpdateAnnotationStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateAnnotationStore" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAnnotationStoreResult updateAnnotationStore(UpdateAnnotationStoreRequest updateAnnotationStoreRequest);

    /**
     * <p>
     * Updates a run group.
     * </p>
     * 
     * @param updateRunGroupRequest
     * @return Result of the UpdateRunGroup operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UpdateRunGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateRunGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRunGroupResult updateRunGroup(UpdateRunGroupRequest updateRunGroupRequest);

    /**
     * <p>
     * Updates a variant store.
     * </p>
     * 
     * @param updateVariantStoreRequest
     * @return Result of the UpdateVariantStore operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonOmics.UpdateVariantStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateVariantStore" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateVariantStoreResult updateVariantStore(UpdateVariantStoreRequest updateVariantStoreRequest);

    /**
     * <p>
     * Updates a workflow.
     * </p>
     * 
     * @param updateWorkflowRequest
     * @return Result of the UpdateWorkflow operation returned by the service.
     * @throws InternalServerException
     *         An unexpected error occurred. Try the request again.
     * @throws ServiceQuotaExceededException
     *         The request exceeds a service quota.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ConflictException
     *         The request cannot be applied to the target resource in its current state.
     * @throws ResourceNotFoundException
     *         The target resource was not found in the current Region.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonOmics.UpdateWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateWorkflow" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkflowResult updateWorkflow(UpdateWorkflowRequest updateWorkflowRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonOmicsWaiters waiters();

}
