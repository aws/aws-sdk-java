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
package com.amazonaws.services.personalize;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;

/**
 * Interface for accessing Amazon Personalize asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.personalize.AbstractAmazonPersonalizeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
 * customers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPersonalizeAsync extends AmazonPersonalize {

    /**
     * <p>
     * Generates batch recommendations based on a list of items or users stored in Amazon S3 and exports the
     * recommendations to an Amazon S3 bucket.
     * </p>
     * <p>
     * To generate batch recommendations, specify the ARN of a solution version and an Amazon S3 URI for the input and
     * output data. For user personalization, popular items, and personalized ranking solutions, the batch inference job
     * generates a list of recommended items for each user ID in the input file. For related items solutions, the job
     * generates a list of recommended items for each item ID in the input file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/getting-batch-recommendations.html">Creating a batch
     * inference job </a>.
     * </p>
     * <p>
     * If you use the Similar-Items recipe, Amazon Personalize can add descriptive themes to batch recommendations. To
     * generate themes, set the job's mode to <code>THEME_GENERATION</code> and specify the name of the field that
     * contains item names in the input data.
     * </p>
     * <p>
     * For more information about generating themes, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/themed-batch-recommendations.html">Batch recommendations
     * with themes from Content Generator </a>.
     * </p>
     * <p>
     * You can't get batch recommendations with the Trending-Now or Next-Best-Action recipes.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @return A Java Future containing the result of the CreateBatchInferenceJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(CreateBatchInferenceJobRequest createBatchInferenceJobRequest);

    /**
     * <p>
     * Generates batch recommendations based on a list of items or users stored in Amazon S3 and exports the
     * recommendations to an Amazon S3 bucket.
     * </p>
     * <p>
     * To generate batch recommendations, specify the ARN of a solution version and an Amazon S3 URI for the input and
     * output data. For user personalization, popular items, and personalized ranking solutions, the batch inference job
     * generates a list of recommended items for each user ID in the input file. For related items solutions, the job
     * generates a list of recommended items for each item ID in the input file.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/getting-batch-recommendations.html">Creating a batch
     * inference job </a>.
     * </p>
     * <p>
     * If you use the Similar-Items recipe, Amazon Personalize can add descriptive themes to batch recommendations. To
     * generate themes, set the job's mode to <code>THEME_GENERATION</code> and specify the name of the field that
     * contains item names in the input data.
     * </p>
     * <p>
     * For more information about generating themes, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/themed-batch-recommendations.html">Batch recommendations
     * with themes from Content Generator </a>.
     * </p>
     * <p>
     * You can't get batch recommendations with the Trending-Now or Next-Best-Action recipes.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBatchInferenceJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchInferenceJobResult> createBatchInferenceJobAsync(CreateBatchInferenceJobRequest createBatchInferenceJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBatchInferenceJobRequest, CreateBatchInferenceJobResult> asyncHandler);

    /**
     * <p>
     * Creates a batch segment job. The operation can handle up to 50 million records and the input file must be in JSON
     * format. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recommendations-batch.html">Getting batch recommendations
     * and user segments</a>.
     * </p>
     * 
     * @param createBatchSegmentJobRequest
     * @return A Java Future containing the result of the CreateBatchSegmentJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchSegmentJobResult> createBatchSegmentJobAsync(CreateBatchSegmentJobRequest createBatchSegmentJobRequest);

    /**
     * <p>
     * Creates a batch segment job. The operation can handle up to 50 million records and the input file must be in JSON
     * format. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/recommendations-batch.html">Getting batch recommendations
     * and user segments</a>.
     * </p>
     * 
     * @param createBatchSegmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBatchSegmentJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchSegmentJobResult> createBatchSegmentJobAsync(CreateBatchSegmentJobRequest createBatchSegmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBatchSegmentJobRequest, CreateBatchSegmentJobResult> asyncHandler);

    /**
     * <important>
     * <p>
     * You incur campaign costs while it is active. To avoid unnecessary costs, make sure to delete the campaign when
     * you are finished. For information about campaign costs, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * </important>
     * <p>
     * Creates a campaign that deploys a solution version. When a client calls the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * and <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html">
     * GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <important>
     * <p>
     * A high <code>minProvisionedTPS</code> will increase your cost. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * </important>
     * <p>
     * When you create an Amazon Personalize campaign, you can specify the minimum provisioned transactions per second (
     * <code>minProvisionedTPS</code>) for the campaign. This is the baseline transaction throughput for the campaign
     * provisioned by Amazon Personalize. It sets the minimum billing charge for the campaign while it is active. A
     * transaction is a single <code>GetRecommendations</code> or <code>GetPersonalizedRanking</code> request. The
     * default <code>minProvisionedTPS</code> is 1.
     * </p>
     * <p>
     * If your TPS increases beyond the <code>minProvisionedTPS</code>, Amazon Personalize auto-scales the provisioned
     * capacity up and down, but never below <code>minProvisionedTPS</code>. There's a short time delay while the
     * capacity is increased that might cause loss of transactions. When your traffic reduces, capacity returns to the
     * <code>minProvisionedTPS</code>.
     * </p>
     * <p>
     * You are charged for the the minimum provisioned TPS or, if your requests exceed the
     * <code>minProvisionedTPS</code>, the actual TPS. The actual TPS is the total number of recommendation requests you
     * make. We recommend starting with a low <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch
     * metrics, and then increase the <code>minProvisionedTPS</code> as necessary.
     * </p>
     * <p>
     * For more information about campaign costs, see <a href="https://aws.amazon.com/personalize/pricing/">Amazon
     * Personalize pricing</a>.
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
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest);

    /**
     * <important>
     * <p>
     * You incur campaign costs while it is active. To avoid unnecessary costs, make sure to delete the campaign when
     * you are finished. For information about campaign costs, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * </important>
     * <p>
     * Creates a campaign that deploys a solution version. When a client calls the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * and <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html">
     * GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <important>
     * <p>
     * A high <code>minProvisionedTPS</code> will increase your cost. We recommend starting with 1 for
     * <code>minProvisionedTPS</code> (the default). Track your usage using Amazon CloudWatch metrics, and increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * </important>
     * <p>
     * When you create an Amazon Personalize campaign, you can specify the minimum provisioned transactions per second (
     * <code>minProvisionedTPS</code>) for the campaign. This is the baseline transaction throughput for the campaign
     * provisioned by Amazon Personalize. It sets the minimum billing charge for the campaign while it is active. A
     * transaction is a single <code>GetRecommendations</code> or <code>GetPersonalizedRanking</code> request. The
     * default <code>minProvisionedTPS</code> is 1.
     * </p>
     * <p>
     * If your TPS increases beyond the <code>minProvisionedTPS</code>, Amazon Personalize auto-scales the provisioned
     * capacity up and down, but never below <code>minProvisionedTPS</code>. There's a short time delay while the
     * capacity is increased that might cause loss of transactions. When your traffic reduces, capacity returns to the
     * <code>minProvisionedTPS</code>.
     * </p>
     * <p>
     * You are charged for the the minimum provisioned TPS or, if your requests exceed the
     * <code>minProvisionedTPS</code>, the actual TPS. The actual TPS is the total number of recommendation requests you
     * make. We recommend starting with a low <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch
     * metrics, and then increase the <code>minProvisionedTPS</code> as necessary.
     * </p>
     * <p>
     * For more information about campaign costs, see <a href="https://aws.amazon.com/personalize/pricing/">Amazon
     * Personalize pricing</a>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * <p>
     * Creates a batch job that deletes all references to specific users from an Amazon Personalize dataset group in
     * batches. You specify the users to delete in a CSV file of userIds in an Amazon S3 bucket. After a job completes,
     * Amazon Personalize no longer trains on the users’ data and no longer considers the users when generating user
     * segments. For more information about creating a data deletion job, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/delete-records.html">Deleting users</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your input file must be a CSV file with a single USER_ID column that lists the users IDs. For more information
     * about preparing the CSV file, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/prepare-deletion-input-file.html">Preparing your data
     * deletion file and uploading it to Amazon S3</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To give Amazon Personalize permission to access your input CSV file of userIds, you must specify an IAM service
     * role that has permission to read from the data source. This role needs <code>GetObject</code> and
     * <code>ListBucket</code> permissions for the bucket and its content. These permissions are the same as importing
     * data. For information on granting access to your Amazon S3 bucket, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/granting-personalize-s3-access.html">Giving Amazon
     * Personalize Access to Amazon S3 Resources</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create a job, it can take up to a day to delete all references to the users from datasets and models.
     * Until the job completes, Amazon Personalize continues to use the data when training. And if you use a User
     * Segmentation recipe, the users might appear in user segments.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the data deletion job, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataDeletionJob.html"
     * >DescribeDataDeletionJob</a> API operation and specify the Amazon Resource Name (ARN) of the job. If the status
     * is FAILED, the response includes a <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListDataDeletionJobs.html">ListDataDeletionJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataDeletionJob.html">
     * DescribeDataDeletionJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDataDeletionJobRequest
     * @return A Java Future containing the result of the CreateDataDeletionJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateDataDeletionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataDeletionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataDeletionJobResult> createDataDeletionJobAsync(CreateDataDeletionJobRequest createDataDeletionJobRequest);

    /**
     * <p>
     * Creates a batch job that deletes all references to specific users from an Amazon Personalize dataset group in
     * batches. You specify the users to delete in a CSV file of userIds in an Amazon S3 bucket. After a job completes,
     * Amazon Personalize no longer trains on the users’ data and no longer considers the users when generating user
     * segments. For more information about creating a data deletion job, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/delete-records.html">Deleting users</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your input file must be a CSV file with a single USER_ID column that lists the users IDs. For more information
     * about preparing the CSV file, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/prepare-deletion-input-file.html">Preparing your data
     * deletion file and uploading it to Amazon S3</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To give Amazon Personalize permission to access your input CSV file of userIds, you must specify an IAM service
     * role that has permission to read from the data source. This role needs <code>GetObject</code> and
     * <code>ListBucket</code> permissions for the bucket and its content. These permissions are the same as importing
     * data. For information on granting access to your Amazon S3 bucket, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/granting-personalize-s3-access.html">Giving Amazon
     * Personalize Access to Amazon S3 Resources</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create a job, it can take up to a day to delete all references to the users from datasets and models.
     * Until the job completes, Amazon Personalize continues to use the data when training. And if you use a User
     * Segmentation recipe, the users might appear in user segments.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A data deletion job can have one of the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING &gt; IN_PROGRESS &gt; COMPLETED -or- FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the data deletion job, call <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataDeletionJob.html"
     * >DescribeDataDeletionJob</a> API operation and specify the Amazon Resource Name (ARN) of the job. If the status
     * is FAILED, the response includes a <code>failureReason</code> key, which describes why the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListDataDeletionJobs.html">ListDataDeletionJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataDeletionJob.html">
     * DescribeDataDeletionJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDataDeletionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataDeletionJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateDataDeletionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataDeletionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataDeletionJobResult> createDataDeletionJobAsync(CreateDataDeletionJobRequest createDataDeletionJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataDeletionJobRequest, CreateDataDeletionJobResult> asyncHandler);

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a> to import your training data to a dataset.
     * </p>
     * <p>
     * There are 5 types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Item interactions
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
     * <li>
     * <p>
     * Action interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types. Only the <code>Item interactions</code>
     * dataset is required in order to train a model (also referred to as creating a solution).
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
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a> to import your training data to a dataset.
     * </p>
     * <p>
     * There are 5 types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Item interactions
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
     * <li>
     * <p>
     * Action interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types. Only the <code>Item interactions</code>
     * dataset is required in order to train a model (also referred to as creating a solution).
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDatasetExportJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetExportJobResult> createDatasetExportJobAsync(CreateDatasetExportJobRequest createDatasetExportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetExportJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetExportJobResult> createDatasetExportJobAsync(CreateDatasetExportJobRequest createDatasetExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetExportJobRequest, CreateDatasetExportJobResult> asyncHandler);

    /**
     * <p>
     * Creates an empty dataset group. A dataset group is a container for Amazon Personalize resources. A dataset group
     * can contain at most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Item interactions
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
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * <li>
     * <p>
     * Action interactions
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
     * @return A Java Future containing the result of the CreateDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest createDatasetGroupRequest);

    /**
     * <p>
     * Creates an empty dataset group. A dataset group is a container for Amazon Personalize resources. A dataset group
     * can contain at most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Item interactions
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
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * <li>
     * <p>
     * Action interactions
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest createDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetGroupRequest, CreateDatasetGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDatasetImportJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest createDatasetImportJobRequest);

    /**
     * <p>
     * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize
     * dataset. To allow Amazon Personalize to import the training data, you must specify an IAM service role that has
     * permission to read from the data source, as Amazon Personalize makes a copy of your data and processes it
     * internally. For information on granting access to your Amazon S3 bucket, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/granting-personalize-s3-access.html">Giving Amazon
     * Personalize Access to Amazon S3 Resources</a>.
     * </p>
     * <p>
     * If you already created a recommender or deployed a custom solution version with a campaign, how new bulk records
     * influence recommendations depends on the domain use case or recipe that you use. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-new-data-influences-recommendations.html">How new
     * data influences real-time recommendations</a>.
     * </p>
     * <important>
     * <p>
     * By default, a dataset import job replaces any existing data in the dataset that you imported in bulk. To add new
     * records without replacing existing data, specify INCREMENTAL for the import mode in the CreateDatasetImportJob
     * operation.
     * </p>
     * </important>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetImportJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest createDatasetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetImportJobRequest, CreateDatasetImportJobResult> asyncHandler);

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
     * Amazon Personalize then appends the event data to the Item interactions dataset of the dataset group you specify
     * in your event tracker.
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
     * @return A Java Future containing the result of the CreateEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(CreateEventTrackerRequest createEventTrackerRequest);

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
     * Amazon Personalize then appends the event data to the Item interactions dataset of the dataset group you specify
     * in your event tracker.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventTrackerResult> createEventTrackerAsync(CreateEventTrackerRequest createEventTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventTrackerRequest, CreateEventTrackerResult> asyncHandler);

    /**
     * <p>
     * Creates a recommendation filter. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @param createFilterRequest
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a recommendation filter. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     * segments</a>.
     * </p>
     * 
     * @param createFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMetricAttributionResult> createMetricAttributionAsync(CreateMetricAttributionRequest createMetricAttributionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMetricAttributionResult> createMetricAttributionAsync(CreateMetricAttributionRequest createMetricAttributionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMetricAttributionRequest, CreateMetricAttributionResult> asyncHandler);

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
     * <important>
     * <p>
     * A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting with 1 for
     * <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon CloudWatch metrics,
     * and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * </important>
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
     * @return A Java Future containing the result of the CreateRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommenderResult> createRecommenderAsync(CreateRecommenderRequest createRecommenderRequest);

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
     * <important>
     * <p>
     * A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting with 1 for
     * <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon CloudWatch metrics,
     * and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * </important>
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommenderResult> createRecommenderAsync(CreateRecommenderRequest createRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecommenderRequest, CreateRecommenderResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchema operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaResult> createSchemaAsync(CreateSchemaRequest createSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaRequest, CreateSchemaResult> asyncHandler);

    /**
     * <important>
     * <p>
     * After you create a solution, you can’t change its configuration. By default, all new solutions use automatic
     * training. With automatic training, you incur training costs while your solution is active. You can't stop
     * automatic training for a solution. To avoid unnecessary costs, make sure to delete the solution when you are
     * finished. For information about training costs, see <a href="https://aws.amazon.com/personalize/pricing/">Amazon
     * Personalize pricing</a>.
     * </p>
     * </important>
     * <p>
     * Creates the configuration for training a model (creating a solution version). This configuration includes the
     * recipe to use for model training and optional training configuration, such as columns to use in training and
     * feature transformation parameters. For more information about configuring a solution, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/customizing-solution-config.html">Creating and
     * configuring a solution</a>.
     * </p>
     * <p>
     * By default, new solutions use automatic training to create solution versions every 7 days. You can change the
     * training frequency. Automatic solution version creation starts one hour after the solution is ACTIVE. If you
     * manually create a solution version within the hour, the solution skips the first automatic training. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * To turn off automatic training, set <code>performAutoTraining</code> to false. If you turn off automatic
     * training, you must manually create a solution version by calling the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolutionVersion.html">CreateSolutionVersion</a>
     * operation.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * <p>
     * After training completes you can evaluate model accuracy by calling <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_GetSolutionMetrics.html">GetSolutionMetrics</a>. When
     * you are satisfied with the solution version, you deploy it using <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>. The campaign
     * provides recommendations to a client through the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
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
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolution.html">DescribeSolution</a>. If you
     * use manual training, the status must be ACTIVE before you call <code>CreateSolutionVersion</code>.
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
     * @return A Java Future containing the result of the CreateSolution operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(CreateSolutionRequest createSolutionRequest);

    /**
     * <important>
     * <p>
     * After you create a solution, you can’t change its configuration. By default, all new solutions use automatic
     * training. With automatic training, you incur training costs while your solution is active. You can't stop
     * automatic training for a solution. To avoid unnecessary costs, make sure to delete the solution when you are
     * finished. For information about training costs, see <a href="https://aws.amazon.com/personalize/pricing/">Amazon
     * Personalize pricing</a>.
     * </p>
     * </important>
     * <p>
     * Creates the configuration for training a model (creating a solution version). This configuration includes the
     * recipe to use for model training and optional training configuration, such as columns to use in training and
     * feature transformation parameters. For more information about configuring a solution, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/customizing-solution-config.html">Creating and
     * configuring a solution</a>.
     * </p>
     * <p>
     * By default, new solutions use automatic training to create solution versions every 7 days. You can change the
     * training frequency. Automatic solution version creation starts one hour after the solution is ACTIVE. If you
     * manually create a solution version within the hour, the solution skips the first automatic training. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * To turn off automatic training, set <code>performAutoTraining</code> to false. If you turn off automatic
     * training, you must manually create a solution version by calling the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolutionVersion.html">CreateSolutionVersion</a>
     * operation.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * <p>
     * After training completes you can evaluate model accuracy by calling <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_GetSolutionMetrics.html">GetSolutionMetrics</a>. When
     * you are satisfied with the solution version, you deploy it using <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>. The campaign
     * provides recommendations to a client through the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
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
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolution.html">DescribeSolution</a>. If you
     * use manual training, the status must be ACTIVE before you call <code>CreateSolutionVersion</code>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSolution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSolutionResult> createSolutionAsync(CreateSolutionRequest createSolutionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSolutionRequest, CreateSolutionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSolutionVersion operation returned by the service.
     * @sample AmazonPersonalizeAsync.CreateSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(CreateSolutionVersionRequest createSolutionVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSolutionVersion operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.CreateSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSolutionVersionResult> createSolutionVersionAsync(CreateSolutionVersionRequest createSolutionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSolutionVersionRequest, CreateSolutionVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset. You can't delete a dataset if an associated <code>DatasetImportJob</code> or
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a dataset. You can't delete a dataset if an associated <code>DatasetImportJob</code> or
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest deleteDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetGroupRequest, DeleteDatasetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the event tracker. Does not delete the dataset from the dataset group. For more information on event
     * trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @return A Java Future containing the result of the DeleteEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(DeleteEventTrackerRequest deleteEventTrackerRequest);

    /**
     * <p>
     * Deletes the event tracker. Does not delete the dataset from the dataset group. For more information on event
     * trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventTrackerResult> deleteEventTrackerAsync(DeleteEventTrackerRequest deleteEventTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventTrackerRequest, DeleteEventTrackerResult> asyncHandler);

    /**
     * <p>
     * Deletes a filter.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes a filter.
     * </p>
     * 
     * @param deleteFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes a metric attribution.
     * </p>
     * 
     * @param deleteMetricAttributionRequest
     * @return A Java Future containing the result of the DeleteMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMetricAttributionResult> deleteMetricAttributionAsync(DeleteMetricAttributionRequest deleteMetricAttributionRequest);

    /**
     * <p>
     * Deletes a metric attribution.
     * </p>
     * 
     * @param deleteMetricAttributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMetricAttributionResult> deleteMetricAttributionAsync(DeleteMetricAttributionRequest deleteMetricAttributionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMetricAttributionRequest, DeleteMetricAttributionResult> asyncHandler);

    /**
     * <p>
     * Deactivates and removes a recommender. A deleted recommender can no longer be specified in a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request.
     * </p>
     * 
     * @param deleteRecommenderRequest
     * @return A Java Future containing the result of the DeleteRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommenderResult> deleteRecommenderAsync(DeleteRecommenderRequest deleteRecommenderRequest);

    /**
     * <p>
     * Deactivates and removes a recommender. A deleted recommender can no longer be specified in a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request.
     * </p>
     * 
     * @param deleteRecommenderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommenderResult> deleteRecommenderAsync(DeleteRecommenderRequest deleteRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommenderRequest, DeleteRecommenderResult> asyncHandler);

    /**
     * <p>
     * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
     * information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest);

    /**
     * <p>
     * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
     * information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchema operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaResult> deleteSchemaAsync(DeleteSchemaRequest deleteSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSolution operation returned by the service.
     * @sample AmazonPersonalizeAsync.DeleteSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSolution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(DeleteSolutionRequest deleteSolutionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSolution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DeleteSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSolution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSolutionResult> deleteSolutionAsync(DeleteSolutionRequest deleteSolutionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSolutionRequest, DeleteSolutionResult> asyncHandler);

    /**
     * <p>
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest);

    /**
     * <p>
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @return A Java Future containing the result of the DescribeBatchInferenceJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(
            DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest);

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBatchInferenceJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchInferenceJobResult> describeBatchInferenceJobAsync(
            DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchInferenceJobRequest, DescribeBatchInferenceJobResult> asyncHandler);

    /**
     * <p>
     * Gets the properties of a batch segment job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate segments.
     * </p>
     * 
     * @param describeBatchSegmentJobRequest
     * @return A Java Future containing the result of the DescribeBatchSegmentJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchSegmentJobResult> describeBatchSegmentJobAsync(DescribeBatchSegmentJobRequest describeBatchSegmentJobRequest);

    /**
     * <p>
     * Gets the properties of a batch segment job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate segments.
     * </p>
     * 
     * @param describeBatchSegmentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBatchSegmentJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeBatchSegmentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchSegmentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchSegmentJobResult> describeBatchSegmentJobAsync(DescribeBatchSegmentJobRequest describeBatchSegmentJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchSegmentJobRequest, DescribeBatchSegmentJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest describeCampaignRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCampaignResult> describeCampaignAsync(DescribeCampaignRequest describeCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCampaignRequest, DescribeCampaignResult> asyncHandler);

    /**
     * <p>
     * Describes the data deletion job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataDeletionJob.html"
     * >CreateDataDeletionJob</a>, including the job status.
     * </p>
     * 
     * @param describeDataDeletionJobRequest
     * @return A Java Future containing the result of the DescribeDataDeletionJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeDataDeletionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataDeletionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataDeletionJobResult> describeDataDeletionJobAsync(DescribeDataDeletionJobRequest describeDataDeletionJobRequest);

    /**
     * <p>
     * Describes the data deletion job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataDeletionJob.html"
     * >CreateDataDeletionJob</a>, including the job status.
     * </p>
     * 
     * @param describeDataDeletionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataDeletionJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeDataDeletionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataDeletionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDataDeletionJobResult> describeDataDeletionJobAsync(DescribeDataDeletionJobRequest describeDataDeletionJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataDeletionJobRequest, DescribeDataDeletionJobResult> asyncHandler);

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Describes the dataset export job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetExportJob.html"
     * >CreateDatasetExportJob</a>, including the export job status.
     * </p>
     * 
     * @param describeDatasetExportJobRequest
     * @return A Java Future containing the result of the DescribeDatasetExportJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetExportJobResult> describeDatasetExportJobAsync(DescribeDatasetExportJobRequest describeDatasetExportJobRequest);

    /**
     * <p>
     * Describes the dataset export job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetExportJob.html"
     * >CreateDatasetExportJob</a>, including the export job status.
     * </p>
     * 
     * @param describeDatasetExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatasetExportJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeDatasetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetExportJobResult> describeDatasetExportJobAsync(DescribeDatasetExportJobRequest describeDatasetExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetExportJobRequest, DescribeDatasetExportJobResult> asyncHandler);

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @return A Java Future containing the result of the DescribeDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest describeDatasetGroupRequest);

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatasetGroup operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest describeDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetGroupRequest, DescribeDatasetGroupResult> asyncHandler);

    /**
     * <p>
     * Describes the dataset import job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @return A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

    /**
     * <p>
     * Describes the dataset import job created by <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html"
     * >CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest describeDatasetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetImportJobRequest, DescribeDatasetImportJobResult> asyncHandler);

    /**
     * <p>
     * Describes an event tracker. The response includes the <code>trackingId</code> and <code>status</code> of the
     * event tracker. For more information on event trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @return A Java Future containing the result of the DescribeEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeEventTracker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(DescribeEventTrackerRequest describeEventTrackerRequest);

    /**
     * <p>
     * Describes an event tracker. The response includes the <code>trackingId</code> and <code>status</code> of the
     * event tracker. For more information on event trackers, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventTracker operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeEventTracker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventTrackerResult> describeEventTrackerAsync(DescribeEventTrackerRequest describeEventTrackerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventTrackerRequest, DescribeEventTrackerResult> asyncHandler);

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @return A Java Future containing the result of the DescribeFeatureTransformation operation returned by the
     *         service.
     * @sample AmazonPersonalizeAsync.DescribeFeatureTransformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFeatureTransformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(
            DescribeFeatureTransformationRequest describeFeatureTransformationRequest);

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFeatureTransformation operation returned by the
     *         service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeFeatureTransformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFeatureTransformation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFeatureTransformationResult> describeFeatureTransformationAsync(
            DescribeFeatureTransformationRequest describeFeatureTransformationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFeatureTransformationRequest, DescribeFeatureTransformationResult> asyncHandler);

    /**
     * <p>
     * Describes a filter's properties.
     * </p>
     * 
     * @param describeFilterRequest
     * @return A Java Future containing the result of the DescribeFilter operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFilterResult> describeFilterAsync(DescribeFilterRequest describeFilterRequest);

    /**
     * <p>
     * Describes a filter's properties.
     * </p>
     * 
     * @param describeFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFilter operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFilterResult> describeFilterAsync(DescribeFilterRequest describeFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFilterRequest, DescribeFilterResult> asyncHandler);

    /**
     * <p>
     * Describes a metric attribution.
     * </p>
     * 
     * @param describeMetricAttributionRequest
     * @return A Java Future containing the result of the DescribeMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricAttributionResult> describeMetricAttributionAsync(
            DescribeMetricAttributionRequest describeMetricAttributionRequest);

    /**
     * <p>
     * Describes a metric attribution.
     * </p>
     * 
     * @param describeMetricAttributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricAttributionResult> describeMetricAttributionAsync(
            DescribeMetricAttributionRequest describeMetricAttributionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricAttributionRequest, DescribeMetricAttributionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRecipe operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest describeRecipeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecipe operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest describeRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecipeRequest, DescribeRecipeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecommender"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommenderResult> describeRecommenderAsync(DescribeRecommenderRequest describeRecommenderRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecommender"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommenderResult> describeRecommenderAsync(DescribeRecommenderRequest describeRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommenderRequest, DescribeRecommenderResult> asyncHandler);

    /**
     * <p>
     * Describes a schema. For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return A Java Future containing the result of the DescribeSchema operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest describeSchemaRequest);

    /**
     * <p>
     * Describes a schema. For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSchema operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemaResult> describeSchemaAsync(DescribeSchemaRequest describeSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemaRequest, DescribeSchemaResult> asyncHandler);

    /**
     * <p>
     * Describes a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @return A Java Future containing the result of the DescribeSolution operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(DescribeSolutionRequest describeSolutionRequest);

    /**
     * <p>
     * Describes a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSolution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSolutionResult> describeSolutionAsync(DescribeSolutionRequest describeSolutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSolutionRequest, DescribeSolutionResult> asyncHandler);

    /**
     * <p>
     * Describes a specific version of a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @return A Java Future containing the result of the DescribeSolutionVersion operation returned by the service.
     * @sample AmazonPersonalizeAsync.DescribeSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(DescribeSolutionVersionRequest describeSolutionVersionRequest);

    /**
     * <p>
     * Describes a specific version of a solution. For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSolutionVersion operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.DescribeSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSolutionVersionResult> describeSolutionVersionAsync(DescribeSolutionVersionRequest describeSolutionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSolutionVersionRequest, DescribeSolutionVersionResult> asyncHandler);

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @return A Java Future containing the result of the GetSolutionMetrics operation returned by the service.
     * @sample AmazonPersonalizeAsync.GetSolutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/GetSolutionMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(GetSolutionMetricsRequest getSolutionMetricsRequest);

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSolutionMetrics operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.GetSolutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/GetSolutionMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSolutionMetricsResult> getSolutionMetricsAsync(GetSolutionMetricsRequest getSolutionMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSolutionMetricsRequest, GetSolutionMetricsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @return A Java Future containing the result of the ListBatchInferenceJobs operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListBatchInferenceJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchInferenceJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(ListBatchInferenceJobsRequest listBatchInferenceJobsRequest);

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBatchInferenceJobs operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListBatchInferenceJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchInferenceJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchInferenceJobsResult> listBatchInferenceJobsAsync(ListBatchInferenceJobsRequest listBatchInferenceJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBatchInferenceJobsRequest, ListBatchInferenceJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the batch segment jobs that have been performed off of a solution version that you specify.
     * </p>
     * 
     * @param listBatchSegmentJobsRequest
     * @return A Java Future containing the result of the ListBatchSegmentJobs operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListBatchSegmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchSegmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchSegmentJobsResult> listBatchSegmentJobsAsync(ListBatchSegmentJobsRequest listBatchSegmentJobsRequest);

    /**
     * <p>
     * Gets a list of the batch segment jobs that have been performed off of a solution version that you specify.
     * </p>
     * 
     * @param listBatchSegmentJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBatchSegmentJobs operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListBatchSegmentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchSegmentJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchSegmentJobsResult> listBatchSegmentJobsAsync(ListBatchSegmentJobsRequest listBatchSegmentJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBatchSegmentJobsRequest, ListBatchSegmentJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
     * associated with the account are listed. The response provides the properties for each campaign, including the
     * Amazon Resource Name (ARN). For more information on campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest);

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
     * associated with the account are listed. The response provides the properties for each campaign, including the
     * Amazon Resource Name (ARN). For more information on campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html">CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCampaigns operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCampaignsResult> listCampaignsAsync(ListCampaignsRequest listCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCampaignsRequest, ListCampaignsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of data deletion jobs for a dataset group ordered by creation time, with the most recent first.
     * When a dataset group is not specified, all the data deletion jobs associated with the account are listed. The
     * response provides the properties for each job, including the Amazon Resource Name (ARN). For more information on
     * data deletion jobs, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/delete-records.html">Deleting
     * users</a>.
     * </p>
     * 
     * @param listDataDeletionJobsRequest
     * @return A Java Future containing the result of the ListDataDeletionJobs operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListDataDeletionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDataDeletionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataDeletionJobsResult> listDataDeletionJobsAsync(ListDataDeletionJobsRequest listDataDeletionJobsRequest);

    /**
     * <p>
     * Returns a list of data deletion jobs for a dataset group ordered by creation time, with the most recent first.
     * When a dataset group is not specified, all the data deletion jobs associated with the account are listed. The
     * response provides the properties for each job, including the Amazon Resource Name (ARN). For more information on
     * data deletion jobs, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/delete-records.html">Deleting
     * users</a>.
     * </p>
     * 
     * @param listDataDeletionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataDeletionJobs operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListDataDeletionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDataDeletionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataDeletionJobsResult> listDataDeletionJobsAsync(ListDataDeletionJobsRequest listDataDeletionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataDeletionJobsRequest, ListDataDeletionJobsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListDatasetExportJobs operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListDatasetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetExportJobsResult> listDatasetExportJobsAsync(ListDatasetExportJobsRequest listDatasetExportJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetExportJobs operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListDatasetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetExportJobsResult> listDatasetExportJobsAsync(ListDatasetExportJobsRequest listDatasetExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetExportJobsRequest, ListDatasetExportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties for each dataset group, including the
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return A Java Future containing the result of the ListDatasetGroups operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest listDatasetGroupsRequest);

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties for each dataset group, including the
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetGroups operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest listDatasetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetGroupsRequest, ListDatasetGroupsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListDatasetImportJobs operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetImportJobs operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest listDatasetImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetImportJobsRequest, ListDatasetImportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The response provides the properties for each
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The response provides the properties for each
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDataset.html">CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The response provides the properties for each
     * event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
     * see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @return A Java Future containing the result of the ListEventTrackers operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListEventTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListEventTrackers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(ListEventTrackersRequest listEventTrackersRequest);

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The response provides the properties for each
     * event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
     * see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateEventTracker.html">CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventTrackers operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListEventTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListEventTrackers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventTrackersResult> listEventTrackersAsync(ListEventTrackersRequest listEventTrackersRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventTrackersRequest, ListEventTrackersResult> asyncHandler);

    /**
     * <p>
     * Lists all filters that belong to a given dataset group.
     * </p>
     * 
     * @param listFiltersRequest
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists all filters that belong to a given dataset group.
     * </p>
     * 
     * @param listFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists the metrics for the metric attribution.
     * </p>
     * 
     * @param listMetricAttributionMetricsRequest
     * @return A Java Future containing the result of the ListMetricAttributionMetrics operation returned by the
     *         service.
     * @sample AmazonPersonalizeAsync.ListMetricAttributionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricAttributionMetricsResult> listMetricAttributionMetricsAsync(
            ListMetricAttributionMetricsRequest listMetricAttributionMetricsRequest);

    /**
     * <p>
     * Lists the metrics for the metric attribution.
     * </p>
     * 
     * @param listMetricAttributionMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetricAttributionMetrics operation returned by the
     *         service.
     * @sample AmazonPersonalizeAsyncHandler.ListMetricAttributionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricAttributionMetricsResult> listMetricAttributionMetricsAsync(
            ListMetricAttributionMetricsRequest listMetricAttributionMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricAttributionMetricsRequest, ListMetricAttributionMetricsResult> asyncHandler);

    /**
     * <p>
     * Lists metric attributions.
     * </p>
     * 
     * @param listMetricAttributionsRequest
     * @return A Java Future containing the result of the ListMetricAttributions operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListMetricAttributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricAttributionsResult> listMetricAttributionsAsync(ListMetricAttributionsRequest listMetricAttributionsRequest);

    /**
     * <p>
     * Lists metric attributions.
     * </p>
     * 
     * @param listMetricAttributionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetricAttributions operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListMetricAttributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListMetricAttributions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricAttributionsResult> listMetricAttributionsAsync(ListMetricAttributionsRequest listMetricAttributionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricAttributionsRequest, ListMetricAttributionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
     * Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @return A Java Future containing the result of the ListRecipes operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest listRecipesRequest);

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
     * Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecipes operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest listRecipesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecipesRequest, ListRecipesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of recommenders in a given Domain dataset group. When a Domain dataset group is not specified, all
     * the recommenders associated with the account are listed. The response provides the properties for each
     * recommender, including the Amazon Resource Name (ARN). For more information on recommenders, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateRecommender.html">CreateRecommender</a>.
     * </p>
     * 
     * @param listRecommendersRequest
     * @return A Java Future containing the result of the ListRecommenders operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListRecommenders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecommenders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendersResult> listRecommendersAsync(ListRecommendersRequest listRecommendersRequest);

    /**
     * <p>
     * Returns a list of recommenders in a given Domain dataset group. When a Domain dataset group is not specified, all
     * the recommenders associated with the account are listed. The response provides the properties for each
     * recommender, including the Amazon Resource Name (ARN). For more information on recommenders, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateRecommender.html">CreateRecommender</a>.
     * </p>
     * 
     * @param listRecommendersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommenders operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListRecommenders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecommenders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendersResult> listRecommendersAsync(ListRecommendersRequest listRecommendersRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendersRequest, ListRecommendersResult> asyncHandler);

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response provides the properties for each schema,
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response provides the properties for each schema,
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSchema.html">CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler);

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
     * versions associated with the account are listed. The response provides the properties for each solution version,
     * including the Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @return A Java Future containing the result of the ListSolutionVersions operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListSolutionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(ListSolutionVersionsRequest listSolutionVersionsRequest);

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
     * versions associated with the account are listed. The response provides the properties for each solution version,
     * including the Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolutionVersions operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListSolutionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSolutionVersionsResult> listSolutionVersionsAsync(ListSolutionVersionsRequest listSolutionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolutionVersionsRequest, ListSolutionVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of solutions in a given dataset group. When a dataset group is not specified, all the solutions
     * associated with the account are listed. The response provides the properties for each solution, including the
     * Amazon Resource Name (ARN). For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @return A Java Future containing the result of the ListSolutions operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListSolutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(ListSolutionsRequest listSolutionsRequest);

    /**
     * <p>
     * Returns a list of solutions in a given dataset group. When a dataset group is not specified, all the solutions
     * associated with the account are listed. The response provides the properties for each solution, including the
     * Amazon Resource Name (ARN). For more information on solutions, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_CreateSolution.html">CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSolutions operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListSolutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSolutionsResult> listSolutionsAsync(ListSolutionsRequest listSolutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSolutionsRequest, ListSolutionsResult> asyncHandler);

    /**
     * <p>
     * Get a list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a>
     * attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPersonalizeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Get a list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a>
     * attached to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a recommender that is INACTIVE. Starting a recommender does not create any new models, but resumes billing
     * and automatic retraining for the recommender.
     * </p>
     * 
     * @param startRecommenderRequest
     * @return A Java Future containing the result of the StartRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.StartRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StartRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartRecommenderResult> startRecommenderAsync(StartRecommenderRequest startRecommenderRequest);

    /**
     * <p>
     * Starts a recommender that is INACTIVE. Starting a recommender does not create any new models, but resumes billing
     * and automatic retraining for the recommender.
     * </p>
     * 
     * @param startRecommenderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.StartRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StartRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartRecommenderResult> startRecommenderAsync(StartRecommenderRequest startRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<StartRecommenderRequest, StartRecommenderResult> asyncHandler);

    /**
     * <p>
     * Stops a recommender that is ACTIVE. Stopping a recommender halts billing and automatic retraining for the
     * recommender.
     * </p>
     * 
     * @param stopRecommenderRequest
     * @return A Java Future containing the result of the StopRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.StopRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopRecommenderResult> stopRecommenderAsync(StopRecommenderRequest stopRecommenderRequest);

    /**
     * <p>
     * Stops a recommender that is ACTIVE. Stopping a recommender halts billing and automatic retraining for the
     * recommender.
     * </p>
     * 
     * @param stopRecommenderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.StopRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopRecommenderResult> stopRecommenderAsync(StopRecommenderRequest stopRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<StopRecommenderRequest, StopRecommenderResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopSolutionVersionCreation operation returned by the service.
     * @sample AmazonPersonalizeAsync.StopSolutionVersionCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopSolutionVersionCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSolutionVersionCreationResult> stopSolutionVersionCreationAsync(
            StopSolutionVersionCreationRequest stopSolutionVersionCreationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSolutionVersionCreation operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.StopSolutionVersionCreation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/StopSolutionVersionCreation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSolutionVersionCreationResult> stopSolutionVersionCreationAsync(
            StopSolutionVersionCreationRequest stopSolutionVersionCreationRequest,
            com.amazonaws.handlers.AsyncHandler<StopSolutionVersionCreationRequest, StopSolutionVersionCreationResult> asyncHandler);

    /**
     * <p>
     * Add a list of tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPersonalizeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add a list of tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags that are attached to a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/tags-remove.html">Removing tags from Amazon Personalize
     * resources</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPersonalizeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags that are attached to a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/tags-remove.html">Removing tags from Amazon Personalize
     * resources</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a campaign to deploy a retrained solution version with an existing campaign, change your campaign's
     * <code>minProvisionedTPS</code>, or modify your campaign's configuration. For example, you can set
     * <code>enableMetadataWithRecommendations</code> to true for an existing campaign.
     * </p>
     * <p>
     * To update a campaign to start automatically using the latest solution version, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>SolutionVersionArn</code> parameter, specify the Amazon Resource Name (ARN) of your solution in
     * <code>SolutionArn/$LATEST</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>campaignConfig</code>, set <code>syncWithLatestSolutionVersion</code> to <code>true</code>.
     * </p>
     * </li>
     * </ul>
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
     * For more information about updating a campaign, including code samples, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/update-campaigns.html">Updating a campaign</a>. For more
     * information about campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html">Creating a campaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsync.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest);

    /**
     * <p>
     * Updates a campaign to deploy a retrained solution version with an existing campaign, change your campaign's
     * <code>minProvisionedTPS</code>, or modify your campaign's configuration. For example, you can set
     * <code>enableMetadataWithRecommendations</code> to true for an existing campaign.
     * </p>
     * <p>
     * To update a campaign to start automatically using the latest solution version, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>SolutionVersionArn</code> parameter, specify the Amazon Resource Name (ARN) of your solution in
     * <code>SolutionArn/$LATEST</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the <code>campaignConfig</code>, set <code>syncWithLatestSolutionVersion</code> to <code>true</code>.
     * </p>
     * </li>
     * </ul>
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
     * For more information about updating a campaign, including code samples, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/update-campaigns.html">Updating a campaign</a>. For more
     * information about campaigns, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/campaigns.html">Creating a campaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler);

    /**
     * <p>
     * Update a dataset to replace its schema with a new or existing one. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/updating-dataset-schema.html">Replacing a dataset's
     * schema</a>.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AmazonPersonalizeAsync.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Update a dataset to replace its schema with a new or existing one. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/updating-dataset-schema.html">Replacing a dataset's
     * schema</a>.
     * </p>
     * 
     * @param updateDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler);

    /**
     * <p>
     * Updates a metric attribution.
     * </p>
     * 
     * @param updateMetricAttributionRequest
     * @return A Java Future containing the result of the UpdateMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsync.UpdateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMetricAttributionResult> updateMetricAttributionAsync(UpdateMetricAttributionRequest updateMetricAttributionRequest);

    /**
     * <p>
     * Updates a metric attribution.
     * </p>
     * 
     * @param updateMetricAttributionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMetricAttribution operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.UpdateMetricAttribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateMetricAttribution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMetricAttributionResult> updateMetricAttributionAsync(UpdateMetricAttributionRequest updateMetricAttributionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMetricAttributionRequest, UpdateMetricAttributionResult> asyncHandler);

    /**
     * <p>
     * Updates the recommender to modify the recommender configuration. If you update the recommender to modify the
     * columns used in training, Amazon Personalize automatically starts a full retraining of the models backing your
     * recommender. While the update completes, you can still get recommendations from the recommender. The recommender
     * uses the previous configuration until the update completes. To track the status of this update, use the
     * <code>latestRecommenderUpdate</code> returned in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeRecommender.html">DescribeRecommender</a>
     * operation.
     * </p>
     * 
     * @param updateRecommenderRequest
     * @return A Java Future containing the result of the UpdateRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsync.UpdateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommenderResult> updateRecommenderAsync(UpdateRecommenderRequest updateRecommenderRequest);

    /**
     * <p>
     * Updates the recommender to modify the recommender configuration. If you update the recommender to modify the
     * columns used in training, Amazon Personalize automatically starts a full retraining of the models backing your
     * recommender. While the update completes, you can still get recommendations from the recommender. The recommender
     * uses the previous configuration until the update completes. To track the status of this update, use the
     * <code>latestRecommenderUpdate</code> returned in the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeRecommender.html">DescribeRecommender</a>
     * operation.
     * </p>
     * 
     * @param updateRecommenderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecommender operation returned by the service.
     * @sample AmazonPersonalizeAsyncHandler.UpdateRecommender
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateRecommender" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommenderResult> updateRecommenderAsync(UpdateRecommenderRequest updateRecommenderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecommenderRequest, UpdateRecommenderResult> asyncHandler);

}
