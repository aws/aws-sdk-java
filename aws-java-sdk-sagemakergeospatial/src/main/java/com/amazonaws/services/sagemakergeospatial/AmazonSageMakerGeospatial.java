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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemakergeospatial.model.*;

/**
 * Interface for accessing Amazon SageMaker geospatial capabilities.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemakergeospatial.AbstractAmazonSageMakerGeospatial} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing SageMaker geospatial resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerGeospatial {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sagemaker-geospatial";

    /**
     * <p>
     * Use this operation to delete an Earth Observation job.
     * </p>
     * 
     * @param deleteEarthObservationJobRequest
     * @return Result of the DeleteEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.DeleteEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEarthObservationJobResult deleteEarthObservationJob(DeleteEarthObservationJobRequest deleteEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to delete a Vector Enrichment job.
     * </p>
     * 
     * @param deleteVectorEnrichmentJobRequest
     * @return Result of the DeleteVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.DeleteVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/DeleteVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVectorEnrichmentJobResult deleteVectorEnrichmentJob(DeleteVectorEnrichmentJobRequest deleteVectorEnrichmentJobRequest);

    /**
     * <p>
     * Use this operation to export results of an Earth Observation job and optionally source images used as input to
     * the EOJ to an S3 location.
     * </p>
     * 
     * @param exportEarthObservationJobRequest
     * @return Result of the ExportEarthObservationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.ExportEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    ExportEarthObservationJobResult exportEarthObservationJob(ExportEarthObservationJobRequest exportEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to copy results of a Vector Enrichment job to an S3 location.
     * </p>
     * 
     * @param exportVectorEnrichmentJobRequest
     * @return Result of the ExportVectorEnrichmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.ExportVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ExportVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    ExportVectorEnrichmentJobResult exportVectorEnrichmentJob(ExportVectorEnrichmentJobRequest exportVectorEnrichmentJobRequest);

    /**
     * <p>
     * Get the details for a previously initiated Earth Observation job.
     * </p>
     * 
     * @param getEarthObservationJobRequest
     * @return Result of the GetEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetEarthObservationJobResult getEarthObservationJob(GetEarthObservationJobRequest getEarthObservationJobRequest);

    /**
     * <p>
     * Use this operation to get details of a specific raster data collection.
     * </p>
     * 
     * @param getRasterDataCollectionRequest
     * @return Result of the GetRasterDataCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    GetRasterDataCollectionResult getRasterDataCollection(GetRasterDataCollectionRequest getRasterDataCollectionRequest);

    /**
     * <p>
     * Gets a web mercator tile for the given Earth Observation job.
     * </p>
     * 
     * @param getTileRequest
     * @return Result of the GetTile operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetTile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetTile" target="_top">AWS
     *      API Documentation</a>
     */
    GetTileResult getTile(GetTileRequest getTileRequest);

    /**
     * <p>
     * Retrieves details of a Vector Enrichment Job for a given job Amazon Resource Name (ARN).
     * </p>
     * 
     * @param getVectorEnrichmentJobRequest
     * @return Result of the GetVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.GetVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetVectorEnrichmentJobResult getVectorEnrichmentJob(GetVectorEnrichmentJobRequest getVectorEnrichmentJobRequest);

    /**
     * <p>
     * Use this operation to get a list of the Earth Observation jobs associated with the calling Amazon Web Services
     * account.
     * </p>
     * 
     * @param listEarthObservationJobsRequest
     * @return Result of the ListEarthObservationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListEarthObservationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListEarthObservationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListEarthObservationJobsResult listEarthObservationJobs(ListEarthObservationJobsRequest listEarthObservationJobsRequest);

    /**
     * <p>
     * Use this operation to get raster data collections.
     * </p>
     * 
     * @param listRasterDataCollectionsRequest
     * @return Result of the ListRasterDataCollections operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListRasterDataCollections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
     *      target="_top">AWS API Documentation</a>
     */
    ListRasterDataCollectionsResult listRasterDataCollections(ListRasterDataCollectionsRequest listRasterDataCollectionsRequest);

    /**
     * <p>
     * Lists the tags attached to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of vector enrichment jobs.
     * </p>
     * 
     * @param listVectorEnrichmentJobsRequest
     * @return Result of the ListVectorEnrichmentJobs operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.ListVectorEnrichmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListVectorEnrichmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListVectorEnrichmentJobsResult listVectorEnrichmentJobs(ListVectorEnrichmentJobsRequest listVectorEnrichmentJobsRequest);

    /**
     * <p>
     * Allows you run image query on a specific raster data collection to get a list of the satellite imagery matching
     * the selected filters.
     * </p>
     * 
     * @param searchRasterDataCollectionRequest
     * @return Result of the SearchRasterDataCollection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.SearchRasterDataCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
     *      target="_top">AWS API Documentation</a>
     */
    SearchRasterDataCollectionResult searchRasterDataCollection(SearchRasterDataCollectionRequest searchRasterDataCollectionRequest);

    /**
     * <p>
     * Use this operation to create an Earth observation job.
     * </p>
     * 
     * @param startEarthObservationJobRequest
     * @return Result of the StartEarthObservationJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StartEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartEarthObservationJobResult startEarthObservationJob(StartEarthObservationJobRequest startEarthObservationJobRequest);

    /**
     * <p>
     * Creates a Vector Enrichment job for the supplied job type. Currently, there are two supported job types: reverse
     * geocoding and map matching.
     * </p>
     * 
     * @param startVectorEnrichmentJobRequest
     * @return Result of the StartVectorEnrichmentJob operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the service quota.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StartVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StartVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartVectorEnrichmentJobResult startVectorEnrichmentJob(StartVectorEnrichmentJobRequest startVectorEnrichmentJobRequest);

    /**
     * <p>
     * Use this operation to stop an existing earth observation job.
     * </p>
     * 
     * @param stopEarthObservationJobRequest
     * @return Result of the StopEarthObservationJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StopEarthObservationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopEarthObservationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopEarthObservationJobResult stopEarthObservationJob(StopEarthObservationJobRequest stopEarthObservationJobRequest);

    /**
     * <p>
     * Stops the Vector Enrichment job for a given job ARN.
     * </p>
     * 
     * @param stopVectorEnrichmentJobRequest
     * @return Result of the StopVectorEnrichmentJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @throws ConflictException
     * @sample AmazonSageMakerGeospatial.StopVectorEnrichmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/StopVectorEnrichmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopVectorEnrichmentJobResult stopVectorEnrichmentJob(StopVectorEnrichmentJobRequest stopVectorEnrichmentJobRequest);

    /**
     * <p>
     * The resource you want to tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The resource you want to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ResourceNotFoundException
     * @sample AmazonSageMakerGeospatial.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
