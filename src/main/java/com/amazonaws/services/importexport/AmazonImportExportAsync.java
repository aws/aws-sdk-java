/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.importexport;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.importexport.model.*;

/**
 * Interface for accessing AmazonImportExport asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Import/Export Service <p>
 * AWS Import/Export accelerates transferring large amounts of data between the AWS cloud and portable storage devices that you mail to us. AWS
 * Import/Export transfers data directly onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For
 * large data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your connectivity.
 * </p>
 */
public interface AmazonImportExportAsync extends AmazonImportExport {
    /**
     * <p>
     * This operation initiates the process of scheduling an upload or
     * download of your data. You include in the request a manifest that
     * describes the data transfer specifics. The response to the request
     * includes a job ID, which you can use in other operations, a signature
     * that you use to identify your storage device, and the address where
     * you should ship your storage device.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonImportExport.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation initiates the process of scheduling an upload or
     * download of your data. You include in the request a manifest that
     * describes the data transfer specifics. The response to the request
     * includes a job ID, which you can use in other operations, a signature
     * that you use to identify your storage device, and the address where
     * you should ship your storage device.
     * </p>
     *
     * @param createJobRequest Container for the necessary parameters to
     *           execute the CreateJob operation on AmazonImportExport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation cancels a specified job. Only the job owner can cancel
     * it. The operation fails if the job has already started or is complete.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonImportExport.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation cancels a specified job. Only the job owner can cancel
     * it. The operation fails if the job has already started or is complete.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob operation on AmazonImportExport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about a job, including where the
     * job is in the processing pipeline, the status of the results, and the
     * signature value associated with the job. You can only return
     * information about jobs you own.
     * </p>
     *
     * @param getStatusRequest Container for the necessary parameters to
     *           execute the GetStatus operation on AmazonImportExport.
     * 
     * @return A Java Future object containing the response from the
     *         GetStatus service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStatusResult> getStatusAsync(GetStatusRequest getStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about a job, including where the
     * job is in the processing pipeline, the status of the results, and the
     * signature value associated with the job. You can only return
     * information about jobs you own.
     * </p>
     *
     * @param getStatusRequest Container for the necessary parameters to
     *           execute the GetStatus operation on AmazonImportExport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetStatus service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStatusResult> getStatusAsync(GetStatusRequest getStatusRequest,
            AsyncHandler<GetStatusRequest, GetStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     *
     * @param listJobsRequest Container for the necessary parameters to
     *           execute the ListJobs operation on AmazonImportExport.
     * 
     * @return A Java Future object containing the response from the ListJobs
     *         service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the jobs associated with the requester. AWS
     * Import/Export lists the jobs in reverse chronological order based on
     * the date of creation. For example if Job Test1 was created 2009Dec30
     * and Test2 was created 2010Feb05, the ListJobs operation would return
     * Test2 followed by Test1.
     * </p>
     *
     * @param listJobsRequest Container for the necessary parameters to
     *           execute the ListJobs operation on AmazonImportExport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListJobs
     *         service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You use this operation to change the parameters specified in the
     * original manifest file by supplying a new manifest file. The manifest
     * file attached to this request replaces the original manifest file. You
     * can only use the operation after a CreateJob request but before the
     * data transfer starts and you can only use it on jobs you own.
     * </p>
     *
     * @param updateJobRequest Container for the necessary parameters to
     *           execute the UpdateJob operation on AmazonImportExport.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You use this operation to change the parameters specified in the
     * original manifest file by supplying a new manifest file. The manifest
     * file attached to this request replaces the original manifest file. You
     * can only use the operation after a CreateJob request but before the
     * data transfer starts and you can only use it on jobs you own.
     * </p>
     *
     * @param updateJobRequest Container for the necessary parameters to
     *           execute the UpdateJob operation on AmazonImportExport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateJob service method, as returned by AmazonImportExport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        