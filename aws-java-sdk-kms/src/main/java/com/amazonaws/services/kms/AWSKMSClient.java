/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms;

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
import com.amazonaws.services.kms.AWSKMSClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.services.kms.model.transform.*;

/**
 * Client for accessing KMS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web service. This guide describes the AWS
 * KMS operations that you can call programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS KMS and other
 * AWS services. For example, the SDKs take care of tasks such as signing requests (see below), managing errors, and
 * retrying requests automatically. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS 1.2. Clients must also support cipher
 * suites with Perfect Forward Secrecy (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We strongly recommend that you <i>do
 * not</i> use your AWS account (root) access key ID and secret key for everyday work with AWS KMS. Instead, use the
 * access key ID and secret access key for an IAM user, or you can use the AWS Security Token Service to generate
 * temporary security credentials that you can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and related events for your AWS account and
 * delivers them to an Amazon S3 bucket that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a> -
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security Credentials</a>
 * - This section of the <i>IAM User Guide</i> describes how to create and use temporary security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a> - This set of topics walks you through the process of signing a request using an access key ID and a
 * secret access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful for most applications. You will likely
 * perform actions other than these, such as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>Encrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Decrypt</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKey</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GenerateDataKeyWithoutPlaintext</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSKMSClient extends AmazonWebServiceClient implements AWSKMS {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSKMS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kms";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredImportTokenException").withModeledClass(
                                    com.amazonaws.services.kms.model.ExpiredImportTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withModeledClass(
                                    com.amazonaws.services.kms.model.MalformedPolicyDocumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectKeyMaterialException").withModeledClass(
                                    com.amazonaws.services.kms.model.IncorrectKeyMaterialException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportTokenException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidImportTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateException").withModeledClass(
                                    com.amazonaws.services.kms.model.KMSInvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledException").withModeledClass(
                                    com.amazonaws.services.kms.model.DisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.kms.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KeyUnavailableException").withModeledClass(
                                    com.amazonaws.services.kms.model.KeyUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.kms.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCiphertextException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidCiphertextException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantIdException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidGrantIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantTokenException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidGrantTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withModeledClass(
                                    com.amazonaws.services.kms.model.UnsupportedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.kms.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagException").withModeledClass(com.amazonaws.services.kms.model.TagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKeyUsageException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidKeyUsageException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMarkerException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidMarkerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAliasNameException").withModeledClass(
                                    com.amazonaws.services.kms.model.InvalidAliasNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyTimeoutException").withModeledClass(
                                    com.amazonaws.services.kms.model.DependencyTimeoutException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInternalException").withModeledClass(
                                    com.amazonaws.services.kms.model.KMSInternalException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.kms.model.AWSKMSException.class));

    /**
     * Constructs a new client to invoke service methods on KMS. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     * @deprecated use {@link AWSKMSClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSKMSClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSKMSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSKMSClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSKMSClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSKMSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSKMSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSKMSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSKMSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSKMSClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSKMSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to KMS (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSKMSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSKMSClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSKMSClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AWSKMSClientBuilder builder() {
        return AWSKMSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSKMSClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://kms.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/kms/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/kms/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the
     * <code>Disabled</code> state. To enable a CMK, use <a>EnableKey</a>. You cannot perform this operation on a CMK in
     * a different AWS account.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return Result of the CancelKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CancelKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CancelKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelKeyDeletionResult cancelKeyDeletion(CancelKeyDeletionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelKeyDeletion(request);
    }

    @SdkInternalApi
    final CancelKeyDeletionResult executeCancelKeyDeletion(CancelKeyDeletionRequest cancelKeyDeletionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelKeyDeletionRequest> request = null;
        Response<CancelKeyDeletionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelKeyDeletionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelKeyDeletionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelKeyDeletionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelKeyDeletionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a display name for a customer master key (CMK). You can use an alias to identify a CMK in selected
     * operations, such as <a>Encrypt</a> and <a>GenerateDataKey</a>.
     * </p>
     * <p>
     * Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the
     * AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to
     * a different CMK in each region.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the
     * CMK. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get the aliases of all
     * CMKs, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * An alias must start with the word <code>alias</code> followed by a forward slash (<code>alias/</code>). The alias
     * name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names
     * cannot begin with <code>aws</code>; that alias name prefix is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform
     * this operation on an alias in a different AWS account.
     * </p>
     * <p>
     * To map an existing alias to a different CMK, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws AlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidAliasNameException
     *         The request was rejected because the specified alias name is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAlias(request);
    }

    @SdkInternalApi
    final CreateAliasResult executeCreateAlias(CreateAliasRequest createAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions.
     * When setting permissions, grants are an alternative to key policies.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId
     * parameter. For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants</a> in the <i>AWS Key Management
     * Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @return Result of the CreateGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateGrant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateGrantResult createGrant(CreateGrantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGrant(request);
    }

    @SdkInternalApi
    final CreateGrantResult executeCreateGrant(CreateGrantRequest createGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(createGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantRequest> request = null;
        Response<CreateGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a customer master key (CMK) in the caller's AWS account.
     * </p>
     * <p>
     * You can use a CMK to encrypt small amounts of data (4 KiB or less) directly, but CMKs are more commonly used to
     * encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the
     * difference between CMKs and DEKs, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <a>GenerateDataKey</a> operation
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html">AWS Key Management Service
     * Concepts</a> in the <i>AWS Key Management Service Developer Guide</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You cannot use this operation to create a CMK in a different AWS account.
     * </p>
     * 
     * @param createKeyRequest
     * @return Result of the CreateKey operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @sample AWSKMS.CreateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKeyResult createKey(CreateKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKey(request);
    }

    @SdkInternalApi
    final CreateKeyResult executeCreateKey(CreateKeyRequest createKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyRequest> request = null;
        Response<CreateKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateKeyResult createKey() {
        return createKey(new CreateKeyRequest());
    }

    /**
     * <p>
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following
     * operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateDataKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if a caller has been granted access permissions to all keys (through, for example, IAM user policies
     * that grant <code>Decrypt</code> permission on all resources), then ciphertext encrypted by using keys in other
     * accounts where the key grants access to the caller can be decrypted. To remedy this, we recommend that you do not
     * grant <code>Decrypt</code> access in an IAM user policy. Instead grant <code>Decrypt</code> access only in key
     * policies. If you must grant <code>Decrypt</code> access in an IAM user policy, you should scope the resource to
     * specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @return Result of the Decrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext, or additional authenticated data incorporated
     *         into the ciphertext, such as the encryption context, is corrupted, missing, or otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. The request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Decrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Decrypt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DecryptResult decrypt(DecryptRequest request) {
        request = beforeClientExecution(request);
        return executeDecrypt(request);
    }

    @SdkInternalApi
    final DecryptResult executeDecrypt(DecryptRequest decryptRequest) {

        ExecutionContext executionContext = createExecutionContext(decryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecryptRequest> request = null;
        Response<DecryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecryptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(decryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DecryptResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DecryptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the
     * CMK. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get the aliases of all
     * CMKs, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * Each CMK can have multiple aliases. To change the alias of a CMK, use <a>DeleteAlias</a> to delete the current
     * alias and <a>CreateAlias</a> to create a new alias. To associate an existing alias with a different customer
     * master key (CMK), call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAliasResult deleteAlias(DeleteAliasRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAlias(request);
    }

    @SdkInternalApi
    final DeleteAliasResult executeDeleteAlias(DeleteAliasRequest deleteAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<DeleteAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK)
     * unusable. For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>. You cannot perform this operation on a CMK in a different AWS
     * account.
     * </p>
     * <p>
     * When the specified CMK is in the <code>PendingDeletion</code> state, this operation does not change the CMK's
     * state. Otherwise, it changes the CMK's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to reimport the same key material into the
     * CMK.
     * </p>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @return Result of the DeleteImportedKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DeleteImportedKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteImportedKeyMaterial" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteImportedKeyMaterialResult deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteImportedKeyMaterial(request);
    }

    @SdkInternalApi
    final DeleteImportedKeyMaterialResult executeDeleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest deleteImportedKeyMaterialRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteImportedKeyMaterialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteImportedKeyMaterialRequest> request = null;
        Response<DeleteImportedKeyMaterialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteImportedKeyMaterialRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteImportedKeyMaterialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteImportedKeyMaterialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteImportedKeyMaterialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides detailed information about the specified customer master key (CMK).
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
     * the KeyId parameter.
     * </p>
     * 
     * @param describeKeyRequest
     * @return Result of the DescribeKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.DescribeKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeKeyResult describeKey(DescribeKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeKey(request);
    }

    @SdkInternalApi
    final DescribeKeyResult executeDescribeKey(DescribeKeyRequest describeKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyRequest> request = null;
        Response<DescribeKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic
     * operations. You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @return Result of the DisableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DisableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableKeyResult disableKey(DisableKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDisableKey(request);
    }

    @SdkInternalApi
    final DisableKeyResult executeDisableKey(DisableKeyRequest disableKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(disableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRequest> request = null;
        Response<DisableKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform
     * this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @return Result of the DisableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AWSKMS.DisableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableKeyRotationResult disableKeyRotation(DisableKeyRotationRequest request) {
        request = beforeClientExecution(request);
        return executeDisableKeyRotation(request);
    }

    @SdkInternalApi
    final DisableKeyRotationResult executeDisableKeyRotation(DisableKeyRotationRequest disableKeyRotationRequest) {

        ExecutionContext executionContext = createExecutionContext(disableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRotationRequest> request = null;
        Response<DisableKeyRotationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRotationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disableKeyRotationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisableKeyRotationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisableKeyRotationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the state of a customer master key (CMK) to enabled, thereby permitting its use for cryptographic
     * operations. You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param enableKeyRequest
     * @return Result of the EnableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.EnableKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableKeyResult enableKey(EnableKeyRequest request) {
        request = beforeClientExecution(request);
        return executeEnableKey(request);
    }

    @SdkInternalApi
    final EnableKeyResult executeEnableKey(EnableKeyRequest enableKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(enableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRequest> request = null;
        Response<EnableKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform
     * this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @return Result of the EnableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AWSKMS.EnableKeyRotation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/EnableKeyRotation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableKeyRotationResult enableKeyRotation(EnableKeyRotationRequest request) {
        request = beforeClientExecution(request);
        return executeEnableKeyRotation(request);
    }

    @SdkInternalApi
    final EnableKeyRotationResult executeEnableKeyRotation(EnableKeyRotationRequest enableKeyRotationRequest) {

        ExecutionContext executionContext = createExecutionContext(enableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRotationRequest> request = null;
        Response<EnableKeyRotationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRotationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(enableKeyRotationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EnableKeyRotationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new EnableKeyRotationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key (CMK). The <code>Encrypt</code> operation has
     * two primary use cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or
     * other sensitive information.
     * </p>
     * </li>
     * <li>
     * <p>
     * To move encrypted data from one AWS region to another, you can use this operation to encrypt in the new region
     * the plaintext data key that was used to encrypt the data in the original region. This provides you with an
     * encrypted copy of the data key that can be decrypted in the new region and used there to decrypt the encrypted
     * data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
     * the KeyId parameter.
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you don't use this operation to encrypt a
     * generated data key within a region. To get data keys that are already encrypted, call the <a>GenerateDataKey</a>
     * or <a>GenerateDataKeyWithoutPlaintext</a> operation. Data keys don't need to be encrypted again by calling
     * <code>Encrypt</code>.
     * </p>
     * <p>
     * To encrypt data locally in your application, use the <a>GenerateDataKey</a> operation to return a plaintext data
     * encryption key and a copy of the key encrypted under the CMK of your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @return Result of the Encrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. The request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified <code>KeySpec</code> value is not valid.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Encrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Encrypt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EncryptResult encrypt(EncryptRequest request) {
        request = beforeClientExecution(request);
        return executeEncrypt(request);
    }

    @SdkInternalApi
    final EncryptResult executeEncrypt(EncryptRequest encryptRequest) {

        ExecutionContext executionContext = createExecutionContext(encryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EncryptRequest> request = null;
        Response<EncryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EncryptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(encryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<EncryptResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new EncryptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a data encryption key that you can use in your application to encrypt data locally.
     * </p>
     * <p>
     * You must specify the customer master key (CMK) under which to generate the data key. You must also specify the
     * length of the data key using either the <code>KeySpec</code> or <code>NumberOfBytes</code> field. You must
     * specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we
     * recommend that you use <code>KeySpec</code>. To perform this operation on a CMK in a different AWS account,
     * specify the key ARN or alias ARN in the value of the KeyId parameter.
     * </p>
     * <p>
     * This operation returns a plaintext copy of the data key in the <code>Plaintext</code> field of the response, and
     * an encrypted copy of the data key in the <code>CiphertextBlob</code> field. The data key is encrypted under the
     * CMK specified in the <code>KeyId</code> field of the request.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use this operation (<code>GenerateDataKey</code>) to get a data encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data encryption key (returned in the <code>Plaintext</code> field of the response) to encrypt
     * data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * <li>
     * <p>
     * Store the encrypted data key (returned in the <code>CiphertextBlob</code> field of the response) alongside the
     * locally encrypted data.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To decrypt data locally:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key into a plaintext copy of the data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To return only an encrypted copy of the data key, use <a>GenerateDataKeyWithoutPlaintext</a>. To return a random
     * byte string that is cryptographically secure, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * If you use the optional <code>EncryptionContext</code> field, you must store at least enough information to be
     * able to reconstruct the full encryption context when you later send the ciphertext to the <a>Decrypt</a>
     * operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better
     * secure the ciphertext. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html">Encryption Context</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @return Result of the GenerateDataKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. The request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified <code>KeySpec</code> value is not valid.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateDataKey(request);
    }

    @SdkInternalApi
    final GenerateDataKeyResult executeGenerateDataKey(GenerateDataKeyRequest generateDataKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(generateDataKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyRequest> request = null;
        Response<GenerateDataKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateDataKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateDataKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateDataKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to
     * <a>GenerateDataKey</a> but returns only the encrypted copy of the data key.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
     * the KeyId parameter.
     * </p>
     * <p>
     * This operation is useful in a system that has multiple components with different degrees of trust. For example,
     * consider a system that stores encrypted data in containers. Each container stores the encrypted data and an
     * encrypted copy of the data key. One component of the system, called the <i>control plane</i>, creates new
     * containers. When it creates a new container, it uses this operation (<code>GenerateDataKeyWithoutPlaintext</code>
     * ) to get an encrypted data key and then stores it in the container. Later, a different component of the system,
     * called the <i>data plane</i>, puts encrypted data into the containers. To do this, it passes the encrypted data
     * key to the <a>Decrypt</a> operation, then uses the returned plaintext data key to encrypt data, and finally
     * stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyWithoutPlaintext operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. The request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified <code>KeySpec</code> value is not valid.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKeyWithoutPlaintext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyWithoutPlaintext"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateDataKeyWithoutPlaintext(request);
    }

    @SdkInternalApi
    final GenerateDataKeyWithoutPlaintextResult executeGenerateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) {

        ExecutionContext executionContext = createExecutionContext(generateDataKeyWithoutPlaintextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyWithoutPlaintextRequest> request = null;
        Response<GenerateDataKeyWithoutPlaintextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyWithoutPlaintextRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(generateDataKeyWithoutPlaintextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateDataKeyWithoutPlaintextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a random byte string that is cryptographically secure.
     * </p>
     * <p>
     * For more information about entropy and random number generation, see the <a
     * href="https://d0.awsstatic.com/whitepapers/KMS-Cryptographic-Details.pdf">AWS Key Management Service
     * Cryptographic Details</a> whitepaper.
     * </p>
     * 
     * @param generateRandomRequest
     * @return Result of the GenerateRandom operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.GenerateRandom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateRandomResult generateRandom(GenerateRandomRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateRandom(request);
    }

    @SdkInternalApi
    final GenerateRandomResult executeGenerateRandom(GenerateRandomRequest generateRandomRequest) {

        ExecutionContext executionContext = createExecutionContext(generateRandomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateRandomRequest> request = null;
        Response<GenerateRandomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateRandomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateRandomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateRandomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateRandomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GenerateRandomResult generateRandom() {
        return generateRandom(new GenerateRandomRequest());
    }

    /**
     * <p>
     * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK
     * in a different AWS account.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return Result of the GetKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyPolicy(request);
    }

    @SdkInternalApi
    final GetKeyPolicyResult executeGetKeyPolicy(GetKeyPolicyRequest getKeyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPolicyRequest> request = null;
        Response<GetKeyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified
     * customer master key (CMK).
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId
     * parameter.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return Result of the GetKeyRotationStatus operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AWSKMS.GetKeyRotationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyRotationStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyRotationStatusResult getKeyRotationStatus(GetKeyRotationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyRotationStatus(request);
    }

    @SdkInternalApi
    final GetKeyRotationStatusResult executeGetKeyRotationStatus(GetKeyRotationStatusRequest getKeyRotationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyRotationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyRotationStatusRequest> request = null;
        Response<GetKeyRotationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyRotationStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyRotationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyRotationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyRotationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the items you need in order to import key material into AWS KMS from your existing key management
     * infrastructure. For more information about importing key material into AWS KMS, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>. You must also specify the wrapping algorithm and type of
     * wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a
     * CMK in a different AWS account.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public key to encrypt the key material. Store
     * the import token to send with a subsequent <a>ImportKeyMaterial</a> request. The public key and import token from
     * the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be
     * used for a subsequent <a>ImportKeyMaterial</a> request. To get new ones, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @param getParametersForImportRequest
     * @return Result of the GetParametersForImport operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetParametersForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetParametersForImport" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetParametersForImportResult getParametersForImport(GetParametersForImportRequest request) {
        request = beforeClientExecution(request);
        return executeGetParametersForImport(request);
    }

    @SdkInternalApi
    final GetParametersForImportResult executeGetParametersForImport(GetParametersForImportRequest getParametersForImportRequest) {

        ExecutionContext executionContext = createExecutionContext(getParametersForImportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersForImportRequest> request = null;
        Response<GetParametersForImportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersForImportRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParametersForImportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParametersForImportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetParametersForImportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material.
     * You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs
     * with no key material and then importing key material, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in the
     * <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Before using this operation, call <a>GetParametersForImport</a>. Its response includes a public key and an import
     * token. Use the public key to encrypt the key material. Then, submit the import token from the same
     * <code>GetParametersForImport</code> response.
     * </p>
     * <p>
     * When calling this operation, you must specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The key ID or key ARN of a CMK with no key material. Its <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * To create a CMK with no key material, call <a>CreateKey</a> and set the value of its <code>Origin</code>
     * parameter to <code>EXTERNAL</code>. To get the <code>Origin</code> of a CMK, call <a>DescribeKey</a>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * The encrypted key material. To get the public key to encrypt the key material, call
     * <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The import token that <a>GetParametersForImport</a> returned. This token and the public key used to encrypt the
     * key material must have come from the same response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the key material expires and if so, when. If you set an expiration date, you can change it only by
     * reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS
     * deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key
     * material.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, the CMK's key state changes from <code>PendingImport</code> to
     * <code>Enabled</code>, and you can use the CMK. After you successfully import key material into a CMK, you can
     * reimport the same key material into that CMK, but you cannot import different key material.
     * </p>
     * 
     * @param importKeyMaterialRequest
     * @return Result of the ImportKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext, or additional authenticated data incorporated
     *         into the ciphertext, such as the encryption context, is corrupted, missing, or otherwise invalid.
     * @throws IncorrectKeyMaterialException
     *         The request was rejected because the provided key material is invalid or is not the same key material
     *         that was previously imported into this customer master key (CMK).
     * @throws ExpiredImportTokenException
     *         The request was rejected because the provided import token is expired. Use <a>GetParametersForImport</a>
     *         to get a new import token and public key, use the new public key to encrypt the key material, and then
     *         try the request again.
     * @throws InvalidImportTokenException
     *         The request was rejected because the provided import token is invalid or is associated with a different
     *         customer master key (CMK).
     * @sample AWSKMS.ImportKeyMaterial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ImportKeyMaterial" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportKeyMaterialResult importKeyMaterial(ImportKeyMaterialRequest request) {
        request = beforeClientExecution(request);
        return executeImportKeyMaterial(request);
    }

    @SdkInternalApi
    final ImportKeyMaterialResult executeImportKeyMaterial(ImportKeyMaterialRequest importKeyMaterialRequest) {

        ExecutionContext executionContext = createExecutionContext(importKeyMaterialRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyMaterialRequest> request = null;
        Response<ImportKeyMaterialResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyMaterialRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importKeyMaterialRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportKeyMaterialResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportKeyMaterialResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of all aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For
     * more information about aliases, see <a>CreateAlias</a>.
     * </p>
     * <p>
     * The response might include several aliases that do not have a <code>TargetKeyId</code> field because they are not
     * associated with a CMK. These are predefined aliases that are reserved for CMKs managed by AWS services. If an
     * alias is not associated with a CMK, the alias does not count against the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit">alias limit</a> for your
     * account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeListAliases(request);
    }

    @SdkInternalApi
    final ListAliasesResult executeListAliases(ListAliasesRequest listAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAliasesResult listAliases() {
        return listAliases(new ListAliasesRequest());
    }

    /**
     * <p>
     * Gets a list of all grants for the specified customer master key (CMK).
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId
     * parameter.
     * </p>
     * 
     * @param listGrantsRequest
     * @return Result of the ListGrants operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListGrants" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListGrantsResult listGrants(ListGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListGrants(request);
    }

    @SdkInternalApi
    final ListGrantsResult executeListGrants(ListGrantsRequest listGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGrantsRequest> request = null;
        Response<ListGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListGrantsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed
     * to get policy names that you can use in a <a>GetKeyPolicy</a> operation. However, the only valid policy name is
     * <code>default</code>. You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return Result of the ListKeyPolicies operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListKeyPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeyPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListKeyPolicies(request);
    }

    @SdkInternalApi
    final ListKeyPoliciesResult executeListKeyPolicies(ListKeyPoliciesRequest listKeyPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPoliciesRequest> request = null;
        Response<ListKeyPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKeyPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeyPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKeyPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
     * </p>
     * 
     * @param listKeysRequest
     * @return Result of the ListKeys operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @sample AWSKMS.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKeysResult listKeys(ListKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListKeys(request);
    }

    @SdkInternalApi
    final ListKeysResult executeListKeys(ListKeysRequest listKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeysRequest> request = null;
        Response<ListKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListKeysResult listKeys() {
        return listKeys(new ListKeysRequest());
    }

    /**
     * <p>
     * Returns a list of all tags for the specified customer master key (CMK).
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param listResourceTagsRequest
     * @return Result of the ListResourceTags operation returned by the service.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @sample AWSKMS.ListResourceTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListResourceTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourceTagsResult listResourceTags(ListResourceTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceTags(request);
    }

    @SdkInternalApi
    final ListResourceTagsResult executeListResourceTags(ListResourceTagsRequest listResourceTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceTagsRequest> request = null;
        Response<ListResourceTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all grants for which the grant's <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @return Result of the ListRetirableGrants operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.ListRetirableGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListRetirableGrants" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRetirableGrantsResult listRetirableGrants(ListRetirableGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeListRetirableGrants(request);
    }

    @SdkInternalApi
    final ListRetirableGrantsResult executeListRetirableGrants(ListRetirableGrantsRequest listRetirableGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRetirableGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetirableGrantsRequest> request = null;
        Response<ListRetirableGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetirableGrantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRetirableGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRetirableGrantsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRetirableGrantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a
     * different AWS account.
     * </p>
     * <p>
     * For more information about key policies, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key Policies</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @return Result of the PutKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.PutKeyPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/PutKeyPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutKeyPolicyResult putKeyPolicy(PutKeyPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutKeyPolicy(request);
    }

    @SdkInternalApi
    final PutKeyPolicyResult executePutKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeyPolicyRequest> request = null;
        Response<PutKeyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeyPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putKeyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutKeyPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutKeyPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data
     * on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * You can reencrypt data using CMKs in different AWS accounts.
     * </p>
     * <p>
     * Unlike other operations, <code>ReEncrypt</code> is authorized twice, once as <code>ReEncryptFrom</code> on the
     * source CMK and once as <code>ReEncryptTo</code> on the destination CMK. We recommend that you include the
     * <code>"kms:ReEncrypt*"</code> permission in your <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policies</a> to permit
     * reencryption from or to the CMK. This permission is automatically included in the key policy when you create a
     * CMK through the console, but you must include it manually when you create a CMK programmatically or when you set
     * a key policy with the <a>PutKeyPolicy</a> operation.
     * </p>
     * 
     * @param reEncryptRequest
     * @return Result of the ReEncrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext, or additional authenticated data incorporated
     *         into the ciphertext, such as the encryption context, is corrupted, missing, or otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. The request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified <code>KeySpec</code> value is not valid.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ReEncrypt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReEncrypt" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReEncryptResult reEncrypt(ReEncryptRequest request) {
        request = beforeClientExecution(request);
        return executeReEncrypt(request);
    }

    @SdkInternalApi
    final ReEncryptResult executeReEncrypt(ReEncryptRequest reEncryptRequest) {

        ExecutionContext executionContext = createExecutionContext(reEncryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReEncryptRequest> request = null;
        Response<ReEncryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReEncryptRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(reEncryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReEncryptResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReEncryptResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when
     * you intend to actively deny operations that depend on it. The following are permitted to call this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The AWS account (root user) under which the grant was created
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>RetiringPrincipal</code>, if present in the grant
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is an operation specified in the grant
     * </p>
     * </li>
     * </ul>
     * <p>
     * You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon
     * Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded
     * string. A grant ID is a 64 character unique identifier of a grant. The <a>CreateGrant</a> operation returns both.
     * </p>
     * 
     * @param retireGrantRequest
     * @return Result of the RetireGrant operation returned by the service.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified <code>GrantId</code> is not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RetireGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RetireGrant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RetireGrantResult retireGrant(RetireGrantRequest request) {
        request = beforeClientExecution(request);
        return executeRetireGrant(request);
    }

    @SdkInternalApi
    final RetireGrantResult executeRetireGrant(RetireGrantRequest retireGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(retireGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetireGrantRequest> request = null;
        Response<RetireGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetireGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(retireGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RetireGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RetireGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public RetireGrantResult retireGrant() {
        return retireGrant(new RetireGrantRequest());
    }

    /**
     * <p>
     * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny
     * operations that depend on it.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId
     * parameter.
     * </p>
     * 
     * @param revokeGrantRequest
     * @return Result of the RevokeGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified <code>GrantId</code> is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RevokeGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RevokeGrant" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RevokeGrantResult revokeGrant(RevokeGrantRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeGrant(request);
    }

    @SdkInternalApi
    final RevokeGrantResult executeRevokeGrant(RevokeGrantRequest revokeGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeGrantRequest> request = null;
        Response<RevokeGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeGrantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RevokeGrantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeGrantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days,
     * before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this
     * operation is successful, the state of the CMK changes to <code>PendingDeletion</code>. Before the waiting period
     * ends, you can use <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the waiting period ends, AWS
     * KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return Result of the ScheduleKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ScheduleKeyDeletion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ScheduleKeyDeletion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ScheduleKeyDeletionResult scheduleKeyDeletion(ScheduleKeyDeletionRequest request) {
        request = beforeClientExecution(request);
        return executeScheduleKeyDeletion(request);
    }

    @SdkInternalApi
    final ScheduleKeyDeletionResult executeScheduleKeyDeletion(ScheduleKeyDeletionRequest scheduleKeyDeletionRequest) {

        ExecutionContext executionContext = createExecutionContext(scheduleKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScheduleKeyDeletionRequest> request = null;
        Response<ScheduleKeyDeletionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScheduleKeyDeletionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(scheduleKeyDeletionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ScheduleKeyDeletionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ScheduleKeyDeletionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified customer master key (CMK). You cannot perform this
     * operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty (null) strings.
     * </p>
     * <p>
     * You cannot use the same tag key more than once per CMK. For example, consider a CMK with one tag whose tag key is
     * <code>Purpose</code> and tag value is <code>Test</code>. If you send a <code>TagResource</code> request for this
     * CMK with a tag key of <code>Purpose</code> and a tag value of <code>Prod</code>, it does not create a second tag.
     * Instead, the original tag is overwritten with the new tag value.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Limits</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @sample AWSKMS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified tag or tags from the specified customer master key (CMK). You cannot perform this operation
     * on a CMK in a different AWS account.
     * </p>
     * <p>
     * To remove a tag, you specify the tag key for each tag to remove. You do not specify the tag value. To overwrite
     * the tag value for an existing tag, use <a>TagResource</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @sample AWSKMS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but
     * the aliases must be unique within the account and region. You cannot perform this operation on an alias in a
     * different AWS account.
     * </p>
     * <p>
     * This operation works only on existing aliases. To change the alias of a CMK to a new value, use
     * <a>CreateAlias</a> to create a new alias and <a>DeleteAlias</a> to delete the old alias.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without
     * affecting the CMK. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get the
     * aliases of all CMKs in the account, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An
     * alias must start with the word <code>alias</code> followed by a forward slash (<code>alias/</code>). The alias
     * name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names
     * cannot begin with <code>aws</code>; that alias name prefix is reserved by Amazon Web Services (AWS).
     * </p>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAliasResult updateAlias(UpdateAliasRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAlias(request);
    }

    @SdkInternalApi
    final UpdateAliasResult executeUpdateAlias(UpdateAliasRequest updateAliasRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<UpdateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAliasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAliasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of a customer master key (CMK). To see the decription of a CMK, use <a>DescribeKey</a>.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @return Result of the UpdateKeyDescription operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     *         Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateKeyDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateKeyDescription" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateKeyDescriptionResult updateKeyDescription(UpdateKeyDescriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateKeyDescription(request);
    }

    @SdkInternalApi
    final UpdateKeyDescriptionResult executeUpdateKeyDescription(UpdateKeyDescriptionRequest updateKeyDescriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateKeyDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeyDescriptionRequest> request = null;
        Response<UpdateKeyDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeyDescriptionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateKeyDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateKeyDescriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateKeyDescriptionResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
