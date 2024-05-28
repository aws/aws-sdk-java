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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Health Imaging asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public class AWSMedicalImagingAsyncClient extends AWSMedicalImagingClient implements AWSMedicalImagingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMedicalImagingAsyncClientBuilder asyncBuilder() {
        return AWSMedicalImagingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Health Imaging using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMedicalImagingAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Health Imaging using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMedicalImagingAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(CopyImageSetRequest request) {

        return copyImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyImageSetResult> copyImageSetAsync(final CopyImageSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyImageSetRequest, CopyImageSetResult> asyncHandler) {
        final CopyImageSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyImageSetResult>() {
            @Override
            public CopyImageSetResult call() throws Exception {
                CopyImageSetResult result = null;

                try {
                    result = executeCopyImageSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(CreateDatastoreRequest request) {

        return createDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDatastoreResult> createDatastoreAsync(final CreateDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDatastoreRequest, CreateDatastoreResult> asyncHandler) {
        final CreateDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDatastoreResult>() {
            @Override
            public CreateDatastoreResult call() throws Exception {
                CreateDatastoreResult result = null;

                try {
                    result = executeCreateDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(DeleteDatastoreRequest request) {

        return deleteDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatastoreResult> deleteDatastoreAsync(final DeleteDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDatastoreRequest, DeleteDatastoreResult> asyncHandler) {
        final DeleteDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDatastoreResult>() {
            @Override
            public DeleteDatastoreResult call() throws Exception {
                DeleteDatastoreResult result = null;

                try {
                    result = executeDeleteDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(DeleteImageSetRequest request) {

        return deleteImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteImageSetResult> deleteImageSetAsync(final DeleteImageSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteImageSetRequest, DeleteImageSetResult> asyncHandler) {
        final DeleteImageSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteImageSetResult>() {
            @Override
            public DeleteImageSetResult call() throws Exception {
                DeleteImageSetResult result = null;

                try {
                    result = executeDeleteImageSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(GetDICOMImportJobRequest request) {

        return getDICOMImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDICOMImportJobResult> getDICOMImportJobAsync(final GetDICOMImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDICOMImportJobRequest, GetDICOMImportJobResult> asyncHandler) {
        final GetDICOMImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDICOMImportJobResult>() {
            @Override
            public GetDICOMImportJobResult call() throws Exception {
                GetDICOMImportJobResult result = null;

                try {
                    result = executeGetDICOMImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(GetDatastoreRequest request) {

        return getDatastoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDatastoreResult> getDatastoreAsync(final GetDatastoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDatastoreRequest, GetDatastoreResult> asyncHandler) {
        final GetDatastoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDatastoreResult>() {
            @Override
            public GetDatastoreResult call() throws Exception {
                GetDatastoreResult result = null;

                try {
                    result = executeGetDatastore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(GetImageFrameRequest request) {

        return getImageFrameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageFrameResult> getImageFrameAsync(final GetImageFrameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageFrameRequest, GetImageFrameResult> asyncHandler) {
        final GetImageFrameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageFrameResult>() {
            @Override
            public GetImageFrameResult call() throws Exception {
                GetImageFrameResult result = null;

                try {
                    result = executeGetImageFrame(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(GetImageSetRequest request) {

        return getImageSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageSetResult> getImageSetAsync(final GetImageSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageSetRequest, GetImageSetResult> asyncHandler) {
        final GetImageSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageSetResult>() {
            @Override
            public GetImageSetResult call() throws Exception {
                GetImageSetResult result = null;

                try {
                    result = executeGetImageSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(GetImageSetMetadataRequest request) {

        return getImageSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImageSetMetadataResult> getImageSetMetadataAsync(final GetImageSetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetImageSetMetadataRequest, GetImageSetMetadataResult> asyncHandler) {
        final GetImageSetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetImageSetMetadataResult>() {
            @Override
            public GetImageSetMetadataResult call() throws Exception {
                GetImageSetMetadataResult result = null;

                try {
                    result = executeGetImageSetMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(ListDICOMImportJobsRequest request) {

        return listDICOMImportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDICOMImportJobsResult> listDICOMImportJobsAsync(final ListDICOMImportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDICOMImportJobsRequest, ListDICOMImportJobsResult> asyncHandler) {
        final ListDICOMImportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDICOMImportJobsResult>() {
            @Override
            public ListDICOMImportJobsResult call() throws Exception {
                ListDICOMImportJobsResult result = null;

                try {
                    result = executeListDICOMImportJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(ListDatastoresRequest request) {

        return listDatastoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatastoresResult> listDatastoresAsync(final ListDatastoresRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDatastoresRequest, ListDatastoresResult> asyncHandler) {
        final ListDatastoresRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDatastoresResult>() {
            @Override
            public ListDatastoresResult call() throws Exception {
                ListDatastoresResult result = null;

                try {
                    result = executeListDatastores(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(ListImageSetVersionsRequest request) {

        return listImageSetVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImageSetVersionsResult> listImageSetVersionsAsync(final ListImageSetVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListImageSetVersionsRequest, ListImageSetVersionsResult> asyncHandler) {
        final ListImageSetVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListImageSetVersionsResult>() {
            @Override
            public ListImageSetVersionsResult call() throws Exception {
                ListImageSetVersionsResult result = null;

                try {
                    result = executeListImageSetVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(SearchImageSetsRequest request) {

        return searchImageSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchImageSetsResult> searchImageSetsAsync(final SearchImageSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchImageSetsRequest, SearchImageSetsResult> asyncHandler) {
        final SearchImageSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchImageSetsResult>() {
            @Override
            public SearchImageSetsResult call() throws Exception {
                SearchImageSetsResult result = null;

                try {
                    result = executeSearchImageSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(StartDICOMImportJobRequest request) {

        return startDICOMImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDICOMImportJobResult> startDICOMImportJobAsync(final StartDICOMImportJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDICOMImportJobRequest, StartDICOMImportJobResult> asyncHandler) {
        final StartDICOMImportJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDICOMImportJobResult>() {
            @Override
            public StartDICOMImportJobResult call() throws Exception {
                StartDICOMImportJobResult result = null;

                try {
                    result = executeStartDICOMImportJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(UpdateImageSetMetadataRequest request) {

        return updateImageSetMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateImageSetMetadataResult> updateImageSetMetadataAsync(final UpdateImageSetMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateImageSetMetadataRequest, UpdateImageSetMetadataResult> asyncHandler) {
        final UpdateImageSetMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateImageSetMetadataResult>() {
            @Override
            public UpdateImageSetMetadataResult call() throws Exception {
                UpdateImageSetMetadataResult result = null;

                try {
                    result = executeUpdateImageSetMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
