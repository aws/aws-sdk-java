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
package com.amazonaws.services.certificatemanager;

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

import com.amazonaws.services.certificatemanager.AWSCertificateManagerClientBuilder;
import com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.services.certificatemanager.model.transform.*;

/**
 * Client for accessing ACM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Certificate Manager</fullname>
 * <p>
 * Welcome to the AWS Certificate Manager (ACM) API documentation.
 * </p>
 * <p>
 * You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
 * about using ACM, see the <a href="https://docs.aws.amazon.com/acm/latest/userguide/"> <i>AWS Certificate Manager User
 * Guide</i> </a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCertificateManagerClient extends AmazonWebServiceClient implements AWSCertificateManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCertificateManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "acm";

    private volatile AWSCertificateManagerWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.InvalidTagException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgsException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.InvalidArgsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.InvalidArnException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("RequestInProgressException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.RequestInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.InvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDomainValidationOptionsException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.InvalidDomainValidationOptionsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.certificatemanager.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.certificatemanager.model.AWSCertificateManagerException.class));

    /**
     * Constructs a new client to invoke service methods on ACM. A credentials provider chain will be used that searches
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
     * @deprecated use {@link AWSCertificateManagerClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSCertificateManagerClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM. A credentials provider chain will be used that searches
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
     *        The client configuration options controlling how this client connects to ACM (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCertificateManagerClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSCertificateManagerClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSCertificateManagerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified AWS account credentials and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to ACM (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCertificateManagerClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCertificateManagerClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSCertificateManagerClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified AWS account credentials provider and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to ACM (ex: proxy settings, retry
     *        counts, etc.).
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCertificateManagerClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSCertificateManagerClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to ACM (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSCertificateManagerClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSCertificateManagerClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSCertificateManagerClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSCertificateManagerClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSCertificateManagerClientBuilder builder() {
        return AWSCertificateManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCertificateManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCertificateManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://acm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/certificatemanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/certificatemanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You specify the
     * certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="https://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * certificates</a>.
     * </p>
     * <p>
     * To remove one or more tags, use the <a>RemoveTagsFromCertificate</a> action. To view all of the tags that have
     * been applied to the certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param addTagsToCertificateRequest
     * @return Result of the AddTagsToCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @throws TooManyTagsException
     *         The request contains too many tags. Try the request again with fewer tags.
     * @sample AWSCertificateManager.AddTagsToCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/AddTagsToCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToCertificateResult addTagsToCertificate(AddTagsToCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToCertificate(request);
    }

    @SdkInternalApi
    final AddTagsToCertificateResult executeAddTagsToCertificate(AddTagsToCertificateRequest addTagsToCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToCertificateRequest> request = null;
        Response<AddTagsToCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
     * in the list that can be displayed by calling the <a>ListCertificates</a> action or be retrieved by calling the
     * <a>GetCertificate</a> action. The certificate will not be available for use by AWS services integrated with ACM.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is
     * in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws ResourceInUseException
     *         The certificate is in use by another AWS service in the caller's account. Remove the association and try
     *         again.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCertificate(request);
    }

    @SdkInternalApi
    final DeleteCertificateResult executeDeleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed metadata about the specified ACM certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DescribeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificate(request);
    }

    @SdkInternalApi
    final DescribeCertificateResult executeDescribeCertificate(DescribeCertificateRequest describeCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the
     * certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the
     * certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a
     * passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later.
     * Provide the passphrase when prompted.
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     * </p>
     * 
     * @param exportCertificateRequest
     * @return Result of the ExportCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.ExportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExportCertificateResult exportCertificate(ExportCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeExportCertificate(request);
    }

    @SdkInternalApi
    final ExportCertificateResult executeExportCertificate(ExportCertificateRequest exportCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(exportCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportCertificateRequest> request = null;
        Response<ExportCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of
     * certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root
     * certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the
     * certificate to see the individual fields, you can use OpenSSL.
     * </p>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCertificateResult getCertificate(GetCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCertificate(request);
    }

    @SdkInternalApi
    final GetCertificateResult executeGetCertificate(GetCertificateRequest getCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateRequest> request = null;
        Response<GetCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note
     * that <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">integrated services</a> allow
     * only certificate types and keys they support to be associated with their resources. Further, their support
     * differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the
     * documentation for each service. For more information about importing certificates into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * Note the following guidelines when importing third party certificates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must enter the private key that matches the certificate you are importing.
     * </p>
     * </li>
     * <li>
     * <p>
     * The private key must be unencrypted. You cannot import a private key that is protected by a password or a
     * passphrase.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the certificate you are importing is not self-signed, you must enter its certificate chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time must be between the <code>Not Before</code> and <code>Not After</code> certificate fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Issuer</code> field must not be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The OCSP authority URL, if present, must not exceed 1000 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> argument. Include this argument only when you
     * want to replace a previously imported certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the
     * private key by their file names preceded by <code>file://</code>. For example, you can specify a certificate
     * saved in the <code>C:\temp</code> folder as <code>file://C:\temp\certificate_to_import.pem</code>. If you are
     * making an HTTP or HTTPS Query request, include these arguments as BLOBs.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the
     * private key files in the manner required by the programming language you're using.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation returns the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of the imported certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @sample AWSCertificateManager.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportCertificateResult importCertificate(ImportCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeImportCertificate(request);
    }

    @SdkInternalApi
    final ImportCertificateResult executeImportCertificate(ImportCertificateRequest importCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(importCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateRequest> request = null;
        Response<ImportCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
     * specific status be listed. You can also filter by specific attributes of the certificate.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @throws InvalidArgsException
     *         One or more of of request parameters specified is not valid.
     * @sample AWSCertificateManager.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCertificatesResult listCertificates(ListCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCertificates(request);
    }

    @SdkInternalApi
    final ListCertificatesResult executeListCertificates(ListCertificatesRequest listCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCertificatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCertificatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
     * specify the certificate. To add a tag to an ACM certificate, use the <a>AddTagsToCertificate</a> action. To
     * delete a tag, use the <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @return Result of the ListTagsForCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.ListTagsForCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListTagsForCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForCertificateResult listTagsForCertificate(ListTagsForCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForCertificate(request);
    }

    @SdkInternalApi
    final ListTagsForCertificateResult executeListTagsForCertificate(ListTagsForCertificateRequest listTagsForCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForCertificateRequest> request = null;
        Response<ListTagsForCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListTagsForCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @return Result of the RemoveTagsFromCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @sample AWSCertificateManager.RemoveTagsFromCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RemoveTagsFromCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveTagsFromCertificateResult removeTagsFromCertificate(RemoveTagsFromCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromCertificate(request);
    }

    @SdkInternalApi
    final RemoveTagsFromCertificateResult executeRemoveTagsFromCertificate(RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromCertificateRequest> request = null;
        Response<RemoveTagsFromCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromCertificateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeTagsFromCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this
     * operation. In order to renew your ACM PCA certificates with ACM, you must first <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaPermissions.html">grant the ACM service principal
     * permission to do so</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/manual-renewal.html">Testing Managed Renewal</a> in the
     * ACM User Guide.
     * </p>
     * 
     * @param renewCertificateRequest
     * @return Result of the RenewCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.RenewCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RenewCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RenewCertificateResult renewCertificate(RenewCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRenewCertificate(request);
    }

    @SdkInternalApi
    final RenewCertificateResult executeRenewCertificate(RenewCertificateRequest renewCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(renewCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RenewCertificateRequest> request = null;
        Response<RenewCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RenewCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(renewCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RenewCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RenewCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RenewCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a
     * fully qualified domain name (FQDN) in the <code>DomainName</code> parameter. You can also specify additional
     * FQDNs in the <code>SubjectAlternativeNames</code> parameter.
     * </p>
     * <p>
     * If you are requesting a private certificate, domain validation is not required. If you are requesting a public
     * certificate, each domain name that you specify must be validated to verify that you own or control the domain.
     * You can use <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">DNS
     * validation</a> or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">email
     * validation</a>. We recommend that you use DNS validation. ACM issues public certificates after receiving approval
     * from the domain owner.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return Result of the RequestCertificate operation returned by the service.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.RequestCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RequestCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RequestCertificateResult requestCertificate(RequestCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeRequestCertificate(request);
    }

    @SdkInternalApi
    final RequestCertificateResult executeRequestCertificate(RequestCertificateRequest requestCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(requestCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestCertificateRequest> request = null;
        Response<RequestCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestCertificateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(requestCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RequestCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RequestCertificateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RequestCertificateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain owner or an authorized representative
     * must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate. For more information about setting up your contact email addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/setup-email.html">Configure Email for your Domain</a>.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @return Result of the ResendValidationEmail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidStateException
     *         Processing has reached an invalid state.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @sample AWSCertificateManager.ResendValidationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResendValidationEmail" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResendValidationEmailResult resendValidationEmail(ResendValidationEmailRequest request) {
        request = beforeClientExecution(request);
        return executeResendValidationEmail(request);
    }

    @SdkInternalApi
    final ResendValidationEmailResult executeResendValidationEmail(ResendValidationEmailRequest resendValidationEmailRequest) {

        ExecutionContext executionContext = createExecutionContext(resendValidationEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendValidationEmailRequest> request = null;
        Response<ResendValidationEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendValidationEmailRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resendValidationEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResendValidationEmail");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResendValidationEmailResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ResendValidationEmailResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
     * your certificate in a certificate transparency log. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">
     * Opting Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param updateCertificateOptionsRequest
     * @return Result of the UpdateCertificateOptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @throws InvalidStateException
     *         Processing has reached an invalid state.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.UpdateCertificateOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/UpdateCertificateOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCertificateOptionsResult updateCertificateOptions(UpdateCertificateOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCertificateOptions(request);
    }

    @SdkInternalApi
    final UpdateCertificateOptionsResult executeUpdateCertificateOptions(UpdateCertificateOptionsRequest updateCertificateOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCertificateOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCertificateOptionsRequest> request = null;
        Response<UpdateCertificateOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCertificateOptionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCertificateOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "ACM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCertificateOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCertificateOptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCertificateOptionsResultJsonUnmarshaller());
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
    public AWSCertificateManagerWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSCertificateManagerWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
