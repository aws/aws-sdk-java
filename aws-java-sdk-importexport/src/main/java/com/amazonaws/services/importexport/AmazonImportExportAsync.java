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
package com.amazonaws.services.importexport;

import javax.annotation.Generated;

import com.amazonaws.services.importexport.model.*;

/**
 * Interface for accessing AWS Import/Export asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.importexport.AbstractAmazonImportExportAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Import/Export Service</fullname> AWS Import/Export accelerates transferring large amounts of data
 * between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
 * onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
 * data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
 * connectivity.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonImportExportAsync extends AmazonImportExport {

    /**
     * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
     * already started or is complete.
     * 
     * @param cancelJobRequest
     *        Input structure for the CancelJob operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonImportExportAsync.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
     * already started or is complete.
     * 
     * @param cancelJobRequest
     *        Input structure for the CancelJob operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * This operation initiates the process of scheduling an upload or download of your data. You include in the request
     * a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
     * can use in other operations, a signature that you use to identify your storage device, and the address where you
     * should ship your storage device.
     * 
     * @param createJobRequest
     *        Input structure for the CreateJob operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonImportExportAsync.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * This operation initiates the process of scheduling an upload or download of your data. You include in the request
     * a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
     * can use in other operations, a signature that you use to identify your storage device, and the address where you
     * should ship your storage device.
     * 
     * @param createJobRequest
     *        Input structure for the CreateJob operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
     * processing.
     * 
     * @param getShippingLabelRequest
     * @return A Java Future containing the result of the GetShippingLabel operation returned by the service.
     * @sample AmazonImportExportAsync.GetShippingLabel
     */
    java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(GetShippingLabelRequest getShippingLabelRequest);

    /**
     * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
     * processing.
     * 
     * @param getShippingLabelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetShippingLabel operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.GetShippingLabel
     */
    java.util.concurrent.Future<GetShippingLabelResult> getShippingLabelAsync(GetShippingLabelRequest getShippingLabelRequest,
            com.amazonaws.handlers.AsyncHandler<GetShippingLabelRequest, GetShippingLabelResult> asyncHandler);

    /**
     * This operation returns information about a job, including where the job is in the processing pipeline, the status
     * of the results, and the signature value associated with the job. You can only return information about jobs you
     * own.
     * 
     * @param getStatusRequest
     *        Input structure for the GetStatus operation.
     * @return A Java Future containing the result of the GetStatus operation returned by the service.
     * @sample AmazonImportExportAsync.GetStatus
     */
    java.util.concurrent.Future<GetStatusResult> getStatusAsync(GetStatusRequest getStatusRequest);

    /**
     * This operation returns information about a job, including where the job is in the processing pipeline, the status
     * of the results, and the signature value associated with the job. You can only return information about jobs you
     * own.
     * 
     * @param getStatusRequest
     *        Input structure for the GetStatus operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStatus operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.GetStatus
     */
    java.util.concurrent.Future<GetStatusResult> getStatusAsync(GetStatusRequest getStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetStatusRequest, GetStatusResult> asyncHandler);

    /**
     * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
     * chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
     * created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
     * 
     * @param listJobsRequest
     *        Input structure for the ListJobs operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonImportExportAsync.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
     * chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
     * created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
     * 
     * @param listJobsRequest
     *        Input structure for the ListJobs operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListJobs operation.
     *
     * @see #listJobsAsync(ListJobsRequest)
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync();

    /**
     * Simplified method form for invoking the ListJobs operation with an AsyncHandler.
     *
     * @see #listJobsAsync(ListJobsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * You use this operation to change the parameters specified in the original manifest file by supplying a new
     * manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
     * the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
     * own.
     * 
     * @param updateJobRequest
     *        Input structure for the UpateJob operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AmazonImportExportAsync.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest);

    /**
     * You use this operation to change the parameters specified in the original manifest file by supplying a new
     * manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
     * the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
     * own.
     * 
     * @param updateJobRequest
     *        Input structure for the UpateJob operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AmazonImportExportAsyncHandler.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler);

}
