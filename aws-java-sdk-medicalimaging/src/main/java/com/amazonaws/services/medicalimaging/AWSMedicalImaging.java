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

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.medicalimaging.model.*;

/**
 * Interface for accessing AWS Health Imaging.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medicalimaging.AbstractAWSMedicalImaging} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMedicalImaging {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "medical-imaging";

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
    CopyImageSetResult copyImageSet(CopyImageSetRequest copyImageSetRequest);

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
    CreateDatastoreResult createDatastore(CreateDatastoreRequest createDatastoreRequest);

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
    DeleteDatastoreResult deleteDatastore(DeleteDatastoreRequest deleteDatastoreRequest);

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
    DeleteImageSetResult deleteImageSet(DeleteImageSetRequest deleteImageSetRequest);

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
    GetDICOMImportJobResult getDICOMImportJob(GetDICOMImportJobRequest getDICOMImportJobRequest);

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
    GetDatastoreResult getDatastore(GetDatastoreRequest getDatastoreRequest);

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
    GetImageFrameResult getImageFrame(GetImageFrameRequest getImageFrameRequest);

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
    GetImageSetResult getImageSet(GetImageSetRequest getImageSetRequest);

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
    GetImageSetMetadataResult getImageSetMetadata(GetImageSetMetadataRequest getImageSetMetadataRequest);

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
    ListDICOMImportJobsResult listDICOMImportJobs(ListDICOMImportJobsRequest listDICOMImportJobsRequest);

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
    ListDatastoresResult listDatastores(ListDatastoresRequest listDatastoresRequest);

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
    ListImageSetVersionsResult listImageSetVersions(ListImageSetVersionsRequest listImageSetVersionsRequest);

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    SearchImageSetsResult searchImageSets(SearchImageSetsRequest searchImageSetsRequest);

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
    StartDICOMImportJobResult startDICOMImportJob(StartDICOMImportJobRequest startDICOMImportJobRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
    UpdateImageSetMetadataResult updateImageSetMetadata(UpdateImageSetMetadataRequest updateImageSetMetadataRequest);

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

}
