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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTokenException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudTrailARNInvalidException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.CloudTrailARNInvalidException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientDependencyServiceAccessPermissionException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InsufficientDependencyServiceAccessPermissionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCloudWatchLogsRoleArnException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidCloudWatchLogsRoleArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKmsKeyIdException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidKmsKeyIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTimeRangeException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidTimeRangeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidEventSelectorsException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidEventSelectorsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.UnsupportedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailNotProvidedException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.TrailNotProvidedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCloudWatchLogsLogGroupArnException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidCloudWatchLogsLogGroupArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.KmsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationNotInAllFeaturesModeException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.OrganizationNotInAllFeaturesModeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("S3BucketDoesNotExistException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.S3BucketDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterCombinationException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidParameterCombinationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMaxResultsException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidMaxResultsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagsLimitExceededException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.TagsLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3BucketNameException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidS3BucketNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudWatchLogsDeliveryUnavailableException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.CloudWatchLogsDeliveryUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudTrailAccessNotEnabledException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.CloudTrailAccessNotEnabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTrailNameException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidTrailNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSnsTopicNameException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidSnsTopicNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientEncryptionPolicyException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InsufficientEncryptionPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotOrganizationMasterAccountException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.NotOrganizationMasterAccountException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagParameterException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidTagParameterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsKeyNotFoundException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.KmsKeyNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.OperationNotPermittedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailNotFoundException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.TrailNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidLookupAttributesException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidLookupAttributesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaximumNumberOfTrailsExceededException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.MaximumNumberOfTrailsExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidS3PrefixException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidS3PrefixException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientSnsTopicPolicyException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InsufficientSnsTopicPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OrganizationsNotInUseException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.OrganizationsNotInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientS3BucketPolicyException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidHomeRegionException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.InvalidHomeRegionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceTypeNotSupportedException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.ResourceTypeNotSupportedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TrailAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.TrailAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KmsKeyDisabledException").withModeledClass(
                                    com.amazonaws.services.cloudtrail.model.KmsKeyDisabledException.class))
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

}
