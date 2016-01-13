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
package com.amazonaws.services.route53domains;

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

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.services.route53domains.model.transform.*;

/**
 * Client for accessing Amazon Route 53 Domains. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 */
public class AmazonRoute53DomainsClient extends AmazonWebServiceClient
        implements AmazonRoute53Domains {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonRoute53Domains.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53domains";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "route53domains";

    /**
     * List of exception unmarshallers for all Amazon Route 53 Domains
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AmazonRoute53DomainsClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *        connects to Amazon Route 53 Domains (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRoute53DomainsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains using the specified AWS account credentials and client
     * configuration options.
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
     *        connects to Amazon Route 53 Domains (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonRoute53DomainsClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonRoute53DomainsClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains using the specified AWS account credentials provider and client
     * configuration options.
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
     *        connects to Amazon Route 53 Domains (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonRoute53DomainsClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Route 53
     * Domains using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
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
     *        connects to Amazon Route 53 Domains (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonRoute53DomainsClient(
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
                        com.amazonaws.services.route53domains.model.OperationLimitExceededException.class,
                        "OperationLimitExceeded"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.route53domains.model.InvalidInputException.class,
                        "InvalidInput"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.route53domains.model.DomainLimitExceededException.class,
                        "DomainLimitExceeded"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.route53domains.model.TLDRulesViolationException.class,
                        "TLDRulesViolation"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.route53domains.model.UnsupportedTLDException.class,
                        "UnsupportedTLD"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.route53domains.model.DuplicateRequestException.class,
                        "DuplicateRequest"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://route53domains.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/route53domains/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/route53domains/request.handler2s"));
    }

    /**
     * <p>
     * This operation checks the availability of one domain name. You can access
     * this API without authenticating. Note that if the availability status of
     * a domain is pending, you must submit another request to determine the
     * availability of the domain name.
     * </p>
     * 
     * @param checkDomainAvailabilityRequest
     *        The CheckDomainAvailability request contains the following
     *        elements.
     * @return Result of the CheckDomainAvailability operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.CheckDomainAvailability
     */
    @Override
    public CheckDomainAvailabilityResult checkDomainAvailability(
            CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) {
        ExecutionContext executionContext = createExecutionContext(checkDomainAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDomainAvailabilityRequest> request = null;
        Response<CheckDomainAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDomainAvailabilityRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(checkDomainAvailabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CheckDomainAvailabilityResult> responseHandler = new JsonResponseHandler<CheckDomainAvailabilityResult>(
                    new CheckDomainAvailabilityResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation deletes the specified tags for a domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param deleteTagsForDomainRequest
     *        The DeleteTagsForDomainRequest includes the following elements.
     * @return Result of the DeleteTagsForDomain operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.DeleteTagsForDomain
     */
    @Override
    public DeleteTagsForDomainResult deleteTagsForDomain(
            DeleteTagsForDomainRequest deleteTagsForDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsForDomainRequest> request = null;
        Response<DeleteTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsForDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTagsForDomainResult> responseHandler = new JsonResponseHandler<DeleteTagsForDomainResult>(
                    new DeleteTagsForDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation disables automatic renewal of domain registration for the
     * specified domain.
     * </p>
     * <note>Caution! Amazon Route 53 doesn't have a manual renewal process, so
     * if you disable automatic renewal, registration for the domain will not be
     * renewed when the expiration date passes, and you will lose control of the
     * domain name.</note>
     * 
     * @param disableDomainAutoRenewRequest
     * @return Result of the DisableDomainAutoRenew operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.DisableDomainAutoRenew
     */
    @Override
    public DisableDomainAutoRenewResult disableDomainAutoRenew(
            DisableDomainAutoRenewRequest disableDomainAutoRenewRequest) {
        ExecutionContext executionContext = createExecutionContext(disableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainAutoRenewRequest> request = null;
        Response<DisableDomainAutoRenewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainAutoRenewRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disableDomainAutoRenewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableDomainAutoRenewResult> responseHandler = new JsonResponseHandler<DisableDomainAutoRenewResult>(
                    new DisableDomainAutoRenewResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to allow domain transfers.
     * We recommend you refrain from performing this action unless you intend to
     * transfer the domain to a different registrar. Successful submission
     * returns an operation ID that you can use to track the progress and
     * completion of the action. If the request is not completed successfully,
     * the domain registrant will be notified by email.
     * </p>
     * 
     * @param disableDomainTransferLockRequest
     *        The DisableDomainTransferLock request includes the following
     *        element.
     * @return Result of the DisableDomainTransferLock operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.DisableDomainTransferLock
     */
    @Override
    public DisableDomainTransferLockResult disableDomainTransferLock(
            DisableDomainTransferLockRequest disableDomainTransferLockRequest) {
        ExecutionContext executionContext = createExecutionContext(disableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableDomainTransferLockRequest> request = null;
        Response<DisableDomainTransferLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableDomainTransferLockRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disableDomainTransferLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableDomainTransferLockResult> responseHandler = new JsonResponseHandler<DisableDomainTransferLockResult>(
                    new DisableDomainTransferLockResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation configures Amazon Route 53 to automatically renew the
     * specified domain before the domain registration expires. The cost of
     * renewing your domain registration is billed to your AWS account.
     * </p>
     * <p>
     * The period during which you can renew a domain name varies by TLD. For a
     * list of TLDs and their renewal policies, see <a href=
     * "http://wiki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times"
     * >"Renewal, restoration, and deletion times"</a> on the website for our
     * registrar partner, Gandi. Route 53 requires that you renew before the end
     * of the renewal period that is listed on the Gandi website so we can
     * complete processing before the deadline.
     * </p>
     * 
     * @param enableDomainAutoRenewRequest
     * @return Result of the EnableDomainAutoRenew operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.EnableDomainAutoRenew
     */
    @Override
    public EnableDomainAutoRenewResult enableDomainAutoRenew(
            EnableDomainAutoRenewRequest enableDomainAutoRenewRequest) {
        ExecutionContext executionContext = createExecutionContext(enableDomainAutoRenewRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainAutoRenewRequest> request = null;
        Response<EnableDomainAutoRenewResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainAutoRenewRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(enableDomainAutoRenewRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableDomainAutoRenewResult> responseHandler = new JsonResponseHandler<EnableDomainAutoRenewResult>(
                    new EnableDomainAutoRenewResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can use
     * to track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param enableDomainTransferLockRequest
     *        The EnableDomainTransferLock request includes the following
     *        element.
     * @return Result of the EnableDomainTransferLock operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.EnableDomainTransferLock
     */
    @Override
    public EnableDomainTransferLockResult enableDomainTransferLock(
            EnableDomainTransferLockRequest enableDomainTransferLockRequest) {
        ExecutionContext executionContext = createExecutionContext(enableDomainTransferLockRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableDomainTransferLockRequest> request = null;
        Response<EnableDomainTransferLockResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableDomainTransferLockRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(enableDomainTransferLockRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableDomainTransferLockResult> responseHandler = new JsonResponseHandler<EnableDomainTransferLockResult>(
                    new EnableDomainTransferLockResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     * 
     * @param getDomainDetailRequest
     *        The GetDomainDetail request includes the following element.
     * @return Result of the GetDomainDetail operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.GetDomainDetail
     */
    @Override
    public GetDomainDetailResult getDomainDetail(
            GetDomainDetailRequest getDomainDetailRequest) {
        ExecutionContext executionContext = createExecutionContext(getDomainDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainDetailRequest> request = null;
        Response<GetDomainDetailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainDetailRequestMarshaller().marshall(super
                        .beforeMarshalling(getDomainDetailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDomainDetailResult> responseHandler = new JsonResponseHandler<GetDomainDetailResult>(
                    new GetDomainDetailResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     * 
     * @param getOperationDetailRequest
     *        The GetOperationDetail request includes the following element.
     * @return Result of the GetOperationDetail operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @sample AmazonRoute53Domains.GetOperationDetail
     */
    @Override
    public GetOperationDetailResult getOperationDetail(
            GetOperationDetailRequest getOperationDetailRequest) {
        ExecutionContext executionContext = createExecutionContext(getOperationDetailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationDetailRequest> request = null;
        Response<GetOperationDetailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationDetailRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getOperationDetailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetOperationDetailResult> responseHandler = new JsonResponseHandler<GetOperationDetailResult>(
                    new GetOperationDetailResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon Route
     * 53 for the current AWS account.
     * </p>
     * 
     * @param listDomainsRequest
     *        The ListDomains request includes the following elements.
     * @return Result of the ListDomains operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @sample AmazonRoute53Domains.ListDomains
     */
    @Override
    public ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainsRequest> request = null;
        Response<ListDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainsRequestMarshaller().marshall(super
                        .beforeMarshalling(listDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListDomainsResult> responseHandler = new JsonResponseHandler<ListDomainsResult>(
                    new ListDomainsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDomainsResult listDomains() {
        return listDomains(new ListDomainsRequest());
    }

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not yet
     * complete.
     * </p>
     * 
     * @param listOperationsRequest
     *        The ListOperations request includes the following elements.
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @sample AmazonRoute53Domains.ListOperations
     */
    @Override
    public ListOperationsResult listOperations(
            ListOperationsRequest listOperationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOperationsRequest> request = null;
        Response<ListOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOperationsRequestMarshaller().marshall(super
                        .beforeMarshalling(listOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListOperationsResult> responseHandler = new JsonResponseHandler<ListOperationsResult>(
                    new ListOperationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListOperationsResult listOperations() {
        return listOperations(new ListOperationsRequest());
    }

    /**
     * <p>
     * This operation returns all of the tags that are associated with the
     * specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param listTagsForDomainRequest
     *        The ListTagsForDomainRequest includes the following elements.
     * @return Result of the ListTagsForDomain operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.ListTagsForDomain
     */
    @Override
    public ListTagsForDomainResult listTagsForDomain(
            ListTagsForDomainRequest listTagsForDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForDomainRequest> request = null;
        Response<ListTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsForDomainResult> responseHandler = new JsonResponseHandler<ListTagsForDomainResult>(
                    new ListTagsForDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as the
     * domain. Amazon Route 53 assigns four name servers to your hosted zone and
     * automatically updates your domain registration with the names of these
     * name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal date
     * so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you can
     * use to track the progress and completion of the action. If the request is
     * not completed successfully, the domain registrant is notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain. For
     * more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53
     * Pricing</a>.</li>
     * </ul>
     * 
     * @param registerDomainRequest
     *        The RegisterDomain request includes the following elements.
     * @return Result of the RegisterDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the
     *         account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @sample AmazonRoute53Domains.RegisterDomain
     */
    @Override
    public RegisterDomainResult registerDomain(
            RegisterDomainRequest registerDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(registerDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDomainRequest> request = null;
        Response<RegisterDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDomainRequestMarshaller().marshall(super
                        .beforeMarshalling(registerDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterDomainResult> responseHandler = new JsonResponseHandler<RegisterDomainResult>(
                    new RegisterDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a domain
     * to another registrar, you provide this value to the new registrar.
     * </p>
     * 
     * @param retrieveDomainAuthCodeRequest
     *        The RetrieveDomainAuthCode request includes the following element.
     * @return Result of the RetrieveDomainAuthCode operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.RetrieveDomainAuthCode
     */
    @Override
    public RetrieveDomainAuthCodeResult retrieveDomainAuthCode(
            RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) {
        ExecutionContext executionContext = createExecutionContext(retrieveDomainAuthCodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveDomainAuthCodeRequest> request = null;
        Response<RetrieveDomainAuthCodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveDomainAuthCodeRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(retrieveDomainAuthCodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RetrieveDomainAuthCodeResult> responseHandler = new JsonResponseHandler<RetrieveDomainAuthCodeResult>(
                    new RetrieveDomainAuthCodeResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon Route
     * 53. When the transfer is complete, the domain is registered with the AWS
     * registrar partner, Gandi.
     * </p>
     * <p>
     * For transfer requirements, a detailed procedure, and information about
     * viewing the status of a domain transfer, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/domain-transfer-to-route-53.html"
     * >Transferring Registration for a Domain to Amazon Route 53</a> in the
     * Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * If the registrar for your domain is also the DNS service provider for the
     * domain, we highly recommend that you consider transferring your DNS
     * service to Amazon Route 53 or to another DNS service provider before you
     * transfer your registration. Some registrars provide free DNS service when
     * you purchase a domain registration. When you transfer the registration,
     * the previous registrar will not renew your domain registration and could
     * end your DNS service at any time.
     * </p>
     * <note>Caution! If the registrar for your domain is also the DNS service
     * provider for the domain and you don't transfer DNS service to another
     * provider, your website, email, and the web applications associated with
     * the domain might become unavailable.</note>
     * <p>
     * If the transfer is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * transfer doesn't complete successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param transferDomainRequest
     *        The TransferDomain request includes the following elements.
     * @return Result of the TransferDomain operation returned by the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws DomainLimitExceededException
     *         The number of domains has exceeded the allowed threshold for the
     *         account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @sample AmazonRoute53Domains.TransferDomain
     */
    @Override
    public TransferDomainResult transferDomain(
            TransferDomainRequest transferDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(transferDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TransferDomainRequest> request = null;
        Response<TransferDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TransferDomainRequestMarshaller().marshall(super
                        .beforeMarshalling(transferDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<TransferDomainResult> responseHandler = new JsonResponseHandler<TransferDomainResult>(
                    new TransferDomainResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the contact information for a particular domain.
     * Information for at least one contact (registrant, administrator, or
     * technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     * 
     * @param updateDomainContactRequest
     *        The UpdateDomainContact request includes the following elements.
     * @return Result of the UpdateDomainContact operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.UpdateDomainContact
     */
    @Override
    public UpdateDomainContactResult updateDomainContact(
            UpdateDomainContactRequest updateDomainContactRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactRequest> request = null;
        Response<UpdateDomainContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDomainContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDomainContactResult> responseHandler = new JsonResponseHandler<UpdateDomainContactResult>(
                    new UpdateDomainContactResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation updates the specified domain contact's privacy setting.
     * When the privacy option is enabled, personal information such as postal
     * or email address is hidden from the results of a public WHOIS query. The
     * privacy services are provided by the AWS registrar, Gandi. For more
     * information, see the <a
     * href="http://www.gandi.net/domain/whois/?currency=USD&amp;amp;lang=en"
     * >Gandi privacy features</a>.
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainContactPrivacyRequest
     *        The UpdateDomainContactPrivacy request includes the following
     *        elements.
     * @return Result of the UpdateDomainContactPrivacy operation returned by
     *         the service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.UpdateDomainContactPrivacy
     */
    @Override
    public UpdateDomainContactPrivacyResult updateDomainContactPrivacy(
            UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainContactPrivacyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainContactPrivacyRequest> request = null;
        Response<UpdateDomainContactPrivacyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainContactPrivacyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDomainContactPrivacyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDomainContactPrivacyResult> responseHandler = new JsonResponseHandler<UpdateDomainContactPrivacyResult>(
                    new UpdateDomainContactPrivacyResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation replaces the current set of name servers for the domain
     * with the specified set of name servers. If you use Amazon Route 53 as
     * your DNS service, specify the four name servers in the delegation set for
     * the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can use to
     * track the progress and completion of the action. If the request is not
     * completed successfully, the domain registrant will be notified by email.
     * </p>
     * 
     * @param updateDomainNameserversRequest
     *        The UpdateDomainNameserver request includes the following
     *        elements.
     * @return Result of the UpdateDomainNameservers operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws DuplicateRequestException
     *         The request is already in progress for the domain.
     * @throws TLDRulesViolationException
     *         The top-level domain does not support this operation.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.UpdateDomainNameservers
     */
    @Override
    public UpdateDomainNameserversResult updateDomainNameservers(
            UpdateDomainNameserversRequest updateDomainNameserversRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDomainNameserversRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainNameserversRequest> request = null;
        Response<UpdateDomainNameserversResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainNameserversRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateDomainNameserversRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateDomainNameserversResult> responseHandler = new JsonResponseHandler<UpdateDomainNameserversResult>(
                    new UpdateDomainNameserversResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This operation adds or updates tags for a specified domain.
     * </p>
     * <p>
     * All tag operations are eventually consistent; subsequent operations may
     * not immediately represent all issued operations.
     * </p>
     * 
     * @param updateTagsForDomainRequest
     *        The UpdateTagsForDomainRequest includes the following elements.
     * @return Result of the UpdateTagsForDomain operation returned by the
     *         service.
     * @throws InvalidInputException
     *         The requested item is not acceptable. For example, for an
     *         OperationId it may refer to the ID of an operation that is
     *         already completed. For a domain name, it may not be a valid
     *         domain name or belong to the requester account.
     * @throws OperationLimitExceededException
     *         The number of operations or jobs running exceeded the allowed
     *         threshold for the account.
     * @throws UnsupportedTLDException
     *         Amazon Route 53 does not support this top-level domain.
     * @sample AmazonRoute53Domains.UpdateTagsForDomain
     */
    @Override
    public UpdateTagsForDomainResult updateTagsForDomain(
            UpdateTagsForDomainRequest updateTagsForDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTagsForDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagsForDomainRequest> request = null;
        Response<UpdateTagsForDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagsForDomainRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateTagsForDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateTagsForDomainResult> responseHandler = new JsonResponseHandler<UpdateTagsForDomainResult>(
                    new UpdateTagsForDomainResultJsonUnmarshaller());
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
