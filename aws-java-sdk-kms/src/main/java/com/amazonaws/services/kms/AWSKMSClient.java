/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kms;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.services.kms.model.transform.*;

/**
 * Client for accessing KMS. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web
 * service. This guide describes the AWS KMS operations that you can call
 * programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key
 * Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .Net, iOS, Android, etc.).
 * The SDKs provide a convenient way to create programmatic access to AWS KMS
 * and other AWS services. For example, the SDKs take care of tasks such as
 * signing requests (see below), managing errors, and retrying requests
 * automatically. For more information about the AWS SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS
 * KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS
 * 1.2. Clients must also support cipher suites with Perfect Forward Secrecy
 * (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support
 * these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We
 * strongly recommend that you <i>do not</i> use your AWS account access key ID
 * and secret key for everyday work with AWS KMS. Instead, use the access key ID
 * and secret access key for an IAM user, or you can use the AWS Security Token
 * Service to generate temporary security credentials that you can use to sign
 * requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3 bucket
 * that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to turn it
 * on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS
 * CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a> - This topic provides general information about
 * the types of credentials used for accessing AWS.</li>
 * <li><a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/">AWS Security
 * Token Service</a> - This guide describes how to create and use temporary
 * security credentials.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * >Signing AWS API Requests</a> - This set of topics walks you through the
 * process of signing a request using an access key ID and a secret access key.</li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful
 * for most applications. You will likely perform actions other than these, such
 * as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li><a>Encrypt</a></li>
 * <li><a>Decrypt</a></li>
 * <li><a>GenerateDataKey</a></li>
 * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
 * </ul>
 */
public class AWSKMSClient extends AmazonWebServiceClient implements AWSKMS {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSKMS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "kms";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "kms";

