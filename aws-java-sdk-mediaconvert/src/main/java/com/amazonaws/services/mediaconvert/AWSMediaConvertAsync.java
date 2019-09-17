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
package com.amazonaws.services.mediaconvert;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;

/**
 * Interface for accessing MediaConvert asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediaconvert.AbstractAWSMediaConvertAsync} instead.
 * </p>
 * <p>
 * AWS Elemental MediaConvert
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaConvertAsync extends AWSMediaConvert {

    /**
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @return A Java Future containing the result of the AssociateCertificate operation returned by the service.
     * @sample AWSMediaConvertAsync.AssociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AssociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCertificateResult> associateCertificateAsync(AssociateCertificateRequest associateCertificateRequest);

    /**
     * Associates an AWS Certificate Manager (ACM) Amazon Resource Name (ARN) with AWS Elemental MediaConvert.
     * 
     * @param associateCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateCertificate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.AssociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AssociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCertificateResult> associateCertificateAsync(AssociateCertificateRequest associateCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateCertificateRequest, AssociateCertificateResult> asyncHandler);

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start it again.
     * 
     * @param cancelJobRequest
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSMediaConvertAsync.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * Permanently cancel a job. Once you have canceled a job, you can't start it again.
     * 
     * @param cancelJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * Create a new transcoding job. For information about jobs and job settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSMediaConvertAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * Create a new transcoding job. For information about jobs and job settings, see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * Create a new job template. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @return A Java Future containing the result of the CreateJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsync.CreateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateJobTemplateResult> createJobTemplateAsync(CreateJobTemplateRequest createJobTemplateRequest);

    /**
     * Create a new job template. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createJobTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.CreateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateJobTemplateResult> createJobTemplateAsync(CreateJobTemplateRequest createJobTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobTemplateRequest, CreateJobTemplateResult> asyncHandler);

    /**
     * Create a new preset. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @return A Java Future containing the result of the CreatePreset operation returned by the service.
     * @sample AWSMediaConvertAsync.CreatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest);

    /**
     * Create a new preset. For information about job templates see the User Guide at
     * http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
     * 
     * @param createPresetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePreset operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.CreatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePresetResult> createPresetAsync(CreatePresetRequest createPresetRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresetRequest, CreatePresetResult> asyncHandler);

    /**
     * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AWSMediaConvertAsync.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest);

    /**
     * Create a new transcoding queue. For information about queues, see Working With Queues in the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html
     * 
     * @param createQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueue operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.CreateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CreateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest createQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler);

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @return A Java Future containing the result of the DeleteJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsync.DeleteJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTemplateResult> deleteJobTemplateAsync(DeleteJobTemplateRequest deleteJobTemplateRequest);

    /**
     * Permanently delete a job template you have created.
     * 
     * @param deleteJobTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.DeleteJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTemplateResult> deleteJobTemplateAsync(DeleteJobTemplateRequest deleteJobTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobTemplateRequest, DeleteJobTemplateResult> asyncHandler);

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @return A Java Future containing the result of the DeletePreset operation returned by the service.
     * @sample AWSMediaConvertAsync.DeletePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeletePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest);

    /**
     * Permanently delete a preset you have created.
     * 
     * @param deletePresetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePreset operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.DeletePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeletePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePresetResult> deletePresetAsync(DeletePresetRequest deletePresetRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePresetRequest, DeletePresetResult> asyncHandler);

    /**
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @return A Java Future containing the result of the DeleteQueue operation returned by the service.
     * @sample AWSMediaConvertAsync.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest);

    /**
     * Permanently delete a queue you have created.
     * 
     * @param deleteQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueue operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.DeleteQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DeleteQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest deleteQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler);

    /**
     * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
     * 
     * @param describeEndpointsRequest
     *        DescribeEndpointsRequest
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AWSMediaConvertAsync.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DescribeEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
     * 
     * @param describeEndpointsRequest
     *        DescribeEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DescribeEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
     * an AWS Elemental MediaConvert resource.
     * 
     * @param disassociateCertificateRequest
     * @return A Java Future containing the result of the DisassociateCertificate operation returned by the service.
     * @sample AWSMediaConvertAsync.DisassociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DisassociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCertificateResult> disassociateCertificateAsync(DisassociateCertificateRequest disassociateCertificateRequest);

    /**
     * Removes an association between the Amazon Resource Name (ARN) of an AWS Certificate Manager (ACM) certificate and
     * an AWS Elemental MediaConvert resource.
     * 
     * @param disassociateCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateCertificate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.DisassociateCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DisassociateCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCertificateResult> disassociateCertificateAsync(DisassociateCertificateRequest disassociateCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateCertificateRequest, DisassociateCertificateResult> asyncHandler);

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSMediaConvertAsync.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest);

    /**
     * Retrieve the JSON for a specific completed transcoding job.
     * 
     * @param getJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJob operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.GetJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest getJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler);

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @return A Java Future containing the result of the GetJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsync.GetJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetJobTemplateResult> getJobTemplateAsync(GetJobTemplateRequest getJobTemplateRequest);

    /**
     * Retrieve the JSON for a specific job template.
     * 
     * @param getJobTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.GetJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetJobTemplateResult> getJobTemplateAsync(GetJobTemplateRequest getJobTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobTemplateRequest, GetJobTemplateResult> asyncHandler);

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @return A Java Future containing the result of the GetPreset operation returned by the service.
     * @sample AWSMediaConvertAsync.GetPreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetPreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPresetResult> getPresetAsync(GetPresetRequest getPresetRequest);

    /**
     * Retrieve the JSON for a specific preset.
     * 
     * @param getPresetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPreset operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.GetPreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetPreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPresetResult> getPresetAsync(GetPresetRequest getPresetRequest,
            com.amazonaws.handlers.AsyncHandler<GetPresetRequest, GetPresetResult> asyncHandler);

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @return A Java Future containing the result of the GetQueue operation returned by the service.
     * @sample AWSMediaConvertAsync.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest getQueueRequest);

    /**
     * Retrieve the JSON for a specific queue.
     * 
     * @param getQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueue operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.GetQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/GetQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest getQueueRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueRequest, GetQueueResult> asyncHandler);

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
     * a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @return A Java Future containing the result of the ListJobTemplates operation returned by the service.
     * @sample AWSMediaConvertAsync.ListJobTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListJobTemplatesResult> listJobTemplatesAsync(ListJobTemplatesRequest listJobTemplatesRequest);

    /**
     * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just
     * a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
     * 
     * @param listJobTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobTemplates operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.ListJobTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListJobTemplatesResult> listJobTemplatesAsync(ListJobTemplatesRequest listJobTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobTemplatesRequest, ListJobTemplatesResult> asyncHandler);

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
     * completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the array.
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSMediaConvertAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process,
     * completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the
     * twenty next most recent jobs, use the nextToken string returned with the array.
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
     * of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @return A Java Future containing the result of the ListPresets operation returned by the service.
     * @sample AWSMediaConvertAsync.ListPresets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListPresets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest);

    /**
     * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list
     * of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
     * 
     * @param listPresetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPresets operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.ListPresets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListPresets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPresetsResult> listPresetsAsync(ListPresetsRequest listPresetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPresetsRequest, ListPresetsResult> asyncHandler);

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
     * them. To retrieve the next twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AWSMediaConvertAsync.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest);

    /**
     * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of
     * them. To retrieve the next twenty queues, use the nextToken string returned with the array.
     * 
     * @param listQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueues operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.ListQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListQueues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest listQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaConvertAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Retrieve the tags for a MediaConvert resource.
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaConvertAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
     * at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaConvertAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide
     * at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @return A Java Future containing the result of the UpdateJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsync.UpdateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobTemplateResult> updateJobTemplateAsync(UpdateJobTemplateRequest updateJobTemplateRequest);

    /**
     * Modify one of your existing job templates.
     * 
     * @param updateJobTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobTemplate operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.UpdateJobTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateJobTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobTemplateResult> updateJobTemplateAsync(UpdateJobTemplateRequest updateJobTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobTemplateRequest, UpdateJobTemplateResult> asyncHandler);

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @return A Java Future containing the result of the UpdatePreset operation returned by the service.
     * @sample AWSMediaConvertAsync.UpdatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePresetResult> updatePresetAsync(UpdatePresetRequest updatePresetRequest);

    /**
     * Modify one of your existing presets.
     * 
     * @param updatePresetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePreset operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.UpdatePreset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdatePreset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePresetResult> updatePresetAsync(UpdatePresetRequest updatePresetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePresetRequest, UpdatePresetResult> asyncHandler);

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @return A Java Future containing the result of the UpdateQueue operation returned by the service.
     * @sample AWSMediaConvertAsync.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest updateQueueRequest);

    /**
     * Modify one of your existing queues.
     * 
     * @param updateQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateQueue operation returned by the service.
     * @sample AWSMediaConvertAsyncHandler.UpdateQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/UpdateQueue" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest updateQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateQueueRequest, UpdateQueueResult> asyncHandler);

}
