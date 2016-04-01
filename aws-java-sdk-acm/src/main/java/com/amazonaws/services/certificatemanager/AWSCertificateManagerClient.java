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
package com.amazonaws.services.certificatemanager;

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
import com.amazonaws.util.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.services.certificatemanager.model.transform.*;

/**
 * Client for accessing ACM. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Certificate Manager</fullname>
 * <p>
 * Welcome to the AWS Certificate Manager (ACM) Command Reference. This guide
 * provides descriptions, syntax, and usage examples for each ACM command. You
 * can use AWS Certificate Manager to request ACM Certificates for your
 * AWS-based websites and applications. For general information about using ACM
 * and for more information about using the console, see the <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
 * Certificate Manager User Guide</a>. For more information about using the ACM
 * API, see the <a
 * href="http://docs.aws.amazon.com/acm/latest/APIReference/Welcome.html"> AWS
 * Certificate Manager API Reference</a>.
 * </p>
 */
@ThreadSafe
public class AWSCertificateManagerClient extends AmazonWebServiceClient
        implements AWSCertificateManager {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AWSCertificateManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "acm";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "acm";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all ACM exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on ACM. A credentials
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
    public AWSCertificateManagerClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM. A credentials
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
     *        connects to ACM (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCertificateManagerClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the
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
    public AWSCertificateManagerClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the
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
     *        connects to ACM (ex: proxy settings, retry counts, etc.).
     */
    public AWSCertificateManagerClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the
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
    public AWSCertificateManagerClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the
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
     *        connects to ACM (ex: proxy settings, retry counts, etc.).
     */
    public AWSCertificateManagerClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on ACM using the
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
     *        connects to ACM (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCertificateManagerClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.ResourceInUseException.class,
                        "ResourceInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.RequestInProgressException.class,
                        "RequestInProgressException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.InvalidStateException.class,
                        "InvalidStateException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.InvalidDomainValidationOptionsException.class,
                        "InvalidDomainValidationOptionsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.InvalidArnException.class,
                        "InvalidArnException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.certificatemanager.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://acm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/certificatemanager/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/certificatemanager/request.handler2s"));
    }

    /**
     * <p>
     * Deletes an ACM Certificate and its associated private key. If this action
     * succeeds, the certificate no longer appears in the list of ACM
     * Certificates that can be displayed by calling the <a>ListCertificates</a>
     * action or be retrieved by calling the <a>GetCertificate</a> action. The
     * certificate will not be available for use by other AWS services.
     * </p>
     * <note>You cannot delete an ACM Certificate that is being used by another
     * AWS service. To delete a certificate that is in use, the certificate
     * association must first be removed. </note>
     * 
     * @param deleteCertificateRequest
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws ResourceInUseException
     *         The certificate is in use by another AWS service in the caller's
     *         account. Remove the association and try again.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.DeleteCertificate
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

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the fields contained in the specified ACM Certificate.
     * For example, this action returns the certificate status, a flag that
     * indicates whether the certificate is associated with any other AWS
     * service, and the date at which the certificate request was created. The
     * ACM Certificate is specified on input by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.DescribeCertificate
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

            JsonResponseHandler<DescribeCertificateResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeCertificateResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an ACM Certificate and certificate chain for the certificate
     * specified by an ARN. The chain is an ordered list of certificates that
     * contains the root certificate, intermediate certificates of subordinate
     * CAs, and the ACM Certificate. The certificate and certificate chain are
     * base64 encoded. If you want to decode the certificate chain to see the
     * individual certificate fields, you can use OpenSSL.
     * </p>
     * <note> Currently, ACM Certificates can be used only with Elastic Load
     * Balancing and Amazon CloudFront. </note>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your
     *         account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.GetCertificate
     */
    @Override
    public GetCertificateResult getCertificate(
            GetCertificateRequest getCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(getCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCertificateRequest> request = null;
        Response<GetCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCertificateRequestMarshaller().marshall(super
                        .beforeMarshalling(getCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetCertificateResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetCertificateResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of the ACM Certificate ARNs, and the domain name for
     * each ARN, owned by the calling account. You can filter the list based on
     * the <code>CertificateStatuses</code> parameter, and you can display up to
     * <code>MaxItems</code> certificates at one time. If you have more than
     * <code>MaxItems</code> certificates, use the <code>NextToken</code> marker
     * from the response object in your next call to the
     * <code>ListCertificates</code> action to retrieve the next set of
     * certificate ARNs.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManager.ListCertificates
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

            JsonResponseHandler<ListCertificatesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListCertificatesResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Requests an ACM Certificate for use with other AWS services. To request
     * an ACM Certificate, you must specify the fully qualified domain name
     * (FQDN) for your site. You can also specify additional FQDNs if users can
     * reach your site by using other names. For each domain name you specify,
     * email is sent to the domain owner to request approval to issue the
     * certificate. After receiving approval from the domain owner, the ACM
     * Certificate is issued. For more information, see the <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/overview.html"> AWS
     * Certificate Manager User Guide </a>.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return Result of the RequestCertificate operation returned by the
     *         service.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded. For example, you may have input
     *         more domains than are allowed or you've requested too many
     *         certificates for your account. See the exception message returned
     *         by ACM to determine which limit you have violated. For more
     *         information about ACM limits, see the <a href=
     *         "http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     *         >Limits</a> topic.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure
     *         is incorrect.
     * @sample AWSCertificateManager.RequestCertificate
     */
    @Override
    public RequestCertificateResult requestCertificate(
            RequestCertificateRequest requestCertificateRequest) {
        ExecutionContext executionContext = createExecutionContext(requestCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestCertificateRequest> request = null;
        Response<RequestCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestCertificateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(requestCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RequestCertificateResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RequestCertificateResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain
     * owner or an authorized representative must approve the ACM Certificate
     * before it can be issued. The certificate can be approved by clicking a
     * link in the mail to navigate to the Amazon certificate approval website
     * and then clicking <b>I Approve</b>. However, the validation email can be
     * blocked by spam filters. Therefore, if you do not receive the original
     * mail, you can request that the mail be resent within 72 hours of
     * requesting the ACM Certificate. If more than 72 hours have elapsed since
     * your original request or since your last attempt to resend validation
     * mail, you must request a new certificate.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws InvalidStateException
     *         Processing has reached an invalid state. For example, this
     *         exception can occur if the specified domain is not using email
     *         validation, or the current certificate status does not permit the
     *         requested operation. See the exception message returned by ACM to
     *         determine which state is not valid.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure
     *         is incorrect.
     * @sample AWSCertificateManager.ResendValidationEmail
     */
    @Override
    public void resendValidationEmail(
            ResendValidationEmailRequest resendValidationEmailRequest) {
        ExecutionContext executionContext = createExecutionContext(resendValidationEmailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResendValidationEmailRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResendValidationEmailRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(resendValidationEmailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
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

        JsonErrorResponseHandlerV2 errorResponseHandler = SdkJsonProtocolFactory
                .createErrorResponseHandler(jsonErrorUnmarshallers, false);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
