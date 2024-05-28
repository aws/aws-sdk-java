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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cleanroomsml.model.*;

/**
 * Interface for accessing AWS Clean Rooms ML.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cleanroomsml.AbstractAWSCleanRoomsML} instead.
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
public interface AWSCleanRoomsML {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cleanrooms-ml";

    /**
     * <p>
     * Defines the information necessary to create an audience model. An audience model is a machine learning model that
     * Clean Rooms ML trains to measure similarity between users. Clean Rooms ML manages training and storing the
     * audience model. The audience model can be used in multiple calls to the <a>StartAudienceGenerationJob</a> API.
     * </p>
     * 
     * @param createAudienceModelRequest
     * @return Result of the CreateAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.CreateAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAudienceModelResult createAudienceModel(CreateAudienceModelRequest createAudienceModelRequest);

    /**
     * <p>
     * Defines the information necessary to create a configured audience model.
     * </p>
     * 
     * @param createConfiguredAudienceModelRequest
     * @return Result of the CreateConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.CreateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfiguredAudienceModelResult createConfiguredAudienceModel(CreateConfiguredAudienceModelRequest createConfiguredAudienceModelRequest);

    /**
     * <p>
     * Defines the information necessary to create a training dataset. In Clean Rooms ML, the
     * <code>TrainingDataset</code> is metadata that points to a Glue table, which is read only during
     * <code>AudienceModel</code> creation.
     * </p>
     * 
     * @param createTrainingDatasetRequest
     * @return Result of the CreateTrainingDataset operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.CreateTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/CreateTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrainingDatasetResult createTrainingDataset(CreateTrainingDatasetRequest createTrainingDatasetRequest);

    /**
     * <p>
     * Deletes the specified audience generation job, and removes all data associated with the job.
     * </p>
     * 
     * @param deleteAudienceGenerationJobRequest
     * @return Result of the DeleteAudienceGenerationJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAudienceGenerationJobResult deleteAudienceGenerationJob(DeleteAudienceGenerationJobRequest deleteAudienceGenerationJobRequest);

    /**
     * <p>
     * Specifies an audience model that you want to delete. You can't delete an audience model if there are any
     * configured audience models that depend on the audience model.
     * </p>
     * 
     * @param deleteAudienceModelRequest
     * @return Result of the DeleteAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAudienceModelResult deleteAudienceModel(DeleteAudienceModelRequest deleteAudienceModelRequest);

    /**
     * <p>
     * Deletes the specified configured audience model. You can't delete a configured audience model if there are any
     * lookalike models that use the configured audience model. If you delete a configured audience model, it will be
     * removed from any collaborations that it is associated to.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelRequest
     * @return Result of the DeleteConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredAudienceModelResult deleteConfiguredAudienceModel(DeleteConfiguredAudienceModelRequest deleteConfiguredAudienceModelRequest);

    /**
     * <p>
     * Deletes the specified configured audience model policy.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelPolicyRequest
     * @return Result of the DeleteConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredAudienceModelPolicyResult deleteConfiguredAudienceModelPolicy(
            DeleteConfiguredAudienceModelPolicyRequest deleteConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Specifies a training dataset that you want to delete. You can't delete a training dataset if there are any
     * audience models that depend on the training dataset. In Clean Rooms ML, the <code>TrainingDataset</code> is
     * metadata that points to a Glue table, which is read only during <code>AudienceModel</code> creation. This action
     * deletes the metadata.
     * </p>
     * 
     * @param deleteTrainingDatasetRequest
     * @return Result of the DeleteTrainingDataset operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.DeleteTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrainingDatasetResult deleteTrainingDataset(DeleteTrainingDatasetRequest deleteTrainingDatasetRequest);

    /**
     * <p>
     * Returns information about an audience generation job.
     * </p>
     * 
     * @param getAudienceGenerationJobRequest
     * @return Result of the GetAudienceGenerationJob operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetAudienceGenerationJobResult getAudienceGenerationJob(GetAudienceGenerationJobRequest getAudienceGenerationJobRequest);

    /**
     * <p>
     * Returns information about an audience model
     * </p>
     * 
     * @param getAudienceModelRequest
     * @return Result of the GetAudienceModel operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceModel" target="_top">AWS
     *      API Documentation</a>
     */
    GetAudienceModelResult getAudienceModel(GetAudienceModelRequest getAudienceModelRequest);

    /**
     * <p>
     * Returns information about a specified configured audience model.
     * </p>
     * 
     * @param getConfiguredAudienceModelRequest
     * @return Result of the GetConfiguredAudienceModel operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfiguredAudienceModelResult getConfiguredAudienceModel(GetConfiguredAudienceModelRequest getConfiguredAudienceModelRequest);

    /**
     * <p>
     * Returns information about a configured audience model policy.
     * </p>
     * 
     * @param getConfiguredAudienceModelPolicyRequest
     * @return Result of the GetConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfiguredAudienceModelPolicyResult getConfiguredAudienceModelPolicy(GetConfiguredAudienceModelPolicyRequest getConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Returns information about a training dataset.
     * </p>
     * 
     * @param getTrainingDatasetRequest
     * @return Result of the GetTrainingDataset operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.GetTrainingDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset"
     *      target="_top">AWS API Documentation</a>
     */
    GetTrainingDatasetResult getTrainingDataset(GetTrainingDatasetRequest getTrainingDatasetRequest);

    /**
     * <p>
     * Returns a list of the audience export jobs.
     * </p>
     * 
     * @param listAudienceExportJobsRequest
     * @return Result of the ListAudienceExportJobs operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListAudienceExportJobsResult listAudienceExportJobs(ListAudienceExportJobsRequest listAudienceExportJobsRequest);

    /**
     * <p>
     * Returns a list of audience generation jobs.
     * </p>
     * 
     * @param listAudienceGenerationJobsRequest
     * @return Result of the ListAudienceGenerationJobs operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceGenerationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceGenerationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListAudienceGenerationJobsResult listAudienceGenerationJobs(ListAudienceGenerationJobsRequest listAudienceGenerationJobsRequest);

    /**
     * <p>
     * Returns a list of audience models.
     * </p>
     * 
     * @param listAudienceModelsRequest
     * @return Result of the ListAudienceModels operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    ListAudienceModelsResult listAudienceModels(ListAudienceModelsRequest listAudienceModelsRequest);

    /**
     * <p>
     * Returns a list of the configured audience models.
     * </p>
     * 
     * @param listConfiguredAudienceModelsRequest
     * @return Result of the ListConfiguredAudienceModels operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListConfiguredAudienceModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListConfiguredAudienceModels"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfiguredAudienceModelsResult listConfiguredAudienceModels(ListConfiguredAudienceModelsRequest listConfiguredAudienceModelsRequest);

    /**
     * <p>
     * Returns a list of tags for a provided resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of training datasets.
     * </p>
     * 
     * @param listTrainingDatasetsRequest
     * @return Result of the ListTrainingDatasets operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCleanRoomsML.ListTrainingDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/ListTrainingDatasets"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrainingDatasetsResult listTrainingDatasets(ListTrainingDatasetsRequest listTrainingDatasetsRequest);

    /**
     * <p>
     * Create or update the resource policy for a configured audience model.
     * </p>
     * 
     * @param putConfiguredAudienceModelPolicyRequest
     * @return Result of the PutConfiguredAudienceModelPolicy operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.PutConfiguredAudienceModelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/PutConfiguredAudienceModelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfiguredAudienceModelPolicyResult putConfiguredAudienceModelPolicy(PutConfiguredAudienceModelPolicyRequest putConfiguredAudienceModelPolicyRequest);

    /**
     * <p>
     * Export an audience of a specified size after you have generated an audience.
     * </p>
     * 
     * @param startAudienceExportJobRequest
     * @return Result of the StartAudienceExportJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.StartAudienceExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartAudienceExportJobResult startAudienceExportJob(StartAudienceExportJobRequest startAudienceExportJobRequest);

    /**
     * <p>
     * Information necessary to start the audience generation job.
     * </p>
     * 
     * @param startAudienceGenerationJobRequest
     * @return Result of the StartAudienceGenerationJob operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota.
     * @sample AWSCleanRoomsML.StartAudienceGenerationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceGenerationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartAudienceGenerationJobResult startAudienceGenerationJob(StartAudienceGenerationJobRequest startAudienceGenerationJobRequest);

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Provides the information necessary to update a configured audience model. Updates that impact audience generation
     * jobs take effect when a new job starts, but do not impact currently running jobs.
     * </p>
     * 
     * @param updateConfiguredAudienceModelRequest
     * @return Result of the UpdateConfiguredAudienceModel operation returned by the service.
     * @throws ConflictException
     *         You can't complete this action because another resource depends on this resource.
     * @throws ValidationException
     *         The request parameters for this request are incorrect.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource you are requesting does not exist.
     * @sample AWSCleanRoomsML.UpdateConfiguredAudienceModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfiguredAudienceModelResult updateConfiguredAudienceModel(UpdateConfiguredAudienceModelRequest updateConfiguredAudienceModelRequest);

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
