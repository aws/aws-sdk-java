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
package com.amazonaws.services.iot;

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

import com.amazonaws.services.iot.model.*;
import com.amazonaws.services.iot.model.transform.*;

/**
 * Client for accessing AWS IoT. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS IoT</fullname>
 * <p>
 * AWS IoT provides secure, bi-directional communication between
 * Internet-connected things (such as sensors, actuators, embedded devices, or
 * smart appliances) and the AWS cloud. You can discover your custom IoT-Data
 * endpoint to communicate with, configure rules for data processing and
 * integration with other services, organize resources associated with each
 * thing (Thing Registry), configure logging, and create and manage policies and
 * credentials to authenticate things.
 * </p>
 * <p>
 * For more information about how AWS IoT works, see the <a href=
 * "http://docs.aws.amazon.com/iot/latest/developerguide/aws-iot-how-it-works.html"
 * >Developer Guide</a>.
 * </p>
 */
public class AWSIotClient extends AmazonWebServiceClient implements AWSIot {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSIot.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "execute-api";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "iot";

    /**
     * List of exception unmarshallers for all AWS IoT exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS IoT. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AWSIotClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *        connects to AWS IoT (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSIotClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the
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
    public AWSIotClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the
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
     *        connects to AWS IoT (ex: proxy settings, retry counts, etc.).
     */
    public AWSIotClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the
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
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the
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
     *        connects to AWS IoT (ex: proxy settings, retry counts, etc.).
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS IoT using the
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
     *        connects to AWS IoT (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSIotClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.UnauthorizedException.class,
                "UnauthorizedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.ResourceAlreadyExistsException.class,
                        "ResourceAlreadyExistsException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.SqlParseException.class,
                "SqlParseException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.LimitExceededException.class,
                "LimitExceededException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.InternalException.class,
                "InternalException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.MalformedPolicyException.class,
                        "MalformedPolicyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.TransferAlreadyCompletedException.class,
                        "TransferAlreadyCompletedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.CertificateStateException.class,
                        "CertificateStateException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.ServiceUnavailableException.class,
                        "ServiceUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.VersionsLimitExceededException.class,
                        "VersionsLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.InternalFailureException.class,
                        "InternalFailureException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.DeleteConflictException.class,
                "DeleteConflictException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.iot.model.TransferConflictException.class,
                        "TransferConflictException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.ThrottlingException.class,
                "ThrottlingException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.iot.model.InvalidRequestException.class,
                "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://iot.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/iot/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/iot/request.handler2s"));
    }

    /**
     * <p>
     * Accepts a pending certificate transfer. The default state of the
     * certificate is INACTIVE.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * 
     * @param acceptCertificateTransferRequest
     *        The input for the AcceptCertificateTransfer operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because it has already
     *         completed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AcceptCertificateTransfer
     */
    @Override
    public void acceptCertificateTransfer(
            AcceptCertificateTransferRequest acceptCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(acceptCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptCertificateTransferRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptCertificateTransferRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(acceptCertificateTransferRequest));
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
     * Attaches the specified policy to the specified principal (certificate or
     * other credential).
     * </p>
     * 
     * @param attachPrincipalPolicyRequest
     *        The input for the AttachPrincipalPolicy operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws LimitExceededException
     *         The number of attached entities exceeds the limit.
     * @sample AWSIot.AttachPrincipalPolicy
     */
    @Override
    public void attachPrincipalPolicy(
            AttachPrincipalPolicyRequest attachPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(attachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachPrincipalPolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachPrincipalPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(attachPrincipalPolicyRequest));
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
     * Attaches the specified principal to the specified thing.
     * </p>
     * 
     * @param attachThingPrincipalRequest
     *        The input for the AttachThingPrincipal operation.
     * @return Result of the AttachThingPrincipal operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.AttachThingPrincipal
     */
    @Override
    public AttachThingPrincipalResult attachThingPrincipal(
            AttachThingPrincipalRequest attachThingPrincipalRequest) {
        ExecutionContext executionContext = createExecutionContext(attachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachThingPrincipalRequest> request = null;
        Response<AttachThingPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachThingPrincipalRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(attachThingPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AttachThingPrincipalResult> responseHandler = new JsonResponseHandler<AttachThingPrincipalResult>(
                    new AttachThingPrincipalResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a pending transfer for the specified certificate.
     * </p>
     * <p>
     * <b>Note</b> Only the transfer source account can use this operation to
     * cancel a transfer (transfer destinations can use
     * <a>RejectCertificateTransfer</a> instead). After transfer, AWS IoT
     * returns the certificate to the source account in the INACTIVE state. Once
     * the destination account has accepted the transfer, the transfer may no
     * longer be cancelled.
     * </p>
     * <p>
     * After a certificate transfer is cancelled, the status of the certificate
     * changes from PENDING_TRANSFER to INACTIVE.
     * </p>
     * 
     * @param cancelCertificateTransferRequest
     *        The input for the CancelCertificateTransfer operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because it has already
     *         completed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CancelCertificateTransfer
     */
    @Override
    public void cancelCertificateTransfer(
            CancelCertificateTransferRequest cancelCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCertificateTransferRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCertificateTransferRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(cancelCertificateTransferRequest));
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
     * Creates an X.509 certificate using the specified certificate signing
     * request.
     * </p>
     * <p>
     * <b>Note</b> Reusing the same certificate signing request (CSR) results in
     * a distinct certificate.
     * </p>
     * <p>
     * You can create multiple certificates in a batch by creating a directory
     * and copying multiple .csr files into that directory and specifying that
     * directory on the command line. The following commands show how to create
     * a batch of certificates given a batch of CSRs.
     * </p>
     * <p>
     * Assuming a set of CSRs are located inside of the directory
     * my-csr-directory:
     * </p>
     * &gt;
     * <p>
     * On Linux and OSX, the command is:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -I {} aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/{}
     * </p>
     * <p>
     * This command lists all of the CSRs in my-csr-directory and pipes each CSR
     * filename to the aws iot create-certificate-from-csr AWS CLI command to
     * create a certificate for the corresponding CSR.
     * </p>
     * <p>
     * The aws iot create-certificate-from-csr part of the command can also be
     * run in parallel to speed up the certificate creation process:
     * </p>
     * <p>
     * $ ls my-csr-directory/ | xargs -P 10 -I {} aws iot
     * create-certificate-from-csr --certificate-signing-request
     * file://my-csr-directory/{}
     * </p>
     * <p>
     * On Windows PowerShell, the command to create certificates for all CSRs in
     * my-csr-directory is:
     * </p>
     * <p>
     * &gt; ls -Name my-csr-directory | %{aws iot create-certificate-from-csr
     * --certificate-signing-request file://my-csr-directory/$_}
     * </p>
     * <p>
     * On Windows Command Prompt, the command to create certificates for all
     * CSRs in my-csr-directory is:
     * </p>
     * <p>
     * &gt; forfiles /p my-csr-directory /c
     * "cmd /c aws iot create-certificate-from-csr --certificate-signing-request file://@path"
     * </p>
     * 
     * @param createCertificateFromCsrRequest
     *        The input for the CreateCertificateFromCsr operation.
     * @return Result of the CreateCertificateFromCsr operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateCertificateFromCsr
     */
    @Override
    public CreateCertificateFromCsrResult createCertificateFromCsr(
            CreateCertificateFromCsrRequest createCertificateFromCsrRequest) {
        ExecutionContext executionContext = createExecutionContext(createCertificateFromCsrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCertificateFromCsrRequest> request = null;
        Response<CreateCertificateFromCsrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCertificateFromCsrRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createCertificateFromCsrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateCertificateFromCsrResult> responseHandler = new JsonResponseHandler<CreateCertificateFromCsrResult>(
                    new CreateCertificateFromCsrResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a 2048 bit RSA key pair and issues an X.509 certificate using the
     * issued public key.
     * </p>
     * <p>
     * <b>Note</b> This is the only time AWS IoT issues the private key for this
     * certificate. It is important to keep track of the private key.
     * </p>
     * 
     * @param createKeysAndCertificateRequest
     *        The input for the CreateKeysAndCertificate operation.
     * @return Result of the CreateKeysAndCertificate operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreateKeysAndCertificate
     */
    @Override
    public CreateKeysAndCertificateResult createKeysAndCertificate(
            CreateKeysAndCertificateRequest createKeysAndCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(createKeysAndCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeysAndCertificateRequest> request = null;
        Response<CreateKeysAndCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeysAndCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createKeysAndCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateKeysAndCertificateResult> responseHandler = new JsonResponseHandler<CreateKeysAndCertificateResult>(
                    new CreateKeysAndCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS IoT policy.
     * </p>
     * <p>
     * The created policy is the default version for the policy. This operation
     * creates a policy version with a version identifier of <b>1</b> and sets
     * <b>1</b> as the policy's default version.
     * </p>
     * 
     * @param createPolicyRequest
     *        The input for the CreatePolicy operation.
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicy
     */
    @Override
    public CreatePolicyResult createPolicy(
            CreatePolicyRequest createPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePolicyResult> responseHandler = new JsonResponseHandler<CreatePolicyResult>(
                    new CreatePolicyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of the specified AWS IoT policy. To update a
     * policy, create a new policy version. A managed policy can have up to five
     * versions. If the policy has five versions, you must delete an existing
     * version using <a>DeletePolicyVersion</a> before you create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version; that is, the version that
     * is in effect for the certificates that the policy is attached to.
     * </p>
     * 
     * @param createPolicyVersionRequest
     *        The input for the CreatePolicyVersion operation.
     * @return Result of the CreatePolicyVersion operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws MalformedPolicyException
     *         The policy documentation is not valid.
     * @throws VersionsLimitExceededException
     *         The number of policy versions exceeds the limit.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.CreatePolicyVersion
     */
    @Override
    public CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest createPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyVersionRequest> request = null;
        Response<CreatePolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyVersionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePolicyVersionResult> responseHandler = new JsonResponseHandler<CreatePolicyVersionResult>(
                    new CreatePolicyVersionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a thing in the thing registry.
     * </p>
     * 
     * @param createThingRequest
     *        The input for the CreateThing operation.
     * @return Result of the CreateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @sample AWSIot.CreateThing
     */
    @Override
    public CreateThingResult createThing(CreateThingRequest createThingRequest) {
        ExecutionContext executionContext = createExecutionContext(createThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateThingRequest> request = null;
        Response<CreateThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateThingRequestMarshaller().marshall(super
                        .beforeMarshalling(createThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateThingResult> responseHandler = new JsonResponseHandler<CreateThingResult>(
                    new CreateThingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a rule.
     * </p>
     * 
     * @param createTopicRuleRequest
     *        The input for the CreateTopicRule operation.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceAlreadyExistsException
     *         The resource already exists.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.CreateTopicRule
     */
    @Override
    public void createTopicRule(CreateTopicRuleRequest createTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(createTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTopicRuleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTopicRuleRequestMarshaller().marshall(super
                        .beforeMarshalling(createTopicRuleRequest));
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
     * Deletes the specified certificate.
     * </p>
     * <p>
     * A certificate cannot be deleted if it has a policy attached to it or if
     * its status is set to ACTIVE. To delete a certificate, first detach all
     * policies using the <a>DetachPrincipalPolicy</a> API. Next use the
     * <a>UpdateCertificate</a> API to set the certificate to the INACTIVE
     * status.
     * </p>
     * 
     * @param deleteCertificateRequest
     *        The input for the DeleteCertificate operation.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or
     *         more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @sample AWSIot.DeleteCertificate
     */
    @Override
    public void deleteCertificate(
            DeleteCertificateRequest deleteCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteCertificateRequest));
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
     * Deletes the specified policy.
     * </p>
     * <p>
     * A policy cannot be deleted if it has non-default versions and/or it is
     * attached to any certificate.
     * </p>
     * <p>
     * To delete a policy, delete all non-default versions of the policy using
     * the DeletePolicyVersion API, detach the policy from any certificate using
     * the DetachPrincipalPolicy API, and then use the DeletePolicy API to
     * delete the policy.
     * </p>
     * <p>
     * When a policy is deleted using DeletePolicy, its default version is
     * deleted with it.
     * </p>
     * 
     * @param deletePolicyRequest
     *        The input for the DeletePolicy operation.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or
     *         more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicy
     */
    @Override
    public void deletePolicy(DeletePolicyRequest deletePolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(deletePolicyRequest));
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
     * Deletes the specified version of the specified policy. You cannot delete
     * the default version of a policy using this API. To delete the default
     * version of a policy, use <a>DeletePolicy</a>. To find out which version
     * of a policy is marked as the default version, use ListPolicyVersions.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     *        The input for the DeletePolicyVersion operation.
     * @throws DeleteConflictException
     *         You can't delete the resource because it is attached to one or
     *         more resources.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeletePolicyVersion
     */
    @Override
    public void deletePolicyVersion(
            DeletePolicyVersionRequest deletePolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyVersionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyVersionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deletePolicyVersionRequest));
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
     * Deletes the specified thing from the Thing Registry.
     * </p>
     * 
     * @param deleteThingRequest
     *        The input for the DeleteThing operation.
     * @return Result of the DeleteThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DeleteThing
     */
    @Override
    public DeleteThingResult deleteThing(DeleteThingRequest deleteThingRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteThingRequest> request = null;
        Response<DeleteThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteThingRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteThingResult> responseHandler = new JsonResponseHandler<DeleteThingResult>(
                    new DeleteThingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * 
     * @param deleteTopicRuleRequest
     *        The input for the DeleteTopicRule operation.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.DeleteTopicRule
     */
    @Override
    public void deleteTopicRule(DeleteTopicRuleRequest deleteTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTopicRuleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTopicRuleRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTopicRuleRequest));
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
     * Gets information about the specified certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     *        The input for the DescribeCertificate operation.
     * @return Result of the DescribeCertificate operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.DescribeCertificate
     */
    @Override
    public DescribeCertificateResult describeCertificate(
            DescribeCertificateRequest describeCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeCertificateResult> responseHandler = new JsonResponseHandler<DescribeCertificateResult>(
                    new DescribeCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a unique endpoint specific to the AWS account making the call.
     * You specify the following URI when updating state information for your
     * thing: https://<i>endpoint</i>/things/<i>thingName</i>/shadow.
     * </p>
     * 
     * @param describeEndpointRequest
     *        The input for the DescribeEndpoint operation.
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @sample AWSIot.DescribeEndpoint
     */
    @Override
    public DescribeEndpointResult describeEndpoint(
            DescribeEndpointRequest describeEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointRequest> request = null;
        Response<DescribeEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEndpointResult> responseHandler = new JsonResponseHandler<DescribeEndpointResult>(
                    new DescribeEndpointResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified thing.
     * </p>
     * 
     * @param describeThingRequest
     *        The input for the DescribeThing operation.
     * @return Result of the DescribeThing operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DescribeThing
     */
    @Override
    public DescribeThingResult describeThing(
            DescribeThingRequest describeThingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeThingRequest> request = null;
        Response<DescribeThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeThingRequestMarshaller().marshall(super
                        .beforeMarshalling(describeThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeThingResult> responseHandler = new JsonResponseHandler<DescribeThingResult>(
                    new DescribeThingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified policy from the specified certificate.
     * </p>
     * 
     * @param detachPrincipalPolicyRequest
     *        The input for the DetachPrincipalPolicy operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachPrincipalPolicy
     */
    @Override
    public void detachPrincipalPolicy(
            DetachPrincipalPolicyRequest detachPrincipalPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(detachPrincipalPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachPrincipalPolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachPrincipalPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(detachPrincipalPolicyRequest));
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
     * Detaches the specified principal from the specified thing.
     * </p>
     * 
     * @param detachThingPrincipalRequest
     *        The input for the DetachThingPrincipal operation.
     * @return Result of the DetachThingPrincipal operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.DetachThingPrincipal
     */
    @Override
    public DetachThingPrincipalResult detachThingPrincipal(
            DetachThingPrincipalRequest detachThingPrincipalRequest) {
        ExecutionContext executionContext = createExecutionContext(detachThingPrincipalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachThingPrincipalRequest> request = null;
        Response<DetachThingPrincipalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachThingPrincipalRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(detachThingPrincipalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DetachThingPrincipalResult> responseHandler = new JsonResponseHandler<DetachThingPrincipalResult>(
                    new DetachThingPrincipalResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the logging options.
     * </p>
     * 
     * @param getLoggingOptionsRequest
     *        The input for the GetLoggingOptions operation.
     * @return Result of the GetLoggingOptions operation returned by the
     *         service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.GetLoggingOptions
     */
    @Override
    public GetLoggingOptionsResult getLoggingOptions(
            GetLoggingOptionsRequest getLoggingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(getLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLoggingOptionsRequest> request = null;
        Response<GetLoggingOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLoggingOptionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getLoggingOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetLoggingOptionsResult> responseHandler = new JsonResponseHandler<GetLoggingOptionsResult>(
                    new GetLoggingOptionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy with the policy document of
     * the default version.
     * </p>
     * 
     * @param getPolicyRequest
     *        The input for the GetPolicy operation.
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicy
     */
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetPolicyResult> responseHandler = new JsonResponseHandler<GetPolicyResult>(
                    new GetPolicyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified policy version.
     * </p>
     * 
     * @param getPolicyVersionRequest
     *        The input for the GetPolicyVersion operation.
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.GetPolicyVersion
     */
    @Override
    public GetPolicyVersionResult getPolicyVersion(
            GetPolicyVersionRequest getPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(getPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyVersionRequest> request = null;
        Response<GetPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyVersionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetPolicyVersionResult> responseHandler = new JsonResponseHandler<GetPolicyVersionResult>(
                    new GetPolicyVersionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified rule.
     * </p>
     * 
     * @param getTopicRuleRequest
     *        The input for the GetTopicRule operation.
     * @return Result of the GetTopicRule operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.GetTopicRule
     */
    @Override
    public GetTopicRuleResult getTopicRule(
            GetTopicRuleRequest getTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(getTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTopicRuleRequest> request = null;
        Response<GetTopicRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTopicRuleRequestMarshaller().marshall(super
                        .beforeMarshalling(getTopicRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetTopicRuleResult> responseHandler = new JsonResponseHandler<GetTopicRuleResult>(
                    new GetTopicRuleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your certificates.
     * </p>
     * <p>
     * The results are paginated with a default page size of 25. You can
     * retrieve additional results using the returned marker.
     * </p>
     * 
     * @param listCertificatesRequest
     *        The input for the ListCertificates operation.
     * @return Result of the ListCertificates operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListCertificates
     */
    @Override
    public ListCertificatesResult listCertificates(
            ListCertificatesRequest listCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListCertificatesResult> responseHandler = new JsonResponseHandler<ListCertificatesResult>(
                    new ListCertificatesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your policies.
     * </p>
     * 
     * @param listPoliciesRequest
     *        The input for the ListPolicies operation.
     * @return Result of the ListPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicies
     */
    @Override
    public ListPoliciesResult listPolicies(
            ListPoliciesRequest listPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestMarshaller().marshall(super
                        .beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPoliciesResult> responseHandler = new JsonResponseHandler<ListPoliciesResult>(
                    new ListPoliciesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the versions of the specified policy, and identifies the default
     * version.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     *        The input for the ListPolicyVersions operation.
     * @return Result of the ListPolicyVersions operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPolicyVersions
     */
    @Override
    public ListPolicyVersionsResult listPolicyVersions(
            ListPolicyVersionsRequest listPolicyVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyVersionsRequest> request = null;
        Response<ListPolicyVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyVersionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPolicyVersionsResult> responseHandler = new JsonResponseHandler<ListPolicyVersionsResult>(
                    new ListPolicyVersionsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the policies attached to the specified principal. If you use an
     * Amazon Cognito identity, the ID needs to be in <a href=
     * "http://docs.aws.amazon.com/cognitoidentity/latest/APIReference/API_GetCredentialsForIdentity.html#API_GetCredentialsForIdentity_RequestSyntax"
     * >Amazon Cognito Identity format</a>.
     * </p>
     * 
     * @param listPrincipalPoliciesRequest
     *        The input for the ListPrincipalPolicies operation.
     * @return Result of the ListPrincipalPolicies operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPrincipalPolicies
     */
    @Override
    public ListPrincipalPoliciesResult listPrincipalPolicies(
            ListPrincipalPoliciesRequest listPrincipalPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPrincipalPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalPoliciesRequest> request = null;
        Response<ListPrincipalPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalPoliciesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listPrincipalPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPrincipalPoliciesResult> responseHandler = new JsonResponseHandler<ListPrincipalPoliciesResult>(
                    new ListPrincipalPoliciesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the things associated with the specified principal.
     * </p>
     * 
     * @param listPrincipalThingsRequest
     *        The input for the ListPrincipalThings operation.
     * @return Result of the ListPrincipalThings operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListPrincipalThings
     */
    @Override
    public ListPrincipalThingsResult listPrincipalThings(
            ListPrincipalThingsRequest listPrincipalThingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listPrincipalThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPrincipalThingsRequest> request = null;
        Response<ListPrincipalThingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPrincipalThingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listPrincipalThingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPrincipalThingsResult> responseHandler = new JsonResponseHandler<ListPrincipalThingsResult>(
                    new ListPrincipalThingsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the principals associated with the specified thing.
     * </p>
     * 
     * @param listThingPrincipalsRequest
     *        The input for the ListThingPrincipal operation.
     * @return Result of the ListThingPrincipals operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThingPrincipals
     */
    @Override
    public ListThingPrincipalsResult listThingPrincipals(
            ListThingPrincipalsRequest listThingPrincipalsRequest) {
        ExecutionContext executionContext = createExecutionContext(listThingPrincipalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingPrincipalsRequest> request = null;
        Response<ListThingPrincipalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingPrincipalsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listThingPrincipalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListThingPrincipalsResult> responseHandler = new JsonResponseHandler<ListThingPrincipalsResult>(
                    new ListThingPrincipalsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your things. You can pass an AttributeName and/or AttributeValue to
     * filter your things. For example:
     * "ListThings where AttributeName=Color and AttributeValue=Red"
     * </p>
     * 
     * @param listThingsRequest
     *        The input for the ListThings operation.
     * @return Result of the ListThings operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.ListThings
     */
    @Override
    public ListThingsResult listThings(ListThingsRequest listThingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listThingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListThingsRequest> request = null;
        Response<ListThingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListThingsRequestMarshaller().marshall(super
                        .beforeMarshalling(listThingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListThingsResult> responseHandler = new JsonResponseHandler<ListThingsResult>(
                    new ListThingsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the rules for the specific topic.
     * </p>
     * 
     * @param listTopicRulesRequest
     *        The input for the ListTopicRules operation.
     * @return Result of the ListTopicRules operation returned by the service.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.ListTopicRules
     */
    @Override
    public ListTopicRulesResult listTopicRules(
            ListTopicRulesRequest listTopicRulesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTopicRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTopicRulesRequest> request = null;
        Response<ListTopicRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTopicRulesRequestMarshaller().marshall(super
                        .beforeMarshalling(listTopicRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTopicRulesResult> responseHandler = new JsonResponseHandler<ListTopicRulesResult>(
                    new ListTopicRulesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects a pending certificate transfer. After AWS IoT rejects a
     * certificate transfer, the certificate status changes from
     * <b>PENDING_TRANFER</b> to <b>INACTIVE</b>.
     * </p>
     * <p>
     * To check for pending certificate transfers, call <a>ListCertificates</a>
     * to enumerate your certificates.
     * </p>
     * <p>
     * This operation can only be called by the transfer destination. Once
     * called, the certificate will be returned to the source's account in the
     * INACTIVE state.
     * </p>
     * 
     * @param rejectCertificateTransferRequest
     *        The input for the RejectCertificateTransfer operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws TransferAlreadyCompletedException
     *         You can't revert the certificate transfer because it has already
     *         completed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.RejectCertificateTransfer
     */
    @Override
    public void rejectCertificateTransfer(
            RejectCertificateTransferRequest rejectCertificateTransferRequest) {
        ExecutionContext executionContext = createExecutionContext(rejectCertificateTransferRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectCertificateTransferRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectCertificateTransferRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(rejectCertificateTransferRequest));
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
     * Replaces the specified rule. You must specify all parameters for the new
     * rule.
     * </p>
     * 
     * @param replaceTopicRuleRequest
     *        The input for the ReplaceTopicRule operation.
     * @throws SqlParseException
     *         The Rule-SQL expression can't be parsed correctly.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @sample AWSIot.ReplaceTopicRule
     */
    @Override
    public void replaceTopicRule(ReplaceTopicRuleRequest replaceTopicRuleRequest) {
        ExecutionContext executionContext = createExecutionContext(replaceTopicRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReplaceTopicRuleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReplaceTopicRuleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(replaceTopicRuleRequest));
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
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version. This action affects all certificates that
     * the policy is attached to. To list the principals the policy is attached
     * to, use the ListPrincipalPolicy API.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     *        The input for the SetDefaultPolicyVersion operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.SetDefaultPolicyVersion
     */
    @Override
    public void setDefaultPolicyVersion(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(setDefaultPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDefaultPolicyVersionRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDefaultPolicyVersionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setDefaultPolicyVersionRequest));
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
     * Sets the logging options.
     * </p>
     * 
     * @param setLoggingOptionsRequest
     *        The input for the SetLoggingOptions operation.
     * @throws InternalException
     *         An unexpected error has occurred.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @sample AWSIot.SetLoggingOptions
     */
    @Override
    public void setLoggingOptions(
            SetLoggingOptionsRequest setLoggingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(setLoggingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetLoggingOptionsRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetLoggingOptionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setLoggingOptionsRequest));
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
     * Transfers the specified certificate to the specified AWS account.
     * </p>
     * <p>
     * You can cancel the transfer until it is acknowledged by the recipient.
     * </p>
     * <p>
     * No notification is sent to the transfer destination's account, it is up
     * to the caller to notify the transfer target.
     * </p>
     * <p>
     * The certificate being transferred must not be in the ACTIVE state. It can
     * be deactivated using the UpdateCertificate API.
     * </p>
     * <p>
     * The certificate must not have any policies attached to it. These can be
     * detached using the DetachPrincipalPolicy API.
     * </p>
     * 
     * @param transferCertificateRequest
     *        The input for the TransferCertificate operation.
     * @return Result of the TransferCertificate operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws TransferConflictException
     *         You can't transfer the the certificate because authorization
     *         policies are still attached.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.TransferCertificate
     */
    @Override
    public TransferCertificateResult transferCertificate(
            TransferCertificateRequest transferCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(transferCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferCertificateRequest> request = null;
        Response<TransferCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(transferCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<TransferCertificateResult> responseHandler = new JsonResponseHandler<TransferCertificateResult>(
                    new TransferCertificateResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of the specified certificate. This operation is
     * idempotent.
     * </p>
     * <p>
     * Moving a cert from the ACTIVE state (including REVOKED) will NOT
     * disconnect currently-connected devices, although these devices will be
     * unable to reconnect.
     * </p>
     * <p>
     * The ACTIVE state is required to authenticate devices connecting to AWS
     * IoT using a certificate.
     * </p>
     * 
     * @param updateCertificateRequest
     *        The input for the UpdateCertificate operation.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws CertificateStateException
     *         The certificate operation is not allowed.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @sample AWSIot.UpdateCertificate
     */
    @Override
    public void updateCertificate(
            UpdateCertificateRequest updateCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(updateCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateCertificateRequest));
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
     * Updates the data for a thing.
     * </p>
     * 
     * @param updateThingRequest
     *        The input for the UpdateThing operation.
     * @return Result of the UpdateThing operation returned by the service.
     * @throws InvalidRequestException
     *         The request is not valid.
     * @throws ThrottlingException
     *         The rate exceeds the limit.
     * @throws UnauthorizedException
     *         You are not authorized to perform this operation.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws InternalFailureException
     *         An unexpected error has occurred.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @sample AWSIot.UpdateThing
     */
    @Override
    public UpdateThingResult updateThing(UpdateThingRequest updateThingRequest) {
        ExecutionContext executionContext = createExecutionContext(updateThingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateThingRequest> request = null;
        Response<UpdateThingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateThingRequestMarshaller().marshall(super
                        .beforeMarshalling(updateThingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateThingResult> responseHandler = new JsonResponseHandler<UpdateThingResult>(
                    new UpdateThingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

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
