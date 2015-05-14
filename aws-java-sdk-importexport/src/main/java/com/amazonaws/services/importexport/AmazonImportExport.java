/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.importexport.model.*;

/**
 * Interface for accessing AmazonImportExport.
 * AWS Import/Export Service <p>
 * AWS Import/Export accelerates transferring large amounts of data
 * between the AWS cloud and portable storage devices that you mail to
 * us. AWS Import/Export transfers data directly onto and off of your
 * storage devices using Amazon's high-speed internal network and
 * bypassing the Internet. For large data sets, AWS Import/Export is
 * often faster than Internet transfer and more cost effective than
 * upgrading your connectivity.
 * </p>
 */
public interface AmazonImportExport {

    /**
     * Overrides the default endpoint for this client ("https://importexport.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "importexport.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://importexport.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "importexport.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://importexport.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonImportExport#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
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
     *           execute the CreateJob service method on AmazonImportExport.
     * 
     * @return The response from the CreateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws InvalidAddressException
     * @throws BucketPermissionException
     * @throws InvalidParameterException
     * @throws MultipleRegionsException
     * @throws InvalidVersionException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidManifestFieldException
     * @throws InvalidCustomsException
     * @throws MissingManifestFieldException
     * @throws CreateJobQuotaExceededException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateJobResult createJob(CreateJobRequest createJobRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation generates a pre-paid UPS shipping label that you will
     * use to ship your device to AWS for processing.
     * </p>
     *
     * @param getShippingLabelRequest Container for the necessary parameters
     *           to execute the GetShippingLabel service method on AmazonImportExport.
     * 
     * @return The response from the GetShippingLabel service method, as
     *         returned by AmazonImportExport.
     * 
     * @throws InvalidVersionException
     * @throws InvalidAddressException
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetShippingLabelResult getShippingLabel(GetShippingLabelRequest getShippingLabelRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation cancels a specified job. Only the job owner can cancel
     * it. The operation fails if the job has already started or is complete.
     * </p>
     *
     * @param cancelJobRequest Container for the necessary parameters to
     *           execute the CancelJob service method on AmazonImportExport.
     * 
     * @return The response from the CancelJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidVersionException
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     * @throws UnableToCancelJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelJobResult cancelJob(CancelJobRequest cancelJobRequest) 
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
     *           execute the GetStatus service method on AmazonImportExport.
     * 
     * @return The response from the GetStatus service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidVersionException
     * @throws CanceledJobIdException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStatusResult getStatus(GetStatusRequest getStatusRequest) 
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
     *           execute the ListJobs service method on AmazonImportExport.
     * 
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidVersionException
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs(ListJobsRequest listJobsRequest) 
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
     *           execute the UpdateJob service method on AmazonImportExport.
     * 
     * @return The response from the UpdateJob service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws MalformedManifestException
     * @throws BucketPermissionException
     * @throws InvalidAddressException
     * @throws InvalidParameterException
     * @throws UnableToUpdateJobIdException
     * @throws MultipleRegionsException
     * @throws InvalidVersionException
     * @throws MissingParameterException
     * @throws InvalidFileSystemException
     * @throws CanceledJobIdException
     * @throws MissingCustomsException
     * @throws NoSuchBucketException
     * @throws ExpiredJobIdException
     * @throws InvalidAccessKeyIdException
     * @throws InvalidCustomsException
     * @throws InvalidManifestFieldException
     * @throws MissingManifestFieldException
     * @throws InvalidJobIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateJobResult updateJob(UpdateJobRequest updateJobRequest) 
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
     * @return The response from the ListJobs service method, as returned by
     *         AmazonImportExport.
     * 
     * @throws InvalidVersionException
     * @throws InvalidParameterException
     * @throws InvalidAccessKeyIdException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonImportExport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListJobsResult listJobs() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        