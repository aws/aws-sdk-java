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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.importexport.model.*;

/**
 * Interface for accessing AWS Import/Export.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.importexport.AbstractAmazonImportExport} instead.
 * </p>
 * <p>
 * <fullname>AWS Import/Export Service</fullname> AWS Import/Export accelerates transferring large amounts of data
 * between the AWS cloud and portable storage devices that you mail to us. AWS Import/Export transfers data directly
 * onto and off of your storage devices using Amazon's high-speed internal network and bypassing the Internet. For large
 * data sets, AWS Import/Export is often faster than Internet transfer and more cost effective than upgrading your
 * connectivity.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonImportExport {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "importexport";

    /**
     * Overrides the default endpoint for this client ("https://importexport.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "importexport.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://importexport.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "importexport.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://importexport.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonImportExport#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has
     * already started or is complete.
     * 
     * @param cancelJobRequest
     *        Input structure for the CancelJob operation.
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws UnableToCancelJobIdException
     *         AWS Import/Export cannot cancel the job
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @sample AmazonImportExport.CancelJob
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * This operation initiates the process of scheduling an upload or download of your data. You include in the request
     * a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you
     * can use in other operations, a signature that you use to identify your storage device, and the address where you
     * should ship your storage device.
     * 
     * @param createJobRequest
     *        Input structure for the CreateJob operation.
     * @return Result of the CreateJob operation returned by the service.
     * @throws MissingParameterException
     *         One or more required parameters was missing from the request.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidManifestFieldException
     *         One or more manifest fields was invalid. Please correct and resubmit.
     * @throws MissingManifestFieldException
     *         One or more required fields were missing from the manifest file. Please correct and resubmit.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist. Create the specified bucket or change the manifest's bucket,
     *         exportBucket, or logBucket field to a bucket that the account, as specified by the manifest's Access Key
     *         ID, has write permissions to.
     * @throws MissingCustomsException
     *         One or more required customs parameters was missing from the manifest.
     * @throws InvalidCustomsException
     *         One or more customs parameters was invalid. Please correct and resubmit.
     * @throws InvalidFileSystemException
     *         File system specified in export manifest is invalid.
     * @throws MultipleRegionsException
     *         Your manifest file contained buckets from multiple regions. A job is restricted to buckets from one
     *         region. Please correct and resubmit.
     * @throws BucketPermissionException
     *         The account specified does not have the appropriate bucket permissions.
     * @throws MalformedManifestException
     *         Your manifest is not well-formed.
     * @throws CreateJobQuotaExceededException
     *         Each account can create only a certain number of jobs per day. If you need to create more than this,
     *         please contact awsimportexport@amazon.com to explain your particular use case.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS account.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @sample AmazonImportExport.CreateJob
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for
     * processing.
     * 
     * @param getShippingLabelRequest
     * @return Result of the GetShippingLabel operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @sample AmazonImportExport.GetShippingLabel
     */
    GetShippingLabelResult getShippingLabel(GetShippingLabelRequest getShippingLabelRequest);

    /**
     * This operation returns information about a job, including where the job is in the processing pipeline, the status
     * of the results, and the signature value associated with the job. You can only return information about jobs you
     * own.
     * 
     * @param getStatusRequest
     *        Input structure for the GetStatus operation.
     * @return Result of the GetStatus operation returned by the service.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS account.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @sample AmazonImportExport.GetStatus
     */
    GetStatusResult getStatus(GetStatusRequest getStatusRequest);

    /**
     * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse
     * chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was
     * created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
     * 
     * @param listJobsRequest
     *        Input structure for the ListJobs operation.
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @sample AmazonImportExport.ListJobs
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * Simplified method form for invoking the ListJobs operation.
     *
     * @see #listJobs(ListJobsRequest)
     */
    ListJobsResult listJobs();

    /**
     * You use this operation to change the parameters specified in the original manifest file by supplying a new
     * manifest file. The manifest file attached to this request replaces the original manifest file. You can only use
     * the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you
     * own.
     * 
     * @param updateJobRequest
     *        Input structure for the UpateJob operation.
     * @return Result of the UpdateJob operation returned by the service.
     * @throws MissingParameterException
     *         One or more required parameters was missing from the request.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws InvalidAccessKeyIdException
     *         The AWS Access Key ID specified in the request did not match the manifest's accessKeyId value. The
     *         manifest and the request authentication must use the same AWS Access Key ID.
     * @throws InvalidAddressException
     *         The address specified in the manifest is invalid.
     * @throws InvalidManifestFieldException
     *         One or more manifest fields was invalid. Please correct and resubmit.
     * @throws InvalidJobIdException
     *         The JOBID was missing, not found, or not associated with the AWS account.
     * @throws MissingManifestFieldException
     *         One or more required fields were missing from the manifest file. Please correct and resubmit.
     * @throws NoSuchBucketException
     *         The specified bucket does not exist. Create the specified bucket or change the manifest's bucket,
     *         exportBucket, or logBucket field to a bucket that the account, as specified by the manifest's Access Key
     *         ID, has write permissions to.
     * @throws ExpiredJobIdException
     *         Indicates that the specified job has expired out of the system.
     * @throws CanceledJobIdException
     *         The specified job ID has been canceled and is no longer valid.
     * @throws MissingCustomsException
     *         One or more required customs parameters was missing from the manifest.
     * @throws InvalidCustomsException
     *         One or more customs parameters was invalid. Please correct and resubmit.
     * @throws InvalidFileSystemException
     *         File system specified in export manifest is invalid.
     * @throws MultipleRegionsException
     *         Your manifest file contained buckets from multiple regions. A job is restricted to buckets from one
     *         region. Please correct and resubmit.
     * @throws BucketPermissionException
     *         The account specified does not have the appropriate bucket permissions.
     * @throws MalformedManifestException
     *         Your manifest is not well-formed.
     * @throws UnableToUpdateJobIdException
     *         AWS Import/Export cannot update the job
     * @throws InvalidVersionException
     *         The client tool version is invalid.
     * @sample AmazonImportExport.UpdateJob
     */
    UpdateJobResult updateJob(UpdateJobRequest updateJobRequest);

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
