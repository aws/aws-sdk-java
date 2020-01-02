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
     * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in
     * JSON format. For more information, see <a>recommendations-batch</a>.
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
     * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in
     * JSON format. For more information, see <a>recommendations-batch</a>.
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
     * Creates a campaign by deploying a solution version. When a client calls the <a
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
     * Personalize, and thus, the minimum billing charge. If your TPS increases beyond <code>minProvisionedTPS</code>,
     * Amazon Personalize auto-scales the provisioned capacity up and down, but never below
     * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a short time delay while the capacity is
     * increased that might cause loss of transactions. It's recommended to start with a low
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
     * To get the campaign status, call <a>DescribeCampaign</a>.
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
     * <a>ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCampaign</a>
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
     * <p>
     * Creates a campaign by deploying a solution version. When a client calls the <a
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
     * Personalize, and thus, the minimum billing charge. If your TPS increases beyond <code>minProvisionedTPS</code>,
     * Amazon Personalize auto-scales the provisioned capacity up and down, but never below
     * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a short time delay while the capacity is
     * increased that might cause loss of transactions. It's recommended to start with a low
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
     * To get the campaign status, call <a>DescribeCampaign</a>.
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
     * <a>ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCampaign</a>
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
     * Creates an empty dataset and adds it to the specified dataset group. Use <a>CreateDatasetImportJob</a> to import
     * your training data to a dataset.
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
     * To get the status of the dataset, call <a>DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDataset</a>
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
     * Creates an empty dataset and adds it to the specified dataset group. Use <a>CreateDatasetImportJob</a> to import
     * your training data to a dataset.
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
     * To get the status of the dataset, call <a>DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDataset</a>
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
     * Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model.
     * A dataset group can contain at most three datasets, one for each type of dataset:
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
     * To train a model (create a solution), a dataset group that contains an <code>Interactions</code> dataset is
     * required. Call <a>CreateDataset</a> to add a dataset to the group.
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
     * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>. If the status shows as CREATE FAILED,
     * the response includes a <code>failureReason</code> key, which describes why the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is <code>ACTIVE</code> before adding a dataset
     * to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a
     * KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the
     * key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDatasetGroup</a>
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
     * Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model.
     * A dataset group can contain at most three datasets, one for each type of dataset:
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
     * To train a model (create a solution), a dataset group that contains an <code>Interactions</code> dataset is
     * required. Call <a>CreateDataset</a> to add a dataset to the group.
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
     * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>. If the status shows as CREATE FAILED,
     * the response includes a <code>failureReason</code> key, which describes why the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is <code>ACTIVE</code> before adding a dataset
     * to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a
     * KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the
     * key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDatasetGroup</a>
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
     * dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access
     * Management (IAM) role that has permission to read from the data source.
     * </p>
     * <important>
     * <p>
     * The dataset import job replaces any previous data in the dataset.
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
     * To get the status of the import job, call <a>DescribeDatasetImportJob</a>, providing the Amazon Resource Name
     * (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status
     * shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why the job
     * failed.
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
     * <a>ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetImportJob</a>
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
     * dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access
     * Management (IAM) role that has permission to read from the data source.
     * </p>
     * <important>
     * <p>
     * The dataset import job replaces any previous data in the dataset.
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
     * To get the status of the import job, call <a>DescribeDatasetImportJob</a>, providing the Amazon Resource Name
     * (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status
     * shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why the job
     * failed.
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
     * <a>ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetImportJob</a>
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
     * Creates an event tracker that you use when sending event data to the specified dataset group using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * <p>
     * When Amazon Personalize creates an event tracker, it also creates an <i>event-interactions</i> dataset in the
     * dataset group associated with the event tracker. The event-interactions dataset stores the event data from the
     * <code>PutEvents</code> call. The contents of this dataset are not available to the user.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will get an error if you call
     * <code>CreateEventTracker</code> using the same dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the
     * customer to send the data.
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
     * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
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
     * <a>ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteEventTracker</a>
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
     * Creates an event tracker that you use when sending event data to the specified dataset group using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * <p>
     * When Amazon Personalize creates an event tracker, it also creates an <i>event-interactions</i> dataset in the
     * dataset group associated with the event tracker. The event-interactions dataset stores the event data from the
     * <code>PutEvents</code> call. The contents of this dataset are not available to the user.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will get an error if you call
     * <code>CreateEventTracker</code> using the same dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the
     * customer to send the data.
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
     * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
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
     * <a>ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteEventTracker</a>
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
     * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON
     * format.
     * </p>
     * <p>
     * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set
     * of required field and keywords. You specify a schema when you call <a>CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSchema</a>
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
     * of required field and keywords. You specify a schema when you call <a>CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSchema</a>
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
     * <p>
     * Creates the configuration for training a model. A trained model is known as a solution. After the configuration
     * is created, you train the model (create a solution) by calling the <a>CreateSolutionVersion</a> operation. Every
     * time you call <code>CreateSolutionVersion</code>, a new version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling <a>GetSolutionMetrics</a>. When you are
     * satisfied with the version, you deploy it using <a>CreateCampaign</a>. The campaign provides recommendations to a
     * client through the <a
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
     * To get the status of the solution, call <a>DescribeSolution</a>. Wait until the status shows as ACTIVE before
     * calling <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
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
     * <p>
     * Creates the configuration for training a model. A trained model is known as a solution. After the configuration
     * is created, you train the model (create a solution) by calling the <a>CreateSolutionVersion</a> operation. Every
     * time you call <code>CreateSolutionVersion</code>, a new version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling <a>GetSolutionMetrics</a>. When you are
     * satisfied with the version, you deploy it using <a>CreateCampaign</a>. The campaign provides recommendations to a
     * client through the <a
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
     * To get the status of the solution, call <a>DescribeSolution</a>. Wait until the status shows as ACTIVE before
     * calling <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
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
     * Trains or retrains an active solution. A solution is created using the <a>CreateSolution</a> operation and must
     * be in the ACTIVE state before calling <code>CreateSolutionVersion</code>. A new version of the solution is
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
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a>DescribeSolutionVersion</a>. Wait until the status shows as ACTIVE
     * before calling <code>CreateCampaign</code>.
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
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
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
     * Trains or retrains an active solution. A solution is created using the <a>CreateSolution</a> operation and must
     * be in the ACTIVE state before calling <code>CreateSolutionVersion</code>. A new version of the solution is
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
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a>DescribeSolutionVersion</a>. Wait until the status shows as ACTIVE
     * before calling <code>CreateCampaign</code>.
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
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
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
     * request. For more information on campaigns, see <a>CreateCampaign</a>.
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
     * request. For more information on campaigns, see <a>CreateCampaign</a>.
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
     * <a>CreateDataset</a>.
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
     * <a>CreateDataset</a>.
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
     * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
     * more information on event trackers, see <a>CreateEventTracker</a>.
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
     * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
     * more information on event trackers, see <a>CreateEventTracker</a>.
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
     * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
     * information on schemas, see <a>CreateSchema</a>.
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
     * information on schemas, see <a>CreateSchema</a>.
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
     * must delete all campaigns based on the solution. To determine what campaigns are using the solution, call
     * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an
     * associated <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on
     * solutions, see <a>CreateSolution</a>.
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
     * must delete all campaigns based on the solution. To determine what campaigns are using the solution, call
     * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an
     * associated <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on
     * solutions, see <a>CreateSolution</a>.
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
     * For more information on campaigns, see <a>CreateCampaign</a>.
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
     * For more information on campaigns, see <a>CreateCampaign</a>.
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
     * Describes the given dataset. For more information on datasets, see <a>CreateDataset</a>.
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
     * Describes the given dataset. For more information on datasets, see <a>CreateDataset</a>.
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
     * Describes the given dataset group. For more information on dataset groups, see <a>CreateDatasetGroup</a>.
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
     * Describes the given dataset group. For more information on dataset groups, see <a>CreateDatasetGroup</a>.
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
     * Describes the dataset import job created by <a>CreateDatasetImportJob</a>, including the import job status.
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
     * Describes the dataset import job created by <a>CreateDatasetImportJob</a>, including the import job status.
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
     * event tracker. For more information on event trackers, see <a>CreateEventTracker</a>.
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
     * event tracker. For more information on event trackers, see <a>CreateEventTracker</a>.
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
     * <a>CreateSolution</a> API. <code>CreateSolution</code> trains a model by using the algorithm in the specified
     * recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
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
     * <a>CreateSolution</a> API. <code>CreateSolution</code> trains a model by using the algorithm in the specified
     * recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
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
     * Describes a schema. For more information on schemas, see <a>CreateSchema</a>.
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
     * Describes a schema. For more information on schemas, see <a>CreateSchema</a>.
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
     * Describes a solution. For more information on solutions, see <a>CreateSolution</a>.
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
     * Describes a solution. For more information on solutions, see <a>CreateSolution</a>.
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
     * Describes a specific version of a solution. For more information on solutions, see <a>CreateSolution</a>.
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
     * Describes a specific version of a solution. For more information on solutions, see <a>CreateSolution</a>.
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
     * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
     * associated with the account are listed. The response provides the properties for each campaign, including the
     * Amazon Resource Name (ARN). For more information on campaigns, see <a>CreateCampaign</a>.
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
     * Amazon Resource Name (ARN). For more information on campaigns, see <a>CreateCampaign</a>.
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
     * Returns a list of dataset groups. The response provides the properties for each dataset group, including the
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a>CreateDatasetGroup</a>.
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
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a>CreateDatasetGroup</a>.
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
     * import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see
     * <a>CreateDatasetImportJob</a>. For more information on datasets, see <a>CreateDataset</a>.
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
     * import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see
     * <a>CreateDatasetImportJob</a>. For more information on datasets, see <a>CreateDataset</a>.
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
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a>CreateDataset</a>.
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
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a>CreateDataset</a>.
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
     * see <a>CreateEventTracker</a>.
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
     * see <a>CreateEventTracker</a>.
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
     * Returns the list of schemas associated with the account. The response provides the properties for each schema,
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a>CreateSchema</a>.
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
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a>CreateSchema</a>.
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
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
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
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
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
     * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
     * solutions associated with the account are listed. The response provides the properties for each solution,
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
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
     * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
     * solutions associated with the account are listed. The response provides the properties for each solution,
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
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
     * Updates a campaign by either deploying a new solution or changing the value of the campaign's
     * <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the
     * <a>DescribeCampaign</a> API.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the updated campaign is <code>ACTIVE</code> before asking the
     * campaign for recommendations.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
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
     * Updates a campaign by either deploying a new solution or changing the value of the campaign's
     * <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the
     * <a>DescribeCampaign</a> API.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the updated campaign is <code>ACTIVE</code> before asking the
     * campaign for recommendations.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
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

}
