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
package com.amazonaws.services.redshift;

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

import com.amazonaws.services.redshift.AmazonRedshiftClientBuilder;
import com.amazonaws.services.redshift.waiters.AmazonRedshiftWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.services.redshift.model.transform.*;

/**
 * Client for accessing Amazon Redshift. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Redshift</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is an interface reference for Amazon Redshift. It contains documentation for one of the programming or command
 * line interfaces you can use to manage Amazon Redshift clusters. Note that Amazon Redshift is asynchronous, which
 * means that some interfaces may require techniques, such as polling or asynchronous callback handlers, to determine
 * when a command has been applied. In this reference, the parameter descriptions indicate whether a change is applied
 * immediately, on the next instance reboot, or during the next maintenance window. For a summary of the Amazon Redshift
 * cluster management interfaces, go to <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/using-aws-sdk.html">Using the Amazon Redshift Management
 * Interfaces</a>.
 * </p>
 * <p>
 * Amazon Redshift manages all the work of setting up, operating, and scaling a data warehouse: provisioning capacity,
 * monitoring and backing up the cluster, and applying patches and upgrades to the Amazon Redshift engine. You can focus
 * on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Redshift, we recommend that you begin by reading the <a
 * href="https://docs.aws.amazon.com/redshift/latest/gsg/getting-started.html">Amazon Redshift Getting Started
 * Guide</a>.
 * </p>
 * <p>
 * If you are a database developer, the <a href="https://docs.aws.amazon.com/redshift/latest/dg/welcome.html">Amazon
 * Redshift Database Developer Guide</a> explains how to design, build, query, and maintain the databases that make up
 * your data warehouse.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftClient extends AmazonWebServiceClient implements AmazonRedshift {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRedshift.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "redshift";

    private volatile AmazonRedshiftWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AmazonRedshiftClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRedshiftClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonRedshiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRedshiftClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonRedshiftClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonRedshiftClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonRedshiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonRedshiftClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonRedshiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Redshift (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonRedshiftClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRedshiftClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRedshiftClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonRedshiftClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonRedshiftClientBuilder builder() {
        return AmazonRedshiftClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRedshiftClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Redshift using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRedshiftClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidHsmConfigurationStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionEventIdNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubscriptionStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotScheduleStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterTrackExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionSeverityNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CopyToRegionDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionCategoryNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidScheduleExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependentServiceRequestThrottlingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BucketNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTableRestoreArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnknownSnapshotCopyRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TableRestoreNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyGrantNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeAlreadyMigratedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyEnabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidReservedNodeStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DependentServiceUnavailableExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotCopyAlreadyDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmConfigurationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesPerClusterLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NumberOfNodesQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRetentionPeriodExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InProgressTableRestoreQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessToSnapshotDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidElasticIpExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TableLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleUpdateInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSnapshotCopyGrantStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResizeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHsmClientCertificateStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterOnLatestRevisionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScheduleDefinitionTypeUnsupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchModifyClusterSnapshotsLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTagExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new HsmClientCertificateQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSTopicArnNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnauthorizedOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotScheduleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionAlreadyExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedNodeNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IncompatibleOrderableOptionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketNameExceptionUnmarshaller());
        exceptionUnmarshallers.add(new UnsupportedOptionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TagLimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventSubscriptionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ClusterParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientS3BucketPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchDeleteRequestSizeExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3KeyPrefixExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.redshift.model.AmazonRedshiftException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("redshift.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/redshift/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/redshift/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Exchanges a DC1 Reserved Node for a DC2 Reserved Node with no changes to the configuration (term, payment type,
     * or number of nodes) and no additional costs.
     * </p>
     * 
     * @param acceptReservedNodeExchangeRequest
     * @return Result of the AcceptReservedNodeExchange operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws InvalidReservedNodeStateException
     *         Indicates that the Reserved Node being exchanged is not in an active state.
     * @throws ReservedNodeAlreadyMigratedException
     *         Indicates that the reserved node has already been exchanged.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @throws ReservedNodeAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @sample AmazonRedshift.AcceptReservedNodeExchange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AcceptReservedNodeExchange"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReservedNode acceptReservedNodeExchange(AcceptReservedNodeExchangeRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptReservedNodeExchange(request);
    }

    @SdkInternalApi
    final ReservedNode executeAcceptReservedNodeExchange(AcceptReservedNodeExchangeRequest acceptReservedNodeExchangeRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptReservedNodeExchangeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptReservedNodeExchangeRequest> request = null;
        Response<ReservedNode> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptReservedNodeExchangeRequestMarshaller().marshall(super.beforeMarshalling(acceptReservedNodeExchangeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptReservedNodeExchange");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReservedNode> responseHandler = new StaxResponseHandler<ReservedNode>(new ReservedNodeStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an inbound (ingress) rule to an Amazon Redshift security group. Depending on whether the application
     * accessing your cluster is running on the Internet or an Amazon EC2 instance, you can authorize inbound access to
     * either a Classless Interdomain Routing (CIDR)/Internet Protocol (IP) range or to an Amazon EC2 security group.
     * You can add as many as 20 ingress rules to an Amazon Redshift security group.
     * </p>
     * <p>
     * If you authorize access to an Amazon EC2 security group, specify <i>EC2SecurityGroupName</i> and
     * <i>EC2SecurityGroupOwnerId</i>. The Amazon EC2 security group and Amazon Redshift cluster must be in the same AWS
     * Region.
     * </p>
     * <p>
     * If you authorize access to a CIDR/IP address range, specify <i>CIDRIP</i>. For an overview of CIDR blocks, see
     * the Wikipedia article on <a href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless
     * Inter-Domain Routing</a>.
     * </p>
     * <p>
     * You must also associate the security group with a cluster so that clients running on these IP addresses or the
     * EC2 instance are authorized to connect to the cluster. For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Working with Security
     * Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeClusterSecurityGroupIngressRequest
     * @return Result of the AuthorizeClusterSecurityGroupIngress operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDR block or EC2 security group is already authorized for the specified cluster security
     *         group.
     * @throws AuthorizationQuotaExceededException
     *         The authorization quota for the cluster security group has been reached.
     * @sample AmazonRedshift.AuthorizeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterSecurityGroup authorizeClusterSecurityGroupIngress(AuthorizeClusterSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeClusterSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final ClusterSecurityGroup executeAuthorizeClusterSecurityGroupIngress(
            AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeClusterSecurityGroupIngressRequest> request = null;
        Response<ClusterSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeClusterSecurityGroupIngressRequestMarshaller().marshall(super
                        .beforeMarshalling(authorizeClusterSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeClusterSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterSecurityGroup> responseHandler = new StaxResponseHandler<ClusterSecurityGroup>(
                    new ClusterSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Authorizes the specified AWS customer account to restore the specified snapshot.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param authorizeSnapshotAccessRequest
     * @return Result of the AuthorizeSnapshotAccess operation returned by the service.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDR block or EC2 security group is already authorized for the specified cluster security
     *         group.
     * @throws AuthorizationQuotaExceededException
     *         The authorization quota for the cluster security group has been reached.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @sample AmazonRedshift.AuthorizeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeSnapshotAccess"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Snapshot authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeSnapshotAccess(request);
    }

    @SdkInternalApi
    final Snapshot executeAuthorizeSnapshotAccess(AuthorizeSnapshotAccessRequest authorizeSnapshotAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeSnapshotAccessRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeSnapshotAccessRequestMarshaller().marshall(super.beforeMarshalling(authorizeSnapshotAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeSnapshotAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a set of cluster snapshots.
     * </p>
     * 
     * @param batchDeleteClusterSnapshotsRequest
     * @return Result of the BatchDeleteClusterSnapshots operation returned by the service.
     * @throws BatchDeleteRequestSizeExceededException
     *         The maximum number for a batch delete of snapshots has been reached. The limit is 100.
     * @sample AmazonRedshift.BatchDeleteClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchDeleteClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteClusterSnapshotsResult batchDeleteClusterSnapshots(BatchDeleteClusterSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteClusterSnapshots(request);
    }

    @SdkInternalApi
    final BatchDeleteClusterSnapshotsResult executeBatchDeleteClusterSnapshots(BatchDeleteClusterSnapshotsRequest batchDeleteClusterSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteClusterSnapshotsRequest> request = null;
        Response<BatchDeleteClusterSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteClusterSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(batchDeleteClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteClusterSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchDeleteClusterSnapshotsResult> responseHandler = new StaxResponseHandler<BatchDeleteClusterSnapshotsResult>(
                    new BatchDeleteClusterSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a list of snapshots.
     * </p>
     * 
     * @param batchModifyClusterSnapshotsRequest
     * @return Result of the BatchModifyClusterSnapshots operation returned by the service.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @throws BatchModifyClusterSnapshotsLimitExceededException
     *         The maximum number for snapshot identifiers has been reached. The limit is 100.
     * @sample AmazonRedshift.BatchModifyClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchModifyClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchModifyClusterSnapshotsResult batchModifyClusterSnapshots(BatchModifyClusterSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeBatchModifyClusterSnapshots(request);
    }

    @SdkInternalApi
    final BatchModifyClusterSnapshotsResult executeBatchModifyClusterSnapshots(BatchModifyClusterSnapshotsRequest batchModifyClusterSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(batchModifyClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchModifyClusterSnapshotsRequest> request = null;
        Response<BatchModifyClusterSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchModifyClusterSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(batchModifyClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchModifyClusterSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchModifyClusterSnapshotsResult> responseHandler = new StaxResponseHandler<BatchModifyClusterSnapshotsResult>(
                    new BatchModifyClusterSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels a resize operation.
     * </p>
     * 
     * @param cancelResizeRequest
     * @return Result of the CancelResize operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ResizeNotFoundException
     *         A resize operation for the specified cluster is not found.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.CancelResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CancelResize" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelResizeResult cancelResize(CancelResizeRequest request) {
        request = beforeClientExecution(request);
        return executeCancelResize(request);
    }

    @SdkInternalApi
    final CancelResizeResult executeCancelResize(CancelResizeRequest cancelResizeRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelResizeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelResizeRequest> request = null;
        Response<CancelResizeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelResizeRequestMarshaller().marshall(super.beforeMarshalling(cancelResizeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelResize");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CancelResizeResult> responseHandler = new StaxResponseHandler<CancelResizeResult>(new CancelResizeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated
     * snapshot and it must be in the available state.
     * </p>
     * <p>
     * When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the
     * retention period of the snapshot expires, Amazon Redshift automatically deletes it. If you want to keep an
     * automated snapshot for a longer period, you can make a manual copy of the snapshot. Manual snapshots are retained
     * until you delete them.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param copyClusterSnapshotRequest
     * @return Result of the CopyClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CopyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CopyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Snapshot copyClusterSnapshot(CopyClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopyClusterSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeCopyClusterSnapshot(CopyClusterSnapshotRequest copyClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copyClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(copyClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cluster.
     * </p>
     * <p>
     * To create a cluster in Virtual Private Cloud (VPC), you must provide a cluster subnet group name. The cluster
     * subnet group identifies the subnets of your VPC that Amazon Redshift uses when creating the cluster. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws ClusterQuotaExceededException
     *         The request would exceed the allowed number of cluster instances for this account. For information about
     *         increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The cluster subnet group does not cover all Availability Zones.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Cluster createCluster(CreateClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCluster(request);
    }

    @SdkInternalApi
    final Cluster executeCreateCluster(CreateClusterRequest createClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterRequestMarshaller().marshall(super.beforeMarshalling(createClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Redshift parameter group.
     * </p>
     * <p>
     * Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group
     * when you create the cluster. You can also associate an existing cluster with a parameter group after the cluster
     * is created by using <a>ModifyCluster</a>.
     * </p>
     * <p>
     * Parameters in the parameter group define specific behavior that applies to the databases you create on the
     * cluster. For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterParameterGroupRequest
     * @return Result of the CreateClusterParameterGroup operation returned by the service.
     * @throws ClusterParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster parameter groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws ClusterParameterGroupAlreadyExistsException
     *         A cluster parameter group with the same name already exists.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterParameterGroup createClusterParameterGroup(CreateClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClusterParameterGroup(request);
    }

    @SdkInternalApi
    final ClusterParameterGroup executeCreateClusterParameterGroup(CreateClusterParameterGroupRequest createClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterParameterGroupRequest> request = null;
        Response<ClusterParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterParameterGroup> responseHandler = new StaxResponseHandler<ClusterParameterGroup>(
                    new ClusterParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Redshift security group. You use security groups to control access to non-VPC clusters.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSecurityGroupRequest
     * @return Result of the CreateClusterSecurityGroup operation returned by the service.
     * @throws ClusterSecurityGroupAlreadyExistsException
     *         A cluster security group with the same name already exists.
     * @throws ClusterSecurityGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster security groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterSecurityGroup createClusterSecurityGroup(CreateClusterSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClusterSecurityGroup(request);
    }

    @SdkInternalApi
    final ClusterSecurityGroup executeCreateClusterSecurityGroup(CreateClusterSecurityGroupRequest createClusterSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSecurityGroupRequest> request = null;
        Response<ClusterSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClusterSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterSecurityGroup> responseHandler = new StaxResponseHandler<ClusterSecurityGroup>(
                    new ClusterSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a manual snapshot of the specified cluster. The cluster must be in the <code>available</code> state.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSnapshotRequest
     * @return Result of the CreateClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.CreateClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Snapshot createClusterSnapshot(CreateClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClusterSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeCreateClusterSnapshot(CreateClusterSnapshotRequest createClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing
     * Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group.
     * </p>
     * <p>
     * For information about subnet groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html">Amazon Redshift
     * Cluster Subnet Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createClusterSubnetGroupRequest
     * @return Result of the CreateClusterSubnetGroup operation returned by the service.
     * @throws ClusterSubnetGroupAlreadyExistsException
     *         A <i>ClusterSubnetGroupName</i> is already used by an existing cluster subnet group.
     * @throws ClusterSubnetGroupQuotaExceededException
     *         The request would result in user exceeding the allowed number of cluster subnet groups. For information
     *         about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws ClusterSubnetQuotaExceededException
     *         The request would result in user exceeding the allowed number of subnets in a cluster subnet groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.CreateClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterSubnetGroup createClusterSubnetGroup(CreateClusterSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateClusterSubnetGroup(request);
    }

    @SdkInternalApi
    final ClusterSubnetGroup executeCreateClusterSubnetGroup(CreateClusterSubnetGroupRequest createClusterSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateClusterSubnetGroupRequest> request = null;
        Response<ClusterSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateClusterSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterSubnetGroup> responseHandler = new StaxResponseHandler<ClusterSubnetGroup>(new ClusterSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Redshift event notification subscription. This action requires an ARN (Amazon Resource Name) of
     * an Amazon SNS topic created by either the Amazon Redshift console, the Amazon SNS console, or the Amazon SNS API.
     * To obtain an ARN with Amazon SNS, you must create a topic in Amazon SNS and subscribe to the topic. The ARN is
     * displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the source type, and lists of Amazon Redshift source IDs, event categories, and event severities.
     * Notifications will be sent for all events you want that match those criteria. For example, you can specify source
     * type = cluster, source ID = my-cluster-1 and mycluster2, event categories = Availability, Backup, and severity =
     * ERROR. The subscription will only send notifications for those ERROR events in the Availability and Backup
     * categories for the specified clusters.
     * </p>
     * <p>
     * If you specify both the source type and source IDs, such as source type = cluster and source identifier =
     * my-cluster-1, notifications will be sent for all the cluster events for my-cluster-1. If you specify a source
     * type but do not specify a source identifier, you will receive notice of the events for the objects of that type
     * in your AWS account. If you do not specify either the SourceType nor the SourceIdentifier, you will be notified
     * of events generated from all Amazon Redshift sources belonging to your AWS account. You must specify a source
     * type if you specify a source ID.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         The request would exceed the allowed number of event subscriptions for this account. For information
     *         about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws SubscriptionAlreadyExistException
     *         There is already an existing event notification subscription with the specified name.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified Amazon SNS topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the specified Amazon SNS topic.
     * @throws SNSTopicArnNotFoundException
     *         An Amazon SNS topic with the specified Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionEventIdNotFoundException
     *         An Amazon Redshift event with the specified event ID does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The value specified for the event category was not one of the allowed values, or it specified a category
     *         that does not apply to the specified source type. The allowed values are Configuration, Management,
     *         Monitoring, and Security.
     * @throws SubscriptionSeverityNotFoundException
     *         The value specified for the event severity was not one of the allowed values, or it specified a severity
     *         that does not apply to the specified source type. The allowed values are ERROR and INFO.
     * @throws SourceNotFoundException
     *         The specified Amazon Redshift event source could not be found.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EventSubscription createEventSubscription(CreateEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventSubscription(request);
    }

    @SdkInternalApi
    final EventSubscription executeCreateEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(createEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EventSubscription> responseHandler = new StaxResponseHandler<EventSubscription>(new EventSubscriptionStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client's HSM in
     * order to store and retrieve the keys used to encrypt the cluster databases.
     * </p>
     * <p>
     * The command returns a public key, which you must store in the HSM. In addition to creating the HSM certificate,
     * you must create an Amazon Redshift HSM configuration that provides a cluster the information needed to store and
     * use encryption keys in the HSM. For more information, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware Security Modules</a> in
     * the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmClientCertificateRequest
     * @return Result of the CreateHsmClientCertificate operation returned by the service.
     * @throws HsmClientCertificateAlreadyExistsException
     *         There is already an existing Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmClientCertificateQuotaExceededException
     *         The quota for HSM client certificates has been reached. For information about increasing your quota, go
     *         to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in
     *         Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public HsmClientCertificate createHsmClientCertificate(CreateHsmClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHsmClientCertificate(request);
    }

    @SdkInternalApi
    final HsmClientCertificate executeCreateHsmClientCertificate(CreateHsmClientCertificateRequest createHsmClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(createHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmClientCertificateRequest> request = null;
        Response<HsmClientCertificate> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmClientCertificateRequestMarshaller().marshall(super.beforeMarshalling(createHsmClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHsmClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<HsmClientCertificate> responseHandler = new StaxResponseHandler<HsmClientCertificate>(
                    new HsmClientCertificateStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and
     * use database encryption keys in a Hardware Security Module (HSM). After creating the HSM configuration, you can
     * specify it as a parameter when creating a cluster. The cluster will then store its encryption keys in the HSM.
     * </p>
     * <p>
     * In addition to creating an HSM configuration, you must also create an HSM client certificate. For more
     * information, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-HSM.html">Hardware
     * Security Modules</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * 
     * @param createHsmConfigurationRequest
     * @return Result of the CreateHsmConfiguration operation returned by the service.
     * @throws HsmConfigurationAlreadyExistsException
     *         There is already an existing Amazon Redshift HSM configuration with the specified identifier.
     * @throws HsmConfigurationQuotaExceededException
     *         The quota for HSM configurations has been reached. For information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public HsmConfiguration createHsmConfiguration(CreateHsmConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateHsmConfiguration(request);
    }

    @SdkInternalApi
    final HsmConfiguration executeCreateHsmConfiguration(CreateHsmConfigurationRequest createHsmConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateHsmConfigurationRequest> request = null;
        Response<HsmConfiguration> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateHsmConfigurationRequestMarshaller().marshall(super.beforeMarshalling(createHsmConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateHsmConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<HsmConfiguration> responseHandler = new StaxResponseHandler<HsmConfiguration>(new HsmConfigurationStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot copy grant that permits Amazon Redshift to use a customer master key (CMK) from AWS Key
     * Management Service (AWS KMS) to encrypt copied snapshots in a destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param createSnapshotCopyGrantRequest
     *        The result of the <code>CreateSnapshotCopyGrant</code> action.
     * @return Result of the CreateSnapshotCopyGrant operation returned by the service.
     * @throws SnapshotCopyGrantAlreadyExistsException
     *         The snapshot copy grant can't be created because a grant with the same name already exists.
     * @throws SnapshotCopyGrantQuotaExceededException
     *         The AWS account has exceeded the maximum number of snapshot copy grants in this region.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.CreateSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SnapshotCopyGrant createSnapshotCopyGrant(CreateSnapshotCopyGrantRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshotCopyGrant(request);
    }

    @SdkInternalApi
    final SnapshotCopyGrant executeCreateSnapshotCopyGrant(CreateSnapshotCopyGrantRequest createSnapshotCopyGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotCopyGrantRequest> request = null;
        Response<SnapshotCopyGrant> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotCopyGrantRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotCopyGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshotCopyGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SnapshotCopyGrant> responseHandler = new StaxResponseHandler<SnapshotCopyGrant>(new SnapshotCopyGrantStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new snapshot schedule.
     * </p>
     * 
     * @param createSnapshotScheduleRequest
     * @return Result of the CreateSnapshotSchedule operation returned by the service.
     * @throws SnapshotScheduleAlreadyExistsException
     *         The specified snapshot schedule already exists.
     * @throws InvalidScheduleException
     *         The schedule you submitted isn't valid.
     * @throws SnapshotScheduleQuotaExceededException
     *         You have exceeded the quota of snapshot schedules.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws ScheduleDefinitionTypeUnsupportedException
     *         The definition you submitted is not supported.
     * @sample AmazonRedshift.CreateSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSnapshotScheduleResult createSnapshotSchedule(CreateSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshotSchedule(request);
    }

    @SdkInternalApi
    final CreateSnapshotScheduleResult executeCreateSnapshotSchedule(CreateSnapshotScheduleRequest createSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotScheduleRequest> request = null;
        Response<CreateSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotScheduleRequestMarshaller().marshall(super.beforeMarshalling(createSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateSnapshotScheduleResult> responseHandler = new StaxResponseHandler<CreateSnapshotScheduleResult>(
                    new CreateSnapshotScheduleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, you will receive an
     * error and the attempt will fail.
     * </p>
     * <p>
     * If you specify a key that already exists for the resource, the value for that key will be updated with the new
     * value.
     * </p>
     * 
     * @param createTagsRequest
     *        Contains the output from the <code>CreateTags</code> action.
     * @return Result of the CreateTags operation returned by the service.
     * @throws TagLimitExceededException
     *         You have exceeded the number of tags allowed.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.CreateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTags(request);
    }

    @SdkInternalApi
    final CreateTagsResult executeCreateTags(CreateTagsRequest createTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestMarshaller().marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateTagsResult> responseHandler = new StaxResponseHandler<CreateTagsResult>(new CreateTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request
     * was received correctly. Use <a>DescribeClusters</a> to monitor the status of the deletion. The delete operation
     * cannot be canceled or reverted once submitted. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you want to shut down the cluster and retain it for future use, set <i>SkipFinalClusterSnapshot</i> to
     * <code>false</code> and specify a name for <i>FinalClusterSnapshotIdentifier</i>. You can later restore this
     * snapshot to resume using the cluster. If a final cluster snapshot is requested, the status of the cluster will be
     * "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon Redshift begins deleting the
     * cluster.
     * </p>
     * <p>
     * For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterSnapshotAlreadyExistsException
     *         The value specified as a snapshot identifier is already used by an existing snapshot.
     * @throws ClusterSnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of cluster snapshots.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Cluster deleteCluster(DeleteClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCluster(request);
    }

    @SdkInternalApi
    final Cluster executeDeleteCluster(DeleteClusterRequest deleteClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified Amazon Redshift parameter group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a parameter group if it is associated with a cluster.
     * </p>
     * </note>
     * 
     * @param deleteClusterParameterGroupRequest
     * @return Result of the DeleteClusterParameterGroup operation returned by the service.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.DeleteClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteClusterParameterGroupResult deleteClusterParameterGroup(DeleteClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClusterParameterGroup(request);
    }

    @SdkInternalApi
    final DeleteClusterParameterGroupResult executeDeleteClusterParameterGroup(DeleteClusterParameterGroupRequest deleteClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterParameterGroupRequest> request = null;
        Response<DeleteClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteClusterParameterGroupResult> responseHandler = new StaxResponseHandler<DeleteClusterParameterGroupResult>(
                    new DeleteClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Redshift security group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a security group that is associated with any clusters. You cannot delete the default security
     * group.
     * </p>
     * </note>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param deleteClusterSecurityGroupRequest
     * @return Result of the DeleteClusterSecurityGroup operation returned by the service.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @sample AmazonRedshift.DeleteClusterSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteClusterSecurityGroupResult deleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClusterSecurityGroup(request);
    }

    @SdkInternalApi
    final DeleteClusterSecurityGroupResult executeDeleteClusterSecurityGroup(DeleteClusterSecurityGroupRequest deleteClusterSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSecurityGroupRequest> request = null;
        Response<DeleteClusterSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClusterSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteClusterSecurityGroupResult> responseHandler = new StaxResponseHandler<DeleteClusterSecurityGroupResult>(
                    new DeleteClusterSecurityGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified manual snapshot. The snapshot must be in the <code>available</code> state, with no other
     * users authorized to access the snapshot.
     * </p>
     * <p>
     * Unlike automated snapshots, manual snapshots are retained even after you delete your cluster. Amazon Redshift
     * does not delete your manual snapshots. You must delete manual snapshot explicitly to avoid getting charged. If
     * other accounts are authorized to access the snapshot, you must revoke all of the authorizations before you can
     * delete the snapshot.
     * </p>
     * 
     * @param deleteClusterSnapshotRequest
     * @return Result of the DeleteClusterSnapshot operation returned by the service.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @sample AmazonRedshift.DeleteClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Snapshot deleteClusterSnapshot(DeleteClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClusterSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeDeleteClusterSnapshot(DeleteClusterSnapshotRequest deleteClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified cluster subnet group.
     * </p>
     * 
     * @param deleteClusterSubnetGroupRequest
     * @return Result of the DeleteClusterSubnetGroup operation returned by the service.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidClusterSubnetStateException
     *         The state of the subnet is invalid.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @sample AmazonRedshift.DeleteClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteClusterSubnetGroupResult deleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteClusterSubnetGroup(request);
    }

    @SdkInternalApi
    final DeleteClusterSubnetGroupResult executeDeleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest deleteClusterSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteClusterSubnetGroupRequest> request = null;
        Response<DeleteClusterSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteClusterSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteClusterSubnetGroupResult> responseHandler = new StaxResponseHandler<DeleteClusterSubnetGroupResult>(
                    new DeleteClusterSubnetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws InvalidSubscriptionStateException
     *         The subscription request is invalid because it is a duplicate request. This subscription request is
     *         already in progress.
     * @sample AmazonRedshift.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEventSubscriptionResult deleteEventSubscription(DeleteEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventSubscription(request);
    }

    @SdkInternalApi
    final DeleteEventSubscriptionResult executeDeleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<DeleteEventSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(deleteEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteEventSubscriptionResult> responseHandler = new StaxResponseHandler<DeleteEventSubscriptionResult>(
                    new DeleteEventSubscriptionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified HSM client certificate.
     * </p>
     * 
     * @param deleteHsmClientCertificateRequest
     * @return Result of the DeleteHsmClientCertificate operation returned by the service.
     * @throws InvalidHsmClientCertificateStateException
     *         The specified HSM client certificate is not in the <code>available</code> state, or it is still in use by
     *         one or more Amazon Redshift clusters.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @sample AmazonRedshift.DeleteHsmClientCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmClientCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteHsmClientCertificateResult deleteHsmClientCertificate(DeleteHsmClientCertificateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHsmClientCertificate(request);
    }

    @SdkInternalApi
    final DeleteHsmClientCertificateResult executeDeleteHsmClientCertificate(DeleteHsmClientCertificateRequest deleteHsmClientCertificateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHsmClientCertificateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmClientCertificateRequest> request = null;
        Response<DeleteHsmClientCertificateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmClientCertificateRequestMarshaller().marshall(super.beforeMarshalling(deleteHsmClientCertificateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHsmClientCertificate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteHsmClientCertificateResult> responseHandler = new StaxResponseHandler<DeleteHsmClientCertificateResult>(
                    new DeleteHsmClientCertificateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param deleteHsmConfigurationRequest
     * @return Result of the DeleteHsmConfiguration operation returned by the service.
     * @throws InvalidHsmConfigurationStateException
     *         The specified HSM configuration is not in the <code>available</code> state, or it is still in use by one
     *         or more Amazon Redshift clusters.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @sample AmazonRedshift.DeleteHsmConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteHsmConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteHsmConfigurationResult deleteHsmConfiguration(DeleteHsmConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteHsmConfiguration(request);
    }

    @SdkInternalApi
    final DeleteHsmConfigurationResult executeDeleteHsmConfiguration(DeleteHsmConfigurationRequest deleteHsmConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteHsmConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteHsmConfigurationRequest> request = null;
        Response<DeleteHsmConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteHsmConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteHsmConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteHsmConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteHsmConfigurationResult> responseHandler = new StaxResponseHandler<DeleteHsmConfigurationResult>(
                    new DeleteHsmConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified snapshot copy grant.
     * </p>
     * 
     * @param deleteSnapshotCopyGrantRequest
     *        The result of the <code>DeleteSnapshotCopyGrant</code> action.
     * @return Result of the DeleteSnapshotCopyGrant operation returned by the service.
     * @throws InvalidSnapshotCopyGrantStateException
     *         The snapshot copy grant can't be deleted because it is used by one or more clusters.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @sample AmazonRedshift.DeleteSnapshotCopyGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotCopyGrant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSnapshotCopyGrantResult deleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshotCopyGrant(request);
    }

    @SdkInternalApi
    final DeleteSnapshotCopyGrantResult executeDeleteSnapshotCopyGrant(DeleteSnapshotCopyGrantRequest deleteSnapshotCopyGrantRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotCopyGrantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotCopyGrantRequest> request = null;
        Response<DeleteSnapshotCopyGrantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotCopyGrantRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotCopyGrantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshotCopyGrant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSnapshotCopyGrantResult> responseHandler = new StaxResponseHandler<DeleteSnapshotCopyGrantResult>(
                    new DeleteSnapshotCopyGrantResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a snapshot schedule.
     * </p>
     * 
     * @param deleteSnapshotScheduleRequest
     * @return Result of the DeleteSnapshotSchedule operation returned by the service.
     * @throws InvalidClusterSnapshotScheduleStateException
     *         The cluster snapshot schedule state is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @sample AmazonRedshift.DeleteSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSnapshotScheduleResult deleteSnapshotSchedule(DeleteSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshotSchedule(request);
    }

    @SdkInternalApi
    final DeleteSnapshotScheduleResult executeDeleteSnapshotSchedule(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotScheduleRequest> request = null;
        Response<DeleteSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotScheduleRequestMarshaller().marshall(super.beforeMarshalling(deleteSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteSnapshotScheduleResult> responseHandler = new StaxResponseHandler<DeleteSnapshotScheduleResult>(
                    new DeleteSnapshotScheduleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a tag or tags from a resource. You must provide the ARN of the resource from which you want to delete the
     * tag or tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the output from the <code>DeleteTags</code> action.
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTagsResult> responseHandler = new StaxResponseHandler<DeleteTagsResult>(new DeleteTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of attributes attached to an account
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRedshift.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAttributes(request);
    }

    @SdkInternalApi
    final DescribeAccountAttributesResult executeDescribeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestMarshaller().marshall(super.beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAccountAttributesResult> responseHandler = new StaxResponseHandler<DescribeAccountAttributesResult>(
                    new DescribeAccountAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of <code>ClusterDbRevision</code> objects.
     * </p>
     * 
     * @param describeClusterDbRevisionsRequest
     * @return Result of the DescribeClusterDbRevisions operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @sample AmazonRedshift.DescribeClusterDbRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterDbRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterDbRevisionsResult describeClusterDbRevisions(DescribeClusterDbRevisionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterDbRevisions(request);
    }

    @SdkInternalApi
    final DescribeClusterDbRevisionsResult executeDescribeClusterDbRevisions(DescribeClusterDbRevisionsRequest describeClusterDbRevisionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterDbRevisionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterDbRevisionsRequest> request = null;
        Response<DescribeClusterDbRevisionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterDbRevisionsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterDbRevisionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterDbRevisions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterDbRevisionsResult> responseHandler = new StaxResponseHandler<DescribeClusterDbRevisionsResult>(
                    new DescribeClusterDbRevisionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Amazon Redshift parameter groups, including parameter groups you created and the default
     * parameter group. For each parameter group, the response includes the parameter group name, description, and
     * parameter group family name. You can optionally specify a name to retrieve the description of a specific
     * parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all parameter groups
     * that match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all parameter
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, parameter groups are returned regardless of whether
     * they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterParameterGroupsRequest
     * @return Result of the DescribeClusterParameterGroups operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups(DescribeClusterParameterGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterParameterGroups(request);
    }

    @SdkInternalApi
    final DescribeClusterParameterGroupsResult executeDescribeClusterParameterGroups(DescribeClusterParameterGroupsRequest describeClusterParameterGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParameterGroupsRequest> request = null;
        Response<DescribeClusterParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterParameterGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterParameterGroupsResult> responseHandler = new StaxResponseHandler<DescribeClusterParameterGroupsResult>(
                    new DescribeClusterParameterGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClusterParameterGroupsResult describeClusterParameterGroups() {
        return describeClusterParameterGroups(new DescribeClusterParameterGroupsRequest());
    }

    /**
     * <p>
     * Returns a detailed list of parameters contained within the specified Amazon Redshift parameter group. For each
     * parameter the response includes information such as parameter name, description, data type, value, whether the
     * parameter value is modifiable, and so on.
     * </p>
     * <p>
     * You can specify <i>source</i> filter to retrieve parameters of only specific type. For example, to retrieve
     * parameters that were modified by a user action such as from <a>ModifyClusterParameterGroup</a>, you can specify
     * <i>source</i> equal to <i>user</i>.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterParametersRequest
     * @return Result of the DescribeClusterParameters operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.DescribeClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterParametersResult describeClusterParameters(DescribeClusterParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterParameters(request);
    }

    @SdkInternalApi
    final DescribeClusterParametersResult executeDescribeClusterParameters(DescribeClusterParametersRequest describeClusterParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterParametersRequest> request = null;
        Response<DescribeClusterParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterParametersRequestMarshaller().marshall(super.beforeMarshalling(describeClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterParametersResult> responseHandler = new StaxResponseHandler<DescribeClusterParametersResult>(
                    new DescribeClusterParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about Amazon Redshift security groups. If the name of a security group is specified, the
     * response will contain only information about only that security group.
     * </p>
     * <p>
     * For information about managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all security groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all security
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, security groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSecurityGroupsRequest
     * @return Result of the DescribeClusterSecurityGroups operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterSecurityGroups(request);
    }

    @SdkInternalApi
    final DescribeClusterSecurityGroupsResult executeDescribeClusterSecurityGroups(DescribeClusterSecurityGroupsRequest describeClusterSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSecurityGroupsRequest> request = null;
        Response<DescribeClusterSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterSecurityGroupsResult> responseHandler = new StaxResponseHandler<DescribeClusterSecurityGroupsResult>(
                    new DescribeClusterSecurityGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClusterSecurityGroupsResult describeClusterSecurityGroups() {
        return describeClusterSecurityGroups(new DescribeClusterSecurityGroupsRequest());
    }

    /**
     * <p>
     * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this
     * operation returns information about all snapshots of all clusters that are owned by you AWS customer account. No
     * information is returned for snapshots owned by inactive AWS customer accounts.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all snapshots that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all snapshots
     * that have any combination of those values are returned. Only snapshots that you own are returned in the response;
     * shared snapshots are not returned with the tag key and tag value request parameters.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, snapshots are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSnapshotsRequest
     * @return Result of the DescribeClusterSnapshots operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterSnapshotsResult describeClusterSnapshots(DescribeClusterSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterSnapshots(request);
    }

    @SdkInternalApi
    final DescribeClusterSnapshotsResult executeDescribeClusterSnapshots(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSnapshotsRequest> request = null;
        Response<DescribeClusterSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterSnapshotsResult> responseHandler = new StaxResponseHandler<DescribeClusterSnapshotsResult>(
                    new DescribeClusterSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClusterSnapshotsResult describeClusterSnapshots() {
        return describeClusterSnapshots(new DescribeClusterSnapshotsRequest());
    }

    /**
     * <p>
     * Returns one or more cluster subnet group objects, which contain metadata about your cluster subnet groups. By
     * default, this operation returns information about all cluster subnet groups that are defined in you AWS account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all subnet groups that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all subnet
     * groups that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subnet groups are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeClusterSubnetGroupsRequest
     * @return Result of the DescribeClusterSubnetGroups operation returned by the service.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusterSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterSubnetGroups(request);
    }

    @SdkInternalApi
    final DescribeClusterSubnetGroupsResult executeDescribeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest describeClusterSubnetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterSubnetGroupsRequest> request = null;
        Response<DescribeClusterSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterSubnetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterSubnetGroupsResult> responseHandler = new StaxResponseHandler<DescribeClusterSubnetGroupsResult>(
                    new DescribeClusterSubnetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClusterSubnetGroupsResult describeClusterSubnetGroups() {
        return describeClusterSubnetGroups(new DescribeClusterSubnetGroupsRequest());
    }

    /**
     * <p>
     * Returns a list of all the available maintenance tracks.
     * </p>
     * 
     * @param describeClusterTracksRequest
     * @return Result of the DescribeClusterTracks operation returned by the service.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @sample AmazonRedshift.DescribeClusterTracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterTracks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeClusterTracksResult describeClusterTracks(DescribeClusterTracksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterTracks(request);
    }

    @SdkInternalApi
    final DescribeClusterTracksResult executeDescribeClusterTracks(DescribeClusterTracksRequest describeClusterTracksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterTracksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterTracksRequest> request = null;
        Response<DescribeClusterTracksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterTracksRequestMarshaller().marshall(super.beforeMarshalling(describeClusterTracksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterTracks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterTracksResult> responseHandler = new StaxResponseHandler<DescribeClusterTracksResult>(
                    new DescribeClusterTracksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions of the available Amazon Redshift cluster versions. You can call this operation even before
     * creating any clusters to learn more about the Amazon Redshift versions. For more information about managing
     * clusters, go to <a href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon
     * Redshift Clusters</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeClusterVersionsRequest
     * @return Result of the DescribeClusterVersions operation returned by the service.
     * @sample AmazonRedshift.DescribeClusterVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusterVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeClusterVersionsResult describeClusterVersions(DescribeClusterVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusterVersions(request);
    }

    @SdkInternalApi
    final DescribeClusterVersionsResult executeDescribeClusterVersions(DescribeClusterVersionsRequest describeClusterVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClusterVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClusterVersionsRequest> request = null;
        Response<DescribeClusterVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClusterVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeClusterVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusterVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClusterVersionsResult> responseHandler = new StaxResponseHandler<DescribeClusterVersionsResult>(
                    new DescribeClusterVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClusterVersionsResult describeClusterVersions() {
        return describeClusterVersions(new DescribeClusterVersionsRequest());
    }

    /**
     * <p>
     * Returns properties of provisioned clusters including general cluster properties, cluster database properties,
     * maintenance and backup properties, and security and access properties. This operation supports pagination. For
     * more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all clusters that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all clusters
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, clusters are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeClustersResult describeClusters(DescribeClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeClusters(request);
    }

    @SdkInternalApi
    final DescribeClustersResult executeDescribeClusters(DescribeClustersRequest describeClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeClustersRequest> request = null;
        Response<DescribeClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeClustersRequestMarshaller().marshall(super.beforeMarshalling(describeClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeClustersResult> responseHandler = new StaxResponseHandler<DescribeClustersResult>(
                    new DescribeClustersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeClustersResult describeClusters() {
        return describeClusters(new DescribeClustersRequest());
    }

    /**
     * <p>
     * Returns a list of parameter settings for the specified parameter group family.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeDefaultClusterParametersRequest
     * @return Result of the DescribeDefaultClusterParameters operation returned by the service.
     * @sample AmazonRedshift.DescribeDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DefaultClusterParameters describeDefaultClusterParameters(DescribeDefaultClusterParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDefaultClusterParameters(request);
    }

    @SdkInternalApi
    final DefaultClusterParameters executeDescribeDefaultClusterParameters(DescribeDefaultClusterParametersRequest describeDefaultClusterParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDefaultClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDefaultClusterParametersRequest> request = null;
        Response<DefaultClusterParameters> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDefaultClusterParametersRequestMarshaller().marshall(super.beforeMarshalling(describeDefaultClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDefaultClusterParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DefaultClusterParameters> responseHandler = new StaxResponseHandler<DefaultClusterParameters>(
                    new DefaultClusterParametersStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays a list of event categories for all event source types, or for a specified source type. For a list of the
     * event categories and source types, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html">Amazon Redshift
     * Event Notifications</a>.
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRedshift.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventCategories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventCategories(request);
    }

    @SdkInternalApi
    final DescribeEventCategoriesResult executeDescribeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventCategoriesRequest> request = null;
        Response<DescribeEventCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventCategoriesRequestMarshaller().marshall(super.beforeMarshalling(describeEventCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventCategories");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventCategoriesResult> responseHandler = new StaxResponseHandler<DescribeEventCategoriesResult>(
                    new DescribeEventCategoriesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories() {
        return describeEventCategories(new DescribeEventCategoriesRequest());
    }

    /**
     * <p>
     * Lists descriptions of all the Amazon Redshift event notification subscriptions for a customer account. If you
     * specify a subscription name, lists the description for that subscription.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all event notification
     * subscriptions that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all subscriptions that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, subscriptions are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventSubscriptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventSubscriptions(request);
    }

    @SdkInternalApi
    final DescribeEventSubscriptionsResult executeDescribeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventSubscriptionsRequest> request = null;
        Response<DescribeEventSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventSubscriptionsRequestMarshaller().marshall(super.beforeMarshalling(describeEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventSubscriptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventSubscriptionsResult> responseHandler = new StaxResponseHandler<DescribeEventSubscriptionsResult>(
                    new DescribeEventSubscriptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventSubscriptionsResult describeEventSubscriptions() {
        return describeEventSubscriptions(new DescribeEventSubscriptionsRequest());
    }

    /**
     * <p>
     * Returns events related to clusters, security groups, snapshots, and parameter groups for the past 14 days. Events
     * specific to a particular cluster, security group, snapshot or parameter group can be obtained by providing the
     * name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonRedshift.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventsResult> responseHandler = new StaxResponseHandler<DescribeEventsResult>(
                    new DescribeEventsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    /**
     * <p>
     * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns
     * information about all the HSM certificates owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM client
     * certificates that match any combination of the specified keys and values. For example, if you have
     * <code>owner</code> and <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for
     * tag values, all HSM client certificates that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM client certificates are returned regardless of
     * whether they have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmClientCertificatesRequest
     * @return Result of the DescribeHsmClientCertificates operation returned by the service.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeHsmClientCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmClientCertificates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates(DescribeHsmClientCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHsmClientCertificates(request);
    }

    @SdkInternalApi
    final DescribeHsmClientCertificatesResult executeDescribeHsmClientCertificates(DescribeHsmClientCertificatesRequest describeHsmClientCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHsmClientCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmClientCertificatesRequest> request = null;
        Response<DescribeHsmClientCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmClientCertificatesRequestMarshaller().marshall(super.beforeMarshalling(describeHsmClientCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHsmClientCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeHsmClientCertificatesResult> responseHandler = new StaxResponseHandler<DescribeHsmClientCertificatesResult>(
                    new DescribeHsmClientCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeHsmClientCertificatesResult describeHsmClientCertificates() {
        return describeHsmClientCertificates(new DescribeHsmClientCertificatesRequest());
    }

    /**
     * <p>
     * Returns information about the specified Amazon Redshift HSM configuration. If no configuration ID is specified,
     * returns information about all the HSM configurations owned by your AWS customer account.
     * </p>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all HSM connections that
     * match any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all HSM
     * connections that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, HSM connections are returned regardless of whether they
     * have tag keys or values associated with them.
     * </p>
     * 
     * @param describeHsmConfigurationsRequest
     * @return Result of the DescribeHsmConfigurations operation returned by the service.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeHsmConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeHsmConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHsmConfigurationsResult describeHsmConfigurations(DescribeHsmConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHsmConfigurations(request);
    }

    @SdkInternalApi
    final DescribeHsmConfigurationsResult executeDescribeHsmConfigurations(DescribeHsmConfigurationsRequest describeHsmConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHsmConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHsmConfigurationsRequest> request = null;
        Response<DescribeHsmConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHsmConfigurationsRequestMarshaller().marshall(super.beforeMarshalling(describeHsmConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHsmConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeHsmConfigurationsResult> responseHandler = new StaxResponseHandler<DescribeHsmConfigurationsResult>(
                    new DescribeHsmConfigurationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeHsmConfigurationsResult describeHsmConfigurations() {
        return describeHsmConfigurations(new DescribeHsmConfigurationsRequest());
    }

    /**
     * <p>
     * Describes whether information, such as queries and connection attempts, is being logged for the specified Amazon
     * Redshift cluster.
     * </p>
     * 
     * @param describeLoggingStatusRequest
     * @return Result of the DescribeLoggingStatus operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DescribeLoggingStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeLoggingStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeLoggingStatusResult describeLoggingStatus(DescribeLoggingStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingStatus(request);
    }

    @SdkInternalApi
    final DescribeLoggingStatusResult executeDescribeLoggingStatus(DescribeLoggingStatusRequest describeLoggingStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingStatusRequest> request = null;
        Response<DescribeLoggingStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingStatusRequestMarshaller().marshall(super.beforeMarshalling(describeLoggingStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoggingStatusResult> responseHandler = new StaxResponseHandler<DescribeLoggingStatusResult>(
                    new DescribeLoggingStatusResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of orderable cluster options. Before you create a new cluster you can use this operation to find
     * what options are available, such as the EC2 Availability Zones (AZ) in the specific AWS Region that you can
     * specify, and the node types you can request. The node types differ by available storage, memory, CPU and price.
     * With the cost involved you might want to obtain a list of cluster options in the specific region and specify
     * values when creating a cluster. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeOrderableClusterOptionsRequest
     * @return Result of the DescribeOrderableClusterOptions operation returned by the service.
     * @sample AmazonRedshift.DescribeOrderableClusterOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeOrderableClusterOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions(DescribeOrderableClusterOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrderableClusterOptions(request);
    }

    @SdkInternalApi
    final DescribeOrderableClusterOptionsResult executeDescribeOrderableClusterOptions(
            DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrderableClusterOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableClusterOptionsRequest> request = null;
        Response<DescribeOrderableClusterOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableClusterOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeOrderableClusterOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrderableClusterOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeOrderableClusterOptionsResult> responseHandler = new StaxResponseHandler<DescribeOrderableClusterOptionsResult>(
                    new DescribeOrderableClusterOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeOrderableClusterOptionsResult describeOrderableClusterOptions() {
        return describeOrderableClusterOptions(new DescribeOrderableClusterOptionsRequest());
    }

    /**
     * <p>
     * Returns a list of the available reserved node offerings by Amazon Redshift with their descriptions including the
     * node type, the fixed and recurring costs of reserving the node and duration the node will be reserved for you.
     * These descriptions help you determine which reserve node offering you want to purchase. You then use the unique
     * offering ID in you call to <a>PurchaseReservedNodeOffering</a> to reserve one or more nodes for your Amazon
     * Redshift cluster.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeReservedNodeOfferingsRequest
     * @return Result of the DescribeReservedNodeOfferings operation returned by the service.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.DescribeReservedNodeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedNodeOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedNodeOfferingsResult executeDescribeReservedNodeOfferings(DescribeReservedNodeOfferingsRequest describeReservedNodeOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedNodeOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodeOfferingsRequest> request = null;
        Response<DescribeReservedNodeOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodeOfferingsRequestMarshaller().marshall(super.beforeMarshalling(describeReservedNodeOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedNodeOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedNodeOfferingsResult> responseHandler = new StaxResponseHandler<DescribeReservedNodeOfferingsResult>(
                    new DescribeReservedNodeOfferingsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedNodeOfferingsResult describeReservedNodeOfferings() {
        return describeReservedNodeOfferings(new DescribeReservedNodeOfferingsRequest());
    }

    /**
     * <p>
     * Returns the descriptions of the reserved nodes.
     * </p>
     * 
     * @param describeReservedNodesRequest
     * @return Result of the DescribeReservedNodes operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.DescribeReservedNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodes" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeReservedNodesResult describeReservedNodes(DescribeReservedNodesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedNodes(request);
    }

    @SdkInternalApi
    final DescribeReservedNodesResult executeDescribeReservedNodes(DescribeReservedNodesRequest describeReservedNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedNodesRequest> request = null;
        Response<DescribeReservedNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedNodesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedNodesResult> responseHandler = new StaxResponseHandler<DescribeReservedNodesResult>(
                    new DescribeReservedNodesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedNodesResult describeReservedNodes() {
        return describeReservedNodes(new DescribeReservedNodesRequest());
    }

    /**
     * <p>
     * Returns information about the last resize operation for the specified cluster. If no resize operation has ever
     * been initiated for the specified cluster, a <code>HTTP 404</code> error is returned. If a resize operation was
     * initiated and completed, the status of the resize remains as <code>SUCCEEDED</code> until the next resize.
     * </p>
     * <p>
     * A resize operation can be requested using <a>ModifyCluster</a> and specifying a different number or type of nodes
     * for the cluster.
     * </p>
     * 
     * @param describeResizeRequest
     * @return Result of the DescribeResize operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ResizeNotFoundException
     *         A resize operation for the specified cluster is not found.
     * @sample AmazonRedshift.DescribeResize
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeResize" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeResizeResult describeResize(DescribeResizeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResize(request);
    }

    @SdkInternalApi
    final DescribeResizeResult executeDescribeResize(DescribeResizeRequest describeResizeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResizeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResizeRequest> request = null;
        Response<DescribeResizeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResizeRequestMarshaller().marshall(super.beforeMarshalling(describeResizeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResize");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeResizeResult> responseHandler = new StaxResponseHandler<DescribeResizeResult>(
                    new DescribeResizeResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of snapshot copy grants owned by the AWS account in the destination region.
     * </p>
     * <p>
     * For more information about managing snapshot copy grants, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-db-encryption.html">Amazon Redshift Database
     * Encryption</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param describeSnapshotCopyGrantsRequest
     *        The result of the <code>DescribeSnapshotCopyGrants</code> action.
     * @return Result of the DescribeSnapshotCopyGrants operation returned by the service.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeSnapshotCopyGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotCopyGrants"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshotCopyGrants(request);
    }

    @SdkInternalApi
    final DescribeSnapshotCopyGrantsResult executeDescribeSnapshotCopyGrants(DescribeSnapshotCopyGrantsRequest describeSnapshotCopyGrantsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotCopyGrantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotCopyGrantsRequest> request = null;
        Response<DescribeSnapshotCopyGrantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotCopyGrantsRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotCopyGrantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshotCopyGrants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSnapshotCopyGrantsResult> responseHandler = new StaxResponseHandler<DescribeSnapshotCopyGrantsResult>(
                    new DescribeSnapshotCopyGrantsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSnapshotCopyGrantsResult describeSnapshotCopyGrants() {
        return describeSnapshotCopyGrants(new DescribeSnapshotCopyGrantsRequest());
    }

    /**
     * <p>
     * Returns a list of snapshot schedules.
     * </p>
     * 
     * @param describeSnapshotSchedulesRequest
     * @return Result of the DescribeSnapshotSchedules operation returned by the service.
     * @sample AmazonRedshift.DescribeSnapshotSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSnapshotSchedulesResult describeSnapshotSchedules(DescribeSnapshotSchedulesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshotSchedules(request);
    }

    @SdkInternalApi
    final DescribeSnapshotSchedulesResult executeDescribeSnapshotSchedules(DescribeSnapshotSchedulesRequest describeSnapshotSchedulesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotSchedulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotSchedulesRequest> request = null;
        Response<DescribeSnapshotSchedulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotSchedulesRequestMarshaller().marshall(super.beforeMarshalling(describeSnapshotSchedulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshotSchedules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSnapshotSchedulesResult> responseHandler = new StaxResponseHandler<DescribeSnapshotSchedulesResult>(
                    new DescribeSnapshotSchedulesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the total amount of snapshot usage and provisioned storage for a user in megabytes.
     * </p>
     * 
     * @param describeStorageRequest
     * @return Result of the DescribeStorage operation returned by the service.
     * @sample AmazonRedshift.DescribeStorage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeStorage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeStorageResult describeStorage(DescribeStorageRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStorage(request);
    }

    @SdkInternalApi
    final DescribeStorageResult executeDescribeStorage(DescribeStorageRequest describeStorageRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStorageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorageRequest> request = null;
        Response<DescribeStorageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorageRequestMarshaller().marshall(super.beforeMarshalling(describeStorageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStorage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStorageResult> responseHandler = new StaxResponseHandler<DescribeStorageResult>(
                    new DescribeStorageResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the status of one or more table restore requests made using the <a>RestoreTableFromClusterSnapshot</a> API
     * action. If you don't specify a value for the <code>TableRestoreRequestId</code> parameter, then
     * <code>DescribeTableRestoreStatus</code> returns the status of all table restore requests ordered by the date and
     * time of the request in ascending order. Otherwise <code>DescribeTableRestoreStatus</code> returns the status of
     * the table specified by <code>TableRestoreRequestId</code>.
     * </p>
     * 
     * @param describeTableRestoreStatusRequest
     * @return Result of the DescribeTableRestoreStatus operation returned by the service.
     * @throws TableRestoreNotFoundException
     *         The specified <code>TableRestoreRequestId</code> value was not found.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DescribeTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTableRestoreStatusResult describeTableRestoreStatus(DescribeTableRestoreStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTableRestoreStatus(request);
    }

    @SdkInternalApi
    final DescribeTableRestoreStatusResult executeDescribeTableRestoreStatus(DescribeTableRestoreStatusRequest describeTableRestoreStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTableRestoreStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRestoreStatusRequest> request = null;
        Response<DescribeTableRestoreStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRestoreStatusRequestMarshaller().marshall(super.beforeMarshalling(describeTableRestoreStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTableRestoreStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTableRestoreStatusResult> responseHandler = new StaxResponseHandler<DescribeTableRestoreStatusResult>(
                    new DescribeTableRestoreStatusResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTableRestoreStatusResult describeTableRestoreStatus() {
        return describeTableRestoreStatus(new DescribeTableRestoreStatusRequest());
    }

    /**
     * <p>
     * Returns a list of tags. You can return tags from a specific resource by specifying an ARN, or you can return all
     * tags for a given type of resource, such as clusters, snapshots, and so on.
     * </p>
     * <p>
     * The following are limitations for <code>DescribeTags</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot specify an ARN and a resource-type value together in the same request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use the <code>MaxRecords</code> and <code>Marker</code> parameters together with the ARN parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxRecords</code> parameter can be a range from 10 to 50 results to return in a request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify both tag keys and tag values in the same request, Amazon Redshift returns all resources that match
     * any combination of the specified keys and values. For example, if you have <code>owner</code> and
     * <code>environment</code> for tag keys, and <code>admin</code> and <code>test</code> for tag values, all resources
     * that have any combination of those values are returned.
     * </p>
     * <p>
     * If both tag keys and values are omitted from the request, resources are returned regardless of whether they have
     * tag keys or values associated with them.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidTagException
     *         The tag is invalid.
     * @sample AmazonRedshift.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTagsResult> responseHandler = new StaxResponseHandler<DescribeTagsResult>(new DescribeTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTagsResult describeTags() {
        return describeTags(new DescribeTagsRequest());
    }

    /**
     * <p>
     * Stops logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param disableLoggingRequest
     * @return Result of the DisableLogging operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.DisableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DisableLoggingResult disableLogging(DisableLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeDisableLogging(request);
    }

    @SdkInternalApi
    final DisableLoggingResult executeDisableLogging(DisableLoggingRequest disableLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(disableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableLoggingRequest> request = null;
        Response<DisableLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableLoggingRequestMarshaller().marshall(super.beforeMarshalling(disableLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisableLoggingResult> responseHandler = new StaxResponseHandler<DisableLoggingResult>(
                    new DisableLoggingResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the automatic copying of snapshots from one region to another region for a specified cluster.
     * </p>
     * <p>
     * If your cluster and its snapshots are encrypted using a customer master key (CMK) from AWS KMS, use
     * <a>DeleteSnapshotCopyGrant</a> to delete the grant that grants Amazon Redshift permission to the CMK in the
     * destination region.
     * </p>
     * 
     * @param disableSnapshotCopyRequest
     * @return Result of the DisableSnapshotCopy operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotCopyAlreadyDisabledException
     *         The cluster already has cross-region snapshot copy disabled.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @sample AmazonRedshift.DisableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DisableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Cluster disableSnapshotCopy(DisableSnapshotCopyRequest request) {
        request = beforeClientExecution(request);
        return executeDisableSnapshotCopy(request);
    }

    @SdkInternalApi
    final Cluster executeDisableSnapshotCopy(DisableSnapshotCopyRequest disableSnapshotCopyRequest) {

        ExecutionContext executionContext = createExecutionContext(disableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSnapshotCopyRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSnapshotCopyRequestMarshaller().marshall(super.beforeMarshalling(disableSnapshotCopyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableSnapshotCopy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts logging information, such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * </p>
     * 
     * @param enableLoggingRequest
     * @return Result of the EnableLogging operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws BucketNotFoundException
     *         Could not find the specified S3 bucket.
     * @throws InsufficientS3BucketPolicyException
     *         The cluster does not have read bucket or put object permissions on the S3 bucket specified when enabling
     *         logging.
     * @throws InvalidS3KeyPrefixException
     *         The string specified for the logging S3 key prefix does not comply with the documented constraints.
     * @throws InvalidS3BucketNameException
     *         The S3 bucket name is invalid. For more information about naming rules, go to <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html">Bucket Restrictions and
     *         Limitations</a> in the Amazon Simple Storage Service (S3) Developer Guide.
     * @sample AmazonRedshift.EnableLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableLogging" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnableLoggingResult enableLogging(EnableLoggingRequest request) {
        request = beforeClientExecution(request);
        return executeEnableLogging(request);
    }

    @SdkInternalApi
    final EnableLoggingResult executeEnableLogging(EnableLoggingRequest enableLoggingRequest) {

        ExecutionContext executionContext = createExecutionContext(enableLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableLoggingRequest> request = null;
        Response<EnableLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableLoggingRequestMarshaller().marshall(super.beforeMarshalling(enableLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableLogging");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnableLoggingResult> responseHandler = new StaxResponseHandler<EnableLoggingResult>(new EnableLoggingResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
     * </p>
     * 
     * @param enableSnapshotCopyRequest
     * @return Result of the EnableSnapshotCopy operation returned by the service.
     * @throws IncompatibleOrderableOptionsException
     *         The specified options are incompatible.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws CopyToRegionDisabledException
     *         Cross-region snapshot copy was temporarily disabled. Try your request again.
     * @throws SnapshotCopyAlreadyEnabledException
     *         The cluster already has cross-region snapshot copy enabled.
     * @throws UnknownSnapshotCopyRegionException
     *         The specified region is incorrect or does not exist.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws SnapshotCopyGrantNotFoundException
     *         The specified snapshot copy grant can't be found. Make sure that the name is typed correctly and that the
     *         grant exists in the destination region.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.EnableSnapshotCopy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EnableSnapshotCopy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Cluster enableSnapshotCopy(EnableSnapshotCopyRequest request) {
        request = beforeClientExecution(request);
        return executeEnableSnapshotCopy(request);
    }

    @SdkInternalApi
    final Cluster executeEnableSnapshotCopy(EnableSnapshotCopyRequest enableSnapshotCopyRequest) {

        ExecutionContext executionContext = createExecutionContext(enableSnapshotCopyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSnapshotCopyRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSnapshotCopyRequestMarshaller().marshall(super.beforeMarshalling(enableSnapshotCopyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableSnapshotCopy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log on to an Amazon Redshift
     * database. The action returns the database user name prefixed with <code>IAM:</code> if <code>AutoCreate</code> is
     * <code>False</code> or <code>IAMA:</code> if <code>AutoCreate</code> is <code>True</code>. You can optionally
     * specify one or more database user groups that the user will join at log on. By default, the temporary credentials
     * expire in 900 seconds. You can optionally specify a duration between 900 seconds (15 minutes) and 3600 seconds
     * (60 minutes). For more information, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/generating-user-credentials.html">Using IAM Authentication
     * to Generate Database User Credentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * The AWS Identity and Access Management (IAM)user or role that executes GetClusterCredentials must have an IAM
     * policy attached that allows access to all necessary actions and resources. For more information about
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html#redshift-policy-resources.getclustercredentials-resources"
     * >Resource Policies for GetClusterCredentials</a> in the Amazon Redshift Cluster Management Guide.
     * </p>
     * <p>
     * If the <code>DbGroups</code> parameter is specified, the IAM policy must allow the
     * <code>redshift:JoinGroup</code> action with access to the listed <code>dbgroups</code>.
     * </p>
     * <p>
     * In addition, if the <code>AutoCreate</code> parameter is set to <code>True</code>, then the policy must include
     * the <code>redshift:CreateClusterUser</code> privilege.
     * </p>
     * <p>
     * If the <code>DbName</code> parameter is specified, the IAM policy must allow access to the resource
     * <code>dbname</code> for the specified database name.
     * </p>
     * 
     * @param getClusterCredentialsRequest
     *        The request parameters to get cluster credentials.
     * @return Result of the GetClusterCredentials operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.GetClusterCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetClusterCredentialsResult getClusterCredentials(GetClusterCredentialsRequest request) {
        request = beforeClientExecution(request);
        return executeGetClusterCredentials(request);
    }

    @SdkInternalApi
    final GetClusterCredentialsResult executeGetClusterCredentials(GetClusterCredentialsRequest getClusterCredentialsRequest) {

        ExecutionContext executionContext = createExecutionContext(getClusterCredentialsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetClusterCredentialsRequest> request = null;
        Response<GetClusterCredentialsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetClusterCredentialsRequestMarshaller().marshall(super.beforeMarshalling(getClusterCredentialsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetClusterCredentials");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetClusterCredentialsResult> responseHandler = new StaxResponseHandler<GetClusterCredentialsResult>(
                    new GetClusterCredentialsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of DC2 ReservedNodeOfferings that matches the payment type, term, and usage price of the given
     * DC1 reserved node.
     * </p>
     * 
     * @param getReservedNodeExchangeOfferingsRequest
     * @return Result of the GetReservedNodeExchangeOfferings operation returned by the service.
     * @throws ReservedNodeNotFoundException
     *         The specified reserved compute node not found.
     * @throws InvalidReservedNodeStateException
     *         Indicates that the Reserved Node being exchanged is not in an active state.
     * @throws ReservedNodeAlreadyMigratedException
     *         Indicates that the reserved node has already been exchanged.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws DependentServiceUnavailableException
     *         Your request cannot be completed because a dependent internal service is temporarily unavailable. Wait 30
     *         to 60 seconds and try again.
     * @sample AmazonRedshift.GetReservedNodeExchangeOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetReservedNodeExchangeOfferingsResult getReservedNodeExchangeOfferings(GetReservedNodeExchangeOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeGetReservedNodeExchangeOfferings(request);
    }

    @SdkInternalApi
    final GetReservedNodeExchangeOfferingsResult executeGetReservedNodeExchangeOfferings(
            GetReservedNodeExchangeOfferingsRequest getReservedNodeExchangeOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(getReservedNodeExchangeOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetReservedNodeExchangeOfferingsRequest> request = null;
        Response<GetReservedNodeExchangeOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetReservedNodeExchangeOfferingsRequestMarshaller().marshall(super.beforeMarshalling(getReservedNodeExchangeOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetReservedNodeExchangeOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetReservedNodeExchangeOfferingsResult> responseHandler = new StaxResponseHandler<GetReservedNodeExchangeOfferingsResult>(
                    new GetReservedNodeExchangeOfferingsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a cluster. For example, you can add another security or parameter group, update the
     * preferred maintenance window, or change the master user password. Resetting a cluster password or modifying the
     * security groups associated with a cluster do not need a reboot. However, modifying a parameter group requires a
     * reboot for parameters to take effect. For more information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * <p>
     * You can also change node type and the number of nodes to scale up or down the cluster. When resizing a cluster,
     * you must specify both the number of nodes and the node type even if one of the parameters does not change.
     * </p>
     * 
     * @param modifyClusterRequest
     * @return Result of the ModifyCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws UnsupportedOptionException
     *         A request option was specified that is not supported.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws TableLimitExceededException
     *         The number of tables in the cluster exceeds the limit for the requested new cluster node type.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifyCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Cluster modifyCluster(ModifyClusterRequest request) {
        request = beforeClientExecution(request);
        return executeModifyCluster(request);
    }

    @SdkInternalApi
    final Cluster executeModifyCluster(ModifyClusterRequest modifyClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the database revision of a cluster. The database revision is a unique revision of the database running
     * in a cluster.
     * </p>
     * 
     * @param modifyClusterDbRevisionRequest
     * @return Result of the ModifyClusterDbRevision operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws ClusterOnLatestRevisionException
     *         Cluster is already on the latest database revision.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @sample AmazonRedshift.ModifyClusterDbRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterDbRevision"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Cluster modifyClusterDbRevision(ModifyClusterDbRevisionRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterDbRevision(request);
    }

    @SdkInternalApi
    final Cluster executeModifyClusterDbRevision(ModifyClusterDbRevisionRequest modifyClusterDbRevisionRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterDbRevisionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterDbRevisionRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterDbRevisionRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterDbRevisionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterDbRevision");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access
     * other AWS services.
     * </p>
     * <p>
     * A cluster can have up to 10 IAM roles associated at any time.
     * </p>
     * 
     * @param modifyClusterIamRolesRequest
     * @return Result of the ModifyClusterIamRoles operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.ModifyClusterIamRoles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterIamRoles" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Cluster modifyClusterIamRoles(ModifyClusterIamRolesRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterIamRoles(request);
    }

    @SdkInternalApi
    final Cluster executeModifyClusterIamRoles(ModifyClusterIamRolesRequest modifyClusterIamRolesRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterIamRolesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterIamRolesRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterIamRolesRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterIamRolesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterIamRoles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the maintenance settings of a cluster. For example, you can defer a maintenance window. You can also
     * update or cancel a deferment.
     * </p>
     * 
     * @param modifyClusterMaintenanceRequest
     * @return Result of the ModifyClusterMaintenance operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.ModifyClusterMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterMaintenance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Cluster modifyClusterMaintenance(ModifyClusterMaintenanceRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterMaintenance(request);
    }

    @SdkInternalApi
    final Cluster executeModifyClusterMaintenance(ModifyClusterMaintenanceRequest modifyClusterMaintenanceRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterMaintenanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterMaintenanceRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterMaintenanceRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterMaintenanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterMaintenance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a parameter group.
     * </p>
     * <p>
     * For more information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param modifyClusterParameterGroupRequest
     * @return Result of the ModifyClusterParameterGroup operation returned by the service.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @sample AmazonRedshift.ModifyClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyClusterParameterGroupResult modifyClusterParameterGroup(ModifyClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterParameterGroup(request);
    }

    @SdkInternalApi
    final ModifyClusterParameterGroupResult executeModifyClusterParameterGroup(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterParameterGroupRequest> request = null;
        Response<ModifyClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyClusterParameterGroupResult> responseHandler = new StaxResponseHandler<ModifyClusterParameterGroupResult>(
                    new ModifyClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the settings for a snapshot.
     * </p>
     * 
     * @param modifyClusterSnapshotRequest
     * @return Result of the ModifyClusterSnapshot operation returned by the service.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifyClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Snapshot modifyClusterSnapshot(ModifyClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterSnapshot(request);
    }

    @SdkInternalApi
    final Snapshot executeModifyClusterSnapshot(ModifyClusterSnapshotRequest modifyClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSnapshotRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a snapshot schedule for a cluster.
     * </p>
     * 
     * @param modifyClusterSnapshotScheduleRequest
     * @return Result of the ModifyClusterSnapshotSchedule operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws InvalidClusterSnapshotScheduleStateException
     *         The cluster snapshot schedule state is not valid.
     * @sample AmazonRedshift.ModifyClusterSnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyClusterSnapshotScheduleResult modifyClusterSnapshotSchedule(ModifyClusterSnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterSnapshotSchedule(request);
    }

    @SdkInternalApi
    final ModifyClusterSnapshotScheduleResult executeModifyClusterSnapshotSchedule(ModifyClusterSnapshotScheduleRequest modifyClusterSnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterSnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSnapshotScheduleRequest> request = null;
        Response<ModifyClusterSnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterSnapshotScheduleRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterSnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterSnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyClusterSnapshotScheduleResult> responseHandler = new StaxResponseHandler<ModifyClusterSnapshotScheduleResult>(
                    new ModifyClusterSnapshotScheduleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a cluster subnet group to include the specified list of VPC subnets. The operation replaces the existing
     * list of subnets with the new list of subnets.
     * </p>
     * 
     * @param modifyClusterSubnetGroupRequest
     * @return Result of the ModifyClusterSubnetGroup operation returned by the service.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws ClusterSubnetQuotaExceededException
     *         The request would result in user exceeding the allowed number of subnets in a cluster subnet groups. For
     *         information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws SubnetAlreadyInUseException
     *         A specified subnet is already in use by another cluster.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.ModifyClusterSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterSubnetGroup modifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyClusterSubnetGroup(request);
    }

    @SdkInternalApi
    final ClusterSubnetGroup executeModifyClusterSubnetGroup(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyClusterSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyClusterSubnetGroupRequest> request = null;
        Response<ClusterSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyClusterSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyClusterSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyClusterSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterSubnetGroup> responseHandler = new StaxResponseHandler<ClusterSubnetGroup>(new ClusterSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         An Amazon Redshift event notification subscription with the specified name does not exist.
     * @throws SNSInvalidTopicException
     *         Amazon SNS has responded that there is a problem with the specified Amazon SNS topic.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the specified Amazon SNS topic.
     * @throws SNSTopicArnNotFoundException
     *         An Amazon SNS topic with the specified Amazon Resource Name (ARN) does not exist.
     * @throws SubscriptionEventIdNotFoundException
     *         An Amazon Redshift event with the specified event ID does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The value specified for the event category was not one of the allowed values, or it specified a category
     *         that does not apply to the specified source type. The allowed values are Configuration, Management,
     *         Monitoring, and Security.
     * @throws SubscriptionSeverityNotFoundException
     *         The value specified for the event severity was not one of the allowed values, or it specified a severity
     *         that does not apply to the specified source type. The allowed values are ERROR and INFO.
     * @throws SourceNotFoundException
     *         The specified Amazon Redshift event source could not be found.
     * @throws InvalidSubscriptionStateException
     *         The subscription request is invalid because it is a duplicate request. This subscription request is
     *         already in progress.
     * @sample AmazonRedshift.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEventSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EventSubscription modifyEventSubscription(ModifyEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeModifyEventSubscription(request);
    }

    @SdkInternalApi
    final EventSubscription executeModifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEventSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(modifyEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyEventSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EventSubscription> responseHandler = new StaxResponseHandler<EventSubscription>(new EventSubscriptionStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the number of days to retain snapshots in the destination AWS Region after they are copied from the
     * source AWS Region. By default, this operation only changes the retention period of copied automated snapshots.
     * The retention periods for both new and existing copied automated snapshots are updated with the new retention
     * period. You can set the manual option to change only the retention periods of copied manual snapshots. If you set
     * this option, only newly copied manual snapshots have the new retention period.
     * </p>
     * 
     * @param modifySnapshotCopyRetentionPeriodRequest
     * @return Result of the ModifySnapshotCopyRetentionPeriod operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws SnapshotCopyDisabledException
     *         Cross-region snapshot copy was temporarily disabled. Try your request again.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws InvalidRetentionPeriodException
     *         The retention period specified is either in the past or is not a valid value.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     * @sample AmazonRedshift.ModifySnapshotCopyRetentionPeriod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Cluster modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request) {
        request = beforeClientExecution(request);
        return executeModifySnapshotCopyRetentionPeriod(request);
    }

    @SdkInternalApi
    final Cluster executeModifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest modifySnapshotCopyRetentionPeriodRequest) {

        ExecutionContext executionContext = createExecutionContext(modifySnapshotCopyRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySnapshotCopyRetentionPeriodRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifySnapshotCopyRetentionPeriodRequestMarshaller().marshall(super.beforeMarshalling(modifySnapshotCopyRetentionPeriodRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifySnapshotCopyRetentionPeriod");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a snapshot schedule. Any schedule associated with a cluster is modified asynchronously.
     * </p>
     * 
     * @param modifySnapshotScheduleRequest
     * @return Result of the ModifySnapshotSchedule operation returned by the service.
     * @throws InvalidScheduleException
     *         The schedule you submitted isn't valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @throws SnapshotScheduleUpdateInProgressException
     *         The specified snapshot schedule is already being updated.
     * @sample AmazonRedshift.ModifySnapshotSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifySnapshotScheduleResult modifySnapshotSchedule(ModifySnapshotScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeModifySnapshotSchedule(request);
    }

    @SdkInternalApi
    final ModifySnapshotScheduleResult executeModifySnapshotSchedule(ModifySnapshotScheduleRequest modifySnapshotScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(modifySnapshotScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifySnapshotScheduleRequest> request = null;
        Response<ModifySnapshotScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifySnapshotScheduleRequestMarshaller().marshall(super.beforeMarshalling(modifySnapshotScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifySnapshotSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifySnapshotScheduleResult> responseHandler = new StaxResponseHandler<ModifySnapshotScheduleResult>(
                    new ModifySnapshotScheduleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You
     * can purchase one or more of the offerings. You can call the <a>DescribeReservedNodeOfferings</a> API to obtain
     * the available reserved node offerings. You can call this API by providing a specific reserved node offering and
     * the number of nodes you want to reserve.
     * </p>
     * <p>
     * For more information about reserved node offerings, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html">Purchasing Reserved
     * Nodes</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param purchaseReservedNodeOfferingRequest
     * @return Result of the PurchaseReservedNodeOffering operation returned by the service.
     * @throws ReservedNodeOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws ReservedNodeAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @throws ReservedNodeQuotaExceededException
     *         Request would exceed the user's compute node quota. For information about increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.PurchaseReservedNodeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PurchaseReservedNodeOffering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReservedNode purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedNodeOffering(request);
    }

    @SdkInternalApi
    final ReservedNode executePurchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedNodeOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedNodeOfferingRequest> request = null;
        Response<ReservedNode> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedNodeOfferingRequestMarshaller().marshall(super.beforeMarshalling(purchaseReservedNodeOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedNodeOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReservedNode> responseHandler = new StaxResponseHandler<ReservedNode>(new ReservedNodeStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reboots a cluster. This action is taken as soon as possible. It results in a momentary outage to the cluster,
     * during which the cluster status is set to <code>rebooting</code>. A cluster event is created when the reboot is
     * completed. Any pending cluster modifications (see <a>ModifyCluster</a>) are applied at this reboot. For more
     * information about managing clusters, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html">Amazon Redshift Clusters</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param rebootClusterRequest
     * @return Result of the RebootCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @sample AmazonRedshift.RebootCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RebootCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Cluster rebootCluster(RebootClusterRequest request) {
        request = beforeClientExecution(request);
        return executeRebootCluster(request);
    }

    @SdkInternalApi
    final Cluster executeRebootCluster(RebootClusterRequest rebootClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootClusterRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootClusterRequestMarshaller().marshall(super.beforeMarshalling(rebootClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets one or more parameters of the specified parameter group to their default values and sets the source values
     * of the parameters to "engine-default". To reset the entire parameter group specify the <i>ResetAllParameters</i>
     * parameter. For parameter changes to take effect you must reboot any associated clusters.
     * </p>
     * 
     * @param resetClusterParameterGroupRequest
     * @return Result of the ResetClusterParameterGroup operation returned by the service.
     * @throws InvalidClusterParameterGroupStateException
     *         The cluster parameter group action can not be completed because another task is in progress that involves
     *         the parameter group. Wait a few moments and try the operation again.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @sample AmazonRedshift.ResetClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResetClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetClusterParameterGroupResult resetClusterParameterGroup(ResetClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeResetClusterParameterGroup(request);
    }

    @SdkInternalApi
    final ResetClusterParameterGroupResult executeResetClusterParameterGroup(ResetClusterParameterGroupRequest resetClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(resetClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetClusterParameterGroupRequest> request = null;
        Response<ResetClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetClusterParameterGroupResult> responseHandler = new StaxResponseHandler<ResetClusterParameterGroupResult>(
                    new ResetClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Changes the size of the cluster. You can change the cluster's type, or change the number or type of nodes. The
     * default behavior is to use the elastic resize method. With an elastic resize, your cluster is available for read
     * and write operations more quickly than with the classic resize method.
     * </p>
     * <p>
     * Elastic resize operations have the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can only resize clusters of the following types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * dc2.large
     * </p>
     * </li>
     * <li>
     * <p>
     * dc2.8xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.xlarge
     * </p>
     * </li>
     * <li>
     * <p>
     * ds2.8xlarge
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The type of nodes that you add must match the node type for the cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resizeClusterRequest
     * @return Result of the ResizeCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws UnsupportedOptionException
     *         A request option was specified that is not supported.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @sample AmazonRedshift.ResizeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public Cluster resizeCluster(ResizeClusterRequest request) {
        request = beforeClientExecution(request);
        return executeResizeCluster(request);
    }

    @SdkInternalApi
    final Cluster executeResizeCluster(ResizeClusterRequest resizeClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(resizeClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResizeClusterRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResizeClusterRequestMarshaller().marshall(super.beforeMarshalling(resizeClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResizeCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new cluster from a snapshot. By default, Amazon Redshift creates the resulting cluster with the same
     * configuration as the original cluster from which the snapshot was created, except that the new cluster is created
     * with the default cluster security and parameter groups. After Amazon Redshift creates the cluster, you can use
     * the <a>ModifyCluster</a> API to associate a different security group and different parameter group with the
     * restored cluster. If you are using a DS node type, you can also choose to change to another DS node type of the
     * same size during restore.
     * </p>
     * <p>
     * If you restore a cluster into a VPC, you must provide a cluster subnet group where you want the cluster restored.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param restoreFromClusterSnapshotRequest
     * @return Result of the RestoreFromClusterSnapshot operation returned by the service.
     * @throws AccessToSnapshotDeniedException
     *         The owner of the specified snapshot has not authorized your account to access the snapshot.
     * @throws ClusterAlreadyExistsException
     *         The account already has a cluster with the given identifier.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws ClusterQuotaExceededException
     *         The request would exceed the allowed number of cluster instances for this account. For information about
     *         increasing your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws InsufficientClusterCapacityException
     *         The number of nodes specified exceeds the allotted capacity of the cluster.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws InvalidRestoreException
     *         The restore is invalid.
     * @throws NumberOfNodesQuotaExceededException
     *         The operation would exceed the number of nodes allotted to the account. For information about increasing
     *         your quota, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html">Limits in Amazon
     *         Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @throws NumberOfNodesPerClusterLimitExceededException
     *         The operation would exceed the number of nodes allowed for a cluster.
     * @throws InvalidVPCNetworkStateException
     *         The cluster subnet group does not cover all Availability Zones.
     * @throws InvalidClusterSubnetGroupStateException
     *         The cluster subnet group cannot be deleted because it is in use.
     * @throws InvalidSubnetException
     *         The requested subnet is not valid, or not all of the subnets are in the same VPC.
     * @throws ClusterSubnetGroupNotFoundException
     *         The cluster subnet group name does not refer to an existing cluster subnet group.
     * @throws UnauthorizedOperationException
     *         Your account is not authorized to perform the requested operation.
     * @throws HsmClientCertificateNotFoundException
     *         There is no Amazon Redshift HSM client certificate with the specified identifier.
     * @throws HsmConfigurationNotFoundException
     *         There is no Amazon Redshift HSM configuration with the specified identifier.
     * @throws InvalidElasticIpException
     *         The Elastic IP (EIP) is invalid or cannot be found.
     * @throws ClusterParameterGroupNotFoundException
     *         The parameter group name does not refer to an existing parameter group.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws LimitExceededException
     *         The encryption key has exceeded its grant limit in AWS KMS.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @throws InvalidClusterTrackException
     *         The provided cluster track name is not valid.
     * @throws SnapshotScheduleNotFoundException
     *         We could not find the specified snapshot schedule.
     * @sample AmazonRedshift.RestoreFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public Cluster restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreFromClusterSnapshot(request);
    }

    @SdkInternalApi
    final Cluster executeRestoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromClusterSnapshotRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreFromClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreFromClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new table from a table in an Amazon Redshift cluster snapshot. You must create the new table within the
     * Amazon Redshift cluster that the snapshot was taken from.
     * </p>
     * <p>
     * You cannot use <code>RestoreTableFromClusterSnapshot</code> to restore a table with the same name as an existing
     * table in an Amazon Redshift cluster. That is, you cannot overwrite an existing table in a cluster with a restored
     * table. If you want to replace your original table with a new, restored table, then rename or drop your original
     * table before you call <code>RestoreTableFromClusterSnapshot</code>. When you have renamed your original table,
     * then you can pass the original name of the table as the <code>NewTableName</code> parameter value in the call to
     * <code>RestoreTableFromClusterSnapshot</code>. This way, you can replace the original table with the table created
     * from the snapshot.
     * </p>
     * 
     * @param restoreTableFromClusterSnapshotRequest
     * @return Result of the RestoreTableFromClusterSnapshot operation returned by the service.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @throws InProgressTableRestoreQuotaExceededException
     *         You have exceeded the allowed number of table restore requests. Wait for your current table restore
     *         requests to complete before making a new request.
     * @throws InvalidClusterSnapshotStateException
     *         The specified cluster snapshot is not in the <code>available</code> state, or other accounts are
     *         authorized to access the snapshot.
     * @throws InvalidTableRestoreArgumentException
     *         The value specified for the <code>sourceDatabaseName</code>, <code>sourceSchemaName</code>, or
     *         <code>sourceTableName</code> parameter, or a combination of these, doesn't exist in the snapshot.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws UnsupportedOperationException
     *         The requested operation isn't supported.
     * @sample AmazonRedshift.RestoreTableFromClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RestoreTableFromClusterSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TableRestoreStatus restoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreTableFromClusterSnapshot(request);
    }

    @SdkInternalApi
    final TableRestoreStatus executeRestoreTableFromClusterSnapshot(RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreTableFromClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreTableFromClusterSnapshotRequest> request = null;
        Response<TableRestoreStatus> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreTableFromClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreTableFromClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreTableFromClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TableRestoreStatus> responseHandler = new StaxResponseHandler<TableRestoreStatus>(new TableRestoreStatusStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes an ingress rule in an Amazon Redshift security group for a previously authorized IP range or Amazon EC2
     * security group. To add an ingress rule, see <a>AuthorizeClusterSecurityGroupIngress</a>. For information about
     * managing security groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-security-groups.html">Amazon Redshift Cluster
     * Security Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeClusterSecurityGroupIngressRequest
     * @return Result of the RevokeClusterSecurityGroupIngress operation returned by the service.
     * @throws ClusterSecurityGroupNotFoundException
     *         The cluster security group name does not refer to an existing cluster security group.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or EC2 security group is not authorized for the specified cluster security
     *         group.
     * @throws InvalidClusterSecurityGroupStateException
     *         The state of the cluster security group is not <code>available</code>.
     * @sample AmazonRedshift.RevokeClusterSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeClusterSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ClusterSecurityGroup revokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeClusterSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final ClusterSecurityGroup executeRevokeClusterSecurityGroupIngress(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeClusterSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeClusterSecurityGroupIngressRequest> request = null;
        Response<ClusterSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeClusterSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeClusterSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeClusterSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ClusterSecurityGroup> responseHandler = new StaxResponseHandler<ClusterSecurityGroup>(
                    new ClusterSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the ability of the specified AWS customer account to restore the specified snapshot. If the account is
     * currently restoring the snapshot, the restore will run to completion.
     * </p>
     * <p>
     * For more information about working with snapshots, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">Amazon Redshift Snapshots</a>
     * in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param revokeSnapshotAccessRequest
     * @return Result of the RevokeSnapshotAccess operation returned by the service.
     * @throws AccessToSnapshotDeniedException
     *         The owner of the specified snapshot has not authorized your account to access the snapshot.
     * @throws AuthorizationNotFoundException
     *         The specified CIDR IP range or EC2 security group is not authorized for the specified cluster security
     *         group.
     * @throws ClusterSnapshotNotFoundException
     *         The snapshot identifier does not refer to an existing cluster snapshot.
     * @sample AmazonRedshift.RevokeSnapshotAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeSnapshotAccess" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Snapshot revokeSnapshotAccess(RevokeSnapshotAccessRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeSnapshotAccess(request);
    }

    @SdkInternalApi
    final Snapshot executeRevokeSnapshotAccess(RevokeSnapshotAccessRequest revokeSnapshotAccessRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeSnapshotAccessRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeSnapshotAccessRequest> request = null;
        Response<Snapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeSnapshotAccessRequestMarshaller().marshall(super.beforeMarshalling(revokeSnapshotAccessRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeSnapshotAccess");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Snapshot> responseHandler = new StaxResponseHandler<Snapshot>(new SnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rotates the encryption keys for a cluster.
     * </p>
     * 
     * @param rotateEncryptionKeyRequest
     * @return Result of the RotateEncryptionKey operation returned by the service.
     * @throws ClusterNotFoundException
     *         The <code>ClusterIdentifier</code> parameter does not refer to an existing cluster.
     * @throws InvalidClusterStateException
     *         The specified cluster is not in the <code>available</code> state.
     * @throws DependentServiceRequestThrottlingException
     *         The request cannot be completed because a dependent service is throttling requests made by Amazon
     *         Redshift on your behalf. Wait and retry the request.
     * @sample AmazonRedshift.RotateEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RotateEncryptionKey" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public Cluster rotateEncryptionKey(RotateEncryptionKeyRequest request) {
        request = beforeClientExecution(request);
        return executeRotateEncryptionKey(request);
    }

    @SdkInternalApi
    final Cluster executeRotateEncryptionKey(RotateEncryptionKeyRequest rotateEncryptionKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(rotateEncryptionKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RotateEncryptionKeyRequest> request = null;
        Response<Cluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RotateEncryptionKeyRequestMarshaller().marshall(super.beforeMarshalling(rotateEncryptionKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Redshift");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RotateEncryptionKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Cluster> responseHandler = new StaxResponseHandler<Cluster>(new ClusterStaxUnmarshaller());
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

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public AmazonRedshiftWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonRedshiftWaiters(this);
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
