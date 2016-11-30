/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball;

import com.amazonaws.services.snowball.model.*;

/**
 * Interface for accessing Amazon Snowball asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.snowball.AbstractAmazonSnowballAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Snowball is a petabyte-scale data transport solution that uses secure appliances to transfer large amounts of
 * data between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The Snowball commands
 * described here provide access to the same functionality that is available in the AWS Snowball Management Console,
 * which enables you to create and manage jobs for Snowball. To transfer data locally with a Snowball appliance, you'll
 * need to use the Snowball client or the Amazon S3 API adapter for Snowball. For more information, see the <a
 * href="http://docs.aws.amazon.com/AWSImportExport/latest/ug/api-reference.html">User Guide</a>.
 * </p>
 */
public interface AmazonSnowballAsync extends AmazonSnowball {

    /**
     * <p>
     * Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status.
     * You'll have at least an hour after creating a cluster job to cancel it.
     * </p>
     * 
     * @param cancelClusterRequest
     * @return A Java Future containing the result of the CancelCluster operation returned by the service.
     * @sample AmazonSnowballAsync.CancelCluster
     */
    java.util.concurrent.Future<CancelClusterResult> cancelClusterAsync(CancelClusterRequest cancelClusterRequest);

    /**
     * <p>
     * Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status.
     * You'll have at least an hour after creating a cluster job to cancel it.
     * </p>
     * 
     * @param cancelClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelCluster operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.CancelCluster
     */
    java.util.concurrent.Future<CancelClusterResult> cancelClusterAsync(CancelClusterRequest cancelClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CancelClusterRequest, CancelClusterResult> asyncHandler);

    /**
     * <p>
     * Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to
     * <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action will
     * return a job's <code>JobState</code> as part of the response element data returned.
     * </p>
     * 
     * @param cancelJobRequest
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonSnowballAsync.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to
     * <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action will
     * return a job's <code>JobState</code> as part of the response element data returned.
     * </p>
     * 
     * @param cancelJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelJob operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.CancelJob
     */
    java.util.concurrent.Future<CancelJobResult> cancelJobAsync(CancelJobRequest cancelJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler);

    /**
     * <p>
     * Creates an address for a Snowball to be shipped to.
     * </p>
     * <p>
     * Addresses are validated at the time of creation. The address you provide must be located within the serviceable
     * area of your region. If the address is invalid or unsupported, then an exception is thrown.
     * </p>
     * 
     * @param createAddressRequest
     * @return A Java Future containing the result of the CreateAddress operation returned by the service.
     * @sample AmazonSnowballAsync.CreateAddress
     */
    java.util.concurrent.Future<CreateAddressResult> createAddressAsync(CreateAddressRequest createAddressRequest);

    /**
     * <p>
     * Creates an address for a Snowball to be shipped to.
     * </p>
     * <p>
     * Addresses are validated at the time of creation. The address you provide must be located within the serviceable
     * area of your region. If the address is invalid or unsupported, then an exception is thrown.
     * </p>
     * 
     * @param createAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAddress operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.CreateAddress
     */
    java.util.concurrent.Future<CreateAddressResult> createAddressAsync(CreateAddressRequest createAddressRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAddressRequest, CreateAddressResult> asyncHandler);

    /**
     * <p>
     * Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to
     * create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     * </p>
     * 
     * @param createClusterRequest
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonSnowballAsync.CreateCluster
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to
     * create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     * </p>
     * 
     * @param createClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.CreateCluster
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must
     * have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for
     * a node in a cluster, you only need to provide the <code>clusterId</code> value; the other job attributes are
     * inherited from the cluster. .
     * </p>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonSnowballAsync.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Creates a job to import or export data between Amazon S3 and your on-premises data center. Your AWS account must
     * have the right trust policies and permissions in place to create a job for Snowball. If you're creating a job for
     * a node in a cluster, you only need to provide the <code>clusterId</code> value; the other job attributes are
     * inherited from the cluster. .
     * </p>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.CreateJob
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <p>
     * Takes an <code>AddressId</code> and returns specific details about that address in the form of an
     * <code>Address</code> object.
     * </p>
     * 
     * @param describeAddressRequest
     * @return A Java Future containing the result of the DescribeAddress operation returned by the service.
     * @sample AmazonSnowballAsync.DescribeAddress
     */
    java.util.concurrent.Future<DescribeAddressResult> describeAddressAsync(DescribeAddressRequest describeAddressRequest);

