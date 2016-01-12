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
package com.amazonaws.services.route53;

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

import com.amazonaws.services.route53.model.*;
import com.amazonaws.services.route53.model.transform.*;

/**
 * Client for accessing Route 53. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * 
 */
public class AmazonRoute53Client extends AmazonWebServiceClient implements
        AmazonRoute53 {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRoute53.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "route53";

    /**
     * List of exception unmarshallers for all Route 53 exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Route 53. A
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
    public AmazonRoute53Client() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Route 53. A
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
     *        connects to Route 53 (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRoute53Client(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 using the
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
    public AmazonRoute53Client(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 using the
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
     *        connects to Route 53 (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRoute53Client(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 using the
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
    public AmazonRoute53Client(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 using the
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
     *        connects to Route 53 (ex: proxy settings, retry counts, etc.).
     */
    public AmazonRoute53Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Route 53 using the
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
     *        connects to Route 53 (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonRoute53Client(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ConflictingTypesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DelegationSetNotAvailableExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NoSuchHealthCheckExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new HostedZoneNotEmptyExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new HostedZoneAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NoSuchDelegationSetExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidDomainNameExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DelegationSetAlreadyReusableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NoSuchTrafficPolicyExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyHealthChecksExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DelegationSetInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCIdExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new LastVPCAssociationExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidChangeBatchExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new ConcurrentModificationExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyHostedZonesExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new HostedZoneNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DelegationSetAlreadyCreatedExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new ConflictingDomainExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitsExceededExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyTrafficPolicyInstancesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HealthCheckInUseExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new HealthCheckVersionMismatchExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NoSuchGeoLocationExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new NoSuchTrafficPolicyInstanceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchHostedZoneExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new VPCAssociationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new IncompatibleVersionExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new HealthCheckAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new PublicZoneVPCAssociationExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TrafficPolicyInstanceAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TrafficPolicyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchChangeExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TrafficPolicyInUseExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new DelegationSetNotReusableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InvalidTrafficPolicyDocumentExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new PriorRequestNotCompleteExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new TooManyTrafficPoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://route53.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/route53/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/route53/request.handler2s"));
    }

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>AssociateVPCWithHostedZoneRequest</code> element. The response
     * returns the <code>AssociateVPCWithHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to
     *        associate a VPC with an hosted zone.
     * @return Result of the AssociateVPCWithHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PublicZoneVPCAssociationException
     *         The hosted zone you are trying to associate VPC with doesn't have
     *         any VPC association. Amazon Route 53 currently doesn't support
     *         associate a VPC with a public hosted zone.
     * @throws ConflictingDomainExistsException
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @sample AmazonRoute53.AssociateVPCWithHostedZone
     */
    @Override
    public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(associateVPCWithHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateVPCWithHostedZoneRequest> request = null;
        Response<AssociateVPCWithHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateVPCWithHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(associateVPCWithHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AssociateVPCWithHostedZoneResult> responseHandler = new StaxResponseHandler<AssociateVPCWithHostedZoneResult>(
                    new AssociateVPCWithHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this action to create or change your authoritative DNS information.
     * To use this action, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted Zone ID</i>/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional. For
     * more information on transactional changes, also known as change batches,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/">POST
     * ChangeResourceRecordSets</a> in the <i>Amazon Route 53 API Reference</i>.
     * </p>
     * <important>Due to the nature of transactional changes, you cannot delete
     * the same resource record set more than once in a single change batch. If
     * you attempt to delete the same change batch more than once, Amazon Route
     * 53 returns an <code>InvalidChangeBatch</code> error.</important>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your DNS
     * data is changed on all Amazon Route 53 DNS servers. Initially, the status
     * of a change is <code>PENDING</code>. This means the change has not yet
     * propagated to all the authoritative Amazon Route 53 DNS servers. When the
     * change is propagated to all hosts, the change returns a status of
     * <code>INSYNC</code>.
     * </p>
     * <p>
     * Note the following limitations on a <code>ChangeResourceRecordSets</code>
     * request:
     * </p>
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li>A request cannot contain more than 1000 ResourceRecord elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000 characters.
     * </li>
     * </ul>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains a change batch.
     * @return Result of the ChangeResourceRecordSets operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidChangeBatchException
     *         This error contains a list of one or more error messages. Each
     *         error message indicates one error in the change batch. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html#example_Errors"
     *         >Example InvalidChangeBatch Errors</a>.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @sample AmazonRoute53.ChangeResourceRecordSets
     */
    @Override
    public ChangeResourceRecordSetsResult changeResourceRecordSets(
            ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) {
        ExecutionContext executionContext = createExecutionContext(changeResourceRecordSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeResourceRecordSetsRequest> request = null;
        Response<ChangeResourceRecordSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeResourceRecordSetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(changeResourceRecordSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ChangeResourceRecordSetsResult> responseHandler = new StaxResponseHandler<ChangeResourceRecordSetsResult>(
                    new ChangeResourceRecordSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param changeTagsForResourceRequest
     *        A complex type containing information about a request to add,
     *        change, or delete the tags that are associated with a resource.
     * @return Result of the ChangeTagsForResource operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ChangeTagsForResource
     */
    @Override
    public ChangeTagsForResourceResult changeTagsForResource(
            ChangeTagsForResourceRequest changeTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(changeTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ChangeTagsForResourceRequest> request = null;
        Response<ChangeTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ChangeTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(changeTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ChangeTagsForResourceResult> responseHandler = new StaxResponseHandler<ChangeTagsForResourceResult>(
                    new ChangeTagsForResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the <code>CreateHealthCheckResponse</code>
     * element that contains metadata about the health check.
     * </p>
     * 
     * @param createHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        create a health check.
     * @return Result of the CreateHealthCheck operation returned by the
     *         service.
     * @throws TooManyHealthChecksException
     * @throws HealthCheckAlreadyExistsException
     *         The health check you are trying to create already exists. Amazon
     *         Route 53 returns this error when a health check has already been
     *         created with the specified <code>CallerReference</code>.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.CreateHealthCheck
     */
    @Override
    public CreateHealthCheckResult createHealthCheck(
            CreateHealthCheckRequest createHealthCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(createHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHealthCheckRequest> request = null;
        Response<CreateHealthCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHealthCheckRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createHealthCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateHealthCheckResult> responseHandler = new StaxResponseHandler<CreateHealthCheckResult>(
                    new CreateHealthCheckResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the <code>CreateHostedZoneResponse</code>
     * element that contains metadata about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS
     * records for the zone. The NS records in the hosted zone are the name
     * servers you give your registrar to delegate your domain to. For more
     * information about SOA and NS records, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"
     * >NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code>. This
     * means that it is not yet available on all DNS servers. The status of the
     * zone changes to <code>INSYNC</code> when the NS and SOA records are
     * available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, you
     * could specify an optional DelegationSetId, and Route53 would assign those
     * 4 NS records for the zone, instead of alloting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to
     *        create a hosted zone.
     * @return Result of the CreateHostedZone operation returned by the service.
     * @throws InvalidDomainNameException
     *         This error indicates that the specified domain name is not valid.
     * @throws HostedZoneAlreadyExistsException
     *         The hosted zone you are trying to create already exists. Amazon
     *         Route 53 returns this error when a hosted zone has already been
     *         created with the specified <code>CallerReference</code>.
     * @throws TooManyHostedZonesException
     *         This error indicates that you've reached the maximum number of
     *         hosted zones that can be created for the current AWS account. You
     *         can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws DelegationSetNotAvailableException
     *         Amazon Route 53 allows some duplicate domain names, but there is
     *         a maximum number of duplicate names. This error indicates that
     *         you have reached that maximum. If you want to create another
     *         hosted zone with the same name and Amazon Route 53 generates this
     *         error, you can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws ConflictingDomainExistsException
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @sample AmazonRoute53.CreateHostedZone
     */
    @Override
    public CreateHostedZoneResult createHostedZone(
            CreateHostedZoneRequest createHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(createHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHostedZoneRequest> request = null;
        Response<CreateHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateHostedZoneResult> responseHandler = new StaxResponseHandler<CreateHostedZoneResult>(
                    new CreateHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code> request
     * to the <code>2015-01-01/delegationset</code> resource. The request body
     * must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element that
     * contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @return Result of the CreateReusableDelegationSet operation returned by
     *         the service.
     * @throws DelegationSetAlreadyCreatedException
     *         A delegation set with the same owner and caller reference
     *         combination has already been created.
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @throws HostedZoneNotFoundException
     *         The specified HostedZone cannot be found.
     * @throws InvalidArgumentException
     *         At least one of the specified arguments is invalid.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws DelegationSetNotAvailableException
     *         Amazon Route 53 allows some duplicate domain names, but there is
     *         a maximum number of duplicate names. This error indicates that
     *         you have reached that maximum. If you want to create another
     *         hosted zone with the same name and Amazon Route 53 generates this
     *         error, you can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws DelegationSetAlreadyReusableException
     *         The specified delegation set has already been marked as reusable.
     * @sample AmazonRoute53.CreateReusableDelegationSet
     */
    @Override
    public CreateReusableDelegationSetResult createReusableDelegationSet(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest) {
        ExecutionContext executionContext = createExecutionContext(createReusableDelegationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReusableDelegationSetRequest> request = null;
        Response<CreateReusableDelegationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReusableDelegationSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReusableDelegationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateReusableDelegationSetResult> responseHandler = new StaxResponseHandler<CreateReusableDelegationSetResult>(
                    new CreateReusableDelegationSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource
     * record sets for one domain name (such as example.com) or one subdomain
     * name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy
     *        that you want to create.
     * @return Result of the CreateTrafficPolicy operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TooManyTrafficPoliciesException
     *         You've created the maximum number of traffic policies that can be
     *         created for the current AWS account. You can request an increase
     *         to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws TrafficPolicyAlreadyExistsException
     *         A traffic policy that has the same value for <code>Name</code>
     *         already exists.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in
     *         the <code>Document</code> element is invalid.
     * @sample AmazonRoute53.CreateTrafficPolicy
     */
    @Override
    public CreateTrafficPolicyResult createTrafficPolicy(
            CreateTrafficPolicyRequest createTrafficPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrafficPolicyRequest> request = null;
        Response<CreateTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrafficPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTrafficPolicyResult> responseHandler = new StaxResponseHandler<CreateTrafficPolicyResult>(
                    new CreateTrafficPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource record
     * sets with a specified domain name (such as example.com) or subdomain name
     * (such as www.example.com). Amazon Route 53 responds to DNS queries for
     * the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request to
     * the <code>2015-01-01/trafficpolicyinstance</code> resource. The request
     * body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains
     * information about the traffic policy instance.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to create based on a specified traffic policy.
     * @return Result of the CreateTrafficPolicyInstance operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TooManyTrafficPolicyInstancesException
     *         You've created the maximum number of traffic policy instances
     *         that can be created for the current AWS account. You can request
     *         an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws TrafficPolicyInstanceAlreadyExistsException
     *         Traffic policy instance with given Id already exists.
     * @sample AmazonRoute53.CreateTrafficPolicyInstance
     */
    @Override
    public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrafficPolicyInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrafficPolicyInstanceRequest> request = null;
        Response<CreateTrafficPolicyInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrafficPolicyInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createTrafficPolicyInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTrafficPolicyInstanceResult> responseHandler = new StaxResponseHandler<CreateTrafficPolicyInstanceResult>(
                    new CreateTrafficPolicyInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a
     * new version of a traffic policy, you specify the ID of the traffic policy
     * that you want to update and a JSON-formatted document that describes the
     * new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets for
     * one domain name (such as example.com) or one subdomain name (such as
     * www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to create a new version.
     * @return Result of the CreateTrafficPolicyVersion operation returned by
     *         the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in
     *         the <code>Document</code> element is invalid.
     * @sample AmazonRoute53.CreateTrafficPolicyVersion
     */
    @Override
    public CreateTrafficPolicyVersionResult createTrafficPolicyVersion(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrafficPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrafficPolicyVersionRequest> request = null;
        Response<CreateTrafficPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrafficPolicyVersionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createTrafficPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTrafficPolicyVersionResult> responseHandler = new StaxResponseHandler<CreateTrafficPolicyVersionResult>(
                    new CreateTrafficPolicyVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * <important> You can delete a health check only if there are no resource
     * record sets associated with this health check. If resource record sets
     * are associated with this health check, you must disassociate them before
     * you can delete your health check. If you try to delete a health check
     * that is associated with resource record sets, Amazon Route 53 will deny
     * your request with a <code>HealthCheckInUse</code> error. For information
     * about disassociating the records from your health check, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHealthCheckRequest
     *        A complex type containing the request information for delete
     *        health check.
     * @return Result of the DeleteHealthCheck operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws HealthCheckInUseException
     *         There are resource records associated with this health check.
     *         Before you can delete the health check, you must disassociate it
     *         from the resource record sets.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteHealthCheck
     */
    @Override
    public DeleteHealthCheckResult deleteHealthCheck(
            DeleteHealthCheckRequest deleteHealthCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHealthCheckRequest> request = null;
        Response<DeleteHealthCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHealthCheckRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteHealthCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteHealthCheckResult> responseHandler = new StaxResponseHandler<DeleteHealthCheckResult>(
                    new DeleteHealthCheckResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"
     * >Deleting a Hosted Zone</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <important> You can delete a hosted zone only if there are no resource
     * record sets other than the default SOA record and NS resource record
     * sets. If your hosted zone contains other resource record sets, you must
     * delete them before you can delete your hosted zone. If you try to delete
     * a hosted zone that contains other resource record sets, Amazon Route 53
     * will deny your request with a <code>HostedZoneNotEmpty</code> error. For
     * information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone
     *        that you want to delete.
     * @return Result of the DeleteHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     * @throws HostedZoneNotEmptyException
     *         The hosted zone contains resource record sets in addition to the
     *         default NS and SOA resource record sets. Before you can delete
     *         the hosted zone, you must delete the additional resource record
     *         sets.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteHostedZone
     */
    @Override
    public DeleteHostedZoneResult deleteHostedZone(
            DeleteHostedZoneRequest deleteHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHostedZoneRequest> request = null;
        Response<DeleteHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteHostedZoneResult> responseHandler = new StaxResponseHandler<DeleteHostedZoneResult>(
                    new DeleteHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2015-01-01/delegationset/<i>delegation set ID</i></code> resource.
     * </p>
     * <important> You can delete a reusable delegation set only if there are no
     * associated hosted zones. If your reusable delegation set contains
     * associated hosted zones, you must delete them before you can delete your
     * reusable delegation set. If you try to delete a reusable delegation set
     * that contains associated hosted zones, Amazon Route 53 will deny your
     * request with a <code>DelegationSetInUse</code> error.</important>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @return Result of the DeleteReusableDelegationSet operation returned by
     *         the service.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetInUseException
     *         The specified delegation contains associated hosted zones which
     *         must be deleted before the reusable delegation set can be
     *         deleted.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteReusableDelegationSet
     */
    @Override
    public DeleteReusableDelegationSetResult deleteReusableDelegationSet(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReusableDelegationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReusableDelegationSetRequest> request = null;
        Response<DeleteReusableDelegationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReusableDelegationSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReusableDelegationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteReusableDelegationSetResult> responseHandler = new StaxResponseHandler<DeleteReusableDelegationSetResult>(
                    new DeleteReusableDelegationSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return Result of the DeleteTrafficPolicy operation returned by the
     *         service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TrafficPolicyInUseException
     *         One or more traffic policy instances were created by using the
     *         specified traffic policy.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @sample AmazonRoute53.DeleteTrafficPolicy
     */
    @Override
    public DeleteTrafficPolicyResult deleteTrafficPolicy(
            DeleteTrafficPolicyRequest deleteTrafficPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrafficPolicyRequest> request = null;
        Response<DeleteTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrafficPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTrafficPolicyResult> responseHandler = new StaxResponseHandler<DeleteTrafficPolicyResult>(
                    new DeleteTrafficPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code> request
     * to the
     * <code>2015-01-01/trafficpolicy/<i>traffic policy instance ID</i></code>
     * resource.
     * </p>
     * <important>When you delete a traffic policy instance, Amazon Route 53
     * also deletes all of the resource record sets that were created when you
     * created the traffic policy instance.</important>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy
     *        instance that you want to delete.
     * @return Result of the DeleteTrafficPolicyInstance operation returned by
     *         the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @sample AmazonRoute53.DeleteTrafficPolicyInstance
     */
    @Override
    public DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrafficPolicyInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrafficPolicyInstanceRequest> request = null;
        Response<DeleteTrafficPolicyInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrafficPolicyInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteTrafficPolicyInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTrafficPolicyInstanceResult> responseHandler = new StaxResponseHandler<DeleteTrafficPolicyInstanceResult>(
                    new DeleteTrafficPolicyInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>DisassociateVPCFromHostedZoneRequest</code> element. The response
     * returns the <code>DisassociateVPCFromHostedZoneResponse</code> element
     * that contains <code>ChangeInfo</code> for you to track the progress of
     * the <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the request to
     *        disassociate a VPC from an hosted zone.
     * @return Result of the DisassociateVPCFromHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws VPCAssociationNotFoundException
     *         The VPC you specified is not currently associated with the hosted
     *         zone.
     * @throws LastVPCAssociationException
     *         The VPC you are trying to disassociate from the hosted zone is
     *         the last the VPC that is associated with the hosted zone. Amazon
     *         Route 53 currently doesn't support disassociate the last VPC from
     *         the hosted zone.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DisassociateVPCFromHostedZone
     */
    @Override
    public DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(disassociateVPCFromHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateVPCFromHostedZoneRequest> request = null;
        Response<DisassociateVPCFromHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateVPCFromHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(disassociateVPCFromHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisassociateVPCFromHostedZoneResult> responseHandler = new StaxResponseHandler<DisassociateVPCFromHostedZoneResult>(
                    new DisassociateVPCFromHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request have
     * not replicated to all Amazon Route 53 DNS servers. This is the initial
     * status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to all
     * Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return Result of the GetChange operation returned by the service.
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetChange
     */
    @Override
    public GetChangeResult getChange(GetChangeRequest getChangeRequest) {
        ExecutionContext executionContext = createExecutionContext(getChangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeRequest> request = null;
        Response<GetChangeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeRequestMarshaller().marshall(super
                        .beforeMarshalling(getChangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetChangeResult> responseHandler = new StaxResponseHandler<GetChangeResult>(
                    new GetChangeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     * 
     * @param getChangeDetailsRequest
     *        The input for a GetChangeDetails request.
     * @return Result of the GetChangeDetails operation returned by the service.
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetChangeDetails
     */
    @Override
    public GetChangeDetailsResult getChangeDetails(
            GetChangeDetailsRequest getChangeDetailsRequest) {
        ExecutionContext executionContext = createExecutionContext(getChangeDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChangeDetailsRequest> request = null;
        Response<GetChangeDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChangeDetailsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getChangeDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetChangeDetailsResult> responseHandler = new StaxResponseHandler<GetChangeDetailsResult>(
                    new GetChangeDetailsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a <code>GET</code>
     * request to the <code>2015-01-01/checkeripranges</code> resource. You can
     * use these IP addresses to configure router and firewall rules to allow
     * health checkers to check the health of your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return Result of the GetCheckerIpRanges operation returned by the
     *         service.
     * @sample AmazonRoute53.GetCheckerIpRanges
     */
    @Override
    public GetCheckerIpRangesResult getCheckerIpRanges(
            GetCheckerIpRangesRequest getCheckerIpRangesRequest) {
        ExecutionContext executionContext = createExecutionContext(getCheckerIpRangesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCheckerIpRangesRequest> request = null;
        Response<GetCheckerIpRangesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCheckerIpRangesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getCheckerIpRangesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCheckerIpRangesResult> responseHandler = new StaxResponseHandler<GetCheckerIpRangesResult>(
                    new GetCheckerIpRangesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetCheckerIpRangesResult getCheckerIpRanges() {
        return getCheckerIpRanges(new GetCheckerIpRangesRequest());
    }

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to the
     * <code>2015-01-01/geolocation</code> resource with one of these options:
     * continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get
     *        a geo location.
     * @return Result of the GetGeoLocation operation returned by the service.
     * @throws NoSuchGeoLocationException
     *         The geo location you are trying to get does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetGeoLocation
     */
    @Override
    public GetGeoLocationResult getGeoLocation(
            GetGeoLocationRequest getGeoLocationRequest) {
        ExecutionContext executionContext = createExecutionContext(getGeoLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetGeoLocationRequest> request = null;
        Response<GetGeoLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetGeoLocationRequestMarshaller().marshall(super
                        .beforeMarshalling(getGeoLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetGeoLocationResult> responseHandler = new StaxResponseHandler<GetGeoLocationResult>(
                    new GetGeoLocationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetGeoLocationResult getGeoLocation() {
        return getGeoLocation(new GetGeoLocationRequest());
    }

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A complex type that contains information about the request to get
     *        a health check.
     * @return Result of the GetHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this
     *         Amazon Route 53 endpoint. Please consider using a newer endpoint
     *         or a tool that does so.
     * @sample AmazonRoute53.GetHealthCheck
     */
    @Override
    public GetHealthCheckResult getHealthCheck(
            GetHealthCheckRequest getHealthCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(getHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHealthCheckRequest> request = null;
        Response<GetHealthCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHealthCheckRequestMarshaller().marshall(super
                        .beforeMarshalling(getHealthCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHealthCheckResult> responseHandler = new StaxResponseHandler<GetHealthCheckResult>(
                    new GetHealthCheckResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code>
     * request to the <code>2015-01-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/healthcheckcount</code> resource.
     * @return Result of the GetHealthCheckCount operation returned by the
     *         service.
     * @sample AmazonRoute53.GetHealthCheckCount
     */
    @Override
    public GetHealthCheckCountResult getHealthCheckCount(
            GetHealthCheckCountRequest getHealthCheckCountRequest) {
        ExecutionContext executionContext = createExecutionContext(getHealthCheckCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHealthCheckCountRequest> request = null;
        Response<GetHealthCheckCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHealthCheckCountRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getHealthCheckCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHealthCheckCountResult> responseHandler = new StaxResponseHandler<GetHealthCheckCountResult>(
                    new GetHealthCheckCountResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetHealthCheckCountResult getHealthCheckCount() {
        return getHealthCheckCount(new GetHealthCheckCountRequest());
    }

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why it
     * failed most recently (if at all), you can get the failure reason for the
     * most recent failure. Send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i>/lastfailurereason</code>
     * resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A complex type that contains information about the request to get
     *        the most recent failure reason for a health check.
     * @return Result of the GetHealthCheckLastFailureReason operation returned
     *         by the service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHealthCheckLastFailureReason
     */
    @Override
    public GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest) {
        ExecutionContext executionContext = createExecutionContext(getHealthCheckLastFailureReasonRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHealthCheckLastFailureReasonRequest> request = null;
        Response<GetHealthCheckLastFailureReasonResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHealthCheckLastFailureReasonRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getHealthCheckLastFailureReasonRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHealthCheckLastFailureReasonResult> responseHandler = new StaxResponseHandler<GetHealthCheckLastFailureReasonResult>(
                    new GetHealthCheckLastFailureReasonResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request to
     * the <code>2015-01-01/healthcheck/<i>health check ID</i>/status</code>
     * resource. You can use this call to get a health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get
     *        health check status for a health check.
     * @return Result of the GetHealthCheckStatus operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHealthCheckStatus
     */
    @Override
    public GetHealthCheckStatusResult getHealthCheckStatus(
            GetHealthCheckStatusRequest getHealthCheckStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getHealthCheckStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHealthCheckStatusRequest> request = null;
        Response<GetHealthCheckStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHealthCheckStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getHealthCheckStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHealthCheckStatusResult> responseHandler = new StaxResponseHandler<GetHealthCheckStatusResult>(
                    new GetHealthCheckStatusResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code>
     * resource. The delegation set is the four Amazon Route 53 name servers
     * that were assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @return Result of the GetHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHostedZone
     */
    @Override
    public GetHostedZoneResult getHostedZone(
            GetHostedZoneRequest getHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(getHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostedZoneRequest> request = null;
        Response<GetHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostedZoneRequestMarshaller().marshall(super
                        .beforeMarshalling(getHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHostedZoneResult> responseHandler = new StaxResponseHandler<GetHostedZoneResult>(
                    new GetHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonecount</code> resource.
     * @return Result of the GetHostedZoneCount operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHostedZoneCount
     */
    @Override
    public GetHostedZoneCountResult getHostedZoneCount(
            GetHostedZoneCountRequest getHostedZoneCountRequest) {
        ExecutionContext executionContext = createExecutionContext(getHostedZoneCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetHostedZoneCountRequest> request = null;
        Response<GetHostedZoneCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetHostedZoneCountRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getHostedZoneCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetHostedZoneCountResult> responseHandler = new StaxResponseHandler<GetHostedZoneCountResult>(
                    new GetHostedZoneCountResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetHostedZoneCountResult getHostedZoneCount() {
        return getHostedZoneCount(new GetHostedZoneCountRequest());
    }

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code> request
     * to the <code>2015-01-01/delegationset/<i>delegation set ID</i></code>
     * resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a GetReusableDelegationSet request.
     * @return Result of the GetReusableDelegationSet operation returned by the
     *         service.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetReusableDelegationSet
     */
    @Override
    public GetReusableDelegationSetResult getReusableDelegationSet(
            GetReusableDelegationSetRequest getReusableDelegationSetRequest) {
        ExecutionContext executionContext = createExecutionContext(getReusableDelegationSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReusableDelegationSetRequest> request = null;
        Response<GetReusableDelegationSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReusableDelegationSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getReusableDelegationSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetReusableDelegationSetResult> responseHandler = new StaxResponseHandler<GetReusableDelegationSetResult>(
                    new GetReusableDelegationSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get
     *        the information, send a GET request to the
     *        2015-01-01/trafficpolicy resource, and specify the ID and the
     *        version of the traffic policy.
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetTrafficPolicy
     */
    @Override
    public GetTrafficPolicyResult getTrafficPolicy(
            GetTrafficPolicyRequest getTrafficPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getTrafficPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrafficPolicyRequest> request = null;
        Response<GetTrafficPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrafficPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getTrafficPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTrafficPolicyResult> responseHandler = new StaxResponseHandler<GetTrafficPolicyResult>(
                    new GetTrafficPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element. </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstance/<i>Id</i></code> resource.
     * @return Result of the GetTrafficPolicyInstance operation returned by the
     *         service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetTrafficPolicyInstance
     */
    @Override
    public GetTrafficPolicyInstanceResult getTrafficPolicyInstance(
            GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(getTrafficPolicyInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrafficPolicyInstanceRequest> request = null;
        Response<GetTrafficPolicyInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrafficPolicyInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getTrafficPolicyInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTrafficPolicyInstanceResult> responseHandler = new StaxResponseHandler<GetTrafficPolicyInstanceResult>(
                    new GetTrafficPolicyInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code>
     * request to the <code>2015-01-01/trafficpolicyinstancecount</code>
     * resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstancecount</code> resource.
     * @return Result of the GetTrafficPolicyInstanceCount operation returned by
     *         the service.
     * @sample AmazonRoute53.GetTrafficPolicyInstanceCount
     */
    @Override
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest) {
        ExecutionContext executionContext = createExecutionContext(getTrafficPolicyInstanceCountRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrafficPolicyInstanceCountRequest> request = null;
        Response<GetTrafficPolicyInstanceCountResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrafficPolicyInstanceCountRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getTrafficPolicyInstanceCountRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTrafficPolicyInstanceCountResult> responseHandler = new StaxResponseHandler<GetTrafficPolicyInstanceCountResult>(
                    new GetTrafficPolicyInstanceCountResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount() {
        return getTrafficPolicyInstanceCount(new GetTrafficPolicyInstanceCountRequest());
    }

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone.
     * </p>
     * 
     * @param listChangeBatchesByHostedZoneRequest
     *        The input for a ListChangeBatchesByHostedZone request.
     * @return Result of the ListChangeBatchesByHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListChangeBatchesByHostedZone
     */
    @Override
    public ListChangeBatchesByHostedZoneResult listChangeBatchesByHostedZone(
            ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(listChangeBatchesByHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangeBatchesByHostedZoneRequest> request = null;
        Response<ListChangeBatchesByHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangeBatchesByHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listChangeBatchesByHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListChangeBatchesByHostedZoneResult> responseHandler = new StaxResponseHandler<ListChangeBatchesByHostedZoneResult>(
                    new ListChangeBatchesByHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone and RRSet.
     * </p>
     * 
     * @param listChangeBatchesByRRSetRequest
     *        The input for a ListChangeBatchesByRRSet request.
     * @return Result of the ListChangeBatchesByRRSet operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListChangeBatchesByRRSet
     */
    @Override
    public ListChangeBatchesByRRSetResult listChangeBatchesByRRSet(
            ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest) {
        ExecutionContext executionContext = createExecutionContext(listChangeBatchesByRRSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangeBatchesByRRSetRequest> request = null;
        Response<ListChangeBatchesByRRSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangeBatchesByRRSetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listChangeBatchesByRRSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListChangeBatchesByRRSetResult> responseHandler = new StaxResponseHandler<ListChangeBatchesByRRSetResult>(
                    new ListChangeBatchesByRRSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a <code>GET</code>
     * request to the <code>2015-01-01/geolocations</code> resource. The
     * response to this request includes a <code>GeoLocationDetailsList</code>
     * element with zero, one, or multiple <code>GeoLocationDetails</code> child
     * elements. The list is sorted by country code, and then subdivision code,
     * followed by continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination of
     * <code>NextContinentCode, NextCountryCode, NextSubdivisionCode</code> will
     * be populated. You can pass these as parameters to
     * <code>StartContinentCode, StartCountryCode, StartSubdivisionCode</code>
     * to control the geo location that the list begins with.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        The input for a ListGeoLocations request.
     * @return Result of the ListGeoLocations operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListGeoLocations
     */
    @Override
    public ListGeoLocationsResult listGeoLocations(
            ListGeoLocationsRequest listGeoLocationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listGeoLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListGeoLocationsRequest> request = null;
        Response<ListGeoLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListGeoLocationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listGeoLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListGeoLocationsResult> responseHandler = new StaxResponseHandler<ListGeoLocationsResult>(
                    new ListGeoLocationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListGeoLocationsResult listGeoLocations() {
        return listGeoLocations(new ListGeoLocationsRequest());
    }

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code> request
     * to the <code>2015-01-01/healthcheck</code> resource. The response to this
     * request includes a <code>HealthChecks</code> element with zero, one, or
     * multiple <code>HealthCheck</code> child elements. By default, the list of
     * health checks is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * health check that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code>
     *        request to the <code>2015-01-01/healthcheck</code> resource. The
     *        response to this request includes a <code>HealthChecks</code>
     *        element with zero or more <code>HealthCheck</code> child elements.
     *        By default, the list of health checks is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the health check that the
     *        list begins with.</p> <note> Amazon Route 53 returns a maximum of
     *        100 items. If you set <code>MaxItems</code> to a value greater
     *        than 100, Amazon Route 53 returns only the first 100.
     * @return Result of the ListHealthChecks operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this
     *         Amazon Route 53 endpoint. Please consider using a newer endpoint
     *         or a tool that does so.
     * @sample AmazonRoute53.ListHealthChecks
     */
    @Override
    public ListHealthChecksResult listHealthChecks(
            ListHealthChecksRequest listHealthChecksRequest) {
        ExecutionContext executionContext = createExecutionContext(listHealthChecksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHealthChecksRequest> request = null;
        Response<ListHealthChecksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHealthChecksRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listHealthChecksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListHealthChecksResult> responseHandler = new StaxResponseHandler<ListHealthChecksResult>(
                    new ListHealthChecksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListHealthChecksResult listHealthChecks() {
        return listHealthChecks(new ListHealthChecksRequest());
    }

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code> request
     * to the <code>2015-01-01/hostedzone</code> resource. The response to this
     * request includes a <code>HostedZones</code> element with zero, one, or
     * multiple <code>HostedZone</code> child elements. By default, the list of
     * hosted zones is displayed on a single page. You can control the length of
     * the page that is displayed by using the <code>MaxItems</code> parameter.
     * You can use the <code>Marker</code> parameter to control the hosted zone
     * that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your hosted zones, send a <code>GET</code>
     *        request to the <code>2015-01-01/hostedzone</code> resource. The
     *        response to this request includes a <code>HostedZones</code>
     *        element with zero or more <code>HostedZone</code> child elements.
     *        By default, the list of hosted zones is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the hosted zone that the
     *        list begins with. For more information about listing hosted zones,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.</p> <note> Amazon Route 53 returns a
     *        maximum of 100 items. If you set <code>MaxItems</code> to a value
     *        greater than 100, Amazon Route 53 returns only the first 100.
     * @return Result of the ListHostedZones operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @sample AmazonRoute53.ListHostedZones
     */
    @Override
    public ListHostedZonesResult listHostedZones(
            ListHostedZonesRequest listHostedZonesRequest) {
        ExecutionContext executionContext = createExecutionContext(listHostedZonesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHostedZonesRequest> request = null;
        Response<ListHostedZonesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHostedZonesRequestMarshaller().marshall(super
                        .beforeMarshalling(listHostedZonesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListHostedZonesResult> responseHandler = new StaxResponseHandler<ListHostedZonesResult>(
                    new ListHostedZonesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListHostedZonesResult listHostedZones() {
        return listHostedZones(new ListHostedZonesRequest());
    }

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send a
     * <code>GET</code> request to the <code>2015-01-01/hostedzonesbyname</code>
     * resource. The response to this request includes a
     * <code>HostedZones</code> element with zero or more
     * <code>HostedZone</code> child elements lexicographically ordered by DNS
     * name. By default, the list of hosted zones is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>DNSName</code> and
     * <code>HostedZoneId</code> parameters to control the hosted zone that the
     * list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesByNameRequest
     *        To retrieve a list of your hosted zones in lexicographic order,
     *        send a <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonesbyname</code> resource. The response
     *        to this request includes a <code>HostedZones</code> element with
     *        zero or more <code>HostedZone</code> child elements
     *        lexicographically ordered by DNS name. By default, the list of
     *        hosted zones is displayed on a single page. You can control the
     *        length of the page that is displayed by using the
     *        <code>MaxItems</code> parameter. You can use the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        control the hosted zone that the list begins with.</p>
     *        <p>
     *        For more information about listing hosted zones, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.
     * @return Result of the ListHostedZonesByName operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws InvalidDomainNameException
     *         This error indicates that the specified domain name is not valid.
     * @sample AmazonRoute53.ListHostedZonesByName
     */
    @Override
    public ListHostedZonesByNameResult listHostedZonesByName(
            ListHostedZonesByNameRequest listHostedZonesByNameRequest) {
        ExecutionContext executionContext = createExecutionContext(listHostedZonesByNameRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListHostedZonesByNameRequest> request = null;
        Response<ListHostedZonesByNameResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListHostedZonesByNameRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listHostedZonesByNameRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListHostedZonesByNameResult> responseHandler = new StaxResponseHandler<ListHostedZonesByNameResult>(
                    new ListHostedZonesByNameResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListHostedZonesByNameResult listHostedZonesByName() {
        return listHostedZonesByName(new ListHostedZonesByNameRequest());
    }

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results at
     * the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name.</li>
     * <li>If both Name and Type are specified, this means start the results at
     * the first RRSET in the list whose name is greater than or equal to Name
     * and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any processes
     * making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page of
     * record sets. For subsequent calls, set Name and Type to the NextName and
     * NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there is no
     * consistency of results across calls to ListResourceRecordSets. The only
     * way to get a consistent multi-page snapshot of all RRSETs in a zone is to
     * stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent within a
     * page. If MakeChange calls are taking place concurrently, the result of
     * each one will either be completely visible in your results or not at all.
     * You will not see partial changes, or changes that do not ultimately
     * succeed. (This follows from the fact that MakeChange is atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a call
     * to ChangeResourceRecordSets and receives a successful response, the
     * effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @return Result of the ListResourceRecordSets operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListResourceRecordSets
     */
    @Override
    public ListResourceRecordSetsResult listResourceRecordSets(
            ListResourceRecordSetsRequest listResourceRecordSetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listResourceRecordSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceRecordSetsRequest> request = null;
        Response<ListResourceRecordSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceRecordSetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listResourceRecordSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListResourceRecordSetsResult> responseHandler = new StaxResponseHandler<ListResourceRecordSetsResult>(
                    new ListResourceRecordSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2015-01-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * delegation set that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/delegationset</code> resource. The response to
     *        this request includes a <code>DelegationSets</code> element with
     *        zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a
     *        single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can
     *        use the <code>Marker</code> parameter to control the delegation
     *        set that the list begins with.</p> <note> Amazon Route 53 returns
     *        a maximum of 100 items. If you set <code>MaxItems</code> to a
     *        value greater than 100, Amazon Route 53 returns only the first
     *        100.
     * @return Result of the ListReusableDelegationSets operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListReusableDelegationSets
     */
    @Override
    public ListReusableDelegationSetsResult listReusableDelegationSets(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listReusableDelegationSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListReusableDelegationSetsRequest> request = null;
        Response<ListReusableDelegationSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListReusableDelegationSetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listReusableDelegationSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListReusableDelegationSetsResult> responseHandler = new StaxResponseHandler<ListReusableDelegationSetsResult>(
                    new ListReusableDelegationSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListReusableDelegationSetsResult listReusableDelegationSets() {
        return listReusableDelegationSets(new ListReusableDelegationSetsRequest());
    }

    /**
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with an individual resource.
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new StaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * @param listTagsForResourcesRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with up to 10 specified resources.
     * @return Result of the ListTagsForResources operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResources
     */
    @Override
    public ListTagsForResourcesResult listTagsForResources(
            ListTagsForResourcesRequest listTagsForResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourcesRequest> request = null;
        Response<ListTagsForResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourcesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourcesResult> responseHandler = new StaxResponseHandler<ListTagsForResourcesResult>(
                    new ListTagsForResourcesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that
     * is associated with the current AWS account. To get the information, send
     * a <code>GET</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code> traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policies associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy that is associated with the current account.
     * </p>
     * <li><b>TrafficPolicyIdMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies. If you want
     * to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to
     *        list the traffic policies that are associated with the current AWS
     *        account.
     * @return Result of the ListTrafficPolicies operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListTrafficPolicies
     */
    @Override
    public ListTrafficPoliciesResult listTrafficPolicies(
            ListTrafficPoliciesRequest listTrafficPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTrafficPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPoliciesRequest> request = null;
        Response<ListTrafficPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPoliciesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTrafficPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTrafficPoliciesResult> responseHandler = new StaxResponseHandler<ListTrafficPoliciesResult>(
                    new ListTrafficPoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTrafficPoliciesResult listTrafficPolicies() {
        return listTrafficPolicies(new ListTrafficPoliciesRequest());
    }

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using the current AWS account.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that are associated
     * with the current AWS account, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @return Result of the ListTrafficPolicyInstances operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstances
     */
    @Override
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTrafficPolicyInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPolicyInstancesRequest> request = null;
        Response<ListTrafficPolicyInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPolicyInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTrafficPolicyInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTrafficPolicyInstancesResult> responseHandler = new StaxResponseHandler<ListTrafficPolicyInstancesResult>(
                    new ListTrafficPolicyInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances() {
        return listTrafficPolicyInstances(new ListTrafficPolicyInstancesRequest());
    }

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a
     * specified hosted zone.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created in
     * a specified hosted zone, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource and include the ID
     * of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>,
     * there are more traffic policy instances associated with the current AWS
     * account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a
     *        specified hosted zone.
     * @return Result of the ListTrafficPolicyInstancesByHostedZone operation
     *         returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchHostedZoneException
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByHostedZone
     */
    @Override
    public ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest) {
        ExecutionContext executionContext = createExecutionContext(listTrafficPolicyInstancesByHostedZoneRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPolicyInstancesByHostedZoneRequest> request = null;
        Response<ListTrafficPolicyInstancesByHostedZoneResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPolicyInstancesByHostedZoneRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTrafficPolicyInstancesByHostedZoneRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTrafficPolicyInstancesByHostedZoneResult> responseHandler = new StaxResponseHandler<ListTrafficPolicyInstancesByHostedZoneResult>(
                    new ListTrafficPolicyInstancesByHostedZoneResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using a specify traffic policy version.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created by
     * using a specify traffic policy version, send a <code>GET</code> request
     * to the <code>2015-01-01/trafficpolicyinstance</code> resource and include
     * the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the specified
     * traffic policy.
     * </p>
     * </li>
     * <li><b>MaxItems</b>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </li>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values
     * in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @return Result of the ListTrafficPolicyInstancesByPolicy operation
     *         returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByPolicy
     */
    @Override
    public ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(listTrafficPolicyInstancesByPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPolicyInstancesByPolicyRequest> request = null;
        Response<ListTrafficPolicyInstancesByPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPolicyInstancesByPolicyRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTrafficPolicyInstancesByPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTrafficPolicyInstancesByPolicyResult> responseHandler = new StaxResponseHandler<ListTrafficPolicyInstancesByPolicyResult>(
                    new ListTrafficPolicyInstancesByPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions that
     * have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code>maxitems traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy versions associated with
     * the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy version that is associated with the specified
     * traffic policy.
     * </p>
     * <li><b>TrafficPolicyVersionMarker</b></li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code>, and specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits
     * the <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policies.
     * @return Result of the ListTrafficPolicyVersions operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyVersions
     */
    @Override
    public ListTrafficPolicyVersionsResult listTrafficPolicyVersions(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listTrafficPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTrafficPolicyVersionsRequest> request = null;
        Response<ListTrafficPolicyVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTrafficPolicyVersionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTrafficPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTrafficPolicyVersionsResult> responseHandler = new StaxResponseHandler<ListTrafficPolicyVersionsResult>(
                    new ListTrafficPolicyVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains metadata
     * about the health check.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        update a health check.
     * @return Result of the UpdateHealthCheck operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws HealthCheckVersionMismatchException
     * @sample AmazonRoute53.UpdateHealthCheck
     */
    @Override
    public UpdateHealthCheckResult updateHealthCheck(
            UpdateHealthCheckRequest updateHealthCheckRequest) {
        ExecutionContext executionContext = createExecutionContext(updateHealthCheckRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHealthCheckRequest> request = null;
        Response<UpdateHealthCheckResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHealthCheckRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateHealthCheckRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateHealthCheckResult> responseHandler = new StaxResponseHandler<UpdateHealthCheckResult>(
                    new UpdateHealthCheckResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request to
     * the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to this
     * request includes the modified <code>HostedZone</code> element.
     * </p>
     * <note> The comment can have a maximum length of 256 characters.</note>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains information about the request to
     *        update a hosted zone comment.
     * @return Result of the UpdateHostedZoneComment operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.UpdateHostedZoneComment
     */
    @Override
    public UpdateHostedZoneCommentResult updateHostedZoneComment(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateHostedZoneCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateHostedZoneCommentRequest> request = null;
        Response<UpdateHostedZoneCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateHostedZoneCommentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateHostedZoneCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateHostedZoneCommentResult> responseHandler = new StaxResponseHandler<UpdateHostedZoneCommentResult>(
                    new UpdateHostedZoneCommentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2015-01-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to update the comment.
     * @return Result of the UpdateTrafficPolicyComment operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @sample AmazonRoute53.UpdateTrafficPolicyComment
     */
    @Override
    public UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTrafficPolicyCommentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrafficPolicyCommentRequest> request = null;
        Response<UpdateTrafficPolicyCommentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrafficPolicyCommentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateTrafficPolicyCommentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateTrafficPolicyCommentResult> responseHandler = new StaxResponseHandler<UpdateTrafficPolicyCommentResult>(
                    new UpdateTrafficPolicyCommentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <important>The DNS type of the resource record sets that you're updating
     * must match the DNS type in the JSON document that is associated with the
     * traffic policy version that you're using to update the traffic policy
     * instance.</important>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to
     * respond to DNS queries for the root resource record set name (such as
     * example.com) while it replaces one group of resource record sets with
     * another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>Amazon Route 53 creates a new group of resource record sets based on
     * the specified traffic policy. This is true regardless of how substantial
     * the differences are between the existing resource record sets and the new
     * resource record sets.</li>
     * <li>When all of the new resource record sets have been created, Amazon
     * Route 53 starts to respond to DNS queries for the root resource record
     * set name (such as example.com) by using the new resource record sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets that
     * are associated with the root resource record set name.</li>
     * </ol>
     * <p>
     * To update a traffic policy instance, send a <code>POST</code> request to
     * the
     * <code>/2015-01-01/trafficpolicyinstance/<i>traffic policy ID</i></code>
     * resource. The request body must include an XML document with an
     * <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to update based on a specified traffic policy
     *        instance.
     * @return Result of the UpdateTrafficPolicyInstance operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ConflictingTypesException
     *         You tried to update a traffic policy instance by using a traffic
     *         policy version that has a different DNS type than the current
     *         type for the instance. You specified the type in the JSON
     *         document in the <code>CreateTrafficPolicy</code> or
     *         <code>CreateTrafficPolicyVersion</code>request.
     * @sample AmazonRoute53.UpdateTrafficPolicyInstance
     */
    @Override
    public UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTrafficPolicyInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrafficPolicyInstanceRequest> request = null;
        Response<UpdateTrafficPolicyInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrafficPolicyInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateTrafficPolicyInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateTrafficPolicyInstanceResult> responseHandler = new StaxResponseHandler<UpdateTrafficPolicyInstanceResult>(
                    new UpdateTrafficPolicyInstanceResultStaxUnmarshaller());
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
