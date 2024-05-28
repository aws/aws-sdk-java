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
package com.amazonaws.services.cleanroomsml;

import javax.annotation.Generated;

import com.amazonaws.services.cleanroomsml.model.*;

/**
 * Interface for accessing AWS Clean Rooms ML asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cleanroomsml.AbstractAWSCleanRoomsMLAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Amazon Web Services Clean Rooms ML API Reference</i>.
 * </p>
 * <p>
 * Amazon Web Services Clean Rooms ML provides a privacy-enhancing method for two parties to identify similar users in
 * their data without the need to share their data with each other. The first party brings the training data to Clean
 * Rooms so that they can create and configure an audience model (lookalike model) and associate it with a
 * collaboration. The second party then brings their seed data to Clean Rooms and generates an audience (lookalike
 * segment) that resembles the training data.
 * </p>
 * <p>
 * To learn more about Amazon Web Services Clean Rooms ML concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/machine-learning.html">Clean Rooms User Guide</a>.
 * </p>
 * <p>
 * To learn more about SQL commands, functions, and conditions supported in Clean Rooms, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/sql-reference/sql-reference.html">Clean Rooms SQL Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCleanRoomsMLAsync extends AWSCleanRoomsML {

    /**
     * <p>
     * Defines the information necessary to create an audience model. An audience model is a machine learning model that
     * Clean Rooms ML trains to measure similarity between users. Clean Rooms ML manages training and storing the
     * audience model. The audience model can be used in multiple calls to the <a>StartAudienceGenerationJob</a> API.
     * </p>
     * 
     * @param createAudienceModelRequest
     * @return A Java Future containing the result of the CreateAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.CreateAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAudienceModelResult> createAudienceModelAsync(CreateAudienceModelRequest createAudienceModelRequest);

    /**
     * <p>
     * Defines the information necessary to create an audience model. An audience model is a machine learning model that
     * Clean Rooms ML trains to measure similarity between users. Clean Rooms ML manages training and storing the
     * audience model. The audience model can be used in multiple calls to the <a>StartAudienceGenerationJob</a> API.
     * </p>
     * 
     * @param createAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.CreateAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAudienceModelResult> createAudienceModelAsync(CreateAudienceModelRequest createAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAudienceModelRequest, CreateAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Defines the information necessary to create a configured audience model.
     * </p>
     * 
     * @param createConfiguredAudienceModelRequest
     * @return A Java Future containing the result of the CreateConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.CreateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredAudienceModelResult> createConfiguredAudienceModelAsync(
            CreateConfiguredAudienceModelRequest createConfiguredAudienceModelRequest);

    /**
     * <p>
     * Defines the information necessary to create a configured audience model.
     * </p>
     * 
     * @param createConfiguredAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.CreateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredAudienceModelResult> createConfiguredAudienceModelAsync(
            CreateConfiguredAudienceModelRequest createConfiguredAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfiguredAudienceModelRequest, CreateConfiguredAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Defines the information necessary to create a training dataset. In Clean Rooms ML, the
     * <code>TrainingDataset</code> is metadata that points to a Glue table, which is read only during
     * <code>AudienceModel</code> creation.
     * </p>
     * 
     * @param createTrainingDatasetRequest
     * @return A Java Future containing the result of the CreateTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.CreateTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingDatasetResult> createTrainingDatasetAsync(CreateTrainingDatasetRequest createTrainingDatasetRequest);

    /**
     * <p>
     * Defines the information necessary to create a training dataset. In Clean Rooms ML, the
     * <code>TrainingDataset</code> is metadata that points to a Glue table, which is read only during
     * <code>AudienceModel</code> creation.
     * </p>
     * 
     * @param createTrainingDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.CreateTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingDatasetResult> createTrainingDatasetAsync(CreateTrainingDatasetRequest createTrainingDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrainingDatasetRequest, CreateTrainingDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified audience generation job, and removes all data associated with the job.
     * </p>
     * 
     * @param deleteAudienceGenerationJobRequest
     * @return A Java Future containing the result of the DeleteAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.DeleteAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAudienceGenerationJobResult> deleteAudienceGenerationJobAsync(
            DeleteAudienceGenerationJobRequest deleteAudienceGenerationJobRequest);

    /**
     * <p>
     * Deletes the specified audience generation job, and removes all data associated with the job.
     * </p>
     * 
     * @param deleteAudienceGenerationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.DeleteAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAudienceGenerationJobResult> deleteAudienceGenerationJobAsync(
            DeleteAudienceGenerationJobRequest deleteAudienceGenerationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAudienceGenerationJobRequest, DeleteAudienceGenerationJobResult> asyncHandler);

    /**
     * <p>
     * Specifies an audience model that you want to delete. You can't delete an audience model if there are any
     * configured audience models that depend on the audience model.
     * </p>
     * 
     * @param deleteAudienceModelRequest
     * @return A Java Future containing the result of the DeleteAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.DeleteAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAudienceModelResult> deleteAudienceModelAsync(DeleteAudienceModelRequest deleteAudienceModelRequest);

    /**
     * <p>
     * Specifies an audience model that you want to delete. You can't delete an audience model if there are any
     * configured audience models that depend on the audience model.
     * </p>
     * 
     * @param deleteAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.DeleteAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAudienceModelResult> deleteAudienceModelAsync(DeleteAudienceModelRequest deleteAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAudienceModelRequest, DeleteAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configured audience model. You can't delete a configured audience model if there are any
     * lookalike models that use the configured audience model. If you delete a configured audience model, it will be
     * removed from any collaborations that it is associated to.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelRequest
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.DeleteConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelResult> deleteConfiguredAudienceModelAsync(
            DeleteConfiguredAudienceModelRequest deleteConfiguredAudienceModelRequest);

    /**
     * <p>
     * Deletes the specified configured audience model. You can't delete a configured audience model if there are any
     * lookalike models that use the configured audience model. If you delete a configured audience model, it will be
     * removed from any collaborations that it is associated to.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.DeleteConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelResult> deleteConfiguredAudienceModelAsync(
            DeleteConfiguredAudienceModelRequest deleteConfiguredAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredAudienceModelRequest, DeleteConfiguredAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configured audience model policy.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelPolicyRequest
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.DeleteConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelPolicyResult> deleteConfiguredAudienceModelPolicyAsync(
            DeleteConfiguredAudienceModelPolicyRequest deleteConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Deletes the specified configured audience model policy.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.DeleteConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelPolicyResult> deleteConfiguredAudienceModelPolicyAsync(
            DeleteConfiguredAudienceModelPolicyRequest deleteConfiguredAudienceModelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredAudienceModelPolicyRequest, DeleteConfiguredAudienceModelPolicyResult> asyncHandler);

    /**
     * <p>
     * Specifies a training dataset that you want to delete. You can't delete a training dataset if there are any
     * audience models that depend on the training dataset. In Clean Rooms ML, the <code>TrainingDataset</code> is
     * metadata that points to a Glue table, which is read only during <code>AudienceModel</code> creation. This action
     * deletes the metadata.
     * </p>
     * 
     * @param deleteTrainingDatasetRequest
     * @return A Java Future containing the result of the DeleteTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.DeleteTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrainingDatasetResult> deleteTrainingDatasetAsync(DeleteTrainingDatasetRequest deleteTrainingDatasetRequest);

    /**
     * <p>
     * Specifies a training dataset that you want to delete. You can't delete a training dataset if there are any
     * audience models that depend on the training dataset. In Clean Rooms ML, the <code>TrainingDataset</code> is
     * metadata that points to a Glue table, which is read only during <code>AudienceModel</code> creation. This action
     * deletes the metadata.
     * </p>
     * 
     * @param deleteTrainingDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.DeleteTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrainingDatasetResult> deleteTrainingDatasetAsync(DeleteTrainingDatasetRequest deleteTrainingDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrainingDatasetRequest, DeleteTrainingDatasetResult> asyncHandler);

    /**
     * <p>
     * Returns information about an audience generation job.
     * </p>
     * 
     * @param getAudienceGenerationJobRequest
     * @return A Java Future containing the result of the GetAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.GetAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAudienceGenerationJobResult> getAudienceGenerationJobAsync(GetAudienceGenerationJobRequest getAudienceGenerationJobRequest);

    /**
     * <p>
     * Returns information about an audience generation job.
     * </p>
     * 
     * @param getAudienceGenerationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.GetAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAudienceGenerationJobResult> getAudienceGenerationJobAsync(GetAudienceGenerationJobRequest getAudienceGenerationJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetAudienceGenerationJobRequest, GetAudienceGenerationJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about an audience model
     * </p>
     * 
     * @param getAudienceModelRequest
     * @return A Java Future containing the result of the GetAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.GetAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAudienceModelResult> getAudienceModelAsync(GetAudienceModelRequest getAudienceModelRequest);

    /**
     * <p>
     * Returns information about an audience model
     * </p>
     * 
     * @param getAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.GetAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAudienceModelResult> getAudienceModelAsync(GetAudienceModelRequest getAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetAudienceModelRequest, GetAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specified configured audience model.
     * </p>
     * 
     * @param getConfiguredAudienceModelRequest
     * @return A Java Future containing the result of the GetConfiguredAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.GetConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelResult> getConfiguredAudienceModelAsync(
            GetConfiguredAudienceModelRequest getConfiguredAudienceModelRequest);

    /**
     * <p>
     * Returns information about a specified configured audience model.
     * </p>
     * 
     * @param getConfiguredAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredAudienceModel operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.GetConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelResult> getConfiguredAudienceModelAsync(
            GetConfiguredAudienceModelRequest getConfiguredAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredAudienceModelRequest, GetConfiguredAudienceModelResult> asyncHandler);

    /**
     * <p>
     * Returns information about a configured audience model policy.
     * </p>
     * 
     * @param getConfiguredAudienceModelPolicyRequest
     * @return A Java Future containing the result of the GetConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.GetConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelPolicyResult> getConfiguredAudienceModelPolicyAsync(
            GetConfiguredAudienceModelPolicyRequest getConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Returns information about a configured audience model policy.
     * </p>
     * 
     * @param getConfiguredAudienceModelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.GetConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelPolicyResult> getConfiguredAudienceModelPolicyAsync(
            GetConfiguredAudienceModelPolicyRequest getConfiguredAudienceModelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredAudienceModelPolicyRequest, GetConfiguredAudienceModelPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns information about a training dataset.
     * </p>
     * 
     * @param getTrainingDatasetRequest
     * @return A Java Future containing the result of the GetTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.GetTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrainingDatasetResult> getTrainingDatasetAsync(GetTrainingDatasetRequest getTrainingDatasetRequest);

    /**
     * <p>
     * Returns information about a training dataset.
     * </p>
     * 
     * @param getTrainingDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrainingDataset operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.GetTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrainingDatasetResult> getTrainingDatasetAsync(GetTrainingDatasetRequest getTrainingDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrainingDatasetRequest, GetTrainingDatasetResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the audience export jobs.
     * </p>
     * 
     * @param listAudienceExportJobsRequest
     * @return A Java Future containing the result of the ListAudienceExportJobs operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.ListAudienceExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceExportJobsResult> listAudienceExportJobsAsync(ListAudienceExportJobsRequest listAudienceExportJobsRequest);

    /**
     * <p>
     * Returns a list of the audience export jobs.
     * </p>
     * 
     * @param listAudienceExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAudienceExportJobs operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListAudienceExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceExportJobsResult> listAudienceExportJobsAsync(ListAudienceExportJobsRequest listAudienceExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAudienceExportJobsRequest, ListAudienceExportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of audience generation jobs.
     * </p>
     * 
     * @param listAudienceGenerationJobsRequest
     * @return A Java Future containing the result of the ListAudienceGenerationJobs operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.ListAudienceGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceGenerationJobsResult> listAudienceGenerationJobsAsync(
            ListAudienceGenerationJobsRequest listAudienceGenerationJobsRequest);

    /**
     * <p>
     * Returns a list of audience generation jobs.
     * </p>
     * 
     * @param listAudienceGenerationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAudienceGenerationJobs operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListAudienceGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceGenerationJobsResult> listAudienceGenerationJobsAsync(
            ListAudienceGenerationJobsRequest listAudienceGenerationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAudienceGenerationJobsRequest, ListAudienceGenerationJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of audience models.
     * </p>
     * 
     * @param listAudienceModelsRequest
     * @return A Java Future containing the result of the ListAudienceModels operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.ListAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceModelsResult> listAudienceModelsAsync(ListAudienceModelsRequest listAudienceModelsRequest);

    /**
     * <p>
     * Returns a list of audience models.
     * </p>
     * 
     * @param listAudienceModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAudienceModels operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAudienceModelsResult> listAudienceModelsAsync(ListAudienceModelsRequest listAudienceModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAudienceModelsRequest, ListAudienceModelsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the configured audience models.
     * </p>
     * 
     * @param listConfiguredAudienceModelsRequest
     * @return A Java Future containing the result of the ListConfiguredAudienceModels operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.ListConfiguredAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListConfiguredAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredAudienceModelsResult> listConfiguredAudienceModelsAsync(
            ListConfiguredAudienceModelsRequest listConfiguredAudienceModelsRequest);

    /**
     * <p>
     * Returns a list of the configured audience models.
     * </p>
     * 
     * @param listConfiguredAudienceModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfiguredAudienceModels operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListConfiguredAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListConfiguredAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredAudienceModelsResult> listConfiguredAudienceModelsAsync(
            ListConfiguredAudienceModelsRequest listConfiguredAudienceModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfiguredAudienceModelsRequest, ListConfiguredAudienceModelsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a provided resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a provided resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of training datasets.
     * </p>
     * 
     * @param listTrainingDatasetsRequest
     * @return A Java Future containing the result of the ListTrainingDatasets operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.ListTrainingDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTrainingDatasets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingDatasetsResult> listTrainingDatasetsAsync(ListTrainingDatasetsRequest listTrainingDatasetsRequest);

    /**
     * <p>
     * Returns a list of training datasets.
     * </p>
     * 
     * @param listTrainingDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrainingDatasets operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.ListTrainingDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTrainingDatasets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingDatasetsResult> listTrainingDatasetsAsync(ListTrainingDatasetsRequest listTrainingDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrainingDatasetsRequest, ListTrainingDatasetsResult> asyncHandler);

    /**
     * <p>
     * Create or update the resource policy for a configured audience model.
     * </p>
     * 
     * @param putConfiguredAudienceModelPolicyRequest
     * @return A Java Future containing the result of the PutConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.PutConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/PutConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfiguredAudienceModelPolicyResult> putConfiguredAudienceModelPolicyAsync(
            PutConfiguredAudienceModelPolicyRequest putConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Create or update the resource policy for a configured audience model.
     * </p>
     * 
     * @param putConfiguredAudienceModelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutConfiguredAudienceModelPolicy operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.PutConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/PutConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutConfiguredAudienceModelPolicyResult> putConfiguredAudienceModelPolicyAsync(
            PutConfiguredAudienceModelPolicyRequest putConfiguredAudienceModelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutConfiguredAudienceModelPolicyRequest, PutConfiguredAudienceModelPolicyResult> asyncHandler);

    /**
     * <p>
     * Export an audience of a specified size after you have generated an audience.
     * </p>
     * 
     * @param startAudienceExportJobRequest
     * @return A Java Future containing the result of the StartAudienceExportJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.StartAudienceExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAudienceExportJobResult> startAudienceExportJobAsync(StartAudienceExportJobRequest startAudienceExportJobRequest);

    /**
     * <p>
     * Export an audience of a specified size after you have generated an audience.
     * </p>
     * 
     * @param startAudienceExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAudienceExportJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.StartAudienceExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAudienceExportJobResult> startAudienceExportJobAsync(StartAudienceExportJobRequest startAudienceExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartAudienceExportJobRequest, StartAudienceExportJobResult> asyncHandler);

    /**
     * <p>
     * Information necessary to start the audience generation job.
     * </p>
     * 
     * @param startAudienceGenerationJobRequest
     * @return A Java Future containing the result of the StartAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.StartAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAudienceGenerationJobResult> startAudienceGenerationJobAsync(
            StartAudienceGenerationJobRequest startAudienceGenerationJobRequest);

    /**
     * <p>
     * Information necessary to start the audience generation job.
     * </p>
     * 
     * @param startAudienceGenerationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAudienceGenerationJob operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.StartAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAudienceGenerationJobResult> startAudienceGenerationJobAsync(
            StartAudienceGenerationJobRequest startAudienceGenerationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartAudienceGenerationJobRequest, StartAudienceGenerationJobResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCleanRoomsMLAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Provides the information necessary to update a configured audience model. Updates that impact audience generation
     * jobs take effect when a new job starts, but do not impact currently running jobs.
     * </p>
     * 
     * @param updateConfiguredAudienceModelRequest
     * @return A Java Future containing the result of the UpdateConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsync.UpdateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredAudienceModelResult> updateConfiguredAudienceModelAsync(
            UpdateConfiguredAudienceModelRequest updateConfiguredAudienceModelRequest);

    /**
     * <p>
     * Provides the information necessary to update a configured audience model. Updates that impact audience generation
     * jobs take effect when a new job starts, but do not impact currently running jobs.
     * </p>
     * 
     * @param updateConfiguredAudienceModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguredAudienceModel operation returned by the
     *         service.
     * @sample AWSCleanRoomsMLAsyncHandler.UpdateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredAudienceModelResult> updateConfiguredAudienceModelAsync(
            UpdateConfiguredAudienceModelRequest updateConfiguredAudienceModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfiguredAudienceModelRequest, UpdateConfiguredAudienceModelResult> asyncHandler);

}
