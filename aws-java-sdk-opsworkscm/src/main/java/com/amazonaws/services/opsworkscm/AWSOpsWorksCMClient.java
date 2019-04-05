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
package com.amazonaws.services.opsworkscm;

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

import com.amazonaws.services.opsworkscm.AWSOpsWorksCMClientBuilder;
import com.amazonaws.services.opsworkscm.waiters.AWSOpsWorksCMWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.services.opsworkscm.model.transform.*;

/**
 * Client for accessing OpsWorksCM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS OpsWorks CM</fullname>
 * <p>
 * AWS OpsWorks for configuration management (CM) is a service that runs and manages configuration management servers.
 * You can use AWS OpsWorks CM to create and manage AWS OpsWorks for Chef Automate and AWS OpsWorks for Puppet
 * Enterprise servers, and add or remove nodes for the servers to manage.
 * </p>
 * <p>
 * <b>Glossary of terms</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A configuration management server that can be highly-available. The configuration management server
 * runs on an Amazon Elastic Compute Cloud (EC2) instance, and may use various other AWS services, such as Amazon
 * Relational Database Service (RDS) and Elastic Load Balancing. A server is a generic abstraction over the
 * configuration manager that you want to use, much like Amazon RDS. In AWS OpsWorks CM, you do not start or stop
 * servers. After you create servers, they continue to run until they are deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Engine</b>: The engine is the specific configuration manager that you want to use. Valid values in this release
 * include <code>Chef</code> and <code>Puppet</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Backup</b>: This is an application-level backup of the data that the configuration manager stores. AWS OpsWorks CM
 * creates an S3 bucket for backups when you launch the first server. A backup maintains a snapshot of a server's
 * configuration-related attributes at the time the backup starts.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Events</b>: Events are always related to a server. Events are written during server creation, when health checks
 * run, when backups are created, when system maintenance is performed, etc. When you delete a server, the server's
 * events are also deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Account attributes</b>: Every account has attributes that are assigned in the AWS OpsWorks CM database. These
 * attributes store information about configuration limits (servers, backups, etc.) and your customer account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks CM supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Your
 * servers can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks-cm.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Throttling limits</b>
 * </p>
 * <p>
 * All API operations allow for five requests per second with a burst of 10 requests per second.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpsWorksCMClient extends AmazonWebServiceClient implements AWSOpsWorksCM {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSOpsWorksCM.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "opsworks-cm";

    private volatile AWSOpsWorksCMWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.ValidationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.ResourceAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidStateException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.InvalidStateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.opsworkscm.model.LimitExceededException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.opsworkscm.model.AWSOpsWorksCMException.class));

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM. A credentials provider chain will be used that
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
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSOpsWorksCMClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksCMClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSOpsWorksCMClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSOpsWorksCMClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksCMClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSOpsWorksCMClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSOpsWorksCMClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to OpsWorksCM (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSOpsWorksCMClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSOpsWorksCMClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSOpsWorksCMClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSOpsWorksCMClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSOpsWorksCMClientBuilder builder() {
        return AWSOpsWorksCMClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksCMClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on OpsWorksCM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSOpsWorksCMClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("opsworks-cm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/opsworkscm/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/opsworkscm/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a new node with the server. For more information about how to disassociate a node, see
     * <a>DisassociateNode</a>.
     * </p>
     * <p>
     * On a Chef server: This command is an alternative to <code>knife bootstrap</code>.
     * </p>
     * <p>
     * Example (Chef):
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>CHEF_ORGANIZATION</i>,Value=default" "Name=<i>CHEF_NODE_PUBLIC_KEY</i>,Value=<i>public-key-pem</i>"</code>
     * </p>
     * <p>
     * On a Puppet server, this command is an alternative to the <code>puppet cert sign</code> command that signs a
     * Puppet node CSR.
     * </p>
     * <p>
     * Example (Chef):
     * <code>aws opsworks-cm associate-node --server-name <i>MyServer</i> --node-name <i>MyManagedNode</i> --engine-attributes "Name=<i>PUPPET_NODE_CSR</i>,Value=<i>csr-pem</i>"</code>
     * </p>
     * <p>
     * A node can can only be associated with servers that are in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid. The
     * AssociateNode API call can be integrated into Auto Scaling configurations, AWS Cloudformation templates, or the
     * user data of a server's instance.
     * </p>
     * 
     * @param associateNodeRequest
     * @return Result of the AssociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.AssociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/AssociateNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AssociateNodeResult associateNode(AssociateNodeRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateNode(request);
    }

    @SdkInternalApi
    final AssociateNodeResult executeAssociateNode(AssociateNodeRequest associateNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(associateNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateNodeRequest> request = null;
        Response<AssociateNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application-level backup of a server. While the server is in the <code>BACKING_UP</code> state, the
     * server cannot be changed, and no additional backup can be created.
     * </p>
     * <p>
     * Backups can be created for servers in <code>RUNNING</code>, <code>HEALTHY</code>, and <code>UNHEALTHY</code>
     * states. By default, you can create a maximum of 50 manual backups.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when the maximum number of manual backups is reached. An
     * <code>InvalidStateException</code> is thrown when the server is not in any of the following states: RUNNING,
     * HEALTHY, or UNHEALTHY. A <code>ResourceNotFoundException</code> is thrown when the server is not found. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param createBackupRequest
     * @return Result of the CreateBackup operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws LimitExceededException
     *         The limit of servers or backups has been reached.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackup(request);
    }

    @SdkInternalApi
    final CreateBackupResult executeCreateBackup(CreateBackupRequest createBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupRequest> request = null;
        Response<CreateBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates and immedately starts a new server. The server is ready to use when it is in the <code>HEALTHY</code>
     * state. By default, you can create a maximum of 10 servers.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * A <code>LimitExceededException</code> is thrown when you have created the maximum number of servers (10). A
     * <code>ResourceAlreadyExistsException</code> is thrown when a server with the same name already exists in the
     * account. A <code>ResourceNotFoundException</code> is thrown when you specify a backup ID that is not valid or is
     * for a backup that does not exist. A <code>ValidationException</code> is thrown when parameters of the request are
     * not valid.
     * </p>
     * <p>
     * If you do not specify a security group by adding the <code>SecurityGroupIds</code> parameter, AWS OpsWorks
     * creates a new security group.
     * </p>
     * <p>
     * <i>Chef Automate:</i> The default security group opens the Chef server to the world on TCP port 443. If a KeyName
     * is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.
     * </p>
     * <p>
     * <i>Puppet Enterprise:</i> The default security group opens TCP ports 22, 443, 4433, 8140, 8142, 8143, and 8170.
     * If a KeyName is present, AWS OpsWorks enables SSH access. SSH is also open to the world on TCP port 22.
     * </p>
     * <p>
     * By default, your server is accessible from any IP address. We recommend that you update your security group rules
     * to allow access from known IP addresses and address ranges only. To edit security group rules, open Security
     * Groups in the navigation pane of the EC2 management console.
     * </p>
     * 
     * @param createServerRequest
     * @return Result of the CreateServer operation returned by the service.
     * @throws LimitExceededException
     *         The limit of servers or backups has been reached.
     * @throws ResourceAlreadyExistsException
     *         The requested resource cannot be created because it already exists.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.CreateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/CreateServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateServerResult createServer(CreateServerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateServer(request);
    }

    @SdkInternalApi
    final CreateServerResult executeCreateServer(CreateServerRequest createServerRequest) {

        ExecutionContext executionContext = createExecutionContext(createServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateServerRequest> request = null;
        Response<CreateServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a backup. You can delete both manual and automated backups. This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a backup deletion is already in progress. A
     * <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is thrown when parameters of the request are not valid.
     * </p>
     * 
     * @param deleteBackupRequest
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackup(request);
    }

    @SdkInternalApi
    final DeleteBackupResult executeDeleteBackup(DeleteBackupRequest deleteBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the server and the underlying AWS CloudFormation stacks (including the server's EC2 instance). When you
     * run this command, the server state is updated to <code>DELETING</code>. After the server is deleted, it is no
     * longer returned by <code>DescribeServer</code> requests. If the AWS CloudFormation stack cannot be deleted, the
     * server cannot be deleted.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when a server deletion is already in progress. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * <p>
     * </p>
     * 
     * @param deleteServerRequest
     * @return Result of the DeleteServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DeleteServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DeleteServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteServerResult deleteServer(DeleteServerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteServer(request);
    }

    @SdkInternalApi
    final DeleteServerResult executeDeleteServer(DeleteServerRequest deleteServerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteServerRequest> request = null;
        Response<DeleteServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes your account attributes, and creates requests to increase limits before they are reached or exceeded.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSOpsWorksCM.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeAccountAttributes"
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
                request = new DescribeAccountAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAccountAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAccountAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes backups. The results are ordered by time, with newest backups first. If you do not specify a BackupId
     * or ServerName, the command returns all backups.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the backup does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeBackupsRequest
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @sample AWSOpsWorksCM.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackups(request);
    }

    @SdkInternalApi
    final DescribeBackupsResult executeDescribeBackups(DescribeBackupsRequest describeBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupsRequest> request = null;
        Response<DescribeBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes events for a specified server. Results are ordered by time, with newest events first.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @sample AWSOpsWorksCM.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeEvents" target="_top">AWS API
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
                request = new DescribeEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the current status of an existing association or disassociation request.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when no recent association or disassociation request with the
     * specified token is found, or when the server does not exist. A <code>ValidationException</code> is raised when
     * parameters of the request are not valid.
     * </p>
     * 
     * @param describeNodeAssociationStatusRequest
     * @return Result of the DescribeNodeAssociationStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DescribeNodeAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeNodeAssociationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNodeAssociationStatusResult describeNodeAssociationStatus(DescribeNodeAssociationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNodeAssociationStatus(request);
    }

    @SdkInternalApi
    final DescribeNodeAssociationStatusResult executeDescribeNodeAssociationStatus(DescribeNodeAssociationStatusRequest describeNodeAssociationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNodeAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNodeAssociationStatusRequest> request = null;
        Response<DescribeNodeAssociationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNodeAssociationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeNodeAssociationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNodeAssociationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeNodeAssociationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeNodeAssociationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all configuration management servers that are identified with your account. Only the stored results from
     * Amazon DynamoDB are returned. AWS OpsWorks CM does not query other services.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param describeServersRequest
     * @return Result of the DescribeServers operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws InvalidNextTokenException
     *         This occurs when the provided nextToken is not valid.
     * @sample AWSOpsWorksCM.DescribeServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeServers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeServersResult describeServers(DescribeServersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeServers(request);
    }

    @SdkInternalApi
    final DescribeServersResult executeDescribeServers(DescribeServersRequest describeServersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeServersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServersRequest> request = null;
        Response<DescribeServersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeServersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeServers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeServersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeServersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a node from an AWS OpsWorks CM server, and removes the node from the server's managed nodes. After
     * a node is disassociated, the node key pair is no longer valid for accessing the configuration manager's API. For
     * more information about how to associate a node, see <a>AssociateNode</a>.
     * </p>
     * <p>
     * A node can can only be disassociated from a server that is in a <code>HEALTHY</code> state. Otherwise, an
     * <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the server
     * does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param disassociateNodeRequest
     * @return Result of the DisassociateNode operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.DisassociateNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DisassociateNode" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DisassociateNodeResult disassociateNode(DisassociateNodeRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateNode(request);
    }

    @SdkInternalApi
    final DisassociateNodeResult executeDisassociateNode(DisassociateNodeRequest disassociateNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateNodeRequest> request = null;
        Response<DisassociateNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a specified server engine attribute as a base64-encoded string. For example, you can export user data
     * that you can use in EC2 to associate nodes with a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * <p>
     * A <code>ValidationException</code> is raised when parameters of the request are not valid. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. An
     * <code>InvalidStateException</code> is thrown when the server is in any of the following states: CREATING,
     * TERMINATED, FAILED or DELETING.
     * </p>
     * 
     * @param exportServerEngineAttributeRequest
     * @return Result of the ExportServerEngineAttribute operation returned by the service.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @sample AWSOpsWorksCM.ExportServerEngineAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/ExportServerEngineAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExportServerEngineAttributeResult exportServerEngineAttribute(ExportServerEngineAttributeRequest request) {
        request = beforeClientExecution(request);
        return executeExportServerEngineAttribute(request);
    }

    @SdkInternalApi
    final ExportServerEngineAttributeResult executeExportServerEngineAttribute(ExportServerEngineAttributeRequest exportServerEngineAttributeRequest) {

        ExecutionContext executionContext = createExecutionContext(exportServerEngineAttributeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportServerEngineAttributeRequest> request = null;
        Response<ExportServerEngineAttributeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportServerEngineAttributeRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(exportServerEngineAttributeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExportServerEngineAttribute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportServerEngineAttributeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExportServerEngineAttributeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a backup to a server that is in a <code>CONNECTION_LOST</code>, <code>HEALTHY</code>,
     * <code>RUNNING</code>, <code>UNHEALTHY</code>, or <code>TERMINATED</code> state. When you run RestoreServer, the
     * server's EC2 instance is deleted, and a new EC2 instance is configured. RestoreServer maintains the existing
     * server endpoint, so configuration management of the server's client devices (nodes) should continue to work.
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * An <code>InvalidStateException</code> is thrown when the server is not in a valid state. A
     * <code>ResourceNotFoundException</code> is thrown when the server does not exist. A
     * <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param restoreServerRequest
     * @return Result of the RestoreServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.RestoreServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/RestoreServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RestoreServerResult restoreServer(RestoreServerRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreServer(request);
    }

    @SdkInternalApi
    final RestoreServerResult executeRestoreServer(RestoreServerRequest restoreServerRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreServerRequest> request = null;
        Response<RestoreServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(restoreServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RestoreServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Manually starts server maintenance. This command can be useful if an earlier maintenance attempt failed, and the
     * underlying cause of maintenance failure has been resolved. The server is in an <code>UNDER_MAINTENANCE</code>
     * state while maintenance is in progress.
     * </p>
     * <p>
     * Maintenance can only be started on servers in <code>HEALTHY</code> and <code>UNHEALTHY</code> states. Otherwise,
     * an <code>InvalidStateException</code> is thrown. A <code>ResourceNotFoundException</code> is thrown when the
     * server does not exist. A <code>ValidationException</code> is raised when parameters of the request are not valid.
     * </p>
     * 
     * @param startMaintenanceRequest
     * @return Result of the StartMaintenance operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.StartMaintenance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/StartMaintenance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartMaintenanceResult startMaintenance(StartMaintenanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartMaintenance(request);
    }

    @SdkInternalApi
    final StartMaintenanceResult executeStartMaintenance(StartMaintenanceRequest startMaintenanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startMaintenanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartMaintenanceRequest> request = null;
        Response<StartMaintenanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartMaintenanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startMaintenanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartMaintenance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartMaintenanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartMaintenanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates settings for a server.
     * </p>
     * <p>
     * This operation is synchronous.
     * </p>
     * 
     * @param updateServerRequest
     * @return Result of the UpdateServer operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.UpdateServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServer" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServerResult updateServer(UpdateServerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServer(request);
    }

    @SdkInternalApi
    final UpdateServerResult executeUpdateServer(UpdateServerRequest updateServerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServerRequest> request = null;
        Response<UpdateServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates engine-specific attributes on a specified server. The server enters the <code>MODIFYING</code> state when
     * this operation is in progress. Only one update can occur at a time. You can use this command to reset a Chef
     * server's public key (<code>CHEF_PIVOTAL_KEY</code>) or a Puppet server's admin password (
     * <code>PUPPET_ADMIN_PASSWORD</code>).
     * </p>
     * <p>
     * This operation is asynchronous.
     * </p>
     * <p>
     * This operation can only be called for servers in <code>HEALTHY</code> or <code>UNHEALTHY</code> states.
     * Otherwise, an <code>InvalidStateException</code> is raised. A <code>ResourceNotFoundException</code> is thrown
     * when the server does not exist. A <code>ValidationException</code> is raised when parameters of the request are
     * not valid.
     * </p>
     * 
     * @param updateServerEngineAttributesRequest
     * @return Result of the UpdateServerEngineAttributes operation returned by the service.
     * @throws InvalidStateException
     *         The resource is in a state that does not allow you to perform a specified action.
     * @throws ResourceNotFoundException
     *         The requested resource does not exist, or access was denied.
     * @throws ValidationException
     *         One or more of the provided request parameters are not valid.
     * @sample AWSOpsWorksCM.UpdateServerEngineAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/UpdateServerEngineAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateServerEngineAttributesResult updateServerEngineAttributes(UpdateServerEngineAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServerEngineAttributes(request);
    }

    @SdkInternalApi
    final UpdateServerEngineAttributesResult executeUpdateServerEngineAttributes(UpdateServerEngineAttributesRequest updateServerEngineAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServerEngineAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServerEngineAttributesRequest> request = null;
        Response<UpdateServerEngineAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServerEngineAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateServerEngineAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "OpsWorksCM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServerEngineAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServerEngineAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateServerEngineAttributesResultJsonUnmarshaller());
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
    public AWSOpsWorksCMWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AWSOpsWorksCMWaiters(this);
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
