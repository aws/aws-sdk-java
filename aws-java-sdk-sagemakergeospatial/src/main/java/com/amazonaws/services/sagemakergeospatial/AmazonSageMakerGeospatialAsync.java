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
package com.amazonaws.services.sagemakergeospatial;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;

/**
 * Interface for accessing Amazon SageMaker geospatial capabilities asynchronously. Each asynchronous method will return
 * a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakergeospatial.AbstractAmazonSageMakerGeospatialAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing SageMaker geospatial resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerGeospatialAsync extends AmazonSageMakerGeospatial {

    /**
     * <p>
     * Use this operation to delete an Earth Observation job.
     * </p>
     * 
     * @param deleteEarthObservationJobRequest
     * @return A Java Future containing the result of the DeleteEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.DeleteEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEarthObservationJobResult> deleteEarthObservationJobAsync(
            DeleteEarthObservationJobRequest deleteEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to delete an Earth Observation job.
     * </p>
     * 
     * @param deleteEarthObservationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.DeleteEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEarthObservationJobResult> deleteEarthObservationJobAsync(
            DeleteEarthObservationJobRequest deleteEarthObservationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEarthObservationJobRequest, DeleteEarthObservationJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to delete a Vector Enrichment job.
     * </p>
     * 
     * @param deleteVectorEnrichmentJobRequest
     * @return A Java Future containing the result of the DeleteVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.DeleteVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVectorEnrichmentJobResult> deleteVectorEnrichmentJobAsync(
            DeleteVectorEnrichmentJobRequest deleteVectorEnrichmentJobRequest);

    /**
     * <p>
     * Use this operation to delete a Vector Enrichment job.
     * </p>
     * 
     * @param deleteVectorEnrichmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.DeleteVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVectorEnrichmentJobResult> deleteVectorEnrichmentJobAsync(
            DeleteVectorEnrichmentJobRequest deleteVectorEnrichmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVectorEnrichmentJobRequest, DeleteVectorEnrichmentJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to export results of an Earth Observation job and optionally source images used as input to
     * the EOJ to an S3 location.
     * </p>
     * 
     * @param exportEarthObservationJobRequest
     * @return A Java Future containing the result of the ExportEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ExportEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEarthObservationJobResult> exportEarthObservationJobAsync(
            ExportEarthObservationJobRequest exportEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to export results of an Earth Observation job and optionally source images used as input to
     * the EOJ to an S3 location.
     * </p>
     * 
     * @param exportEarthObservationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ExportEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportEarthObservationJobResult> exportEarthObservationJobAsync(
            ExportEarthObservationJobRequest exportEarthObservationJobRequest,
            com.amazonaws.handlers.AsyncHandler<ExportEarthObservationJobRequest, ExportEarthObservationJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to copy results of a Vector Enrichment job to an S3 location.
     * </p>
     * 
     * @param exportVectorEnrichmentJobRequest
     * @return A Java Future containing the result of the ExportVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ExportVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportVectorEnrichmentJobResult> exportVectorEnrichmentJobAsync(
            ExportVectorEnrichmentJobRequest exportVectorEnrichmentJobRequest);

    /**
     * <p>
     * Use this operation to copy results of a Vector Enrichment job to an S3 location.
     * </p>
     * 
     * @param exportVectorEnrichmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ExportVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportVectorEnrichmentJobResult> exportVectorEnrichmentJobAsync(
            ExportVectorEnrichmentJobRequest exportVectorEnrichmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<ExportVectorEnrichmentJobRequest, ExportVectorEnrichmentJobResult> asyncHandler);

    /**
     * <p>
     * Get the details for a previously initiated Earth Observation job.
     * </p>
     * 
     * @param getEarthObservationJobRequest
     * @return A Java Future containing the result of the GetEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.GetEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEarthObservationJobResult> getEarthObservationJobAsync(GetEarthObservationJobRequest getEarthObservationJobRequest);

    /**
     * <p>
     * Get the details for a previously initiated Earth Observation job.
     * </p>
     * 
     * @param getEarthObservationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.GetEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEarthObservationJobResult> getEarthObservationJobAsync(GetEarthObservationJobRequest getEarthObservationJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetEarthObservationJobRequest, GetEarthObservationJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to get details of a specific raster data collection.
     * </p>
     * 
     * @param getRasterDataCollectionRequest
     * @return A Java Future containing the result of the GetRasterDataCollection operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.GetRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRasterDataCollectionResult> getRasterDataCollectionAsync(GetRasterDataCollectionRequest getRasterDataCollectionRequest);

    /**
     * <p>
     * Use this operation to get details of a specific raster data collection.
     * </p>
     * 
     * @param getRasterDataCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRasterDataCollection operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.GetRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRasterDataCollectionResult> getRasterDataCollectionAsync(GetRasterDataCollectionRequest getRasterDataCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetRasterDataCollectionRequest, GetRasterDataCollectionResult> asyncHandler);

    /**
     * <p>
     * Gets a web mercator tile for the given Earth Observation job.
     * </p>
     * 
     * @param getTileRequest
     * @return A Java Future containing the result of the GetTile operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.GetTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTileResult> getTileAsync(GetTileRequest getTileRequest);

    /**
     * <p>
     * Gets a web mercator tile for the given Earth Observation job.
     * </p>
     * 
     * @param getTileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTile operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.GetTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTileResult> getTileAsync(GetTileRequest getTileRequest,
            com.amazonaws.handlers.AsyncHandler<GetTileRequest, GetTileResult> asyncHandler);

    /**
     * <p>
     * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
     * </p>
     * 
     * @param getVectorEnrichmentJobRequest
     * @return A Java Future containing the result of the GetVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.GetVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVectorEnrichmentJobResult> getVectorEnrichmentJobAsync(GetVectorEnrichmentJobRequest getVectorEnrichmentJobRequest);

    /**
     * <p>
     * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
     * </p>
     * 
     * @param getVectorEnrichmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.GetVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVectorEnrichmentJobResult> getVectorEnrichmentJobAsync(GetVectorEnrichmentJobRequest getVectorEnrichmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetVectorEnrichmentJobRequest, GetVectorEnrichmentJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services
     * account.
     * </p>
     * 
     * @param listEarthObservationJobsRequest
     * @return A Java Future containing the result of the ListEarthObservationJobs operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ListEarthObservationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListEarthObservationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEarthObservationJobsResult> listEarthObservationJobsAsync(ListEarthObservationJobsRequest listEarthObservationJobsRequest);

    /**
     * <p>
     * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services
     * account.
     * </p>
     * 
     * @param listEarthObservationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEarthObservationJobs operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ListEarthObservationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListEarthObservationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEarthObservationJobsResult> listEarthObservationJobsAsync(ListEarthObservationJobsRequest listEarthObservationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEarthObservationJobsRequest, ListEarthObservationJobsResult> asyncHandler);

    /**
     * <p>
     * Use this operation to get raster data collections.
     * </p>
     * 
     * @param listRasterDataCollectionsRequest
     * @return A Java Future containing the result of the ListRasterDataCollections operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ListRasterDataCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRasterDataCollectionsResult> listRasterDataCollectionsAsync(
            ListRasterDataCollectionsRequest listRasterDataCollectionsRequest);

    /**
     * <p>
     * Use this operation to get raster data collections.
     * </p>
     * 
     * @param listRasterDataCollectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRasterDataCollections operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ListRasterDataCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRasterDataCollectionsResult> listRasterDataCollectionsAsync(
            ListRasterDataCollectionsRequest listRasterDataCollectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRasterDataCollectionsRequest, ListRasterDataCollectionsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of vector enrichment jobs.
     * </p>
     * 
     * @param listVectorEnrichmentJobsRequest
     * @return A Java Future containing the result of the ListVectorEnrichmentJobs operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.ListVectorEnrichmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVectorEnrichmentJobsResult> listVectorEnrichmentJobsAsync(ListVectorEnrichmentJobsRequest listVectorEnrichmentJobsRequest);

    /**
     * <p>
     * Retrieves a list of vector enrichment jobs.
     * </p>
     * 
     * @param listVectorEnrichmentJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVectorEnrichmentJobs operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.ListVectorEnrichmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVectorEnrichmentJobsResult> listVectorEnrichmentJobsAsync(ListVectorEnrichmentJobsRequest listVectorEnrichmentJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVectorEnrichmentJobsRequest, ListVectorEnrichmentJobsResult> asyncHandler);

    /**
     * <p>
     * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching
     * the selected filters.
     * </p>
     * 
     * @param searchRasterDataCollectionRequest
     * @return A Java Future containing the result of the SearchRasterDataCollection operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.SearchRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchRasterDataCollectionResult> searchRasterDataCollectionAsync(
            SearchRasterDataCollectionRequest searchRasterDataCollectionRequest);

    /**
     * <p>
     * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching
     * the selected filters.
     * </p>
     * 
     * @param searchRasterDataCollectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchRasterDataCollection operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.SearchRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchRasterDataCollectionResult> searchRasterDataCollectionAsync(
            SearchRasterDataCollectionRequest searchRasterDataCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRasterDataCollectionRequest, SearchRasterDataCollectionResult> asyncHandler);

    /**
     * <p>
     * Use this operation to create an Earth observation job.
     * </p>
     * 
     * @param startEarthObservationJobRequest
     * @return A Java Future containing the result of the StartEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.StartEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEarthObservationJobResult> startEarthObservationJobAsync(StartEarthObservationJobRequest startEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to create an Earth observation job.
     * </p>
     * 
     * @param startEarthObservationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.StartEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEarthObservationJobResult> startEarthObservationJobAsync(StartEarthObservationJobRequest startEarthObservationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartEarthObservationJobRequest, StartEarthObservationJobResult> asyncHandler);

    /**
     * <p>
     * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse
     * geocoding and map matching.
     * </p>
     * 
     * @param startVectorEnrichmentJobRequest
     * @return A Java Future containing the result of the StartVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.StartVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVectorEnrichmentJobResult> startVectorEnrichmentJobAsync(StartVectorEnrichmentJobRequest startVectorEnrichmentJobRequest);

    /**
     * <p>
     * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse
     * geocoding and map matching.
     * </p>
     * 
     * @param startVectorEnrichmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.StartVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVectorEnrichmentJobResult> startVectorEnrichmentJobAsync(StartVectorEnrichmentJobRequest startVectorEnrichmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartVectorEnrichmentJobRequest, StartVectorEnrichmentJobResult> asyncHandler);

    /**
     * <p>
     * Use this operation to stop an existing earth observation job.
     * </p>
     * 
     * @param stopEarthObservationJobRequest
     * @return A Java Future containing the result of the StopEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.StopEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEarthObservationJobResult> stopEarthObservationJobAsync(StopEarthObservationJobRequest stopEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to stop an existing earth observation job.
     * </p>
     * 
     * @param stopEarthObservationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopEarthObservationJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.StopEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopEarthObservationJobResult> stopEarthObservationJobAsync(StopEarthObservationJobRequest stopEarthObservationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopEarthObservationJobRequest, StopEarthObservationJobResult> asyncHandler);

    /**
     * <p>
     * Stops the Vector Enrichment job for a given job ARN.
     * </p>
     * 
     * @param stopVectorEnrichmentJobRequest
     * @return A Java Future containing the result of the StopVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.StopVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVectorEnrichmentJobResult> stopVectorEnrichmentJobAsync(StopVectorEnrichmentJobRequest stopVectorEnrichmentJobRequest);

    /**
     * <p>
     * Stops the Vector Enrichment job for a given job ARN.
     * </p>
     * 
     * @param stopVectorEnrichmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopVectorEnrichmentJob operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.StopVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVectorEnrichmentJobResult> stopVectorEnrichmentJobAsync(StopVectorEnrichmentJobRequest stopVectorEnrichmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopVectorEnrichmentJobRequest, StopVectorEnrichmentJobResult> asyncHandler);

    /**
     * <p>
     * The resource you want to tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The resource you want to tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * The resource you want to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * The resource you want to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonSageMakerGeospatialAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
