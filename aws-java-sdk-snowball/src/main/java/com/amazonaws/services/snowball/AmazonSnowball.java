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
package com.amazonaws.services.snowball;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.snowball.model.*;

/**
 * Interface for accessing Amazon Snowball.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.snowball.AbstractAmazonSnowball} instead.
 * </p>
 * <p>
 * <p>
 * AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data
 * between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The commands described here
 * provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you
 * to create and manage jobs for Snowball and Snowball Edge devices. To transfer data locally with a device, you'll need
 * to use the Snowball client or the Amazon S3 API adapter for Snowball.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSnowball {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "snowball";

    /**
     * Overrides the default endpoint for this client ("snowball.us-east-1.amazonaws.com/"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "snowball.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "snowball.us-east-1.amazonaws.com/"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "snowball.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "snowball.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonSnowball#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * <p>
     * Cancels a cluster job. You can only cancel a cluster job while it's in the <code>AwaitingQuorum</code> status.
     * You'll have at least an hour after creating a cluster job to cancel it.
     * </p>
     * 
     * @param cancelClusterRequest
     * @return Result of the CancelCluster operation returned by the service.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.CancelCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CancelCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CancelClusterResult cancelCluster(CancelClusterRequest cancelClusterRequest);

    /**
     * <p>
     * Cancels the specified job. You can only cancel a job before its <code>JobState</code> value changes to
     * <code>PreparingAppliance</code>. Requesting the <code>ListJobs</code> or <code>DescribeJob</code> action returns
     * a job's <code>JobState</code> as part of the response element data returned.
     * </p>
     * 
     * @param cancelJobRequest
     * @return Result of the CancelJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @sample AmazonSnowball.CancelJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CancelJob" target="_top">AWS API
     *      Documentation</a>
     */
    CancelJobResult cancelJob(CancelJobRequest cancelJobRequest);

    /**
     * <p>
     * Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of
     * creation. The address you provide must be located within the serviceable area of your region. If the address is
     * invalid or unsupported, then an exception is thrown.
     * </p>
     * 
     * @param createAddressRequest
     * @return Result of the CreateAddress operation returned by the service.
     * @throws InvalidAddressException
     *         The address provided was invalid. Check the address with your region's carrier, and try again.
     * @throws UnsupportedAddressException
     *         The address is either outside the serviceable area for your region, or an error occurred. Check the
     *         address with your region's carrier and try again. If the issue persists, contact AWS Support.
     * @sample AmazonSnowball.CreateAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateAddress" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAddressResult createAddress(CreateAddressRequest createAddressRequest);

    /**
     * <p>
     * Creates an empty cluster. Each cluster supports five nodes. You use the <a>CreateJob</a> action separately to
     * create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a job to the other job attributes are inherited from the cluster.
     * </p>
     * 
     * @param createJobRequest
     * @return Result of the CreateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws ClusterLimitExceededException
     *         Job creation failed. Currently, clusters support five nodes. If you have less than five nodes for your
     *         cluster and you have more nodes to create for this cluster, try again and create jobs until your cluster
     *         has exactly five notes.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateJobResult createJob(CreateJobRequest createJobRequest);

    /**
     * <p>
     * Takes an <code>AddressId</code> and returns specific details about that address in the form of an
     * <code>Address</code> object.
     * </p>
     * 
     * @param describeAddressRequest
     * @return Result of the DescribeAddress operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddress" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddressResult describeAddress(DescribeAddressRequest describeAddressRequest);

    /**
     * <p>
     * Returns a specified number of <code>ADDRESS</code> objects. Calling this API in one of the US regions will return
     * addresses from the list of all addresses associated with this account in all US regions.
     * </p>
     * 
     * @param describeAddressesRequest
     * @return Result of the DescribeAddresses operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.DescribeAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddresses" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest);

    /**
     * <p>
     * Returns information about a specific cluster including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Returns information about a specific job including shipping information, job status, and other important
     * metadata.
     * </p>
     * 
     * @param describeJobRequest
     * @return Result of the DescribeJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @sample AmazonSnowball.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeJobResult describeJob(DescribeJobRequest describeJobRequest);

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
     * @return Result of the GetJobManifest operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobManifest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobManifest" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobManifestResult getJobManifest(GetJobManifestRequest getJobManifestRequest);

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
     * @return Result of the GetJobUnlockCode operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @sample AmazonSnowball.GetJobUnlockCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetJobUnlockCode" target="_top">AWS API
     *      Documentation</a>
     */
    GetJobUnlockCodeResult getJobUnlockCode(GetJobUnlockCodeRequest getJobUnlockCodeRequest);

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
     * @return Result of the GetSnowballUsage operation returned by the service.
     * @sample AmazonSnowball.GetSnowballUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/GetSnowballUsage" target="_top">AWS API
     *      Documentation</a>
     */
    GetSnowballUsageResult getSnowballUsage(GetSnowballUsageRequest getSnowballUsageRequest);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.
     * </p>
     * 
     * @param listClusterJobsRequest
     * @return Result of the ListClusterJobs operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListClusterJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusterJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListClusterJobsResult listClusterJobs(ListClusterJobsRequest listClusterJobsRequest);

    /**
     * <p>
     * Returns an array of <code>ClusterListEntry</code> objects of the specified length. Each
     * <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusters" target="_top">AWS API
     *      Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS
     * account that would be supported for use on <code>EDGE</code>, <code>EDGE_C</code>, and <code>EDGE_CG</code>
     * devices. For more information on compatible AMIs, see <a
     * href="http://docs.aws.amazon.com/snowball/latest/developer-guide/using-ec2.html">Using Amazon EC2 Compute
     * Instances</a> in the <i>AWS Snowball Developer Guide</i>.
     * </p>
     * 
     * @param listCompatibleImagesRequest
     * @return Result of the ListCompatibleImages operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.ListCompatibleImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListCompatibleImages" target="_top">AWS
     *      API Documentation</a>
     */
    ListCompatibleImagesResult listCompatibleImages(ListCompatibleImagesRequest listCompatibleImagesRequest);

    /**
     * <p>
     * Returns an array of <code>JobListEntry</code> objects of the specified length. Each <code>JobListEntry</code>
     * object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
     * of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
     * associated with this account in all US regions.
     * </p>
     * 
     * @param listJobsRequest
     * @return Result of the ListJobs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> string was altered unexpectedly, and the operation has stopped. Run the
     *         operation without changing the <code>NextToken</code> string, and try again.
     * @sample AmazonSnowball.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListJobsResult listJobs(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * While a cluster's <code>ClusterState</code> value is in the <code>AwaitingQuorum</code> state, you can update
     * some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
     * minutes after the cluster being created, this action is no longer available.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * While a job's <code>JobState</code> value is <code>New</code>, you can update some of the information associated
     * with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
     * this action is no longer available.
     * </p>
     * 
     * @param updateJobRequest
     * @return Result of the UpdateJob operation returned by the service.
     * @throws InvalidResourceException
     *         The specified resource can't be found. Check the information you provided in your last request, and try
     *         again.
     * @throws InvalidJobStateException
     *         The action can't be performed because the job's current state doesn't allow that action to be performed.
     * @throws KMSRequestFailedException
     *         The provided AWS Key Management Service key lacks the permissions to perform the specified
     *         <a>CreateJob</a> or <a>UpdateJob</a> action.
     * @throws InvalidInputCombinationException
     *         Job or cluster creation failed. One ore more inputs were invalid. Confirm that the
     *         <a>CreateClusterRequest$SnowballType</a> value supports your <a>CreateJobRequest$JobType</a>, and try
     *         again.
     * @throws ClusterLimitExceededException
     *         Job creation failed. Currently, clusters support five nodes. If you have less than five nodes for your
     *         cluster and you have more nodes to create for this cluster, try again and create jobs until your cluster
     *         has exactly five notes.
     * @throws Ec2RequestFailedException
     *         Your IAM user lacks the necessary Amazon EC2 permissions to perform the attempted action.
     * @sample AmazonSnowball.UpdateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/UpdateJob" target="_top">AWS API
     *      Documentation</a>
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
