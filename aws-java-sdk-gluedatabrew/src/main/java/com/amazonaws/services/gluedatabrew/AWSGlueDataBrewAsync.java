/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;

/**
 * Interface for accessing AWS Glue DataBrew asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gluedatabrew.AbstractAWSGlueDataBrewAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Glue DataBrew is a visual, cloud-scale data-preparation service. DataBrew simplifies data preparation tasks,
 * targeting data issues that are hard to spot and time-consuming to fix. DataBrew empowers users of all technical
 * levels to visualize the data and perform one-click data transformations, with no coding required.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlueDataBrewAsync extends AWSGlueDataBrew {

    /**
     * <p>
     * Deletes one or more versions of a recipe at a time.
     * </p>
     * 
     * @param batchDeleteRecipeVersionRequest
     * @return A Java Future containing the result of the BatchDeleteRecipeVersion operation returned by the service.
     * @sample AWSGlueDataBrewAsync.BatchDeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteRecipeVersionResult> batchDeleteRecipeVersionAsync(BatchDeleteRecipeVersionRequest batchDeleteRecipeVersionRequest);

    /**
     * <p>
     * Deletes one or more versions of a recipe at a time.
     * </p>
     * 
     * @param batchDeleteRecipeVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteRecipeVersion operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.BatchDeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteRecipeVersionResult> batchDeleteRecipeVersionAsync(BatchDeleteRecipeVersionRequest batchDeleteRecipeVersionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteRecipeVersionRequest, BatchDeleteRecipeVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew dataset for this AWS account.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew dataset for this AWS account.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a new job to profile an AWS Glue DataBrew dataset that exists in the current AWS account.
     * </p>
     * 
     * @param createProfileJobRequest
     * @return A Java Future containing the result of the CreateProfileJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileJobResult> createProfileJobAsync(CreateProfileJobRequest createProfileJobRequest);

    /**
     * <p>
     * Creates a new job to profile an AWS Glue DataBrew dataset that exists in the current AWS account.
     * </p>
     * 
     * @param createProfileJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProfileJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProfileJobResult> createProfileJobAsync(CreateProfileJobRequest createProfileJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProfileJobRequest, CreateProfileJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew project in the current AWS account.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew project in the current AWS account.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew recipe for the current AWS account.
     * </p>
     * 
     * @param createRecipeRequest
     * @return A Java Future containing the result of the CreateRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRecipeResult> createRecipeAsync(CreateRecipeRequest createRecipeRequest);

    /**
     * <p>
     * Creates a new AWS Glue DataBrew recipe for the current AWS account.
     * </p>
     * 
     * @param createRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRecipeResult> createRecipeAsync(CreateRecipeRequest createRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecipeRequest, CreateRecipeResult> asyncHandler);

    /**
     * <p>
     * Creates a new job for an existing AWS Glue DataBrew recipe in the current AWS account. You can create a
     * standalone job using either a project, or a combination of a recipe and a dataset.
     * </p>
     * 
     * @param createRecipeJobRequest
     * @return A Java Future containing the result of the CreateRecipeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRecipeJobResult> createRecipeJobAsync(CreateRecipeJobRequest createRecipeJobRequest);

    /**
     * <p>
     * Creates a new job for an existing AWS Glue DataBrew recipe in the current AWS account. You can create a
     * standalone job using either a project, or a combination of a recipe and a dataset.
     * </p>
     * 
     * @param createRecipeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecipeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRecipeJobResult> createRecipeJobAsync(CreateRecipeJobRequest createRecipeJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecipeJobRequest, CreateRecipeJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new schedule for one or more AWS Glue DataBrew jobs. Jobs can be run at a specific date and time, or at
     * regular intervals.
     * </p>
     * 
     * @param createScheduleRequest
     * @return A Java Future containing the result of the CreateSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsync.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest createScheduleRequest);

    /**
     * <p>
     * Creates a new schedule for one or more AWS Glue DataBrew jobs. Jobs can be run at a specific date and time, or at
     * regular intervals.
     * </p>
     * 
     * @param createScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScheduleResult> createScheduleAsync(CreateScheduleRequest createScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScheduleRequest, CreateScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset from AWS Glue DataBrew.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a dataset from AWS Glue DataBrew.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified AWS Glue DataBrew job from the current AWS account. The job can be for a recipe or for a
     * profile.
     * </p>
     * 
     * @param deleteJobRequest
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes the specified AWS Glue DataBrew job from the current AWS account. The job can be for a recipe or for a
     * profile.
     * </p>
     * 
     * @param deleteJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobResult> deleteJobAsync(DeleteJobRequest deleteJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobRequest, DeleteJobResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing AWS Glue DataBrew project from the current AWS account.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes an existing AWS Glue DataBrew project from the current AWS account.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a single version of an AWS Glue DataBrew recipe.
     * </p>
     * 
     * @param deleteRecipeVersionRequest
     * @return A Java Future containing the result of the DeleteRecipeVersion operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteRecipeVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecipeVersionResult> deleteRecipeVersionAsync(DeleteRecipeVersionRequest deleteRecipeVersionRequest);

    /**
     * <p>
     * Deletes a single version of an AWS Glue DataBrew recipe.
     * </p>
     * 
     * @param deleteRecipeVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecipeVersion operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteRecipeVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecipeVersionResult> deleteRecipeVersionAsync(DeleteRecipeVersionRequest deleteRecipeVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecipeVersionRequest, DeleteRecipeVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified AWS Glue DataBrew schedule from the current AWS account.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * <p>
     * Deletes the specified AWS Glue DataBrew schedule from the current AWS account.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest deleteScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew dataset that is in the current AWS account.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew dataset that is in the current AWS account.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew job that is in the current AWS account.
     * </p>
     * 
     * @param describeJobRequest
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew job that is in the current AWS account.
     * </p>
     * 
     * @param describeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew project that is in the current AWS account.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew project that is in the current AWS account.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew recipe that is in the current AWS account.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return A Java Future containing the result of the DescribeRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest describeRecipeRequest);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew recipe that is in the current AWS account.
     * </p>
     * 
     * @param describeRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecipeResult> describeRecipeAsync(DescribeRecipeRequest describeRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecipeRequest, DescribeRecipeResult> asyncHandler);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew schedule that is in the current AWS account.
     * </p>
     * 
     * @param describeScheduleRequest
     * @return A Java Future containing the result of the DescribeSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsync.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest describeScheduleRequest);

    /**
     * <p>
     * Returns the definition of a specific AWS Glue DataBrew schedule that is in the current AWS account.
     * </p>
     * 
     * @param describeScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest describeScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduleRequest, DescribeScheduleResult> asyncHandler);

    /**
     * <p>
     * Lists all of the AWS Glue DataBrew datasets for the current AWS account.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all of the AWS Glue DataBrew datasets for the current AWS account.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the previous runs of a particular AWS Glue DataBrew job in the current AWS account.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists all of the previous runs of a particular AWS Glue DataBrew job in the current AWS account.
     * </p>
     * 
     * @param listJobRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobRuns operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest listJobRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler);

    /**
     * <p>
     * Lists the AWS Glue DataBrew jobs in the current AWS account.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists the AWS Glue DataBrew jobs in the current AWS account.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the DataBrew projects in the current AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists all of the DataBrew projects in the current AWS account.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the versions of a particular AWS Glue DataBrew recipe in the current AWS account.
     * </p>
     * 
     * @param listRecipeVersionsRequest
     * @return A Java Future containing the result of the ListRecipeVersions operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListRecipeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRecipeVersionsResult> listRecipeVersionsAsync(ListRecipeVersionsRequest listRecipeVersionsRequest);

    /**
     * <p>
     * Lists all of the versions of a particular AWS Glue DataBrew recipe in the current AWS account.
     * </p>
     * 
     * @param listRecipeVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecipeVersions operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListRecipeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRecipeVersionsResult> listRecipeVersionsAsync(ListRecipeVersionsRequest listRecipeVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecipeVersionsRequest, ListRecipeVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the AWS Glue DataBrew recipes in the current AWS account.
     * </p>
     * 
     * @param listRecipesRequest
     * @return A Java Future containing the result of the ListRecipes operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest listRecipesRequest);

    /**
     * <p>
     * Lists all of the AWS Glue DataBrew recipes in the current AWS account.
     * </p>
     * 
     * @param listRecipesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecipes operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRecipesResult> listRecipesAsync(ListRecipesRequest listRecipesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecipesRequest, ListRecipesResult> asyncHandler);

    /**
     * <p>
     * Lists the AWS Glue DataBrew schedules in the current AWS account.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return A Java Future containing the result of the ListSchedules operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest listSchedulesRequest);

    /**
     * <p>
     * Lists the AWS Glue DataBrew schedules in the current AWS account.
     * </p>
     * 
     * @param listSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchedules operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchedulesResult> listSchedulesAsync(ListSchedulesRequest listSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchedulesRequest, ListSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists all the tags for an AWS Glue DataBrew resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGlueDataBrewAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all the tags for an AWS Glue DataBrew resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Publishes a new major version of an AWS Glue DataBrew recipe that exists in the current AWS account.
     * </p>
     * 
     * @param publishRecipeRequest
     * @return A Java Future containing the result of the PublishRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsync.PublishRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/PublishRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishRecipeResult> publishRecipeAsync(PublishRecipeRequest publishRecipeRequest);

    /**
     * <p>
     * Publishes a new major version of an AWS Glue DataBrew recipe that exists in the current AWS account.
     * </p>
     * 
     * @param publishRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PublishRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.PublishRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/PublishRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PublishRecipeResult> publishRecipeAsync(PublishRecipeRequest publishRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<PublishRecipeRequest, PublishRecipeResult> asyncHandler);

    /**
     * <p>
     * Performs a recipe step within an interactive AWS Glue DataBrew session that's currently open.
     * </p>
     * 
     * @param sendProjectSessionActionRequest
     * @return A Java Future containing the result of the SendProjectSessionAction operation returned by the service.
     * @sample AWSGlueDataBrewAsync.SendProjectSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendProjectSessionActionResult> sendProjectSessionActionAsync(SendProjectSessionActionRequest sendProjectSessionActionRequest);

    /**
     * <p>
     * Performs a recipe step within an interactive AWS Glue DataBrew session that's currently open.
     * </p>
     * 
     * @param sendProjectSessionActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendProjectSessionAction operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.SendProjectSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendProjectSessionActionResult> sendProjectSessionActionAsync(SendProjectSessionActionRequest sendProjectSessionActionRequest,
            com.amazonaws.handlers.AsyncHandler<SendProjectSessionActionRequest, SendProjectSessionActionResult> asyncHandler);

    /**
     * <p>
     * Runs an AWS Glue DataBrew job that exists in the current AWS account.
     * </p>
     * 
     * @param startJobRunRequest
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSGlueDataBrewAsync.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Runs an AWS Glue DataBrew job that exists in the current AWS account.
     * </p>
     * 
     * @param startJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartJobRun operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest startJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler);

    /**
     * <p>
     * Creates an interactive session, enabling you to manipulate an AWS Glue DataBrew project.
     * </p>
     * 
     * @param startProjectSessionRequest
     * @return A Java Future containing the result of the StartProjectSession operation returned by the service.
     * @sample AWSGlueDataBrewAsync.StartProjectSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartProjectSessionResult> startProjectSessionAsync(StartProjectSessionRequest startProjectSessionRequest);

    /**
     * <p>
     * Creates an interactive session, enabling you to manipulate an AWS Glue DataBrew project.
     * </p>
     * 
     * @param startProjectSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartProjectSession operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.StartProjectSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartProjectSessionResult> startProjectSessionAsync(StartProjectSessionRequest startProjectSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartProjectSessionRequest, StartProjectSessionResult> asyncHandler);

    /**
     * <p>
     * Stops the specified job from running in the current AWS account.
     * </p>
     * 
     * @param stopJobRunRequest
     * @return A Java Future containing the result of the StopJobRun operation returned by the service.
     * @sample AWSGlueDataBrewAsync.StopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobRunResult> stopJobRunAsync(StopJobRunRequest stopJobRunRequest);

    /**
     * <p>
     * Stops the specified job from running in the current AWS account.
     * </p>
     * 
     * @param stopJobRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopJobRun operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.StopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopJobRunResult> stopJobRunAsync(StopJobRunRequest stopJobRunRequest,
            com.amazonaws.handlers.AsyncHandler<StopJobRunRequest, StopJobRunResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to an AWS Glue DataBrew resource, such as a dataset, job, project, or recipe.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlueDataBrewAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to an AWS Glue DataBrew resource, such as a dataset, job, project, or recipe.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from an AWS Glue DataBrew resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from an AWS Glue DataBrew resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew dataset in the current AWS account.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew dataset in the current AWS account.
     * </p>
     * 
     * @param updateDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataset operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetResult> updateDatasetAsync(UpdateDatasetRequest updateDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetRequest, UpdateDatasetResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew job in the current AWS account.
     * </p>
     * 
     * @param updateProfileJobRequest
     * @return A Java Future containing the result of the UpdateProfileJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileJobResult> updateProfileJobAsync(UpdateProfileJobRequest updateProfileJobRequest);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew job in the current AWS account.
     * </p>
     * 
     * @param updateProfileJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProfileJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProfileJobResult> updateProfileJobAsync(UpdateProfileJobRequest updateProfileJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProfileJobRequest, UpdateProfileJobResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew project in the current AWS account.
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew project in the current AWS account.
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of the latest working version of an AWS Glue DataBrew recipe in the current AWS account.
     * </p>
     * 
     * @param updateRecipeRequest
     * @return A Java Future containing the result of the UpdateRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecipeResult> updateRecipeAsync(UpdateRecipeRequest updateRecipeRequest);

    /**
     * <p>
     * Modifies the definition of the latest working version of an AWS Glue DataBrew recipe in the current AWS account.
     * </p>
     * 
     * @param updateRecipeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecipe operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecipeResult> updateRecipeAsync(UpdateRecipeRequest updateRecipeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecipeRequest, UpdateRecipeResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew recipe job in the current AWS account.
     * </p>
     * 
     * @param updateRecipeJobRequest
     * @return A Java Future containing the result of the UpdateRecipeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecipeJobResult> updateRecipeJobAsync(UpdateRecipeJobRequest updateRecipeJobRequest);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew recipe job in the current AWS account.
     * </p>
     * 
     * @param updateRecipeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecipeJob operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecipeJobResult> updateRecipeJobAsync(UpdateRecipeJobRequest updateRecipeJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecipeJobRequest, UpdateRecipeJobResult> asyncHandler);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew schedule in the current AWS account.
     * </p>
     * 
     * @param updateScheduleRequest
     * @return A Java Future containing the result of the UpdateSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsync.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest updateScheduleRequest);

    /**
     * <p>
     * Modifies the definition of an existing AWS Glue DataBrew schedule in the current AWS account.
     * </p>
     * 
     * @param updateScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSchedule operation returned by the service.
     * @sample AWSGlueDataBrewAsyncHandler.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScheduleResult> updateScheduleAsync(UpdateScheduleRequest updateScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResult> asyncHandler);

}
