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
package com.amazonaws.services.rds;

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

import com.amazonaws.services.rds.AmazonRDSClientBuilder;
import com.amazonaws.services.rds.waiters.AmazonRDSWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.services.rds.model.transform.*;

/**
 * Client for accessing Amazon RDS. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Note that Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command has been applied. In this reference, the
 * parameter descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list following some related topics from the user
 * guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRDSClient extends AmazonWebServiceClient implements AmazonRDS {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRDS.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "rds";

    private volatile AmazonRDSWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Amazon RDS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     * @deprecated use {@link AmazonRDSClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonRDSClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonRDSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRDSClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonRDSClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonRDSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonRDSClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonRDSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRDSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRDSClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonRDSClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonRDSClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonRDSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRDSClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonRDSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon RDS (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonRDSClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonRDSClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonRDSClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonRDSClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonRDSClientBuilder builder() {
        return AmazonRDSClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRDSClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon RDS using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRDSClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new OptionGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptionGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionCategoryNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRestoreExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSInvalidTopicExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBInstanceStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterBacktrackNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBLogFileNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOptionGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientDBClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupNotAllowedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CertificateNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSecurityGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BackupPolicyNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidS3BucketExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StorageTypeNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientDBInstanceCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBUpgradeDependencyFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KMSKeyNotAccessibleExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientStorageClusterCapacityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubnetAlreadyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ProvisionedIopsNotAvailableInAZExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterSnapshotAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterRoleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidEventSubscriptionStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PointInTimeRestoreNotEnabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidSubnetExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBInstanceAutomatedBackupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSNoAuthorizationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupDoesNotCoverEnoughAZsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterSnapshotNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSubnetGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InstanceQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterParameterGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceAutomatedBackupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new GlobalClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SharedSnapshotQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterEndpointStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGlobalClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceAutomatedBackupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstanceQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidVPCNetworkStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SNSTopicArnNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBSubnetGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SubscriptionAlreadyExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBParameterGroupQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBInstanceRoleAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OptionGroupNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBClusterSnapshotStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBSecurityGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ReservedDBInstancesOfferingNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDBParameterGroupStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DomainNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new EventSubscriptionQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StorageQuotaExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DBClusterEndpointAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AuthorizationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.rds.model.AmazonRDSException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("rds.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/rds/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/rds/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates an Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more information,
     * see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf</a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param addRoleToDBClusterRequest
     * @return Result of the AddRoleToDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws DBClusterRoleAlreadyExistsException
     *         The specified IAM role Amazon Resource Name (ARN) is already associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterRoleQuotaExceededException
     *         You have exceeded the maximum number of IAM roles that can be associated with the specified DB cluster.
     * @sample AmazonRDS.AddRoleToDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddRoleToDBClusterResult addRoleToDBCluster(AddRoleToDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeAddRoleToDBCluster(request);
    }

    @SdkInternalApi
    final AddRoleToDBClusterResult executeAddRoleToDBCluster(AddRoleToDBClusterRequest addRoleToDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(addRoleToDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddRoleToDBClusterRequest> request = null;
        Response<AddRoleToDBClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddRoleToDBClusterRequestMarshaller().marshall(super.beforeMarshalling(addRoleToDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddRoleToDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddRoleToDBClusterResult> responseHandler = new StaxResponseHandler<AddRoleToDBClusterResult>(
                    new AddRoleToDBClusterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an AWS Identity and Access Management (IAM) role with a DB instance.
     * </p>
     * <note>
     * <p>
     * To add a role to a DB instance, the status of the DB instance must be <code>available</code>.
     * </p>
     * </note>
     * 
     * @param addRoleToDBInstanceRequest
     * @return Result of the AddRoleToDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBInstanceRoleAlreadyExistsException
     *         The specified <i>RoleArn</i> or <i>FeatureName</i> value is already associated with the DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceRoleQuotaExceededException
     *         You can't associate any more AWS Identity and Access Management (IAM) roles with the DB instance because
     *         the quota has been reached.
     * @sample AmazonRDS.AddRoleToDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddRoleToDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddRoleToDBInstanceResult addRoleToDBInstance(AddRoleToDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeAddRoleToDBInstance(request);
    }

    @SdkInternalApi
    final AddRoleToDBInstanceResult executeAddRoleToDBInstance(AddRoleToDBInstanceRequest addRoleToDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(addRoleToDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddRoleToDBInstanceRequest> request = null;
        Response<AddRoleToDBInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddRoleToDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(addRoleToDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddRoleToDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddRoleToDBInstanceResult> responseHandler = new StaxResponseHandler<AddRoleToDBInstanceResult>(
                    new AddRoleToDBInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a source identifier to an existing RDS event notification subscription.
     * </p>
     * 
     * @param addSourceIdentifierToSubscriptionRequest
     * @return Result of the AddSourceIdentifierToSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.AddSourceIdentifierToSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddSourceIdentifierToSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EventSubscription addSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeAddSourceIdentifierToSubscription(request);
    }

    @SdkInternalApi
    final EventSubscription executeAddSourceIdentifierToSubscription(AddSourceIdentifierToSubscriptionRequest addSourceIdentifierToSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(addSourceIdentifierToSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddSourceIdentifierToSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddSourceIdentifierToSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(addSourceIdentifierToSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddSourceIdentifierToSubscription");
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
     * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track
     * cost associated with Amazon RDS resources, or used in a Condition statement in an IAM policy for Amazon RDS.
     * </p>
     * <p>
     * For an overview on tagging Amazon RDS resources, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller().marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AddTagsToResourceResult> responseHandler = new StaxResponseHandler<AddTagsToResourceResult>(
                    new AddTagsToResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a DB instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest request) {
        request = beforeClientExecution(request);
        return executeApplyPendingMaintenanceAction(request);
    }

    @SdkInternalApi
    final ResourcePendingMaintenanceActions executeApplyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest) {

        ExecutionContext executionContext = createExecutionContext(applyPendingMaintenanceActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyPendingMaintenanceActionRequest> request = null;
        Response<ResourcePendingMaintenanceActions> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplyPendingMaintenanceActionRequestMarshaller().marshall(super.beforeMarshalling(applyPendingMaintenanceActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApplyPendingMaintenanceAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResourcePendingMaintenanceActions> responseHandler = new StaxResponseHandler<ResourcePendingMaintenanceActions>(
                    new ResourcePendingMaintenanceActionsStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables ingress to a DBSecurityGroup using one of two forms of authorization. First, EC2 or VPC security groups
     * can be added to the DBSecurityGroup if the application using the database is running on EC2 or VPC instances.
     * Second, IP ranges are available if the application accessing your database is running on the Internet. Required
     * parameters for this API are one of CIDR range, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and either
     * EC2SecurityGroupName or EC2SecurityGroupId for non-VPC).
     * </p>
     * <note>
     * <p>
     * You can't authorize ingress from an EC2 security group in one AWS Region to an Amazon RDS DB instance in another.
     * You can't authorize ingress from a VPC security group in one VPC to an Amazon RDS DB instance in another.
     * </p>
     * </note>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param authorizeDBSecurityGroupIngressRequest
     * @return Result of the AuthorizeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws AuthorizationAlreadyExistsException
     *         The specified CIDRIP or Amazon EC2 security group is already authorized for the specified DB security
     *         group.
     * @throws AuthorizationQuotaExceededException
     *         The DB security group authorization quota has been reached.
     * @sample AmazonRDS.AuthorizeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/AuthorizeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBSecurityGroup authorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeAuthorizeDBSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final DBSecurityGroup executeAuthorizeDBSecurityGroupIngress(AuthorizeDBSecurityGroupIngressRequest authorizeDBSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(authorizeDBSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AuthorizeDBSecurityGroupIngressRequest> request = null;
        Response<DBSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AuthorizeDBSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(authorizeDBSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AuthorizeDBSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSecurityGroup> responseHandler = new StaxResponseHandler<DBSecurityGroup>(new DBSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Backtracks a DB cluster to a specific time, without creating a new DB cluster.
     * </p>
     * <p>
     * For more information on backtracking, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Managing.Backtrack.html">
     * Backtracking an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param backtrackDBClusterRequest
     * @return Result of the BacktrackDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.BacktrackDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BacktrackDBClusterResult backtrackDBCluster(BacktrackDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeBacktrackDBCluster(request);
    }

    @SdkInternalApi
    final BacktrackDBClusterResult executeBacktrackDBCluster(BacktrackDBClusterRequest backtrackDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(backtrackDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BacktrackDBClusterRequest> request = null;
        Response<BacktrackDBClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BacktrackDBClusterRequestMarshaller().marshall(super.beforeMarshalling(backtrackDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BacktrackDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BacktrackDBClusterResult> responseHandler = new StaxResponseHandler<BacktrackDBClusterResult>(
                    new BacktrackDBClusterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB cluster parameter group.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterParameterGroupRequest
     * @return Result of the CopyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CopyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCopyDBClusterParameterGroup(request);
    }

    @SdkInternalApi
    final DBClusterParameterGroup executeCopyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest copyDBClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(copyDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBClusterParameterGroupRequest> request = null;
        Response<DBClusterParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyDBClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(copyDBClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyDBClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterParameterGroup> responseHandler = new StaxResponseHandler<DBClusterParameterGroup>(
                    new DBClusterParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies a snapshot of a DB cluster.
     * </p>
     * <p>
     * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
     * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon Resource Name (ARN) of the shared DB cluster
     * snapshot.
     * </p>
     * <p>
     * You can copy an encrypted DB cluster snapshot from another AWS Region. In that case, the AWS Region where you
     * call the <code>CopyDBClusterSnapshot</code> action is the destination AWS Region for the encrypted DB cluster
     * snapshot to be copied to. To copy an encrypted DB cluster snapshot from another AWS Region, you must provide the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key identifier for the key to use to encrypt the
     * copy of the DB cluster snapshot in the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBClusterSnapshot</code> action to be called in the source AWS Region where the DB cluster snapshot is
     * copied from. The pre-signed URL must be a valid request for the <code>CopyDBClusterSnapshot</code> API action
     * that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied.
     * </p>
     * <p>
     * The pre-signed URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot
     * in the destination AWS Region. This is the same identifier for both the <code>CopyDBClusterSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB cluster snapshot will be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS
     * Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new copy of the DB cluster snapshot in
     * the destination AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot identifier for the encrypted DB cluster
     * snapshot to be copied. This identifier must be in the ARN format for the source AWS Region and is the same value
     * as the <code>SourceDBClusterSnapshotIdentifier</code> in the pre-signed URL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To cancel the copy operation once it is in progress, delete the target DB cluster snapshot identified by
     * <code>TargetDBClusterSnapshotIdentifier</code> while that DB cluster snapshot is in "copying" status.
     * </p>
     * <p>
     * For more information on copying encrypted DB cluster snapshots from one AWS Region to another, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"> Copying a
     * Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param copyDBClusterSnapshotRequest
     * @return Result of the CopyDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.CopyDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBClusterSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopyDBClusterSnapshot(request);
    }

    @SdkInternalApi
    final DBClusterSnapshot executeCopyDBClusterSnapshot(CopyDBClusterSnapshotRequest copyDBClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copyDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBClusterSnapshotRequest> request = null;
        Response<DBClusterSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyDBClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(copyDBClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyDBClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterSnapshot> responseHandler = new StaxResponseHandler<DBClusterSnapshot>(new DBClusterSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB parameter group.
     * </p>
     * 
     * @param copyDBParameterGroupRequest
     * @return Result of the CopyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @sample AmazonRDS.CopyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBParameterGroup copyDBParameterGroup(CopyDBParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCopyDBParameterGroup(request);
    }

    @SdkInternalApi
    final DBParameterGroup executeCopyDBParameterGroup(CopyDBParameterGroupRequest copyDBParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(copyDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBParameterGroupRequest> request = null;
        Response<DBParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyDBParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(copyDBParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyDBParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBParameterGroup> responseHandler = new StaxResponseHandler<DBParameterGroup>(new DBParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified DB snapshot. The source DB snapshot must be in the "available" state.
     * </p>
     * <p>
     * You can copy a snapshot from one AWS Region to another. In that case, the AWS Region where you call the
     * <code>CopyDBSnapshot</code> action is the destination AWS Region for the DB snapshot copy.
     * </p>
     * <p>
     * For more information about copying snapshots, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopyDBSnapshot.html">Copying a DB Snapshot</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param copyDBSnapshotRequest
     * @return Result of the CopyDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.CopyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSnapshot copyDBSnapshot(CopyDBSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCopyDBSnapshot(request);
    }

    @SdkInternalApi
    final DBSnapshot executeCopyDBSnapshot(CopyDBSnapshotRequest copyDBSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(copyDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyDBSnapshotRequest> request = null;
        Response<DBSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyDBSnapshotRequestMarshaller().marshall(super.beforeMarshalling(copyDBSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyDBSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshot> responseHandler = new StaxResponseHandler<DBSnapshot>(new DBSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies the specified option group.
     * </p>
     * 
     * @param copyOptionGroupRequest
     * @return Result of the CopyOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CopyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public OptionGroup copyOptionGroup(CopyOptionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCopyOptionGroup(request);
    }

    @SdkInternalApi
    final OptionGroup executeCopyOptionGroup(CopyOptionGroupRequest copyOptionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(copyOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyOptionGroupRequest> request = null;
        Response<OptionGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyOptionGroupRequestMarshaller().marshall(super.beforeMarshalling(copyOptionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyOptionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<OptionGroup> responseHandler = new StaxResponseHandler<OptionGroup>(new OptionGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon Aurora DB cluster.
     * </p>
     * <p>
     * You can use the <code>ReplicationSourceIdentifier</code> parameter to create the DB cluster as a Read Replica of
     * another DB cluster or Amazon RDS MySQL DB instance. For cross-region replication where the DB cluster identified
     * by <code>ReplicationSourceIdentifier</code> is encrypted, you must also specify the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterRequest
     * @return Result of the CreateDBCluster operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> doesn't refer to an existing DB cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @sample AmazonRDS.CreateDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster createDBCluster(CreateDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeCreateDBCluster(CreateDBClusterRequest createDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBClusterRequestMarshaller().marshall(super.beforeMarshalling(createDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new custom endpoint and associates it with an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterEndpointRequest
     * @return Result of the CreateDBClusterEndpoint operation returned by the service.
     * @throws DBClusterEndpointQuotaExceededException
     *         The cluster already has the maximum number of custom endpoints.
     * @throws DBClusterEndpointAlreadyExistsException
     *         The specified custom endpoint can't be created because it already exists.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.CreateDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDBClusterEndpointResult createDBClusterEndpoint(CreateDBClusterEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBClusterEndpoint(request);
    }

    @SdkInternalApi
    final CreateDBClusterEndpointResult executeCreateDBClusterEndpoint(CreateDBClusterEndpointRequest createDBClusterEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterEndpointRequest> request = null;
        Response<CreateDBClusterEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBClusterEndpointRequestMarshaller().marshall(super.beforeMarshalling(createDBClusterEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBClusterEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateDBClusterEndpointResult> responseHandler = new StaxResponseHandler<CreateDBClusterEndpointResult>(
                    new CreateDBClusterEndpointResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB cluster parameter group.
     * </p>
     * <p>
     * Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.
     * </p>
     * <p>
     * A DB cluster parameter group is initially created with the default parameters for the database engine used by
     * instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
     * creating it using <a>ModifyDBClusterParameterGroup</a>. Once you've created a DB cluster parameter group, you
     * need to associate it with your DB cluster using <a>ModifyDBCluster</a>. When you associate a new DB cluster
     * parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover
     * for the new DB cluster parameter group and associated settings to take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the DB cluster parameter group is used as the default for a new DB cluster.
     * This is especially important for parameters that are critical when creating the default database for a DB
     * cluster, such as the character set for the default database defined by the <code>character_set_database</code>
     * parameter. You can use the <i>Parameter Groups</i> option of the <a
     * href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or the <a>DescribeDBClusterParameters</a>
     * command to verify that your DB cluster parameter group has been created or modified.
     * </p>
     * </important>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterParameterGroupRequest
     * @return Result of the CreateDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBClusterParameterGroup(request);
    }

    @SdkInternalApi
    final DBClusterParameterGroup executeCreateDBClusterParameterGroup(CreateDBClusterParameterGroupRequest createDBClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterParameterGroupRequest> request = null;
        Response<DBClusterParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createDBClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterParameterGroup> responseHandler = new StaxResponseHandler<DBClusterParameterGroup>(
                    new DBClusterParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a DB cluster. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createDBClusterSnapshotRequest
     * @return Result of the CreateDBClusterSnapshot operation returned by the service.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @sample AmazonRDS.CreateDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBClusterSnapshot(request);
    }

    @SdkInternalApi
    final DBClusterSnapshot executeCreateDBClusterSnapshot(CreateDBClusterSnapshotRequest createDBClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBClusterSnapshotRequest> request = null;
        Response<DBClusterSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createDBClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterSnapshot> responseHandler = new StaxResponseHandler<DBClusterSnapshot>(new DBClusterSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance.
     * </p>
     * 
     * @param createDBInstanceRequest
     * @return Result of the CreateDBInstance operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DomainNotFoundException
     *         <i>Domain</i> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.CreateDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance createDBInstance(CreateDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeCreateDBInstance(CreateDBInstanceRequest createDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(createDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance that acts as a Read Replica for an existing source DB instance. You can create a Read
     * Replica for a DB instance running MySQL, MariaDB, Oracle, or PostgreSQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html">Working with Read Replicas</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Amazon Aurora doesn't support this action. You must call the <code>CreateDBInstance</code> action to create a DB
     * instance for an Aurora DB cluster.
     * </p>
     * <p>
     * All Read Replica DB instances are created with backups disabled. All other DB instance attributes (including DB
     * security groups and DB parameter groups) are inherited from the source DB instance, except as specified
     * following.
     * </p>
     * <important>
     * <p>
     * Your source DB instance must have backup retention enabled.
     * </p>
     * </important>
     * 
     * @param createDBInstanceReadReplicaRequest
     * @return Result of the CreateDBInstanceReadReplica operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBSubnetGroupNotAllowedException
     *         The DBSubnetGroup shouldn't be specified while creating read replicas that lie in the same region as the
     *         source instance.
     * @throws InvalidDBSubnetGroupException
     *         The DBSubnetGroup doesn't belong to the same VPC as that of an existing cross-region read replica of the
     *         same source instance.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.CreateDBInstanceReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstanceReadReplica"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBInstance createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBInstanceReadReplica(request);
    }

    @SdkInternalApi
    final DBInstance executeCreateDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest createDBInstanceReadReplicaRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBInstanceReadReplicaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBInstanceReadReplicaRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBInstanceReadReplicaRequestMarshaller().marshall(super.beforeMarshalling(createDBInstanceReadReplicaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBInstanceReadReplica");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB parameter group.
     * </p>
     * <p>
     * A DB parameter group is initially created with the default parameters for the database engine used by the DB
     * instance. To provide custom values for any of the parameters, you must modify the group after creating it using
     * <i>ModifyDBParameterGroup</i>. Once you've created a DB parameter group, you need to associate it with your DB
     * instance using <i>ModifyDBInstance</i>. When you associate a new DB parameter group with a running DB instance,
     * you need to reboot the DB instance without failover for the new DB parameter group and associated settings to
     * take effect.
     * </p>
     * <important>
     * <p>
     * After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * create action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param createDBParameterGroupRequest
     * @return Result of the CreateDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB parameter groups.
     * @throws DBParameterGroupAlreadyExistsException
     *         A DB parameter group with the same name exists.
     * @sample AmazonRDS.CreateDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBParameterGroup createDBParameterGroup(CreateDBParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBParameterGroup(request);
    }

    @SdkInternalApi
    final DBParameterGroup executeCreateDBParameterGroup(CreateDBParameterGroupRequest createDBParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBParameterGroupRequest> request = null;
        Response<DBParameterGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(createDBParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBParameterGroup> responseHandler = new StaxResponseHandler<DBParameterGroup>(new DBParameterGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB security group. DB security groups control access to a DB instance.
     * </p>
     * <note>
     * <p>
     * A DB security group controls access to EC2-Classic DB instances that are not in a VPC.
     * </p>
     * </note>
     * 
     * @param createDBSecurityGroupRequest
     * @return Result of the CreateDBSecurityGroup operation returned by the service.
     * @throws DBSecurityGroupAlreadyExistsException
     *         A DB security group with the name specified in <i>DBSecurityGroupName</i> already exists.
     * @throws DBSecurityGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB security groups.
     * @throws DBSecurityGroupNotSupportedException
     *         A DB security group isn't allowed for this action.
     * @sample AmazonRDS.CreateDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSecurityGroup createDBSecurityGroup(CreateDBSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBSecurityGroup(request);
    }

    @SdkInternalApi
    final DBSecurityGroup executeCreateDBSecurityGroup(CreateDBSecurityGroupRequest createDBSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSecurityGroupRequest> request = null;
        Response<DBSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(createDBSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSecurityGroup> responseHandler = new StaxResponseHandler<DBSecurityGroup>(new DBSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a DBSnapshot. The source DBInstance must be in "available" state.
     * </p>
     * 
     * @param createDBSnapshotRequest
     * @return Result of the CreateDBSnapshot operation returned by the service.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @sample AmazonRDS.CreateDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSnapshot createDBSnapshot(CreateDBSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBSnapshot(request);
    }

    @SdkInternalApi
    final DBSnapshot executeCreateDBSnapshot(CreateDBSnapshotRequest createDBSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSnapshotRequest> request = null;
        Response<DBSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBSnapshotRequestMarshaller().marshall(super.beforeMarshalling(createDBSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshot> responseHandler = new StaxResponseHandler<DBSnapshot>(new DBSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
     * Region.
     * </p>
     * 
     * @param createDBSubnetGroupRequest
     * @return Result of the CreateDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupAlreadyExistsException
     *         <i>DBSubnetGroupName</i> is already used by an existing DB subnet group.
     * @throws DBSubnetGroupQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB subnet groups.
     * @throws DBSubnetQuotaExceededException
     *         The request would result in the user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonRDS.CreateDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDBSubnetGroup(request);
    }

    @SdkInternalApi
    final DBSubnetGroup executeCreateDBSubnetGroup(CreateDBSubnetGroupRequest createDBSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDBSubnetGroupRequest> request = null;
        Response<DBSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDBSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(createDBSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDBSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSubnetGroup> responseHandler = new StaxResponseHandler<DBSubnetGroup>(new DBSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an RDS event notification subscription. This action requires a topic ARN (Amazon Resource Name) created
     * by either the RDS console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic in
     * Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.
     * </p>
     * <p>
     * You can specify the type of source (SourceType) you want to be notified of, provide a list of RDS sources
     * (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
     * want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
     * mydbinstance2 and EventCategories = Availability, Backup.
     * </p>
     * <p>
     * If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
     * myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
     * SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
     * your RDS sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
     * events generated from all RDS sources belonging to your customer account.
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionAlreadyExistException
     *         The supplied subscription name already exists.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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
     * </p>
     * <p>
     * Creates an Aurora global database spread across multiple regions. The global database contains a single primary
     * cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster
     * through high-speed replication performed by the Aurora storage subsystem.
     * </p>
     * <p>
     * You can create a global database that is initially empty, and then add a primary cluster and a secondary cluster
     * to it. Or you can specify an existing Aurora cluster during the create operation, and this cluster becomes the
     * primary cluster of the global database.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param createGlobalClusterRequest
     * @return Result of the CreateGlobalCluster operation returned by the service.
     * @throws GlobalClusterAlreadyExistsException
     * @throws GlobalClusterQuotaExceededException
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.CreateGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GlobalCluster createGlobalCluster(CreateGlobalClusterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlobalCluster(request);
    }

    @SdkInternalApi
    final GlobalCluster executeCreateGlobalCluster(CreateGlobalClusterRequest createGlobalClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalClusterRequest> request = null;
        Response<GlobalCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlobalClusterRequestMarshaller().marshall(super.beforeMarshalling(createGlobalClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlobalCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalCluster> responseHandler = new StaxResponseHandler<GlobalCluster>(new GlobalClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new option group. You can create up to 20 option groups.
     * </p>
     * 
     * @param createOptionGroupRequest
     * @return Result of the CreateOptionGroup operation returned by the service.
     * @throws OptionGroupAlreadyExistsException
     *         The option group you are trying to create already exists.
     * @throws OptionGroupQuotaExceededException
     *         The quota of 20 option groups was exceeded for this AWS account.
     * @sample AmazonRDS.CreateOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public OptionGroup createOptionGroup(CreateOptionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOptionGroup(request);
    }

    @SdkInternalApi
    final OptionGroup executeCreateOptionGroup(CreateOptionGroupRequest createOptionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOptionGroupRequest> request = null;
        Response<OptionGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOptionGroupRequestMarshaller().marshall(super.beforeMarshalling(createOptionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOptionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<OptionGroup> responseHandler = new StaxResponseHandler<OptionGroup>(new OptionGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
     * automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
     * specified DB cluster are not deleted.
     * </p>
     * <p/>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterRequest
     * @return Result of the DeleteDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBClusterSnapshotAlreadyExistsException
     *         The user already has a DB cluster snapshot with the given identifier.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @sample AmazonRDS.DeleteDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster deleteDBCluster(DeleteDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeDeleteDBCluster(DeleteDBClusterRequest deleteDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a custom endpoint and removes it from an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterEndpointRequest
     * @return Result of the DeleteDBClusterEndpoint operation returned by the service.
     * @throws InvalidDBClusterEndpointStateException
     *         The requested operation can't be performed on the endpoint while the endpoint is in this state.
     * @throws DBClusterEndpointNotFoundException
     *         The specified custom endpoint doesn't exist.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.DeleteDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDBClusterEndpointResult deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBClusterEndpoint(request);
    }

    @SdkInternalApi
    final DeleteDBClusterEndpointResult executeDeleteDBClusterEndpoint(DeleteDBClusterEndpointRequest deleteDBClusterEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterEndpointRequest> request = null;
        Response<DeleteDBClusterEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBClusterEndpointRequestMarshaller().marshall(super.beforeMarshalling(deleteDBClusterEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBClusterEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDBClusterEndpointResult> responseHandler = new StaxResponseHandler<DeleteDBClusterEndpointResult>(
                    new DeleteDBClusterEndpointResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
     * with any DB clusters.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterParameterGroupRequest
     * @return Result of the DeleteDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBClusterParameterGroup(request);
    }

    @SdkInternalApi
    final DeleteDBClusterParameterGroupResult executeDeleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest deleteDBClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterParameterGroupRequest> request = null;
        Response<DeleteDBClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteDBClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDBClusterParameterGroupResult> responseHandler = new StaxResponseHandler<DeleteDBClusterParameterGroupResult>(
                    new DeleteDBClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB cluster snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteDBClusterSnapshotRequest
     * @return Result of the DeleteDBClusterSnapshot operation returned by the service.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DeleteDBClusterSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBClusterSnapshot(request);
    }

    @SdkInternalApi
    final DBClusterSnapshot executeDeleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest deleteDBClusterSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBClusterSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBClusterSnapshotRequest> request = null;
        Response<DBClusterSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBClusterSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteDBClusterSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBClusterSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterSnapshot> responseHandler = new StaxResponseHandler<DBClusterSnapshot>(new DBClusterSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
     * automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
     * be deleted by <code>DeleteDBInstance</code> are not deleted.
     * </p>
     * <p>
     * If you request a final DB snapshot the status of the Amazon RDS DB instance is <code>deleting</code> until the DB
     * snapshot is created. The API action <code>DescribeDBInstance</code> is used to monitor the status of this
     * operation. The action can't be canceled or reverted once submitted.
     * </p>
     * <p>
     * Note that when a DB instance is in a failure state and has a status of <code>failed</code>,
     * <code>incompatible-restore</code>, or <code>incompatible-network</code>, you can only delete it when the
     * <code>SkipFinalSnapshot</code> parameter is set to <code>true</code>.
     * </p>
     * <p>
     * If the specified DB instance is part of an Amazon Aurora DB cluster, you can't delete the DB instance if both of
     * the following conditions are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB cluster is a Read Replica of another Amazon Aurora DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The DB instance is the only instance in the DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a DB instance in this case, first call the <a>PromoteReadReplicaDBCluster</a> API action to promote the
     * DB cluster so it's no longer a Read Replica. After the promotion completes, then call the
     * <code>DeleteDBInstance</code> API action to delete the final instance in the DB cluster.
     * </p>
     * 
     * @param deleteDBInstanceRequest
     * @return Result of the DeleteDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws DBInstanceAutomatedBackupQuotaExceededException
     *         The quota for retained automated backups was exceeded. This prevents you from retaining any additional
     *         automated backups. The retained automated backups quota is the same as your DB Instance quota.
     * @sample AmazonRDS.DeleteDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance deleteDBInstance(DeleteDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeDeleteDBInstance(DeleteDBInstanceRequest deleteDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(deleteDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes automated backups based on the source instance's <code>DbiResourceId</code> value or the restorable
     * instance's resource ID.
     * </p>
     * 
     * @param deleteDBInstanceAutomatedBackupRequest
     *        Parameter input for the <code>DeleteDBInstanceAutomatedBackup</code> operation.
     * @return Result of the DeleteDBInstanceAutomatedBackup operation returned by the service.
     * @throws InvalidDBInstanceAutomatedBackupStateException
     *         The automated backup is in an invalid state. For example, this automated backup is associated with an
     *         active instance.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.DeleteDBInstanceAutomatedBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBInstanceAutomatedBackup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBInstanceAutomatedBackup deleteDBInstanceAutomatedBackup(DeleteDBInstanceAutomatedBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBInstanceAutomatedBackup(request);
    }

    @SdkInternalApi
    final DBInstanceAutomatedBackup executeDeleteDBInstanceAutomatedBackup(DeleteDBInstanceAutomatedBackupRequest deleteDBInstanceAutomatedBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBInstanceAutomatedBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBInstanceAutomatedBackupRequest> request = null;
        Response<DBInstanceAutomatedBackup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBInstanceAutomatedBackupRequestMarshaller().marshall(super.beforeMarshalling(deleteDBInstanceAutomatedBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBInstanceAutomatedBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstanceAutomatedBackup> responseHandler = new StaxResponseHandler<DBInstanceAutomatedBackup>(
                    new DBInstanceAutomatedBackupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified DB parameter group. The DB parameter group to be deleted can't be associated with any DB
     * instances.
     * </p>
     * 
     * @param deleteDBParameterGroupRequest
     * @return Result of the DeleteDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DeleteDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDBParameterGroupResult deleteDBParameterGroup(DeleteDBParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBParameterGroup(request);
    }

    @SdkInternalApi
    final DeleteDBParameterGroupResult executeDeleteDBParameterGroup(DeleteDBParameterGroupRequest deleteDBParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBParameterGroupRequest> request = null;
        Response<DeleteDBParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteDBParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDBParameterGroupResult> responseHandler = new StaxResponseHandler<DeleteDBParameterGroupResult>(
                    new DeleteDBParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB security group.
     * </p>
     * <note>
     * <p>
     * The specified DB security group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSecurityGroupRequest
     * @return Result of the DeleteDBSecurityGroup operation returned by the service.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @sample AmazonRDS.DeleteDBSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSecurityGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDBSecurityGroupResult deleteDBSecurityGroup(DeleteDBSecurityGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBSecurityGroup(request);
    }

    @SdkInternalApi
    final DeleteDBSecurityGroupResult executeDeleteDBSecurityGroup(DeleteDBSecurityGroupRequest deleteDBSecurityGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBSecurityGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSecurityGroupRequest> request = null;
        Response<DeleteDBSecurityGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBSecurityGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteDBSecurityGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBSecurityGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDBSecurityGroupResult> responseHandler = new StaxResponseHandler<DeleteDBSecurityGroupResult>(
                    new DeleteDBSecurityGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB snapshot. If the snapshot is being copied, the copy operation is terminated.
     * </p>
     * <note>
     * <p>
     * The DB snapshot must be in the <code>available</code> state to be deleted.
     * </p>
     * </note>
     * 
     * @param deleteDBSnapshotRequest
     * @return Result of the DeleteDBSnapshot operation returned by the service.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DeleteDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSnapshot deleteDBSnapshot(DeleteDBSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBSnapshot(request);
    }

    @SdkInternalApi
    final DBSnapshot executeDeleteDBSnapshot(DeleteDBSnapshotRequest deleteDBSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSnapshotRequest> request = null;
        Response<DBSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBSnapshotRequestMarshaller().marshall(super.beforeMarshalling(deleteDBSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshot> responseHandler = new StaxResponseHandler<DBSnapshot>(new DBSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a DB subnet group.
     * </p>
     * <note>
     * <p>
     * The specified database subnet group must not be associated with any DB instances.
     * </p>
     * </note>
     * 
     * @param deleteDBSubnetGroupRequest
     * @return Result of the DeleteDBSubnetGroup operation returned by the service.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidDBSubnetStateException
     *         The DB subnet isn't in the <i>available</i> state.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @sample AmazonRDS.DeleteDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDBSubnetGroup(request);
    }

    @SdkInternalApi
    final DeleteDBSubnetGroupResult executeDeleteDBSubnetGroup(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDBSubnetGroupRequest> request = null;
        Response<DeleteDBSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDBSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteDBSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDBSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDBSubnetGroupResult> responseHandler = new StaxResponseHandler<DeleteDBSubnetGroupResult>(
                    new DeleteDBSubnetGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an RDS event notification subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws InvalidEventSubscriptionStateException
     *         This error can occur if someone else is modifying a subscription. You should retry the action.
     * @sample AmazonRDS.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public EventSubscription deleteEventSubscription(DeleteEventSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventSubscription(request);
    }

    @SdkInternalApi
    final EventSubscription executeDeleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(deleteEventSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventSubscription");
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
     * Deletes a global database cluster. The primary and secondary clusters must already be detached or destroyed
     * first.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param deleteGlobalClusterRequest
     * @return Result of the DeleteGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @sample AmazonRDS.DeleteGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GlobalCluster deleteGlobalCluster(DeleteGlobalClusterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlobalCluster(request);
    }

    @SdkInternalApi
    final GlobalCluster executeDeleteGlobalCluster(DeleteGlobalClusterRequest deleteGlobalClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalClusterRequest> request = null;
        Response<GlobalCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlobalClusterRequestMarshaller().marshall(super.beforeMarshalling(deleteGlobalClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlobalCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalCluster> responseHandler = new StaxResponseHandler<GlobalCluster>(new GlobalClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing option group.
     * </p>
     * 
     * @param deleteOptionGroupRequest
     * @return Result of the DeleteOptionGroup operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws InvalidOptionGroupStateException
     *         The option group isn't in the <i>available</i> state.
     * @sample AmazonRDS.DeleteOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteOptionGroupResult deleteOptionGroup(DeleteOptionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOptionGroup(request);
    }

    @SdkInternalApi
    final DeleteOptionGroupResult executeDeleteOptionGroup(DeleteOptionGroupRequest deleteOptionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOptionGroupRequest> request = null;
        Response<DeleteOptionGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOptionGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteOptionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOptionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteOptionGroupResult> responseHandler = new StaxResponseHandler<DeleteOptionGroupResult>(
                    new DeleteOptionGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the attributes for a customer account. The attributes include Amazon RDS quotas for the account,
     * such as the number of DB instances allowed. The description for a quota includes the quota name, current usage
     * toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command doesn't take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AmazonRDS.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes() {
        return describeAccountAttributes(new DescribeAccountAttributesRequest());
    }

    /**
     * <p>
     * Lists the set of CA certificates provided by Amazon RDS for this AWS account.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws CertificateNotFoundException
     *         <i>CertificateIdentifier</i> doesn't refer to an existing certificate.
     * @sample AmazonRDS.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCertificates(request);
    }

    @SdkInternalApi
    final DescribeCertificatesResult executeDescribeCertificates(DescribeCertificatesRequest describeCertificatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCertificatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCertificatesRequest> request = null;
        Response<DescribeCertificatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCertificatesRequestMarshaller().marshall(super.beforeMarshalling(describeCertificatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCertificates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeCertificatesResult> responseHandler = new StaxResponseHandler<DescribeCertificatesResult>(
                    new DescribeCertificatesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeCertificatesResult describeCertificates() {
        return describeCertificates(new DescribeCertificatesRequest());
    }

    /**
     * <p>
     * Returns information about backtracks for a DB cluster.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterBacktracksRequest
     * @return Result of the DescribeDBClusterBacktracks operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws DBClusterBacktrackNotFoundException
     *         <i>BacktrackIdentifier</i> doesn't refer to an existing backtrack.
     * @sample AmazonRDS.DescribeDBClusterBacktracks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterBacktracks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDBClusterBacktracksResult describeDBClusterBacktracks(DescribeDBClusterBacktracksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterBacktracks(request);
    }

    @SdkInternalApi
    final DescribeDBClusterBacktracksResult executeDescribeDBClusterBacktracks(DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterBacktracksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterBacktracksRequest> request = null;
        Response<DescribeDBClusterBacktracksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterBacktracksRequestMarshaller().marshall(super.beforeMarshalling(describeDBClusterBacktracksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterBacktracks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClusterBacktracksResult> responseHandler = new StaxResponseHandler<DescribeDBClusterBacktracksResult>(
                    new DescribeDBClusterBacktracksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about endpoints for an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterEndpointsRequest
     * @return Result of the DescribeDBClusterEndpoints operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.DescribeDBClusterEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDBClusterEndpointsResult describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterEndpoints(request);
    }

    @SdkInternalApi
    final DescribeDBClusterEndpointsResult executeDescribeDBClusterEndpoints(DescribeDBClusterEndpointsRequest describeDBClusterEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterEndpointsRequest> request = null;
        Response<DescribeDBClusterEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterEndpointsRequestMarshaller().marshall(super.beforeMarshalling(describeDBClusterEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClusterEndpointsResult> responseHandler = new StaxResponseHandler<DescribeDBClusterEndpointsResult>(
                    new DescribeDBClusterEndpointsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBClusterParameterGroup</code> descriptions. If a
     * <code>DBClusterParameterGroupName</code> parameter is specified, the list will contain only the description of
     * the specified DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParameterGroupsRequest
     * @return Result of the DescribeDBClusterParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameterGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterParameterGroups(request);
    }

    @SdkInternalApi
    final DescribeDBClusterParameterGroupsResult executeDescribeDBClusterParameterGroups(
            DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterParameterGroupsRequest> request = null;
        Response<DescribeDBClusterParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeDBClusterParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterParameterGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClusterParameterGroupsResult> responseHandler = new StaxResponseHandler<DescribeDBClusterParameterGroupsResult>(
                    new DescribeDBClusterParameterGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups() {
        return describeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB cluster parameter group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterParametersRequest
     * @return Result of the DescribeDBClusterParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterParameters(request);
    }

    @SdkInternalApi
    final DescribeDBClusterParametersResult executeDescribeDBClusterParameters(DescribeDBClusterParametersRequest describeDBClusterParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterParametersRequest> request = null;
        Response<DescribeDBClusterParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterParametersRequestMarshaller().marshall(super.beforeMarshalling(describeDBClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClusterParametersResult> responseHandler = new StaxResponseHandler<DescribeDBClusterParametersResult>(
                    new DescribeDBClusterParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBClusterSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB cluster snapshot. If <code>all</code> is included in the list of values for the <code>restore</code>
     * attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
     * DB cluster snapshot public or private, use the <a>ModifyDBClusterSnapshotAttribute</a> API action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotAttributesRequest
     * @return Result of the DescribeDBClusterSnapshotAttributes operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DescribeDBClusterSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterSnapshotAttributes(request);
    }

    @SdkInternalApi
    final DBClusterSnapshotAttributesResult executeDescribeDBClusterSnapshotAttributes(
            DescribeDBClusterSnapshotAttributesRequest describeDBClusterSnapshotAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterSnapshotAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterSnapshotAttributesRequest> request = null;
        Response<DBClusterSnapshotAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterSnapshotAttributesRequestMarshaller().marshall(super
                        .beforeMarshalling(describeDBClusterSnapshotAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterSnapshotAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterSnapshotAttributesResult> responseHandler = new StaxResponseHandler<DBClusterSnapshotAttributesResult>(
                    new DBClusterSnapshotAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about DB cluster snapshots. This API action supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClusterSnapshotsRequest
     * @return Result of the DescribeDBClusterSnapshots operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @sample AmazonRDS.DescribeDBClusterSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusterSnapshots(request);
    }

    @SdkInternalApi
    final DescribeDBClusterSnapshotsResult executeDescribeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest describeDBClusterSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClusterSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClusterSnapshotsRequest> request = null;
        Response<DescribeDBClusterSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClusterSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeDBClusterSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusterSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClusterSnapshotsResult> responseHandler = new StaxResponseHandler<DescribeDBClusterSnapshotsResult>(
                    new DescribeDBClusterSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots() {
        return describeDBClusterSnapshots(new DescribeDBClusterSnapshotsRequest());
    }

    /**
     * <p>
     * Returns information about provisioned Aurora DB clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeDBClustersRequest
     * @return Result of the DescribeDBClusters operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.DescribeDBClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBClusters(request);
    }

    @SdkInternalApi
    final DescribeDBClustersResult executeDescribeDBClusters(DescribeDBClustersRequest describeDBClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBClustersRequest> request = null;
        Response<DescribeDBClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBClustersRequestMarshaller().marshall(super.beforeMarshalling(describeDBClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBClustersResult> responseHandler = new StaxResponseHandler<DescribeDBClustersResult>(
                    new DescribeDBClustersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBClustersResult describeDBClusters() {
        return describeDBClusters(new DescribeDBClustersRequest());
    }

    /**
     * <p>
     * Returns a list of the available DB engines.
     * </p>
     * 
     * @param describeDBEngineVersionsRequest
     * @return Result of the DescribeDBEngineVersions operation returned by the service.
     * @sample AmazonRDS.DescribeDBEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBEngineVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBEngineVersions(request);
    }

    @SdkInternalApi
    final DescribeDBEngineVersionsResult executeDescribeDBEngineVersions(DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBEngineVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBEngineVersionsRequest> request = null;
        Response<DescribeDBEngineVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBEngineVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeDBEngineVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBEngineVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBEngineVersionsResult> responseHandler = new StaxResponseHandler<DescribeDBEngineVersionsResult>(
                    new DescribeDBEngineVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBEngineVersionsResult describeDBEngineVersions() {
        return describeDBEngineVersions(new DescribeDBEngineVersionsRequest());
    }

    /**
     * <p>
     * Displays backups for both current and deleted instances. For example, use this operation to find details about
     * automated backups for previously deleted instances. Current instances with retention periods greater than zero
     * (0) are returned for both the <code>DescribeDBInstanceAutomatedBackups</code> and
     * <code>DescribeDBInstances</code> operations.
     * </p>
     * <p>
     * All parameters are optional.
     * </p>
     * 
     * @param describeDBInstanceAutomatedBackupsRequest
     *        Parameter input for DescribeDBInstanceAutomatedBackups.
     * @return Result of the DescribeDBInstanceAutomatedBackups operation returned by the service.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.DescribeDBInstanceAutomatedBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstanceAutomatedBackups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDBInstanceAutomatedBackupsResult describeDBInstanceAutomatedBackups(DescribeDBInstanceAutomatedBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBInstanceAutomatedBackups(request);
    }

    @SdkInternalApi
    final DescribeDBInstanceAutomatedBackupsResult executeDescribeDBInstanceAutomatedBackups(
            DescribeDBInstanceAutomatedBackupsRequest describeDBInstanceAutomatedBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBInstanceAutomatedBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBInstanceAutomatedBackupsRequest> request = null;
        Response<DescribeDBInstanceAutomatedBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBInstanceAutomatedBackupsRequestMarshaller()
                        .marshall(super.beforeMarshalling(describeDBInstanceAutomatedBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBInstanceAutomatedBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBInstanceAutomatedBackupsResult> responseHandler = new StaxResponseHandler<DescribeDBInstanceAutomatedBackupsResult>(
                    new DescribeDBInstanceAutomatedBackupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about provisioned RDS instances. This API supports pagination.
     * </p>
     * 
     * @param describeDBInstancesRequest
     * @return Result of the DescribeDBInstances operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBInstances(request);
    }

    @SdkInternalApi
    final DescribeDBInstancesResult executeDescribeDBInstances(DescribeDBInstancesRequest describeDBInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBInstancesRequest> request = null;
        Response<DescribeDBInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBInstancesRequestMarshaller().marshall(super.beforeMarshalling(describeDBInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBInstancesResult> responseHandler = new StaxResponseHandler<DescribeDBInstancesResult>(
                    new DescribeDBInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBInstancesResult describeDBInstances() {
        return describeDBInstances(new DescribeDBInstancesRequest());
    }

    /**
     * <p>
     * Returns a list of DB log files for the DB instance.
     * </p>
     * 
     * @param describeDBLogFilesRequest
     * @return Result of the DescribeDBLogFiles operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.DescribeDBLogFiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBLogFiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBLogFilesResult describeDBLogFiles(DescribeDBLogFilesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBLogFiles(request);
    }

    @SdkInternalApi
    final DescribeDBLogFilesResult executeDescribeDBLogFiles(DescribeDBLogFilesRequest describeDBLogFilesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBLogFilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBLogFilesRequest> request = null;
        Response<DescribeDBLogFilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBLogFilesRequestMarshaller().marshall(super.beforeMarshalling(describeDBLogFilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBLogFiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBLogFilesResult> responseHandler = new StaxResponseHandler<DescribeDBLogFilesResult>(
                    new DescribeDBLogFilesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBParameterGroup</code> descriptions. If a <code>DBParameterGroupName</code> is
     * specified, the list will contain only the description of the specified DB parameter group.
     * </p>
     * 
     * @param describeDBParameterGroupsRequest
     * @return Result of the DescribeDBParameterGroups operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDBParameterGroupsResult describeDBParameterGroups(DescribeDBParameterGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBParameterGroups(request);
    }

    @SdkInternalApi
    final DescribeDBParameterGroupsResult executeDescribeDBParameterGroups(DescribeDBParameterGroupsRequest describeDBParameterGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBParameterGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBParameterGroupsRequest> request = null;
        Response<DescribeDBParameterGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBParameterGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeDBParameterGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBParameterGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBParameterGroupsResult> responseHandler = new StaxResponseHandler<DescribeDBParameterGroupsResult>(
                    new DescribeDBParameterGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBParameterGroupsResult describeDBParameterGroups() {
        return describeDBParameterGroups(new DescribeDBParameterGroupsRequest());
    }

    /**
     * <p>
     * Returns the detailed parameter list for a particular DB parameter group.
     * </p>
     * 
     * @param describeDBParametersRequest
     * @return Result of the DescribeDBParameters operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.DescribeDBParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBParameters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBParametersResult describeDBParameters(DescribeDBParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBParameters(request);
    }

    @SdkInternalApi
    final DescribeDBParametersResult executeDescribeDBParameters(DescribeDBParametersRequest describeDBParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBParametersRequest> request = null;
        Response<DescribeDBParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBParametersRequestMarshaller().marshall(super.beforeMarshalling(describeDBParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBParametersResult> responseHandler = new StaxResponseHandler<DescribeDBParametersResult>(
                    new DescribeDBParametersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DBSecurityGroup</code> descriptions. If a <code>DBSecurityGroupName</code> is specified,
     * the list will contain only the descriptions of the specified DB security group.
     * </p>
     * 
     * @param describeDBSecurityGroupsRequest
     * @return Result of the DescribeDBSecurityGroups operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @sample AmazonRDS.DescribeDBSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSecurityGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups(DescribeDBSecurityGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBSecurityGroups(request);
    }

    @SdkInternalApi
    final DescribeDBSecurityGroupsResult executeDescribeDBSecurityGroups(DescribeDBSecurityGroupsRequest describeDBSecurityGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBSecurityGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSecurityGroupsRequest> request = null;
        Response<DescribeDBSecurityGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBSecurityGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeDBSecurityGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBSecurityGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBSecurityGroupsResult> responseHandler = new StaxResponseHandler<DescribeDBSecurityGroupsResult>(
                    new DescribeDBSecurityGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBSecurityGroupsResult describeDBSecurityGroups() {
        return describeDBSecurityGroups(new DescribeDBSecurityGroupsRequest());
    }

    /**
     * <p>
     * Returns a list of DB snapshot attribute names and values for a manual DB snapshot.
     * </p>
     * <p>
     * When sharing snapshots with other AWS accounts, <code>DescribeDBSnapshotAttributes</code> returns the
     * <code>restore</code> attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
     * manual DB snapshot. If <code>all</code> is included in the list of values for the <code>restore</code> attribute,
     * then the manual DB snapshot is public and can be copied or restored by all AWS accounts.
     * </p>
     * <p>
     * To add or remove access for an AWS account to copy or restore a manual DB snapshot, or to make the manual DB
     * snapshot public or private, use the <a>ModifyDBSnapshotAttribute</a> API action.
     * </p>
     * 
     * @param describeDBSnapshotAttributesRequest
     * @return Result of the DescribeDBSnapshotAttributes operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshotAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshotAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBSnapshotAttributesResult describeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBSnapshotAttributes(request);
    }

    @SdkInternalApi
    final DBSnapshotAttributesResult executeDescribeDBSnapshotAttributes(DescribeDBSnapshotAttributesRequest describeDBSnapshotAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBSnapshotAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSnapshotAttributesRequest> request = null;
        Response<DBSnapshotAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBSnapshotAttributesRequestMarshaller().marshall(super.beforeMarshalling(describeDBSnapshotAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBSnapshotAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshotAttributesResult> responseHandler = new StaxResponseHandler<DBSnapshotAttributesResult>(
                    new DBSnapshotAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DBSnapshotAttributesResult describeDBSnapshotAttributes() {
        return describeDBSnapshotAttributes(new DescribeDBSnapshotAttributesRequest());
    }

    /**
     * <p>
     * Returns information about DB snapshots. This API action supports pagination.
     * </p>
     * 
     * @param describeDBSnapshotsRequest
     * @return Result of the DescribeDBSnapshots operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.DescribeDBSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBSnapshotsResult describeDBSnapshots(DescribeDBSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBSnapshots(request);
    }

    @SdkInternalApi
    final DescribeDBSnapshotsResult executeDescribeDBSnapshots(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSnapshotsRequest> request = null;
        Response<DescribeDBSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBSnapshotsRequestMarshaller().marshall(super.beforeMarshalling(describeDBSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBSnapshotsResult> responseHandler = new StaxResponseHandler<DescribeDBSnapshotsResult>(
                    new DescribeDBSnapshotsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBSnapshotsResult describeDBSnapshots() {
        return describeDBSnapshots(new DescribeDBSnapshotsRequest());
    }

    /**
     * <p>
     * Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
     * descriptions of the specified DBSubnetGroup.
     * </p>
     * <p>
     * For an overview of CIDR ranges, go to the <a
     * href="http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Wikipedia Tutorial</a>.
     * </p>
     * 
     * @param describeDBSubnetGroupsRequest
     * @return Result of the DescribeDBSubnetGroups operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @sample AmazonRDS.DescribeDBSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDBSubnetGroups(request);
    }

    @SdkInternalApi
    final DescribeDBSubnetGroupsResult executeDescribeDBSubnetGroups(DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDBSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDBSubnetGroupsRequest> request = null;
        Response<DescribeDBSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDBSubnetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeDBSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDBSubnetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeDBSubnetGroupsResult> responseHandler = new StaxResponseHandler<DescribeDBSubnetGroupsResult>(
                    new DescribeDBSubnetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups() {
        return describeDBSubnetGroups(new DescribeDBSubnetGroupsRequest());
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the cluster database engine.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param describeEngineDefaultClusterParametersRequest
     * @return Result of the DescribeEngineDefaultClusterParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultClusterParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultClusterParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngineDefaultClusterParameters(request);
    }

    @SdkInternalApi
    final EngineDefaults executeDescribeEngineDefaultClusterParameters(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultClusterParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultClusterParametersRequest> request = null;
        Response<EngineDefaults> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineDefaultClusterParametersRequestMarshaller().marshall(super
                        .beforeMarshalling(describeEngineDefaultClusterParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngineDefaultClusterParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EngineDefaults> responseHandler = new StaxResponseHandler<EngineDefaults>(new EngineDefaultsStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the default engine and system parameter information for the specified database engine.
     * </p>
     * 
     * @param describeEngineDefaultParametersRequest
     * @return Result of the DescribeEngineDefaultParameters operation returned by the service.
     * @sample AmazonRDS.DescribeEngineDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEngineDefaultParameters"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEngineDefaultParameters(request);
    }

    @SdkInternalApi
    final EngineDefaults executeDescribeEngineDefaultParameters(DescribeEngineDefaultParametersRequest describeEngineDefaultParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEngineDefaultParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEngineDefaultParametersRequest> request = null;
        Response<EngineDefaults> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEngineDefaultParametersRequestMarshaller().marshall(super.beforeMarshalling(describeEngineDefaultParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEngineDefaultParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EngineDefaults> responseHandler = new StaxResponseHandler<EngineDefaults>(new EngineDefaultsStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays a list of categories for all event source types, or, if specified, for a specified source type. You can
     * see a list of the event categories and source types in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events</a> topic in the <i>Amazon
     * RDS User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AmazonRDS.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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
     * Lists all the subscription descriptions for a customer account. The description for a subscription includes
     * SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.
     * </p>
     * <p>
     * If you specify a SubscriptionName, lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @sample AmazonRDS.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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
     * Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
     * days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
     * can be obtained by providing the name as a parameter. By default, the past hour of events are returned.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AmazonRDS.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEvents" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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
     * Returns information about Aurora global database clusters. This API supports pagination.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param describeGlobalClustersRequest
     * @return Result of the DescribeGlobalClusters operation returned by the service.
     * @throws GlobalClusterNotFoundException
     * @sample AmazonRDS.DescribeGlobalClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeGlobalClusters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeGlobalClustersResult describeGlobalClusters(DescribeGlobalClustersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalClusters(request);
    }

    @SdkInternalApi
    final DescribeGlobalClustersResult executeDescribeGlobalClusters(DescribeGlobalClustersRequest describeGlobalClustersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalClustersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalClustersRequest> request = null;
        Response<DescribeGlobalClustersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalClustersRequestMarshaller().marshall(super.beforeMarshalling(describeGlobalClustersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGlobalClusters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeGlobalClustersResult> responseHandler = new StaxResponseHandler<DescribeGlobalClustersResult>(
                    new DescribeGlobalClustersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes all available options.
     * </p>
     * 
     * @param describeOptionGroupOptionsRequest
     * @return Result of the DescribeOptionGroupOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOptionGroupOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroupOptions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeOptionGroupOptionsResult describeOptionGroupOptions(DescribeOptionGroupOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOptionGroupOptions(request);
    }

    @SdkInternalApi
    final DescribeOptionGroupOptionsResult executeDescribeOptionGroupOptions(DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOptionGroupOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptionGroupOptionsRequest> request = null;
        Response<DescribeOptionGroupOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOptionGroupOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeOptionGroupOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOptionGroupOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeOptionGroupOptionsResult> responseHandler = new StaxResponseHandler<DescribeOptionGroupOptionsResult>(
                    new DescribeOptionGroupOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available option groups.
     * </p>
     * 
     * @param describeOptionGroupsRequest
     * @return Result of the DescribeOptionGroups operation returned by the service.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.DescribeOptionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOptionGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeOptionGroupsResult describeOptionGroups(DescribeOptionGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOptionGroups(request);
    }

    @SdkInternalApi
    final DescribeOptionGroupsResult executeDescribeOptionGroups(DescribeOptionGroupsRequest describeOptionGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOptionGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOptionGroupsRequest> request = null;
        Response<DescribeOptionGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOptionGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeOptionGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOptionGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeOptionGroupsResult> responseHandler = new StaxResponseHandler<DescribeOptionGroupsResult>(
                    new DescribeOptionGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeOptionGroupsResult describeOptionGroups() {
        return describeOptionGroups(new DescribeOptionGroupsRequest());
    }

    /**
     * <p>
     * Returns a list of orderable DB instance options for the specified engine.
     * </p>
     * 
     * @param describeOrderableDBInstanceOptionsRequest
     * @return Result of the DescribeOrderableDBInstanceOptions operation returned by the service.
     * @sample AmazonRDS.DescribeOrderableDBInstanceOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeOrderableDBInstanceOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeOrderableDBInstanceOptions(request);
    }

    @SdkInternalApi
    final DescribeOrderableDBInstanceOptionsResult executeDescribeOrderableDBInstanceOptions(
            DescribeOrderableDBInstanceOptionsRequest describeOrderableDBInstanceOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeOrderableDBInstanceOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableDBInstanceOptionsRequest> request = null;
        Response<DescribeOrderableDBInstanceOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableDBInstanceOptionsRequestMarshaller()
                        .marshall(super.beforeMarshalling(describeOrderableDBInstanceOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeOrderableDBInstanceOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeOrderableDBInstanceOptionsResult> responseHandler = new StaxResponseHandler<DescribeOrderableDBInstanceOptionsResult>(
                    new DescribeOrderableDBInstanceOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ID was not found.
     * @sample AmazonRDS.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePendingMaintenanceActions(request);
    }

    @SdkInternalApi
    final DescribePendingMaintenanceActionsResult executeDescribePendingMaintenanceActions(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePendingMaintenanceActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePendingMaintenanceActionsRequest> request = null;
        Response<DescribePendingMaintenanceActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePendingMaintenanceActionsRequestMarshaller().marshall(super.beforeMarshalling(describePendingMaintenanceActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePendingMaintenanceActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribePendingMaintenanceActionsResult> responseHandler = new StaxResponseHandler<DescribePendingMaintenanceActionsResult>(
                    new DescribePendingMaintenanceActionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions() {
        return describePendingMaintenanceActions(new DescribePendingMaintenanceActionsRequest());
    }

    /**
     * <p>
     * Returns information about reserved DB instances for this account, or about a specified reserved DB instance.
     * </p>
     * 
     * @param describeReservedDBInstancesRequest
     * @return Result of the DescribeReservedDBInstances operation returned by the service.
     * @throws ReservedDBInstanceNotFoundException
     *         The specified reserved DB Instance not found.
     * @sample AmazonRDS.DescribeReservedDBInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedDBInstancesResult describeReservedDBInstances(DescribeReservedDBInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedDBInstances(request);
    }

    @SdkInternalApi
    final DescribeReservedDBInstancesResult executeDescribeReservedDBInstances(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedDBInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedDBInstancesRequest> request = null;
        Response<DescribeReservedDBInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedDBInstancesRequestMarshaller().marshall(super.beforeMarshalling(describeReservedDBInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedDBInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedDBInstancesResult> responseHandler = new StaxResponseHandler<DescribeReservedDBInstancesResult>(
                    new DescribeReservedDBInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedDBInstancesResult describeReservedDBInstances() {
        return describeReservedDBInstances(new DescribeReservedDBInstancesRequest());
    }

    /**
     * <p>
     * Lists available reserved DB instance offerings.
     * </p>
     * 
     * @param describeReservedDBInstancesOfferingsRequest
     * @return Result of the DescribeReservedDBInstancesOfferings operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @sample AmazonRDS.DescribeReservedDBInstancesOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeReservedDBInstancesOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings(DescribeReservedDBInstancesOfferingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeReservedDBInstancesOfferings(request);
    }

    @SdkInternalApi
    final DescribeReservedDBInstancesOfferingsResult executeDescribeReservedDBInstancesOfferings(
            DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeReservedDBInstancesOfferingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReservedDBInstancesOfferingsRequest> request = null;
        Response<DescribeReservedDBInstancesOfferingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReservedDBInstancesOfferingsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeReservedDBInstancesOfferingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeReservedDBInstancesOfferings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeReservedDBInstancesOfferingsResult> responseHandler = new StaxResponseHandler<DescribeReservedDBInstancesOfferingsResult>(
                    new DescribeReservedDBInstancesOfferingsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeReservedDBInstancesOfferingsResult describeReservedDBInstancesOfferings() {
        return describeReservedDBInstancesOfferings(new DescribeReservedDBInstancesOfferingsRequest());
    }

    /**
     * <p>
     * Returns a list of the source AWS Regions where the current AWS Region can create a Read Replica or copy a DB
     * snapshot from. This API action supports pagination.
     * </p>
     * 
     * @param describeSourceRegionsRequest
     * @return Result of the DescribeSourceRegions operation returned by the service.
     * @sample AmazonRDS.DescribeSourceRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeSourceRegions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSourceRegionsResult describeSourceRegions(DescribeSourceRegionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSourceRegions(request);
    }

    @SdkInternalApi
    final DescribeSourceRegionsResult executeDescribeSourceRegions(DescribeSourceRegionsRequest describeSourceRegionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSourceRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSourceRegionsRequest> request = null;
        Response<DescribeSourceRegionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSourceRegionsRequestMarshaller().marshall(super.beforeMarshalling(describeSourceRegionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSourceRegions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeSourceRegionsResult> responseHandler = new StaxResponseHandler<DescribeSourceRegionsResult>(
                    new DescribeSourceRegionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You can call <a>DescribeValidDBInstanceModifications</a> to learn what modifications you can make to your DB
     * instance. You can use this information when you call <a>ModifyDBInstance</a>.
     * </p>
     * 
     * @param describeValidDBInstanceModificationsRequest
     * @return Result of the DescribeValidDBInstanceModifications operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.DescribeValidDBInstanceModifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeValidDBInstanceModifications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidDBInstanceModificationsMessage describeValidDBInstanceModifications(DescribeValidDBInstanceModificationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeValidDBInstanceModifications(request);
    }

    @SdkInternalApi
    final ValidDBInstanceModificationsMessage executeDescribeValidDBInstanceModifications(
            DescribeValidDBInstanceModificationsRequest describeValidDBInstanceModificationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeValidDBInstanceModificationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeValidDBInstanceModificationsRequest> request = null;
        Response<ValidDBInstanceModificationsMessage> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeValidDBInstanceModificationsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeValidDBInstanceModificationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeValidDBInstanceModifications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ValidDBInstanceModificationsMessage> responseHandler = new StaxResponseHandler<ValidDBInstanceModificationsMessage>(
                    new ValidDBInstanceModificationsMessageStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Downloads all or a portion of the specified log file, up to 1 MB in size.
     * </p>
     * 
     * @param downloadDBLogFilePortionRequest
     * @return Result of the DownloadDBLogFilePortion operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBLogFileNotFoundException
     *         <i>LogFileName</i> doesn't refer to an existing DB log file.
     * @sample AmazonRDS.DownloadDBLogFilePortion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DownloadDBLogFilePortion" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DownloadDBLogFilePortionResult downloadDBLogFilePortion(DownloadDBLogFilePortionRequest request) {
        request = beforeClientExecution(request);
        return executeDownloadDBLogFilePortion(request);
    }

    @SdkInternalApi
    final DownloadDBLogFilePortionResult executeDownloadDBLogFilePortion(DownloadDBLogFilePortionRequest downloadDBLogFilePortionRequest) {

        ExecutionContext executionContext = createExecutionContext(downloadDBLogFilePortionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DownloadDBLogFilePortionRequest> request = null;
        Response<DownloadDBLogFilePortionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DownloadDBLogFilePortionRequestMarshaller().marshall(super.beforeMarshalling(downloadDBLogFilePortionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DownloadDBLogFilePortion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DownloadDBLogFilePortionResult> responseHandler = new StaxResponseHandler<DownloadDBLogFilePortionResult>(
                    new DownloadDBLogFilePortionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Forces a failover for a DB cluster.
     * </p>
     * <p>
     * A failover for a DB cluster promotes one of the Aurora Replicas (read-only instances) in the DB cluster to be the
     * primary instance (the cluster writer).
     * </p>
     * <p>
     * Amazon Aurora will automatically fail over to an Aurora Replica, if one exists, when the primary instance fails.
     * You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
     * instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
     * connections that use those endpoint addresses when the failover is complete.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param failoverDBClusterRequest
     * @return Result of the FailoverDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.FailoverDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/FailoverDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster failoverDBCluster(FailoverDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeFailoverDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeFailoverDBCluster(FailoverDBClusterRequest failoverDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(failoverDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<FailoverDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new FailoverDBClusterRequestMarshaller().marshall(super.beforeMarshalling(failoverDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "FailoverDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DBCluster failoverDBCluster() {
        return failoverDBCluster(new FailoverDBClusterRequest());
    }

    /**
     * <p>
     * Lists all tags on an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
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
     * <p>
     * Set the capacity of an Aurora Serverless DB cluster to a specific value.
     * </p>
     * <p>
     * Aurora Serverless scales seamlessly based on the workload on the DB cluster. In some cases, the capacity might
     * not scale fast enough to meet a sudden change in workload, such as a large number of new transactions. Call
     * <code>ModifyCurrentDBClusterCapacity</code> to set the capacity explicitly.
     * </p>
     * <p>
     * After this call sets the DB cluster capacity, Aurora Serverless can automatically scale the DB cluster based on
     * the cooldown period for scaling up and the cooldown period for scaling down.
     * </p>
     * <p>
     * For more information about Aurora Serverless, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html">Using Amazon Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you call <code>ModifyCurrentDBClusterCapacity</code> with the default <code>TimeoutAction</code>, connections
     * that prevent Aurora Serverless from finding a scaling point might be dropped. For more information about scaling
     * points, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling"
     * > Autoscaling for Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyCurrentDBClusterCapacityRequest
     * @return Result of the ModifyCurrentDBClusterCapacity operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterCapacityException
     *         <i>Capacity</i> isn't a valid Aurora Serverless DB cluster capacity. Valid capacity values are
     *         <code>2</code>, <code>4</code>, <code>8</code>, <code>16</code>, <code>32</code>, <code>64</code>,
     *         <code>128</code>, and <code>256</code>.
     * @sample AmazonRDS.ModifyCurrentDBClusterCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyCurrentDBClusterCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyCurrentDBClusterCapacityResult modifyCurrentDBClusterCapacity(ModifyCurrentDBClusterCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeModifyCurrentDBClusterCapacity(request);
    }

    @SdkInternalApi
    final ModifyCurrentDBClusterCapacityResult executeModifyCurrentDBClusterCapacity(ModifyCurrentDBClusterCapacityRequest modifyCurrentDBClusterCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyCurrentDBClusterCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyCurrentDBClusterCapacityRequest> request = null;
        Response<ModifyCurrentDBClusterCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyCurrentDBClusterCapacityRequestMarshaller().marshall(super.beforeMarshalling(modifyCurrentDBClusterCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyCurrentDBClusterCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyCurrentDBClusterCapacityResult> responseHandler = new StaxResponseHandler<ModifyCurrentDBClusterCapacityResult>(
                    new ModifyCurrentDBClusterCapacityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modify a setting for an Amazon Aurora DB cluster. You can change one or more database configuration parameters by
     * specifying these parameters and the new values in the request. For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterRequest
     * @return Result of the ModifyDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> doesn't refer to an existing DB cluster parameter group.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @sample AmazonRDS.ModifyDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster modifyDBCluster(ModifyDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeModifyDBCluster(ModifyDBClusterRequest modifyDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterEndpointRequest
     * @return Result of the ModifyDBClusterEndpoint operation returned by the service.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBClusterEndpointStateException
     *         The requested operation can't be performed on the endpoint while the endpoint is in this state.
     * @throws DBClusterEndpointNotFoundException
     *         The specified custom endpoint doesn't exist.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.ModifyDBClusterEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyDBClusterEndpointResult modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBClusterEndpoint(request);
    }

    @SdkInternalApi
    final ModifyDBClusterEndpointResult executeModifyDBClusterEndpoint(ModifyDBClusterEndpointRequest modifyDBClusterEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBClusterEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterEndpointRequest> request = null;
        Response<ModifyDBClusterEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBClusterEndpointRequestMarshaller().marshall(super.beforeMarshalling(modifyDBClusterEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBClusterEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyDBClusterEndpointResult> responseHandler = new StaxResponseHandler<ModifyDBClusterEndpointResult>(
                    new ModifyDBClusterEndpointResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB cluster associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
     * cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon RDS to fully
     * complete the create action before the parameter group is used as the default for a new DB cluster. This is
     * especially important for parameters that are critical when creating the default database for a DB cluster, such
     * as the character set for the default database defined by the <code>character_set_database</code> parameter. You
     * can use the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS
     * console</a> or the <a>DescribeDBClusterParameters</a> command to verify that your DB cluster parameter group has
     * been created or modified.
     * </p>
     * </important> <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterParameterGroupRequest
     * @return Result of the ModifyDBClusterParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @sample AmazonRDS.ModifyDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBClusterParameterGroup(request);
    }

    @SdkInternalApi
    final ModifyDBClusterParameterGroupResult executeModifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest modifyDBClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterParameterGroupRequest> request = null;
        Response<ModifyDBClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyDBClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyDBClusterParameterGroupResult> responseHandler = new StaxResponseHandler<ModifyDBClusterParameterGroupResult>(
                    new ModifyDBClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.
     * </p>
     * <p>
     * To share a manual DB cluster snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB cluster snapshot. Use the value <code>all</code> to make
     * the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not
     * add the <code>all</code> value for any manual DB cluster snapshots that contain private information that you
     * don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but
     * only by specifying a list of authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use
     * <code>all</code> as a value for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
     * cluster snapshot public or private, use the <a>DescribeDBClusterSnapshotAttributes</a> API action.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyDBClusterSnapshotAttributeRequest
     * @return Result of the ModifyDBClusterSnapshotAttribute operation returned by the service.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonRDS.ModifyDBClusterSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBClusterSnapshotAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBClusterSnapshotAttribute(request);
    }

    @SdkInternalApi
    final DBClusterSnapshotAttributesResult executeModifyDBClusterSnapshotAttribute(
            ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBClusterSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBClusterSnapshotAttributeRequest> request = null;
        Response<DBClusterSnapshotAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBClusterSnapshotAttributeRequestMarshaller().marshall(super.beforeMarshalling(modifyDBClusterSnapshotAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBClusterSnapshotAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBClusterSnapshotAttributesResult> responseHandler = new StaxResponseHandler<DBClusterSnapshotAttributesResult>(
                    new DBClusterSnapshotAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
     * these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
     * call <a>DescribeValidDBInstanceModifications</a> before you call <a>ModifyDBInstance</a>.
     * </p>
     * 
     * @param modifyDBInstanceRequest
     * @return Result of the ModifyDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws DBUpgradeDependencyFailureException
     *         The DB upgrade failed because a resource the DB depends on can't be modified.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws CertificateNotFoundException
     *         <i>CertificateIdentifier</i> doesn't refer to an existing certificate.
     * @throws DomainNotFoundException
     *         <i>Domain</i> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.ModifyDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance modifyDBInstance(ModifyDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeModifyDBInstance(ModifyDBInstanceRequest modifyDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(modifyDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
     * following: <code>ParameterName</code>, <code>ParameterValue</code>, and <code>ApplyMethod</code>. A maximum of 20
     * parameters can be modified in a single request.
     * </p>
     * <note>
     * <p>
     * Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
     * failover to the DB instance associated with the parameter group before the change can take effect.
     * </p>
     * </note> <important>
     * <p>
     * After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
     * that uses that DB parameter group as the default parameter group. This allows Amazon RDS to fully complete the
     * modify action before the parameter group is used as the default for a new DB instance. This is especially
     * important for parameters that are critical when creating the default database for a DB instance, such as the
     * character set for the default database defined by the <code>character_set_database</code> parameter. You can use
     * the <i>Parameter Groups</i> option of the <a href="https://console.aws.amazon.com/rds/">Amazon RDS console</a> or
     * the <i>DescribeDBParameters</i> command to verify that your DB parameter group has been created or modified.
     * </p>
     * </important>
     * 
     * @param modifyDBParameterGroupRequest
     * @return Result of the ModifyDBParameterGroup operation returned by the service.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @sample AmazonRDS.ModifyDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ModifyDBParameterGroupResult modifyDBParameterGroup(ModifyDBParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBParameterGroup(request);
    }

    @SdkInternalApi
    final ModifyDBParameterGroupResult executeModifyDBParameterGroup(ModifyDBParameterGroupRequest modifyDBParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBParameterGroupRequest> request = null;
        Response<ModifyDBParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyDBParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ModifyDBParameterGroupResult> responseHandler = new StaxResponseHandler<ModifyDBParameterGroupResult>(
                    new ModifyDBParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a manual DB snapshot, which can be encrypted or not encrypted, with a new engine version.
     * </p>
     * <p>
     * Amazon RDS supports upgrading DB snapshots for MySQL and Oracle.
     * </p>
     * 
     * @param modifyDBSnapshotRequest
     * @return Result of the ModifyDBSnapshot operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @sample AmazonRDS.ModifyDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSnapshot modifyDBSnapshot(ModifyDBSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBSnapshot(request);
    }

    @SdkInternalApi
    final DBSnapshot executeModifyDBSnapshot(ModifyDBSnapshotRequest modifyDBSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSnapshotRequest> request = null;
        Response<DBSnapshot> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBSnapshotRequestMarshaller().marshall(super.beforeMarshalling(modifyDBSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshot> responseHandler = new StaxResponseHandler<DBSnapshot>(new DBSnapshotStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds an attribute and values to, or removes an attribute and values from, a manual DB snapshot.
     * </p>
     * <p>
     * To share a manual DB snapshot with other AWS accounts, specify <code>restore</code> as the
     * <code>AttributeName</code> and use the <code>ValuesToAdd</code> parameter to add a list of IDs of the AWS
     * accounts that are authorized to restore the manual DB snapshot. Uses the value <code>all</code> to make the
     * manual DB snapshot public, which means it can be copied or restored by all AWS accounts. Do not add the
     * <code>all</code> value for any manual DB snapshots that contain private information that you don't want available
     * to all AWS accounts. If the manual DB snapshot is encrypted, it can be shared, but only by specifying a list of
     * authorized AWS account IDs for the <code>ValuesToAdd</code> parameter. You can't use <code>all</code> as a value
     * for that parameter in this case.
     * </p>
     * <p>
     * To view which AWS accounts have access to copy or restore a manual DB snapshot, or whether a manual DB snapshot
     * public or private, use the <a>DescribeDBSnapshotAttributes</a> API action.
     * </p>
     * 
     * @param modifyDBSnapshotAttributeRequest
     * @return Result of the ModifyDBSnapshotAttribute operation returned by the service.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws SharedSnapshotQuotaExceededException
     *         You have exceeded the maximum number of accounts that you can share a manual DB snapshot with.
     * @sample AmazonRDS.ModifyDBSnapshotAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshotAttribute" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DBSnapshotAttributesResult modifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBSnapshotAttribute(request);
    }

    @SdkInternalApi
    final DBSnapshotAttributesResult executeModifyDBSnapshotAttribute(ModifyDBSnapshotAttributeRequest modifyDBSnapshotAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBSnapshotAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSnapshotAttributeRequest> request = null;
        Response<DBSnapshotAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBSnapshotAttributeRequestMarshaller().marshall(super.beforeMarshalling(modifyDBSnapshotAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBSnapshotAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSnapshotAttributesResult> responseHandler = new StaxResponseHandler<DBSnapshotAttributesResult>(
                    new DBSnapshotAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
     * the AWS Region.
     * </p>
     * 
     * @param modifyDBSubnetGroupRequest
     * @return Result of the ModifyDBSubnetGroup operation returned by the service.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetQuotaExceededException
     *         The request would result in the user exceeding the allowed number of subnets in a DB subnet groups.
     * @throws SubnetAlreadyInUseException
     *         The DB subnet is already in use in the Availability Zone.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @sample AmazonRDS.ModifyDBSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDBSubnetGroup(request);
    }

    @SdkInternalApi
    final DBSubnetGroup executeModifyDBSubnetGroup(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDBSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDBSubnetGroupRequest> request = null;
        Response<DBSubnetGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDBSubnetGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyDBSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDBSubnetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSubnetGroup> responseHandler = new StaxResponseHandler<DBSubnetGroup>(new DBSubnetGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing RDS event notification subscription. Note that you can't modify the source identifiers using
     * this call; to change source identifiers for a subscription, use the <a>AddSourceIdentifierToSubscription</a> and
     * <a>RemoveSourceIdentifierFromSubscription</a> calls.
     * </p>
     * <p>
     * You can see a list of the event categories for a given SourceType in the <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a> topic in the <i>Amazon
     * RDS User Guide</i> or by using the <b>DescribeEventCategories</b> action.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws EventSubscriptionQuotaExceededException
     *         You have reached the maximum number of event subscriptions.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SNSInvalidTopicException
     *         SNS has responded that there is a problem with the SND topic specified.
     * @throws SNSNoAuthorizationException
     *         You do not have permission to publish to the SNS topic ARN.
     * @throws SNSTopicArnNotFoundException
     *         The SNS topic ARN does not exist.
     * @throws SubscriptionCategoryNotFoundException
     *         The supplied category does not exist.
     * @sample AmazonRDS.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
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
     * Modify a setting for an Amazon Aurora global cluster. You can change one or more database configuration
     * parameters by specifying these parameters and the new values in the request. For more information on Amazon
     * Aurora, see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What
     * Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param modifyGlobalClusterRequest
     * @return Result of the ModifyGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @sample AmazonRDS.ModifyGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyGlobalCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GlobalCluster modifyGlobalCluster(ModifyGlobalClusterRequest request) {
        request = beforeClientExecution(request);
        return executeModifyGlobalCluster(request);
    }

    @SdkInternalApi
    final GlobalCluster executeModifyGlobalCluster(ModifyGlobalClusterRequest modifyGlobalClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyGlobalClusterRequest> request = null;
        Response<GlobalCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyGlobalClusterRequestMarshaller().marshall(super.beforeMarshalling(modifyGlobalClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyGlobalCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalCluster> responseHandler = new StaxResponseHandler<GlobalCluster>(new GlobalClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing option group.
     * </p>
     * 
     * @param modifyOptionGroupRequest
     * @return Result of the ModifyOptionGroup operation returned by the service.
     * @throws InvalidOptionGroupStateException
     *         The option group isn't in the <i>available</i> state.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @sample AmazonRDS.ModifyOptionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyOptionGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public OptionGroup modifyOptionGroup(ModifyOptionGroupRequest request) {
        request = beforeClientExecution(request);
        return executeModifyOptionGroup(request);
    }

    @SdkInternalApi
    final OptionGroup executeModifyOptionGroup(ModifyOptionGroupRequest modifyOptionGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyOptionGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyOptionGroupRequest> request = null;
        Response<OptionGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyOptionGroupRequestMarshaller().marshall(super.beforeMarshalling(modifyOptionGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyOptionGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<OptionGroup> responseHandler = new StaxResponseHandler<OptionGroup>(new OptionGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Promotes a Read Replica DB instance to a standalone DB instance.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Backup duration is a function of the amount of changes to the database since the previous backup. If you plan to
     * promote a Read Replica to a standalone instance, we recommend that you enable backups and complete at least one
     * backup prior to promotion. In addition, a Read Replica cannot be promoted to a standalone instance when it is in
     * the <code>backing-up</code> status. If you have enabled backups on your Read Replica, configure the automated
     * backup window so that daily backups do not interfere with Read Replica promotion.
     * </p>
     * </li>
     * <li>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param promoteReadReplicaRequest
     * @return Result of the PromoteReadReplica operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.PromoteReadReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplica" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance promoteReadReplica(PromoteReadReplicaRequest request) {
        request = beforeClientExecution(request);
        return executePromoteReadReplica(request);
    }

    @SdkInternalApi
    final DBInstance executePromoteReadReplica(PromoteReadReplicaRequest promoteReadReplicaRequest) {

        ExecutionContext executionContext = createExecutionContext(promoteReadReplicaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteReadReplicaRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PromoteReadReplicaRequestMarshaller().marshall(super.beforeMarshalling(promoteReadReplicaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PromoteReadReplica");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Promotes a Read Replica DB cluster to a standalone DB cluster.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param promoteReadReplicaDBClusterRequest
     * @return Result of the PromoteReadReplicaDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.PromoteReadReplicaDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PromoteReadReplicaDBCluster"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBCluster promoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executePromoteReadReplicaDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executePromoteReadReplicaDBCluster(PromoteReadReplicaDBClusterRequest promoteReadReplicaDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(promoteReadReplicaDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PromoteReadReplicaDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PromoteReadReplicaDBClusterRequestMarshaller().marshall(super.beforeMarshalling(promoteReadReplicaDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PromoteReadReplicaDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Purchases a reserved DB instance offering.
     * </p>
     * 
     * @param purchaseReservedDBInstancesOfferingRequest
     * @return Result of the PurchaseReservedDBInstancesOffering operation returned by the service.
     * @throws ReservedDBInstancesOfferingNotFoundException
     *         Specified offering does not exist.
     * @throws ReservedDBInstanceAlreadyExistsException
     *         User already has a reservation with the given identifier.
     * @throws ReservedDBInstanceQuotaExceededException
     *         Request would exceed the user's DB Instance quota.
     * @sample AmazonRDS.PurchaseReservedDBInstancesOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/PurchaseReservedDBInstancesOffering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReservedDBInstance purchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest request) {
        request = beforeClientExecution(request);
        return executePurchaseReservedDBInstancesOffering(request);
    }

    @SdkInternalApi
    final ReservedDBInstance executePurchaseReservedDBInstancesOffering(PurchaseReservedDBInstancesOfferingRequest purchaseReservedDBInstancesOfferingRequest) {

        ExecutionContext executionContext = createExecutionContext(purchaseReservedDBInstancesOfferingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PurchaseReservedDBInstancesOfferingRequest> request = null;
        Response<ReservedDBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PurchaseReservedDBInstancesOfferingRequestMarshaller().marshall(super
                        .beforeMarshalling(purchaseReservedDBInstancesOfferingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PurchaseReservedDBInstancesOffering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ReservedDBInstance> responseHandler = new StaxResponseHandler<ReservedDBInstance>(new ReservedDBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
     * modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
     * instance for the changes to take effect.
     * </p>
     * <p>
     * Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
     * outage, during which the DB instance status is set to rebooting.
     * </p>
     * <p>
     * For more information about rebooting, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_RebootInstance.html">Rebooting a DB
     * Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param rebootDBInstanceRequest
     * @return Result of the RebootDBInstance operation returned by the service.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @sample AmazonRDS.RebootDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RebootDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance rebootDBInstance(RebootDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRebootDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeRebootDBInstance(RebootDBInstanceRequest rebootDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(rebootDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebootDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches an Aurora secondary cluster from an Aurora global database cluster. The cluster becomes a standalone
     * cluster with read-write capability instead of being read-only and receiving data from a primary cluster in a
     * different region.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeFromGlobalClusterRequest
     * @return Result of the RemoveFromGlobalCluster operation returned by the service.
     * @throws GlobalClusterNotFoundException
     * @throws InvalidGlobalClusterStateException
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.RemoveFromGlobalCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveFromGlobalCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GlobalCluster removeFromGlobalCluster(RemoveFromGlobalClusterRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveFromGlobalCluster(request);
    }

    @SdkInternalApi
    final GlobalCluster executeRemoveFromGlobalCluster(RemoveFromGlobalClusterRequest removeFromGlobalClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(removeFromGlobalClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveFromGlobalClusterRequest> request = null;
        Response<GlobalCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveFromGlobalClusterRequestMarshaller().marshall(super.beforeMarshalling(removeFromGlobalClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveFromGlobalCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GlobalCluster> responseHandler = new StaxResponseHandler<GlobalCluster>(new GlobalClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from an Amazon Aurora DB cluster. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.html"
     * >Authorizing Amazon Aurora MySQL to Access Other AWS Services on Your Behalf </a> in the <i>Amazon Aurora User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param removeRoleFromDBClusterRequest
     * @return Result of the RemoveRoleFromDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws DBClusterRoleNotFoundException
     *         The specified IAM role Amazon Resource Name (ARN) isn't associated with the specified DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.RemoveRoleFromDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBCluster" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveRoleFromDBClusterResult removeRoleFromDBCluster(RemoveRoleFromDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveRoleFromDBCluster(request);
    }

    @SdkInternalApi
    final RemoveRoleFromDBClusterResult executeRemoveRoleFromDBCluster(RemoveRoleFromDBClusterRequest removeRoleFromDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(removeRoleFromDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRoleFromDBClusterRequest> request = null;
        Response<RemoveRoleFromDBClusterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveRoleFromDBClusterRequestMarshaller().marshall(super.beforeMarshalling(removeRoleFromDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveRoleFromDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveRoleFromDBClusterResult> responseHandler = new StaxResponseHandler<RemoveRoleFromDBClusterResult>(
                    new RemoveRoleFromDBClusterResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an AWS Identity and Access Management (IAM) role from a DB instance.
     * </p>
     * 
     * @param removeRoleFromDBInstanceRequest
     * @return Result of the RemoveRoleFromDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBInstanceRoleNotFoundException
     *         The specified <i>RoleArn</i> value doesn't match the specifed feature for the DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.RemoveRoleFromDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveRoleFromDBInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RemoveRoleFromDBInstanceResult removeRoleFromDBInstance(RemoveRoleFromDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveRoleFromDBInstance(request);
    }

    @SdkInternalApi
    final RemoveRoleFromDBInstanceResult executeRemoveRoleFromDBInstance(RemoveRoleFromDBInstanceRequest removeRoleFromDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeRoleFromDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveRoleFromDBInstanceRequest> request = null;
        Response<RemoveRoleFromDBInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveRoleFromDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(removeRoleFromDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveRoleFromDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveRoleFromDBInstanceResult> responseHandler = new StaxResponseHandler<RemoveRoleFromDBInstanceResult>(
                    new RemoveRoleFromDBInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a source identifier from an existing RDS event notification subscription.
     * </p>
     * 
     * @param removeSourceIdentifierFromSubscriptionRequest
     * @return Result of the RemoveSourceIdentifierFromSubscription operation returned by the service.
     * @throws SubscriptionNotFoundException
     *         The subscription name does not exist.
     * @throws SourceNotFoundException
     *         The requested source could not be found.
     * @sample AmazonRDS.RemoveSourceIdentifierFromSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveSourceIdentifierFromSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EventSubscription removeSourceIdentifierFromSubscription(RemoveSourceIdentifierFromSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveSourceIdentifierFromSubscription(request);
    }

    @SdkInternalApi
    final EventSubscription executeRemoveSourceIdentifierFromSubscription(
            RemoveSourceIdentifierFromSubscriptionRequest removeSourceIdentifierFromSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(removeSourceIdentifierFromSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveSourceIdentifierFromSubscriptionRequest> request = null;
        Response<EventSubscription> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveSourceIdentifierFromSubscriptionRequestMarshaller().marshall(super
                        .beforeMarshalling(removeSourceIdentifierFromSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveSourceIdentifierFromSubscription");
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
     * Removes metadata tags from an Amazon RDS resource.
     * </p>
     * <p>
     * For an overview on tagging an Amazon RDS resource, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html">Tagging Amazon RDS
     * Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @sample AmazonRDS.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller().marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RemoveTagsFromResourceResult> responseHandler = new StaxResponseHandler<RemoveTagsFromResourceResult>(
                    new RemoveTagsFromResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
     * a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB cluster
     * parameter group, specify the <code>DBClusterParameterGroupName</code> and <code>ResetAllParameters</code>
     * parameters.
     * </p>
     * <p>
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <a>RebootDBInstance</a> request.
     * You must call <a>RebootDBInstance</a> for every DB instance in your DB cluster that you want the updated static
     * parameter to apply to.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param resetDBClusterParameterGroupRequest
     * @return Result of the ResetDBClusterParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBClusterParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBClusterParameterGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeResetDBClusterParameterGroup(request);
    }

    @SdkInternalApi
    final ResetDBClusterParameterGroupResult executeResetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest resetDBClusterParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(resetDBClusterParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetDBClusterParameterGroupRequest> request = null;
        Response<ResetDBClusterParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetDBClusterParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetDBClusterParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetDBClusterParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetDBClusterParameterGroupResult> responseHandler = new StaxResponseHandler<ResetDBClusterParameterGroupResult>(
                    new ResetDBClusterParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
     * provide a list of the following: <code>ParameterName</code> and <code>ApplyMethod</code>. To reset the entire DB
     * parameter group, specify the <code>DBParameterGroup</code> name and <code>ResetAllParameters</code> parameters.
     * When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
     * <code>pending-reboot</code> to take effect on the next DB instance restart or <code>RebootDBInstance</code>
     * request.
     * </p>
     * 
     * @param resetDBParameterGroupRequest
     * @return Result of the ResetDBParameterGroup operation returned by the service.
     * @throws InvalidDBParameterGroupStateException
     *         The DB parameter group is in use or is in an invalid state. If you are attempting to delete the parameter
     *         group, you can't delete it when the parameter group is in this state.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @sample AmazonRDS.ResetDBParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetDBParameterGroupResult resetDBParameterGroup(ResetDBParameterGroupRequest request) {
        request = beforeClientExecution(request);
        return executeResetDBParameterGroup(request);
    }

    @SdkInternalApi
    final ResetDBParameterGroupResult executeResetDBParameterGroup(ResetDBParameterGroupRequest resetDBParameterGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(resetDBParameterGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetDBParameterGroupRequest> request = null;
        Response<ResetDBParameterGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetDBParameterGroupRequestMarshaller().marshall(super.beforeMarshalling(resetDBParameterGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetDBParameterGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResetDBParameterGroupResult> responseHandler = new StaxResponseHandler<ResetDBParameterGroupResult>(
                    new ResetDBParameterGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Aurora DB cluster from data stored in an Amazon S3 bucket. Amazon RDS must be authorized to
     * access the Amazon S3 bucket and the data must be created using the Percona XtraBackup utility as described in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Migrating.html"> Migrating Data to
     * an Amazon Aurora MySQL DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromS3Request
     * @return Result of the RestoreDBClusterFromS3 operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSubnetGroupStateException
     *         The DB subnet group cannot be deleted because it's in use.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name can't be found or Amazon RDS isn't authorized to access the specified
     *         Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and try
     *         again.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> doesn't refer to an existing DB cluster parameter group.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @sample AmazonRDS.RestoreDBClusterFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromS3" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster restoreDBClusterFromS3(RestoreDBClusterFromS3Request request) {
        request = beforeClientExecution(request);
        return executeRestoreDBClusterFromS3(request);
    }

    @SdkInternalApi
    final DBCluster executeRestoreDBClusterFromS3(RestoreDBClusterFromS3Request restoreDBClusterFromS3Request) {

        ExecutionContext executionContext = createExecutionContext(restoreDBClusterFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterFromS3Request> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBClusterFromS3RequestMarshaller().marshall(super.beforeMarshalling(restoreDBClusterFromS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBClusterFromS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB cluster from a DB snapshot or DB cluster snapshot.
     * </p>
     * <p>
     * If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
     * configuration and default security group.
     * </p>
     * <p>
     * If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
     * with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
     * default security group.
     * </p>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterFromSnapshotRequest
     * @return Result of the RestoreDBClusterFromSnapshot operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> doesn't refer to an existing DB cluster parameter group.
     * @sample AmazonRDS.RestoreDBClusterFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreDBClusterFromSnapshot(request);
    }

    @SdkInternalApi
    final DBCluster executeRestoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreDBClusterFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterFromSnapshotRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBClusterFromSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreDBClusterFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBClusterFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
     * <code>LatestRestorableTime</code> for up to <code>BackupRetentionPeriod</code> days. The target DB cluster is
     * created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
     * cluster is created with the default DB security group.
     * </p>
     * <note>
     * <p>
     * This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
     * <a>CreateDBInstance</a> action to create DB instances for the restored DB cluster, specifying the identifier of
     * the restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB instances only after the
     * <code>RestoreDBClusterToPointInTime</code> action has completed and the DB cluster is available.
     * </p>
     * </note>
     * <p>
     * For more information on Amazon Aurora, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"> What Is Amazon
     * Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param restoreDBClusterToPointInTimeRequest
     * @return Result of the RestoreDBClusterToPointInTime operation returned by the service.
     * @throws DBClusterAlreadyExistsException
     *         The user already has a DB cluster with the given identifier.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws DBClusterQuotaExceededException
     *         The user attempted to create a new DB cluster and the user has already reached the maximum allowed DB
     *         cluster quota.
     * @throws DBClusterSnapshotNotFoundException
     *         <i>DBClusterSnapshotIdentifier</i> doesn't refer to an existing DB cluster snapshot.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws InsufficientDBClusterCapacityException
     *         The DB cluster doesn't have enough capacity for the current operation.
     * @throws InsufficientStorageClusterCapacityException
     *         There is insufficient storage available for the current action. You might be able to resolve this error
     *         by updating your subnet group to use different Availability Zones that have more storage available.
     * @throws InvalidDBClusterSnapshotStateException
     *         The supplied value isn't a valid DB cluster snapshot state.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBClusterParameterGroupNotFoundException
     *         <i>DBClusterParameterGroupName</i> doesn't refer to an existing DB cluster parameter group.
     * @sample AmazonRDS.RestoreDBClusterToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreDBClusterToPointInTime(request);
    }

    @SdkInternalApi
    final DBCluster executeRestoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest restoreDBClusterToPointInTimeRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreDBClusterToPointInTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBClusterToPointInTimeRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBClusterToPointInTimeRequestMarshaller().marshall(super.beforeMarshalling(restoreDBClusterToPointInTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBClusterToPointInTime");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new DB instance from a DB snapshot. The target database is created from the source database restore
     * point with the most of original configuration with the default security group and the default DB parameter group.
     * By default, the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server
     * instance that has an option group that is associated with mirroring; in this case, the instance becomes a
     * mirrored AZ deployment and not a single-AZ deployment.
     * </p>
     * <p>
     * If your intent is to replace your original DB instance with the new, restored DB instance, then rename your
     * original DB instance before you call the RestoreDBInstanceFromDBSnapshot action. RDS doesn't allow two DB
     * instances with the same name. Once you have renamed your original DB instance with a different identifier, then
     * you can pass the original name of the DB instance as the DBInstanceIdentifier in the call to the
     * RestoreDBInstanceFromDBSnapshot action. The result is that you will replace the original DB instance with the DB
     * instance created from the snapshot.
     * </p>
     * <p>
     * If you are restoring from a shared manual DB snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of
     * the shared DB snapshot.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterFromSnapshot</a>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceFromDBSnapshotRequest
     * @return Result of the RestoreDBInstanceFromDBSnapshot operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBSnapshotNotFoundException
     *         <i>DBSnapshotIdentifier</i> doesn't refer to an existing DB snapshot.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws InvalidDBSnapshotStateException
     *         The state of the DB snapshot doesn't allow deletion.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <i>Domain</i> doesn't refer to an existing Active Directory domain.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.RestoreDBInstanceFromDBSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromDBSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBInstance restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreDBInstanceFromDBSnapshot(request);
    }

    @SdkInternalApi
    final DBInstance executeRestoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceFromDBSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceFromDBSnapshotRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBInstanceFromDBSnapshotRequestMarshaller().marshall(super.beforeMarshalling(restoreDBInstanceFromDBSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBInstanceFromDBSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Amazon Relational Database Service (Amazon RDS) supports importing MySQL databases by using backup files. You can
     * create a backup of your on-premises database, store it on Amazon Simple Storage Service (Amazon S3), and then
     * restore the backup file onto a new Amazon RDS DB instance running MySQL. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html">Importing Data into
     * an Amazon RDS MySQL DB Instance</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param restoreDBInstanceFromS3Request
     * @return Result of the RestoreDBInstanceFromS3 operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidS3BucketException
     *         The specified Amazon S3 bucket name can't be found or Amazon RDS isn't authorized to access the specified
     *         Amazon S3 bucket. Verify the <b>SourceS3BucketName</b> and <b>S3IngestionRoleArn</b> values and try
     *         again.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws BackupPolicyNotFoundException
     * @sample AmazonRDS.RestoreDBInstanceFromS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceFromS3" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DBInstance restoreDBInstanceFromS3(RestoreDBInstanceFromS3Request request) {
        request = beforeClientExecution(request);
        return executeRestoreDBInstanceFromS3(request);
    }

    @SdkInternalApi
    final DBInstance executeRestoreDBInstanceFromS3(RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request) {

        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceFromS3Request> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBInstanceFromS3RequestMarshaller().marshall(super.beforeMarshalling(restoreDBInstanceFromS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBInstanceFromS3");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a DB instance to an arbitrary point in time. You can restore to any point in time before the time
     * identified by the LatestRestorableTime property. You can restore to a point up to the number of days specified by
     * the BackupRetentionPeriod property.
     * </p>
     * <p>
     * The target database is created with most of the original configuration, but in a system-selected Availability
     * Zone, with the default security group, the default subnet group, and the default DB parameter group. By default,
     * the new DB instance is created as a single-AZ deployment except when the instance is a SQL Server instance that
     * has an option group that is associated with mirroring; in this case, the instance becomes a mirrored deployment
     * and not a single-AZ deployment.
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora, use
     * <a>RestoreDBClusterToPointInTime</a>.
     * </p>
     * </note>
     * 
     * @param restoreDBInstanceToPointInTimeRequest
     * @return Result of the RestoreDBInstanceToPointInTime operation returned by the service.
     * @throws DBInstanceAlreadyExistsException
     *         The user already has a DB instance with the given identifier.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InstanceQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB instances.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws PointInTimeRestoreNotEnabledException
     *         <i>SourceDBInstanceIdentifier</i> refers to a DB instance with <i>BackupRetentionPeriod</i> equal to 0.
     * @throws StorageQuotaExceededException
     *         The request would result in the user exceeding the allowed amount of storage available across all DB
     *         instances.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws InvalidRestoreException
     *         Cannot restore from VPC backup to non-VPC DB instance.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws ProvisionedIopsNotAvailableInAZException
     *         Provisioned IOPS not available in the specified Availability Zone.
     * @throws OptionGroupNotFoundException
     *         The specified option group could not be found.
     * @throws StorageTypeNotSupportedException
     *         Storage of the <i>StorageType</i> specified can't be associated with the DB instance.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws DomainNotFoundException
     *         <i>Domain</i> doesn't refer to an existing Active Directory domain.
     * @throws BackupPolicyNotFoundException
     * @throws DBParameterGroupNotFoundException
     *         <i>DBParameterGroupName</i> doesn't refer to an existing DB parameter group.
     * @throws DBInstanceAutomatedBackupNotFoundException
     *         No automated backup for this DB instance was found.
     * @sample AmazonRDS.RestoreDBInstanceToPointInTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceToPointInTime"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBInstance restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreDBInstanceToPointInTime(request);
    }

    @SdkInternalApi
    final DBInstance executeRestoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreDBInstanceToPointInTimeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreDBInstanceToPointInTimeRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreDBInstanceToPointInTimeRequestMarshaller().marshall(super.beforeMarshalling(restoreDBInstanceToPointInTimeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreDBInstanceToPointInTime");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes ingress from a DBSecurityGroup for previously authorized IP ranges or EC2 or VPC Security Groups.
     * Required parameters for this API are one of CIDRIP, EC2SecurityGroupId for VPC, or (EC2SecurityGroupOwnerId and
     * either EC2SecurityGroupName or EC2SecurityGroupId).
     * </p>
     * 
     * @param revokeDBSecurityGroupIngressRequest
     * @return Result of the RevokeDBSecurityGroupIngress operation returned by the service.
     * @throws DBSecurityGroupNotFoundException
     *         <i>DBSecurityGroupName</i> doesn't refer to an existing DB security group.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws InvalidDBSecurityGroupStateException
     *         The state of the DB security group doesn't allow deletion.
     * @sample AmazonRDS.RevokeDBSecurityGroupIngress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RevokeDBSecurityGroupIngress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DBSecurityGroup revokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeDBSecurityGroupIngress(request);
    }

    @SdkInternalApi
    final DBSecurityGroup executeRevokeDBSecurityGroupIngress(RevokeDBSecurityGroupIngressRequest revokeDBSecurityGroupIngressRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeDBSecurityGroupIngressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeDBSecurityGroupIngressRequest> request = null;
        Response<DBSecurityGroup> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeDBSecurityGroupIngressRequestMarshaller().marshall(super.beforeMarshalling(revokeDBSecurityGroupIngressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeDBSecurityGroupIngress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBSecurityGroup> responseHandler = new StaxResponseHandler<DBSecurityGroup>(new DBSecurityGroupStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an Amazon Aurora DB cluster that was stopped using the AWS console, the stop-db-cluster AWS CLI command,
     * or the StopDBCluster action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param startDBClusterRequest
     * @return Result of the StartDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.StartDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster startDBCluster(StartDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeStartDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeStartDBCluster(StartDBClusterRequest startDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(startDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDBClusterRequestMarshaller().marshall(super.beforeMarshalling(startDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts an Amazon RDS DB instance that was stopped using the AWS console, the stop-db-instance AWS CLI command, or
     * the StopDBInstance action.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StartInstance.html"> Starting an Amazon RDS DB
     * instance That Was Previously Stopped</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora DB clusters, use
     * <a>StartDBCluster</a> instead.
     * </p>
     * </note>
     * 
     * @param startDBInstanceRequest
     * @return Result of the StartDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws InsufficientDBInstanceCapacityException
     *         The specified DB instance class isn't available in the specified Availability Zone.
     * @throws DBSubnetGroupNotFoundException
     *         <i>DBSubnetGroupName</i> doesn't refer to an existing DB subnet group.
     * @throws DBSubnetGroupDoesNotCoverEnoughAZsException
     *         Subnets in the DB subnet group should cover at least two Availability Zones unless there is only one
     *         Availability Zone.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidSubnetException
     *         The requested subnet is invalid, or multiple subnets were requested that are not all in a common VPC.
     * @throws InvalidVPCNetworkStateException
     *         The DB subnet group doesn't cover all Availability Zones after it's created because of users' change.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws AuthorizationNotFoundException
     *         The specified CIDRIP or Amazon EC2 security group isn't authorized for the specified DB security
     *         group.</p>
     *         <p>
     *         RDS also may not be authorized by using IAM to perform necessary actions on your behalf.
     * @throws KMSKeyNotAccessibleException
     *         An error occurred accessing an AWS KMS key.
     * @sample AmazonRDS.StartDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance startDBInstance(StartDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeStartDBInstance(StartDBInstanceRequest startDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(startDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an Amazon Aurora DB cluster. When you stop a DB cluster, Aurora retains the DB cluster's metadata,
     * including its endpoints and DB parameter groups. Aurora also retains the transaction logs so you can do a
     * point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-cluster-stop-start.html"> Stopping and
     * Starting an Aurora Cluster</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This action only applies to Aurora DB clusters.
     * </p>
     * </note>
     * 
     * @param stopDBClusterRequest
     * @return Result of the StopDBCluster operation returned by the service.
     * @throws DBClusterNotFoundException
     *         <i>DBClusterIdentifier</i> doesn't refer to an existing DB cluster.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @sample AmazonRDS.StopDBCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBCluster" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBCluster stopDBCluster(StopDBClusterRequest request) {
        request = beforeClientExecution(request);
        return executeStopDBCluster(request);
    }

    @SdkInternalApi
    final DBCluster executeStopDBCluster(StopDBClusterRequest stopDBClusterRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDBClusterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDBClusterRequest> request = null;
        Response<DBCluster> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDBClusterRequestMarshaller().marshall(super.beforeMarshalling(stopDBClusterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDBCluster");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBCluster> responseHandler = new StaxResponseHandler<DBCluster>(new DBClusterStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an Amazon RDS DB instance. When you stop a DB instance, Amazon RDS retains the DB instance's metadata,
     * including its endpoint, DB parameter group, and option group membership. Amazon RDS also retains the transaction
     * logs so you can do a point-in-time restore if necessary.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_StopInstance.html"> Stopping an Amazon RDS DB
     * Instance Temporarily</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <note>
     * <p>
     * This command doesn't apply to Aurora MySQL and Aurora PostgreSQL. For Aurora clusters, use <a>StopDBCluster</a>
     * instead.
     * </p>
     * </note>
     * 
     * @param stopDBInstanceRequest
     * @return Result of the StopDBInstance operation returned by the service.
     * @throws DBInstanceNotFoundException
     *         <i>DBInstanceIdentifier</i> doesn't refer to an existing DB instance.
     * @throws InvalidDBInstanceStateException
     *         The DB instance isn't in a valid state.
     * @throws DBSnapshotAlreadyExistsException
     *         <i>DBSnapshotIdentifier</i> is already used by an existing snapshot.
     * @throws SnapshotQuotaExceededException
     *         The request would result in the user exceeding the allowed number of DB snapshots.
     * @throws InvalidDBClusterStateException
     *         The requested operation can't be performed while the cluster is in this state.
     * @sample AmazonRDS.StopDBInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DBInstance stopDBInstance(StopDBInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStopDBInstance(request);
    }

    @SdkInternalApi
    final DBInstance executeStopDBInstance(StopDBInstanceRequest stopDBInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopDBInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDBInstanceRequest> request = null;
        Response<DBInstance> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDBInstanceRequestMarshaller().marshall(super.beforeMarshalling(stopDBInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "RDS");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopDBInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DBInstance> responseHandler = new StaxResponseHandler<DBInstance>(new DBInstanceStaxUnmarshaller());
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
    public AmazonRDSWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonRDSWaiters(this);
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
