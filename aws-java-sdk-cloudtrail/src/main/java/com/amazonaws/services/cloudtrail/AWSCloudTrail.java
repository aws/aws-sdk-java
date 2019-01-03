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
package com.amazonaws.services.cloudtrail;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing CloudTrail.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudtrail.AbstractAWSCloudTrail} instead.
 * </p>
 * <p>
 * <fullname>AWS CloudTrail</fullname>
 * <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common
 * errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS account and delivers log files to an Amazon S3
 * bucket. The recorded information includes the identity of the user, the start time of the AWS API call, the source IP
 * address, the request parameters, and the response elements returned by the service.
 * </p>
 * <note>
 * <p>
 * As an alternative to the API, you can use one of the AWS SDKs, which consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to
 * create programmatic access to AWSCloudTrail. For example, the SDKs take care of cryptographically signing requests,
 * managing errors, and retrying requests automatically. For information about the AWS SDKs, including how to download
 * and install them, see the <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services page</a>.
 * </p>
 * </note>
 * <p>
 * See the <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html">AWS CloudTrail
 * User Guide</a> for information about the data that is included with each AWS API call listed in the log files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudTrail {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudtrail";

    /**
     * Overrides the default endpoint for this client ("cloudtrail.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudtrail.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "cloudtrail.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
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
     *        The endpoint (ex: "cloudtrail.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "cloudtrail.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCloudTrail#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per trail. Overwrites an existing
     * tag's value when a new value is specified for an existing tag key. If you specify a key without a value, the tag
     * will be created with the specified key and a value of null. You can tag a trail that applies to all regions only
     * from the region in which the trail was created (that is, from its home region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail.
     * @return Result of the AddTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an invalid trail ARN. The format of a trail ARN
     *         is:</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws TagsLimitExceededException
     *         The number of tags per trail has exceeded the permitted amount. Currently, the limit is 50.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the key or value specified for the tag does not match the regular
     *         expression <code>^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$</code>.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five
     * trails can exist in a region, irrespective of the region in which they were created.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @return Result of the CreateTrail operation returned by the service.
     * @throws MaximumNumberOfTrailsExceededException
     *         This exception is thrown when the maximum number of trails is reached.
     * @throws TrailAlreadyExistsException
     *         This exception is thrown when the specified trail already exists.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not exist.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not sufficient.
     * @throws InsufficientSnsTopicPolicyException
     *         This exception is thrown when the policy on the SNS topic is not sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key is not sufficient.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is invalid.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws TrailNotProvidedException
     *         This exception is deprecated.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, or when the S3 bucket and the KMS key are not
     *         in the same region.
     * @throws KmsKeyDisabledException
     *         This exception is deprecated.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail can’t be
     *         updated.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch log group is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this region.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between AWS CloudTrail and AWS
     *         Organizations. For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other AWS Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an AWS account that is not a member of an
     *         organization. To make this request, sign in using the credentials of an account that belongs to an
     *         organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when AWS Organizations is not configured to support all features. All features
     *         must be enabled in AWS Organization to support creating an organization trail. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.CreateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTrailResult createTrail(CreateTrailRequest createTrailRequest);

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in which the trail was created.
     * <code>DeleteTrail</code> cannot be called on the shadow trails (replicated trails in other regions) of a trail
     * that is enabled in all regions.
     * </p>
     * 
     * @param deleteTrailRequest
     *        The request that specifies the name of a trail to delete.
     * @return Result of the DeleteTrail operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.DeleteTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest);

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region for your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @return Result of the DescribeTrails operation returned by the service.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @sample AWSCloudTrail.DescribeTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeTrails" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTrailsResult describeTrails(DescribeTrailsRequest describeTrailsRequest);

    /**
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrails(DescribeTrailsRequest)
     */
    DescribeTrailsResult describeTrails();

    /**
     * <p>
     * Describes the settings for the event selectors that you configured for your trail. The information returned for
     * your event selectors includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your event selector includes read-only events, write-only events, or all events. This applies to both
     * management events and data events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes management events.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging
     * for data events.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html"
     * >Logging Data and Management Events for Trails </a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * 
     * @param getEventSelectorsRequest
     * @return Result of the GetEventSelectors operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @sample AWSCloudTrail.GetEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventSelectorsResult getEventSelectors(GetEventSelectorsRequest getEventSelectorsRequest);

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
     * errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
     * trail status from a single region. To return trail status from all regions, you must call the operation on each
     * region.
     * </p>
     * 
     * @param getTrailStatusRequest
     *        The name of a trail about which you want the current status.
     * @return Result of the GetTrailStatus operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @sample AWSCloudTrail.GetTrailStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrailStatus" target="_top">AWS API
     *      Documentation</a>
     */
    GetTrailStatusResult getTrailStatus(GetTrailStatusRequest getTrailStatusRequest);

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest files within the specified time range.
     * The public key is needed to validate digest files that were signed with its corresponding private key.
     * </p>
     * <note>
     * <p>
     * CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key
     * unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the
     * same region for its corresponding public key.
     * </p>
     * </note>
     * 
     * @param listPublicKeysRequest
     *        Requests the public keys for a specified time range.
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are invalid. Either the start time occurs after the end time or the time
     *         range is outside the range of possible values.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws InvalidTokenException
     *         Reserved for future use.
     * @sample AWSCloudTrail.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    ListPublicKeysResult listPublicKeys(ListPublicKeysRequest listPublicKeysRequest);

    /**
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeys(ListPublicKeysRequest)
     */
    ListPublicKeysResult listPublicKeys();

    /**
     * <p>
     * Lists the tags for the trail in the current region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of trail tags to return.
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an invalid trail ARN. The format of a trail ARN
     *         is:</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws InvalidTokenException
     *         Reserved for future use.
     * @sample AWSCloudTrail.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Looks up <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events"
     * >management events</a> captured by CloudTrail. Events for a region can be looked up in that region during the
     * last 90 days. Lookup supports the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS access key
     * </p>
     * </li>
     * <li>
     * <p>
     * Event ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Event name
     * </p>
     * </li>
     * <li>
     * <p>
     * Event source
     * </p>
     * </li>
     * <li>
     * <p>
     * Read only
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource name
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource type
     * </p>
     * </li>
     * <li>
     * <p>
     * User name
     * </p>
     * </li>
     * </ul>
     * <p>
     * All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The
     * response includes a token that you can use to get the next page of results.
     * </p>
     * <important>
     * <p>
     * The rate of lookup requests is limited to one per second per account. If this limit is exceeded, a throttling
     * error occurs.
     * </p>
     * </important> <important>
     * <p>
     * Events that occurred during the selected time range will not be available for lookup if CloudTrail logging was
     * not enabled when the events occurred.
     * </p>
     * </important>
     * 
     * @param lookupEventsRequest
     *        Contains a request for LookupEvents.
     * @return Result of the LookupEvents operation returned by the service.
     * @throws InvalidLookupAttributesException
     *         Occurs when an invalid lookup attribute is specified.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are invalid. Either the start time occurs after the end time or the time
     *         range is outside the range of possible values.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is invalid.
     * @throws InvalidNextTokenException
     *         Invalid token or token that was previously used in a request with different parameters. This exception is
     *         thrown if the token is invalid.
     * @sample AWSCloudTrail.LookupEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupEvents" target="_top">AWS API
     *      Documentation</a>
     */
    LookupEventsResult lookupEvents(LookupEventsRequest lookupEventsRequest);

    /**
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEvents(LookupEventsRequest)
     */
    LookupEventsResult lookupEvents();

    /**
     * <p>
     * Configures an event selector for your trail. Use event selectors to further specify the management and data event
     * settings for your trail. By default, trails created without specific event selectors will be configured to log
     * all read and write management events, and no data events.
     * </p>
     * <p>
     * When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if
     * the event matches any event selector, the trail processes and logs the event. If the event doesn't match any
     * event selector, the trail doesn't log the event.
     * </p>
     * <p>
     * Example
     * </p>
     * <ol>
     * <li>
     * <p>
     * You create an event selector for a trail and specify that you want write-only events.
     * </p>
     * </li>
     * <li>
     * <p>
     * The EC2 <code>GetConsoleOutput</code> and <code>RunInstances</code> API operations occur in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudTrail evaluates whether the events match your event selectors.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RunInstances</code> is a write-only event and it matches your event selector. The trail logs the event.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GetConsoleOutput</code> is a read-only event but it doesn't match your event selector. The trail
     * doesn't log the event.
     * </p>
     * </li>
     * </ol>
     * <p>
     * The <code>PutEventSelectors</code> operation must be called from the region in which the trail was created;
     * otherwise, an <code>InvalidHomeRegionException</code> is thrown.
     * </p>
     * <p>
     * You can configure up to five event selectors for each trail. For more information, see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html"
     * >Logging Data and Management Events for Trails </a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Limits in AWS
     * CloudTrail</a> in the <i>AWS CloudTrail User Guide</i>.
     * </p>
     * 
     * @param putEventSelectorsRequest
     * @return Result of the PutEventSelectors operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws InvalidEventSelectorsException
     *         This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of
     *         event selectors or data resources that is not valid. The combination of event selectors and data
     *         resources is not valid. A trail can have up to 5 event selectors. A trail is limited to 250 data
     *         resources. These data resources can be distributed across event selectors, but the overall total cannot
     *         exceed 250.</p>
     *         <p>
     *         You can:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify a valid number of event selectors (1 to 5) for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid number of data resources (1 to 250) for an event selector. The limit of number of
     *         resources on an individual event selector is configurable up to 250. However, this upper limit is allowed
     *         only if the total number of data resources does not exceed 250 across all event selectors for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter
     *         with a value of <code>read-only</code> is invalid.
     *         </p>
     *         </li>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.PutEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    PutEventSelectorsResult putEventSelectors(PutEventSelectorsRequest putEventSelectorsRequest);

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an invalid trail ARN. The format of a trail ARN
     *         is:</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the key or value specified for the tag does not match the regular
     *         expression <code>^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$</code>.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all
     * regions, this operation must be called from the region in which the trail was created. This operation cannot be
     * called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging AWS API calls for an account.
     * @return Result of the StartLogging operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.StartLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartLogging" target="_top">AWS API
     *      Documentation</a>
     */
    StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest);

    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances,
     * there is no need to use this action. You can update a trail without stopping it first. This action is the only
     * way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which
     * the trail was created, or an <code>InvalidHomeRegionException</code> will occur. This operation cannot be called
     * on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
     * </p>
     * 
     * @param stopLoggingRequest
     *        Passes the request to CloudTrail to stop logging AWS API calls for the specified account.
     * @return Result of the StopLogging operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.StopLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopLogging" target="_top">AWS API
     *      Documentation</a>
     */
    StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest);

    /**
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the
     * CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has
     * previously been a target for CloudTrail log files, an IAM policy exists for the bucket. <code>UpdateTrail</code>
     * must be called from the region in which the trail was created; otherwise, an
     * <code>InvalidHomeRegionException</code> is thrown.
     * </p>
     * 
     * @param updateTrailRequest
     *        Specifies settings to update for the trail.
     * @return Result of the UpdateTrail operation returned by the service.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not exist.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not sufficient.
     * @throws InsufficientSnsTopicPolicyException
     *         This exception is thrown when the policy on the SNS topic is not sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key is not sufficient.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is invalid.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not valid. Trail names must meet the following
     *         requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Start with a letter or number, and end with a letter or number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be between 3 and 128 characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and
     *         <code>my--namespace</code> are invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws TrailNotProvidedException
     *         This exception is deprecated.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, or when the S3 bucket and the KMS key are not
     *         in the same region.
     * @throws KmsKeyDisabledException
     *         This exception is deprecated.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail can’t be
     *         updated.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch log group is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this region.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between AWS CloudTrail and AWS
     *         Organizations. For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other AWS Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization trail is
     *         lacking one or more required permissions for creating an organization trail in a required service. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an AWS account that is not a member of an
     *         organization. To make this request, sign in using the credentials of an account that belongs to an
     *         organization.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the AWS account making the request to create or update an organization
     *         trail is not the master account for an organization in AWS Organizations. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when AWS Organizations is not configured to support all features. All features
     *         must be enabled in AWS Organization to support creating an organization trail. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @sample AWSCloudTrail.UpdateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest);

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
