/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.cloudtrail.AWSCloudTrailClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.services.cloudtrail.model.transform.*;

/**
 * Client for accessing CloudTrail. All service calls made using this client are blocking, and will not return until the
 * service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudTrailClient extends AmazonWebServiceClient implements AWSCloudTrail {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudTrail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudtrail";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientDependencyServiceAccessPermissionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InsufficientDependencyServiceAccessPermissionExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreMaxLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreMaxLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreTerminationProtectedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreTerminationProtectedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKmsKeyIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidKmsKeyIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreARNInvalidException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreARNInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("QueryIdNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.QueryIdNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InactiveEventDataStoreException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InactiveEventDataStoreExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailNotProvidedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.TrailNotProvidedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidQueryStatusException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidQueryStatusExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCloudWatchLogsLogGroupArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidCloudWatchLogsLogGroupArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventDataStoreCategoryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidEventDataStoreCategoryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventCategoryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidEventCategoryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.KmsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationNotInAllFeaturesModeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.OrganizationNotInAllFeaturesModeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3BucketDoesNotExistException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.S3BucketDoesNotExistExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NoManagementAccountSLRExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.NoManagementAccountSLRExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CannotDelegateManagementAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.CannotDelegateManagementAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.TagsLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSnsTopicNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidSnsTopicNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotOrganizationMasterAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.NotOrganizationMasterAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsKeyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.KmsKeyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountRegisteredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.AccountRegisteredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.OperationNotPermittedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLookupAttributesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidLookupAttributesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountHasOngoingImportException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.AccountHasOngoingImportExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudTrailInvalidClientTokenIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.CloudTrailInvalidClientTokenIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationsNotInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.OrganizationsNotInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceTypeNotSupportedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ResourceTypeNotSupportedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsKeyDisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.KmsKeyDisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudTrailARNInvalidException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.CloudTrailARNInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCloudWatchLogsRoleArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidCloudWatchLogsRoleArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidQueryStatementException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidQueryStatementExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventSelectorsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidEventSelectorsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidTimeRangeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ChannelARNInvalidException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ChannelARNInvalidExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventDataStoreStatusException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidEventDataStoreStatusExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountNotRegisteredException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.AccountNotRegisteredExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ImportNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ImportNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.AccountNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidParameterCombinationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxResultsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidMaxResultsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudTrailAccessNotEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.CloudTrailAccessNotEnabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3BucketNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidS3BucketNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudWatchLogsDeliveryUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.CloudWatchLogsDeliveryUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InactiveQueryException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InactiveQueryExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTrailNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidTrailNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportSourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidImportSourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientEncryptionPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InsufficientEncryptionPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidTagParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.TrailNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DelegatedAdminAccountLimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.DelegatedAdminAccountLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumNumberOfTrailsExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.MaximumNumberOfTrailsExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EventDataStoreHasOngoingImportException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.EventDataStoreHasOngoingImportExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3PrefixException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidS3PrefixExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInsightSelectorsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidInsightSelectorsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDateRangeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidDateRangeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientSnsTopicPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InsufficientSnsTopicPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotOrganizationManagementAccountException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.NotOrganizationManagementAccountExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ChannelNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.ChannelNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxConcurrentQueriesException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.MaxConcurrentQueriesExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientS3BucketPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InsufficientS3BucketPolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidHomeRegionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InvalidHomeRegionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.TrailAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsightNotEnabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudtrail.model.transform.InsightNotEnabledExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudtrail.model.AWSCloudTrailException.class));

    /**
     * Constructs a new client to invoke service methods on CloudTrail. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCloudTrailClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCloudTrailClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudTrail (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCloudTrailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCloudTrailClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCloudTrailClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCloudTrailClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCloudTrailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudTrail (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCloudTrailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCloudTrailClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCloudTrailClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudTrail (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSCloudTrailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudTrail (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCloudTrailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCloudTrailClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCloudTrailClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCloudTrailClientBuilder builder() {
        return AWSCloudTrailClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudTrailClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCloudTrailClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloudtrail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudtrail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudtrail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds one or more tags to a trail or event data store, up to a limit of 50. Overwrites an existing tag's value
     * when a new value is specified for an existing tag key. Tag key names must be unique for a trail; you cannot have
     * two keys with the same name but different values. If you specify a key without a value, the tag will be created
     * with the specified key and a value of null. You can tag a trail or event data store that applies to all Amazon
     * Web Services Regions only from the Region in which the trail or event data store was created (also known as its
     * home region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail or event data store.
     * @return Result of the AddTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
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
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource. If this
     *         exception occurs, wait a few minutes, and then try the operation again.
     * @sample AWSCloudTrail.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest request) {
        request = beforeClientExecution(request);
        return executeAddTags(request);
    }

    @SdkInternalApi
    final AddTagsResult executeAddTags(AddTagsRequest addTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource. If this
     *         exception occurs, wait a few minutes, and then try the operation again.
     * @sample AWSCloudTrail.CancelQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CancelQuery" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelQueryResult cancelQuery(CancelQueryRequest request) {
        request = beforeClientExecution(request);
        return executeCancelQuery(request);
    }

    @SdkInternalApi
    final CancelQueryResult executeCancelQuery(CancelQueryRequest cancelQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelQueryRequest> request = null;
        Response<CancelQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource. If this
     *         exception occurs, wait a few minutes, and then try the operation again.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS key does not have sufficient permissions
     *         for the operation.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same region.
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public CreateEventDataStoreResult createEventDataStore(CreateEventDataStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventDataStore(request);
    }

    @SdkInternalApi
    final CreateEventDataStoreResult executeCreateEventDataStore(CreateEventDataStoreRequest createEventDataStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventDataStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventDataStoreRequest> request = null;
        Response<CreateEventDataStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventDataStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEventDataStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventDataStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventDataStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEventDataStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         The number of tags per trail has exceeded the permitted amount. Currently, the limit is 50.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same region.
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
     *         Cannot set a CloudWatch Logs delivery for this region.
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource. If this
     *         exception occurs, wait a few minutes, and then try the operation again.
     * @sample AWSCloudTrail.CreateTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateTrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTrailResult createTrail(CreateTrailRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTrail(request);
    }

    @SdkInternalApi
    final CreateTrailResult executeCreateTrail(CreateTrailRequest createTrailRequest) {

        ExecutionContext executionContext = createExecutionContext(createTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrailRequest> request = null;
        Response<CreateTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the event data store specified by <code>EventDataStore</code>, which accepts an event data store ARN.
     * After you run <code>DeleteEventDataStore</code>, the event data store enters a <code>PENDING_DELETION</code>
     * state, and is automatically deleted after a wait period of seven days. <code>TerminationProtectionEnabled</code>
     * must be set to <code>False</code> on the event data store; this operation cannot work if
     * <code>TerminationProtectionEnabled</code> is <code>True</code>.
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
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.DeleteEventDataStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteEventDataStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventDataStoreResult deleteEventDataStore(DeleteEventDataStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventDataStore(request);
    }

    @SdkInternalApi
    final DeleteEventDataStoreResult executeDeleteEventDataStore(DeleteEventDataStoreRequest deleteEventDataStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventDataStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventDataStoreRequest> request = null;
        Response<DeleteEventDataStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventDataStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventDataStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventDataStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventDataStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventDataStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         <code>my--namespace</code> are not valid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not be in IP address format (for example, 192.168.5.4)
     *         </p>
     *         </li>
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
     * @throws ConflictException
     *         This exception is thrown when the specified resource is not ready for an operation. This can occur when
     *         you try to run an operation on a resource before CloudTrail has time to fully load the resource. If this
     *         exception occurs, wait a few minutes, and then try the operation again.
     * @sample AWSCloudTrail.DeleteTrail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DeleteTrail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTrailResult deleteTrail(DeleteTrailRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTrail(request);
    }

    @SdkInternalApi
    final DeleteTrailResult executeDeleteTrail(DeleteTrailRequest deleteTrailRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrailRequest> request = null;
        Response<DeleteTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         This exception is thrown when when the specified account is not found or not part of an organization.
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
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public DeregisterOrganizationDelegatedAdminResult deregisterOrganizationDelegatedAdmin(DeregisterOrganizationDelegatedAdminRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterOrganizationDelegatedAdmin(request);
    }

    @SdkInternalApi
    final DeregisterOrganizationDelegatedAdminResult executeDeregisterOrganizationDelegatedAdmin(
            DeregisterOrganizationDelegatedAdminRequest deregisterOrganizationDelegatedAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterOrganizationDelegatedAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterOrganizationDelegatedAdminRequest> request = null;
        Response<DeregisterOrganizationDelegatedAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterOrganizationDelegatedAdminRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterOrganizationDelegatedAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterOrganizationDelegatedAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterOrganizationDelegatedAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterOrganizationDelegatedAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about a query, including query run time in milliseconds, number of events scanned and matched,
     * and query status. You must specify an ARN for <code>EventDataStore</code>, and a value for <code>QueryID</code>.
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
    @Override
    public DescribeQueryResult describeQuery(DescribeQueryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeQuery(request);
    }

    @SdkInternalApi
    final DescribeQueryResult executeDescribeQuery(DescribeQueryRequest describeQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeQueryRequest> request = null;
        Response<DescribeQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves settings for one or more trails associated with the current region for your account.
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
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.DescribeTrails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DescribeTrails" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTrailsResult describeTrails(DescribeTrailsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTrails(request);
    }

    @SdkInternalApi
    final DescribeTrailsResult executeDescribeTrails(DescribeTrailsRequest describeTrailsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTrailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrailsRequest> request = null;
        Response<DescribeTrailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTrailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTrails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTrailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTrailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTrailsResult describeTrails() {
        return describeTrails(new DescribeTrailsRequest());
    }

    /**
     * <p>
     * Returns information about a specific channel. Amazon Web Services services create service-linked channels to get
     * information about CloudTrail events on your behalf. For more information about service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ChannelARNInvalidException
     *         This exception is thrown when the specified value of <code>ChannelARN</code> is not valid.
     * @throws ChannelNotFoundException
     *         The specified channel was not found.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @sample AWSCloudTrail.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChannelResult getChannel(GetChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannel(request);
    }

    @SdkInternalApi
    final GetChannelResult executeGetChannel(GetChannelRequest getChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelRequest> request = null;
        Response<GetChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetEventDataStoreResult getEventDataStore(GetEventDataStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventDataStore(request);
    }

    @SdkInternalApi
    final GetEventDataStoreResult executeGetEventDataStore(GetEventDataStoreRequest getEventDataStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventDataStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventDataStoreRequest> request = null;
        Response<GetEventDataStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventDataStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventDataStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventDataStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventDataStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventDataStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * >Logging management events for trails </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html">
     * Logging data events for trails </a>
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
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
    @Override
    public GetEventSelectorsResult getEventSelectors(GetEventSelectorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetEventSelectors(request);
    }

    @SdkInternalApi
    final GetEventSelectorsResult executeGetEventSelectors(GetEventSelectorsRequest getEventSelectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getEventSelectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEventSelectorsRequest> request = null;
        Response<GetEventSelectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEventSelectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEventSelectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEventSelectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEventSelectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEventSelectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetImportResult getImport(GetImportRequest request) {
        request = beforeClientExecution(request);
        return executeGetImport(request);
    }

    @SdkInternalApi
    final GetImportResult executeGetImport(GetImportRequest getImportRequest) {

        ExecutionContext executionContext = createExecutionContext(getImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetImportRequest> request = null;
        Response<GetImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetImportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the settings for the Insights event selectors that you configured for your trail.
     * <code>GetInsightSelectors</code> shows if CloudTrail Insights event logging is enabled on the trail, and if it
     * is, which insight types are enabled. If you run <code>GetInsightSelectors</code> on a trail that does not have
     * Insights events enabled, the operation throws the exception <code>InsightNotEnabledException</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-insights-events-with-cloudtrail.html"
     * >Logging CloudTrail Insights Events for Trails </a> in the <i>CloudTrail User Guide</i>.
     * </p>
     * 
     * @param getInsightSelectorsRequest
     * @return Result of the GetInsightSelectors operation returned by the service.
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not permitted.
     * @throws InsightNotEnabledException
     *         If you run <code>GetInsightSelectors</code> on a trail that does not have Insights events enabled, the
     *         operation throws the exception <code>InsightNotEnabledException</code>.
     * @throws NoManagementAccountSLRExistsException
     *         This exception is thrown when the management account does not have a service-linked role.
     * @sample AWSCloudTrail.GetInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInsightSelectorsResult getInsightSelectors(GetInsightSelectorsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInsightSelectors(request);
    }

    @SdkInternalApi
    final GetInsightSelectorsResult executeGetInsightSelectors(GetInsightSelectorsRequest getInsightSelectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInsightSelectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInsightSelectorsRequest> request = null;
        Response<GetInsightSelectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInsightSelectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInsightSelectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInsightSelectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInsightSelectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInsightSelectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets event data results of a query. You must specify the <code>QueryID</code> value returned by the
     * <code>StartQuery</code> operation, and an ARN for <code>EventDataStore</code>.
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
    @Override
    public GetQueryResultsResult getQueryResults(GetQueryResultsRequest request) {
        request = beforeClientExecution(request);
        return executeGetQueryResults(request);
    }

    @SdkInternalApi
    final GetQueryResultsResult executeGetQueryResults(GetQueryResultsRequest getQueryResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(getQueryResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetQueryResultsRequest> request = null;
        Response<GetQueryResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetQueryResultsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getQueryResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetQueryResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetQueryResultsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetQueryResultsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns settings information for a specified trail.
     * </p>
     * 
     * @param getTrailRequest
     * @return Result of the GetTrail operation returned by the service.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
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
    @Override
    public GetTrailResult getTrail(GetTrailRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrail(request);
    }

    @SdkInternalApi
    final GetTrailResult executeGetTrail(GetTrailRequest getTrailRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrailRequest> request = null;
        Response<GetTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrailResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
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
    @Override
    public GetTrailStatusResult getTrailStatus(GetTrailStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetTrailStatus(request);
    }

    @SdkInternalApi
    final GetTrailStatusResult executeGetTrailStatus(GetTrailStatusRequest getTrailStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getTrailStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrailStatusRequest> request = null;
        Response<GetTrailStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrailStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTrailStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTrailStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTrailStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTrailStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the channels in the current account, and their source names. Amazon Web Services services create
     * service-linked channels get information about CloudTrail events on your behalf. For more information about
     * service-linked channels, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/viewing-service-linked-channels.html">Viewing
     * service-linked channels for CloudTrail by using the CLI</a>.
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
    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannels(request);
    }

    @SdkInternalApi
    final ListChannelsResult executeListChannels(ListChannelsRequest listChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all event data stores in the account, in the current region.
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
    @Override
    public ListEventDataStoresResult listEventDataStores(ListEventDataStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListEventDataStores(request);
    }

    @SdkInternalApi
    final ListEventDataStoresResult executeListEventDataStores(ListEventDataStoresRequest listEventDataStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventDataStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventDataStoresRequest> request = null;
        Response<ListEventDataStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventDataStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventDataStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventDataStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventDataStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEventDataStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     * @sample AWSCloudTrail.ListImportFailures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/ListImportFailures" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListImportFailuresResult listImportFailures(ListImportFailuresRequest request) {
        request = beforeClientExecution(request);
        return executeListImportFailures(request);
    }

    @SdkInternalApi
    final ListImportFailuresResult executeListImportFailures(ListImportFailuresRequest listImportFailuresRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportFailuresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportFailuresRequest> request = null;
        Response<ListImportFailuresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportFailuresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImportFailuresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImportFailures");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImportFailuresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImportFailuresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListImportsResult listImports(ListImportsRequest request) {
        request = beforeClientExecution(request);
        return executeListImports(request);
    }

    @SdkInternalApi
    final ListImportsResult executeListImports(ListImportsRequest listImportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportsRequest> request = null;
        Response<ListImportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listImportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListImportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListImportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest files within the specified time range.
     * The public key is needed to validate digest files that were signed with its corresponding private key.
     * </p>
     * <note>
     * <p>
     * CloudTrail uses different private and public key pairs per region. Each digest file is signed with a private key
     * unique to its region. When you validate a digest file from a specific region, you must look in the same region
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
    @Override
    public ListPublicKeysResult listPublicKeys(ListPublicKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListPublicKeys(request);
    }

    @SdkInternalApi
    final ListPublicKeysResult executeListPublicKeys(ListPublicKeysRequest listPublicKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listPublicKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPublicKeysRequest> request = null;
        Response<ListPublicKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPublicKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPublicKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPublicKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPublicKeysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPublicKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPublicKeysResult listPublicKeys() {
        return listPublicKeys(new ListPublicKeysRequest());
    }

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
    @Override
    public ListQueriesResult listQueries(ListQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListQueries(request);
    }

    @SdkInternalApi
    final ListQueriesResult executeListQueries(ListQueriesRequest listQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListQueriesRequest> request = null;
        Response<ListQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for the trail or event data store in the current region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of tags to return.
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
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
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTrailsResult listTrails(ListTrailsRequest request) {
        request = beforeClientExecution(request);
        return executeListTrails(request);
    }

    @SdkInternalApi
    final ListTrailsResult executeListTrails(ListTrailsRequest listTrailsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTrailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrailsRequest> request = null;
        Response<ListTrailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrailsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTrailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTrails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTrailsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTrailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Looks up <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-management-events"
     * >management events</a> or <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-concepts.html#cloudtrail-concepts-insights-events"
     * >CloudTrail Insights events</a> that are captured by CloudTrail. You can look up events that occurred in a region
     * within the last 90 days. Lookup supports the following attributes for management events:
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
     * The rate of lookup requests is limited to two per second, per account, per region. If this limit is exceeded, a
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
    @Override
    public LookupEventsResult lookupEvents(LookupEventsRequest request) {
        request = beforeClientExecution(request);
        return executeLookupEvents(request);
    }

    @SdkInternalApi
    final LookupEventsResult executeLookupEvents(LookupEventsRequest lookupEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(lookupEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupEventsRequest> request = null;
        Response<LookupEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(lookupEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LookupEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LookupEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new LookupEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public LookupEventsResult lookupEvents() {
        return lookupEvents(new LookupEventsRequest());
    }

    /**
     * <p>
     * Configures an event selector or advanced event selectors for your trail. Use event selectors or advanced event
     * selectors to specify management and data event settings for your trail. By default, trails created without
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
     * The <code>PutEventSelectors</code> operation must be called from the region in which the trail was created;
     * otherwise, an <code>InvalidHomeRegionException</code> exception is thrown.
     * </p>
     * <p>
     * You can configure up to five event selectors for each trail. For more information, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html"
     * >Logging management events for trails </a>, <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html"
     * >Logging data events for trails </a>, and <a
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
     * data events for trails</a> in the <i>CloudTrail User Guide</i>.
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.PutEventSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutEventSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutEventSelectorsResult putEventSelectors(PutEventSelectorsRequest request) {
        request = beforeClientExecution(request);
        return executePutEventSelectors(request);
    }

    @SdkInternalApi
    final PutEventSelectorsResult executePutEventSelectors(PutEventSelectorsRequest putEventSelectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(putEventSelectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutEventSelectorsRequest> request = null;
        Response<PutEventSelectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutEventSelectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putEventSelectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutEventSelectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutEventSelectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutEventSelectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lets you enable Insights event logging by specifying the Insights selectors that you want to enable on an
     * existing trail. You also use <code>PutInsightSelectors</code> to turn off Insights event logging, by passing an
     * empty list of insight types. The valid Insights event types in this release are <code>ApiErrorRateInsight</code>
     * and <code>ApiCallRateInsight</code>.
     * </p>
     * 
     * @param putInsightSelectorsRequest
     * @return Result of the PutInsightSelectors operation returned by the service.
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws InvalidInsightSelectorsException
     *         The formatting or syntax of the <code>InsightSelectors</code> JSON statement in your <code>
     *         PutInsightSelectors</code> or <code>GetInsightSelectors</code> request is not valid, or the specified
     *         insight type in the <code>InsightSelectors</code> statement is not a valid insight type.
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
     * @sample AWSCloudTrail.PutInsightSelectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/PutInsightSelectors" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutInsightSelectorsResult putInsightSelectors(PutInsightSelectorsRequest request) {
        request = beforeClientExecution(request);
        return executePutInsightSelectors(request);
    }

    @SdkInternalApi
    final PutInsightSelectorsResult executePutInsightSelectors(PutInsightSelectorsRequest putInsightSelectorsRequest) {

        ExecutionContext executionContext = createExecutionContext(putInsightSelectorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInsightSelectorsRequest> request = null;
        Response<PutInsightSelectorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInsightSelectorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putInsightSelectorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInsightSelectors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInsightSelectorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutInsightSelectorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an organization’s member account as the CloudTrail delegated administrator.
     * </p>
     * 
     * @param registerOrganizationDelegatedAdminRequest
     *        Specifies an organization member account ID as a CloudTrail delegated administrator.
     * @return Result of the RegisterOrganizationDelegatedAdmin operation returned by the service.
     * @throws AccountRegisteredException
     *         This exception is thrown when the account is already registered as the CloudTrail delegated
     *         administrator.
     * @throws AccountNotFoundException
     *         This exception is thrown when when the specified account is not found or not part of an organization.
     * @throws InsufficientDependencyServiceAccessPermissionException
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public RegisterOrganizationDelegatedAdminResult registerOrganizationDelegatedAdmin(RegisterOrganizationDelegatedAdminRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterOrganizationDelegatedAdmin(request);
    }

    @SdkInternalApi
    final RegisterOrganizationDelegatedAdminResult executeRegisterOrganizationDelegatedAdmin(
            RegisterOrganizationDelegatedAdminRequest registerOrganizationDelegatedAdminRequest) {

        ExecutionContext executionContext = createExecutionContext(registerOrganizationDelegatedAdminRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterOrganizationDelegatedAdminRequest> request = null;
        Response<RegisterOrganizationDelegatedAdminResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterOrganizationDelegatedAdminRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerOrganizationDelegatedAdminRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterOrganizationDelegatedAdmin");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterOrganizationDelegatedAdminResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterOrganizationDelegatedAdminResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tags from a trail or event data store.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail or event data store.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
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
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTags(request);
    }

    @SdkInternalApi
    final RemoveTagsResult executeRemoveTags(RemoveTagsRequest removeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new RemoveTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public RestoreEventDataStoreResult restoreEventDataStore(RestoreEventDataStoreRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreEventDataStore(request);
    }

    @SdkInternalApi
    final RestoreEventDataStoreResult executeRestoreEventDataStore(RestoreEventDataStoreRequest restoreEventDataStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreEventDataStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreEventDataStoreRequest> request = null;
        Response<RestoreEventDataStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreEventDataStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreEventDataStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreEventDataStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreEventDataStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new RestoreEventDataStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StartImportResult startImport(StartImportRequest request) {
        request = beforeClientExecution(request);
        return executeStartImport(request);
    }

    @SdkInternalApi
    final StartImportResult executeStartImport(StartImportRequest startImportRequest) {

        ExecutionContext executionContext = createExecutionContext(startImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartImportRequest> request = null;
        Response<StartImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the recording of Amazon Web Services API calls and log file delivery for a trail. For a trail that is
     * enabled in all regions, this operation must be called from the region in which the trail was created. This
     * operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled
     * in all regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging Amazon Web Services API calls for an account.
     * @return Result of the StartLogging operation returned by the service.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
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
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StartLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StartLogging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartLoggingResult startLogging(StartLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeStartLogging(request);
    }

    @SdkInternalApi
    final StartLoggingResult executeStartLogging(StartLoggingRequest startLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(startLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLoggingRequest> request = null;
        Response<StartLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLoggingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartLoggingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartLoggingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a CloudTrail Lake query. The required <code>QueryStatement</code> parameter provides your SQL query,
     * enclosed in single quotation marks. Use the optional <code>DeliveryS3Uri</code> parameter to deliver the query
     * results to an S3 bucket.
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
     *         You are already running the maximum number of concurrent queries. Wait a minute for some queries to
     *         finish, and then run the query again.
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
    @Override
    public StartQueryResult startQuery(StartQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStartQuery(request);
    }

    @SdkInternalApi
    final StartQueryResult executeStartQuery(StartQueryRequest startQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(startQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartQueryRequest> request = null;
        Response<StartQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartQueryResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public StopImportResult stopImport(StopImportRequest request) {
        request = beforeClientExecution(request);
        return executeStopImport(request);
    }

    @SdkInternalApi
    final StopImportResult executeStopImport(StopImportRequest stopImportRequest) {

        ExecutionContext executionContext = createExecutionContext(stopImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopImportRequest> request = null;
        Response<StopImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopImportResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends the recording of Amazon Web Services API calls and log file delivery for the specified trail. Under most
     * circumstances, there is no need to use this action. You can update a trail without stopping it first. This action
     * is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the
     * region in which the trail was created, or an <code>InvalidHomeRegionException</code> will occur. This operation
     * cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
     * @sample AWSCloudTrail.StopLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/StopLogging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopLoggingResult stopLogging(StopLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeStopLogging(request);
    }

    @SdkInternalApi
    final StopLoggingResult executeStopLogging(StopLoggingRequest stopLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(stopLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLoggingRequest> request = null;
        Response<StopLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLoggingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopLoggingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopLoggingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an event data store. The required <code>EventDataStore</code> value is an ARN or the ID portion of the
     * ARN. Other parameters are optional, but at least one optional parameter must be specified, or CloudTrail throws
     * an error. <code>RetentionPeriod</code> is in days, and valid values are integers between 90 and 2557. By default,
     * <code>TerminationProtection</code> is enabled. <code>AdvancedEventSelectors</code> includes or excludes
     * management and data events in your event data store; for more information about
     * <code>AdvancedEventSelectors</code>, see <a>PutEventSelectorsRequest$AdvancedEventSelectors</a>.
     * </p>
     * 
     * @param updateEventDataStoreRequest
     * @return Result of the UpdateEventDataStore operation returned by the service.
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
     *         the same region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same region.
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public UpdateEventDataStoreResult updateEventDataStore(UpdateEventDataStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEventDataStore(request);
    }

    @SdkInternalApi
    final UpdateEventDataStoreResult executeUpdateEventDataStore(UpdateEventDataStoreRequest updateEventDataStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEventDataStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEventDataStoreRequest> request = null;
        Response<UpdateEventDataStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEventDataStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEventDataStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEventDataStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEventDataStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEventDataStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates trail settings that control what events you are logging, and how to handle log files. Changes to a trail
     * do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery.
     * If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the
     * bucket. <code>UpdateTrail</code> must be called from the region in which the trail was created; otherwise, an
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
     *         This exception is thrown when an operation is called with a trail ARN that is not valid. The following is
     *         the format of a trail ARN.</p>
     *         <p>
     *         <code>arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail</code>
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters provided is not valid.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail from a region other than the region in
     *         which the trail was created.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, when the S3 bucket and the KMS key are not in
     *         the same region, or when the KMS key associated with the Amazon SNS topic either does not exist or is not
     *         in the same region.
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
     *         Cannot set a CloudWatch Logs delivery for this region.
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
     *         This exception is thrown when the IAM user or role that is used to create the organization resource lacks
     *         one or more required permissions for creating an organization resource in a required service.
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
    @Override
    public UpdateTrailResult updateTrail(UpdateTrailRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTrail(request);
    }

    @SdkInternalApi
    final UpdateTrailResult executeUpdateTrail(UpdateTrailRequest updateTrailRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrailRequest> request = null;
        Response<UpdateTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudTrail");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTrail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateTrailResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateTrailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
