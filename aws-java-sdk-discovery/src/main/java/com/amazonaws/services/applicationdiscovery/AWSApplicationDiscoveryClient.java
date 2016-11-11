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
package com.amazonaws.services.applicationdiscovery;

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

import com.amazonaws.services.applicationdiscovery.model.*;
import com.amazonaws.services.applicationdiscovery.model.transform.*;

/**
 * Client for accessing AWS Application Discovery Service. All service calls made using this client are blocking, and
 * will not return until the service call completes.
 * <p>
 * <p>
 * The AWS Application Discovery Service helps Systems Integrators quickly and reliably plan application migration
 * projects by automatically identifying applications running in on-premises data centers, their associated
 * dependencies, and their performance profile.
 * </p>
 * <p>
 * Planning data center migrations can involve thousands of workloads that are often deeply interdependent. Application
 * discovery and dependency mapping are important early first steps in the migration process, but difficult to perform
 * at scale due to the lack of automated tools.
 * </p>
 * <p>
 * The AWS Application Discovery Service automatically collects configuration and usage data from servers to develop a
 * list of applications, how they perform, and how they are interdependent. This information is securely retained in an
 * AWS Application Discovery Service database which you can export as a CSV file into your preferred visualization tool
 * or cloud migration solution to help reduce the complexity and time in planning your cloud migration.
 * </p>
 * <p>
 * The Application Discovery Service is currently available for preview. Only customers who are engaged with <a
 * href="https://aws.amazon.com/professional-services/">AWS Professional Services</a> or a certified AWS partner can use
 * the service. To see the list of certified partners and request access to the Application Discovery Service, complete
 * the following <a href="http://aws.amazon.com/application-discovery/preview/">preview form</a>.
 * </p>
 * <p>
 * This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for the
 * Discovery Service. The topic for each action shows the API request parameters and the response. Alternatively, you
 * can use one of the AWS SDKs to access an API that is tailored to the programming language or platform that you're
 * using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * This guide is intended for use with the <a
 * href="http://docs.aws.amazon.com/application-discovery/latest/userguide/what-is-appdiscovery.html"> <i>AWS Discovery
 * Service User Guide</i> </a>.
 * </p>
 * <p>
 * The following are short descriptions of each API action, organized by function.
 * </p>
 * <p>
 * <b>Managing AWS Agents Using the Application Discovery Service</b>
 * </p>
 * <p>
 * An AWS agent is software that you install on on-premises servers and virtual machines that are targeted for discovery
 * and migration. Agents run on Linux and Windows Server and collect server configuration and activity information about
 * your applications and infrastructure. Specifically, agents collect the following information and send it to the
 * Application Discovery Service using Secure Sockets Layer (SSL) encryption:
 * </p>
 * <ul>
 * <li>
 * <p>
 * User information (user name, home directory)
 * </p>
 * </li>
 * <li>
 * <p>
 * Group information (name)
 * </p>
 * </li>
 * <li>
 * <p>
 * List of installed packages
 * </p>
 * </li>
 * <li>
 * <p>
 * List of kernel modules
 * </p>
 * </li>
 * <li>
 * <p>
 * All create and stop process events
 * </p>
 * </li>
 * <li>
 * <p>
 * DNS queries
 * </p>
 * </li>
 * <li>
 * <p>
 * NIC information
 * </p>
 * </li>
 * <li>
 * <p>
 * TCP/UDP process listening ports
 * </p>
 * </li>
 * <li>
 * <p>
 * TCPV4/V6 connections
 * </p>
 * </li>
 * <li>
 * <p>
 * Operating system information
 * </p>
 * </li>
 * <li>
 * <p>
 * System performance
 * </p>
 * </li>
 * <li>
 * <p>
 * Process performance
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Application Discovery Service API includes the following actions to manage AWS agents:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>StartDataCollectionByAgentIds</i>: Instructs the specified agents to start collecting data. The Application
 * Discovery Service takes several minutes to receive and process data after you initiate data collection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>StopDataCollectionByAgentIds</i>: Instructs the specified agents to stop collecting data.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeAgents</i>: Lists AWS agents by ID or lists all agents associated with your user account if you did not
 * specify an agent ID. The output includes agent IDs, IP addresses, media access control (MAC) addresses, agent health,
 * host name where the agent resides, and the version number of each agent.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Querying Configuration Items</b>
 * </p>
 * <p>
 * A <i>configuration item</i> is an IT asset that was discovered in your data center by an AWS agent. When you use the
 * Application Discovery Service, you can specify filters and query specific configuration items. The service supports
 * Server, Process, and Connection configuration items. This means you can specify a value for the following keys and
 * query your IT assets:
 * </p>
 * <p class="title">
 * <b>Server</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * server.HostName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * server.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.agentId
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Process</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * process.name
 * </p>
 * </li>
 * <li>
 * <p>
 * process.CommandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * process.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * server.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * server.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * server.agentId
 * </p>
 * </li>
 * </ul>
 * <p class="title">
 * <b>Connection</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * connection.sourceIp
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.sourcePort
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.destinationIp
 * </p>
 * </li>
 * <li>
 * <p>
 * connection.destinationPort
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.commandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceProcess.name
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcessId.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcess.commandLine
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationProcess.name
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * sourceServer.osVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.configurationId
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.hostName
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.osName
 * </p>
 * </li>
 * <li>
 * <p>
 * destinationServer.osVersion
 * </p>
 * </li>
 * </ul>
 * <p>
 * The Application Discovery Service includes the following actions for querying configuration items.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>DescribeConfigurations</i>: Retrieves a list of attributes for a specific configuration ID. For example, the
 * output for a <i>server</i> configuration item includes a list of attributes about the server, including host name,
 * operating system, number of network cards, etc.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListConfigurations</i>: Retrieves a list of configuration items according to the criteria you specify in a filter.
 * The filter criteria identify relationship requirements. For example, you can specify filter criteria of process.name
 * with values of <i>nginx</i> and <i>apache</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging Discovered Configuration Items</b>
 * </p>
 * <p>
 * You can tag discovered configuration items. Tags are metadata that help you categorize IT assets in your data center.
 * Tags use a <i>key</i>-<i>value</i> format. For example, <code>{"key": "serverType", "value": "webServer"}</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>CreateTags</i>: Creates one or more tags for a configuration items.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeTags</i>: Retrieves a list of configuration items that are tagged with a specific tag. <i>Or</i>,
 * retrieves a list of all tags assigned to a specific configuration item.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteTags</i>: Deletes the association between a configuration item and one or more tags.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Exporting Data</b>
 * </p>
 * <p>
 * You can export data as a CSV file to an Amazon S3 bucket or into your preferred visualization tool or cloud migration
 * solution to help reduce the complexity and time in planning your cloud migration.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>ExportConfigurations</i>: Exports all discovered configuration data to an Amazon S3 bucket. Data includes tags and
 * tag associations, processes, connections, servers, and system performance. This API returns an export ID which you
 * can query using the GetExportStatus API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeExportConfigurations</i>: Gets the status of the data export. When the export is complete, the service
 * returns an Amazon S3 URL where you can download CSV files that include the data.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSApplicationDiscoveryClient extends AmazonWebServiceClient implements AWSApplicationDiscovery {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSApplicationDiscovery.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "discovery";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ServerInternalErrorException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.ServerInternalErrorException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.InvalidParameterException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidParameterValueException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.InvalidParameterValueException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.ResourceNotFoundException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("OperationNotPermittedException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.OperationNotPermittedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AuthorizationErrorException").withModeledClass(
                            com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.applicationdiscovery.model.AWSApplicationDiscoveryException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service. A credentials provider
     * chain will be used that searches for credentials in this order:
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
    public AWSApplicationDiscoveryClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service. A credentials provider
     * chain will be used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSApplicationDiscoveryClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AWSApplicationDiscoveryClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     */
    public AWSApplicationDiscoveryClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     */
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified AWS
     * account credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Application Discovery Service
     *        (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSApplicationDiscoveryClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Application Discovery Service using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSApplicationDiscoveryClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://discovery.us-west-2.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/applicationdiscovery/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/applicationdiscovery/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
     * accepts a list of multiple configuration items.
     * </p>
     * 
     * @param createTagsRequest
     * @return Result of the CreateTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.CreateTags
     */
    @Override
    public CreateTagsResult createTags(CreateTagsRequest createTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(createTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTagsRequest> request = null;
        Response<CreateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTagsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
     * configuration items.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DeleteTags
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists AWS agents by ID or lists all agents associated with your user account if you did not specify an agent ID.
     * </p>
     * 
     * @param describeAgentsRequest
     * @return Result of the DescribeAgents operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeAgents
     */
    @Override
    public DescribeAgentsResult describeAgents(DescribeAgentsRequest describeAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAgentsRequest> request = null;
        Response<DescribeAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAgentsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of attributes for a specific configuration ID. For example, the output for a <i>server</i>
     * configuration item includes a list of attributes about the server, including host name, operating system, number
     * of network cards, etc.
     * </p>
     * 
     * @param describeConfigurationsRequest
     * @return Result of the DescribeConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeConfigurations
     */
    @Override
    public DescribeConfigurationsResult describeConfigurations(DescribeConfigurationsRequest describeConfigurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationsRequest> request = null;
        Response<DescribeConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the status of a given export process. You can retrieve status from a maximum of 100 processes.
     * </p>
     * 
     * @param describeExportConfigurationsRequest
     * @return Result of the DescribeExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeExportConfigurations
     */
    @Override
    public DescribeExportConfigurationsResult describeExportConfigurations(DescribeExportConfigurationsRequest describeExportConfigurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeExportConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExportConfigurationsRequest> request = null;
        Response<DescribeExportConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExportConfigurationsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeExportConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExportConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeExportConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of configuration items that are tagged with a specific tag. Or retrieves a list of all tags
     * assigned to a specific configuration item.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.DescribeTags
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports all discovered configuration data to an Amazon S3 bucket or an application that enables you to view and
     * evaluate the data. Data includes tags and tag associations, processes, connections, servers, and system
     * performance. This API returns an export ID which you can query using the <i>GetExportStatus</i> API. The system
     * imposes a limit of two configuration exports in six hours.
     * </p>
     * 
     * @param exportConfigurationsRequest
     * @return Result of the ExportConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @throws OperationNotPermittedException
     *         This operation is not permitted.
     * @sample AWSApplicationDiscovery.ExportConfigurations
     */
    @Override
    public ExportConfigurationsResult exportConfigurations(ExportConfigurationsRequest exportConfigurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(exportConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExportConfigurationsRequest> request = null;
        Response<ExportConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExportConfigurationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(exportConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExportConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ExportConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of configurations items according to the criteria you specify in a filter. The filter criteria
     * identify relationship requirements.
     * </p>
     * 
     * @param listConfigurationsRequest
     * @return Result of the ListConfigurations operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws ResourceNotFoundException
     *         The specified configuration ID was not located. Verify the configuration ID and try again.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.ListConfigurations
     */
    @Override
    public ListConfigurationsResult listConfigurations(ListConfigurationsRequest listConfigurationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfigurationsRequest> request = null;
        Response<ListConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfigurationsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instructs the specified agents to start collecting data. Agents can reside on host servers or virtual machines in
     * your data center.
     * </p>
     * 
     * @param startDataCollectionByAgentIdsRequest
     * @return Result of the StartDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StartDataCollectionByAgentIds
     */
    @Override
    public StartDataCollectionByAgentIdsResult startDataCollectionByAgentIds(StartDataCollectionByAgentIdsRequest startDataCollectionByAgentIdsRequest) {
        ExecutionContext executionContext = createExecutionContext(startDataCollectionByAgentIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataCollectionByAgentIdsRequest> request = null;
        Response<StartDataCollectionByAgentIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataCollectionByAgentIdsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startDataCollectionByAgentIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartDataCollectionByAgentIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartDataCollectionByAgentIdsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Instructs the specified agents to stop collecting data.
     * </p>
     * 
     * @param stopDataCollectionByAgentIdsRequest
     * @return Result of the StopDataCollectionByAgentIds operation returned by the service.
     * @throws AuthorizationErrorException
     *         The AWS user account does not have permission to perform the action. Check the IAM policy associated with
     *         this account.
     * @throws InvalidParameterException
     *         One or more parameters are not valid. Verify the parameters and try again.
     * @throws InvalidParameterValueException
     *         The value of one or more parameters are either invalid or out of range. Verify the parameter values and
     *         try again.
     * @throws ServerInternalErrorException
     *         The server experienced an internal error. Try again.
     * @sample AWSApplicationDiscovery.StopDataCollectionByAgentIds
     */
    @Override
    public StopDataCollectionByAgentIdsResult stopDataCollectionByAgentIds(StopDataCollectionByAgentIdsRequest stopDataCollectionByAgentIdsRequest) {
        ExecutionContext executionContext = createExecutionContext(stopDataCollectionByAgentIdsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDataCollectionByAgentIdsRequest> request = null;
        Response<StopDataCollectionByAgentIdsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDataCollectionByAgentIdsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopDataCollectionByAgentIdsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopDataCollectionByAgentIdsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopDataCollectionByAgentIdsResultJsonUnmarshaller());
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