    /**
     * <p>
     * Takes an <code>AddressId</code> and returns specific details about that address in the form of an
     * <code>Address</code> object.
     * </p>
     * 
     * @param describeAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddress operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.DescribeAddress
     */
    java.util.concurrent.Future<DescribeAddressResult> describeAddressAsync(DescribeAddressRequest describeAddressRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressRequest, DescribeAddressResult> asyncHandler);

    /**
     * <p>
     * Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return
     * addresses from the list of all addresses associated with this account in all US regions.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return A Java Future containing the result of the DescribeAddresses operation returned by the service.
     * @sample AmazonSnowballAsync.DescribeAddresses
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest);

    /**
     * <p>
     * Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return
     * addresses from the list of all addresses associated with this account in all US regions.
     * </p>
     * 
     * @param describeAddressesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAddresses operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.DescribeAddresses
     */
    java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific cluster including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param describeClusterRequest
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonSnowballAsync.DescribeCluster
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Returns information about a specific cluster including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param describeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.DescribeCluster
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific job including shipping information, job status, and other important
     * metadata. .
     * </p>
     * 
     * @param describeJobRequest
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AmazonSnowballAsync.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Returns information about a specific job including shipping information, job status, and other important
     * metadata. .
     * </p>
     * 
     * @param describeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <p>
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
     * <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made.
     * To access the manifest file after 60 minutes have passed, you'll have to make another call to the
     * <code>GetJobManifest</code> action.
     * </p>
     * <p>
     * The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code>
     * status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to
     * the Snowball through the Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same
     * location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
     * gaining access to the Snowball associated with that job.
     * </p>
     * <p>
     * The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is
     * created.
     * </p>
     * 
     * @param getJobManifestRequest
     * @return A Java Future containing the result of the GetJobManifest operation returned by the service.
     * @sample AmazonSnowballAsync.GetJobManifest
     */
    java.util.concurrent.Future<GetJobManifestResult> getJobManifestAsync(GetJobManifestRequest getJobManifestRequest);

    /**
     * <p>
     * Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
     * <code>JobId</code> value. You can access the manifest file for up to 60 minutes after this request has been made.
     * To access the manifest file after 60 minutes have passed, you'll have to make another call to the
     * <code>GetJobManifest</code> action.
     * </p>
     * <p>
     * The manifest is an encrypted file that you can download after your job enters the <code>WithCustomer</code>
     * status. The manifest is decrypted by using the <code>UnlockCode</code> code value, when you pass both values to
     * the Snowball through the Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of an <code>UnlockCode</code> value in the same
     * location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
     * gaining access to the Snowball associated with that job.
     * </p>
     * <p>
     * The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is
     * created.
     * </p>
     * 
     * @param getJobManifestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobManifest operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.GetJobManifest
     */
    java.util.concurrent.Future<GetJobManifestResult> getJobManifestAsync(GetJobManifestRequest getJobManifestRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobManifestRequest, GetJobManifestResult> asyncHandler);

    /**
     * <p>
     * Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value
     * can be accessed for up to 90 days after the associated job has been created.
     * </p>
     * <p>
     * The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
     * is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
     * Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location
     * as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
     * to the Snowball associated with that job.
     * </p>
     * 
     * @param getJobUnlockCodeRequest
     * @return A Java Future containing the result of the GetJobUnlockCode operation returned by the service.
     * @sample AmazonSnowballAsync.GetJobUnlockCode
     */
    java.util.concurrent.Future<GetJobUnlockCodeResult> getJobUnlockCodeAsync(GetJobUnlockCodeRequest getJobUnlockCodeRequest);

