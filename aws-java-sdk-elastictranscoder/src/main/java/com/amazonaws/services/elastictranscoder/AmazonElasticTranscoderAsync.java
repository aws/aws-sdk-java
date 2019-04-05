/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;

/**
 * Interface for accessing Amazon Elastic Transcoder asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elastictranscoder.AbstractAmazonElasticTranscoderAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Elastic Transcoder Service</fullname>
 * <p>
 * The AWS Elastic Transcoder Service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticTranscoderAsync extends AmazonElasticTranscoder {

    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <note>
     * <p>
     * You can only cancel a job that has a status of <code>Submitted</code>. To prevent a pipeline from starting to
     * process a job while you're getting the job identifier, use <a>UpdatePipelineStatus</a> to temporarily pause the
     * pipeline.
     * </p>
     * </note>
     * 
     * @param cancelJobRequest
     *        The <code>CancelJobRequest</code> structure.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * The CancelJob operation cancels an unfinished job.
     * </p>
     * <note>
     * <p>
     * You can only cancel a job that has a status of <code>Submitted</code>. To prevent a pipeline from starting to
     * process a job while you're getting the job identifier, use <a>UpdatePipelineStatus</a> to temporarily pause the
     * pipeline.
     * </p>
     * </note>
     * 
     * @param cancelJobRequest
     *        The <code>CancelJobRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
     * information about the job that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
     * output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
     * to the AWS Console).
     * </p>
     * 
     * @param createJobRequest
     *        The <code>CreateJobRequest</code> structure.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * When you create a job, Elastic Transcoder returns JSON data that includes the values that you specified plus
     * information about the job that is created.
     * </p>
     * <p>
     * If you have specified more than one output for your jobs (for example, one output for the Kindle Fire and another
     * output for the Apple iPhone 4s), you currently must use the Elastic Transcoder API to list the jobs (as opposed
     * to the AWS Console).
     * </p>
     * 
     * @param createJobRequest
     *        The <code>CreateJobRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you specify.
     * </p>
     * 
     * @param createPipelineRequest
     *        The <code>CreatePipelineRequest</code> structure.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.CreatePipeline
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * The CreatePipeline operation creates a pipeline with settings that you specify.
     * </p>
     * 
     * @param createPipelineRequest
     *        The <code>CreatePipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.CreatePipeline
     */
    java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest createPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler);

    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you specify.
     * </p>
     * <important>
     * <p>
     * Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder,
     * Elastic Transcoder returns an HTTP 400 response (<code>ValidationException</code>) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard,
     * Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine
     * whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * </important>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more information, see the International
     * Telecommunication Union publication <i>Recommendation ITU-T H.264: Advanced video coding for generic audiovisual
     * services</i>.
     * </p>
     * 
     * @param createPresetRequest
     *        The <code>CreatePresetRequest</code> structure.
     * @return A Java Future containing the result of the CreatePreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.CreatePreset
     */
    java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest);

    /**
     * <p>
     * The CreatePreset operation creates a preset with settings that you specify.
     * </p>
     * <important>
     * <p>
     * Elastic Transcoder checks the CreatePreset settings to ensure that they meet Elastic Transcoder requirements and
     * to determine whether they comply with H.264 standards. If your settings are not valid for Elastic Transcoder,
     * Elastic Transcoder returns an HTTP 400 response (<code>ValidationException</code>) and does not create the
     * preset. If the settings are valid for Elastic Transcoder but aren't strictly compliant with the H.264 standard,
     * Elastic Transcoder creates the preset and returns a warning message in the response. This helps you determine
     * whether your settings comply with the H.264 standard while giving you greater flexibility with respect to the
     * video that Elastic Transcoder produces.
     * </p>
     * </important>
     * <p>
     * Elastic Transcoder uses the H.264 video-compression format. For more information, see the International
     * Telecommunication Union publication <i>Recommendation ITU-T H.264: Advanced video coding for generic audiovisual
     * services</i>.
     * </p>
     * 
     * @param createPresetRequest
     *        The <code>CreatePresetRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.CreatePreset
     */
    java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler);

    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
     * active jobs). If the pipeline is currently in use, <code>DeletePipeline</code> returns an error.
     * </p>
     * 
     * @param deletePipelineRequest
     *        The <code>DeletePipelineRequest</code> structure.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.DeletePipeline
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * The DeletePipeline operation removes a pipeline.
     * </p>
     * <p>
     * You can only delete a pipeline that has never been used or that is not currently in use (doesn't contain any
     * active jobs). If the pipeline is currently in use, <code>DeletePipeline</code> returns an error.
     * </p>
     * 
     * @param deletePipelineRequest
     *        The <code>DeletePipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.DeletePipeline
     */
    java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest deletePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler);

    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an AWS region.
     * </p>
     * <note>
     * <p>
     * You can't delete the default presets that are included with Elastic Transcoder.
     * </p>
     * </note>
     * 
     * @param deletePresetRequest
     *        The <code>DeletePresetRequest</code> structure.
     * @return A Java Future containing the result of the DeletePreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.DeletePreset
     */
    java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest);

    /**
     * <p>
     * The DeletePreset operation removes a preset that you've added in an AWS region.
     * </p>
     * <note>
     * <p>
     * You can't delete the default presets that are included with Elastic Transcoder.
     * </p>
     * </note>
     * 
     * @param deletePresetRequest
     *        The <code>DeletePresetRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.DeletePreset
     */
    java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler);

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByPipelineRequest
     *        The <code>ListJobsByPipelineRequest</code> structure.
     * @return A Java Future containing the result of the ListJobsByPipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ListJobsByPipeline
     */
    java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest listJobsByPipelineRequest);

    /**
     * <p>
     * The ListJobsByPipeline operation gets a list of the jobs currently in a pipeline.
     * </p>
     * <p>
     * Elastic Transcoder returns all of the jobs currently in the specified pipeline. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByPipelineRequest
     *        The <code>ListJobsByPipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobsByPipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ListJobsByPipeline
     */
    java.util.concurrent.Future<ListJobsByPipelineResult> listJobsByPipelineAsync(ListJobsByPipelineRequest listJobsByPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsByPipelineRequest, ListJobsByPipelineResult> asyncHandler);

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByStatusRequest
     *        The <code>ListJobsByStatusRequest</code> structure.
     * @return A Java Future containing the result of the ListJobsByStatus operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ListJobsByStatus
     */
    java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest listJobsByStatusRequest);

    /**
     * <p>
     * The ListJobsByStatus operation gets a list of jobs that have a specified status. The response body contains one
     * element for each job that satisfies the search criteria.
     * </p>
     * 
     * @param listJobsByStatusRequest
     *        The <code>ListJobsByStatusRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobsByStatus operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ListJobsByStatus
     */
    java.util.concurrent.Future<ListJobsByStatusResult> listJobsByStatusAsync(ListJobsByStatusRequest listJobsByStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsByStatusRequest, ListJobsByStatusResult> asyncHandler);

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        The <code>ListPipelineRequest</code> structure.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ListPipelines
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * The ListPipelines operation gets a list of the pipelines associated with the current AWS account.
     * </p>
     * 
     * @param listPipelinesRequest
     *        The <code>ListPipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPipelines operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ListPipelines
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest listPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPipelines operation.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest)
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync();

    /**
     * Simplified method form for invoking the ListPipelines operation with an AsyncHandler.
     *
     * @see #listPipelinesAsync(ListPipelinesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler);

    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
     * that you've added in an AWS region.
     * </p>
     * 
     * @param listPresetsRequest
     *        The <code>ListPresetsRequest</code> structure.
     * @return A Java Future containing the result of the ListPresets operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ListPresets
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest);

    /**
     * <p>
     * The ListPresets operation gets a list of the default presets included with Elastic Transcoder and the presets
     * that you've added in an AWS region.
     * </p>
     * 
     * @param listPresetsRequest
     *        The <code>ListPresetsRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPresets operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ListPresets
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPresets operation.
     *
     * @see #listPresetsAsync(ListPresetsRequest)
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync();

    /**
     * Simplified method form for invoking the ListPresets operation with an AsyncHandler.
     *
     * @see #listPresetsAsync(ListPresetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler);

    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     * 
     * @param readJobRequest
     *        The <code>ReadJobRequest</code> structure.
     * @return A Java Future containing the result of the ReadJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ReadJob
     */
    java.util.concurrent.Future<ReadJobResult> readJobAsync(ReadJobRequest readJobRequest);

    /**
     * <p>
     * The ReadJob operation returns detailed information about a job.
     * </p>
     * 
     * @param readJobRequest
     *        The <code>ReadJobRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReadJob operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ReadJob
     */
    java.util.concurrent.Future<ReadJobResult> readJobAsync(ReadJobRequest readJobRequest,
            com.amazonaws.handlers.AsyncHandler<ReadJobRequest, ReadJobResult> asyncHandler);

    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     * 
     * @param readPipelineRequest
     *        The <code>ReadPipelineRequest</code> structure.
     * @return A Java Future containing the result of the ReadPipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ReadPipeline
     */
    java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest readPipelineRequest);

    /**
     * <p>
     * The ReadPipeline operation gets detailed information about a pipeline.
     * </p>
     * 
     * @param readPipelineRequest
     *        The <code>ReadPipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReadPipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ReadPipeline
     */
    java.util.concurrent.Future<ReadPipelineResult> readPipelineAsync(ReadPipelineRequest readPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<ReadPipelineRequest, ReadPipelineResult> asyncHandler);

    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     * 
     * @param readPresetRequest
     *        The <code>ReadPresetRequest</code> structure.
     * @return A Java Future containing the result of the ReadPreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.ReadPreset
     */
    java.util.concurrent.Future<ReadPresetResult> readPresetAsync(ReadPresetRequest readPresetRequest);

    /**
     * <p>
     * The ReadPreset operation gets detailed information about a preset.
     * </p>
     * 
     * @param readPresetRequest
     *        The <code>ReadPresetRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReadPreset operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.ReadPreset
     */
    java.util.concurrent.Future<ReadPresetResult> readPresetAsync(ReadPresetRequest readPresetRequest,
            com.amazonaws.handlers.AsyncHandler<ReadPresetRequest, ReadPresetResult> asyncHandler);

    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM role you are using has sufficient permissions
     * to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume
     * the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     * 
     * @param testRoleRequest
     *        The <code>TestRoleRequest</code> structure.
     * @return A Java Future containing the result of the TestRole operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.TestRole
     */
    @Deprecated
    java.util.concurrent.Future<TestRoleResult> testRoleAsync(TestRoleRequest testRoleRequest);

    /**
     * <p>
     * The TestRole operation tests the IAM role used to create the pipeline.
     * </p>
     * <p>
     * The <code>TestRole</code> action lets you determine whether the IAM role you are using has sufficient permissions
     * to let Elastic Transcoder perform tasks associated with the transcoding process. The action attempts to assume
     * the specified IAM role, checks read access to the input and output buckets, and tries to send a test notification
     * to Amazon SNS topics that you specify.
     * </p>
     * 
     * @param testRoleRequest
     *        The <code>TestRoleRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestRole operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.TestRole
     */
    @Deprecated
    java.util.concurrent.Future<TestRoleResult> testRoleAsync(TestRoleRequest testRoleRequest,
            com.amazonaws.handlers.AsyncHandler<TestRoleRequest, TestRoleResult> asyncHandler);

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for a pipeline.
     * </p>
     * <important>
     * <p>
     * When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
     * that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
     * change settings.
     * </p>
     * </important>
     * 
     * @param updatePipelineRequest
     *        The <code>UpdatePipelineRequest</code> structure.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.UpdatePipeline
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest);

    /**
     * <p>
     * Use the <code>UpdatePipeline</code> operation to update settings for a pipeline.
     * </p>
     * <important>
     * <p>
     * When you change pipeline settings, your changes take effect immediately. Jobs that you have already submitted and
     * that Elastic Transcoder has not started to process are affected in addition to jobs that you submit after you
     * change settings.
     * </p>
     * </important>
     * 
     * @param updatePipelineRequest
     *        The <code>UpdatePipelineRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipeline operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.UpdatePipeline
     */
    java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest updatePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler);

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
     * request.
     * </p>
     * 
     * @param updatePipelineNotificationsRequest
     *        The <code>UpdatePipelineNotificationsRequest</code> structure.
     * @return A Java Future containing the result of the UpdatePipelineNotifications operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.UpdatePipelineNotifications
     */
    java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(
            UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest);

    /**
     * <p>
     * With the UpdatePipelineNotifications operation, you can update Amazon Simple Notification Service (Amazon SNS)
     * notifications for a pipeline.
     * </p>
     * <p>
     * When you update notifications for a pipeline, Elastic Transcoder returns the values that you specified in the
     * request.
     * </p>
     * 
     * @param updatePipelineNotificationsRequest
     *        The <code>UpdatePipelineNotificationsRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipelineNotifications operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.UpdatePipelineNotifications
     */
    java.util.concurrent.Future<UpdatePipelineNotificationsResult> updatePipelineNotificationsAsync(
            UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineNotificationsRequest, UpdatePipelineNotificationsResult> asyncHandler);

    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
     * processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
     * Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
     * have more time to get the job IDs for the jobs that you want to cancel, and to send a <a>CancelJob</a> request.
     * </p>
     * 
     * @param updatePipelineStatusRequest
     *        The <code>UpdatePipelineStatusRequest</code> structure.
     * @return A Java Future containing the result of the UpdatePipelineStatus operation returned by the service.
     * @sample AmazonElasticTranscoderAsync.UpdatePipelineStatus
     */
    java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest updatePipelineStatusRequest);

    /**
     * <p>
     * The UpdatePipelineStatus operation pauses or reactivates a pipeline, so that the pipeline stops or restarts the
     * processing of jobs.
     * </p>
     * <p>
     * Changing the pipeline status is useful if you want to cancel one or more jobs. You can't cancel jobs after
     * Elastic Transcoder has started processing them; if you pause the pipeline to which you submitted the jobs, you
     * have more time to get the job IDs for the jobs that you want to cancel, and to send a <a>CancelJob</a> request.
     * </p>
     * 
     * @param updatePipelineStatusRequest
     *        The <code>UpdatePipelineStatusRequest</code> structure.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePipelineStatus operation returned by the service.
     * @sample AmazonElasticTranscoderAsyncHandler.UpdatePipelineStatus
     */
    java.util.concurrent.Future<UpdatePipelineStatusResult> updatePipelineStatusAsync(UpdatePipelineStatusRequest updatePipelineStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePipelineStatusRequest, UpdatePipelineStatusResult> asyncHandler);

}
