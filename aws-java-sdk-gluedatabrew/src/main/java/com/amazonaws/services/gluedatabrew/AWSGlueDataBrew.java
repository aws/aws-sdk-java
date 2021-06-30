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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.gluedatabrew.model.*;

/**
 * Interface for accessing AWS Glue DataBrew.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gluedatabrew.AbstractAWSGlueDataBrew} instead.
 * </p>
 * <p>
 * <p>
 * Glue DataBrew is a visual, cloud-scale data-preparation service. DataBrew simplifies data preparation tasks,
 * targeting data issues that are hard to spot and time-consuming to fix. DataBrew empowers users of all technical
 * levels to visualize the data and perform one-click data transformations, with no coding required.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlueDataBrew {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "databrew";

    /**
     * <p>
     * Deletes one or more versions of a recipe at a time.
     * </p>
     * <p>
     * The entire request will be rejected if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The recipe does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is an invalid version identifier in the list of versions.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list is empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list size exceeds 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version list contains duplicate entries.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The request will complete successfully, but with partial failures, if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * A version is being used by a job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify <code>LATEST_WORKING</code>, but it's being used by a project.
     * </p>
     * </li>
     * <li>
     * <p>
     * The version fails to be deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>LATEST_WORKING</code> version will only be deleted if the recipe has no other versions. If you try to
     * delete <code>LATEST_WORKING</code> while other versions exist (or if they can't be deleted), then
     * <code>LATEST_WORKING</code> will be listed as partial failure in the response.
     * </p>
     * 
     * @param batchDeleteRecipeVersionRequest
     * @return Result of the BatchDeleteRecipeVersion operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.BatchDeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteRecipeVersionResult batchDeleteRecipeVersion(BatchDeleteRecipeVersionRequest batchDeleteRecipeVersionRequest);

    /**
     * <p>
     * Creates a new DataBrew dataset.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new job to analyze a dataset and create its data profile.
     * </p>
     * 
     * @param createProfileJobRequest
     * @return Result of the CreateProfileJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProfileJobResult createProfileJob(CreateProfileJobRequest createProfileJobRequest);

    /**
     * <p>
     * Creates a new DataBrew project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates a new DataBrew recipe.
     * </p>
     * 
     * @param createRecipeRequest
     * @return Result of the CreateRecipe operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRecipeResult createRecipe(CreateRecipeRequest createRecipeRequest);

    /**
     * <p>
     * Creates a new job to transform input data, using steps defined in an existing Glue DataBrew recipe
     * </p>
     * 
     * @param createRecipeJobRequest
     * @return Result of the CreateRecipeJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRecipeJobResult createRecipeJob(CreateRecipeJobRequest createRecipeJobRequest);

    /**
     * <p>
     * Creates a new schedule for one or more DataBrew jobs. Jobs can be run at a specific date and time, or at regular
     * intervals.
     * </p>
     * 
     * @param createScheduleRequest
     * @return Result of the CreateSchedule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.CreateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateScheduleResult createSchedule(CreateScheduleRequest createScheduleRequest);

    /**
     * <p>
     * Deletes a dataset from DataBrew.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes the specified DataBrew job.
     * </p>
     * 
     * @param deleteJobRequest
     * @return Result of the DeleteJob operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteJob" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteJobResult deleteJob(DeleteJobRequest deleteJobRequest);

    /**
     * <p>
     * Deletes an existing DataBrew project.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return Result of the DeleteProject operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a single version of a DataBrew recipe.
     * </p>
     * 
     * @param deleteRecipeVersionRequest
     * @return Result of the DeleteRecipeVersion operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteRecipeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteRecipeVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRecipeVersionResult deleteRecipeVersion(DeleteRecipeVersionRequest deleteRecipeVersionRequest);

    /**
     * <p>
     * Deletes the specified DataBrew schedule.
     * </p>
     * 
     * @param deleteScheduleRequest
     * @return Result of the DeleteSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DeleteSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScheduleResult deleteSchedule(DeleteScheduleRequest deleteScheduleRequest);

    /**
     * <p>
     * Returns the definition of a specific DataBrew dataset.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Returns the definition of a specific DataBrew job.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Represents one run of a DataBrew job.
     * </p>
     * 
     * @param describeJobRunRequest
     * @return Result of the DescribeJobRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobRunResult describeJobRun(DescribeJobRunRequest describeJobRunRequest);

    /**
     * <p>
     * Returns the definition of a specific DataBrew project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Returns the definition of a specific DataBrew recipe corresponding to a particular version.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return Result of the DescribeRecipe operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRecipeResult describeRecipe(DescribeRecipeRequest describeRecipeRequest);

    /**
     * <p>
     * Returns the definition of a specific DataBrew schedule.
     * </p>
     * 
     * @param describeScheduleRequest
     * @return Result of the DescribeSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.DescribeSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeScheduleResult describeSchedule(DescribeScheduleRequest describeScheduleRequest);

    /**
     * <p>
     * Lists all of the DataBrew datasets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all of the previous runs of a particular DataBrew job.
     * </p>
     * 
     * @param listJobRunsRequest
     * @return Result of the ListJobRuns operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListJobRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobRuns" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobRunsResult listJobRuns(ListJobRunsRequest listJobRunsRequest);

    /**
     * <p>
     * Lists all of the DataBrew jobs that are defined.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists all of the DataBrew projects that are defined.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists the versions of a particular DataBrew recipe, except for <code>LATEST_WORKING</code>.
     * </p>
     * 
     * @param listRecipeVersionsRequest
     * @return Result of the ListRecipeVersions operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListRecipeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListRecipeVersionsResult listRecipeVersions(ListRecipeVersionsRequest listRecipeVersionsRequest);

    /**
     * <p>
     * Lists all of the DataBrew recipes that are defined.
     * </p>
     * 
     * @param listRecipesRequest
     * @return Result of the ListRecipes operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    ListRecipesResult listRecipes(ListRecipesRequest listRecipesRequest);

    /**
     * <p>
     * Lists the DataBrew schedules that are defined.
     * </p>
     * 
     * @param listSchedulesRequest
     * @return Result of the ListSchedules operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListSchedules" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchedulesResult listSchedules(ListSchedulesRequest listSchedulesRequest);

    /**
     * <p>
     * Lists all the tags for a DataBrew resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Publishes a new version of a DataBrew recipe.
     * </p>
     * 
     * @param publishRecipeRequest
     * @return Result of the PublishRecipe operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @sample AWSGlueDataBrew.PublishRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/PublishRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    PublishRecipeResult publishRecipe(PublishRecipeRequest publishRecipeRequest);

    /**
     * <p>
     * Performs a recipe step within an interactive DataBrew session that's currently open.
     * </p>
     * 
     * @param sendProjectSessionActionRequest
     * @return Result of the SendProjectSessionAction operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.SendProjectSessionAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction"
     *      target="_top">AWS API Documentation</a>
     */
    SendProjectSessionActionResult sendProjectSessionAction(SendProjectSessionActionRequest sendProjectSessionActionRequest);

    /**
     * <p>
     * Runs a DataBrew job.
     * </p>
     * 
     * @param startJobRunRequest
     * @return Result of the StartJobRun operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StartJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    StartJobRunResult startJobRun(StartJobRunRequest startJobRunRequest);

    /**
     * <p>
     * Creates an interactive session, enabling you to manipulate data in a DataBrew project.
     * </p>
     * 
     * @param startProjectSessionRequest
     * @return Result of the StartProjectSession operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StartProjectSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StartProjectSession" target="_top">AWS
     *      API Documentation</a>
     */
    StartProjectSessionResult startProjectSession(StartProjectSessionRequest startProjectSessionRequest);

    /**
     * <p>
     * Stops a particular run of a job.
     * </p>
     * 
     * @param stopJobRunRequest
     * @return Result of the StopJobRun operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.StopJobRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StopJobRun" target="_top">AWS API
     *      Documentation</a>
     */
    StopJobRunResult stopJobRun(StopJobRunRequest stopJobRunRequest);

    /**
     * <p>
     * Adds metadata tags to a DataBrew resource, such as a dataset, project, recipe, job, or schedule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a DataBrew resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal service failure occurred.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the definition of an existing DataBrew dataset.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDatasetResult updateDataset(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Modifies the definition of an existing profile job.
     * </p>
     * 
     * @param updateProfileJobRequest
     * @return Result of the UpdateProfileJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateProfileJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProfileJob" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProfileJobResult updateProfileJob(UpdateProfileJobRequest updateProfileJobRequest);

    /**
     * <p>
     * Modifies the definition of an existing DataBrew project.
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Modifies the definition of the <code>LATEST_WORKING</code> version of a DataBrew recipe.
     * </p>
     * 
     * @param updateRecipeRequest
     * @return Result of the UpdateRecipe operation returned by the service.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @sample AWSGlueDataBrew.UpdateRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRecipeResult updateRecipe(UpdateRecipeRequest updateRecipeRequest);

    /**
     * <p>
     * Modifies the definition of an existing DataBrew recipe job.
     * </p>
     * 
     * @param updateRecipeJobRequest
     * @return Result of the UpdateRecipeJob operation returned by the service.
     * @throws AccessDeniedException
     *         Access to the specified resource was denied.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateRecipeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipeJob" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRecipeJobResult updateRecipeJob(UpdateRecipeJobRequest updateRecipeJobRequest);

    /**
     * <p>
     * Modifies the definition of an existing DataBrew schedule.
     * </p>
     * 
     * @param updateScheduleRequest
     * @return Result of the UpdateSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         One or more resources can't be found.
     * @throws ServiceQuotaExceededException
     *         A service quota is exceeded.
     * @throws ValidationException
     *         The input parameters for this request failed validation.
     * @sample AWSGlueDataBrew.UpdateSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateSchedule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateScheduleResult updateSchedule(UpdateScheduleRequest updateScheduleRequest);

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
