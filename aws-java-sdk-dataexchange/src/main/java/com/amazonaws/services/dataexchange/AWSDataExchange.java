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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.dataexchange.model.*;

/**
 * Interface for accessing AWS Data Exchange.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dataexchange.AbstractAWSDataExchange} instead.
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
public interface AWSDataExchange {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dataexchange";

    /**
     * <p>
     * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * This operation creates a data set.
     * </p>
     * 
     * @param createDataSetRequest
     *        The request body for CreateDataSet.
     * @return Result of the CreateDataSet operation returned by the service.
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws ServiceLimitExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSetResult createDataSet(CreateDataSetRequest createDataSetRequest);

    /**
     * <p>
     * This operation creates a job.
     * </p>
     * 
     * @param createJobRequest
     *        The request body for CreateJob.
     * @return Result of the CreateJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * This operation creates a revision for a data set.
     * </p>
     * 
     * @param createRevisionRequest
     *        The request body for CreateRevision.
     * @return Result of the CreateRevision operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.CreateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRevisionResult createRevision(CreateRevisionRequest createRevisionRequest);

    /**
     * <p>
     * This operation deletes an asset.
     * </p>
     * 
     * @param deleteAssetRequest
     * @return Result of the DeleteAsset operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteAsset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssetResult deleteAsset(DeleteAssetRequest deleteAssetRequest);

    /**
     * <p>
     * This operation deletes a data set.
     * </p>
     * 
     * @param deleteDataSetRequest
     * @return Result of the DeleteDataSet operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSetResult deleteDataSet(DeleteDataSetRequest deleteDataSetRequest);

    /**
     * <p>
     * This operation deletes a revision.
     * </p>
     * 
     * @param deleteRevisionRequest
     * @return Result of the DeleteRevision operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.DeleteRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/DeleteRevision" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRevisionResult deleteRevision(DeleteRevisionRequest deleteRevisionRequest);

    /**
     * <p>
     * This operation returns information about an asset.
     * </p>
     * 
     * @param getAssetRequest
     * @return Result of the GetAsset operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetAsset" target="_top">AWS API
     *      Documentation</a>
     */
    GetAssetResult getAsset(GetAssetRequest getAssetRequest);

    /**
     * <p>
     * This operation returns information about a data set.
     * </p>
     * 
     * @param getDataSetRequest
     * @return Result of the GetDataSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSetResult getDataSet(GetDataSetRequest getDataSetRequest);

    /**
     * <p>
     * This operation returns information about a job.
     * </p>
     * 
     * @param getJobRequest
     * @return Result of the GetJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobResult getJob(GetJobRequest getJobRequest);

    /**
     * <p>
     * This operation returns information about a revision.
     * </p>
     * 
     * @param getRevisionRequest
     * @return Result of the GetRevision operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest);

    /**
     * <p>
     * This operation lists a data set's revisions sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listDataSetRevisionsRequest
     * @return Result of the ListDataSetRevisions operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListDataSetRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSetRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataSetRevisionsResult listDataSetRevisions(ListDataSetRevisionsRequest listDataSetRevisionsRequest);

    /**
     * <p>
     * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending
     * order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
     * </p>
     * 
     * @param listDataSetsRequest
     * @return Result of the ListDataSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListDataSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListDataSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSetsResult listDataSets(ListDataSetsRequest listDataSetsRequest);

    /**
     * <p>
     * This operation lists your jobs sorted by CreatedAt in descending order.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * This operation lists a revision's assets sorted alphabetically in descending order.
     * </p>
     * 
     * @param listRevisionAssetsRequest
     * @return Result of the ListRevisionAssets operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @sample AWSDataExchange.ListRevisionAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListRevisionAssets"
     *      target="_top">AWS API Documentation</a>
     */
    ListRevisionAssetsResult listRevisionAssets(ListRevisionAssetsRequest listRevisionAssetsRequest);

    /**
     * <p>
     * This operation lists the tags on the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSDataExchange.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This operation starts a job.
     * </p>
     * 
     * @param startJobRequest
     * @return Result of the StartJob operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.StartJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/StartJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobResult startJob(StartJobRequest startJobRequest);

    /**
     * <p>
     * This operation tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request body for TagResource.
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSDataExchange.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * This operation removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSDataExchange.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This operation updates an asset.
     * </p>
     * 
     * @param updateAssetRequest
     *        The request body for UpdateAsset.
     * @return Result of the UpdateAsset operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.UpdateAsset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateAsset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAssetResult updateAsset(UpdateAssetRequest updateAssetRequest);

    /**
     * <p>
     * This operation updates a data set.
     * </p>
     * 
     * @param updateDataSetRequest
     *        The request body for UpdateDataSet.
     * @return Result of the UpdateDataSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @sample AWSDataExchange.UpdateDataSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateDataSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSetResult updateDataSet(UpdateDataSetRequest updateDataSetRequest);

    /**
     * <p>
     * This operation updates a revision.
     * </p>
     * 
     * @param updateRevisionRequest
     *        The request body for UpdateRevision.
     * @return Result of the UpdateRevision operation returned by the service.
     * @throws ValidationException
     *         400 response
     * @throws InternalServerException
     *         500 response
     * @throws AccessDeniedException
     *         403 response
     * @throws ResourceNotFoundException
     *         404 response
     * @throws ThrottlingException
     *         429 response
     * @throws ConflictException
     *         409 response
     * @sample AWSDataExchange.UpdateRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateRevision" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRevisionResult updateRevision(UpdateRevisionRequest updateRevisionRequest);

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
