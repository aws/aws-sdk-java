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
 * <fullname>Key Management Service</fullname>
 * <p>
 * Key Management Service (KMS) is an encryption and key management web service. This guide describes the KMS operations
 * that you can call programmatically. For general information about KMS, see the <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/"> <i>Key Management Service Developer Guide</i> </a>.
 * </p>
 * <note>
 * <p>
 * KMS has replaced the term <i>customer master key (CMK)</i> with <i>KMS key</i> and <i>KMS key</i>. The concept has
 * not changed. To prevent breaking changes, KMS is keeping some variations of this term.
 * </p>
 * <p>
 * Amazon Web Services provides SDKs that consist of libraries and sample code for various programming languages and
 * platforms (Java, Ruby, .Net, macOS, Android, etc.). The SDKs provide a convenient way to create programmatic access
 * to KMS and other Amazon Web Services services. For example, the SDKs take care of tasks such as signing requests (see
 * below), managing errors, and retrying requests automatically. For more information about the Amazon Web Services
 * SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the Amazon Web Services SDKs to make programmatic API calls to KMS.
 * </p>
 * <p>
 * If you need to use FIPS 140-2 validated cryptographic modules when communicating with Amazon Web Services, use the
 * FIPS endpoint in your preferred Amazon Web Services Region. For more information about the available FIPS endpoints,
 * see <a href="https://docs.aws.amazon.com/general/latest/gr/kms.html#kms_region">Service endpoints</a> in the Key
 * Management Service topic of the <i>Amazon Web Services General Reference</i>.
 * </p>
 * <p>
 * All KMS API calls must be signed and be transmitted using Transport Layer Security (TLS). KMS recommends you always
 * use the latest supported TLS version. Clients must also support cipher suites with Perfect Forward Secrecy (PFS) such
 * as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral Diffie-Hellman (ECDHE). Most modern systems such as
 * Java 7 and later support these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We strongly recommend that you <i>do
 * not</i> use your Amazon Web Services account (root) access key ID and secret access key for everyday work with KMS.
 * Instead, use the access key ID and secret access key for an IAM user. You can also use the Amazon Web Services
 * Security Token Service to generate temporary security credentials that you can use to sign requests.
 * </p>
 * <p>
 * All KMS operations require <a href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
 * Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * KMS supports CloudTrail, a service that logs Amazon Web Services API calls and related events for your Amazon Web
 * Services account and delivers them to an Amazon S3 bucket that you specify. By using the information collected by
 * CloudTrail, you can determine what requests were made to KMS, who made the request, when it was made, and so on. To
 * learn more about CloudTrail, including how to turn it on and find your log files, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/">CloudTrail User Guide</a>.
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
 * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">Amazon Web Services Security
 * Credentials</a> - This topic provides general information about the types of credentials used to access Amazon Web
 * Services.
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
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyInvalidConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyInvalidConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ExpiredImportTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.ExpiredImportTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomKeyStoreNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.CustomKeyStoreNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyVpcEndpointServiceInvalidConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyVpcEndpointServiceInvalidConfigurationExceptionUnmarshaller
                                            .getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("KMSInvalidMacException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.KMSInvalidMacExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyIncorrectAuthenticationCredentialException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyIncorrectAuthenticationCredentialExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MalformedPolicyDocumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.MalformedPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyUriUnreachableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyUriUnreachableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectKeyMaterialException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.IncorrectKeyMaterialExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidImportTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyUriInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyUriInUseExceptionUnmarshaller.getInstance()))
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
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyInvalidResponseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyInvalidResponseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantIdException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidGrantIdExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyUriEndpointInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyUriEndpointInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectKeyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.IncorrectKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidGrantTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidGrantTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksKeyInvalidConfigurationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksKeyInvalidConfigurationExceptionUnmarshaller.getInstance()))
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
                            new JsonErrorShapeMetadata().withErrorCode("XksKeyAlreadyInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksKeyAlreadyInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKeyUsageException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.InvalidKeyUsageExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyVpcEndpointServiceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyVpcEndpointServiceInUseExceptionUnmarshaller.getInstance()))
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
                            new JsonErrorShapeMetadata().withErrorCode("XksKeyNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksKeyNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("XksProxyVpcEndpointServiceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.kms.model.transform.XksProxyVpcEndpointServiceNotFoundExceptionUnmarshaller.getInstance()))
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
     * Cancels the deletion of a KMS key. When this operation succeeds, the key state of the KMS key is
     * <code>Disabled</code>. To enable the KMS key, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:CancelKeyDeletion</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>ScheduleKeyDeletion</a>
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return Result of the CancelKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * to its backing key store. For an CloudHSM key store, <code>ConnectCustomKeyStore</code> connects the key store to
     * its associated CloudHSM cluster. For an external key store, <code>ConnectCustomKeyStore</code> connects the key
     * store to the external key store proxy that communicates with your external key manager.
     * </p>
     * <p>
     * The custom key store must be connected before you can create KMS keys in the key store or use the KMS keys it
     * contains. You can disconnect and reconnect a custom key store at any time.
     * </p>
     * <p>
     * The connection process for a custom key store can take an extended amount of time to complete. This operation
     * starts the connection process, but it does not wait for it to complete. When it succeeds, this operation quickly
     * returns an HTTP 200 response and a JSON object with no properties. However, this response does not indicate that
     * the custom key store is connected. To get the connection state of the custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
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
     * <b>CloudHSM key store</b>
     * </p>
     * <p>
     * During the connection process for an CloudHSM key store, KMS finds the CloudHSM cluster that is associated with
     * the custom key store, creates the connection infrastructure, connects to the cluster, logs into the CloudHSM
     * client as the <code>kmsuser</code> CU, and rotates its password.
     * </p>
     * <p>
     * To connect an CloudHSM key store, its associated CloudHSM cluster must have at least one active HSM. To get the
     * number of active HSMs in a cluster, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html">DescribeClusters</a>
     * operation. To add HSMs to the cluster, use the <a
     * href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a> operation. Also,
     * the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-store-concepts.html#concept-kmsuser">
     * <code>kmsuser</code> crypto user</a> (CU) must not be logged into the cluster. This prevents KMS from using this
     * account to log in.
     * </p>
     * <p>
     * If you are having trouble connecting or disconnecting a CloudHSM key store, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting an CloudHSM key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>External key store</b>
     * </p>
     * <p>
     * When you connect an external key store that uses public endpoint connectivity, KMS tests its ability to
     * communicate with your external key manager by sending a request via the external key store proxy.
     * </p>
     * <p>
     * When you connect to an external key store that uses VPC endpoint service connectivity, KMS establishes the
     * networking elements that it needs to communicate with your external key manager via the external key store proxy.
     * This includes creating an interface endpoint to the VPC endpoint service and a private hosted zone for traffic
     * between KMS and the VPC endpoint service.
     * </p>
     * <p>
     * To connect an external key store, KMS must be able to connect to the external key store proxy, the external key
     * store proxy must be able to communicate with your external key manager, and the external key manager must be
     * available for cryptographic operations.
     * </p>
     * <p>
     * If you are having trouble connecting or disconnecting an external key store, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html">Troubleshooting an external
     * key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ConnectCustomKeyStore</a> (IAM policy)
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCustomKeyStores</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisconnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectCustomKeyStoreRequest
     * @return Result of the ConnectCustomKeyStore operation returned by the service.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the CloudHSM cluster associated with the CloudHSM key store is not
     *         active. Initialize and activate the cluster and try the command again. For detailed instructions, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a> in
     *         the <i>CloudHSM User Guide</i>.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated CloudHSM cluster did not meet the configuration
     *         requirements for an CloudHSM key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must be configured with private subnets in at least two different Availability Zones
     *         in the Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the CloudHSM cluster. Do not delete or change them. To get information about a particular
     *         security group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an CloudHSM cluster that is associated with an CloudHSM key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>CloudHSM User Guide</i> </i>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a friendly name for a KMS key.
     * </p>
     * <note>
     * <p>
     * Adding, deleting, or updating an alias can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * You can use an alias to identify a KMS key in the KMS console, in the <a>DescribeKey</a> operation and in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a>, such as <a>Encrypt</a> and <a>GenerateDataKey</a>. You can also change the KMS key that's
     * associated with the alias (<a>UpdateAlias</a>) or delete the alias (<a>DeleteAlias</a>) at any time. These
     * operations don't affect the underlying KMS key.
     * </p>
     * <p>
     * You can associate the alias with any customer managed key in the same Amazon Web Services Region. Each alias is
     * associated with only one KMS key at a time, but a KMS key can have multiple aliases. A valid KMS key is required.
     * You can't create an alias without a KMS key.
     * </p>
     * <p>
     * The alias must be unique in the account and Region, but you can have aliases with the same name in different
     * Regions. For detailed information about aliases, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html">Using aliases</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This operation does not return a response. To get the alias that you created, use the <a>ListAliases</a>
     * operation.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on an alias in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:CreateAlias
     * </a> on the alias (IAM policy).
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:CreateAlias
     * </a> on the KMS key (key policy).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html#alias-access">Controlling access to
     * aliases</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * key store</a> backed by a key store that you own and manage. When you use a KMS key in a custom key store for a
     * cryptographic operation, the cryptographic operation is actually performed in your key store using your keys. KMS
     * supports <a href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-cloudhsm.html">CloudHSM key
     * stores</a> backed by an <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/clusters.html">CloudHSM
     * cluster</a> and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external
     * key stores</a> backed by an external key store proxy and external key manager outside of Amazon Web Services.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
     * </p>
     * <p>
     * Before you create the custom key store, the required elements must be in place and operational. We recommend that
     * you use the test tools that KMS provides to verify the configuration your external key store proxy. For details
     * about the required elements and verification tests, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore">Assemble the
     * prerequisites (for CloudHSM key stores)</a> or <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-xks-keystore.html#xks-requirements">Assemble
     * the prerequisites (for external key stores)</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To create a custom key store, use the following parameters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create an CloudHSM key store, specify the <code>CustomKeyStoreName</code>, <code>CloudHsmClusterId</code>,
     * <code>KeyStorePassword</code>, and <code>TrustAnchorCertificate</code>. The <code>CustomKeyStoreType</code>
     * parameter is optional for CloudHSM key stores. If you include it, set it to the default value,
     * <code>AWS_CLOUDHSM</code>. For help with failures, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting an CloudHSM key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create an external key store, specify the <code>CustomKeyStoreName</code> and a
     * <code>CustomKeyStoreType</code> of <code>EXTERNAL_KEY_STORE</code>. Also, specify values for
     * <code>XksProxyConnectivity</code>, <code>XksProxyAuthenticationCredential</code>,
     * <code>XksProxyUriEndpoint</code>, and <code>XksProxyUriPath</code>. If your <code>XksProxyConnectivity</code>
     * value is <code>VPC_ENDPOINT_SERVICE</code>, specify the <code>XksProxyVpcEndpointServiceName</code> parameter.
     * For help with failures, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html">Troubleshooting an external
     * key store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * For external key stores:
     * </p>
     * <p>
     * Some external key managers provide a simpler method for creating an external key store. For details, see your
     * external key manager documentation.
     * </p>
     * <p>
     * When creating an external key store in the KMS console, you can upload a JSON-based proxy configuration file with
     * the desired values. You cannot use a proxy configuration with the <code>CreateCustomKeyStore</code> operation.
     * However, you can use the values in the file to help you determine the correct values for the
     * <code>CreateCustomKeyStore</code> parameters.
     * </p>
     * </note>
     * <p>
     * When the operation completes successfully, it returns the ID of the new custom key store. Before you can use your
     * new custom key store, you need to use the <a>ConnectCustomKeyStore</a> operation to connect a new CloudHSM key
     * store to its CloudHSM cluster, or to connect a new external key store to the external key store proxy for your
     * external key manager. Even if you are not going to use your custom key store immediately, you might want to
     * connect it to verify that all settings are correct and then disconnect it until you are ready to use it.
     * </p>
     * <p>
     * For help with failures, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting a custom key
     * store</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:CreateCustomKeyStore</a> (IAM policy).
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ConnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCustomKeyStores</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisconnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCustomKeyStoreRequest
     * @return Result of the CreateCustomKeyStore operation returned by the service.
     * @throws CloudHsmClusterInUseException
     *         The request was rejected because the specified CloudHSM cluster is already associated with an CloudHSM
     *         key store in the account, or it shares a backup history with an CloudHSM key store in the account. Each
     *         CloudHSM key store in the account must be associated with a different CloudHSM cluster.</p>
     *         <p>
     *         CloudHSM clusters that share a backup history have the same cluster certificate. To view the cluster
     *         certificate of an CloudHSM cluster, use the <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_DescribeClusters.html"
     *         >DescribeClusters</a> operation.
     * @throws CustomKeyStoreNameInUseException
     *         The request was rejected because the specified custom key store name is already assigned to another
     *         custom key store in the account. Try again with a custom key store name that is unique in the account.
     * @throws CloudHsmClusterNotFoundException
     *         The request was rejected because KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *         Retry the request with a different cluster ID.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the CloudHSM cluster associated with the CloudHSM key store is not
     *         active. Initialize and activate the cluster and try the command again. For detailed instructions, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a> in
     *         the <i>CloudHSM User Guide</i>.
     * @throws IncorrectTrustAnchorException
     *         The request was rejected because the trust anchor certificate in the request to create an CloudHSM key
     *         store is not the trust anchor certificate for the specified CloudHSM cluster.
     *         </p>
     *         <p>
     *         When you <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
     *         the CloudHSM cluster</a>, you create the trust anchor certificate and save it in the
     *         <code>customerCA.crt</code> file.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated CloudHSM cluster did not meet the configuration
     *         requirements for an CloudHSM key store.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must be configured with private subnets in at least two different Availability Zones
     *         in the Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the CloudHSM cluster. Do not delete or change them. To get information about a particular
     *         security group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an CloudHSM cluster that is associated with an CloudHSM key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>CloudHSM User Guide</i> </i>.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws XksProxyUriInUseException
     *         The request was rejected because the concatenation of the <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> is already associated with an external key store in the Amazon Web Services
     *         account and Region. Each external key store in an account and Region must use a unique external key store
     *         proxy API address.
     * @throws XksProxyUriEndpointInUseException
     *         The request was rejected because the concatenation of the <code>XksProxyUriEndpoint</code> is already
     *         associated with an external key store in the Amazon Web Services account and Region. Each external key
     *         store in an account and Region must use a unique external key store proxy address.
     * @throws XksProxyUriUnreachableException
     *         KMS was unable to reach the specified <code>XksProxyUriPath</code>. The path must be reachable before you
     *         create the external key store or update its settings.
     *         </p>
     *         <p>
     *         This exception is also thrown when the external key store proxy response to a
     *         <code>GetHealthStatus</code> request indicates that all external key manager instances are unavailable.
     * @throws XksProxyIncorrectAuthenticationCredentialException
     *         The request was rejected because the proxy credentials failed to authenticate to the specified external
     *         key store proxy. The specified external key store proxy rejected a status request from KMS due to invalid
     *         credentials. This can indicate an error in the credentials or in the identification of the external key
     *         store proxy.
     * @throws XksProxyVpcEndpointServiceInUseException
     *         The request was rejected because the specified Amazon VPC endpoint service is already associated with an
     *         external key store in the Amazon Web Services account and Region. Each external key store in an Amazon
     *         Web Services account and Region must use a different Amazon VPC endpoint service.
     * @throws XksProxyVpcEndpointServiceNotFoundException
     *         The request was rejected because KMS could not find the specified VPC endpoint service. Use
     *         <a>DescribeCustomKeyStores</a> to verify the VPC endpoint service name for the external key store. Also,
     *         confirm that the <code>Allow principals</code> list for the VPC endpoint service includes the KMS service
     *         principal for the Region, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * @throws XksProxyVpcEndpointServiceInvalidConfigurationException
     *         The request was rejected because the Amazon VPC endpoint service configuration does not fulfill the
     *         requirements for an external key store proxy. For details, see the exception message and <a
     *         href="kms/latest/developerguide/vpc-connectivity.html#xks-vpc-requirements">review the requirements</a>
     *         for Amazon VPC endpoint service connectivity for an external key store.
     * @throws XksProxyInvalidResponseException
     *         <p>
     *         KMS cannot interpret the response it received from the external key store proxy. The problem might be a
     *         poorly constructed response, but it could also be a transient network issue. If you see this error
     *         repeatedly, report it to the proxy vendor.
     * @throws XksProxyInvalidConfigurationException
     *         The request was rejected because the Amazon VPC endpoint service configuration does not fulfill the
     *         requirements for an external key store proxy. For details, see the exception message.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Adds a grant to a KMS key.
     * </p>
     * <p>
     * A <i>grant</i> is a policy instrument that allows Amazon Web Services principals to use KMS keys in cryptographic
     * operations. It also can allow them to view a KMS key (<a>DescribeKey</a>) and create and manage grants. When
     * authorizing access to a KMS key, grants are considered along with key policies and IAM policies. Grants are often
     * used for temporary permissions because you can create one, use its permissions, and delete it without changing
     * your key policies or IAM policies.
     * </p>
     * <p>
     * For detailed information about grants, including grant terminology, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants in KMS</a> in the <i> <i>Key
     * Management Service Developer Guide</i> </i>. For examples of working with grants in several programming
     * languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html">Programming grants</a>.
     * </p>
     * <p>
     * The <code>CreateGrant</code> operation returns a <code>GrantToken</code> and a <code>GrantId</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you create, retire, or revoke a grant, there might be a brief delay, usually less than five minutes, until
     * the grant is available throughout KMS. This state is known as <i>eventual consistency</i>. Once the grant has
     * achieved eventual consistency, the grantee principal can use the permissions in the grant without identifying the
     * grant.
     * </p>
     * <p>
     * However, to use the permissions in the grant immediately, use the <code>GrantToken</code> that
     * <code>CreateGrant</code> returns. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#using-grant-token">Using a grant
     * token</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>CreateGrant</code> operation also returns a <code>GrantId</code>. You can use the <code>GrantId</code>
     * and a key identifier to identify the grant in the <a>RetireGrant</a> and <a>RevokeGrant</a> operations. To find
     * the grant ID, use the <a>ListGrants</a> or <a>ListRetirableGrants</a> operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a different Amazon Web Services account,
     * specify the key ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:CreateGrant</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListRetirableGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RetireGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RevokeGrant</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createGrantRequest
     * @return Result of the CreateGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms-keys">KMS key</a> in your Amazon
     * Web Services account and Region. You can use a KMS key in cryptographic operations, such as encryption and
     * signing. Some Amazon Web Services services let you use KMS keys that you create and manage to protect your
     * service resources.
     * </p>
     * <p>
     * A KMS key is a logical representation of a cryptographic key. In addition to the key material used in
     * cryptographic operations, a KMS key includes metadata, such as the key ID, key policy, creation date,
     * description, and key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the <i>Key
     * Management Service Developer Guide</i>
     * </p>
     * <p>
     * Use the parameters of <code>CreateKey</code> to specify the type of KMS key, the source of its key material, its
     * key policy, description, tags, and other properties.
     * </p>
     * <note>
     * <p>
     * KMS has replaced the term <i>customer master key (CMK)</i> with <i>KMS key</i> and <i>KMS key</i>. The concept
     * has not changed. To prevent breaking changes, KMS is keeping some variations of this term.
     * </p>
     * </note>
     * <p>
     * To create different types of KMS keys, use the following guidance:
     * </p>
     * <dl>
     * <dt>Symmetric encryption KMS key</dt>
     * <dd>
     * <p>
     * By default, <code>CreateKey</code> creates a symmetric encryption KMS key with key material that KMS generates.
     * This is the basic and most widely used type of KMS key, and provides the best performance.
     * </p>
     * <p>
     * To create a symmetric encryption KMS key, you don't need to specify any parameters. The default value for
     * <code>KeySpec</code>, <code>SYMMETRIC_DEFAULT</code>, the default value for <code>KeyUsage</code>,
     * <code>ENCRYPT_DECRYPT</code>, and the default value for <code>Origin</code>, <code>AWS_KMS</code>, create a
     * symmetric encryption KMS key with KMS key material.
     * </p>
     * <p>
     * If you need a key for basic encryption and decryption or you are creating a KMS key to protect your resources in
     * an Amazon Web Services service, create a symmetric encryption KMS key. The key material in a symmetric encryption
     * key never leaves KMS unencrypted. You can use a symmetric encryption KMS key to encrypt and decrypt data up to
     * 4,096 bytes, but they are typically used to generate data keys and data keys pairs. For details, see
     * <a>GenerateDataKey</a> and <a>GenerateDataKeyPair</a>.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Asymmetric KMS keys</dt>
     * <dd>
     * <p>
     * To create an asymmetric KMS key, use the <code>KeySpec</code> parameter to specify the type of key material in
     * the KMS key. Then, use the <code>KeyUsage</code> parameter to determine whether the KMS key will be used to
     * encrypt and decrypt or sign and verify. You can't change these properties after the KMS key is created.
     * </p>
     * <p>
     * Asymmetric KMS keys contain an RSA key pair, Elliptic Curve (ECC) key pair, or an SM2 key pair (China Regions
     * only). The private key in an asymmetric KMS key never leaves KMS unencrypted. However, you can use the
     * <a>GetPublicKey</a> operation to download the public key so it can be used outside of KMS. KMS keys with RSA or
     * SM2 key pairs can be used to encrypt or decrypt data or sign and verify messages (but not both). KMS keys with
     * ECC key pairs can be used only to sign and verify messages. For information about asymmetric KMS keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Asymmetric KMS keys</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * </p></dd>
     * <dt>HMAC KMS key</dt>
     * <dd>
     * <p>
     * To create an HMAC KMS key, set the <code>KeySpec</code> parameter to a key spec value for HMAC KMS keys. Then set
     * the <code>KeyUsage</code> parameter to <code>GENERATE_VERIFY_MAC</code>. You must set the key usage even though
     * <code>GENERATE_VERIFY_MAC</code> is the only valid key usage value for HMAC KMS keys. You can't change these
     * properties after the KMS key is created.
     * </p>
     * <p>
     * HMAC KMS keys are symmetric keys that never leave KMS unencrypted. You can use HMAC keys to generate
     * (<a>GenerateMac</a>) and verify (<a>VerifyMac</a>) HMAC codes for messages up to 4096 bytes.
     * </p>
     * <p>
     * HMAC KMS keys are not supported in all Amazon Web Services Regions. If you try to create an HMAC KMS key in an
     * Amazon Web Services Region in which HMAC keys are not supported, the <code>CreateKey</code> operation returns an
     * <code>UnsupportedOperationException</code>. For a list of Regions in which HMAC KMS keys are supported, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC keys in KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Multi-Region primary keys</dt>
     * <dt>Imported key material</dt>
     * <dd>
     * <p>
     * To create a multi-Region <i>primary key</i> in the local Amazon Web Services Region, use the
     * <code>MultiRegion</code> parameter with a value of <code>True</code>. To create a multi-Region <i>replica
     * key</i>, that is, a KMS key with the same key ID and key material as a primary key, but in a different Amazon Web
     * Services Region, use the <a>ReplicateKey</a> operation. To change a replica key to a primary key, and its primary
     * key to a replica key, use the <a>UpdatePrimaryRegion</a> operation.
     * </p>
     * <p>
     * You can create multi-Region KMS keys for all supported KMS key types: symmetric encryption KMS keys, HMAC KMS
     * keys, asymmetric encryption KMS keys, and asymmetric signing KMS keys. You can also create multi-Region keys with
     * imported key material. However, you can't create multi-Region keys in a custom key store.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * </p></dd>
     * <dd>
     * <p>
     * To import your own key material into a KMS key, begin by creating a symmetric encryption KMS key with no key
     * material. To do this, use the <code>Origin</code> parameter of <code>CreateKey</code> with a value of
     * <code>EXTERNAL</code>. Next, use <a>GetParametersForImport</a> operation to get a public key and import token,
     * and use the public key to encrypt your key material. Then, use <a>ImportKeyMaterial</a> with your import token to
     * import the key material. For step-by-step instructions, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * This feature supports only symmetric encryption KMS keys, including multi-Region symmetric encryption KMS keys.
     * You cannot import key material into any other type of KMS key.
     * </p>
     * <p>
     * To create a multi-Region primary key with imported key material, use the <code>Origin</code> parameter of
     * <code>CreateKey</code> with a value of <code>EXTERNAL</code> and the <code>MultiRegion</code> parameter with a
     * value of <code>True</code>. To create replicas of the multi-Region primary key, use the <a>ReplicateKey</a>
     * operation. For instructions, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html ">Importing key
     * material into multi-Region keys</a>. For more information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * </p></dd>
     * <dt>Custom key store</dt>
     * <dd>
     * <p>
     * A <a href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key
     * store</a> lets you protect your Amazon Web Services resources using keys in a backing key store that you own and
     * manage. When you request a cryptographic operation with a KMS key in a custom key store, the operation is
     * performed in the backing key store using its cryptographic keys.
     * </p>
     * <p>
     * KMS supports <a href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-cloudhsm.html">CloudHSM key
     * stores</a> backed by an CloudHSM cluster and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key stores</a>
     * backed by an external key manager outside of Amazon Web Services. When you create a KMS key in an CloudHSM key
     * store, KMS generates an encryption key in the CloudHSM cluster and associates it with the KMS key. When you
     * create a KMS key in an external key store, you specify an existing encryption key in the external key manager.
     * </p>
     * <note>
     * <p>
     * Some external key managers provide a simpler method for creating a KMS key in an external key store. For details,
     * see your external key manager documentation.
     * </p>
     * </note>
     * <p>
     * Before you create a KMS key in a custom key store, the <code>ConnectionState</code> of the key store must be
     * <code>CONNECTED</code>. To connect the custom key store, use the <a>ConnectCustomKeyStore</a> operation. To find
     * the <code>ConnectionState</code>, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * To create a KMS key in a custom key store, use the <code>CustomKeyStoreId</code>. Use the default
     * <code>KeySpec</code> value, <code>SYMMETRIC_DEFAULT</code>, and the default <code>KeyUsage</code> value,
     * <code>ENCRYPT_DECRYPT</code> to create a symmetric encryption key. No other key type is supported in a custom key
     * store.
     * </p>
     * <p>
     * To create a KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-cloudhsm.html">CloudHSM key store</a>, use
     * the <code>Origin</code> parameter with a value of <code>AWS_CLOUDHSM</code>. The CloudHSM cluster that is
     * associated with the custom key store must have at least two active HSMs in different Availability Zones in the
     * Amazon Web Services Region.
     * </p>
     * <p>
     * To create a KMS key in an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/keystore-external.html">external key store</a>, use
     * the <code>Origin</code> parameter with a value of <code>EXTERNAL_KEY_STORE</code> and an <code>XksKeyId</code>
     * parameter that identifies an existing external key.
     * </p>
     * <note>
     * <p>
     * Some external key managers provide a simpler method for creating a KMS key in an external key store. For details,
     * see your external key manager documentation.
     * </p>
     * </note></dd>
     * </dl>
     * <p>
     * <b>Cross-account use</b>: No. You cannot use this operation to create a KMS key in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:CreateKey</a>
     * (IAM policy). To use the <code>Tags</code> parameter, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> (IAM policy). For examples and information about related permissions, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/iam-policies.html#iam-policy-example-create-key"
     * >Allow a user to create KMS keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ScheduleKeyDeletion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @return Result of the CreateKey operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated CloudHSM cluster did not meet the configuration
     *         requirements for an CloudHSM key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must be configured with private subnets in at least two different Availability Zones
     *         in the Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the CloudHSM cluster. Do not delete or change them. To get information about a particular
     *         security group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an CloudHSM cluster that is associated with an CloudHSM key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>CloudHSM User Guide</i> </i>.
     * @throws XksKeyInvalidConfigurationException
     *         The request was rejected because the external key specified by the <code>XksKeyId</code> parameter did
     *         not meet the configuration requirements for an external key store.
     *         </p>
     *         <p>
     *         The external key must be an AES-256 symmetric key that is enabled and performs encryption and decryption.
     * @throws XksKeyAlreadyInUseException
     *         The request was rejected because the (<code>XksKeyId</code>) is already associated with a KMS key in this
     *         external key store. Each KMS key in an external key store must be associated with a different external
     *         key.
     * @throws XksKeyNotFoundException
     *         The request was rejected because the external key store proxy could not find the external key. This
     *         exception is thrown when the value of the <code>XksKeyId</code> parameter doesn't identify a key in the
     *         external key manager associated with the external key proxy.
     *         </p>
     *         <p>
     *         Verify that the <code>XksKeyId</code> represents an existing key in the external key manager. Use the key
     *         identifier that the external key store proxy uses to identify the key. For details, see the documentation
     *         provided with your external key store proxy or key manager.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Decrypts ciphertext that was encrypted by a KMS key using any of the following operations:
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
     * You can use this operation to decrypt ciphertext that was encrypted under a symmetric encryption KMS key or an
     * asymmetric encryption KMS key. When the KMS key is asymmetric, you must specify the KMS key and the encryption
     * algorithm that was used to encrypt the ciphertext. For information about asymmetric KMS keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Asymmetric KMS keys</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The <code>Decrypt</code> operation also decrypts ciphertext that was encrypted outside of KMS by the public key
     * in an KMS asymmetric KMS key. However, it cannot decrypt symmetric ciphertext produced by other libraries, such
     * as the <a href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">Amazon Web Services
     * Encryption SDK</a> or <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon S3 client-side
     * encryption</a>. These libraries return a ciphertext format that is incompatible with KMS.
     * </p>
     * <p>
     * If the ciphertext was encrypted under a symmetric encryption KMS key, the <code>KeyId</code> parameter is
     * optional. KMS can get this information from metadata that it adds to the symmetric ciphertext blob. This feature
     * adds durability to your implementation by ensuring that authorized users can decrypt ciphertext decades after it
     * was encrypted, even if they've lost track of the key ID. However, specifying the KMS key is always recommended as
     * a best practice. When you use the <code>KeyId</code> parameter to specify a KMS key, KMS only uses the KMS key
     * you specify. If the ciphertext was encrypted under a different KMS key, the <code>Decrypt</code> operation fails.
     * This practice ensures that you use the KMS key that you intend.
     * </p>
     * <p>
     * Whenever possible, use key policies to give users permission to call the <code>Decrypt</code> operation on a
     * particular KMS key, instead of using IAM policies. Otherwise, you might create an IAM user policy that gives the
     * user <code>Decrypt</code> permission on all KMS keys. This user could decrypt ciphertext that was encrypted by
     * KMS keys in other accounts if the key policy for the cross-account KMS key permits it. If you must use an IAM
     * policy for <code>Decrypt</code> permissions, limit the user to particular KMS keys or particular trusted
     * accounts. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/iam-policies.html#iam-policies-best-practices">Best
     * practices for IAM policies</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Applications in Amazon Web Services Nitro Enclaves can call this operation by using the <a
     * href="https://github.com/aws/aws-nitro-enclaves-sdk-c">Amazon Web Services Nitro Enclaves Development Kit</a>.
     * For information about the supporting parameters, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves use KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:Decrypt</a>
     * (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
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
     * <a>ReEncrypt</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param decryptRequest
     * @return Result of the Decrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.</p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because KMS could not decrypt the
     *         encrypted (wrapped) key material.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws IncorrectKeyException
     *         The request was rejected because the specified KMS key cannot decrypt the data. The <code>KeyId</code> in
     *         a <a>Decrypt</a> request and the <code>SourceKeyId</code> in a <a>ReEncrypt</a> request must identify the
     *         same KMS key that was used to encrypt the ciphertext.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes the specified alias.
     * </p>
     * <note>
     * <p>
     * Adding, deleting, or updating an alias can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Because an alias is not a property of a KMS key, you can delete and change the aliases of a KMS key without
     * affecting the KMS key. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation. To get
     * the aliases of all KMS keys, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * Each KMS key can have multiple aliases. To change the alias of a KMS key, use <a>DeleteAlias</a> to delete the
     * current alias and <a>CreateAlias</a> to create a new alias. To associate an existing alias with a different KMS
     * key, call <a>UpdateAlias</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on an alias in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:DeleteAlias
     * </a> on the alias (IAM policy).
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:DeleteAlias
     * </a> on the KMS key (key policy).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html#alias-access">Controlling access to
     * aliases</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * key store</a>. This operation does not affect any backing elements of the custom key store. It does not delete
     * the CloudHSM cluster that is associated with an CloudHSM key store, or affect any users or keys in the cluster.
     * For an external key store, it does not affect the external key store proxy, external key manager, or any external
     * keys.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
     * </p>
     * <p>
     * The custom key store that you delete cannot contain any <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#kms_keys">KMS keys</a>. Before deleting
     * the key store, verify that you will never need to use any of the KMS keys in the key store for any <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a>. Then, use <a>ScheduleKeyDeletion</a> to delete the KMS keys from the key store. After the
     * required waiting period expires and all KMS keys are deleted from the custom key store, use
     * <a>DisconnectCustomKeyStore</a> to disconnect the key store from KMS. Then, you can delete the custom key store.
     * </p>
     * <p>
     * For keys in an CloudHSM key store, the <code>ScheduleKeyDeletion</code> operation makes a best effort to delete
     * the key material from the associated cluster. However, you might need to manually <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key">delete
     * the orphaned key material</a> from the cluster and its backups. KMS never creates, manages, or deletes
     * cryptographic keys in the external key manager associated with an external key store. You must manage them using
     * your external key manager tools.
     * </p>
     * <p>
     * Instead of deleting the custom key store, consider using the <a>DisconnectCustomKeyStore</a> operation to
     * disconnect the custom key store from its backing key store. While the key store is disconnected, you cannot
     * create or use the KMS keys in the key store. But, you do not need to delete KMS keys and you can reconnect a
     * disconnected custom key store at any time.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DeleteCustomKeyStore</a> (IAM policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ConnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCustomKeyStores</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisconnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteCustomKeyStoreRequest
     * @return Result of the DeleteCustomKeyStore operation returned by the service.
     * @throws CustomKeyStoreHasCMKsException
     *         The request was rejected because the custom key store contains KMS keys. After verifying that you do not
     *         need to use the KMS keys, use the <a>ScheduleKeyDeletion</a> operation to delete the KMS keys. After they
     *         are deleted, you can delete the custom key store.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes key material that you previously imported. This operation makes the specified KMS key unusable. For more
     * information about importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing Key Material</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When the specified KMS key is in the <code>PendingDeletion</code> state, this operation does not change the KMS
     * key's state. Otherwise, it changes the KMS key's state to <code>PendingImport</code>.
     * </p>
     * <p>
     * After you delete key material, you can use <a>ImportKeyMaterial</a> to reimport the same key material into the
     * KMS key.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DeleteImportedKeyMaterial</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ImportKeyMaterial</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteImportedKeyMaterialRequest
     * @return Result of the DeleteImportedKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * in the account and Region.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
     * </p>
     * <p>
     * By default, this operation returns information about all custom key stores in the account and Region. To get only
     * information about a particular custom key store, use either the <code>CustomKeyStoreName</code> or
     * <code>CustomKeyStoreId</code> parameter (but not both).
     * </p>
     * <p>
     * To determine whether the custom key store is connected to its CloudHSM cluster or external key store proxy, use
     * the <code>ConnectionState</code> element in the response. If an attempt to connect the custom key store failed,
     * the <code>ConnectionState</code> value is <code>FAILED</code> and the <code>ConnectionErrorCode</code> element in
     * the response indicates the cause of the failure. For help interpreting the <code>ConnectionErrorCode</code>, see
     * <a>CustomKeyStoresListEntry</a>.
     * </p>
     * <p>
     * Custom key stores have a <code>DISCONNECTED</code> connection state if the key store has never been connected or
     * you used the <a>DisconnectCustomKeyStore</a> operation to disconnect it. Otherwise, the connection state is
     * CONNECTED. If your custom key store connection state is <code>CONNECTED</code> but you are having trouble using
     * it, verify that the backing store is active and available. For an CloudHSM key store, verify that the associated
     * CloudHSM cluster is active and contains the minimum number of HSMs required for the operation, if any. For an
     * external key store, verify that the external key store proxy and its associated external key manager are
     * reachable and enabled.
     * </p>
     * <p>
     * For help repairing your CloudHSM key store, see the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html">Troubleshooting CloudHSM key
     * stores</a>. For help repairing your external key store, see the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/xks-troubleshooting.html">Troubleshooting external
     * key stores</a>. Both topics are in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DescribeCustomKeyStores</a> (IAM policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ConnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisconnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeCustomKeyStoresRequest
     * @return Result of the DescribeCustomKeyStores operation returned by the service.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Provides detailed information about a KMS key. You can run <code>DescribeKey</code> on a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a>
     * or an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web
     * Services managed key</a>.
     * </p>
     * <p>
     * This detailed information includes the key ARN, creation date (and deletion date, if applicable), the key state,
     * and the origin and expiration date (if any) of the key material. It includes fields, like <code>KeySpec</code>,
     * that help you distinguish different types of KMS keys. It also displays the key usage (encryption, signing, or
     * generating and verifying MACs) and the algorithms that the KMS key supports.
     * </p>
     * <p>
     * For <a href="kms/latest/developerguide/multi-region-keys-overview.html">multi-Region keys</a>,
     * <code>DescribeKey</code> displays the primary key and all related replica keys. For KMS keys in <a
     * href="kms/latest/developerguide/keystore-cloudhsm.html">CloudHSM key stores</a>, it includes information about
     * the key store, such as the key store ID and the CloudHSM cluster ID. For KMS keys in <a
     * href="kms/latest/developerguide/keystore-external.html">external key stores</a>, it includes the custom key store
     * ID and the ID of the external key.
     * </p>
     * <p>
     * <code>DescribeKey</code> does not return the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Aliases associated with the KMS key. To get this information, use <a>ListAliases</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether automatic key rotation is enabled on the KMS key. To get this information, use
     * <a>GetKeyRotationStatus</a>. Also, some key states prevent a KMS key from being automatically rotated. For
     * details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotate-keys-how-it-works">How
     * Automatic Key Rotation Works</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags on the KMS key. To get this information, use <a>ListResourceTags</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key policies and grants on the KMS key. To get this information, use <a>GetKeyPolicy</a> and <a>ListGrants</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In general, <code>DescribeKey</code> is a non-mutating operation. It returns data about KMS keys, but doesn't
     * change them. However, Amazon Web Services services use <code>DescribeKey</code> to create <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed keys</a> from a <i>predefined Amazon Web Services alias</i> with no key ID.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DescribeKey</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetKeyPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKeyRotationStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListResourceTags</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListRetirableGrants</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeKeyRequest
     * @return Result of the DescribeKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Sets the state of a KMS key to disabled. This change temporarily prevents use of the KMS key for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a>.
     * </p>
     * <p>
     * For more information about how key state affects the use of a KMS key, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the <i>
     * <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DisableKey</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>EnableKey</a>
     * </p>
     * 
     * @param disableKeyRequest
     * @return Result of the DisableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * the key material</a> of the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * Automatic key rotation is supported only on symmetric encryption KMS keys. You cannot enable automatic rotation
     * of <a href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS
     * keys</a>, <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys
     * with <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key
     * material</a>, or KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * You can enable (<a>EnableKeyRotation</a>) and disable automatic rotation of the key material in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed KMS
     * keys</a>. Key material rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed KMS keys</a> is not configurable. KMS always rotates the key material for every year. Rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk">Amazon Web Services
     * owned KMS keys</a> varies.
     * </p>
     * <note>
     * <p>
     * In May 2022, KMS changed the rotation schedule for Amazon Web Services managed keys from every three years to
     * every year. For details, see <a>EnableKeyRotation</a>.
     * </p>
     * </note>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DisableKeyRotation</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>EnableKeyRotation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKeyRotationStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param disableKeyRotationRequest
     * @return Result of the DisableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * from its backing key store. This operation disconnects an CloudHSM key store from its associated CloudHSM cluster
     * or disconnects an external key store from the external key store proxy that communicates with your external key
     * manager.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
     * </p>
     * <p>
     * While a custom key store is disconnected, you can manage the custom key store and its KMS keys, but you cannot
     * create or use its KMS keys. You can reconnect the custom key store at any time.
     * </p>
     * <note>
     * <p>
     * While a custom key store is disconnected, all attempts to create KMS keys in the custom key store or to use
     * existing KMS keys in <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a> will fail. This action can prevent users from storing and accessing sensitive data.
     * </p>
     * </note>
     * <p>
     * When you disconnect a custom key store, its <code>ConnectionState</code> changes to <code>Disconnected</code>. To
     * find the connection state of a custom key store, use the <a>DescribeCustomKeyStores</a> operation. To reconnect a
     * custom key store, use the <a>ConnectCustomKeyStore</a> operation.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:DisconnectCustomKeyStore</a> (IAM policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ConnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCustomKeyStores</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
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
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Sets the key state of a KMS key to enabled. This allows you to use the KMS key for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations">cryptographic
     * operations</a>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:EnableKey</a>
     * (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>DisableKey</a>
     * </p>
     * 
     * @param enableKeyRequest
     * @return Result of the EnableKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * the key material</a> of the specified symmetric encryption KMS key.
     * </p>
     * <p>
     * When you enable automatic rotation of a<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed KMS
     * key</a>, KMS rotates the key material of the KMS key one year (approximately 365 days) from the enable date and
     * every year thereafter. You can monitor rotation of the key material for your KMS keys in CloudTrail and Amazon
     * CloudWatch. To disable rotation of the key material in a customer managed KMS key, use the
     * <a>DisableKeyRotation</a> operation.
     * </p>
     * <p>
     * Automatic key rotation is supported only on <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">symmetric encryption
     * KMS keys</a>. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key.
     * </p>
     * <p>
     * You cannot enable or disable automatic rotation <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed KMS keys</a>. KMS always rotates the key material of Amazon Web Services managed keys every year.
     * Rotation of <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk">Amazon
     * Web Services owned KMS keys</a> varies.
     * </p>
     * <note>
     * <p>
     * In May 2022, KMS changed the rotation schedule for Amazon Web Services managed keys from every three years
     * (approximately 1,095 days) to every year (approximately 365 days).
     * </p>
     * <p>
     * New Amazon Web Services managed keys are automatically rotated one year after they are created, and approximately
     * every year thereafter.
     * </p>
     * <p>
     * Existing Amazon Web Services managed keys are automatically rotated one year after their most recent rotation,
     * and every year thereafter.
     * </p>
     * </note>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:EnableKeyRotation</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DisableKeyRotation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKeyRotationStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param enableKeyRotationRequest
     * @return Result of the EnableKeyRotation operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Encrypts plaintext of up to 4,096 bytes using a KMS key. You can use a symmetric or asymmetric KMS key with a
     * <code>KeyUsage</code> of <code>ENCRYPT_DECRYPT</code>.
     * </p>
     * <p>
     * You can use this operation to encrypt small amounts of arbitrary data, such as a personal identifier or database
     * password, or other sensitive information. You don't need to use the <code>Encrypt</code> operation to encrypt a
     * data key. The <a>GenerateDataKey</a> and <a>GenerateDataKeyPair</a> operations return a plaintext data key and an
     * encrypted copy of that data key.
     * </p>
     * <p>
     * If you use a symmetric encryption KMS key, you can use an encryption context to add additional security to your
     * encryption operation. If you specify an <code>EncryptionContext</code> when encrypting data, you must specify the
     * same encryption context (a case-sensitive exact match) when decrypting the data. Otherwise, the request to
     * decrypt fails with an <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * If you specify an asymmetric KMS key, you must also specify the encryption algorithm. The algorithm must be
     * compatible with the KMS key spec.
     * </p>
     * <important>
     * <p>
     * When you use an asymmetric KMS key to encrypt or reencrypt data, be sure to record the KMS key and encryption
     * algorithm that you choose. You will be required to provide the same KMS key and encryption algorithm when you
     * decrypt the data. If the KMS key and algorithm do not match the values used to encrypt the data, the decrypt
     * operation fails.
     * </p>
     * <p>
     * You are not required to supply the key ID and encryption algorithm when you decrypt with symmetric encryption KMS
     * keys because KMS stores this information in the ciphertext blob. KMS cannot store metadata in ciphertext
     * generated with asymmetric keys. The standard format for asymmetric key ciphertext does not include configurable
     * fields.
     * </p>
     * </important>
     * <p>
     * The maximum size of the data that you can encrypt varies with the type of KMS key and the encryption algorithm
     * that you choose.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Symmetric encryption KMS keys
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
     * <li>
     * <p>
     * <code>SM2PKE</code>: 1024 bytes (China Regions only)
     * </p>
     * </li>
     * </ul>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:Encrypt</a>
     * (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
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
     * <a>GenerateDataKeyPair</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptRequest
     * @return Result of the Encrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a unique symmetric data key for use outside of KMS. This operation returns a plaintext copy of the data
     * key and a copy that is encrypted under a symmetric encryption KMS key that you specify. The bytes in the
     * plaintext key are random; they are not related to the caller or the KMS key. You can use the plaintext key to
     * encrypt your data outside of KMS and store the encrypted data key with the encrypted data.
     * </p>
     * <p>
     * To generate a data key, specify the symmetric encryption KMS key that will be used to encrypt the data key. You
     * cannot use an asymmetric KMS key to encrypt data keys. To get the type of your KMS key, use the
     * <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * You must also specify the length of the data key. Use either the <code>KeySpec</code> or
     * <code>NumberOfBytes</code> parameters (but not both). For 128-bit and 256-bit data keys, use the
     * <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * To generate an SM4 data key (China Regions only), specify a <code>KeySpec</code> value of <code>AES_128</code> or
     * <code>NumberOfBytes</code> value of <code>128</code>. The symmetric encryption key used in China Regions to
     * encrypt your data key is an SM4 encryption key.
     * </p>
     * <p>
     * To get only an encrypted copy of the data key, use <a>GenerateDataKeyWithoutPlaintext</a>. To generate an
     * asymmetric data key pair, use the <a>GenerateDataKeyPair</a> or <a>GenerateDataKeyPairWithoutPlaintext</a>
     * operation. To get a cryptographically secure random byte string, use <a>GenerateRandom</a>.
     * </p>
     * <p>
     * You can use an optional encryption context to add additional security to the encryption operation. If you specify
     * an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact match)
     * when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Applications in Amazon Web Services Nitro Enclaves can call this operation by using the <a
     * href="https://github.com/aws/aws-nitro-enclaves-sdk-c">Amazon Web Services Nitro Enclaves Development Kit</a>.
     * For information about the supporting parameters, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves use KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>How to use your data key</b>
     * </p>
     * <p>
     * We recommend that you use the following pattern to encrypt data locally in your application. You can write your
     * own code or use a client-side encryption library, such as the <a
     * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">Amazon Web Services Encryption SDK</a>,
     * the <a href="https://docs.aws.amazon.com/dynamodb-encryption-client/latest/devguide/">Amazon DynamoDB Encryption
     * Client</a>, or <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon S3
     * client-side encryption</a> to do these tasks for you.
     * </p>
     * <p>
     * To encrypt data outside of KMS:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use the <code>GenerateDataKey</code> operation to get a data key.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the plaintext data key (in the <code>Plaintext</code> field of the response) to encrypt your data outside of
     * KMS. Then erase the plaintext data key from memory.
     * </p>
     * </li>
     * <li>
     * <p>
     * Store the encrypted data key (in the <code>CiphertextBlob</code> field of the response) with the encrypted data.
     * </p>
     * </li>
     * </ol>
     * <p>
     * To decrypt data outside of KMS:
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
     * Use the plaintext data key to decrypt data outside of KMS, then erase the plaintext data key from memory.
     * </p>
     * </li>
     * </ol>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateDataKey</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Decrypt</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>Encrypt</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyPair</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyPairWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generateDataKeyRequest
     * @return Result of the GenerateDataKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a unique asymmetric data key pair for use outside of KMS. This operation returns a plaintext public key,
     * a plaintext private key, and a copy of the private key that is encrypted under the symmetric encryption KMS key
     * you specify. You can use the data key pair to perform asymmetric cryptography and implement digital signatures
     * outside of KMS. The bytes in the keys are random; they not related to the caller or to the KMS key that is used
     * to encrypt the private key.
     * </p>
     * <p>
     * You can use the public key that <code>GenerateDataKeyPair</code> returns to encrypt data or verify a signature
     * outside of KMS. Then, store the encrypted private key with the data. When you are ready to decrypt data or sign a
     * message, you can use the <a>Decrypt</a> operation to decrypt the encrypted private key.
     * </p>
     * <p>
     * To generate a data key pair, you must specify a symmetric encryption KMS key to encrypt the private key in a data
     * key pair. You cannot use an asymmetric KMS key or a KMS key in a custom key store. To get the type and origin of
     * your KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * Use the <code>KeyPairSpec</code> parameter to choose an RSA or Elliptic Curve (ECC) data key pair. In China
     * Regions, you can also choose an SM2 data key pair. KMS recommends that you use ECC key pairs for signing, and use
     * RSA and SM2 key pairs for either encryption or signing, but not both. However, KMS cannot enforce any
     * restrictions on the use of data key pairs outside of KMS.
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
     * <code>GenerateDataKeyPair</code> returns a unique data key pair for each request. The bytes in the keys are
     * random; they are not related to the caller or the KMS key that is used to encrypt the private key. The public key
     * is a DER-encoded X.509 SubjectPublicKeyInfo, as specified in <a href="https://tools.ietf.org/html/rfc5280">RFC
     * 5280</a>. The private key is a DER-encoded PKCS8 PrivateKeyInfo, as specified in <a
     * href="https://tools.ietf.org/html/rfc5958">RFC 5958</a>.
     * </p>
     * <p>
     * You can use an optional encryption context to add additional security to the encryption operation. If you specify
     * an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact match)
     * when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateDataKeyPair</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Decrypt</a>
     * </p>
     * </li>
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
     * <a>GenerateDataKeyPairWithoutPlaintext</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GenerateDataKeyWithoutPlaintext</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generateDataKeyPairRequest
     * @return Result of the GenerateDataKeyPair operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a unique asymmetric data key pair for use outside of KMS. This operation returns a plaintext public key
     * and a copy of the private key that is encrypted under the symmetric encryption KMS key you specify. Unlike
     * <a>GenerateDataKeyPair</a>, this operation does not return a plaintext private key. The bytes in the keys are
     * random; they are not related to the caller or to the KMS key that is used to encrypt the private key.
     * </p>
     * <p>
     * You can use the public key that <code>GenerateDataKeyPairWithoutPlaintext</code> returns to encrypt data or
     * verify a signature outside of KMS. Then, store the encrypted private key with the data. When you are ready to
     * decrypt data or sign a message, you can use the <a>Decrypt</a> operation to decrypt the encrypted private key.
     * </p>
     * <p>
     * To generate a data key pair, you must specify a symmetric encryption KMS key to encrypt the private key in a data
     * key pair. You cannot use an asymmetric KMS key or a KMS key in a custom key store. To get the type and origin of
     * your KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * Use the <code>KeyPairSpec</code> parameter to choose an RSA or Elliptic Curve (ECC) data key pair. In China
     * Regions, you can also choose an SM2 data key pair. KMS recommends that you use ECC key pairs for signing, and use
     * RSA and SM2 key pairs for either encryption or signing, but not both. However, KMS cannot enforce any
     * restrictions on the use of data key pairs outside of KMS.
     * </p>
     * <p>
     * <code>GenerateDataKeyPairWithoutPlaintext</code> returns a unique data key pair for each request. The bytes in
     * the key are not related to the caller or KMS key that is used to encrypt the private key. The public key is a
     * DER-encoded X.509 SubjectPublicKeyInfo, as specified in <a href="https://tools.ietf.org/html/rfc5280">RFC
     * 5280</a>.
     * </p>
     * <p>
     * You can use an optional encryption context to add additional security to the encryption operation. If you specify
     * an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact match)
     * when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateDataKeyPairWithoutPlaintext</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Decrypt</a>
     * </p>
     * </li>
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
     * </ul>
     * 
     * @param generateDataKeyPairWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyPairWithoutPlaintext operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns a unique symmetric data key for use outside of KMS. This operation returns a data key that is encrypted
     * under a symmetric encryption KMS key that you specify. The bytes in the key are random; they are not related to
     * the caller or to the KMS key.
     * </p>
     * <p>
     * <code>GenerateDataKeyWithoutPlaintext</code> is identical to the <a>GenerateDataKey</a> operation except that it
     * does not return a plaintext copy of the data key.
     * </p>
     * <p>
     * This operation is useful for systems that need to encrypt data at some point, but not immediately. When you need
     * to encrypt the data, you call the <a>Decrypt</a> operation on the encrypted copy of the key.
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
     * To request an asymmetric data key pair, use the <a>GenerateDataKeyPair</a> or
     * <a>GenerateDataKeyPairWithoutPlaintext</a> operations.
     * </p>
     * <p>
     * To generate a data key, you must specify the symmetric encryption KMS key that is used to encrypt the data key.
     * You cannot use an asymmetric KMS key or a key in a custom key store to generate a data key. To get the type of
     * your KMS key, use the <a>DescribeKey</a> operation.
     * </p>
     * <p>
     * You must also specify the length of the data key. Use either the <code>KeySpec</code> or
     * <code>NumberOfBytes</code> parameters (but not both). For 128-bit and 256-bit data keys, use the
     * <code>KeySpec</code> parameter.
     * </p>
     * <p>
     * To generate an SM4 data key (China Regions only), specify a <code>KeySpec</code> value of <code>AES_128</code> or
     * <code>NumberOfBytes</code> value of <code>128</code>. The symmetric encryption key used in China Regions to
     * encrypt your data key is an SM4 encryption key.
     * </p>
     * <p>
     * If the operation succeeds, you will find the encrypted copy of the data key in the <code>CiphertextBlob</code>
     * field.
     * </p>
     * <p>
     * You can use an optional encryption context to add additional security to the encryption operation. If you specify
     * an <code>EncryptionContext</code>, you must specify the same encryption context (a case-sensitive exact match)
     * when decrypting the encrypted data key. Otherwise, the request to decrypt fails with an
     * <code>InvalidCiphertextException</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption Context</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateDataKeyWithoutPlaintext</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Decrypt</a>
     * </p>
     * </li>
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
     * <a>GenerateDataKeyPairWithoutPlaintext</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyWithoutPlaintext operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Generates a hash-based message authentication code (HMAC) for a message using an HMAC KMS key and a MAC algorithm
     * that the key supports. HMAC KMS keys and the HMAC algorithms that KMS uses conform to industry standards defined
     * in <a href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * You can use value that GenerateMac returns in the <a>VerifyMac</a> operation to demonstrate that the original
     * message has not changed. Also, because a secret key is used to create the hash, you can verify that the party
     * that generated the hash has the required secret key. You can also use the raw result to implement HMAC-based
     * algorithms such as key derivation functions. This operation is part of KMS support for HMAC KMS keys. For
     * details, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC keys in KMS</a> in
     * the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <note>
     * <p>
     * Best practices recommend that you limit the time during which any signing mechanism, including an HMAC, is
     * effective. This deters an attack where the actor uses a signed message to establish validity repeatedly or long
     * after the message is superseded. HMAC tags do not include a timestamp, but you can include a timestamp in the
     * token or message to help you detect when its time to refresh the HMAC.
     * </p>
     * </note>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateMac</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>VerifyMac</a>
     * </p>
     * 
     * @param generateMacRequest
     * @return Result of the GenerateMac operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @sample AWSKMS.GenerateMac
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateMac" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GenerateMacResult generateMac(GenerateMacRequest request) {
        request = beforeClientExecution(request);
        return executeGenerateMac(request);
    }

    @SdkInternalApi
    final GenerateMacResult executeGenerateMac(GenerateMacRequest generateMacRequest) {

        ExecutionContext executionContext = createExecutionContext(generateMacRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateMacRequest> request = null;
        Response<GenerateMacResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateMacRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(generateMacRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GenerateMac");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GenerateMacResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GenerateMacResultJsonUnmarshaller());
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
     * You must use the <code>NumberOfBytes</code> parameter to specify the length of the random byte string. There is
     * no default value for string length.
     * </p>
     * <p>
     * By default, the random byte string is generated in KMS. To generate the byte string in the CloudHSM cluster
     * associated with an CloudHSM key store, use the <code>CustomKeyStoreId</code> parameter.
     * </p>
     * <p>
     * Applications in Amazon Web Services Nitro Enclaves can call this operation by using the <a
     * href="https://github.com/aws/aws-nitro-enclaves-sdk-c">Amazon Web Services Nitro Enclaves Development Kit</a>.
     * For information about the supporting parameters, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/services-nitro-enclaves.html">How Amazon Web Services
     * Nitro Enclaves use KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For more information about entropy and random number generation, see <a
     * href="https://docs.aws.amazon.com/kms/latest/cryptographic-details/">Key Management Service Cryptographic
     * Details</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Not applicable. <code>GenerateRandom</code> does not use any account-specific
     * resources, such as KMS keys.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GenerateRandom</a> (IAM policy)
     * </p>
     * 
     * @param generateRandomRequest
     * @return Result of the GenerateRandom operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
     * @throws CustomKeyStoreInvalidStateException
     *         The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
     *         <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
     *         <p>
     *         This exception is thrown under the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets a key policy attached to the specified KMS key.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GetKeyPolicy</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>PutKeyPolicy</a>
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return Result of the GetKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * material</a> is enabled for the specified KMS key.
     * </p>
     * <p>
     * When you enable automatic rotation for <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed KMS
     * keys</a>, KMS rotates the key material of the KMS key one year (approximately 365 days) from the enable date and
     * every year thereafter. You can monitor rotation of the key material for your KMS keys in CloudTrail and Amazon
     * CloudWatch.
     * </p>
     * <p>
     * Automatic key rotation is supported only on <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">symmetric encryption
     * KMS keys</a>. You cannot enable automatic rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">asymmetric KMS keys</a>,
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC KMS keys</a>, KMS keys with <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">imported key material</a>, or
     * KMS keys in a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key store</a>.
     * To enable or disable automatic rotation of a set of related <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-rotate"
     * >multi-Region keys</a>, set the property on the primary key..
     * </p>
     * <p>
     * You can enable (<a>EnableKeyRotation</a>) and disable automatic rotation (<a>DisableKeyRotation</a>) of the key
     * material in customer managed KMS keys. Key material rotation of <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed KMS keys</a> is not configurable. KMS always rotates the key material in Amazon Web Services managed KMS
     * keys every year. The key rotation status for Amazon Web Services managed KMS keys is always <code>true</code>.
     * </p>
     * <note>
     * <p>
     * In May 2022, KMS changed the rotation schedule for Amazon Web Services managed keys from every three years to
     * every year. For details, see <a>EnableKeyRotation</a>.
     * </p>
     * </note>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disabled: The key rotation status does not change when you disable a KMS key. However, while the KMS key is
     * disabled, KMS does not rotate the key material. When you re-enable the KMS key, rotation resumes. If the key
     * material in the re-enabled KMS key hasn't been rotated in one year, KMS rotates it immediately, and every year
     * thereafter. If it's been less than a year since the key material in the re-enabled KMS key was rotated, the KMS
     * key resumes its prior rotation schedule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Pending deletion: While a KMS key is pending deletion, its key rotation status is <code>false</code> and KMS does
     * not rotate the key material. If you cancel the deletion, the original key rotation status returns to
     * <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a different Amazon Web Services account,
     * specify the key ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GetKeyRotationStatus</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DisableKeyRotation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>EnableKeyRotation</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getKeyRotationStatusRequest
     * @return Result of the GetKeyRotationStatus operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns the items you need to import key material into a symmetric encryption KMS key. For more information about
     * importing key material into KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing key material</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This operation returns a public key and an import token. Use the public key to encrypt the symmetric key
     * material. Store the import token to send with a subsequent <a>ImportKeyMaterial</a> request.
     * </p>
     * <p>
     * You must specify the key ID of the symmetric encryption KMS key into which you will import key material. The KMS
     * key <code>Origin</code> must be <code>EXTERNAL</code>. You must also specify the wrapping algorithm and type of
     * wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on an
     * asymmetric KMS key, an HMAC KMS key, or on any KMS key in a different Amazon Web Services account.
     * </p>
     * <p>
     * To import key material, you must use the public key and import token from the same response. These items are
     * valid for 24 hours. The expiration date and time appear in the <code>GetParametersForImport</code> response. You
     * cannot use an expired token in an <a>ImportKeyMaterial</a> request. If your key and token expire, send another
     * <code>GetParametersForImport</code> request.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GetParametersForImport</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ImportKeyMaterial</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteImportedKeyMaterial</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getParametersForImportRequest
     * @return Result of the GetParametersForImport operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns the public key of an asymmetric KMS key. Unlike the private key of a asymmetric KMS key, which never
     * leaves KMS unencrypted, callers with <code>kms:GetPublicKey</code> permission can download the public key of an
     * asymmetric KMS key. You can share the public key to allow others to encrypt messages and verify signatures
     * outside of KMS. For information about asymmetric KMS keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Asymmetric KMS keys</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You do not need to download the public key. Instead, you can use the public key within KMS by calling the
     * <a>Encrypt</a>, <a>ReEncrypt</a>, or <a>Verify</a> operations with the identifier of an asymmetric KMS key. When
     * you use the public key within KMS, you benefit from the authentication, authorization, and logging that are part
     * of every KMS operation. You also reduce of risk of encrypting data that cannot be decrypted. These features are
     * not effective outside of KMS.
     * </p>
     * <p>
     * To help you use the public key safely outside of KMS, <code>GetPublicKey</code> returns important information
     * about the public key in the response, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/kms/latest/APIReference/API_GetPublicKey.html#KMS-GetPublicKey-response-KeySpec"
     * >KeySpec</a>: The type of key material in the public key, such as <code>RSA_4096</code> or
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
     * Although KMS cannot enforce these restrictions on external operations, it is crucial that you use this
     * information to prevent the public key from being used improperly. For example, you can prevent a public signing
     * key from being used encrypt data, or prevent a public key from being used with an encryption algorithm that is
     * not supported by KMS. You can also avoid errors, such as using the wrong signing algorithm in a verification
     * operation.
     * </p>
     * <p>
     * To verify a signature outside of KMS with an SM2 public key (China Regions only), you must specify the
     * distinguishing ID. By default, KMS uses <code>1234567812345678</code> as the distinguishing ID. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:GetPublicKey</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>CreateKey</a>
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return Result of the GetPublicKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Imports key material into an existing symmetric encryption KMS key that was created without key material. After
     * you successfully import key material into a KMS key, you can <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material">reimport
     * the same key material</a> into that KMS key, but you cannot import different key material.
     * </p>
     * <p>
     * You cannot perform this operation on an asymmetric KMS key, an HMAC KMS key, or on any KMS key in a different
     * Amazon Web Services account. For more information about creating KMS keys with no key material and then importing
     * key material, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html">Importing
     * Key Material</a> in the <i>Key Management Service Developer Guide</i>.
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
     * The key ID or key ARN of a KMS key with no key material. Its <code>Origin</code> must be <code>EXTERNAL</code>.
     * </p>
     * <p>
     * To create a KMS key with no key material, call <a>CreateKey</a> and set the value of its <code>Origin</code>
     * parameter to <code>EXTERNAL</code>. To get the <code>Origin</code> of a KMS key, call <a>DescribeKey</a>.)
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
     * Whether the key material expires (<code>ExpirationModel</code>) and, if so, when (<code>ValidTo</code>). If you
     * set an expiration date, on the specified date, KMS deletes the key material from the KMS key, making the KMS key
     * unusable. To use the KMS key in cryptographic operations again, you must reimport the same key material. The only
     * way to change the expiration model or expiration date is by reimporting the same key material and specifying a
     * new expiration date.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, the key state of the KMS key changes from <code>PendingImport</code> to
     * <code>Enabled</code>, and you can use the KMS key.
     * </p>
     * <p>
     * If this operation fails, use the exception to help determine the problem. If the error is related to the key
     * material, the import token, or wrapping key, use <a>GetParametersForImport</a> to get a new public key and import
     * token for the KMS key and repeat the import procedure. For help, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#importing-keys-overview">How To
     * Import Key Material</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ImportKeyMaterial</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteImportedKeyMaterial</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param importKeyMaterialRequest
     * @return Result of the ImportKeyMaterial operation returned by the service.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.</p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because KMS could not decrypt the
     *         encrypted (wrapped) key material.
     * @throws IncorrectKeyMaterialException
     *         The request was rejected because the key material in the request is, expired, invalid, or is not the same
     *         key material that was previously imported into this KMS key.
     * @throws ExpiredImportTokenException
     *         The request was rejected because the specified import token is expired. Use <a>GetParametersForImport</a>
     *         to get a new import token and public key, use the new public key to encrypt the key material, and then
     *         try the request again.
     * @throws InvalidImportTokenException
     *         The request was rejected because the provided import token is invalid or is associated with a different
     *         KMS key.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets a list of aliases in the caller's Amazon Web Services account and region. For more information about
     * aliases, see <a>CreateAlias</a>.
     * </p>
     * <p>
     * By default, the <code>ListAliases</code> operation returns all aliases in the account and region. To get only the
     * aliases associated with a particular KMS key, use the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * The <code>ListAliases</code> response can include aliases that you created and associated with your customer
     * managed keys, and aliases that Amazon Web Services created and associated with Amazon Web Services managed keys
     * in your account. You can recognize Amazon Web Services aliases because their names have the format
     * <code>aws/&lt;service-name&gt;</code>, such as <code>aws/dynamodb</code>.
     * </p>
     * <p>
     * The response might also include aliases that have no <code>TargetKeyId</code> field. These are predefined aliases
     * that Amazon Web Services has created but has not yet associated with a KMS key. Aliases that Amazon Web Services
     * creates in your account, including predefined aliases, do not count against your <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html#aliases-limit">KMS aliases quota</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. <code>ListAliases</code> does not return aliases in other Amazon Web Services
     * accounts.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ListAliases</a> (IAM policy)
     * </p>
     * <p>
     * For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html#alias-access">Controlling access to
     * aliases</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets a list of all grants for the specified KMS key.
     * </p>
     * <p>
     * You must specify the KMS key in all requests. You can filter the grant list by grant ID or grantee principal.
     * </p>
     * <p>
     * For detailed information about grants, including grant terminology, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants in KMS</a> in the <i> <i>Key
     * Management Service Developer Guide</i> </i>. For examples of working with grants in several programming
     * languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html">Programming grants</a>.
     * </p>
     * <note>
     * <p>
     * The <code>GranteePrincipal</code> field in the <code>ListGrants</code> response usually contains the user or role
     * designated as the grantee principal in the grant. However, when the grantee principal in the grant is an Amazon
     * Web Services service, the <code>GranteePrincipal</code> field contains the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services"
     * >service principal</a>, which might represent several different grantee principals.
     * </p>
     * </note>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a different Amazon Web Services account,
     * specify the key ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ListGrants</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListRetirableGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RetireGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RevokeGrant</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listGrantsRequest
     * @return Result of the ListGrants operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where pagination should next begin is not
     *         valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified <code>GrantId</code> is not valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets the names of the key policies that are attached to a KMS key. This operation is designed to get policy names
     * that you can use in a <a>GetKeyPolicy</a> operation. However, the only valid policy name is <code>default</code>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ListKeyPolicies</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetKeyPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutKeyPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listKeyPoliciesRequest
     * @return Result of the ListKeyPolicies operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Gets a list of all KMS keys in the caller's Amazon Web Services account and Region.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:ListKeys</a>
     * (IAM policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListResourceTags</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listKeysRequest
     * @return Result of the ListKeys operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns all tags on the specified KMS key.
     * </p>
     * <p>
     * For general information about tags, including the format and syntax, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>. For information about using tags in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging keys</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ListResourceTags</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ReplicateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns information about all grants in the Amazon Web Services account and Region that have the specified
     * retiring principal.
     * </p>
     * <p>
     * You can specify any principal in your Amazon Web Services account. The grants that are returned include grants
     * for KMS keys in your Amazon Web Services account and other Amazon Web Services accounts. You might use this
     * operation to determine which grants you may retire. To retire a grant, use the <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * For detailed information about grants, including grant terminology, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants in KMS</a> in the <i> <i>Key
     * Management Service Developer Guide</i> </i>. For examples of working with grants in several programming
     * languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html">Programming grants</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: You must specify a principal in your Amazon Web Services account. However, this
     * operation can return grants in any Amazon Web Services account. You do not need
     * <code>kms:ListRetirableGrants</code> permission (or any other additional permission) in any Amazon Web Services
     * account other than your own.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:ListRetirableGrants</a> (IAM policy) in your Amazon Web Services account.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RetireGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RevokeGrant</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listRetirableGrantsRequest
     * @return Result of the ListRetirableGrants operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Attaches a key policy to the specified KMS key.
     * </p>
     * <p>
     * For more information about key policies, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Key Policies</a> in the <i>Key
     * Management Service Developer Guide</i>. For help writing and formatting a JSON policy document, see the <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html">IAM JSON Policy Reference</a> in
     * the <i> <i>Identity and Access Management User Guide</i> </i>. For examples of adding a key policy in multiple
     * programming languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-key-policies.html#put-policy">Setting a
     * key policy</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:PutKeyPolicy</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>GetKeyPolicy</a>
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
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Decrypts ciphertext and then reencrypts it entirely within KMS. You can use this operation to change the KMS key
     * under which data is encrypted, such as when you <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotate-keys-manually">manually
     * rotate</a> a KMS key or change the KMS key that protects a ciphertext. You can also use it to reencrypt
     * ciphertext under the same KMS key, such as to change the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">encryption context</a>
     * of a ciphertext.
     * </p>
     * <p>
     * The <code>ReEncrypt</code> operation can decrypt ciphertext that was encrypted by using a KMS key in an KMS
     * operation, such as <a>Encrypt</a> or <a>GenerateDataKey</a>. It can also decrypt ciphertext that was encrypted by
     * using the public key of an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-concepts.html#asymmetric-cmks">asymmetric
     * KMS key</a> outside of KMS. However, it cannot decrypt ciphertext produced by other libraries, such as the <a
     * href="https://docs.aws.amazon.com/encryption-sdk/latest/developer-guide/">Amazon Web Services Encryption SDK</a>
     * or <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingClientSideEncryption.html">Amazon S3 client-side
     * encryption</a>. These libraries return a ciphertext format that is incompatible with KMS.
     * </p>
     * <p>
     * When you use the <code>ReEncrypt</code> operation, you need to provide information for the decrypt operation and
     * the subsequent encrypt operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If your ciphertext was encrypted under an asymmetric KMS key, you must use the <code>SourceKeyId</code> parameter
     * to identify the KMS key that encrypted the ciphertext. You must also supply the encryption algorithm that was
     * used. This information is required to decrypt the data.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your ciphertext was encrypted under a symmetric encryption KMS key, the <code>SourceKeyId</code> parameter is
     * optional. KMS can get this information from metadata that it adds to the symmetric ciphertext blob. This feature
     * adds durability to your implementation by ensuring that authorized users can decrypt ciphertext decades after it
     * was encrypted, even if they've lost track of the key ID. However, specifying the source KMS key is always
     * recommended as a best practice. When you use the <code>SourceKeyId</code> parameter to specify a KMS key, KMS
     * uses only the KMS key you specify. If the ciphertext was encrypted under a different KMS key, the
     * <code>ReEncrypt</code> operation fails. This practice ensures that you use the KMS key that you intend.
     * </p>
     * </li>
     * <li>
     * <p>
     * To reencrypt the data, you must use the <code>DestinationKeyId</code> parameter to specify the KMS key that
     * re-encrypts the data after it is decrypted. If the destination KMS key is an asymmetric KMS key, you must also
     * provide the encryption algorithm. The algorithm that you choose must be compatible with the KMS key.
     * </p>
     * <important>
     * <p>
     * When you use an asymmetric KMS key to encrypt or reencrypt data, be sure to record the KMS key and encryption
     * algorithm that you choose. You will be required to provide the same KMS key and encryption algorithm when you
     * decrypt the data. If the KMS key and algorithm do not match the values used to encrypt the data, the decrypt
     * operation fails.
     * </p>
     * <p>
     * You are not required to supply the key ID and encryption algorithm when you decrypt with symmetric encryption KMS
     * keys because KMS stores this information in the ciphertext blob. KMS cannot store metadata in ciphertext
     * generated with asymmetric keys. The standard format for asymmetric key ciphertext does not include configurable
     * fields.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. The source KMS key and destination KMS key can be in different Amazon Web Services
     * accounts. Either or both KMS keys can be in a different account than the caller. To specify a KMS key in a
     * different account, you must use its key ARN or alias ARN.
     * </p>
     * <p>
     * <b>Required permissions</b>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:
     * ReEncryptFrom</a> permission on the source KMS key (key policy)
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:ReEncryptTo
     * </a> permission on the destination KMS key (key policy)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To permit reencryption from or to a KMS key, include the <code>"kms:ReEncrypt*"</code> permission in your <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policy</a>. This permission is
     * automatically included in the key policy when you use the console to create a KMS key. But you must include it
     * manually when you create a KMS key programmatically or when you use the <a>PutKeyPolicy</a> operation to set a
     * key policy.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>Decrypt</a>
     * </p>
     * </li>
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
     * </ul>
     * 
     * @param reEncryptRequest
     * @return Result of the ReEncrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidCiphertextException
     *         From the <a>Decrypt</a> or <a>ReEncrypt</a> operation, the request was rejected because the specified
     *         ciphertext, or additional authenticated data incorporated into the ciphertext, such as the encryption
     *         context, is corrupted, missing, or otherwise invalid.</p>
     *         <p>
     *         From the <a>ImportKeyMaterial</a> operation, the request was rejected because KMS could not decrypt the
     *         encrypted (wrapped) key material.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws IncorrectKeyException
     *         The request was rejected because the specified KMS key cannot decrypt the data. The <code>KeyId</code> in
     *         a <a>Decrypt</a> request and the <code>SourceKeyId</code> in a <a>ReEncrypt</a> request must identify the
     *         same KMS key that was used to encrypt the ciphertext.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Replicates a multi-Region key into the specified Region. This operation creates a multi-Region replica key based
     * on a multi-Region primary key in a different Region of the same Amazon Web Services partition. You can create
     * multiple replicas of a primary key, but each must be in a different Region. To create a multi-Region primary key,
     * use the <a>CreateKey</a> operation.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * A <i>replica key</i> is a fully-functional KMS key that can be used independently of its primary and peer replica
     * keys. A primary key and its replica keys share properties that make them interoperable. They have the same <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a> and key
     * material. They also have the same <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-spec">key spec</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-usage">key usage</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-origin">key material origin</a>,
     * and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic key rotation
     * status</a>. KMS automatically synchronizes these shared properties among related multi-Region keys. All other
     * properties of a replica key can differ, including its <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">key policy</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">tags</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html">aliases</a>, and <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a>. KMS
     * pricing and quotas for KMS keys apply to each primary key and replica key.
     * </p>
     * <p>
     * When this operation completes, the new replica key has a transient key state of <code>Creating</code>. This key
     * state changes to <code>Enabled</code> (or <code>PendingImport</code>) after a few seconds when the process of
     * creating the new replica key is complete. While the key state is <code>Creating</code>, you can manage key, but
     * you cannot yet use it in cryptographic operations. If you are creating and using the replica key
     * programmatically, retry on <code>KMSInvalidStateException</code> or call <code>DescribeKey</code> to check its
     * <code>KeyState</code> value before using it. For details about the <code>Creating</code> key state, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You cannot create more than one replica of a primary key in any Region. If the Region already includes a replica
     * of the key you're trying to replicate, <code>ReplicateKey</code> returns an <code>AlreadyExistsException</code>
     * error. If the key state of the existing replica is <code>PendingDeletion</code>, you can cancel the scheduled key
     * deletion (<a>CancelKeyDeletion</a>) or wait for the key to be deleted. The new replica key you create will have
     * the same <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html#mrk-sync-properties"
     * >shared properties</a> as the original replica key.
     * </p>
     * <p>
     * The CloudTrail log of a <code>ReplicateKey</code> operation records a <code>ReplicateKey</code> operation in the
     * primary key's Region and a <a>CreateKey</a> operation in the replica key's Region.
     * </p>
     * <p>
     * If you replicate a multi-Region primary key with imported key material, the replica key is created with no key
     * material. You must import the same key material that you imported into the primary key. For details, see <a
     * href="kms/latest/developerguide/multi-region-keys-import.html">Importing key material into multi-Region keys</a>
     * in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To convert a replica key to a primary key, use the <a>UpdatePrimaryRegion</a> operation.
     * </p>
     * <note>
     * <p>
     * <code>ReplicateKey</code> uses different default values for the <code>KeyPolicy</code> and <code>Tags</code>
     * parameters than those used in the KMS console. For details, see the parameter descriptions.
     * </p>
     * </note>
     * <p>
     * <b>Cross-account use</b>: No. You cannot use this operation to create a replica key in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kms:ReplicateKey</code> on the primary key (in the primary key's Region). Include this permission in the
     * primary key's key policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kms:CreateKey</code> in an IAM policy in the replica Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * To use the <code>Tags</code> parameter, <code>kms:TagResource</code> in an IAM policy in the replica Region.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdatePrimaryRegion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicateKeyRequest
     * @return Result of the ReplicateKey operation returned by the service.
     * @throws AlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not syntactically or semantically correct.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws TagException
     *         The request was rejected because one or more tags are not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AWSKMS.ReplicateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ReplicateKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReplicateKeyResult replicateKey(ReplicateKeyRequest request) {
        request = beforeClientExecution(request);
        return executeReplicateKey(request);
    }

    @SdkInternalApi
    final ReplicateKeyResult executeReplicateKey(ReplicateKeyRequest replicateKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(replicateKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplicateKeyRequest> request = null;
        Response<ReplicateKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplicateKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(replicateKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReplicateKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReplicateKeyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReplicateKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a grant. Typically, you retire a grant when you no longer need its permissions. To identify the grant to
     * retire, use a <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">grant
     * token</a>, or both the grant ID and a key identifier (key ID or key ARN) of the KMS key. The <a>CreateGrant</a>
     * operation returns both values.
     * </p>
     * <p>
     * This operation can be called by the <i>retiring principal</i> for a grant, by the <i>grantee principal</i> if the
     * grant allows the <code>RetireGrant</code> operation, and by the Amazon Web Services account in which the grant is
     * created. It can also be called by principals to whom permission for retiring a grant is delegated. For details,
     * see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete">Retiring and
     * revoking grants</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * For detailed information about grants, including grant terminology, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants in KMS</a> in the <i> <i>Key
     * Management Service Developer Guide</i> </i>. For examples of working with grants in several programming
     * languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html">Programming grants</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. You can retire a grant on a KMS key in a different Amazon Web Services account.
     * </p>
     * <p>
     * <b>Required permissions:</b>:Permission to retire a grant is determined primarily by the grant. For details, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grant-manage.html#grant-delete">Retiring and
     * revoking grants</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListRetirableGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RevokeGrant</a>
     * </p>
     * </li>
     * </ul>
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
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes the specified grant. You revoke a grant to terminate the permissions that the grant allows. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/managing-grants.html#grant-delete">Retiring and
     * revoking grants</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * When you create, retire, or revoke a grant, there might be a brief delay, usually less than five minutes, until
     * the grant is available throughout KMS. This state is known as <i>eventual consistency</i>. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency">Eventual
     * consistency</a> in the <i> <i>Key Management Service Developer Guide</i> </i>.
     * </p>
     * <p>
     * For detailed information about grants, including grant terminology, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html">Grants in KMS</a> in the <i> <i>Key
     * Management Service Developer Guide</i> </i>. For examples of working with grants in several programming
     * languages, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-grants.html">Programming grants</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation on a KMS key in a different Amazon Web Services account,
     * specify the key ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:RevokeGrant</a> (key policy).
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateGrant</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListRetirableGrants</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RetireGrant</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param revokeGrantRequest
     * @return Result of the RevokeGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified <code>GrantId</code> is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Schedules the deletion of a KMS key. By default, KMS applies a waiting period of 30 days, but you can specify a
     * waiting period of 7-30 days. When this operation is successful, the key state of the KMS key changes to
     * <code>PendingDeletion</code> and the key can't be used in any cryptographic operations. It remains in this state
     * for the duration of the waiting period. Before the waiting period ends, you can use <a>CancelKeyDeletion</a> to
     * cancel the deletion of the KMS key. After the waiting period ends, KMS deletes the KMS key, its key material, and
     * all KMS data associated with it, including all aliases that refer to it.
     * </p>
     * <important>
     * <p>
     * Deleting a KMS key is a destructive and potentially dangerous operation. When a KMS key is deleted, all data that
     * was encrypted under the KMS key is unrecoverable. (The only exception is a multi-Region replica key.) To prevent
     * the use of a KMS key without deleting it, use <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * You can schedule the deletion of a multi-Region primary key and its replica keys at any time. However, KMS will
     * not delete a multi-Region primary key with existing replica keys. If you schedule the deletion of a primary key
     * with replicas, its key state changes to <code>PendingReplicaDeletion</code> and it cannot be replicated or used
     * in cryptographic operations. This status can continue indefinitely. When the last of its replicas keys is deleted
     * (not just scheduled), the key state of the primary key changes to <code>PendingDeletion</code> and its waiting
     * period (<code>PendingWindowInDays</code>) begins. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-delete.html">Deleting multi-Region
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * When KMS <a href="https://docs.aws.amazon.com/kms/latest/developerguide/delete-cmk-keystore.html">deletes a KMS
     * key from an CloudHSM key store</a>, it makes a best effort to delete the associated key material from the
     * associated CloudHSM cluster. However, you might need to manually <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/fix-keystore.html#fix-keystore-orphaned-key">delete
     * the orphaned key material</a> from the cluster and its backups. <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/delete-xks-key.html">Deleting a KMS key from an
     * external key store</a> has no effect on the associated external key. However, for both types of custom key
     * stores, deleting a KMS key is destructive and irreversible. You cannot decrypt ciphertext encrypted under the KMS
     * key by using only its associated external key or CloudHSM key. Also, you cannot recreate a KMS key in an external
     * key store by creating a new KMS key with the same key material.
     * </p>
     * <p>
     * For more information about scheduling a KMS key for deletion, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html">Deleting KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: kms:ScheduleKeyDeletion (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CancelKeyDeletion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisableKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scheduleKeyDeletionRequest
     * @return Result of the ScheduleKeyDeletion operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * message digest by using the private key in an asymmetric signing KMS key. To verify the signature, use the
     * <a>Verify</a> operation, or use the public key in the same asymmetric KMS key outside of KMS. For information
     * about asymmetric KMS keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Asymmetric KMS keys</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Digital signatures are generated and verified by using asymmetric key pair, such as an RSA or ECC pair that is
     * represented by an asymmetric KMS key. The key owner (or an authorized user) uses their private key to sign a
     * message. Anyone with the public key can verify that the message was signed with that particular private key and
     * that the message hasn't changed since it was signed.
     * </p>
     * <p>
     * To use the <code>Sign</code> operation, provide the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>KeyId</code> parameter to identify an asymmetric KMS key with a <code>KeyUsage</code> value of
     * <code>SIGN_VERIFY</code>. To get the <code>KeyUsage</code> value of a KMS key, use the <a>DescribeKey</a>
     * operation. The caller must have <code>kms:Sign</code> permission on the KMS key.
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
     * Choose a signing algorithm that is compatible with the KMS key.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * When signing a message, be sure to record the KMS key and the signing algorithm. This information is required to
     * verify the signature.
     * </p>
     * </important> <note>
     * <p>
     * Best practices recommend that you limit the time during which any signature is effective. This deters an attack
     * where the actor uses a signed message to establish validity repeatedly or long after the message is superseded.
     * Signatures do not include a timestamp, but you can include a timestamp in the signed message to help you detect
     * when its time to refresh the signature.
     * </p>
     * </note>
     * <p>
     * To verify the signature that this operation generates, use the <a>Verify</a> operation. Or use the
     * <a>GetPublicKey</a> operation to download the public key and then use the public key to verify the signature
     * outside of KMS.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:Sign</a> (key
     * policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>Verify</a>
     * </p>
     * 
     * @param signRequest
     * @return Result of the Sign operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Adds or edits tags on a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a>.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * Each tag consists of a tag key and a tag value, both of which are case-sensitive strings. The tag value can be an
     * empty (null) string. To add a tag, specify a new tag key and a tag value. To edit a tag, specify an existing tag
     * key and a new tag value.
     * </p>
     * <p>
     * You can use this operation to tag a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a>,
     * but you cannot tag an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed key</a>, an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-owned-cmk">Amazon Web Services
     * owned key</a>, a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#keystore-concept">custom key store</a>,
     * or an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#alias-concept">alias</a>.
     * </p>
     * <p>
     * You can also add tags to a KMS key while creating it (<a>CreateKey</a>) or replicating it (<a>ReplicateKey</a>).
     * </p>
     * <p>
     * For information about using tags in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging keys</a>. For general
     * information about tags, including the format and syntax, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:TagResource</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListResourceTags</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ReplicateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
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
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes tags from a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a>.
     * To delete a tag, specify the tag key and the KMS key.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * When it succeeds, the <code>UntagResource</code> operation doesn't return any output. Also, if the specified tag
     * key isn't found on the KMS key, it doesn't throw an exception or return a response. To confirm that the operation
     * worked, use the <a>ListResourceTags</a> operation.
     * </p>
     * <p>
     * For information about using tags in KMS, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/tagging-keys.html">Tagging keys</a>. For general
     * information about tags, including the format and syntax, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:UntagResource</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListResourceTags</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ReplicateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * </ul>
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
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Associates an existing KMS alias with a different KMS key. Each alias is associated with only one KMS key at a
     * time, although a KMS key can have multiple aliases. The alias and the KMS key must be in the same Amazon Web
     * Services account and Region.
     * </p>
     * <note>
     * <p>
     * Adding, deleting, or updating an alias can allow or deny permission to the KMS key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/abac.html">ABAC for KMS</a> in the <i>Key Management
     * Service Developer Guide</i>.
     * </p>
     * </note>
     * <p>
     * The current and new KMS key must be the same type (both symmetric or both asymmetric or both HMAC), and they must
     * have the same key usage. This restriction prevents errors in code that uses aliases. If you must assign an alias
     * to a different type of KMS key, use <a>DeleteAlias</a> to delete the old alias and <a>CreateAlias</a> to create a
     * new alias.
     * </p>
     * <p>
     * You cannot use <code>UpdateAlias</code> to change an alias name. To change an alias name, use <a>DeleteAlias</a>
     * to delete the old alias and <a>CreateAlias</a> to create a new alias.
     * </p>
     * <p>
     * Because an alias is not a property of a KMS key, you can create, update, and delete the aliases of a KMS key
     * without affecting the KMS key. Also, aliases do not appear in the response from the <a>DescribeKey</a> operation.
     * To get the aliases of all KMS keys in the account, use the <a>ListAliases</a> operation.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:UpdateAlias
     * </a> on the alias (IAM policy).
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:UpdateAlias
     * </a> on the current KMS key (key policy).
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:UpdateAlias
     * </a> on the new KMS key (key policy).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-alias.html#alias-access">Controlling access to
     * aliases</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a quota was exceeded. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/limits.html">Quotas</a> in the <i>Key
     *         Management Service Developer Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Changes the properties of a custom key store. You can use this operation to change the properties of an CloudHSM
     * key store or an external key store.
     * </p>
     * <p>
     * Use the required <code>CustomKeyStoreId</code> parameter to identify the custom key store. Use the remaining
     * optional parameters to change its properties. This operation does not return any property values. To verify the
     * updated property values, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * This operation is part of the <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/custom-key-store-overview.html">custom key stores</a>
     * feature in KMS, which combines the convenience and extensive integration of KMS with the isolation and control of
     * a key store that you own and manage.
     * </p>
     * <important>
     * <p>
     * When updating the properties of an external key store, verify that the updated settings connect your key store,
     * via the external key store proxy, to the same external key manager as the previous settings, or to a backup or
     * snapshot of the external key manager with the same cryptographic keys. If the updated connection settings fail,
     * you can fix them and retry, although an extended delay might disrupt Amazon Web Services services. However, if
     * KMS permanently loses its access to cryptographic keys, ciphertext encrypted under those keys is unrecoverable.
     * </p>
     * </important> <note>
     * <p>
     * For external key stores:
     * </p>
     * <p>
     * Some external key managers provide a simpler method for updating an external key store. For details, see your
     * external key manager documentation.
     * </p>
     * <p>
     * When updating an external key store in the KMS console, you can upload a JSON-based proxy configuration file with
     * the desired values. You cannot upload the proxy configuration file to the <code>UpdateCustomKeyStore</code>
     * operation. However, you can use the file to help you determine the correct values for the
     * <code>UpdateCustomKeyStore</code> parameters.
     * </p>
     * </note>
     * <p>
     * For an CloudHSM key store, you can use this operation to change the custom key store friendly name (
     * <code>NewCustomKeyStoreName</code>), to tell KMS about a change to the <code>kmsuser</code> crypto user password
     * (<code>KeyStorePassword</code>), or to associate the custom key store with a different, but related, CloudHSM
     * cluster (<code>CloudHsmClusterId</code>). To update any property of an CloudHSM key store, the
     * <code>ConnectionState</code> of the CloudHSM key store must be <code>DISCONNECTED</code>.
     * </p>
     * <p>
     * For an external key store, you can use this operation to change the custom key store friendly name (
     * <code>NewCustomKeyStoreName</code>), or to tell KMS about a change to the external key store proxy authentication
     * credentials (<code>XksProxyAuthenticationCredential</code>), connection method (<code>XksProxyConnectivity</code>
     * ), external proxy endpoint (<code>XksProxyUriEndpoint</code>) and path (<code>XksProxyUriPath</code>). For
     * external key stores with an <code>XksProxyConnectivity</code> of <code>VPC_ENDPOINT_SERVICE</code>, you can also
     * update the Amazon VPC endpoint service name (<code>XksProxyVpcEndpointServiceName</code>). To update most
     * properties of an external key store, the <code>ConnectionState</code> of the external key store must be
     * <code>DISCONNECTED</code>. However, you can update the <code>CustomKeyStoreName</code>,
     * <code>XksProxyAuthenticationCredential</code>, and <code>XksProxyUriPath</code> of an external key store when it
     * is in the CONNECTED or DISCONNECTED state.
     * </p>
     * <p>
     * If your update requires a <code>DISCONNECTED</code> state, before using <code>UpdateCustomKeyStore</code>, use
     * the <a>DisconnectCustomKeyStore</a> operation to disconnect the custom key store. After the
     * <code>UpdateCustomKeyStore</code> operation completes, use the <a>ConnectCustomKeyStore</a> to reconnect the
     * custom key store. To find the <code>ConnectionState</code> of the custom key store, use the
     * <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * <p>
     * </p>
     * <p>
     * Before updating the custom key store, verify that the new values allow KMS to connect the custom key store to its
     * backing key store. For example, before you change the <code>XksProxyUriPath</code> value, verify that the
     * external key store proxy is reachable at the new path.
     * </p>
     * <p>
     * If the operation succeeds, it returns a JSON object with no properties.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a custom key store in a different Amazon Web
     * Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:UpdateCustomKeyStore</a> (IAM policy)
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ConnectCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCustomKeyStore</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCustomKeyStores</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DisconnectCustomKeyStore</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateCustomKeyStoreRequest
     * @return Result of the UpdateCustomKeyStore operation returned by the service.
     * @throws CustomKeyStoreNotFoundException
     *         The request was rejected because KMS cannot find a custom key store with the specified key store name or
     *         ID.
     * @throws CustomKeyStoreNameInUseException
     *         The request was rejected because the specified custom key store name is already assigned to another
     *         custom key store in the account. Try again with a custom key store name that is unique in the account.
     * @throws CloudHsmClusterNotFoundException
     *         The request was rejected because KMS cannot find the CloudHSM cluster with the specified cluster ID.
     *         Retry the request with a different cluster ID.
     * @throws CloudHsmClusterNotRelatedException
     *         The request was rejected because the specified CloudHSM cluster has a different cluster certificate than
     *         the original cluster. You cannot use the operation to specify an unrelated cluster for an CloudHSM key
     *         store.</p>
     *         <p>
     *         Specify an CloudHSM cluster that shares a backup history with the original cluster. This includes
     *         clusters that were created from a backup of the current cluster, and clusters that were created from the
     *         same backup that produced the current cluster.
     *         </p>
     *         <p>
     *         CloudHSM clusters that share a backup history have the same cluster certificate. To view the cluster
     *         certificate of an CloudHSM cluster, use the <a
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
     *         You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is
     *         valid for all other <code>ConnectionState</code> values. To reconnect a custom key store in a
     *         <code>FAILED</code> state, disconnect it (<a>DisconnectCustomKeyStore</a>), then connect it (
     *         <code>ConnectCustomKeyStore</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>CreateKey</a> operation in a custom key store that is not connected. This operations
     *         is valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You requested the <a>DisconnectCustomKeyStore</a> operation on a custom key store with a
     *         <code>ConnectionState</code> of <code>DISCONNECTING</code> or <code>DISCONNECTED</code>. This operation
     *         is valid for all other <code>ConnectionState</code> values.
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
     *         You requested the <a>GenerateRandom</a> operation in an CloudHSM key store that is not connected. This
     *         operation is valid only when the CloudHSM key store <code>ConnectionState</code> is
     *         <code>CONNECTED</code>.
     *         </p>
     *         </li>
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws CloudHsmClusterNotActiveException
     *         The request was rejected because the CloudHSM cluster associated with the CloudHSM key store is not
     *         active. Initialize and activate the cluster and try the command again. For detailed instructions, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/getting-started.html">Getting Started</a> in
     *         the <i>CloudHSM User Guide</i>.
     * @throws CloudHsmClusterInvalidConfigurationException
     *         The request was rejected because the associated CloudHSM cluster did not meet the configuration
     *         requirements for an CloudHSM key store.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must be configured with private subnets in at least two different Availability Zones
     *         in the Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <a href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">security group for
     *         the cluster</a> (cloudhsm-cluster-<i>&lt;cluster-id&gt;</i>-sg) must include inbound rules and outbound
     *         rules that allow TCP traffic on ports 2223-2225. The <b>Source</b> in the inbound rules and the
     *         <b>Destination</b> in the outbound rules must match the security group ID. These rules are set by default
     *         when you create the CloudHSM cluster. Do not delete or change them. To get information about a particular
     *         security group, use the <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSecurityGroups.html"
     *         >DescribeSecurityGroups</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The CloudHSM cluster must contain at least as many HSMs as the operation requires. To add HSMs, use the
     *         CloudHSM <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/APIReference/API_CreateHsm.html">CreateHsm</a>
     *         operation.
     *         </p>
     *         <p>
     *         For the <a>CreateCustomKeyStore</a>, <a>UpdateCustomKeyStore</a>, and <a>CreateKey</a> operations, the
     *         CloudHSM cluster must have at least two active HSMs, each in a different Availability Zone. For the
     *         <a>ConnectCustomKeyStore</a> operation, the CloudHSM must contain at least one active HSM.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the requirements for an CloudHSM cluster that is associated with an CloudHSM key
     *         store, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keystore.html#before-keystore"
     *         >Assemble the Prerequisites</a> in the <i>Key Management Service Developer Guide</i>. For information
     *         about creating a private subnet for an CloudHSM cluster, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/create-subnets.html">Create a Private
     *         Subnet</a> in the <i>CloudHSM User Guide</i>. For information about cluster security groups, see <a
     *         href="https://docs.aws.amazon.com/cloudhsm/latest/userguide/configure-sg.html">Configure a Default
     *         Security Group</a> in the <i> <i>CloudHSM User Guide</i> </i>.
     * @throws XksProxyUriInUseException
     *         The request was rejected because the concatenation of the <code>XksProxyUriEndpoint</code> and
     *         <code>XksProxyUriPath</code> is already associated with an external key store in the Amazon Web Services
     *         account and Region. Each external key store in an account and Region must use a unique external key store
     *         proxy API address.
     * @throws XksProxyUriEndpointInUseException
     *         The request was rejected because the concatenation of the <code>XksProxyUriEndpoint</code> is already
     *         associated with an external key store in the Amazon Web Services account and Region. Each external key
     *         store in an account and Region must use a unique external key store proxy address.
     * @throws XksProxyUriUnreachableException
     *         KMS was unable to reach the specified <code>XksProxyUriPath</code>. The path must be reachable before you
     *         create the external key store or update its settings.
     *         </p>
     *         <p>
     *         This exception is also thrown when the external key store proxy response to a
     *         <code>GetHealthStatus</code> request indicates that all external key manager instances are unavailable.
     * @throws XksProxyIncorrectAuthenticationCredentialException
     *         The request was rejected because the proxy credentials failed to authenticate to the specified external
     *         key store proxy. The specified external key store proxy rejected a status request from KMS due to invalid
     *         credentials. This can indicate an error in the credentials or in the identification of the external key
     *         store proxy.
     * @throws XksProxyVpcEndpointServiceInUseException
     *         The request was rejected because the specified Amazon VPC endpoint service is already associated with an
     *         external key store in the Amazon Web Services account and Region. Each external key store in an Amazon
     *         Web Services account and Region must use a different Amazon VPC endpoint service.
     * @throws XksProxyVpcEndpointServiceNotFoundException
     *         The request was rejected because KMS could not find the specified VPC endpoint service. Use
     *         <a>DescribeCustomKeyStores</a> to verify the VPC endpoint service name for the external key store. Also,
     *         confirm that the <code>Allow principals</code> list for the VPC endpoint service includes the KMS service
     *         principal for the Region, such as <code>cks.kms.us-east-1.amazonaws.com</code>.
     * @throws XksProxyVpcEndpointServiceInvalidConfigurationException
     *         The request was rejected because the Amazon VPC endpoint service configuration does not fulfill the
     *         requirements for an external key store proxy. For details, see the exception message and <a
     *         href="kms/latest/developerguide/vpc-connectivity.html#xks-vpc-requirements">review the requirements</a>
     *         for Amazon VPC endpoint service connectivity for an external key store.
     * @throws XksProxyInvalidResponseException
     *         <p>
     *         KMS cannot interpret the response it received from the external key store proxy. The problem might be a
     *         poorly constructed response, but it could also be a transient network issue. If you see this error
     *         repeatedly, report it to the proxy vendor.
     * @throws XksProxyInvalidConfigurationException
     *         The request was rejected because the Amazon VPC endpoint service configuration does not fulfill the
     *         requirements for an external key store proxy. For details, see the exception message.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates the description of a KMS key. To see the description of a KMS key, use <a>DescribeKey</a>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot perform this operation on a KMS key in a different Amazon Web Services
     * account.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html"
     * >kms:UpdateKeyDescription</a> (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateKeyDescriptionRequest
     * @return Result of the UpdateKeyDescription operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Changes the primary key of a multi-Region key.
     * </p>
     * <p>
     * This operation changes the replica key in the specified Region to a primary key and changes the former primary
     * key to a replica key. For example, suppose you have a primary key in <code>us-east-1</code> and a replica key in
     * <code>eu-west-2</code>. If you run <code>UpdatePrimaryRegion</code> with a <code>PrimaryRegion</code> value of
     * <code>eu-west-2</code>, the primary key is now the key in <code>eu-west-2</code>, and the key in
     * <code>us-east-1</code> becomes a replica key. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-manage.html#multi-region-update"
     * >Updating the primary Region</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This operation supports <i>multi-Region keys</i>, an KMS feature that lets you create multiple interoperable KMS
     * keys in different Amazon Web Services Regions. Because these KMS keys have the same key ID, key material, and
     * other metadata, you can use them interchangeably to encrypt data in one Amazon Web Services Region and decrypt it
     * in a different Amazon Web Services Region without re-encrypting the data or making a cross-Region call. For more
     * information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Multi-Region keys in
     * KMS</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The <i>primary key</i> of a multi-Region key is the source for properties that are always shared by primary and
     * replica keys, including the key material, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">key ID</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-spec">key spec</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-usage">key usage</a>, <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-origin">key material origin</a>,
     * and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html">automatic key rotation</a>.
     * It's the only key that can be replicated. You cannot <a
     * href="https://docs.aws.amazon.com/kms/latest/APIReference/API_ScheduleKeyDeletion.html">delete the primary
     * key</a> until all replica keys are deleted.
     * </p>
     * <p>
     * The key ID and primary Region that you specify uniquely identify the replica key that will become the primary
     * key. The primary Region must already have a replica key. This operation does not create a KMS key in the
     * specified Region. To find the replica keys, use the <a>DescribeKey</a> operation on the primary key or any
     * replica key. To create a replica key, use the <a>ReplicateKey</a> operation.
     * </p>
     * <p>
     * You can run this operation while using the affected multi-Region keys in cryptographic operations. This operation
     * should not delay, interrupt, or cause failures in cryptographic operations.
     * </p>
     * <p>
     * Even after this operation completes, the process of updating the primary Region might still be in progress for a
     * few more seconds. Operations such as <code>DescribeKey</code> might display both the old and new primary keys as
     * replicas. The old and new primary keys have a transient key state of <code>Updating</code>. The original key
     * state is restored when the update is complete. While the key state is <code>Updating</code>, you can use the keys
     * in cryptographic operations, but you cannot replicate the new primary key or perform certain management
     * operations, such as enabling or disabling these keys. For details about the <code>Updating</code> key state, see
     * <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * This operation does not return any output. To verify that primary key is changed, use the <a>DescribeKey</a>
     * operation.
     * </p>
     * <p>
     * <b>Cross-account use</b>: No. You cannot use this operation in a different Amazon Web Services account.
     * </p>
     * <p>
     * <b>Required permissions</b>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kms:UpdatePrimaryRegion</code> on the current primary key (in the primary key's Region). Include this
     * permission primary key's key policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kms:UpdatePrimaryRegion</code> on the current replica key (in the replica key's Region). Include this
     * permission in the replica key's key policy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related operations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ReplicateKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updatePrimaryRegionRequest
     * @return Result of the UpdatePrimaryRegion operation returned by the service.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN, or an ARN in a key policy, is not valid.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.</p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AWSKMS.UpdatePrimaryRegion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdatePrimaryRegion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePrimaryRegionResult updatePrimaryRegion(UpdatePrimaryRegionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePrimaryRegion(request);
    }

    @SdkInternalApi
    final UpdatePrimaryRegionResult executeUpdatePrimaryRegion(UpdatePrimaryRegionRequest updatePrimaryRegionRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePrimaryRegionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePrimaryRegionRequest> request = null;
        Response<UpdatePrimaryRegionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePrimaryRegionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePrimaryRegionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePrimaryRegion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePrimaryRegionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePrimaryRegionResultJsonUnmarshaller());
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
     * Verification confirms that an authorized user signed the message with the specified KMS key and signing
     * algorithm, and the message hasn't changed since it was signed. If the signature is verified, the value of the
     * <code>SignatureValid</code> field in the response is <code>True</code>. If the signature verification fails, the
     * <code>Verify</code> operation fails with an <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * <p>
     * A digital signature is generated by using the private key in an asymmetric KMS key. The signature is verified by
     * using the public key in the same asymmetric KMS key. For information about asymmetric KMS keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Asymmetric KMS keys</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * To verify a digital signature, you can use the <code>Verify</code> operation. Specify the same asymmetric KMS
     * key, message, and signing algorithm that were used to produce the signature.
     * </p>
     * <p>
     * You can also verify the digital signature by using the public key of the KMS key outside of KMS. Use the
     * <a>GetPublicKey</a> operation to download the public key in the asymmetric KMS key and then use the public key to
     * verify the signature outside of KMS. The advantage of using the <code>Verify</code> operation is that it is
     * performed within KMS. As a result, it's easy to call, the operation is performed within the FIPS boundary, it is
     * logged in CloudTrail, and you can use key policy and IAM policy to determine who is authorized to use the KMS key
     * to verify signatures.
     * </p>
     * <p>
     * To verify a signature outside of KMS with an SM2 public key (China Regions only), you must specify the
     * distinguishing ID. By default, KMS uses <code>1234567812345678</code> as the distinguishing ID. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-sm-offline-verification"
     * >Offline verification with SM2 key pairs</a>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:Verify</a>
     * (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>Sign</a>
     * </p>
     * 
     * @param verifyRequest
     * @return Result of the Verify operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @throws KMSInvalidSignatureException
     *         The request was rejected because the signature verification failed. Signature verification fails when it
     *         cannot confirm that signature was produced by signing the specified message with the specified KMS key
     *         and signing algorithm.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Verifies the hash-based message authentication code (HMAC) for a specified message, HMAC KMS key, and MAC
     * algorithm. To verify the HMAC, <code>VerifyMac</code> computes an HMAC using the message, HMAC KMS key, and MAC
     * algorithm that you specify, and compares the computed HMAC to the HMAC that you specify. If the HMACs are
     * identical, the verification succeeds; otherwise, it fails. Verification indicates that the message hasn't changed
     * since the HMAC was calculated, and the specified key was used to generate and verify the HMAC.
     * </p>
     * <p>
     * HMAC KMS keys and the HMAC algorithms that KMS uses conform to industry standards defined in <a
     * href="https://datatracker.ietf.org/doc/html/rfc2104">RFC 2104</a>.
     * </p>
     * <p>
     * This operation is part of KMS support for HMAC KMS keys. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/hmac.html">HMAC keys in KMS</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <p>
     * The KMS key that you use for this operation must be in a compatible key state. For details, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the
     * <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: Yes. To perform this operation with a KMS key in a different Amazon Web Services
     * account, specify the key ARN or alias ARN in the value of the <code>KeyId</code> parameter.
     * </p>
     * <p>
     * <b>Required permissions</b>: <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-api-permissions-reference.html">kms:VerifyMac</a>
     * (key policy)
     * </p>
     * <p>
     * <b>Related operations</b>: <a>GenerateMac</a>
     * </p>
     * 
     * @param verifyMacRequest
     * @return Result of the VerifyMac operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified KMS key is not enabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the specified KMS key was not available. You can retry the request.
     * @throws InvalidKeyUsageException
     *         The request was rejected for one of the following reasons: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>KeyUsage</code> value of the KMS key is incompatible with the API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The encryption algorithm or signing algorithm specified for the operation is incompatible with the type
     *         of key material in the KMS key <code>(KeySpec</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For encrypting, decrypting, re-encrypting, and generating data keys, the <code>KeyUsage</code> must be
     *         <code>ENCRYPT_DECRYPT</code>. For signing and verifying messages, the <code>KeyUsage</code> must be
     *         <code>SIGN_VERIFY</code>. For generating and verifying message authentication codes (MACs), the
     *         <code>KeyUsage</code> must be <code>GENERATE_VERIFY_MAC</code>. To find the <code>KeyUsage</code> of a
     *         KMS key, use the <a>DescribeKey</a> operation.
     *         </p>
     *         <p>
     *         To find the encryption or signing algorithms supported for a particular KMS key, use the
     *         <a>DescribeKey</a> operation.
     * @throws InvalidGrantTokenException
     *         The request was rejected because the specified grant token is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred. The request can be retried.
     * @throws KMSInvalidMacException
     *         The request was rejected because the HMAC verification failed. HMAC verification fails when the HMAC
     *         computed by using the specified message, HMAC KMS key, and MAC algorithm does not match the HMAC
     *         specified in the request.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified resource is not valid for this request.
     *         </p>
     *         <p>
     *         This exceptions means one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The key state of the KMS key is not compatible with the operation.
     *         </p>
     *         <p>
     *         To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states
     *         are compatible with each KMS operation, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in
     *         the <i> <i>Key Management Service Developer Guide</i> </i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For cryptographic operations on KMS keys in custom key stores, this exception represents a general
     *         failure with many possible causes. To identify the cause, see the error message that accompanies the
     *         exception.
     *         </p>
     *         </li>
     * @sample AWSKMS.VerifyMac
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/VerifyMac" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public VerifyMacResult verifyMac(VerifyMacRequest request) {
        request = beforeClientExecution(request);
        return executeVerifyMac(request);
    }

    @SdkInternalApi
    final VerifyMacResult executeVerifyMac(VerifyMacRequest verifyMacRequest) {

        ExecutionContext executionContext = createExecutionContext(verifyMacRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyMacRequest> request = null;
        Response<VerifyMacResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyMacRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(verifyMacRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "KMS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "VerifyMac");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<VerifyMacResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new VerifyMacResultJsonUnmarshaller());
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