    /**
     * <p>
     * Returns the <code>UnlockCode</code> code value for the specified job. A particular <code>UnlockCode</code> value
     * can be accessed for up to 90 days after the associated job has been created.
     * </p>
     * <p>
     * The <code>UnlockCode</code> value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
     * is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
     * Snowball client when the client is started for the first time.
     * </p>
     * <p>
     * As a best practice, we recommend that you don't save a copy of the <code>UnlockCode</code> in the same location
     * as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
     * to the Snowball associated with that job.
     * </p>
     * 
     * @param getJobUnlockCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobUnlockCode operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.GetJobUnlockCode
     */
    java.util.concurrent.Future<GetJobUnlockCodeResult> getJobUnlockCodeAsync(GetJobUnlockCodeRequest getJobUnlockCodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobUnlockCodeRequest, GetJobUnlockCodeResult> asyncHandler);

    /**
     * <p>
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your
     * account has in use.
     * </p>
     * <p>
     * The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
     * your service limit, contact AWS Support.
     * </p>
     * 
     * @param getSnowballUsageRequest
     * @return A Java Future containing the result of the GetSnowballUsage operation returned by the service.
     * @sample AmazonSnowballAsync.GetSnowballUsage
     */
    java.util.concurrent.Future<GetSnowballUsageResult> getSnowballUsageAsync(GetSnowballUsageRequest getSnowballUsageRequest);

    /**
     * <p>
     * Returns information about the Snowball service limit for your account, and also the number of Snowballs your
     * account has in use.
     * </p>
     * <p>
     * The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
     * your service limit, contact AWS Support.
     * </p>
     * 
     * @param getSnowballUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnowballUsage operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.GetSnowballUsage
     */
    java.util.concurrent.Future<GetSnowballUsageResult> getSnowballUsageAsync(GetSnowballUsageRequest getSnowballUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnowballUsageRequest, GetSnowballUsageResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     * </p>
     * 
     * @param listClusterJobsRequest
     * @return A Java Future containing the result of the ListClusterJobs operation returned by the service.
     * @sample AmazonSnowballAsync.ListClusterJobs
     */
    java.util.concurrent.Future<ListClusterJobsResult> listClusterJobsAsync(ListClusterJobsRequest listClusterJobsRequest);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     * </p>
     * 
     * @param listClusterJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusterJobs operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.ListClusterJobs
     */
    java.util.concurrent.Future<ListClusterJobsResult> listClusterJobsAsync(ListClusterJobsRequest listClusterJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListClusterJobsRequest, ListClusterJobsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each
     * <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonSnowballAsync.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each
     * <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.ListClusters
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
     * of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
     * associated with this account in all US regions.
     * </p>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonSnowballAsync.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
     * of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
     * associated with this account in all US regions.
     * </p>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update
     * some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
     * minutes after the cluster being created, this action is no longer available.
     * </p>
     * 
     * @param updateClusterRequest
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonSnowballAsync.UpdateCluster
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update
     * some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
     * minutes after the cluster being created, this action is no longer available.
     * </p>
     * 
     * @param updateClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCluster operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.UpdateCluster
     */
    java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest updateClusterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler);

    /**
     * <p>
     * While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated
     * with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
     * this action is no longer available.
     * </p>
     * 
     * @param updateJobRequest
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AmazonSnowballAsync.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest);

    /**
     * <p>
     * While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated
     * with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
     * this action is no longer available.
     * </p>
     * 
     * @param updateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJob operation returned by the service.
     * @sample AmazonSnowballAsyncHandler.UpdateJob
     */
    java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest updateJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler);

}
