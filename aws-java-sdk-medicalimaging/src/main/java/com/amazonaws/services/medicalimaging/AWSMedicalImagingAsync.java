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

import com.amazonaws.services.medicalimaging.model.*;

/**
 * Interface for accessing AWS Health Imaging asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medicalimaging.AbstractAWSMedicalImagingAsync} instead.
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
public interface AWSMedicalImagingAsync extends AWSMedicalImaging {

    /**
     * <p>
     * Copy an image set.
     * </p>
     * 
     * @param copyImageSetRequest
     * @return A Java Future containing the result of the CopyImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsync.CopyImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(CopyImageSetRequest copyImageSetRequest);

    /**
     * <p>
     * Copy an image set.
     * </p>
     * 
     * @param copyImageSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CopyImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.CopyImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CopyImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(CopyImageSetRequest copyImageSetRequest,
            com.amazonaws.handlers.AsyncHandler<CopyImageSetRequest, CopyImageSetResult> asyncHandler);

    /**
     * <p>
     * Create a data store.
     * </p>
     * 
     * @param createDatastoreRequest
     * @return A Java Future containing the result of the CreateDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsync.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CreateDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest createDatastoreRequest);

    /**
     * <p>
     * Create a data store.
     * </p>
     * 
     * @param createDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CreateDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest createDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatastoreRequest, CreateDatastoreResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsync.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest deleteDatastoreRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteDatastore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest deleteDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatastoreRequest, DeleteDatastoreResult> asyncHandler);

    /**
     * <p>
     * Delete an image set.
     * </p>
     * 
     * @param deleteImageSetRequest
     * @return A Java Future containing the result of the DeleteImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsync.DeleteImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(DeleteImageSetRequest deleteImageSetRequest);

    /**
     * <p>
     * Delete an image set.
     * </p>
     * 
     * @param deleteImageSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.DeleteImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(DeleteImageSetRequest deleteImageSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImageSetRequest, DeleteImageSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDICOMImportJob operation returned by the service.
     * @sample AWSMedicalImagingAsync.GetDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(GetDICOMImportJobRequest getDICOMImportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDICOMImportJob operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.GetDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(GetDICOMImportJobRequest getDICOMImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetDICOMImportJobRequest, GetDICOMImportJobResult> asyncHandler);

    /**
     * <p>
     * Get data store properties.
     * </p>
     * 
     * @param getDatastoreRequest
     * @return A Java Future containing the result of the GetDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsync.GetDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(GetDatastoreRequest getDatastoreRequest);

    /**
     * <p>
     * Get data store properties.
     * </p>
     * 
     * @param getDatastoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatastore operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.GetDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(GetDatastoreRequest getDatastoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatastoreRequest, GetDatastoreResult> asyncHandler);

    /**
     * <p>
     * Get an image frame (pixel data) for an image set.
     * </p>
     * 
     * @param getImageFrameRequest
     * @return A Java Future containing the result of the GetImageFrame operation returned by the service.
     * @sample AWSMedicalImagingAsync.GetImageFrame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageFrame" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(GetImageFrameRequest getImageFrameRequest);

    /**
     * <p>
     * Get an image frame (pixel data) for an image set.
     * </p>
     * 
     * @param getImageFrameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImageFrame operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.GetImageFrame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageFrame" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(GetImageFrameRequest getImageFrameRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageFrameRequest, GetImageFrameResult> asyncHandler);

    /**
     * <p>
     * Get image set properties.
     * </p>
     * 
     * @param getImageSetRequest
     * @return A Java Future containing the result of the GetImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsync.GetImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(GetImageSetRequest getImageSetRequest);

    /**
     * <p>
     * Get image set properties.
     * </p>
     * 
     * @param getImageSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImageSet operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.GetImageSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(GetImageSetRequest getImageSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageSetRequest, GetImageSetResult> asyncHandler);

    /**
     * <p>
     * Get metadata attributes for an image set.
     * </p>
     * 
     * @param getImageSetMetadataRequest
     * @return A Java Future containing the result of the GetImageSetMetadata operation returned by the service.
     * @sample AWSMedicalImagingAsync.GetImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(GetImageSetMetadataRequest getImageSetMetadataRequest);

    /**
     * <p>
     * Get metadata attributes for an image set.
     * </p>
     * 
     * @param getImageSetMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImageSetMetadata operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.GetImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(GetImageSetMetadataRequest getImageSetMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetImageSetMetadataRequest, GetImageSetMetadataResult> asyncHandler);

    /**
     * <p>
     * List import jobs created for a specific data store.
     * </p>
     * 
     * @param listDICOMImportJobsRequest
     * @return A Java Future containing the result of the ListDICOMImportJobs operation returned by the service.
     * @sample AWSMedicalImagingAsync.ListDICOMImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDICOMImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(ListDICOMImportJobsRequest listDICOMImportJobsRequest);

    /**
     * <p>
     * List import jobs created for a specific data store.
     * </p>
     * 
     * @param listDICOMImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDICOMImportJobs operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.ListDICOMImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDICOMImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(ListDICOMImportJobsRequest listDICOMImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDICOMImportJobsRequest, ListDICOMImportJobsResult> asyncHandler);

    /**
     * <p>
     * List data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @return A Java Future containing the result of the ListDatastores operation returned by the service.
     * @sample AWSMedicalImagingAsync.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest listDatastoresRequest);

    /**
     * <p>
     * List data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatastores operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest listDatastoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatastoresRequest, ListDatastoresResult> asyncHandler);

    /**
     * <p>
     * List image set versions.
     * </p>
     * 
     * @param listImageSetVersionsRequest
     * @return A Java Future containing the result of the ListImageSetVersions operation returned by the service.
     * @sample AWSMedicalImagingAsync.ListImageSetVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListImageSetVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(ListImageSetVersionsRequest listImageSetVersionsRequest);

    /**
     * <p>
     * List image set versions.
     * </p>
     * 
     * @param listImageSetVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImageSetVersions operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.ListImageSetVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListImageSetVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(ListImageSetVersionsRequest listImageSetVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImageSetVersionsRequest, ListImageSetVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists all tags associated with a medical imaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMedicalImagingAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags associated with a medical imaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the SearchImageSets operation returned by the service.
     * @sample AWSMedicalImagingAsync.SearchImageSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchImageSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(SearchImageSetsRequest searchImageSetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchImageSets operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.SearchImageSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchImageSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(SearchImageSetsRequest searchImageSetsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchImageSetsRequest, SearchImageSetsResult> asyncHandler);

    /**
     * <p>
     * Start importing bulk data into an <code>ACTIVE</code> data store. The import job imports DICOM P10 files found in
     * the S3 prefix specified by the <code>inputS3Uri</code> parameter. The import job stores processing results in the
     * file specified by the <code>outputS3Uri</code> parameter.
     * </p>
     * 
     * @param startDICOMImportJobRequest
     * @return A Java Future containing the result of the StartDICOMImportJob operation returned by the service.
     * @sample AWSMedicalImagingAsync.StartDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/StartDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(StartDICOMImportJobRequest startDICOMImportJobRequest);

    /**
     * <p>
     * Start importing bulk data into an <code>ACTIVE</code> data store. The import job imports DICOM P10 files found in
     * the S3 prefix specified by the <code>inputS3Uri</code> parameter. The import job stores processing results in the
     * file specified by the <code>outputS3Uri</code> parameter.
     * </p>
     * 
     * @param startDICOMImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDICOMImportJob operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.StartDICOMImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/StartDICOMImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(StartDICOMImportJobRequest startDICOMImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartDICOMImportJobRequest, StartDICOMImportJobResult> asyncHandler);

    /**
     * <p>
     * Adds a user-specifed key and value tag to a medical imaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMedicalImagingAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a user-specifed key and value tag to a medical imaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a medical imaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMedicalImagingAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a medical imaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update image set metadata attributes.
     * </p>
     * 
     * @param updateImageSetMetadataRequest
     * @return A Java Future containing the result of the UpdateImageSetMetadata operation returned by the service.
     * @sample AWSMedicalImagingAsync.UpdateImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UpdateImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(UpdateImageSetMetadataRequest updateImageSetMetadataRequest);

    /**
     * <p>
     * Update image set metadata attributes.
     * </p>
     * 
     * @param updateImageSetMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImageSetMetadata operation returned by the service.
     * @sample AWSMedicalImagingAsyncHandler.UpdateImageSetMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/UpdateImageSetMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(UpdateImageSetMetadataRequest updateImageSetMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImageSetMetadataRequest, UpdateImageSetMetadataResult> asyncHandler);

}
