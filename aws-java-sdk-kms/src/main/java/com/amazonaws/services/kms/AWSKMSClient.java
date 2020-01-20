/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.client.builder.AdvancedConfig;

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
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/"> <i>AWS Key Management Service Developer Guide</i>
 * </a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, macOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to AWS KMS and
 * other AWS services. For example, the SDKs take care of tasks such as signing requests (see below), managing errors,
 * and retrying requests automatically. For more information about the AWS SDKs, including how to download and install
 * them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
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
 * access key ID and secret access key for an IAM user. You can also use the AWS Security Token Service to generate
 * temporary security credentials that you can use to sign requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and related events for your AWS account and
 * delivers them to an Amazon S3 bucket that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it was made, and so on. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS CloudTrail User Guide</a>.
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
 * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a> -
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html">Temporary Security
 * Credentials</a> - This section of the <i>IAM User Guide</i> describes how to create and use temporary security
 * credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a> - This set of topics walks you through the process of signing a request using an access key ID and a
 * secret access key.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Commonly Used API Operations</b>
 * </p>
 * <p>
 * Of the API operations discussed in this guide, the following will prove the most useful for most applications. You
 * will likely perform operations other than these, such as creating keys and assigning policies, by using the console.
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

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmClusterNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CloudHsmClusterNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredImportTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.ExpiredImportTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomKeyStoreNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CustomKeyStoreNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.MalformedPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectKeyMaterialException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.IncorrectKeyMaterialExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidImportTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidArnExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidSignatureException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.KMSInvalidSignatureExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.KMSInvalidStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmClusterNotRelatedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CloudHsmClusterNotRelatedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomKeyStoreInvalidStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CustomKeyStoreInvalidStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectTrustAnchorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.IncorrectTrustAnchorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.DisabledExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.NotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomKeyStoreHasCMKsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CustomKeyStoreHasCMKsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KeyUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.KeyUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmClusterInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CloudHsmClusterInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCiphertextException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidCiphertextExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidGrantIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectKeyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.IncorrectKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidGrantTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomKeyStoreNameInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CustomKeyStoreNameInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.AlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TagException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.TagExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKeyUsageException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidKeyUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmClusterInvalidConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CloudHsmClusterInvalidConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidMarkerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidMarkerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAliasNameException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidAliasNameExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DependencyTimeoutException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.DependencyTimeoutExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInternalException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.KMSInternalExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CloudHsmClusterNotActiveException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CloudHsmClusterNotActiveExceptionUnmarshaller.getInstance()))
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
        this.advancedConfig = AdvancedConfig.EMPTY;
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
        this.advancedConfig = AdvancedConfig.EMPTY;
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
        this(clientParams, false);
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
    AWSKMSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
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
     * Cancels the deletion of a customer master key (CMK). When this operation succeeds, the key state of the CMK is
     * <code>Disabled</code>. To enable the CMK, use <a>EnableKey</a>. You cannot perform this operation on a CMK in a
     * different AWS account.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return Result of the CancelKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelKeyDeletion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Connects or reconnects a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>
     * to its associated AWS CloudHSM cluster.
     * </p>
     * <p>
     * The custom key store must be connected before you can create customer master keys (CMKs) in the key store or use
     * the CMKs it contains. You can disconnect and reconnect a custom key store at any time.
     * </p>
     * <p>
     * To connect a custom key store, its associated AWS CloudHSM cluster must have at least one active HSM. To get the
     * number of active HSMs in a cluster, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation. To add HSMs to the cluster, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a> operation. Also,
     * the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user</a> (CU) must not be logged into the cluster. This prevents AWS KMS from using
     * this account to log in.
     * </p>
     * <p>
     * The connection process can take an extended amount of time to complete; up to 20 minutes. This operation starts
     * the connection process, but it does not wait for it to complete. When it succeeds, this operation quickly returns
     * an HTTP 200 response and a JSON object with no properties. However, this response does not indicate that the
     * custom key store is connected. To get the connection state of the custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * During the connection process, AWS KMS finds the AWS CloudHSM cluster that is associated with the custom key
     * store, creates the connection infrastructure, connects to the cluster, logs into the AWS CloudHSM client as the
     * <code>kmsuser</code> CU, and rotates its password.
     * </p>
     * <p>
     * The <code>ConnectCustomKeyStore</code> operation might fail for various reasons. To find the reason, use the
     * <a>DescribeCustomKeyStores</a> operation and see the <code>ConnectionErrorCode</code> in the response. For help
     * interpreting the <code>ConnectionErrorCode</code>, see <a>CustomKeyStoresListEntry</a>.
     * </p>
     * <p>
     * To fix the failure, use the <a>DisconnectCustomKeyStore</a> operation to disconnect the custom key store, correct
     * the error, use the <a>UpdateCustomKeyStore</a> operation if necessary, and then use
     * <code>ConnectCustomKeyStore</code> again.
     * </p>
     * <p>
     * If you are having trouble connecting or disconnecting a custom key store, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param connectCustomKeyStoreRequest
     * @return Result of the ConnectCustomKeyStore operation returned by the service.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the AWS CloudHSM cluster that is associated with the custom key store is
     *         not active. Initialize and activate the cluster and try the command again. For detailed instructions, see
     *         <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a>
     *         in the <i>AWS CloudHSM User Guide</i>.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated AWS CloudHSM cluster did not meet the configuration
     *         requirements for a custom key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The cluster must be configured with private subnets in at least two different Availability Zones in the
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the cluster. Do not delete or change them. To get information about a particular security
     *         group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the AWS
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         AWS CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the AWS CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an AWS CloudHSM cluster that is associated with a custom key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>AWS Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an AWS CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>AWS CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>AWS CloudHSM User Guide</i> </i>.
     * @sample AWSKMS.ConnectCustomKeyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ConnectCustomKeyStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ConnectCustomKeyStoreResult connectCustomKeyStore(ConnectCustomKeyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeConnectCustomKeyStore(request);
    }

    @SdkInternalApi
    final ConnectCustomKeyStoreResult executeConnectCustomKeyStore(ConnectCustomKeyStoreRequest connectCustomKeyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(connectCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectCustomKeyStoreRequest> request = null;
        Response<ConnectCustomKeyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectCustomKeyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(connectCustomKeyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConnectCustomKeyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConnectCustomKeyStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ConnectCustomKeyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a display name for a customer managed customer master key (CMK). You can use an alias to identify a CMK
     * in cryptographic operations, such as <a>Encrypt</a> and <a>GenerateDataKey</a>. You can change the CMK associated
     * with the alias at any time.
     * </p>
     * <p>
     * Aliases are easier to remember than key IDs. They can also help to simplify your applications. For example, if
     * you use an alias in your code, you can change the CMK your code uses by associating a given alias with a
     * different CMK.
     * </p>
     * <p>
     * To run the same code in multiple AWS regions, use an alias in your code, such as
     * <code>alias/ApplicationKey</code>. Then, in each AWS Region, create an <code>alias/ApplicationKey</code> alias
     * that is associated with a CMK in that Region. When you run your code, it uses the
     * <code>alias/ApplicationKey</code> CMK for that AWS Region without any Region-specific code.
     * </p>
     * <p>
     * This operation does not return a response. To get the alias that you created, use the <a>ListAliases</a>
     * operation.
     * </p>
     * <p>
     * To use aliases successfully, be aware of the following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Each alias points to only one CMK at a time, although a single CMK can have multiple aliases. The alias and its
     * associated CMK must be in the same AWS account and Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate an alias with any customer managed CMK in the same AWS account and Region. However, you do not
     * have permission to associate an alias with an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMK</a> or
     * an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk">AWS owned CMK</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To change the CMK associated with an alias, use the <a>UpdateAlias</a> operation. The current CMK and the new CMK
     * must be the same type (both symmetric or both asymmetric) and they must have the same key usage (
     * <code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>). This restriction prevents cryptographic errors in code
     * that uses aliases.
     * </p>
     * </li>
     * <li>
     * <p>
     * The alias name must begin with <code>alias/</code> followed by a name, such as <code>alias/ExampleAlias</code>.
     * It can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). The alias name
     * cannot begin with <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed CMKs</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The alias name must be unique within an AWS Region. However, you can use the same alias name in multiple Regions
     * of the same AWS account. Each instance of the alias is associated with a CMK in its Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * After you create an alias, you cannot change its alias name. However, you can use the <a>DeleteAlias</a>
     * operation to delete the alias and then create a new alias with the desired name.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use an alias name or alias ARN to identify a CMK in AWS KMS cryptographic operations and in the
     * <a>DescribeKey</a> operation. However, you cannot use alias names or alias ARNs in API operations that manage
     * CMKs, such as <a>DisableKey</a> or <a>GetKeyPolicy</a>. For information about the valid CMK identifiers for each
     * AWS KMS API operation, see the descriptions of the <code>KeyId</code> parameter in the API operation
     * documentation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the
     * CMK. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get the aliases and
     * alias ARNs of CMKs in each AWS account and Region, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Creates a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom
     * key store</a> that is associated with an <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/clusters.html">AWS CloudHSM cluster</a> that you own
     * and manage.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * <p>
     * Before you create the custom key store, you must assemble the required elements, including an AWS CloudHSM
     * cluster that fulfills the requirements for a custom key store. For details about the required elements, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">Assemble the
     * Prerequisites</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the operation completes successfully, it returns the ID of the new custom key store. Before you can use your
     * new custom key store, you need to use the <a>ConnectCustomKeyStore</a> operation to connect the new key store to
     * its AWS CloudHSM cluster. Even if you are not going to use your custom key store immediately, you might want to
     * connect it to verify that all settings are correct and then disconnect it until you are ready to use it.
     * </p>
     * <p>
     * For help with failures, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a Custom Key
     * Store</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param createCustomKeyStoreRequest
     * @return Result of the CreateCustomKeyStore operation returned by the service.
     * @throws CloudHsmClusterInUseException
     *         The request was rejected because the specified AWS CloudHSM cluster is already associated with a custom
     *         key store or it shares a backup history with a cluster that is associated with a custom key store. Each
     *         custom key store must be associated with a different AWS CloudHSM cluster.</p>
     *         <p>
     *         Clusters that share a backup history have the same cluster certificate. To view the cluster certificate
     *         of a cluster, use the <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     * @throws CustomKeyStoreNameInUseException
     *         The request was rejected because the specified custom key store name is already assigned to another
     *         custom key store in the account. Try again with a custom key store name that is unique in the account.
     * @throws CloudHsmClusterNotFoundException
     *         The request was rejected because AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *         ID. Retry the request with a different cluster ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the AWS CloudHSM cluster that is associated with the custom key store is
     *         not active. Initialize and activate the cluster and try the command again. For detailed instructions, see
     *         <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a>
     *         in the <i>AWS CloudHSM User Guide</i>.
     * @throws IncorrectTrustAnchorException
     *         The request was rejected because the trust anchor certificate in the request is not the trust anchor
     *         certificate for the specified AWS CloudHSM cluster.
     *         </p>
     *         <p>
     *         When you <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *         the cluster</a>, you create the trust anchor certificate and save it in the <code>customerCA.crt</code>
     *         file.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated AWS CloudHSM cluster did not meet the configuration
     *         requirements for a custom key store.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The cluster must be configured with private subnets in at least two different Availability Zones in the
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the cluster. Do not delete or change them. To get information about a particular security
     *         group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the AWS
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         AWS CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the AWS CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an AWS CloudHSM cluster that is associated with a custom key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>AWS Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an AWS CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>AWS CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>AWS CloudHSM User Guide</i> </i>.
     * @sample AWSKMS.CreateCustomKeyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/CreateCustomKeyStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCustomKeyStoreResult createCustomKeyStore(CreateCustomKeyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomKeyStore(request);
    }

    @SdkInternalApi
    final CreateCustomKeyStoreResult executeCreateCustomKeyStore(CreateCustomKeyStoreRequest createCustomKeyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomKeyStoreRequest> request = null;
        Response<CreateCustomKeyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomKeyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCustomKeyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomKeyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomKeyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCustomKeyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a grant to a customer master key (CMK). The grant allows the grantee principal to use the CMK when the
     * conditions specified in the grant are met. When setting permissions, grants are an alternative to key policies.
     * </p>
     * <p>
     * To create a grant that allows a cryptographic operation only when the request includes a particular <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption
     * context</a>, use the <code>Constraints</code> parameter. For details, see <a>GrantConstraints</a>.
     * </p>
     * <p>
     * You can create grants on symmetric and asymmetric CMKs. However, if the grant allows an operation that the CMK
     * does not support, <code>CreateGrant</code> fails with a <code>ValidationException</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grants for symmetric CMKs cannot allow operations that are not supported for symmetric CMKs, including
     * <a>Sign</a>, <a>Verify</a>, and <a>GetPublicKey</a>. (There are limited exceptions to this rule for legacy
     * operations, but you should not create a grant for an operation that AWS KMS does not support.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Grants for asymmetric CMKs cannot allow operations that are not supported for asymmetric CMKs, including
     * operations that <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateDataKey">generate data
     * keys</a> or <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_GenerateDataKeyPair">data key
     * pairs</a>, or operations related to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic key rotation</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * CMKs in <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     * stores</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grants for asymmetric CMKs with a <code>KeyUsage</code> of <code>ENCRYPT_DECRYPT</code> cannot allow the
     * <a>Sign</a> or <a>Verify</a> operations. Grants for asymmetric CMKs with a <code>KeyUsage</code> of
     * <code>SIGN_VERIFY</code> cannot allow the <a>Encrypt</a> or <a>Decrypt</a> operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grants for asymmetric CMKs cannot include an encryption context grant constraint. An encryption context is not
     * supported on asymmetric CMKs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about symmetric and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
     * <code>KeyId</code> parameter. For more information about grants, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants</a> in the <i> <i>AWS Key
     * Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Creates a unique customer managed <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master-keys">customer master key</a>
     * (CMK) in your AWS account and Region. You cannot use this operation to create a CMK in a different AWS account.
     * </p>
     * <p>
     * You can use the <code>CreateKey</code> operation to create symmetric or asymmetric CMKs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Symmetric CMKs</b> contain a 256-bit symmetric key that never leaves AWS KMS unencrypted. To use the CMK, you
     * must call AWS KMS. You can use a symmetric CMK to encrypt and decrypt small amounts of data, but they are
     * typically used to generate <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-keys">data keys</a> and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#data-key-pairs">data keys pairs</a>.
     * For details, see <a>GenerateDataKey</a> and <a>GenerateDataKeyPair</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Asymmetric CMKs</b> can contain an RSA key pair or an Elliptic Curve (ECC) key pair. The private key in an
     * asymmetric CMK never leaves AWS KMS unencrypted. However, you can use the <a>GetPublicKey</a> operation to
     * download the public key so it can be used outside of AWS KMS. CMKs with RSA key pairs can be used to encrypt or
     * decrypt data or sign and verify messages (but not both). CMKs with ECC key pairs can be used only to sign and
     * verify messages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about symmetric and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To create different types of CMKs, use the following guidance:
     * </p>
     * <dl>
     * <dt>Asymmetric CMKs</dt>
     * <dd>
     * <p>
     * To create an asymmetric CMK, use the <code>CustomerMasterKeySpec</code> parameter to specify the type of key
     * material in the CMK. Then, use the <code>KeyUsage</code> parameter to determine whether the CMK will be used to
     * encrypt and decrypt or sign and verify. You can't change these properties after the CMK is created.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Symmetric CMKs</dt>
     * <dd>
     * <p>
     * When creating a symmetric CMK, you don't need to specify the <code>CustomerMasterKeySpec</code> or
     * <code>KeyUsage</code> parameters. The default value for <code>CustomerMasterKeySpec</code>,
     * <code>SYMMETRIC_DEFAULT</code>, and the default value for <code>KeyUsage</code>, <code>ENCRYPT_DECRYPT</code>,
     * are the only valid values for symmetric CMKs.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Imported Key Material</dt>
     * <dd>
     * <p>
     * To import your own key material, begin by creating a symmetric CMK with no key material. To do this, use the
     * <code>Origin</code> parameter of <code>CreateKey</code> with a value of <code>EXTERNAL</code>. Next, use
     * <a>GetParametersForImport</a> operation to get a public key and import token, and use the public key to encrypt
     * your key material. Then, use <a>ImportKeyMaterial</a> with your import token to import the key material. For
     * step-by-step instructions, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i> <i>AWS Key Management Service Developer Guide</i> </i>. You cannot import the key material into an
     * asymmetric CMK.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Custom Key Stores</dt>
     * <dd>
     * <p>
     * To create a symmetric CMK in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>,
     * use the <code>CustomKeyStoreId</code> parameter to specify the custom key store. You must also use the
     * <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The AWS CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs in different Availability Zones in the
     * AWS Region.
     * </p>
     * <p>
     * You cannot create an asymmetric CMK in a custom key store. For information about custom key stores in AWS KMS see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Using Custom Key
     * Stores</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createKeyRequest
     * @return Result of the CreateKey operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated AWS CloudHSM cluster did not meet the configuration
     *         requirements for a custom key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The cluster must be configured with private subnets in at least two different Availability Zones in the
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the cluster. Do not delete or change them. To get information about a particular security
     *         group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the AWS
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         AWS CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the AWS CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an AWS CloudHSM cluster that is associated with a custom key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>AWS Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an AWS CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>AWS CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>AWS CloudHSM User Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Decrypts ciphertext that was encrypted by a AWS KMS customer master key (CMK) using any of the following
     * operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyPair</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyPairWithoutPlaintext</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can use this operation to decrypt ciphertext that was encrypted under a symmetric or asymmetric CMK. When the
     * CMK is asymmetric, you must specify the CMK and the encryption algorithm that was used to encrypt the ciphertext.
     * For information about symmetric and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The Decrypt operation also decrypts ciphertext that was encrypted outside of AWS KMS by the public key in an AWS
     * KMS asymmetric CMK. However, it cannot decrypt ciphertext produced by other libraries, such as the <a
     * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">AWS Encryption SDK</a> or <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon S3 client-side
     * encryption</a>. These libraries return a ciphertext format that is incompatible with AWS KMS.
     * </p>
     * <p>
     * If the ciphertext was encrypted under a symmetric CMK, you do not need to specify the CMK or the encryption
     * algorithm. AWS KMS can get this information from metadata that it adds to the symmetric ciphertext blob. However,
     * if you prefer, you can specify the <code>KeyId</code> to ensure that a particular CMK is used to decrypt the
     * ciphertext. If you specify a different CMK than the one used to encrypt the ciphertext, the <code>Decrypt</code>
     * operation fails.
     * </p>
     * <p>
     * Whenever possible, use key policies to give users permission to call the Decrypt operation on a particular CMK,
     * instead of using IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt
     * permission on all CMKs. This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the
     * key policy for the cross-account CMK permits it. If you must use an IAM policy for <code>Decrypt</code>
     * permissions, limit the user to particular CMKs or particular trusted accounts.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param decryptRequest
     * @return Result of the Decrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.</p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because AWS KMS could not decrypt
     *         the encrypted (wrapped) key material.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws IncorrectKeyException
     *         The request was rejected because the specified CMK cannot decrypt the data. The <code>KeyId</code> in a
     *         <a>Decrypt</a> request and the <code>SourceKeyId</code> in a <a>ReEncrypt</a> request must identify the
     *         same CMK that was used to encrypt the ciphertext.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Decrypt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Deletes a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom
     * key store</a>. This operation does not delete the AWS CloudHSM cluster that is associated with the custom key
     * store, or affect any users or keys in the cluster.
     * </p>
     * <p>
     * The custom key store that you delete cannot contain any AWS KMS <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">customer master keys
     * (CMKs)</a>. Before deleting the key store, verify that you will never need to use any of the CMKs in the key
     * store for any cryptographic operations. Then, use <a>ScheduleKeyDeletion</a> to delete the AWS KMS customer
     * master keys (CMKs) from the key store. When the scheduled waiting period expires, the
     * <code>ScheduleKeyDeletion</code> operation deletes the CMKs. Then it makes a best effort to delete the key
     * material from the associated cluster. However, you might need to manually <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key">delete
     * the orphaned key material</a> from the cluster and its backups.
     * </p>
     * <p>
     * After all CMKs are deleted from AWS KMS, use <a>DisconnectCustomKeyStore</a> to disconnect the key store from AWS
     * KMS. Then, you can delete the custom key store.
     * </p>
     * <p>
     * Instead of deleting the custom key store, consider using <a>DisconnectCustomKeyStore</a> to disconnect it from
     * AWS KMS. While the key store is disconnected, you cannot create or use the CMKs in the key store. But, you do not
     * need to delete CMKs and you can reconnect a disconnected custom key store at any time.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @param deleteCustomKeyStoreRequest
     * @return Result of the DeleteCustomKeyStore operation returned by the service.
     * @throws CustomKeyStoreHasCMKsException
     *         The request was rejected because the custom key store contains AWS KMS customer master keys (CMKs). After
     *         verifying that you do not need to use the CMKs, use the <a>ScheduleKeyDeletion</a> operation to delete
     *         the CMKs. After they are deleted, you can delete the custom key store.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.DeleteCustomKeyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DeleteCustomKeyStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCustomKeyStoreResult deleteCustomKeyStore(DeleteCustomKeyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomKeyStore(request);
    }

    @SdkInternalApi
    final DeleteCustomKeyStoreResult executeDeleteCustomKeyStore(DeleteCustomKeyStoreRequest deleteCustomKeyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomKeyStoreRequest> request = null;
        Response<DeleteCustomKeyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomKeyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCustomKeyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomKeyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomKeyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCustomKeyStoreResultJsonUnmarshaller());
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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>AWS Key Management Service Developer Guide</i>. You cannot perform this operation on a CMK in a different
     * AWS account.
     * </p>
     * <p>
     * When the specified CMK is in the <code>PendingDeletion</code> state, this operation does not change the CMK's
     * state. Otherwise, it changes the CMK's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to reimport the same key material into the
     * CMK.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @return Result of the DeleteImportedKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteImportedKeyMaterial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Gets information about <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * in the account and region.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * <p>
     * By default, this operation returns information about all custom key stores in the account and region. To get only
     * information about a particular custom key store, use either the <code>CustomKeyStoreName</code> or
     * <code>CustomKeyStoreId</code> parameter (but not both).
     * </p>
     * <p>
     * To determine whether the custom key store is connected to its AWS CloudHSM cluster, use the
     * <code>ConnectionState</code> element in the response. If an attempt to connect the custom key store failed, the
     * <code>ConnectionState</code> value is <code>FAILED</code> and the <code>ConnectionErrorCode</code> element in the
     * response indicates the cause of the failure. For help interpreting the <code>ConnectionErrorCode</code>, see
     * <a>CustomKeyStoresListEntry</a>.
     * </p>
     * <p>
     * Custom key stores have a <code>DISCONNECTED</code> connection state if the key store has never been connected or
     * you use the <a>DisconnectCustomKeyStore</a> operation to disconnect it. If your custom key store state is
     * <code>CONNECTED</code> but you are having trouble using it, make sure that its associated AWS CloudHSM cluster is
     * active and contains the minimum number of HSMs required for the operation, if any.
     * </p>
     * <p>
     * For help repairing your custom key store, see the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting Custom Key
     * Stores</a> topic in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param describeCustomKeyStoresRequest
     * @return Result of the DescribeCustomKeyStores operation returned by the service.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.DescribeCustomKeyStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeCustomKeyStores" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCustomKeyStoresResult describeCustomKeyStores(DescribeCustomKeyStoresRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomKeyStores(request);
    }

    @SdkInternalApi
    final DescribeCustomKeyStoresResult executeDescribeCustomKeyStores(DescribeCustomKeyStoresRequest describeCustomKeyStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomKeyStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomKeyStoresRequest> request = null;
        Response<DescribeCustomKeyStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomKeyStoresRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCustomKeyStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomKeyStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomKeyStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCustomKeyStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides detailed information about a customer master key (CMK). You can run <code>DescribeKey</code> on a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed CMK</a>
     * or an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed
     * CMK</a>.
     * </p>
     * <p>
     * This detailed information includes the key ARN, creation date (and deletion date, if applicable), the key state,
     * and the origin and expiration date (if any) of the key material. For CMKs in custom key stores, it includes
     * information about the custom key store, such as the key store ID and the AWS CloudHSM cluster ID. It includes
     * fields, like <code>KeySpec</code>, that help you distinguish symmetric from asymmetric CMKs. It also provides
     * information that is particularly important to asymmetric CMKs, such as the key usage (encryption or signing) and
     * the encryption algorithms or signing algorithms that the CMK supports.
     * </p>
     * <p>
     * <code>DescribeKey</code> does not return the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Aliases associated with the CMK. To get this information, use <a>ListAliases</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether automatic key rotation is enabled on the CMK. To get this information, use <a>GetKeyRotationStatus</a>.
     * Also, some key states prevent a CMK from being automatically rotated. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotate-keys-how-it-works">How
     * Automatic Key Rotation Works</a> in <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags on the CMK. To get this information, use <a>ListResourceTags</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key policies and grants on the CMK. To get this information, use <a>GetKeyPolicy</a> and <a>ListGrants</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you call the <code>DescribeKey</code> operation on a <i>predefined AWS alias</i>, that is, an AWS alias with
     * no key ID, AWS KMS creates an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">AWS managed CMK</a>. Then,
     * it associates the alias with the new CMK, and returns the <code>KeyId</code> and <code>Arn</code> of the new CMK
     * in the response.
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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @return Result of the DisableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Disables <a href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic rotation of
     * the key material</a> for the specified symmetric customer master key (CMK).
     * </p>
     * <p>
     * You cannot enable automatic rotation of asymmetric CMKs, CMKs with imported key material, or CMKs in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @return Result of the DisableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableKeyRotation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Disconnects the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>
     * from its associated AWS CloudHSM cluster. While a custom key store is disconnected, you can manage the custom key
     * store and its customer master keys (CMKs), but you cannot create or use CMKs in the custom key store. You can
     * reconnect the custom key store at any time.
     * </p>
     * <note>
     * <p>
     * While a custom key store is disconnected, all attempts to create customer master keys (CMKs) in the custom key
     * store or to use existing CMKs in cryptographic operations will fail. This action can prevent users from storing
     * and accessing sensitive data.
     * </p>
     * </note>
     * <p/>
     * <p>
     * To find the connection state of a custom key store, use the <a>DescribeCustomKeyStores</a> operation. To
     * reconnect a custom key store, use the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @param disconnectCustomKeyStoreRequest
     * @return Result of the DisconnectCustomKeyStore operation returned by the service.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @sample AWSKMS.DisconnectCustomKeyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisconnectCustomKeyStore" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisconnectCustomKeyStoreResult disconnectCustomKeyStore(DisconnectCustomKeyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectCustomKeyStore(request);
    }

    @SdkInternalApi
    final DisconnectCustomKeyStoreResult executeDisconnectCustomKeyStore(DisconnectCustomKeyStoreRequest disconnectCustomKeyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectCustomKeyStoreRequest> request = null;
        Response<DisconnectCustomKeyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectCustomKeyStoreRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disconnectCustomKeyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectCustomKeyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectCustomKeyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisconnectCustomKeyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the key state of a customer master key (CMK) to enabled. This allows you to use the CMK for cryptographic
     * operations. You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param enableKeyRequest
     * @return Result of the EnableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Enables <a href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic rotation of
     * the key material</a> for the specified symmetric customer master key (CMK). You cannot perform this operation on
     * a CMK in a different AWS account.
     * </p>
     * <p>
     * You cannot enable automatic rotation of asymmetric CMKs, CMKs with imported key material, or CMKs in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @return Result of the EnableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableKeyRotation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * You can encrypt small amounts of arbitrary data, such as a personal identifier or database password, or other
     * sensitive information.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use the <code>Encrypt</code> operation to move encrypted data from one AWS region to another. In the
     * first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call
     * the <code>Encrypt</code> method on same plaintext data key. Now, you can safely move the encrypted data and
     * encrypted data key to the new region, and decrypt in the new region when necessary.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You don't need to use the <code>Encrypt</code> operation to encrypt a data key. The <a>GenerateDataKey</a> and
     * <a>GenerateDataKeyPair</a> operations return a plaintext data key and an encrypted copy of that data key.
     * </p>
     * <p>
     * When you encrypt data, you must specify a symmetric or asymmetric CMK to use in the encryption operation. The CMK
     * must have a <code>KeyUsage</code> value of <code>ENCRYPT_DECRYPT.</code> To find the <code>KeyUsage</code> of a
     * CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * If you use a symmetric CMK, you can use an encryption context to add additional security to your encryption
     * operation. If you specify an <code>EncryptionContext</code> when encrypting data, you must specify the same
     * encryption context (a case-sensitive exact match) when decrypting the data. Otherwise, the request to decrypt
     * fails with an <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * If you specify an asymmetric CMK, you must also specify the encryption algorithm. The algorithm must be
     * compatible with the CMK type.
     * </p>
     * <important>
     * <p>
     * When you use an asymmetric CMK to encrypt or reencrypt data, be sure to record the CMK and encryption algorithm
     * that you choose. You will be required to provide the same CMK and encryption algorithm when you decrypt the data.
     * If the CMK and algorithm do not match the values used to encrypt the data, the decrypt operation fails.
     * </p>
     * <p>
     * You are not required to supply the CMK ID and encryption algorithm when you decrypt with symmetric CMKs because
     * AWS KMS stores this information in the ciphertext blob. AWS KMS cannot store metadata in ciphertext generated
     * with asymmetric keys. The standard format for asymmetric key ciphertext does not include configurable fields.
     * </p>
     * </important>
     * <p>
     * The maximum size of the data that you can encrypt varies with the type of CMK and the encryption algorithm that
     * you choose.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric CMKs
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SYMMETRIC_DEFAULT</code>: 4096 bytes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RSA_2048</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_1</code>: 214 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_256</code>: 190 bytes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RSA_3072</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_1</code>: 342 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_256</code>: 318 bytes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>RSA_4096</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_1</code>: 470 bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RSAES_OAEP_SHA_256</code>: 446 bytes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of
     * the KeyId parameter.
     * </p>
     * 
     * @param encryptRequest
     * @return Result of the Encrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Encrypt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Generates a unique symmetric data key. This operation returns a plaintext copy of the data key and a copy that is
     * encrypted under a customer master key (CMK) that you specify. You can use the plaintext key to encrypt your data
     * outside of AWS KMS and store the encrypted data key with the encrypted data.
     * </p>
     * <p>
     * <code>GenerateDataKey</code> returns a unique data key for each request. The bytes in the key are not related to
     * the caller or CMK that is used to encrypt the data key.
     * </p>
     * <p>
     * To generate a data key, specify the symmetric CMK that will be used to encrypt the data key. You cannot use an
     * asymmetric CMK to generate data keys. To get the type of your CMK, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * You must also specify the length of the data key. Use either the <code>KeySpec</code> or
     * <code>NumberOfBytes</code> parameters (but not both). For 128-bit and 256-bit data keys, use the
     * <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * If the operation succeeds, the plaintext copy of the data key is in the <code>Plaintext</code> field of the
     * response, and the encrypted copy of the data key in the <code>CiphertextBlob</code> field.
     * </p>
     * <p>
     * To get only an encrypted copy of the data key, use <a>GenerateDataKeyWithoutPlaintext</a>. To generate an
     * asymmetric data key pair, use the <a>GenerateDataKeyPair</a> or <a>GenerateDataKeyPairWithoutPlaintext</a>
     * operation. To get a cryptographically secure random byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * You can use the optional encryption context to add additional security to the encryption operation. If you
     * specify an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact
     * match) when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * InvalidCiphertextException. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally in your application:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <code>GenerateDataKey</code> operation to get a data encryption key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key (returned in the <code>Plaintext</code> field of the response) to encrypt data
     * locally, then erase the plaintext data key from memory.
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
     * Use the <a>Decrypt</a> operation to decrypt the encrypted data key. The operation returns a plaintext copy of the
     * data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * 
     * @param generateDataKeyRequest
     * @return Result of the GenerateDataKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateDataKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Generates a unique asymmetric data key pair. The <code>GenerateDataKeyPair</code> operation returns a plaintext
     * public key, a plaintext private key, and a copy of the private key that is encrypted under the symmetric CMK you
     * specify. You can use the data key pair to perform asymmetric cryptography outside of AWS KMS.
     * </p>
     * <p>
     * <code>GenerateDataKeyPair</code> returns a unique data key pair for each request. The bytes in the keys are not
     * related to the caller or the CMK that is used to encrypt the private key.
     * </p>
     * <p>
     * You can use the public key that <code>GenerateDataKeyPair</code> returns to encrypt data or verify a signature
     * outside of AWS KMS. Then, store the encrypted private key with the data. When you are ready to decrypt data or
     * sign a message, you can use the <a>Decrypt</a> operation to decrypt the encrypted private key.
     * </p>
     * <p>
     * To generate a data key pair, you must specify a symmetric customer master key (CMK) to encrypt the private key in
     * a data key pair. You cannot use an asymmetric CMK. To get the type of your CMK, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <p>
     * If you are using the data key pair to encrypt data, or for any operation where you don't immediately need a
     * private key, consider using the <a>GenerateDataKeyPairWithoutPlaintext</a> operation.
     * <code>GenerateDataKeyPairWithoutPlaintext</code> returns a plaintext public key and an encrypted private key, but
     * omits the plaintext private key that you need only to decrypt ciphertext or sign a message. Later, when you need
     * to decrypt the data or sign a message, use the <a>Decrypt</a> operation to decrypt the encrypted private key in
     * the data key pair.
     * </p>
     * <p>
     * You can use the optional encryption context to add additional security to the encryption operation. If you
     * specify an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact
     * match) when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * InvalidCiphertextException. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyPairRequest
     * @return Result of the GenerateDataKeyPair operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @sample AWSKMS.GenerateDataKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateDataKeyPairResult generateDataKeyPair(GenerateDataKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateDataKeyPair(request);
    }

    @SdkInternalApi
    final GenerateDataKeyPairResult executeGenerateDataKeyPair(GenerateDataKeyPairRequest generateDataKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(generateDataKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyPairRequest> request = null;
        Response<GenerateDataKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateDataKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateDataKeyPair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateDataKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateDataKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a unique asymmetric data key pair. The <code>GenerateDataKeyPairWithoutPlaintext</code> operation
     * returns a plaintext public key and a copy of the private key that is encrypted under the symmetric CMK you
     * specify. Unlike <a>GenerateDataKeyPair</a>, this operation does not return a plaintext private key.
     * </p>
     * <p>
     * To generate a data key pair, you must specify a symmetric customer master key (CMK) to encrypt the private key in
     * the data key pair. You cannot use an asymmetric CMK. To get the type of your CMK, use the <code>KeySpec</code>
     * field in the <a>DescribeKey</a> response.
     * </p>
     * <p>
     * You can use the public key that <code>GenerateDataKeyPairWithoutPlaintext</code> returns to encrypt data or
     * verify a signature outside of AWS KMS. Then, store the encrypted private key with the data. When you are ready to
     * decrypt data or sign a message, you can use the <a>Decrypt</a> operation to decrypt the encrypted private key.
     * </p>
     * <p>
     * <code>GenerateDataKeyPairWithoutPlaintext</code> returns a unique data key pair for each request. The bytes in
     * the key are not related to the caller or CMK that is used to encrypt the private key.
     * </p>
     * <p>
     * You can use the optional encryption context to add additional security to the encryption operation. If you
     * specify an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact
     * match) when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * InvalidCiphertextException. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyPairWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyPairWithoutPlaintext operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @sample AWSKMS.GenerateDataKeyPairWithoutPlaintext
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateDataKeyPairWithoutPlaintext"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GenerateDataKeyPairWithoutPlaintextResult generateDataKeyPairWithoutPlaintext(GenerateDataKeyPairWithoutPlaintextRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateDataKeyPairWithoutPlaintext(request);
    }

    @SdkInternalApi
    final GenerateDataKeyPairWithoutPlaintextResult executeGenerateDataKeyPairWithoutPlaintext(
            GenerateDataKeyPairWithoutPlaintextRequest generateDataKeyPairWithoutPlaintextRequest) {

        ExecutionContext executionContext = createExecutionContext(generateDataKeyPairWithoutPlaintextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyPairWithoutPlaintextRequest> request = null;
        Response<GenerateDataKeyPairWithoutPlaintextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyPairWithoutPlaintextRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(generateDataKeyPairWithoutPlaintextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateDataKeyPairWithoutPlaintext");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateDataKeyPairWithoutPlaintextResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GenerateDataKeyPairWithoutPlaintextResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a unique symmetric data key. This operation returns a data key that is encrypted under a customer
     * master key (CMK) that you specify. To request an asymmetric data key pair, use the <a>GenerateDataKeyPair</a> or
     * <a>GenerateDataKeyPairWithoutPlaintext</a> operations.
     * </p>
     * <p>
     * <code>GenerateDataKeyWithoutPlaintext</code> is identical to the <a>GenerateDataKey</a> operation except that
     * returns only the encrypted copy of the data key. This operation is useful for systems that need to encrypt data
     * at some point, but not immediately. When you need to encrypt the data, you call the <a>Decrypt</a> operation on
     * the encrypted copy of the key.
     * </p>
     * <p>
     * It's also useful in distributed systems with different levels of trust. For example, you might store encrypted
     * data in containers. One component of your system creates new containers and stores an encrypted data key with
     * each container. Then, a different component puts the data into the containers. That component first decrypts the
     * data key, uses the plaintext data key to encrypt data, puts the encrypted data into the container, and then
     * destroys the plaintext data key. In this system, the component that creates the containers never sees the
     * plaintext data key.
     * </p>
     * <p>
     * <code>GenerateDataKeyWithoutPlaintext</code> returns a unique data key for each request. The bytes in the keys
     * are not related to the caller or CMK that is used to encrypt the private key.
     * </p>
     * <p>
     * To generate a data key, you must specify the symmetric customer master key (CMK) that is used to encrypt the data
     * key. You cannot use an asymmetric CMK to generate a data key. To get the type of your CMK, use the
     * <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * If the operation succeeds, you will find the encrypted copy of the data key in the <code>CiphertextBlob</code>
     * field.
     * </p>
     * <p>
     * You can use the optional encryption context to add additional security to the encryption operation. If you
     * specify an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact
     * match) when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * InvalidCiphertextException. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyWithoutPlaintext operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateDataKeyWithoutPlaintext");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * By default, the random byte string is generated in AWS KMS. To generate the byte string in the AWS CloudHSM
     * cluster that is associated with a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>,
     * specify the custom key store ID.
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
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateRandom");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Gets a Boolean value that indicates whether <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic rotation of the key
     * material</a> is enabled for the specified customer master key (CMK).
     * </p>
     * <p>
     * You cannot enable automatic rotation of asymmetric CMKs, CMKs with imported key material, or CMKs in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * The key rotation status for these CMKs is always <code>false</code>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS
     * KMS does not rotate the backing key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending deletion: While a CMK is pending deletion, its key rotation status is <code>false</code> and AWS KMS does
     * not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
     * <code>KeyId</code> parameter.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return Result of the GetKeyRotationStatus operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyRotationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Returns the items you need to import key material into a symmetric, customer managed customer master key (CMK).
     * For more information about importing key material into AWS KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public key to encrypt the symmetric key
     * material. Store the import token to send with a subsequent <a>ImportKeyMaterial</a> request.
     * </p>
     * <p>
     * You must specify the key ID of the symmetric CMK into which you will import key material. This CMK's
     * <code>Origin</code> must be <code>EXTERNAL</code>. You must also specify the wrapping algorithm and type of
     * wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on an
     * asymmetric CMK or on any CMK in a different AWS account.
     * </p>
     * <p>
     * To import key material, you must use the public key and import token from the same response. These items are
     * valid for 24 hours. The expiration date and time appear in the <code>GetParametersForImport</code> response. You
     * cannot use an expired token in an <a>ImportKeyMaterial</a> request. If your key and token expire, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param getParametersForImportRequest
     * @return Result of the GetParametersForImport operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParametersForImport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Returns the public key of an asymmetric CMK. Unlike the private key of a asymmetric CMK, which never leaves AWS
     * KMS unencrypted, callers with <code>kms:GetPublicKey</code> permission can download the public key of an
     * asymmetric CMK. You can share the public key to allow others to encrypt messages and verify signatures outside of
     * AWS KMS. For information about symmetric and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You do not need to download the public key. Instead, you can use the public key within AWS KMS by calling the
     * <a>Encrypt</a>, <a>ReEncrypt</a>, or <a>Verify</a> operations with the identifier of an asymmetric CMK. When you
     * use the public key within AWS KMS, you benefit from the authentication, authorization, and logging that are part
     * of every AWS KMS operation. You also reduce of risk of encrypting data that cannot be decrypted. These features
     * are not effective outside of AWS KMS. For details, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/download-public-key.html#download-public-key-considerations"
     * >Special Considerations for Downloading Public Keys</a>.
     * </p>
     * <p>
     * To help you use the public key safely outside of AWS KMS, <code>GetPublicKey</code> returns important information
     * about the public key in the response, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_GetPublicKey.html#KMS-GetPublicKey-response-CustomerMasterKeySpec"
     * >CustomerMasterKeySpec</a>: The type of key material in the public key, such as <code>RSA_4096</code> or
     * <code>ECC_NIST_P521</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_GetPublicKey.html#KMS-GetPublicKey-response-KeyUsage"
     * >KeyUsage</a>: Whether the key is used for encryption or signing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_GetPublicKey.html#KMS-GetPublicKey-response-EncryptionAlgorithms"
     * >EncryptionAlgorithms</a> or <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_GetPublicKey.html#KMS-GetPublicKey-response-SigningAlgorithms"
     * >SigningAlgorithms</a>: A list of the encryption algorithms or the signing algorithms for the key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Although AWS KMS cannot enforce these restrictions on external operations, it is crucial that you use this
     * information to prevent the public key from being used improperly. For example, you can prevent a public signing
     * key from being used encrypt data, or prevent a public key from being used with an encryption algorithm that is
     * not supported by AWS KMS. You can also avoid errors, such as using the wrong signing algorithm in a verification
     * operation.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return Result of the GetPublicKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @sample AWSKMS.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPublicKeyResult getPublicKey(GetPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPublicKey(request);
    }

    @SdkInternalApi
    final GetPublicKeyResult executeGetPublicKey(GetPublicKeyRequest getPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicKeyRequest> request = null;
        Response<GetPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPublicKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPublicKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPublicKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports key material into an existing symmetric AWS KMS customer master key (CMK) that was created without key
     * material. After you successfully import key material into a CMK, you can <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material">reimport
     * the same key material</a> into that CMK, but you cannot import different key material.
     * </p>
     * <p>
     * You cannot perform this operation on an asymmetric CMK or on any CMK in a different AWS account. For more
     * information about creating CMKs with no key material and then importing key material, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
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
     * The import token that <a>GetParametersForImport</a> returned. You must use a public key and token from the same
     * <code>GetParametersForImport</code> response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the key material expires and if so, when. If you set an expiration date, AWS KMS deletes the key material
     * from the CMK on the specified date, and the CMK becomes unusable. To use the CMK again, you must reimport the
     * same key material. The only way to change an expiration date is by reimporting the same key material and
     * specifying a new expiration date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, the key state of the CMK changes from <code>PendingImport</code> to
     * <code>Enabled</code>, and you can use the CMK.
     * </p>
     * <p>
     * If this operation fails, use the exception to help determine the problem. If the error is related to the key
     * material, the import token, or wrapping key, use <a>GetParametersForImport</a> to get a new public key and import
     * token for the CMK and repeat the import procedure. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#importing-keys-overview">How To
     * Import Key Material</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param importKeyMaterialRequest
     * @return Result of the ImportKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.
     *         </p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because AWS KMS could not decrypt
     *         the encrypted (wrapped) key material.
     * @throws IncorrectKeyMaterialException
     *         The request was rejected because the key material in the request is, expired, invalid, or is not the same
     *         key material that was previously imported into this customer master key (CMK).
     * @throws ExpiredImportTokenException
     *         The request was rejected because the specified import token is expired. Use <a>GetParametersForImport</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportKeyMaterial");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For
     * more information about aliases, see <a>CreateAlias</a>.
     * </p>
     * <p>
     * By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that
     * point to a particular customer master key (CMK), use the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * The <code>ListAliases</code> response can include aliases that you created and associated with your customer
     * managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can
     * recognize AWS aliases because their names have the format <code>aws/&lt;service-name&gt;</code>, such as
     * <code>aws/dynamodb</code>.
     * </p>
     * <p>
     * The response might also include aliases that have no <code>TargetKeyId</code> field. These are predefined aliases
     * that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including
     * predefined aliases, do not count against your <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit">AWS KMS aliases quota</a>.
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
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
     * <code>KeyId</code> parameter.
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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeyPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and Region.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRetirableGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key Policies</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @return Result of the PutKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutKeyPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Decrypts ciphertext and then reencrypts it entirely within AWS KMS. You can use this operation to change the
     * customer master key (CMK) under which data is encrypted, such as when you <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotate-keys-manually">manually
     * rotate</a> a CMK or change the CMK that protects a ciphertext. You can also use it to reencrypt ciphertext under
     * the same CMK, such as to change the encryption context of a ciphertext.
     * </p>
     * <p>
     * The <code>ReEncrypt</code> operation can decrypt ciphertext that was encrypted by using an AWS KMS CMK in an AWS
     * KMS operation, such as <a>Encrypt</a> or <a>GenerateDataKey</a>. It can also decrypt ciphertext that was
     * encrypted by using the public key of an asymmetric CMK outside of AWS KMS. However, it cannot decrypt ciphertext
     * produced by other libraries, such as the <a
     * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">AWS Encryption SDK</a> or <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon S3 client-side
     * encryption</a>. These libraries return a ciphertext format that is incompatible with AWS KMS.
     * </p>
     * <p>
     * When you use the <code>ReEncrypt</code> operation, you need to provide information for the decrypt operation and
     * the subsequent encrypt operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your ciphertext was encrypted under an asymmetric CMK, you must identify the <i>source CMK</i>, that is, the
     * CMK that encrypted the ciphertext. You must also supply the encryption algorithm that was used. This information
     * is required to decrypt the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * It is optional, but you can specify a source CMK even when the ciphertext was encrypted under a symmetric CMK.
     * This ensures that the ciphertext is decrypted only by using a particular CMK. If the CMK that you specify cannot
     * decrypt the ciphertext, the <code>ReEncrypt</code> operation fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * To reencrypt the data, you must specify the <i>destination CMK</i>, that is, the CMK that re-encrypts the data
     * after it is decrypted. You can select a symmetric or asymmetric CMK. If the destination CMK is an asymmetric CMK,
     * you must also provide the encryption algorithm. The algorithm that you choose must be compatible with the CMK.
     * </p>
     * <important>
     * <p>
     * When you use an asymmetric CMK to encrypt or reencrypt data, be sure to record the CMK and encryption algorithm
     * that you choose. You will be required to provide the same CMK and encryption algorithm when you decrypt the data.
     * If the CMK and algorithm do not match the values used to encrypt the data, the decrypt operation fails.
     * </p>
     * <p>
     * You are not required to supply the CMK ID and encryption algorithm when you decrypt with symmetric CMKs because
     * AWS KMS stores this information in the ciphertext blob. AWS KMS cannot store metadata in ciphertext generated
     * with asymmetric keys. The standard format for asymmetric key ciphertext does not include configurable fields.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * Unlike other AWS KMS API operations, <code>ReEncrypt</code> callers must have two permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kms:EncryptFrom</code> permission on the source CMK
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kms:EncryptTo</code> permission on the destination CMK
     * </p>
     * </li>
     * </ul>
     * <p>
     * To permit reencryption from
     * </p>
     * <p>
     * or to a CMK, include the <code>"kms:ReEncrypt*"</code> permission in your <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policy</a>. This permission is
     * automatically included in the key policy when you use the console to create a CMK. But you must include it
     * manually when you create a CMK programmatically or when you use the <a>PutKeyPolicy</a> operation set a key
     * policy.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param reEncryptRequest
     * @return Result of the ReEncrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.</p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because AWS KMS could not decrypt
     *         the encrypted (wrapped) key material.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws IncorrectKeyException
     *         The request was rejected because the specified CMK cannot decrypt the data. The <code>KeyId</code> in a
     *         <a>Decrypt</a> request and the <code>SourceKeyId</code> in a <a>ReEncrypt</a> request must identify the
     *         same CMK that was used to encrypt the ciphertext.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReEncrypt");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetireGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the
     * <code>KeyId</code> parameter.
     * </p>
     * 
     * @param revokeGrantRequest
     * @return Result of the RevokeGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified <code>GrantId</code> is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * operation is successful, the key state of the CMK changes to <code>PendingDeletion</code>. Before the waiting
     * period ends, you can use <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the waiting period
     * ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was
     * encrypted under the CMK is unrecoverable. To prevent the use of a CMK without deleting it, use <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * If you schedule deletion of a CMK from a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>,
     * when the waiting period expires, <code>ScheduleKeyDeletion</code> deletes the CMK from AWS KMS. Then AWS KMS
     * makes a best effort to delete the key material from the associated AWS CloudHSM cluster. However, you might need
     * to manually <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key">delete
     * the orphaned key material</a> from the cluster and its backups.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * For more information about scheduling a CMK for deletion, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting Customer Master Keys</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return Result of the ScheduleKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ScheduleKeyDeletion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Creates a <a href="https://en.wikipedia.org/wiki/Digital_signature">digital signature</a> for a message or
     * message digest by using the private key in an asymmetric CMK. To verify the signature, use the <a>Verify</a>
     * operation, or use the public key in the same asymmetric CMK outside of AWS KMS. For information about symmetric
     * and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Digital signatures are generated and verified by using asymmetric key pair, such as an RSA or ECC pair that is
     * represented by an asymmetric customer master key (CMK). The key owner (or an authorized user) uses their private
     * key to sign a message. Anyone with the public key can verify that the message was signed with that particular
     * private key and that the message hasn't changed since it was signed.
     * </p>
     * <p>
     * To use the <code>Sign</code> operation, provide the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>KeyId</code> parameter to identify an asymmetric CMK with a <code>KeyUsage</code> value of
     * <code>SIGN_VERIFY</code>. To get the <code>KeyUsage</code> value of a CMK, use the <a>DescribeKey</a> operation.
     * The caller must have <code>kms:Sign</code> permission on the CMK.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>Message</code> parameter to specify the message or message digest to sign. You can submit messages
     * of up to 4096 bytes. To sign a larger message, generate a hash digest of the message, and then provide the hash
     * digest in the <code>Message</code> parameter. To indicate whether the message is a full message or a digest, use
     * the <code>MessageType</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Choose a signing algorithm that is compatible with the CMK.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When signing a message, be sure to record the CMK and the signing algorithm. This information is required to
     * verify the signature.
     * </p>
     * </important>
     * <p>
     * To verify the signature that this operation generates, use the <a>Verify</a> operation. Or use the
     * <a>GetPublicKey</a> operation to download the public key and then use the public key to verify the signature
     * outside of AWS KMS.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param signRequest
     * @return Result of the Sign operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @sample AWSKMS.Sign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Sign" target="_top">AWS API Documentation</a>
     */
    @Override
    public SignResult sign(SignRequest request) {
        request = beforeClientExecution(request);
        return executeSign(request);
    }

    @SdkInternalApi
    final SignResult executeSign(SignRequest signRequest) {

        ExecutionContext executionContext = createExecutionContext(signRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignRequest> request = null;
        Response<SignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(signRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Sign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SignResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new SignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS
     * account.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty (null) strings.
     * </p>
     * <p>
     * You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag
     * value with the specified value.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>AWS Key
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a
     * CMK in a different AWS account.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an existing tag key, use <a>TagResource</a>.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Associates an existing AWS KMS alias with a different customer master key (CMK). Each alias is associated with
     * only one CMK at a time, although a CMK can have multiple aliases. The alias and the CMK must be in the same AWS
     * account and region. You cannot perform this operation on an alias in a different AWS account.
     * </p>
     * <p>
     * The current and new CMK must be the same type (both symmetric or both asymmetric), and they must have the same
     * key usage (<code>ENCRYPT_DECRYPT</code> or <code>SIGN_VERIFY</code>). This restriction prevents errors in code
     * that uses aliases. If you must assign an alias to a different type of CMK, use <a>DeleteAlias</a> to delete the
     * old alias and <a>CreateAlias</a> to create a new alias.
     * </p>
     * <p>
     * You cannot use <code>UpdateAlias</code> to change an alias name. To change an alias name, use <a>DeleteAlias</a>
     * to delete the old alias and <a>CreateAlias</a> to create a new alias.
     * </p>
     * <p>
     * Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without
     * affecting the CMK. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get the
     * aliases of all CMKs in the account, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAlias");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * Changes the properties of a custom key store. Use the <code>CustomKeyStoreId</code> parameter to identify the
     * custom key store you want to edit. Use the remaining parameters to change the properties of the custom key store.
     * </p>
     * <p>
     * You can only update a custom key store that is disconnected. To disconnect the custom key store, use
     * <a>DisconnectCustomKeyStore</a>. To reconnect the custom key store after the update completes, use
     * <a>ConnectCustomKeyStore</a>. To find the connection state of a custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * Use the parameters of <code>UpdateCustomKeyStore</code> to edit your keystore settings.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <b>NewCustomKeyStoreName</b> parameter to change the friendly name of the custom key store to the value
     * that you specify.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * Use the <b>KeyStorePassword</b> parameter tell AWS KMS the current password of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user (CU)</a> in the associated AWS CloudHSM cluster. You can use this parameter to
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-password">fix
     * connection failures</a> that occur when AWS KMS cannot log into the associated cluster because the
     * <code>kmsuser</code> password has changed. This value does not change the password in the AWS CloudHSM cluster.
     * </p>
     * <p>
     * </p></li>
     * <li>
     * <p>
     * Use the <b>CloudHsmClusterId</b> parameter to associate the custom key store with a different, but related, AWS
     * CloudHSM cluster. You can use this parameter to repair a custom key store if its AWS CloudHSM cluster becomes
     * corrupted or is deleted, or when you need to create or restore a cluster from a backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">Custom Key Store
     * feature</a> feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the
     * isolation and control of a single-tenant key store.
     * </p>
     * 
     * @param updateCustomKeyStoreRequest
     * @return Result of the UpdateCustomKeyStore operation returned by the service.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because AWS KMS cannot find a custom key store with the specified key store name
     *         or ID.
     * @throws CustomKeyStoreNameInUseException
     *         The request was rejected because the specified custom key store name is already assigned to another
     *         custom key store in the account. Try again with a custom key store name that is unique in the account.
     * @throws CloudHsmClusterNotFoundException
     *         The request was rejected because AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster
     *         ID. Retry the request with a different cluster ID.
     * @throws CloudHsmClusterNotRelatedException
     *         The request was rejected because the specified AWS CloudHSM cluster has a different cluster certificate
     *         than the original cluster. You cannot use the operation to specify an unrelated cluster.</p>
     *         <p>
     *         Specify a cluster that shares a backup history with the original cluster. This includes clusters that
     *         were created from a backup of the current cluster, and clusters that were created from the same backup
     *         that produced the current cluster.
     *         </p>
     *         <p>
     *         Clusters that share a backup history have the same cluster certificate. To view the cluster certificate
     *         of a cluster, use the <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     *         </p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not
     *         connected. These operations are valid only when the custom key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key
     *         store that is not disconnected. This operation is valid only when the custom key store
     *         <code>ConnectionState</code> is <code>DISCONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values.
     *         </p>
     *         </li>
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the AWS CloudHSM cluster that is associated with the custom key store is
     *         not active. Initialize and activate the cluster and try the command again. For detailed instructions, see
     *         <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a>
     *         in the <i>AWS CloudHSM User Guide</i>.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated AWS CloudHSM cluster did not meet the configuration
     *         requirements for a custom key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The cluster must be configured with private subnets in at least two different Availability Zones in the
     *         Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the cluster. Do not delete or change them. To get information about a particular security
     *         group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the AWS
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         AWS CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the AWS CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an AWS CloudHSM cluster that is associated with a custom key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>AWS Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an AWS CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>AWS CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>AWS CloudHSM User Guide</i> </i>.
     * @sample AWSKMS.UpdateCustomKeyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateCustomKeyStore" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCustomKeyStoreResult updateCustomKeyStore(UpdateCustomKeyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomKeyStore(request);
    }

    @SdkInternalApi
    final UpdateCustomKeyStoreResult executeUpdateCustomKeyStore(UpdateCustomKeyStoreRequest updateCustomKeyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomKeyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomKeyStoreRequest> request = null;
        Response<UpdateCustomKeyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomKeyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCustomKeyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomKeyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomKeyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCustomKeyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of a customer master key (CMK). To see the description of a CMK, use <a>DescribeKey</a>.
     * </p>
     * <p>
     * You cannot perform this operation on a CMK in a different AWS account.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @return Result of the UpdateKeyDescription operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateKeyDescription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

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
     * <p>
     * Verifies a digital signature that was generated by the <a>Sign</a> operation.
     * </p>
     * <p/>
     * <p>
     * Verification confirms that an authorized user signed the message with the specified CMK and signing algorithm,
     * and the message hasn't changed since it was signed. If the signature is verified, the value of the
     * <code>SignatureValid</code> field in the response is <code>True</code>. If the signature verification fails, the
     * <code>Verify</code> operation fails with an <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * <p>
     * A digital signature is generated by using the private key in an asymmetric CMK. The signature is verified by
     * using the public key in the same asymmetric CMK. For information about symmetric and asymmetric CMKs, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using Symmetric and
     * Asymmetric CMKs</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To verify a digital signature, you can use the <code>Verify</code> operation. Specify the same asymmetric CMK,
     * message, and signing algorithm that were used to produce the signature.
     * </p>
     * <p>
     * You can also verify the digital signature by using the public key of the CMK outside of AWS KMS. Use the
     * <a>GetPublicKey</a> operation to download the public key in the asymmetric CMK and then use the public key to
     * verify the signature outside of AWS KMS. The advantage of using the <code>Verify</code> operation is that it is
     * performed within AWS KMS. As a result, it's easy to call, the operation is performed within the FIPS boundary, it
     * is logged in AWS CloudTrail, and you can use key policy and IAM policy to determine who is authorized to use the
     * CMK to verify signatures.
     * </p>
     * <p>
     * The CMK that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param verifyRequest
     * @return Result of the Verify operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified CMK is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified CMK was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the CMK is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the CMK <code>(CustomerMasterKeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. To find the <code>KeyUsage</code> of a CMK, use the <a>DescribeKey</a>
     *         operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular CMK, use the <a>DescribeKey</a>
     *         operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of
     *         a Customer Master Key</a> in the <i> <i>AWS Key Management Service Developer Guide</i> </i>.
     * @throws KMSInvalidSignatureException
     *         The request was rejected because the signature verification failed. Signature verification fails when it
     *         cannot confirm that signature was produced by signing the specified message with the specified CMK and
     *         signing algorithm.
     * @sample AWSKMS.Verify
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Verify" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyResult verify(VerifyRequest request) {
        request = beforeClientExecution(request);
        return executeVerify(request);
    }

    @SdkInternalApi
    final VerifyResult executeVerify(VerifyRequest verifyRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyRequest> request = null;
        Response<VerifyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "Verify");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new VerifyResultJsonUnmarshaller());
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
