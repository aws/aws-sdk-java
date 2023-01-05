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
package com.amazonaws.services.personalize;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.personalize.model.*;

/**
 * Interface for accessing Amazon Personalize.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalize.AbstractAmazonPersonalize} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
 * customers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalize {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "personalize";

    /**
     * <p>
     * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in
     * JSON format. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/creating-batch-inference-job.html">Creating a batch
     * inference job</a>.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @return Result of the CreateBatchInferenceJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBatchInferenceJobResult createBatchInferenceJob(CreateBatchInferenceJobRequest createBatchInferenceJobRequest);

    /**
     * <p>
     * Creates a batch segment job. The operation can handle up to 50 million records and the input file must be in JSON
     * format. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recommendations-batch.html">Getting batch recommendations
     * and user segments</a>.
     * </p>
     * 
     * @param createBatchSegmentJobRequest
     * @return Result of the CreateBatchSegmentJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateBatchSegmentJobResult createBatchSegmentJob(CreateBatchSegmentJobRequest createBatchSegmentJobRequest);

    /**
     * <p>
     * Creates a campaign that deploys a solution version. When a client calls the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * and <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html">
     * GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <p>
     * A transaction is a single <code>GetRecommendations</code> or <code>GetPersonalizedRanking</code> call.
     * Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum
     * provisioned TPS (<code>minProvisionedTPS</code>) specifies the baseline throughput provisioned by Amazon
     * Personalize, and thus, the minimum billing charge.
     * </p>
     * <p>
     * If your TPS increases beyond <code>minProvisionedTPS</code>, Amazon Personalize auto-scales the provisioned
     * capacity up and down, but never below <code>minProvisionedTPS</code>. There's a short time delay while the
     * capacity is increased that might cause loss of transactions.
     * </p>
     * <p>
     * The actual TPS used is calculated as the average requests/second within a 5-minute window. You pay for maximum of
     * either the minimum provisioned TPS or the actual TPS. We recommend starting with a low
     * <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch metrics, and then increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the campaign status, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeCampaign.html">DescribeCampaign</a>.
     * </p>
     * <note>
     * <p>
     * Wait until the <code>status</code> of the campaign is <code>ACTIVE</code> before asking the campaign for
     * recommendations.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListCampaigns.html">ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeCampaign.html">DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_UpdateCampaign.html">UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteCampaign.html">DeleteCampaign</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a> to import your training data to a dataset.
     * </p>
     * <p>
     * There are three types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types. Only the <code>Interactions</code> dataset
     * is required in order to train a model (also referred to as creating a solution).
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html">DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListDatasets.html">ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html">DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteDataset.html">DeleteDataset</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a job that exports data from your dataset to an Amazon S3 bucket. To allow Amazon Personalize to export
     * the training data, you must specify an service-linked IAM role that gives Amazon Personalize
     * <code>PutObject</code> permissions for your Amazon S3 bucket. For information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/export-data.html">Exporting a dataset</a> in the Amazon
     * Personalize developer guide.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A dataset export job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the export job, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDatasetExportJob.html"
     * >DescribeDatasetExportJob</a>, and specify the Amazon Resource Name (ARN) of the dataset export job. The dataset
     * export is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * 
     * @param createDatasetExportJobRequest
     * @return Result of the CreateDatasetExportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatasetExportJobResult createDatasetExportJob(CreateDatasetExportJobRequest createDatasetExportJobRequest);

    /**
     * <p>
     * Creates an empty dataset group. A dataset group is a container for Amazon Personalize resources. A dataset group
     * can contain at most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * A dataset group can be a Domain dataset group, where you specify a domain and use pre-configured resources like
     * recommenders, or a Custom dataset group, where you use custom resources, such as a solution with a solution
     * version, that you deploy with a campaign. If you start with a Domain dataset group, you can still add custom
     * resources such as solutions and solution versions trained with recipes for custom use cases and deployed with
     * campaigns.
     * </p>
     * <p>
     * A dataset group can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset group, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>.
     * If the status shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why
     * the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is <code>ACTIVE</code> before adding a dataset
     * to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a KMS
     * key, you must also include an Identity and Access Management (IAM) role that has permission to access the key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListDatasetGroups.html">ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteDatasetGroup.html">DeleteDatasetGroup</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetGroupRequest
     * @return Result of the CreateDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatasetGroupResult createDatasetGroup(CreateDatasetGroupRequest createDatasetGroupRequest);

    /**
     * <p>
     * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize
     * dataset. To allow Amazon Personalize to ACTIVE -or- CREATE FAILED
     * </p>
     * </li> </ul>
     * <p>
     * To get the status of the import job, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDatasetImportJob.html"
     * >DescribeDatasetImportJob</a>, providing the Amazon Resource Name (ARN) of the dataset import job. The dataset
     * import is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a
     * <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * <note>
     * <p>
     * Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListDatasetImportJobs.html">ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDatasetImportJob.html">
     * DescribeDatasetImportJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetImportJobRequest
     * @return Result of the CreateDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatasetImportJobResult createDatasetImportJob(CreateDatasetImportJobRequest createDatasetImportJobRequest);

    /**
     * <p>
     * Creates an event tracker that you use when adding event data to a specified dataset group using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will get an error if you call
     * <code>CreateEventTracker</code> using the same dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you create an event tracker, the response includes a tracking ID, which you pass as a parameter when you use
     * the <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> operation.
     * Amazon Personalize then appends the event data to the Interactions dataset of the dataset group you specify in
     * your event tracker.
     * </p>
     * <p>
     * The event tracker can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the event tracker, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeEventTracker.html">DescribeEventTracker</a>.
     * </p>
     * <note>
     * <p>
     * The event tracker must be in the ACTIVE state before using the tracking ID.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListEventTrackers.html">ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeEventTracker.html">DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteEventTracker.html">DeleteEventTracker</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventTrackerRequest
     * @return Result of the CreateEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEventTrackerResult createEventTracker(CreateEventTrackerRequest createEventTrackerRequest);

    /**
     * <p>
     * Creates a recommendation filter. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @param createFilterRequest
     * @return Result of the CreateFilter operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a metric attribution. A metric attribution creates reports on the data that you import into Amazon
     * Personalize. Depending on how you imported the data, you can view reports in Amazon CloudWatch or Amazon S3. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html">Measuring impact of
     * recommendations</a>.
     * </p>
     * 
     * @param createMetricAttributionRequest
     * @return Result of the CreateMetricAttribution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonPersonalize.CreateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMetricAttributionResult createMetricAttribution(CreateMetricAttributionRequest createMetricAttributionRequest);

    /**
     * <p>
     * Creates a recommender with the recipe (a Domain dataset group use case) you specify. You create recommenders for
     * a Domain dataset group and specify the recommender's Amazon Resource Name (ARN) when you make a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request.
     * </p>
     * <p>
     * <b>Minimum recommendation requests per second</b>
     * </p>
     * <p>
     * When you create a recommender, you can configure the recommender's minimum recommendation requests per second.
     * The minimum recommendation requests per second (<code>minRecommendationRequestsPerSecond</code>) specifies the
     * baseline recommendation request throughput provisioned by Amazon Personalize. The default
     * minRecommendationRequestsPerSecond is <code>1</code>. A recommendation request is a single
     * <code>GetRecommendations</code> operation. Request throughput is measured in requests per second and Amazon
     * Personalize uses your requests per second to derive your requests per hour and the price of your recommender
     * usage.
     * </p>
     * <p>
     * If your requests per second increases beyond <code>minRecommendationRequestsPerSecond</code>, Amazon Personalize
     * auto-scales the provisioned capacity up and down, but never below <code>minRecommendationRequestsPerSecond</code>
     * . There's a short time delay while the capacity is increased that might cause loss of requests.
     * </p>
     * <p>
     * Your bill is the greater of either the minimum requests per hour (based on minRecommendationRequestsPerSecond) or
     * the actual number of requests. The actual request throughput used is calculated as the average requests/second
     * within a one-hour window. We recommend starting with the default <code>minRecommendationRequestsPerSecond</code>,
     * track your usage using Amazon CloudWatch metrics, and then increase the
     * <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the recommender status, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeRecommender.html">DescribeRecommender</a>.
     * </p>
     * <note>
     * <p>
     * Wait until the <code>status</code> of the recommender is <code>ACTIVE</code> before asking the recommender for
     * recommendations.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListRecommenders.html">ListRecommenders</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeRecommender.html">DescribeRecommender</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_UpdateRecommender.html">UpdateRecommender</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteRecommender.html">DeleteRecommender</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createRecommenderRequest
     * @return Result of the CreateRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRecommenderResult createRecommender(CreateRecommenderRequest createRecommenderRequest);

    /**
     * <p>
     * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON
     * format.
     * </p>
     * <p>
     * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set
     * of required field and keywords. If you are creating a schema for a dataset in a Domain dataset group, you provide
     * the domain of the Domain dataset group. You specify a schema when you call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSchemas.html">ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSchema.html">DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSchema.html">DeleteSchema</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonPersonalize.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSchemaResult createSchema(CreateSchemaRequest createSchemaRequest);

    /**
     * <p>
     * Creates the configuration for training a model. A trained model is known as a solution. After the configuration
     * is created, you train the model (create a solution) by calling the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolutionVersion.html">CreateSolutionVersion</a>
     * operation. Every time you call <code>CreateSolutionVersion</code>, a new version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_GetSolutionMetrics.html">GetSolutionMetrics</a>. When
     * you are satisfied with the version, you deploy it using <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>. The campaign
     * provides recommendations to a client through the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
     * </p>
     * <p>
     * To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the
     * dataset group that you provide in the request. A recipe specifies the training algorithm and a feature
     * transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you
     * can specify <code>performAutoML</code> and Amazon Personalize will analyze your data and select the optimum
     * USER_PERSONALIZATION recipe for you.
     * </p>
     * <note>
     * <p>
     * Amazon Personalize doesn't support configuring the <code>hpoObjective</code> for solution hyperparameter
     * optimization at this time.
     * </p>
     * </note>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the solution, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolution.html">DescribeSolution</a>. Wait
     * until the status shows as ACTIVE before calling <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutions.html">ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolutionVersion.html">CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolution.html">DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSolution.html">DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html">
     * DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionRequest
     * @return Result of the CreateSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @sample AmazonPersonalize.CreateSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolution" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSolutionResult createSolution(CreateSolutionRequest createSolutionRequest);

    /**
     * <p>
     * Trains or retrains an active solution in a Custom dataset group. A solution is created using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a> operation and
     * must be in the ACTIVE state before calling <code>CreateSolutionVersion</code>. A new version of the solution is
     * created every time you call this operation.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE STOPPING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE STOPPED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>. Wait until the status shows as ACTIVE before calling <code>CreateCampaign</code>.
     * </p>
     * <p>
     * If the status shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why
     * the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html">
     * DescribeSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutions.html">ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolution.html">DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteSolution.html">DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionVersionRequest
     * @return Result of the CreateSolutionVersion operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AmazonPersonalize.CreateSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSolutionVersionResult createSolutionVersion(CreateSolutionVersionRequest createSolutionVersionRequest);

    /**
     * <p>
     * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted
     * and can be redeployed when needed. A deleted campaign can no longer be specified in a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request. For information on creating campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Deletes a dataset. You can't delete a dataset if an associated <code>DatasetImportJob</code> or
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a dataset group. Before you delete a dataset group, you must delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All associated event trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * All associated solutions.
     * </p>
     * </li>
     * <li>
     * <p>
     * All datasets in the dataset group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteDatasetGroupRequest
     * @return Result of the DeleteDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatasetGroupResult deleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

    /**
     * <p>
     * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
     * more information on event trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @return Result of the DeleteEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEventTrackerResult deleteEventTracker(DeleteEventTrackerRequest deleteEventTrackerRequest);

    /**
     * <p>
     * Deletes a filter.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes a metric attribution.
     * </p>
     * 
     * @param deleteMetricAttributionRequest
     * @return Result of the DeleteMetricAttribution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMetricAttributionResult deleteMetricAttribution(DeleteMetricAttributionRequest deleteMetricAttributionRequest);

    /**
     * <p>
     * Deactivates and removes a recommender. A deleted recommender can no longer be specified in a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request.
     * </p>
     * 
     * @param deleteRecommenderRequest
     * @return Result of the DeleteRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRecommenderResult deleteRecommender(DeleteRecommenderRequest deleteRecommenderRequest);

    /**
     * <p>
     * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
     * information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSchemaResult deleteSchema(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Deletes all versions of a solution and the <code>Solution</code> object itself. Before deleting a solution, you
     * must delete all campaigns based on the solution. To determine what campaigns are using the solution, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListCampaigns.html">ListCampaigns</a> and supply the
     * Amazon Resource Name (ARN) of the solution. You can't delete a solution if an associated
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on solutions,
     * see <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param deleteSolutionRequest
     * @return Result of the DeleteSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSolution" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSolutionResult deleteSolution(DeleteSolutionRequest deleteSolutionRequest);

    /**
     * <p>
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return Result of the DescribeAlgorithm operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest);

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @return Result of the DescribeBatchInferenceJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBatchInferenceJobResult describeBatchInferenceJob(DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest);

    /**
     * <p>
     * Gets the properties of a batch segment job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate segments.
     * </p>
     * 
     * @param describeBatchSegmentJobRequest
     * @return Result of the DescribeBatchSegmentJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBatchSegmentJobResult describeBatchSegmentJob(DescribeBatchSegmentJobRequest describeBatchSegmentJobRequest);

    /**
     * <p>
     * Describes the given campaign, including its status.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>status</code> is <code>CREATE FAILED</code>, the response includes the <code>failureReason</code>
     * key, which describes why.
     * </p>
     * <p>
     * For more information on campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param describeCampaignRequest
     * @return Result of the DescribeCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCampaignResult describeCampaign(DescribeCampaignRequest describeCampaignRequest);

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes the dataset export job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetExportJob.html"
     * >CreateDatasetExportJob</a>, including the export job status.
     * </p>
     * 
     * @param describeDatasetExportJobRequest
     * @return Result of the DescribeDatasetExportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatasetExportJobResult describeDatasetExportJob(DescribeDatasetExportJobRequest describeDatasetExportJobRequest);

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @return Result of the DescribeDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatasetGroupResult describeDatasetGroup(DescribeDatasetGroupRequest describeDatasetGroupRequest);

    /**
     * <p>
     * Describes the dataset import job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @return Result of the DescribeDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatasetImportJobResult describeDatasetImportJob(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

    /**
     * <p>
     * Describes an event tracker. The response includes the <code>trackingId</code> and <code>status</code> of the
     * event tracker. For more information on event trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @return Result of the DescribeEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeEventTracker"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEventTrackerResult describeEventTracker(DescribeEventTrackerRequest describeEventTrackerRequest);

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @return Result of the DescribeFeatureTransformation operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeFeatureTransformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFeatureTransformation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFeatureTransformationResult describeFeatureTransformation(DescribeFeatureTransformationRequest describeFeatureTransformationRequest);

    /**
     * <p>
     * Describes a filter's properties.
     * </p>
     * 
     * @param describeFilterRequest
     * @return Result of the DescribeFilter operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFilterResult describeFilter(DescribeFilterRequest describeFilterRequest);

    /**
     * <p>
     * Describes a metric attribution.
     * </p>
     * 
     * @param describeMetricAttributionRequest
     * @return Result of the DescribeMetricAttribution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMetricAttributionResult describeMetricAttribution(DescribeMetricAttributionRequest describeMetricAttributionRequest);

    /**
     * <p>
     * Describes a recipe.
     * </p>
     * <p>
     * A recipe contains three items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An algorithm that trains a model.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyperparameters that govern the training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature transformation information for modifying the input data before training.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a> API.
     * <code>CreateSolution</code> trains a model by using the algorithm in the specified recipe and a training dataset.
     * The solution, when deployed as a campaign, can provide recommendations using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return Result of the DescribeRecipe operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRecipeResult describeRecipe(DescribeRecipeRequest describeRecipeRequest);

    /**
     * <p>
     * Describes the given recommender, including its status.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>status</code> is <code>CREATE FAILED</code>, the response includes the <code>failureReason</code>
     * key, which describes why.
     * </p>
     * <p>
     * The <code>modelMetrics</code> key is null when the recommender is being created or deleted.
     * </p>
     * <p>
     * For more information on recommenders, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateRecommender.html">CreateRecommender</a>.
     * </p>
     * 
     * @param describeRecommenderRequest
     * @return Result of the DescribeRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecommender"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRecommenderResult describeRecommender(DescribeRecommenderRequest describeRecommenderRequest);

    /**
     * <p>
     * Describes a schema. For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return Result of the DescribeSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSchemaResult describeSchema(DescribeSchemaRequest describeSchemaRequest);

    /**
     * <p>
     * Describes a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @return Result of the DescribeSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolution" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSolutionResult describeSolution(DescribeSolutionRequest describeSolutionRequest);

    /**
     * <p>
     * Describes a specific version of a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @return Result of the DescribeSolutionVersion operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSolutionVersionResult describeSolutionVersion(DescribeSolutionVersionRequest describeSolutionVersionRequest);

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @return Result of the GetSolutionMetrics operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.GetSolutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/GetSolutionMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    GetSolutionMetricsResult getSolutionMetrics(GetSolutionMetricsRequest getSolutionMetricsRequest);

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @return Result of the ListBatchInferenceJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListBatchInferenceJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchInferenceJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListBatchInferenceJobsResult listBatchInferenceJobs(ListBatchInferenceJobsRequest listBatchInferenceJobsRequest);

    /**
     * <p>
     * Gets a list of the batch segment jobs that have been performed off of a solution version that you specify.
     * </p>
     * 
     * @param listBatchSegmentJobsRequest
     * @return Result of the ListBatchSegmentJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListBatchSegmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchSegmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListBatchSegmentJobsResult listBatchSegmentJobs(ListBatchSegmentJobsRequest listBatchSegmentJobsRequest);

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
     * associated with the account are listed. The response provides the properties for each campaign, including the
     * Amazon Resource Name (ARN). For more information on campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    ListCampaignsResult listCampaigns(ListCampaignsRequest listCampaignsRequest);

    /**
     * <p>
     * Returns a list of dataset export jobs that use the given dataset. When a dataset is not specified, all the
     * dataset export jobs associated with the account are listed. The response provides the properties for each dataset
     * export job, including the Amazon Resource Name (ARN). For more information on dataset export jobs, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetExportJob.html"
     * >CreateDatasetExportJob</a>. For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetExportJobsRequest
     * @return Result of the ListDatasetExportJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDatasetExportJobsResult listDatasetExportJobs(ListDatasetExportJobsRequest listDatasetExportJobsRequest);

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties for each dataset group, including the
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return Result of the ListDatasetGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest listDatasetGroupsRequest);

    /**
     * <p>
     * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the
     * dataset import jobs associated with the account are listed. The response provides the properties for each dataset
     * import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a>. For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return Result of the ListDatasetImportJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDatasetImportJobsResult listDatasetImportJobs(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The response provides the properties for each
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The response provides the properties for each
     * event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
     * see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @return Result of the ListEventTrackers operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListEventTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListEventTrackers" target="_top">AWS
     *      API Documentation</a>
     */
    ListEventTrackersResult listEventTrackers(ListEventTrackersRequest listEventTrackersRequest);

    /**
     * <p>
     * Lists all filters that belong to a given dataset group.
     * </p>
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists the metrics for the metric attribution.
     * </p>
     * 
     * @param listMetricAttributionMetricsRequest
     * @return Result of the ListMetricAttributionMetrics operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListMetricAttributionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    ListMetricAttributionMetricsResult listMetricAttributionMetrics(ListMetricAttributionMetricsRequest listMetricAttributionMetricsRequest);

    /**
     * <p>
     * Lists metric attributions.
     * </p>
     * 
     * @param listMetricAttributionsRequest
     * @return Result of the ListMetricAttributions operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListMetricAttributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributions"
     *      target="_top">AWS API Documentation</a>
     */
    ListMetricAttributionsResult listMetricAttributions(ListMetricAttributionsRequest listMetricAttributionsRequest);

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
     * Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @return Result of the ListRecipes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @sample AmazonPersonalize.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    ListRecipesResult listRecipes(ListRecipesRequest listRecipesRequest);

    /**
     * <p>
     * Returns a list of recommenders in a given Domain dataset group. When a Domain dataset group is not specified, all
     * the recommenders associated with the account are listed. The response provides the properties for each
     * recommender, including the Amazon Resource Name (ARN). For more information on recommenders, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateRecommender.html">CreateRecommender</a>.
     * </p>
     * 
     * @param listRecommendersRequest
     * @return Result of the ListRecommenders operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListRecommenders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecommenders" target="_top">AWS
     *      API Documentation</a>
     */
    ListRecommendersResult listRecommenders(ListRecommendersRequest listRecommendersRequest);

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response provides the properties for each schema,
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
     * versions associated with the account are listed. The response provides the properties for each solution version,
     * including the Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @return Result of the ListSolutionVersions operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSolutionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListSolutionVersionsResult listSolutionVersions(ListSolutionVersionsRequest listSolutionVersionsRequest);

    /**
     * <p>
     * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
     * solutions associated with the account are listed. The response provides the properties for each solution,
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @return Result of the ListSolutions operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSolutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSolutionsResult listSolutions(ListSolutionsRequest listSolutionsRequest);

    /**
     * <p>
     * Get a list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a>
     * attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a recommender that is INACTIVE. Starting a recommender does not create any new models, but resumes billing
     * and automatic retraining for the recommender.
     * </p>
     * 
     * @param startRecommenderRequest
     * @return Result of the StartRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.StartRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StartRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    StartRecommenderResult startRecommender(StartRecommenderRequest startRecommenderRequest);

    /**
     * <p>
     * Stops a recommender that is ACTIVE. Stopping a recommender halts billing and automatic retraining for the
     * recommender.
     * </p>
     * 
     * @param stopRecommenderRequest
     * @return Result of the StopRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.StopRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    StopRecommenderResult stopRecommender(StopRecommenderRequest stopRecommenderRequest);

    /**
     * <p>
     * Stops creating a solution version that is in a state of CREATE_PENDING or CREATE IN_PROGRESS.
     * </p>
     * <p>
     * Depending on the current state of the solution version, the solution version state changes as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_PENDING &gt; CREATE_STOPPED
     * </p>
     * <p>
     * or
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS &gt; CREATE_STOPPING &gt; CREATE_STOPPED
     * </p>
     * </li>
     * </ul>
     * <p>
     * You are billed for all of the training completed up until you stop the solution version creation. You cannot
     * resume creating a solution version once it has been stopped.
     * </p>
     * 
     * @param stopSolutionVersionCreationRequest
     * @return Result of the StopSolutionVersionCreation operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.StopSolutionVersionCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopSolutionVersionCreation"
     *      target="_top">AWS API Documentation</a>
     */
    StopSolutionVersionCreationResult stopSolutionVersionCreation(StopSolutionVersionCreationRequest stopSolutionVersionCreationRequest);

    /**
     * <p>
     * Add a list of tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws TooManyTagsException
     *         You have exceeded the maximum number of tags you can apply to this resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonPersonalize.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> that are
     * attached to a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws TooManyTagKeysException
     *         The request contains more tag keys than can be associated with a resource (50 tag keys per resource).
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a campaign by either deploying a new solution or changing the value of the campaign's
     * <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeCampaign.html">DescribeCampaign</a>
     * operation.
     * </p>
     * <note>
     * <p>
     * You can still get recommendations from a campaign while an update is in progress. The campaign will use the
     * previous solution version and campaign configuration to generate recommendations until the latest campaign update
     * status is <code>Active</code>.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest);

    /**
     * <p>
     * Updates a metric attribution.
     * </p>
     * 
     * @param updateMetricAttributionRequest
     * @return Result of the UpdateMetricAttribution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AmazonPersonalize.UpdateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMetricAttributionResult updateMetricAttribution(UpdateMetricAttributionRequest updateMetricAttributionRequest);

    /**
     * <p>
     * Updates the recommender to modify the recommender configuration.
     * </p>
     * 
     * @param updateRecommenderRequest
     * @return Result of the UpdateRecommender operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.UpdateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRecommenderResult updateRecommender(UpdateRecommenderRequest updateRecommenderRequest);

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
