/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange;

import javax.annotation.Generated;

import com.amazonaws.services.dataexchange.model.*;

/**
 * Interface for accessing AWS Data Exchange asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dataexchange.AbstractAWSDataExchangeAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Data Exchange is a service that makes it easy for AWS customers to exchange data in the cloud. You can use the
 * AWS Data Exchange APIs to create, update, manage, and access file-based data set in the AWS Cloud.
 * </p>
 * <p>
 * As a subscriber, you can view and access the data sets that you have an entitlement to through a subscription. You
 * can use the APIS to download or copy your entitled data sets to Amazon S3 for use across a variety of AWS analytics
 * and machine learning services.
 * </p>
 * <p>
 * As a provider, you can create and manage your data sets that you would like to publish to a product. Being able to
 * package and provide your data sets into products requires a few steps to determine eligibility. For more information,
 * visit the AWS Data Exchange User Guide.
 * </p>
 * <p>
 * A data set is a collection of data that can be changed or updated over time. Data sets can be updated using
 * revisions, which represent a new version or incremental change to a data set. A revision contains one or more assets.
 * An asset in AWS Data Exchange is a piece of data that can be stored as an Amazon S3 object. The asset can be a
 * structured data file, an image file, or some other data file. Jobs are asynchronous import or export operations used
 * to create or copy assets.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDataExchangeAsync extends AWSDataExchange {

    /**
     * <p>
     * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSDataExchangeAsync.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest
     *        The request body for CreateDataSet.
     * @return A Java Future containing the result of the CreateDataSet operation returned by the service.
     * @sample AWSDataExchangeAsync.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest createDataSetRequest);

    /**
     * <p>
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest
     *        The request body for CreateDataSet.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSet operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest createDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSetRequest, CreateDataSetResult> asyncHandler);

    /**
     * <p>
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest
     *        The request body for CreateJob.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSDataExchangeAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest
     *        The request body for CreateJob.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest
     *        The request body for CreateRevision.
     * @return A Java Future containing the result of the CreateRevision operation returned by the service.
     * @sample AWSDataExchangeAsync.CreateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(CreateRevisionRequest createRevisionRequest);

    /**
     * <p>
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest
     *        The request body for CreateRevision.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRevision operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.CreateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRevisionResult> createRevisionAsync(CreateRevisionRequest createRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRevisionRequest, CreateRevisionResult> asyncHandler);

    /**
     * <p>
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSDataExchangeAsync.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAsset operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAssetResult> deleteAssetAsync(DeleteAssetRequest deleteAssetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssetRequest, DeleteAssetResult> asyncHandler);

    /**
     * <p>
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return A Java Future containing the result of the DeleteDataSet operation returned by the service.
     * @sample AWSDataExchangeAsync.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest deleteDataSetRequest);

    /**
     * <p>
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSet operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest deleteDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSetRequest, DeleteDataSetResult> asyncHandler);

    /**
     * <p>
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @return A Java Future containing the result of the DeleteRevision operation returned by the service.
     * @sample AWSDataExchangeAsync.DeleteRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(DeleteRevisionRequest deleteRevisionRequest);

    /**
     * <p>
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRevision operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.DeleteRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRevisionResult> deleteRevisionAsync(DeleteRevisionRequest deleteRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRevisionRequest, DeleteRevisionResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return A Java Future containing the result of the GetAsset operation returned by the service.
     * @sample AWSDataExchangeAsync.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest getAssetRequest);

    /**
     * <p>
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAsset operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAssetResult> getAssetAsync(GetAssetRequest getAssetRequest,
            com.amazonaws.handlers.AsyncHandler<GetAssetRequest, GetAssetResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @return A Java Future containing the result of the GetDataSet operation returned by the service.
     * @sample AWSDataExchangeAsync.GetDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(GetDataSetRequest getDataSetRequest);

    /**
     * <p>
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSet operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.GetDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataSetResult> getDataSetAsync(GetDataSetRequest getDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSetRequest, GetDataSetResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDataExchangeAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * <p>
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @return A Java Future containing the result of the GetRevision operation returned by the service.
     * @sample AWSDataExchangeAsync.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest getRevisionRequest);

    /**
     * <p>
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRevision operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest getRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler);

    /**
     * <p>
     * This operation lists a data set's revisions sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @return A Java Future containing the result of the ListDataSetRevisions operation returned by the service.
     * @sample AWSDataExchangeAsync.ListDataSetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSetRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(ListDataSetRevisionsRequest listDataSetRevisionsRequest);

    /**
     * <p>
     * This operation lists a data set's revisions sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSetRevisions operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.ListDataSetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSetRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetRevisionsResult> listDataSetRevisionsAsync(ListDataSetRevisionsRequest listDataSetRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSetRevisionsRequest, ListDataSetRevisionsResult> asyncHandler);

    /**
     * <p>
     * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending
     * order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AWSDataExchangeAsync.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest);

    /**
     * <p>
     * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending
     * order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSets operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest listDataSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler);

    /**
     * <p>
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDataExchangeAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * This operation lists a revision's assets sorted alphabetically in descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @return A Java Future containing the result of the ListRevisionAssets operation returned by the service.
     * @sample AWSDataExchangeAsync.ListRevisionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListRevisionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(ListRevisionAssetsRequest listRevisionAssetsRequest);

    /**
     * <p>
     * This operation lists a revision's assets sorted alphabetically in descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRevisionAssets operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.ListRevisionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListRevisionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRevisionAssetsResult> listRevisionAssetsAsync(ListRevisionAssetsRequest listRevisionAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRevisionAssetsRequest, ListRevisionAssetsResult> asyncHandler);

    /**
     * <p>
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataExchangeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @return A Java Future containing the result of the StartJob operation returned by the service.
     * @sample AWSDataExchangeAsync.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest startJobRequest);

    /**
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJob operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobResult> startJobAsync(StartJobRequest startJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRequest, StartJobResult> asyncHandler);

    /**
     * <p>
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request body for TagResource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDataExchangeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request body for TagResource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDataExchangeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest
     *        The request body for UpdateAsset.
     * @return A Java Future containing the result of the UpdateAsset operation returned by the service.
     * @sample AWSDataExchangeAsync.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest updateAssetRequest);

    /**
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest
     *        The request body for UpdateAsset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAsset operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAssetResult> updateAssetAsync(UpdateAssetRequest updateAssetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssetRequest, UpdateAssetResult> asyncHandler);

    /**
     * <p>
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest
     *        The request body for UpdateDataSet.
     * @return A Java Future containing the result of the UpdateDataSet operation returned by the service.
     * @sample AWSDataExchangeAsync.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest updateDataSetRequest);

    /**
     * <p>
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest
     *        The request body for UpdateDataSet.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSet operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest updateDataSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSetRequest, UpdateDataSetResult> asyncHandler);

    /**
     * <p>
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest
     *        The request body for UpdateRevision.
     * @return A Java Future containing the result of the UpdateRevision operation returned by the service.
     * @sample AWSDataExchangeAsync.UpdateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(UpdateRevisionRequest updateRevisionRequest);

    /**
     * <p>
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest
     *        The request body for UpdateRevision.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRevision operation returned by the service.
     * @sample AWSDataExchangeAsyncHandler.UpdateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRevisionResult> updateRevisionAsync(UpdateRevisionRequest updateRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRevisionRequest, UpdateRevisionResult> asyncHandler);

}