    /**
     * List of exception unmarshallers for all KMS exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on KMS. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSKMSClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS. A credentials
     * provider chain will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to KMS (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSKMSClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSKMSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the
     * specified AWS account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to KMS (ex: proxy settings, retry counts, etc.).
     */
    public AWSKMSClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the
     * specified AWS account credentials provider and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to KMS (ex: proxy settings, retry counts, etc.).
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on KMS using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to KMS (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSKMSClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.DependencyTimeoutException.class,
                        "DependencyTimeoutException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.InvalidGrantIdException.class,
                "InvalidGrantIdException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.LimitExceededException.class,
                "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.InvalidAliasNameException.class,
                        "InvalidAliasNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.MalformedPolicyDocumentException.class,
                        "MalformedPolicyDocumentException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.UnsupportedOperationException.class,
                        "UnsupportedOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.InvalidGrantTokenException.class,
                        "InvalidGrantTokenException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.InvalidMarkerException.class,
                "InvalidMarkerException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.InvalidArnException.class,
                "InvalidArnException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.DisabledException.class,
                "DisabledException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.InvalidCiphertextException.class,
                        "InvalidCiphertextException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.AlreadyExistsException.class,
                "AlreadyExistsException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.KMSInternalException.class,
                "KMSInternalException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.NotFoundException.class,
                "NotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.InvalidKeyUsageException.class,
                        "InvalidKeyUsageException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.kms.model.KeyUnavailableException.class,
                "KeyUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.kms.model.KMSInvalidStateException.class,
                        "KMSInvalidStateException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://kms.us-east-1.amazonaws.com/");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/kms/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/kms/request.handler2s"));
    }

    /**
     * <p>
     * Cancels the deletion of a customer master key (CMK). When this operation
     * is successful, the CMK is set to the <code>Disabled</code> state. To
     * enable a CMK, use <a>EnableKey</a>.
     * </p>
     * <p>
     * For more information about scheduling and canceling deletion of a CMK, go
     * to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param cancelKeyDeletionRequest
     * @return Result of the CancelKeyDeletion operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CancelKeyDeletion
     */
    @Override
    public CancelKeyDeletionResult cancelKeyDeletion(
            CancelKeyDeletionRequest cancelKeyDeletionRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelKeyDeletionRequest> request = null;
        Response<CancelKeyDeletionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelKeyDeletionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(cancelKeyDeletionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CancelKeyDeletionResult> responseHandler = new JsonResponseHandler<CancelKeyDeletionResult>(
                    new CancelKeyDeletionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a display name for a customer master key. An alias can be used to
     * identify a key and should be unique. The console enforces a one-to-one
     * mapping between the alias and a key. An alias name can contain only
     * alphanumeric characters, forward slashes (/), underscores (_), and dashes
     * (-). An alias must start with the word "alias" followed by a forward
     * slash (alias/). An alias that begins with "aws" after the forward slash
     * (alias/aws...) is reserved by Amazon Web Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * <p>
     * To map an alias to a different key, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws AlreadyExistsException
     *         The request was rejected because it attempted to create a
     *         resource that already exists.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidAliasNameException
     *         The request was rejected because the specified alias name is not
     *         valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateAlias
     */
    @Override
    public void createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a grant to a key to specify who can use the key and under what
     * conditions. Grants are alternate permission mechanisms to key policies.
     * </p>
     * <p>
     * For more information about grants, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/grants.html"
     * >Grants</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param createGrantRequest
     * @return Result of the CreateGrant operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.CreateGrant
     */
    @Override
    public CreateGrantResult createGrant(CreateGrantRequest createGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(createGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGrantRequest> request = null;
        Response<CreateGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGrantRequestMarshaller().marshall(super
                        .beforeMarshalling(createGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateGrantResult> responseHandler = new JsonResponseHandler<CreateGrantResult>(
                    new CreateGrantResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a customer master key. Customer master keys can be used to
     * encrypt small amounts of data (less than 4K) directly, but they are most
     * commonly used to encrypt or envelope data keys that are then used to
     * encrypt customer data. For more information about data keys, see
     * <a>GenerateDataKey</a> and <a>GenerateDataKeyWithoutPlaintext</a>.
     * </p>
     * 
     * @param createKeyRequest
     * @return Result of the CreateKey operation returned by the service.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not
     *         syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not
     *         supported.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @sample AWSKMS.CreateKey
     */
    @Override
    public CreateKeyResult createKey(CreateKeyRequest createKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(createKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyRequest> request = null;
        Response<CreateKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(createKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateKeyResult> responseHandler = new JsonResponseHandler<CreateKeyResult>(
                    new CreateKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously
     * encrypted by using any of the following functions:
     * <ul>
     * <li><a>GenerateDataKey</a></li>
     * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
     * <li><a>Encrypt</a></li>
     * </ul>
     * </p>
     * <p>
     * Note that if a caller has been granted access permissions to all keys
     * (through, for example, IAM user policies that grant <code>Decrypt</code>
     * permission on all resources), then ciphertext encrypted by using keys in
     * other accounts where the key grants access to the caller can be
     * decrypted. To remedy this, we recommend that you do not grant
     * <code>Decrypt</code> access in an IAM user policy. Instead grant
     * <code>Decrypt</code> access only in key policies. If you must grant
     * <code>Decrypt</code> access in an IAM user policy, you should scope the
     * resource to specific keys or to specific trusted accounts.
     * </p>
     * 
     * @param decryptRequest
     * @return Result of the Decrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext has
     *         been corrupted or is otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Decrypt
     */
    @Override
    public DecryptResult decrypt(DecryptRequest decryptRequest) {
        ExecutionContext executionContext = createExecutionContext(decryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DecryptRequest> request = null;
        Response<DecryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DecryptRequestMarshaller().marshall(super
                        .beforeMarshalling(decryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DecryptResult> responseHandler = new JsonResponseHandler<DecryptResult>(
                    new DecryptResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified alias. To map an alias to a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param deleteAliasRequest
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DeleteAlias
     */
    @Override
    public void deleteAlias(DeleteAliasRequest deleteAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAliasRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides detailed information about the specified customer master key.
     * </p>
     * 
     * @param describeKeyRequest
     * @return Result of the DescribeKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.DescribeKey
     */
    @Override
    public DescribeKeyResult describeKey(DescribeKeyRequest describeKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(describeKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyRequest> request = null;
        Response<DescribeKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(describeKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeKeyResult> responseHandler = new JsonResponseHandler<DescribeKeyResult>(
                    new DescribeKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the state of a master key to disabled, thereby preventing its use
     * for cryptographic operations. For more information about how key state
     * affects the use of a master key, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param disableKeyRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DisableKey
     */
    @Override
    public void disableKey(DisableKeyRequest disableKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(disableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(disableKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables rotation of the specified key.
     * </p>
     * 
     * @param disableKeyRotationRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.DisableKeyRotation
     */
    @Override
    public void disableKeyRotation(
            DisableKeyRotationRequest disableKeyRotationRequest) {
        ExecutionContext executionContext = createExecutionContext(disableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableKeyRotationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableKeyRotationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disableKeyRotationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Marks a key as enabled, thereby permitting its use.
     * </p>
     * 
     * @param enableKeyRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.EnableKey
     */
    @Override
    public void enableKey(EnableKeyRequest enableKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(enableKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(enableKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables rotation of the specified customer master key.
     * </p>
     * 
     * @param enableKeyRotationRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.EnableKeyRotation
     */
    @Override
    public void enableKeyRotation(
            EnableKeyRotationRequest enableKeyRotationRequest) {
        ExecutionContext executionContext = createExecutionContext(enableKeyRotationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableKeyRotationRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableKeyRotationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(enableKeyRotationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Encrypts plaintext into ciphertext by using a customer master key. The
     * <code>Encrypt</code> function has two primary use cases:
     * <ul>
     * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key, a
     * database password, or other sensitive customer information.</li>
     * <li>If you are moving encrypted data from one region to another, you can
     * use this API to encrypt in the new region the plaintext data key that was
     * used to encrypt the data in the original region. This provides you with
     * an encrypted copy of the data key that can be decrypted in the new region
     * and used there to decrypt the encrypted data.</li>
     * </ul>
     * </p>
     * <p>
     * Unless you are moving encrypted data from one region to another, you
     * don't use this function to encrypt a generated data key within a region.
     * You retrieve data keys already encrypted by calling the
     * <a>GenerateDataKey</a> or <a>GenerateDataKeyWithoutPlaintext</a>
     * function. Data keys don't need to be encrypted again by calling
     * <code>Encrypt</code>.
     * </p>
     * <p>
     * If you want to encrypt data locally in your application, you can use the
     * <code>GenerateDataKey</code> function to return a plaintext data
     * encryption key and a copy of the key encrypted under the customer master
     * key (CMK) of your choosing.
     * </p>
     * 
     * @param encryptRequest
     * @return Result of the Encrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.Encrypt
     */
    @Override
    public EncryptResult encrypt(EncryptRequest encryptRequest) {
        ExecutionContext executionContext = createExecutionContext(encryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EncryptRequest> request = null;
        Response<EncryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EncryptRequestMarshaller().marshall(super
                        .beforeMarshalling(encryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EncryptResult> responseHandler = new JsonResponseHandler<EncryptResult>(
                    new EncryptResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates a data key that you can use in your application to locally
     * encrypt data. This call returns a plaintext version of the key in the
     * <code>Plaintext</code> field of the response object and an encrypted copy
     * of the key in the <code>CiphertextBlob</code> field. The key is encrypted
     * by using the master key specified by the <code>KeyId</code> field. To
     * decrypt the encrypted key, pass it to the <code>Decrypt</code> API.
     * </p>
     * <p>
     * We recommend that you use the following pattern to locally encrypt data:
     * call the <code>GenerateDataKey</code> API, use the key returned in the
     * <code>Plaintext</code> response field to locally encrypt data, and then
     * erase the plaintext data key from memory. Store the encrypted data key
     * (contained in the <code>CiphertextBlob</code> field) alongside of the
     * locally encrypted data.
     * </p>
     * <note>You should not call the <code>Encrypt</code> function to re-encrypt
     * your data keys within a region. <code>GenerateDataKey</code> always
     * returns the data key encrypted and tied to the customer master key that
     * will be used to decrypt it. There is no need to decrypt it twice. </note>
     * <p>
     * If you decide to use the optional <code>EncryptionContext</code>
     * parameter, you must also store the context in full or at least store
     * enough information along with the encrypted data to be able to
     * reconstruct the context when submitting the ciphertext to the
     * <code>Decrypt</code> API. It is a good practice to choose a context that
     * you can reconstruct on the fly to better secure the ciphertext. For more
     * information about how this parameter is used, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a>.
     * </p>
     * <p>
     * To decrypt data, pass the encrypted data key to the <code>Decrypt</code>
     * API. <code>Decrypt</code> uses the associated master key to decrypt the
     * encrypted data key and returns it as plaintext. Use the plaintext data
     * key to locally decrypt your data and then erase the key from memory. You
     * must specify the encryption context, if any, that you specified when you
     * generated the key. The encryption context is logged by CloudTrail, and
     * you can use this log to help track the use of particular data.
     * </p>
     * 
     * @param generateDataKeyRequest
     * @return Result of the GenerateDataKey operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKey
     */
    @Override
    public GenerateDataKeyResult generateDataKey(
            GenerateDataKeyRequest generateDataKeyRequest) {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyRequest> request = null;
        Response<GenerateDataKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyRequestMarshaller().marshall(super
                        .beforeMarshalling(generateDataKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GenerateDataKeyResult> responseHandler = new JsonResponseHandler<GenerateDataKeyResult>(
                    new GenerateDataKeyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a data key encrypted by a customer master key without the
     * plaintext copy of that key. Otherwise, this API functions exactly like
     * <a>GenerateDataKey</a>. You can use this API to, for example, satisfy an
     * audit requirement that an encrypted key be made available without
     * exposing the plaintext copy of that key.
     * </p>
     * 
     * @param generateDataKeyWithoutPlaintextRequest
     * @return Result of the GenerateDataKeyWithoutPlaintext operation returned
     *         by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GenerateDataKeyWithoutPlaintext
     */
    @Override
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest) {
        ExecutionContext executionContext = createExecutionContext(generateDataKeyWithoutPlaintextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateDataKeyWithoutPlaintextRequest> request = null;
        Response<GenerateDataKeyWithoutPlaintextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateDataKeyWithoutPlaintextRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(generateDataKeyWithoutPlaintextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult> responseHandler = new JsonResponseHandler<GenerateDataKeyWithoutPlaintextResult>(
                    new GenerateDataKeyWithoutPlaintextResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Generates an unpredictable byte string.
     * </p>
     * 
     * @param generateRandomRequest
     * @return Result of the GenerateRandom operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.GenerateRandom
     */
    @Override
    public GenerateRandomResult generateRandom(
            GenerateRandomRequest generateRandomRequest) {
        ExecutionContext executionContext = createExecutionContext(generateRandomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GenerateRandomRequest> request = null;
        Response<GenerateRandomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GenerateRandomRequestMarshaller().marshall(super
                        .beforeMarshalling(generateRandomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GenerateRandomResult> responseHandler = new JsonResponseHandler<GenerateRandomResult>(
                    new GenerateRandomResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Retrieves a policy attached to the specified key.
     * </p>
     * 
     * @param getKeyPolicyRequest
     * @return Result of the GetKeyPolicy operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetKeyPolicy
     */
    @Override
    public GetKeyPolicyResult getKeyPolicy(
            GetKeyPolicyRequest getKeyPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPolicyRequest> request = null;
        Response<GetKeyPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(getKeyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetKeyPolicyResult> responseHandler = new JsonResponseHandler<GetKeyPolicyResult>(
                    new GetKeyPolicyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a Boolean value that indicates whether key rotation is enabled
     * for the specified key.
     * </p>
     * 
     * @param getKeyRotationStatusRequest
     * @return Result of the GetKeyRotationStatus operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.GetKeyRotationStatus
     */
    @Override
    public GetKeyRotationStatusResult getKeyRotationStatus(
            GetKeyRotationStatusRequest getKeyRotationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getKeyRotationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyRotationStatusRequest> request = null;
        Response<GetKeyRotationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyRotationStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getKeyRotationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetKeyRotationStatusResult> responseHandler = new JsonResponseHandler<GetKeyRotationStatusResult>(
                    new GetKeyRotationStatusResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the key aliases in the account.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListAliases
     */
    @Override
    public ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAliasesRequest> request = null;
        Response<ListAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAliasesRequestMarshaller().marshall(super
                        .beforeMarshalling(listAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAliasesResult> responseHandler = new JsonResponseHandler<ListAliasesResult>(
                    new ListAliasesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * List the grants for a specified key.
     * </p>
     * 
     * @param listGrantsRequest
     * @return Result of the ListGrants operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListGrants
     */
    @Override
    public ListGrantsResult listGrants(ListGrantsRequest listGrantsRequest) {
        ExecutionContext executionContext = createExecutionContext(listGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGrantsRequest> request = null;
        Response<ListGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGrantsRequestMarshaller().marshall(super
                        .beforeMarshalling(listGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListGrantsResult> responseHandler = new JsonResponseHandler<ListGrantsResult>(
                    new ListGrantsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of policies attached to a key.
     * </p>
     * 
     * @param listKeyPoliciesRequest
     * @return Result of the ListKeyPolicies operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ListKeyPolicies
     */
    @Override
    public ListKeyPoliciesResult listKeyPolicies(
            ListKeyPoliciesRequest listKeyPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listKeyPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyPoliciesRequest> request = null;
        Response<ListKeyPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyPoliciesRequestMarshaller().marshall(super
                        .beforeMarshalling(listKeyPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListKeyPoliciesResult> responseHandler = new JsonResponseHandler<ListKeyPoliciesResult>(
                    new ListKeyPoliciesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the customer master keys.
     * </p>
     * 
     * @param listKeysRequest
     * @return Result of the ListKeys operation returned by the service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListKeys
     */
    @Override
    public ListKeysResult listKeys(ListKeysRequest listKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeysRequest> request = null;
        Response<ListKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeysRequestMarshaller().marshall(super
                        .beforeMarshalling(listKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListKeysResult> responseHandler = new JsonResponseHandler<ListKeysResult>(
                    new ListKeysResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
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
     * Returns a list of all grants for which the grant's
     * <code>RetiringPrincipal</code> matches the one specified.
     * </p>
     * <p>
     * A typical use is to list all grants that you are able to retire. To
     * retire a grant, use <a>RetireGrant</a>.
     * </p>
     * 
     * @param listRetirableGrantsRequest
     * @return Result of the ListRetirableGrants operation returned by the
     *         service.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidMarkerException
     *         The request was rejected because the marker that specifies where
     *         pagination should next begin is not valid.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @sample AWSKMS.ListRetirableGrants
     */
    @Override
    public ListRetirableGrantsResult listRetirableGrants(
            ListRetirableGrantsRequest listRetirableGrantsRequest) {
        ExecutionContext executionContext = createExecutionContext(listRetirableGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRetirableGrantsRequest> request = null;
        Response<ListRetirableGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRetirableGrantsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listRetirableGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListRetirableGrantsResult> responseHandler = new JsonResponseHandler<ListRetirableGrantsResult>(
                    new ListRetirableGrantsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a policy to the specified key.
     * </p>
     * 
     * @param putKeyPolicyRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the specified policy is not
     *         syntactically or semantically correct.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not
     *         supported.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws LimitExceededException
     *         The request was rejected because a limit was exceeded. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/limits.html"
     *         >Limits</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.PutKeyPolicy
     */
    @Override
    public void putKeyPolicy(PutKeyPolicyRequest putKeyPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(putKeyPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeyPolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeyPolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(putKeyPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Encrypts data on the server side with a new customer master key without
     * exposing the plaintext of the data on the client side. The data is first
     * decrypted and then encrypted. This operation can also be used to change
     * the encryption context of a ciphertext.
     * </p>
     * <p>
     * Unlike other actions, <code>ReEncrypt</code> is authorized twice - once
     * as <code>ReEncryptFrom</code> on the source key and once as
     * <code>ReEncryptTo</code> on the destination key. We therefore recommend
     * that you include the <code>"action":"kms:ReEncrypt*"</code> statement in
     * your key policies to permit re-encryption from or to the key. The
     * statement is included automatically when you authorize use of the key
     * through the console but must be included manually when you set a policy
     * by using the <a>PutKeyPolicy</a> function.
     * </p>
     * 
     * @param reEncryptRequest
     * @return Result of the ReEncrypt operation returned by the service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DisabledException
     *         The request was rejected because the specified key was marked as
     *         disabled.
     * @throws InvalidCiphertextException
     *         The request was rejected because the specified ciphertext has
     *         been corrupted or is otherwise invalid.
     * @throws KeyUnavailableException
     *         The request was rejected because the key was not available. The
     *         request can be retried.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidKeyUsageException
     *         The request was rejected because the specified KeySpec parameter
     *         is not valid. The currently supported value is ENCRYPT/DECRYPT.
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ReEncrypt
     */
    @Override
    public ReEncryptResult reEncrypt(ReEncryptRequest reEncryptRequest) {
        ExecutionContext executionContext = createExecutionContext(reEncryptRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReEncryptRequest> request = null;
        Response<ReEncryptResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReEncryptRequestMarshaller().marshall(super
                        .beforeMarshalling(reEncryptRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReEncryptResult> responseHandler = new JsonResponseHandler<ReEncryptResult>(
                    new ReEncryptResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retires a grant. You can retire a grant when you're done using it to
     * clean up. You should revoke a grant when you intend to actively deny
     * operations that depend on it. The following are permitted to call this
     * API:
     * <ul>
     * <li>The account that created the grant</li>
     * <li>The <code>RetiringPrincipal</code>, if present</li>
     * <li>The <code>GranteePrincipal</code>, if <code>RetireGrant</code> is a
     * grantee operation</li>
     * </ul>
     * The grant to retire must be identified by its grant token or by a
     * combination of the key ARN and the grant ID. A grant token is a unique
     * variable-length base64-encoded string. A grant ID is a 64 character
     * unique identifier of a grant. Both are returned by the
     * <code>CreateGrant</code> function.
     * </p>
     * 
     * @param retireGrantRequest
     * @throws InvalidGrantTokenException
     *         The request was rejected because a grant token provided as part
     *         of the request is invalid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified
     *         <code>GrantId</code> is not valid.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RetireGrant
     */
    @Override
    public void retireGrant(RetireGrantRequest retireGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(retireGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetireGrantRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetireGrantRequestMarshaller().marshall(super
                        .beforeMarshalling(retireGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public void retireGrant() {
        retireGrant(new RetireGrantRequest());
    }

    /**
     * <p>
     * Revokes a grant. You can revoke a grant to actively deny operations that
     * depend on it.
     * </p>
     * 
     * @param revokeGrantRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws InvalidGrantIdException
     *         The request was rejected because the specified
     *         <code>GrantId</code> is not valid.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.RevokeGrant
     */
    @Override
    public void revokeGrant(RevokeGrantRequest revokeGrantRequest) {
        ExecutionContext executionContext = createExecutionContext(revokeGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeGrantRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeGrantRequestMarshaller().marshall(super
                        .beforeMarshalling(revokeGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Schedules the deletion of a customer master key (CMK). You may provide a
     * waiting period, specified in days, before deletion occurs. If you do not
     * provide a waiting period, the default period of 30 days is used. When
     * this operation is successful, the state of the CMK changes to
     * <code>PendingDeletion</code>. Before the waiting period ends, you can use
     * <a>CancelKeyDeletion</a> to cancel the deletion of the CMK. After the
     * waiting period ends, AWS KMS deletes the CMK and all AWS KMS data
     * associated with it, including all aliases that point to it.
     * </p>
     * <important>
     * <p>
     * Deleting a CMK is a destructive and potentially dangerous operation. When
     * a CMK is deleted, all data that was encrypted under the CMK is rendered
     * unrecoverable. To restrict the use of a CMK without deleting it, use
     * <a>DisableKey</a>.
     * </p>
     * </important>
     * <p>
     * For more information about scheduling a CMK for deletion, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/deleting-keys.html"
     * >Deleting Customer Master Keys</a> in the <i>AWS Key Management Service
     * Developer Guide</i>.
     * </p>
     * 
     * @param scheduleKeyDeletionRequest
     * @return Result of the ScheduleKeyDeletion operation returned by the
     *         service.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.ScheduleKeyDeletion
     */
    @Override
    public ScheduleKeyDeletionResult scheduleKeyDeletion(
            ScheduleKeyDeletionRequest scheduleKeyDeletionRequest) {
        ExecutionContext executionContext = createExecutionContext(scheduleKeyDeletionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScheduleKeyDeletionRequest> request = null;
        Response<ScheduleKeyDeletionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScheduleKeyDeletionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(scheduleKeyDeletionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ScheduleKeyDeletionResult> responseHandler = new JsonResponseHandler<ScheduleKeyDeletionResult>(
                    new ScheduleKeyDeletionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an alias to map it to a different key.
     * </p>
     * <p>
     * An alias is not a property of a key. Therefore, an alias can be mapped to
     * and unmapped from an existing key without changing the properties of the
     * key.
     * </p>
     * <p>
     * An alias name can contain only alphanumeric characters, forward slashes
     * (/), underscores (_), and dashes (-). An alias must start with the word
     * "alias" followed by a forward slash (alias/). An alias that begins with
     * "aws" after the forward slash (alias/aws...) is reserved by Amazon Web
     * Services (AWS).
     * </p>
     * <p>
     * The alias and the key it is mapped to must be in the same AWS account and
     * the same region.
     * </p>
     * 
     * @param updateAliasRequest
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateAlias
     */
    @Override
    public void updateAlias(UpdateAliasRequest updateAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAliasRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(updateAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of a key.
     * </p>
     * 
     * @param updateKeyDescriptionRequest
     * @throws NotFoundException
     *         The request was rejected because the specified entity or resource
     *         could not be found.
     * @throws InvalidArnException
     *         The request was rejected because a specified ARN was not valid.
     * @throws DependencyTimeoutException
     *         The system timed out while trying to fulfill the request. The
     *         request can be retried.
     * @throws KMSInternalException
     *         The request was rejected because an internal exception occurred.
     *         The request can be retried.
     * @throws KMSInvalidStateException
     *         The request was rejected because the state of the specified
     *         resource is not valid for this request.</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         customer master key (CMK), go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @sample AWSKMS.UpdateKeyDescription
     */
    @Override
    public void updateKeyDescription(
            UpdateKeyDescriptionRequest updateKeyDescriptionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateKeyDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeyDescriptionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeyDescriptionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateKeyDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(
                    null);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
