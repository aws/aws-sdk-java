/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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
 * about using ACM, see the <a href="http://docs.aws.amazon.com/acm/latest/userguide/"> <i>AWS Certificate Manager User
 * Guide</i> </a>.
 * </p>
 */
@ThreadSafe
public class AWSCertificateManagerClient extends AmazonWebServiceClient implements AWSCertificateManager {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCertificateManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "acm";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
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
                    new JsonErrorShapeMetadata().withErrorCode("RequestInProgressException").withModeledClass(
                            com.amazonaws.services.certificatemanager.model.RequestInProgressException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withModeledClass(
                            com.amazonaws.services.certificatemanager.model.InvalidStateException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidDomainValidationOptionsException").withModeledClass(
                            com.amazonaws.services.certificatemanager.model.InvalidDomainValidationOptionsException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidArnException").withModeledClass(
                            com.amazonaws.services.certificatemanager.model.InvalidArnException.class))
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
     */
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
     */
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
     */
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
     */
    public AWSCertificateManagerClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AWSCertificateManagerClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
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
     * Adds one or more tags to an ACM Certificate. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You specify the
     * certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM Certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="http://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * Certificates</a>.
     * </p>
     * <p>
     * To remove one or more tags, use the <a>RemoveTagsFromCertificate</a> action. To view all of the tags that have
     * been applied to the certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param addTagsToCertificateRequest
     * @return Result of the AddTagsToCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @throws TooManyTagsException
     *         The request contains too many tags. Try the request again with fewer tags.
     * @sample AWSCertificateManager.AddTagsToCertificate
     */
    @Override
    public AddTagsToCertificateResult addTagsToCertificate(AddTagsToCertificateRequest addTagsToCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToCertificateRequest> request = null;
        Response<AddTagsToCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Deletes an ACM Certificate and its associated private key. If this action succeeds, the certificate no longer
     * appears in the list of ACM Certificates that can be displayed by calling the <a>ListCertificates</a> action or be
     * retrieved by calling the <a>GetCertificate</a> action. The certificate will not be available for use by other AWS
     * services.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM Certificate that is being used by another AWS service. To delete a certificate that is
     * in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws ResourceInUseException
     *         The certificate is in use by another AWS service in the caller's account. Remove the association and try
     *         again.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DeleteCertificate
     */
    @Override
    public DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCertificateRequest> request = null;
        Response<DeleteCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns a list of the fields contained in the specified ACM Certificate. For example, this action returns the
     * certificate status, a flag that indicates whether the certificate is associated with any other AWS service, and
     * the date at which the certificate request was created. You specify the ACM Certificate on input by its Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DescribeCertificate
     */
    @Override
    public DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificateRequest> request = null;
        Response<DescribeCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Retrieves an ACM Certificate and certificate chain for the certificate specified by an ARN. The chain is an
     * ordered list of certificates that contains the root certificate, intermediate certificates of subordinate CAs,
     * and the ACM Certificate. The certificate and certificate chain are base64 encoded. If you want to decode the
     * certificate chain to see the individual certificate fields, you can use OpenSSL.
     * </p>
     * <note>
     * <p>
     * Currently, ACM Certificates can be used only with Elastic Load Balancing and Amazon CloudFront.
     * </p>
     * </note>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.GetCertificate
     */
    @Override
    public GetCertificateResult getCertificate(GetCertificateRequest getCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(getCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateRequest> request = null;
        Response<GetCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Imports an SSL/TLS certificate into AWS Certificate Manager (ACM) to use with <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">ACM's integrated AWS services</a>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * For more information about importing certificates into ACM, including the differences between certificates that
     * you import and those that ACM provides, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a certificate, you must provide the certificate and the matching private key. When the certificate is
     * not self-signed, you must also provide a certificate chain. You can omit the certificate chain when importing a
     * self-signed certificate.
     * </p>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded. For more information about converting
     * these items to PEM format, see <a href=
     * "http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html#import-certificate-troubleshooting"
     * >Importing Certificates Troubleshooting</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> field. Include this field only when you want to
     * replace a previously imported certificate.
     * </p>
     * <p>
     * This operation returns the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of the imported certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded. For example, you may have input more domains than are allowed or you've
     *         requested too many certificates for your account. See the exception message returned by ACM to determine
     *         which limit you have violated. For more information about ACM limits, see the <a
     *         href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a> topic.
     * @sample AWSCertificateManager.ImportCertificate
     */
    @Override
    public ImportCertificateResult importCertificate(ImportCertificateRequest importCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(importCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportCertificateRequest> request = null;
        Response<ImportCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(importCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Retrieves a list of ACM Certificates and the domain name for each. You can optionally filter the list to return
     * only the certificates that match the specified status.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManager.ListCertificates
     */
    @Override
    public ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCertificatesRequest> request = null;
        Response<ListCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCertificatesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Lists the tags that have been applied to the ACM Certificate. Use the certificate ARN to specify the certificate.
     * To add a tag to an ACM Certificate, use the <a>AddTagsToCertificate</a> action. To delete a tag, use the
     * <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @return Result of the ListTagsForCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.ListTagsForCertificate
     */
    @Override
    public ListTagsForCertificateResult listTagsForCertificate(ListTagsForCertificateRequest listTagsForCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForCertificateRequest> request = null;
        Response<ListTagsForCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Remove one or more tags from an ACM Certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM Certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @return Result of the RemoveTagsFromCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @sample AWSCertificateManager.RemoveTagsFromCertificate
     */
    @Override
    public RemoveTagsFromCertificateResult removeTagsFromCertificate(RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromCertificateRequest> request = null;
        Response<RemoveTagsFromCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Requests an ACM Certificate for use with other AWS services. To request an ACM Certificate, you must specify the
     * fully qualified domain name (FQDN) for your site. You can also specify additional FQDNs if users can reach your
     * site by using other names. For each domain name you specify, email is sent to the domain owner to request
     * approval to issue the certificate. After receiving approval from the domain owner, the ACM Certificate is issued.
     * For more information, see the <a href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager
     * User Guide</a>.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return Result of the RequestCertificate operation returned by the service.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded. For example, you may have input more domains than are allowed or you've
     *         requested too many certificates for your account. See the exception message returned by ACM to determine
     *         which limit you have violated. For more information about ACM limits, see the <a
     *         href="http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a> topic.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @sample AWSCertificateManager.RequestCertificate
     */
    @Override
    public RequestCertificateResult requestCertificate(RequestCertificateRequest requestCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(requestCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestCertificateRequest> request = null;
        Response<RequestCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestCertificateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(requestCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * must approve the ACM Certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM Certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @return Result of the ResendValidationEmail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account, or the caller's account cannot be
     *         found.
     * @throws InvalidStateException
     *         Processing has reached an invalid state. For example, this exception can occur if the specified domain is
     *         not using email validation, or the current certificate status does not permit the requested operation.
     *         See the exception message returned by ACM to determine which state is not valid.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @sample AWSCertificateManager.ResendValidationEmail
     */
    @Override
    public ResendValidationEmailResult resendValidationEmail(ResendValidationEmailRequest resendValidationEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(resendValidationEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendValidationEmailRequest> request = null;
        Response<ResendValidationEmailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendValidationEmailRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(resendValidationEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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

}
