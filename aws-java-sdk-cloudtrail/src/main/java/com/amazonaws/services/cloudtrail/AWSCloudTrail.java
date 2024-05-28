/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>CloudTrail</fullname>
 * <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions, data types, common parameters, and common
 * errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records Amazon Web Services API calls for your Amazon Web Services account and
 * delivers log files to an Amazon S3 bucket. The recorded information includes the identity of the user, the start time
 * of the Amazon Web Services API call, the source IP address, the request parameters, and the response elements
 * returned by the service.
 * </p>
 * <note>
 * <p>
 * As an alternative to the API, you can use one of the Amazon Web Services SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide
 * programmatic access to CloudTrail. For example, the SDKs handle cryptographically signing requests, managing errors,
 * and retrying requests automatically. For more information about the Amazon Web Services SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * See the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-user-guide.html">CloudTrail
 * User Guide</a> for information about the data that is included with each Amazon Web Services API call listed in the
 * log files.
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
     * Adds one or more tags to a trail, event data store, or channel, up to a limit of 50. Overwrites an existing tag's
     * value when a new value is specified for an existing tag key. Tag key names must be unique; you cannot have two
     * keys with the same name but different values. If you specify a key without a value, the tag will be created with
     * the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon Web
     * Services Regions only from the Region in which the trail or event data store was created (also known as its home
     * Region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail, event data store, or channel.
     * @return Result of the AddTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws TagsLimitExceededException
     *         The number of tags per trail, event data store, or channel has exceeded the permitted amount. Currently,
     *         the limit is 50.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the specified tag key or values are not valid. It can also occur if there
     *         are duplicate tags or too many tags on the resource.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws ChannelNotFoundException
     *         This exception is thrown when CloudTrail cannot find the specified channel.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @sample AWSCloudTrail.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Cancels a query if the query is not in a terminated state, such as <code>CANCELLED</code>, <code>FAILED</code>,
     * <code>TIMED_OUT</code>, or <code>FINISHED</code>. You must specify an ARN value for <code>EventDataStore</code>.
     * The ID of the query that you want to cancel is also required. When you run <code>CancelQuery</code>, the query
     * status might show as <code>CANCELLED</code> even if the operation is not yet finished.
     * </p>
     * 
     * @param cancelQueryRequest
     * @return Result of the CancelQuery operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InactiveQueryException
     *         The specified query cannot be canceled because it is in the <code>FINISHED</code>, <code>FAILED</code>,
     *         <code>TIMED_OUT</code>, or <code>CANCELLED</code> state.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws QueryIdNotFoundException
     *         The query ID does not exist or does not map to a query.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @sample AWSCloudTrail.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CancelQuery" target="_top">AWS API
     *      Documentation</a>
     */
    CancelQueryResult cancelQuery(CancelQueryRequest cancelQueryRequest);

    /**
     * <p>
     * Creates a channel for CloudTrail to ingest events from a partner or external source. After you create a channel,
     * a CloudTrail Lake event data store can log events from the partner or source that you specify.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws ChannelMaxLimitExceededException
     *         This exception is thrown when the maximum number of channels limit is exceeded.
     * @throws InvalidSourceException
     *         This exception is thrown when the specified value of <code>Source</code> is not valid.
     * @throws ChannelAlreadyExistsException
     *         This exception is thrown when the provided channel already exists.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventDataStoreCategoryException
     *         This exception is thrown when event categories of specified event data stores are not valid.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidTagParameterException
     *         This exception is thrown when the specified tag key or values are not valid. It can also occur if there
     *         are duplicate tags or too many tags on the resource.
     * @throws TagsLimitExceededException
     *         The number of tags per trail, event data store, or channel has exceeded the permitted amount. Currently,
     *         the limit is 50.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a new event data store.
     * </p>
     * 
     * @param createEventDataStoreRequest
     * @return Result of the CreateEventDataStore operation returned by the service.
     * @throws EventDataStoreAlreadyExistsException
     *         An event data store with that name already exists.
     * @throws EventDataStoreMaxLimitExceededException
     *         Your account has used the maximum number of event data stores.
     * @throws InvalidEventSelectorsException
     *         This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of
     *         event selectors, advanced event selectors, or data resources that is not valid. The combination of event
     *         selectors or advanced event selectors and data resources is not valid. A trail can have up to 5 event
     *         selectors. If a trail uses advanced event selectors, a maximum of 500 total values for all conditions in
     *         all advanced event selectors is allowed. A trail is limited to 250 data resources. These data resources
     *         can be distributed across event selectors, but the overall total cannot exceed 250.</p>
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
     *         Specify up to 500 values for all conditions in all advanced event selectors for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter
     *         with a value of <code>read-only</code> is not valid.
     *         </p>
     *         </li>
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidTagParameterException
     *         This exception is thrown when the specified tag key or values are not valid. It can also occur if there
     *         are duplicate tags or too many tags on the resource.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same Region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same Region.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail or event data
     *         store can't be updated.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.CreateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventDataStoreResult createEventDataStore(CreateEventDataStoreRequest createEventDataStoreRequest);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket.
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
     *         This exception is thrown when the policy on the Amazon SNS topic is not sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws TrailNotProvidedException
     *         This exception is no longer in use.
     * @throws TagsLimitExceededException
     *         The number of tags per trail, event data store, or channel has exceeded the permitted amount. Currently,
     *         the limit is 50.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same Region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same Region.
     * @throws KmsKeyDisabledException
     *         This exception is no longer in use.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail or event data
     *         store can't be updated.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch Logs log group is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this Region.
     * @throws InvalidTagParameterException
     *         This exception is thrown when the specified tag key or values are not valid. It can also occur if there
     *         are duplicate tags or too many tags on the resource.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws CloudTrailInvalidClientTokenIdException
     *         This exception is thrown when a call results in the <code>InvalidClientTokenId</code> error code. This
     *         can occur when you are creating or updating a trail to send notifications to an Amazon SNS topic that is
     *         in a suspended Amazon Web Services account.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @sample AWSCloudTrail.CreateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTrailResult createTrail(CreateTrailRequest createTrailRequest);

    /**
     * <p>
     * Deletes a channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
     * @throws ChannelNotFoundException
     *         This exception is thrown when CloudTrail cannot find the specified channel.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Disables the event data store specified by <code>EventDataStore</code>, which accepts an event data store ARN.
     * After you run <code>DeleteEventDataStore</code>, the event data store enters a <code>PENDING_DELETION</code>
     * state, and is automatically deleted after a wait period of seven days. <code>TerminationProtectionEnabled</code>
     * must be set to <code>False</code> on the event data store and the <code>FederationStatus</code> must be
     * <code>DISABLED</code>. You cannot delete an event data store if <code>TerminationProtectionEnabled</code> is
     * <code>True</code> or the <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     * <p>
     * After you run <code>DeleteEventDataStore</code> on an event data store, you cannot run <code>ListQueries</code>,
     * <code>DescribeQuery</code>, or <code>GetQueryResults</code> on queries that are using an event data store in a
     * <code>PENDING_DELETION</code> state. An event data store in the <code>PENDING_DELETION</code> state does not
     * incur costs.
     * </p>
     * 
     * @param deleteEventDataStoreRequest
     * @return Result of the DeleteEventDataStore operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws EventDataStoreTerminationProtectedException
     *         The event data store cannot be deleted because termination protection is enabled for it.
     * @throws EventDataStoreHasOngoingImportException
     *         This exception is thrown when you try to update or delete an event data store that currently has an
     *         import in progress.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws ChannelExistsForEDSException
     *         This exception is thrown when the specified event data store cannot yet be deleted because it is in use
     *         by a channel.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws EventDataStoreFederationEnabledException
     *         You cannot delete the event data store because Lake query federation is enabled. To delete the event data
     *         store, run the <code>DisableFederation</code> operation to disable Lake query federation on the event
     *         data store.
     * @sample AWSCloudTrail.DeleteEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventDataStoreResult deleteEventDataStore(DeleteEventDataStoreRequest deleteEventDataStoreRequest);

    /**
     * <p>
     * Deletes the resource-based policy attached to the CloudTrail channel.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceARNNotValidException
     *         This exception is thrown when the provided resource does not exist, or the ARN format of the resource is
     *         not valid. The following is the valid format for a resource ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws ResourcePolicyNotFoundException
     *         This exception is thrown when the specified resource policy is not found.
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a trail. This operation must be called from the Region in which the trail was created.
     * <code>DeleteTrail</code> cannot be called on the shadow trails (replicated trails in other Regions) of a trail
     * that is enabled in all Regions.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.DeleteTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest);

    /**
     * <p>
     * Removes CloudTrail delegated administrator permissions from a member account in an organization.
     * </p>
     * 
     * @param deregisterOrganizationDelegatedAdminRequest
     *        Removes CloudTrail delegated administrator permissions from a specified member account in an organization
     *        that is currently designated as a delegated administrator.
     * @return Result of the DeregisterOrganizationDelegatedAdmin operation returned by the service.
     * @throws AccountNotFoundException
     *         This exception is thrown when the specified account is not found or not part of an organization.
     * @throws AccountNotRegisteredException
     *         This exception is thrown when the specified account is not registered as the CloudTrail delegated
     *         administrator.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws NotOrganizationManagementAccountException
     *         This exception is thrown when the account making the request is not the organization's management
     *         account.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @sample AWSCloudTrail.DeregisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeregisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterOrganizationDelegatedAdminResult deregisterOrganizationDelegatedAdmin(
            DeregisterOrganizationDelegatedAdminRequest deregisterOrganizationDelegatedAdminRequest);

    /**
     * <p>
     * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched,
     * and query status. If the query results were delivered to an S3 bucket, the response also provides the S3 URI and
     * the delivery status.
     * </p>
     * <p>
     * You must specify either a <code>QueryID</code> or a <code>QueryAlias</code>. Specifying the
     * <code>QueryAlias</code> parameter returns information about the last query run for the alias.
     * </p>
     * 
     * @param describeQueryRequest
     * @return Result of the DescribeQuery operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws QueryIdNotFoundException
     *         The query ID does not exist or does not map to a query.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.DescribeQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeQuery" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeQueryResult describeQuery(DescribeQueryRequest describeQueryRequest);

    /**
     * <p>
     * Retrieves settings for one or more trails associated with the current Region for your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @return Result of the DescribeTrails operation returned by the service.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
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
     * Disables Lake query federation on the specified event data store. When you disable federation, CloudTrail
     * disables the integration with Glue, Lake Formation, and Amazon Athena. After disabling Lake query federation, you
     * can no longer query your event data in Amazon Athena.
     * </p>
     * <p>
     * No CloudTrail Lake data is deleted when you disable federation and you can continue to run queries in CloudTrail
     * Lake.
     * </p>
     * 
     * @param disableFederationRequest
     * @return Result of the DisableFederation operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws ConcurrentModificationException
     *         You are trying to update a resource when another request is in progress. Allow sufficient wait time for
     *         the previous request to complete, then retry your request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSCloudTrail.DisableFederation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DisableFederation" target="_top">AWS
     *      API Documentation</a>
     */
    DisableFederationResult disableFederation(DisableFederationRequest disableFederationRequest);

    /**
     * <p>
     * Enables Lake query federation on the specified event data store. Federating an event data store lets you view the
     * metadata associated with the event data store in the Glue <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/components-overview.html#data-catalog-intro">Data Catalog</a>
     * and run SQL queries against your event data using Amazon Athena. The table metadata stored in the Glue Data
     * Catalog lets the Athena query engine know how to find, read, and process the data that you want to query.
     * </p>
     * <p>
     * When you enable Lake query federation, CloudTrail creates a managed database named <code>aws:cloudtrail</code>
     * (if the database doesn't already exist) and a managed federated table in the Glue Data Catalog. The event data
     * store ID is used for the table name. CloudTrail registers the role ARN and event data store in <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation-lake-formation.html">Lake
     * Formation</a>, the service responsible for allowing fine-grained access control of the federated resources in the
     * Glue Data Catalog.
     * </p>
     * <p>
     * For more information about Lake query federation, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Federate an event data
     * store</a>.
     * </p>
     * 
     * @param enableFederationRequest
     * @return Result of the EnableFederation operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws ConcurrentModificationException
     *         You are trying to update a resource when another request is in progress. Allow sufficient wait time for
     *         the previous request to complete, then retry your request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws EventDataStoreFederationEnabledException
     *         You cannot delete the event data store because Lake query federation is enabled. To delete the event data
     *         store, run the <code>DisableFederation</code> operation to disable Lake query federation on the event
     *         data store.
     * @sample AWSCloudTrail.EnableFederation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/EnableFederation" target="_top">AWS
     *      API Documentation</a>
     */
    EnableFederationResult enableFederation(EnableFederationRequest enableFederationRequest);

    /**
     * <p>
     * Returns information about a specific channel.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
     * @throws ChannelNotFoundException
     *         This exception is thrown when CloudTrail cannot find the specified channel.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetChannelResult getChannel(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Returns information about an event data store specified as either an ARN or the ID portion of the ARN.
     * </p>
     * 
     * @param getEventDataStoreRequest
     * @return Result of the GetEventDataStore operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.GetEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventDataStore" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventDataStoreResult getEventDataStore(GetEventDataStoreRequest getEventDataStoreRequest);

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
     * If your event selector includes data events, the resources on which you are logging data events.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about logging management and data events, see the following topics in the <i>CloudTrail User
     * Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">
     * Logging data events</a>
     * </p>
     * </li>
     * </ul>
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.GetEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventSelectorsResult getEventSelectors(GetEventSelectorsRequest getEventSelectorsRequest);

    /**
     * <p>
     * Returns information about a specific import.
     * </p>
     * 
     * @param getImportRequest
     * @return Result of the GetImport operation returned by the service.
     * @throws ImportNotFoundException
     *         The specified import was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportResult getImport(GetImportRequest getImportRequest);

    /**
     * <p>
     * Describes the settings for the Insights event selectors that you configured for your trail or event data store.
     * <code>GetInsightSelectors</code> shows if CloudTrail Insights event logging is enabled on the trail or event data
     * store, and if it is, which Insights types are enabled. If you run <code>GetInsightSelectors</code> on a trail or
     * event data store that does not have Insights events enabled, the operation throws the exception
     * <code>InsightNotEnabledException</code>
     * </p>
     * <p>
     * Specify either the <code>EventDataStore</code> parameter to get Insights event selectors for an event data store,
     * or the <code>TrailName</code> parameter to the get Insights event selectors for a trail. You cannot specify these
     * parameters together.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging CloudTrail Insights events</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param getInsightSelectorsRequest
     * @return Result of the GetInsightSelectors operation returned by the service.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws InsightNotEnabledException
     *         If you run <code>GetInsightSelectors</code> on a trail or event data store that does not have Insights
     *         events enabled, the operation throws the exception <code>InsightNotEnabledException</code>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @sample AWSCloudTrail.GetInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    GetInsightSelectorsResult getInsightSelectors(GetInsightSelectorsRequest getInsightSelectorsRequest);

    /**
     * <p>
     * Gets event data results of a query. You must specify the <code>QueryID</code> value returned by the
     * <code>StartQuery</code> operation.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is not valid.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws QueryIdNotFoundException
     *         The query ID does not exist or does not map to a query.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Retrieves the JSON text of the resource-based policy document attached to the CloudTrail channel.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ResourceARNNotValidException
     *         This exception is thrown when the provided resource does not exist, or the ARN format of the resource is
     *         not valid. The following is the valid format for a resource ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws ResourcePolicyNotFoundException
     *         This exception is thrown when the specified resource policy is not found.
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Returns settings information for a specified trail.
     * </p>
     * 
     * @param getTrailRequest
     * @return Result of the GetTrail operation returned by the service.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
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
     *         <code>my--namespace</code> are not valid.
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
     * @sample AWSCloudTrail.GetTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrail" target="_top">AWS API
     *      Documentation</a>
     */
    GetTrailResult getTrail(GetTrailRequest getTrailRequest);

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery
     * errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns
     * trail status from a single Region. To return trail status from all Regions, you must call the operation on each
     * Region.
     * </p>
     * 
     * @param getTrailStatusRequest
     *        The name of a trail about which you want the current status.
     * @return Result of the GetTrailStatus operation returned by the service.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
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
     *         <code>my--namespace</code> are not valid.
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
     * @sample AWSCloudTrail.GetTrailStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrailStatus" target="_top">AWS API
     *      Documentation</a>
     */
    GetTrailStatusResult getTrailStatus(GetTrailStatusRequest getTrailStatusRequest);

    /**
     * <p>
     * Lists the channels in the current account, and their source names.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Returns information about all event data stores in the account, in the current Region.
     * </p>
     * 
     * @param listEventDataStoresRequest
     * @return Result of the ListEventDataStores operation returned by the service.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is not valid.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.ListEventDataStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListEventDataStores" target="_top">AWS
     *      API Documentation</a>
     */
    ListEventDataStoresResult listEventDataStores(ListEventDataStoresRequest listEventDataStoresRequest);

    /**
     * <p>
     * Returns a list of failures for the specified import.
     * </p>
     * 
     * @param listImportFailuresRequest
     * @return Result of the ListImportFailures operation returned by the service.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @sample AWSCloudTrail.ListImportFailures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS
     *      API Documentation</a>
     */
    ListImportFailuresResult listImportFailures(ListImportFailuresRequest listImportFailuresRequest);

    /**
     * <p>
     * Returns information on all imports, or a select set of imports by <code>ImportStatus</code> or
     * <code>Destination</code>.
     * </p>
     * 
     * @param listImportsRequest
     * @return Result of the ListImports operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    ListImportsResult listImports(ListImportsRequest listImportsRequest);

    /**
     * <p>
     * Returns Insights metrics data for trails that have enabled Insights. The request must include the
     * <code>EventSource</code>, <code>EventName</code>, and <code>InsightType</code> parameters.
     * </p>
     * <p>
     * If the <code>InsightType</code> is set to <code>ApiErrorRateInsight</code>, the request must also include the
     * <code>ErrorCode</code> parameter.
     * </p>
     * <p>
     * The following are the available time periods for <code>ListInsightsMetricData</code>. Each cutoff is inclusive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data points with a period of 60 seconds (1-minute) are available for 15 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 300 seconds (5-minute) are available for 63 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * Data points with a period of 3600 seconds (1 hour) are available for 90 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Access to the <code>ListInsightsMetricData</code> API operation is linked to the
     * <code>cloudtrail:LookupEvents</code> action. To use this operation, you must have permissions to perform the
     * <code>cloudtrail:LookupEvents</code> action.
     * </p>
     * 
     * @param listInsightsMetricDataRequest
     * @return Result of the ListInsightsMetricData operation returned by the service.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.ListInsightsMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListInsightsMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    ListInsightsMetricDataResult listInsightsMetricData(ListInsightsMetricDataRequest listInsightsMetricDataRequest);

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest files within the specified time range.
     * The public key is needed to validate digest files that were signed with its corresponding private key.
     * </p>
     * <note>
     * <p>
     * CloudTrail uses different private and public key pairs per Region. Each digest file is signed with a private key
     * unique to its Region. When you validate a digest file from a specific Region, you must look in the same Region
     * for its corresponding public key.
     * </p>
     * </note>
     * 
     * @param listPublicKeysRequest
     *        Requests the public keys for a specified time range.
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are not valid. Either the start time occurs after the end time, or the
     *         time range is outside the range of possible values.
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
     * Returns a list of queries and query statuses for the past seven days. You must specify an ARN value for
     * <code>EventDataStore</code>. Optionally, to shorten the list of results, you can specify a time range, formatted
     * as timestamps, by adding <code>StartTime</code> and <code>EndTime</code> parameters, and a
     * <code>QueryStatus</code> value. Valid values for <code>QueryStatus</code> include <code>QUEUED</code>,
     * <code>RUNNING</code>, <code>FINISHED</code>, <code>FAILED</code>, <code>TIMED_OUT</code>, or
     * <code>CANCELLED</code>.
     * </p>
     * 
     * @param listQueriesRequest
     * @return Result of the ListQueries operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidDateRangeException
     *         A date range for the query was specified that is not valid. Be sure that the start time is
     *         chronologically before the end time. For more information about writing a query, see <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-create-edit-query.html">Create or
     *         edit a query</a> in the <i>CloudTrail User Guide</i>.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is not valid.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidQueryStatusException
     *         The query status is not valid for the operation.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.ListQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListQueries" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueriesResult listQueries(ListQueriesRequest listQueriesRequest);

    /**
     * <p>
     * Lists the tags for the specified trails, event data stores, or channels in the current Region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of tags to return.
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws InvalidTokenException
     *         Reserved for future use.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists trails that are in the current account.
     * </p>
     * 
     * @param listTrailsRequest
     * @return Result of the ListTrails operation returned by the service.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @sample AWSCloudTrail.ListTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListTrails" target="_top">AWS API
     *      Documentation</a>
     */
    ListTrailsResult listTrails(ListTrailsRequest listTrailsRequest);

    /**
     * <p>
     * Looks up <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events"
     * >management events</a> or <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-insights-events"
     * >CloudTrail Insights events</a> that are captured by CloudTrail. You can look up events that occurred in a Region
     * within the last 90 days.
     * </p>
     * <note>
     * <p>
     * <code>LookupEvents</code> returns recent Insights events for trails that enable Insights. To view Insights events
     * for an event data store, you can run queries on your Insights event data store, and you can also view the Lake
     * dashboard for Insights.
     * </p>
     * </note>
     * <p>
     * Lookup supports the following attributes for management events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services access key
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
     * Lookup supports the following attributes for Insights events:
     * </p>
     * <ul>
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
     * </ul>
     * <p>
     * All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The
     * response includes a token that you can use to get the next page of results.
     * </p>
     * <important>
     * <p>
     * The rate of lookup requests is limited to two per second, per account, per Region. If this limit is exceeded, a
     * throttling error occurs.
     * </p>
     * </important>
     * 
     * @param lookupEventsRequest
     *        Contains a request for LookupEvents.
     * @return Result of the LookupEvents operation returned by the service.
     * @throws InvalidLookupAttributesException
     *         Occurs when a lookup attribute is specified that is not valid.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are not valid. Either the start time occurs after the end time, or the
     *         time range is outside the range of possible values.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is not valid.
     * @throws InvalidNextTokenException
     *         A token that is not valid, or a token that was previously used in a request with different parameters.
     *         This exception is thrown if the token is not valid.
     * @throws InvalidEventCategoryException
     *         Occurs if an event category that is not valid is specified as a value of <code>EventCategory</code>.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
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
     * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event
     * selectors to specify management and data event settings for your trail. If you want your trail to log Insights
     * events, be sure the event selector enables logging of the Insights event types you want configured for your
     * trail. For more information about logging Insights events, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging Insights events for trails</a> in the <i>CloudTrail User Guide</i>. By default, trails created without
     * specific event selectors are configured to log all read and write management events, and no data events.
     * </p>
     * <p>
     * When an event occurs in your account, CloudTrail evaluates the event selectors or advanced event selectors in all
     * trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the
     * event doesn't match any event selector, the trail doesn't log the event.
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
     * The <code>GetConsoleOutput</code> is a read-only event that doesn't match your event selector. The trail doesn't
     * log the event.
     * </p>
     * </li>
     * </ol>
     * <p>
     * The <code>PutEventSelectors</code> operation must be called from the Region in which the trail was created;
     * otherwise, an <code>InvalidHomeRegionException</code> exception is thrown.
     * </p>
     * <p>
     * You can configure up to five event selectors for each trail. For more information, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events</a>, <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html"
     * >Logging data events</a>, and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html">Quotas in
     * CloudTrail</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * <p>
     * You can add advanced event selectors, and conditions for your advanced event selectors, up to a maximum of 500
     * values for all conditions and selectors on a trail. You can use either <code>AdvancedEventSelectors</code> or
     * <code>EventSelectors</code>, but not both. If you apply <code>AdvancedEventSelectors</code> to a trail, any
     * existing <code>EventSelectors</code> are overwritten. For more information about advanced event selectors, see <a
     * href
     * ="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">Logging
     * data events</a> in the <i>CloudTrail User Guide</i>.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws InvalidEventSelectorsException
     *         This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of
     *         event selectors, advanced event selectors, or data resources that is not valid. The combination of event
     *         selectors or advanced event selectors and data resources is not valid. A trail can have up to 5 event
     *         selectors. If a trail uses advanced event selectors, a maximum of 500 total values for all conditions in
     *         all advanced event selectors is allowed. A trail is limited to 250 data resources. These data resources
     *         can be distributed across event selectors, but the overall total cannot exceed 250.
     *         </p>
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
     *         Specify up to 500 values for all conditions in all advanced event selectors for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter
     *         with a value of <code>read-only</code> is not valid.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.PutEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    PutEventSelectorsResult putEventSelectors(PutEventSelectorsRequest putEventSelectorsRequest);

    /**
     * <p>
     * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an
     * existing trail or event data store. You also use <code>PutInsightSelectors</code> to turn off Insights event
     * logging, by passing an empty list of Insights types. The valid Insights event types are
     * <code>ApiErrorRateInsight</code> and <code>ApiCallRateInsight</code>.
     * </p>
     * <p>
     * To enable Insights on an event data store, you must specify the ARNs (or ID suffix of the ARNs) for the source
     * event data store (<code>EventDataStore</code>) and the destination event data store (
     * <code>InsightsDestination</code>). The source event data store logs management events and enables Insights. The
     * destination event data store logs Insights events based upon the management event activity of the source event
     * data store. The source and destination event data stores must belong to the same Amazon Web Services account.
     * </p>
     * <p>
     * To log Insights events for a trail, you must specify the name (<code>TrailName</code>) of the CloudTrail trail
     * for which you want to change or add Insights selectors.
     * </p>
     * <p>
     * To log CloudTrail Insights events on API call volume, the trail or event data store must log <code>write</code>
     * management events. To log CloudTrail Insights events on API error rate, the trail or event data store must log
     * <code>read</code> or <code>write</code> management events. You can call <code>GetEventSelectors</code> on a trail
     * to check whether the trail logs management events. You can call <code>GetEventDataStore</code> on an event data
     * store to check whether the event data store logs management events.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging CloudTrail Insights events</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param putInsightSelectorsRequest
     * @return Result of the PutInsightSelectors operation returned by the service.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws InvalidInsightSelectorsException
     *         For <code>PutInsightSelectors</code>, this exception is thrown when the formatting or syntax of the
     *         <code>InsightSelectors</code> JSON statement is not valid, or the specified <code>InsightType</code> in
     *         the <code>InsightSelectors</code> statement is not valid. Valid values for <code>InsightType</code> are
     *         <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code>. To enable Insights on an event data
     *         store, the destination event data store specified by the <code>InsightsDestination</code> parameter must
     *         log Insights events and the source event data store specified by the <code>EventDataStore</code>
     *         parameter must log management events.
     *         </p>
     *         <p>
     *         For <code>UpdateEventDataStore</code>, this exception is thrown if Insights are enabled on the event data
     *         store and the updated advanced event selectors are not compatible with the configured <code>
     *         InsightSelectors</code>. If the <code>InsightSelectors</code> includes an <code>InsightType</code> of
     *         <code>ApiCallRateInsight</code>, the source event data store must log <code>write</code> management
     *         events. If the <code>InsightSelectors</code> includes an <code>InsightType</code> of <code>
     *         ApiErrorRateInsight</code>, the source event data store must log management events.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not exist.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail or event data
     *         store can't be updated.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @sample AWSCloudTrail.PutInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    PutInsightSelectorsResult putInsightSelectors(PutInsightSelectorsRequest putInsightSelectorsRequest);

    /**
     * <p>
     * Attaches a resource-based permission policy to a CloudTrail channel that is used for an integration with an event
     * source outside of Amazon Web Services. For more information about resource-based policies, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/security_iam_resource-based-policy-examples.html"
     * >CloudTrail resource-based policy examples</a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ResourceARNNotValidException
     *         This exception is thrown when the provided resource does not exist, or the ARN format of the resource is
     *         not valid. The following is the valid format for a resource ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel</code>.
     * @throws ResourcePolicyNotValidException
     *         This exception is thrown when the resouce-based policy has syntax errors, or contains a principal that is
     *         not valid. </p>
     *         <p>
     *         The following are requirements for the resource policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contains only one action: cloudtrail-data:PutAuditEvents
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contains at least one statement. The policy can have a maximum of 20 statements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each statement contains at least one principal. A statement can have a maximum of 50 principals.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not supported by CloudTrail.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutResourcePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Registers an organization’s member account as the CloudTrail <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-delegated-administrator.html"
     * >delegated administrator</a>.
     * </p>
     * 
     * @param registerOrganizationDelegatedAdminRequest
     *        Specifies an organization member account ID as a CloudTrail delegated administrator.
     * @return Result of the RegisterOrganizationDelegatedAdmin operation returned by the service.
     * @throws AccountRegisteredException
     *         This exception is thrown when the account is already registered as the CloudTrail delegated
     *         administrator.
     * @throws AccountNotFoundException
     *         This exception is thrown when the specified account is not found or not part of an organization.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws CannotDelegateManagementAccountException
     *         This exception is thrown when the management account of an organization is registered as the CloudTrail
     *         delegated administrator.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws DelegatedAdminAccountLimitExceededException
     *         This exception is thrown when the maximum number of CloudTrail delegated administrators is reached.
     * @throws NotOrganizationManagementAccountException
     *         This exception is thrown when the account making the request is not the organization's management
     *         account.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @sample AWSCloudTrail.RegisterOrganizationDelegatedAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RegisterOrganizationDelegatedAdmin"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterOrganizationDelegatedAdminResult registerOrganizationDelegatedAdmin(
            RegisterOrganizationDelegatedAdminRequest registerOrganizationDelegatedAdminRequest);

    /**
     * <p>
     * Removes the specified tags from a trail, event data store, or channel.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail, event data store, or channel.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the specified tag key or values are not valid. It can also occur if there
     *         are duplicate tags or too many tags on the resource.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws ChannelNotFoundException
     *         This exception is thrown when CloudTrail cannot find the specified channel.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.RemoveTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RemoveTags" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Restores a deleted event data store specified by <code>EventDataStore</code>, which accepts an event data store
     * ARN. You can only restore a deleted event data store within the seven-day wait period after deletion. Restoring
     * an event data store can take several minutes, depending on the size of the event data store.
     * </p>
     * 
     * @param restoreEventDataStoreRequest
     * @return Result of the RestoreEventDataStore operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws EventDataStoreMaxLimitExceededException
     *         Your account has used the maximum number of event data stores.
     * @throws InvalidEventDataStoreStatusException
     *         The event data store is not in a status that supports the operation.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @sample AWSCloudTrail.RestoreEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/RestoreEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreEventDataStoreResult restoreEventDataStore(RestoreEventDataStoreRequest restoreEventDataStoreRequest);

    /**
     * <p>
     * Starts the ingestion of live events on an event data store specified as either an ARN or the ID portion of the
     * ARN. To start ingestion, the event data store <code>Status</code> must be <code>STOPPED_INGESTION</code> and the
     * <code>eventCategory</code> must be <code>Management</code>, <code>Data</code>, or <code>ConfigurationItem</code>.
     * </p>
     * 
     * @param startEventDataStoreIngestionRequest
     * @return Result of the StartEventDataStoreIngestion operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventDataStoreStatusException
     *         The event data store is not in a status that supports the operation.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidEventDataStoreCategoryException
     *         This exception is thrown when event categories of specified event data stores are not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StartEventDataStoreIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartEventDataStoreIngestion"
     *      target="_top">AWS API Documentation</a>
     */
    StartEventDataStoreIngestionResult startEventDataStoreIngestion(StartEventDataStoreIngestionRequest startEventDataStoreIngestionRequest);

    /**
     * <p>
     * Starts an import of logged trail events from a source S3 bucket to a destination event data store. By default,
     * CloudTrail only imports events contained in the S3 bucket's <code>CloudTrail</code> prefix and the prefixes
     * inside the <code>CloudTrail</code> prefix, and does not check prefixes for other Amazon Web Services services. If
     * you want to import CloudTrail events contained in another prefix, you must include the prefix in the
     * <code>S3LocationUri</code>. For more considerations about importing trail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-copy-trail-to-lake.html#cloudtrail-trail-copy-considerations"
     * >Considerations</a>.
     * </p>
     * <p>
     * When you start a new import, the <code>Destinations</code> and <code>ImportSource</code> parameters are required.
     * Before starting a new import, disable any access control lists (ACLs) attached to the source S3 bucket. For more
     * information about disabling ACLs, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html">Controlling ownership of
     * objects and disabling ACLs for your bucket</a>.
     * </p>
     * <p>
     * When you retry an import, the <code>ImportID</code> parameter is required.
     * </p>
     * <note>
     * <p>
     * If the destination event data store is for an organization, you must use the management account to import trail
     * events. You cannot use the delegated administrator account for the organization.
     * </p>
     * </note>
     * 
     * @param startImportRequest
     * @return Result of the StartImport operation returned by the service.
     * @throws AccountHasOngoingImportException
     *         This exception is thrown when you start a new import and a previous import is still in progress.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventDataStoreStatusException
     *         The event data store is not in a status that supports the operation.
     * @throws InvalidEventDataStoreCategoryException
     *         This exception is thrown when event categories of specified event data stores are not valid.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidImportSourceException
     *         This exception is thrown when the provided source S3 bucket is not valid for import.
     * @throws ImportNotFoundException
     *         The specified import was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    StartImportResult startImport(StartImportRequest startImportRequest);

    /**
     * <p>
     * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is
     * enabled in all Regions, this operation must be called from the Region in which the trail was created. This
     * operation cannot be called on the shadow trails (replicated trails in other Regions) of a trail that is enabled
     * in all Regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging Amazon Web Services API calls for an account.
     * @return Result of the StartLogging operation returned by the service.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN:
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StartLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartLogging" target="_top">AWS API
     *      Documentation</a>
     */
    StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest);

    /**
     * <p>
     * Starts a CloudTrail Lake query. Use the <code>QueryStatement</code> parameter to provide your SQL query, enclosed
     * in single quotation marks. Use the optional <code>DeliveryS3Uri</code> parameter to deliver the query results to
     * an S3 bucket.
     * </p>
     * <p>
     * <code>StartQuery</code> requires you specify either the <code>QueryStatement</code> parameter, or a
     * <code>QueryAlias</code> and any <code>QueryParameters</code>. In the current release, the <code>QueryAlias</code>
     * and <code>QueryParameters</code> parameters are used only for the queries that populate the CloudTrail Lake
     * dashboards.
     * </p>
     * 
     * @param startQueryRequest
     * @return Result of the StartQuery operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidQueryStatementException
     *         The query that was submitted has validation errors, or uses incorrect syntax or unsupported keywords. For
     *         more information about writing a query, see <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-create-edit-query.html">Create or
     *         edit a query</a> in the <i>CloudTrail User Guide</i>.
     * @throws MaxConcurrentQueriesException
     *         You are already running the maximum number of concurrent queries. The maximum number of concurrent
     *         queries is 10. Wait a minute for some queries to finish, and then run the query again.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not valid.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not valid.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not sufficient.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not exist.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    StartQueryResult startQuery(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Stops the ingestion of live events on an event data store specified as either an ARN or the ID portion of the
     * ARN. To stop ingestion, the event data store <code>Status</code> must be <code>ENABLED</code> and the
     * <code>eventCategory</code> must be <code>Management</code>, <code>Data</code>, or <code>ConfigurationItem</code>.
     * </p>
     * 
     * @param stopEventDataStoreIngestionRequest
     * @return Result of the StopEventDataStoreIngestion operation returned by the service.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventDataStoreStatusException
     *         The event data store is not in a status that supports the operation.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws InvalidEventDataStoreCategoryException
     *         This exception is thrown when event categories of specified event data stores are not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StopEventDataStoreIngestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopEventDataStoreIngestion"
     *      target="_top">AWS API Documentation</a>
     */
    StopEventDataStoreIngestionResult stopEventDataStoreIngestion(StopEventDataStoreIngestionRequest stopEventDataStoreIngestionRequest);

    /**
     * <p>
     * Stops a specified import.
     * </p>
     * 
     * @param stopImportRequest
     * @return Result of the StopImport operation returned by the service.
     * @throws ImportNotFoundException
     *         The specified import was not found.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.StopImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopImport" target="_top">AWS API
     *      Documentation</a>
     */
    StopImportResult stopImport(StopImportRequest stopImportRequest);

    /**
     * <p>
     * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most
     * circumstances, there is no need to use this action. You can update a trail without stopping it first. This action
     * is the only way to stop recording. For a trail enabled in all Regions, this operation must be called from the
     * Region in which the trail was created, or an <code>InvalidHomeRegionException</code> will occur. This operation
     * cannot be called on the shadow trails (replicated trails in other Regions) of a trail enabled in all Regions.
     * </p>
     * 
     * @param stopLoggingRequest
     *        Passes the request to CloudTrail to stop logging Amazon Web Services API calls for the specified account.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StopLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopLogging" target="_top">AWS API
     *      Documentation</a>
     */
    StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest);

    /**
     * <p>
     * Updates a channel specified by a required channel ARN or UUID.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
     * @throws ChannelNotFoundException
     *         This exception is thrown when CloudTrail cannot find the specified channel.
     * @throws ChannelAlreadyExistsException
     *         This exception is thrown when the provided channel already exists.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventDataStoreCategoryException
     *         This exception is thrown when event categories of specified event data stores are not valid.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates an event data store. The required <code>EventDataStore</code> value is an ARN or the ID portion of the
     * ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws
     * an error. <code>RetentionPeriod</code> is in days, and valid values are integers between 7 and 3653 if the
     * <code>BillingMode</code> is set to <code>EXTENDABLE_RETENTION_PRICING</code>, or between 7 and 2557 if
     * <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>. By default,
     * <code>TerminationProtection</code> is enabled.
     * </p>
     * <p>
     * For event data stores for CloudTrail events, <code>AdvancedEventSelectors</code> includes or excludes management
     * or data events in your event data store. For more information about <code>AdvancedEventSelectors</code>, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/APIReference/API_AdvancedEventSelector.html">
     * AdvancedEventSelectors</a>.
     * </p>
     * <p>
     * For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence, or
     * non-Amazon Web Services events, <code>AdvancedEventSelectors</code> includes events of that type in your event
     * data store.
     * </p>
     * 
     * @param updateEventDataStoreRequest
     * @return Result of the UpdateEventDataStore operation returned by the service.
     * @throws EventDataStoreAlreadyExistsException
     *         An event data store with that name already exists.
     * @throws EventDataStoreARNInvalidException
     *         The specified event data store ARN is not valid or does not map to an event data store in your account.
     * @throws EventDataStoreNotFoundException
     *         The specified event data store was not found.
     * @throws InvalidEventSelectorsException
     *         This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of
     *         event selectors, advanced event selectors, or data resources that is not valid. The combination of event
     *         selectors or advanced event selectors and data resources is not valid. A trail can have up to 5 event
     *         selectors. If a trail uses advanced event selectors, a maximum of 500 total values for all conditions in
     *         all advanced event selectors is allowed. A trail is limited to 250 data resources. These data resources
     *         can be distributed across event selectors, but the overall total cannot exceed 250.</p>
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
     *         Specify up to 500 values for all conditions in all advanced event selectors for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter
     *         with a value of <code>read-only</code> is not valid.
     *         </p>
     *         </li>
     * @throws InvalidInsightSelectorsException
     *         For <code>PutInsightSelectors</code>, this exception is thrown when the formatting or syntax of the
     *         <code>InsightSelectors</code> JSON statement is not valid, or the specified <code>InsightType</code> in
     *         the <code>InsightSelectors</code> statement is not valid. Valid values for <code>InsightType</code> are
     *         <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code>. To enable Insights on an event data
     *         store, the destination event data store specified by the <code>InsightsDestination</code> parameter must
     *         log Insights events and the source event data store specified by the <code>EventDataStore</code>
     *         parameter must log management events.</p>
     *         <p>
     *         For <code>UpdateEventDataStore</code>, this exception is thrown if Insights are enabled on the event data
     *         store and the updated advanced event selectors are not compatible with the configured <code>
     *         InsightSelectors</code>. If the <code>InsightSelectors</code> includes an <code>InsightType</code> of
     *         <code>ApiCallRateInsight</code>, the source event data store must log <code>write</code> management
     *         events. If the <code>InsightSelectors</code> includes an <code>InsightType</code> of <code>
     *         ApiErrorRateInsight</code>, the source event data store must log management events.
     * @throws EventDataStoreHasOngoingImportException
     *         This exception is thrown when you try to update or delete an event data store that currently has an
     *         import in progress.
     * @throws InactiveEventDataStoreException
     *         The event data store is inactive.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same Region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same Region.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail or event data
     *         store can't be updated.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @sample AWSCloudTrail.UpdateEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventDataStoreResult updateEventDataStore(UpdateEventDataStoreRequest updateEventDataStoreRequest);

    /**
     * <p>
     * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail
     * do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery.
     * If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the
     * bucket. <code>UpdateTrail</code> must be called from the Region in which the trail was created; otherwise, an
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
     *         This exception is thrown when the policy on the Amazon SNS topic is not sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is not found.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is not valid.
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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws TrailNotProvidedException
     *         This exception is no longer in use.
     * @throws InvalidEventSelectorsException
     *         This exception is thrown when the <code>PutEventSelectors</code> operation is called with a number of
     *         event selectors, advanced event selectors, or data resources that is not valid. The combination of event
     *         selectors or advanced event selectors and data resources is not valid. A trail can have up to 5 event
     *         selectors. If a trail uses advanced event selectors, a maximum of 500 total values for all conditions in
     *         all advanced event selectors is allowed. A trail is limited to 250 data resources. These data resources
     *         can be distributed across event selectors, but the overall total cannot exceed 250.</p>
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
     *         Specify up to 500 values for all conditions in all advanced event selectors for a trail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter
     *         with a value of <code>read-only</code> is not valid.
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an ARN that is not valid.</p>
     *         <p>
     *         The following is the format of a trail ARN: <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail
     *         </code>
     *         </p>
     *         <p>
     *         The following is the format of an event data store ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:eventdatastore/EXAMPLE-f852-4e8f-8bd1-bcf6cEXAMPLE</code>
     *         </p>
     *         <p>
     *         The following is the format of a channel ARN: <code>
     *         arn:aws:cloudtrail:us-east-2:123456789012:channel/01234567890</code>
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource, or
     *         because another operation is modifying the resource. If this exception occurs, wait a few minutes, and
     *         then try the operation again.
     * @throws ThrottlingException
     *         This exception is thrown when the request rate exceeds the limit.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a Region other than the Region in
     *         which the trail was created.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same Region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same Region.
     * @throws KmsKeyDisabledException
     *         This exception is no longer in use.
     * @throws KmsException
     *         This exception is thrown when there is an issue with the specified KMS key and the trail or event data
     *         store can't be updated.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch Logs log group is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this Region.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws CloudTrailAccessNotEnabledException
     *         This exception is thrown when trusted access has not been enabled between CloudTrail and Organizations.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Enabling
     *         Trusted Access with Other Amazon Web Services Services</a> and <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a>.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM identity that is used to create the organization resource lacks one
     *         or more required permissions for creating an organization resource in a required service.
     * @throws OrganizationsNotInUseException
     *         This exception is thrown when the request is made from an Amazon Web Services account that is not a
     *         member of an organization. To make this request, sign in using the credentials of an account that belongs
     *         to an organization.
     * @throws NotOrganizationMasterAccountException
     *         This exception is thrown when the Amazon Web Services account making the request to create or update an
     *         organization trail or event data store is not the management account for an organization in
     *         Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/creating-an-organizational-trail-prepare.html"
     *         >Prepare For Creating a Trail For Your Organization</a> or <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html">Create an
     *         event data store</a>.
     * @throws OrganizationNotInAllFeaturesModeException
     *         This exception is thrown when Organizations is not configured to support all features. All features must
     *         be enabled in Organizations to support creating an organization trail or event data store.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @throws CloudTrailInvalidClientTokenIdException
     *         This exception is thrown when a call results in the <code>InvalidClientTokenId</code> error code. This
     *         can occur when you are creating or updating a trail to send notifications to an Amazon SNS topic that is
     *         in a suspended Amazon Web Services account.
     * @throws InvalidParameterException
     *         The request includes a parameter that is not valid.
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
