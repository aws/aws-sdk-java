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
package com.amazonaws.services.simplesystemsmanagement;

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
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.services.simplesystemsmanagement.model.transform.*;

/**
 * Client for accessing Amazon SSM. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * This is the Amazon Simple Systems Manager (SSM) API Reference. SSM enables
 * you to remotely manage the configuration of your Amazon EC2 instance using
 * scripts or commands with either an on-demand solution called <i>SSM Run
 * Command</i> or a lightweight instance configuration solution called <i>SSM
 * Config</i>.
 * </p>
 * <p>
 * This references is intended to be used with the SSM User Guide for <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/execute-remote-commands.html"
 * >Linux</a> or <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/execute-remote-commands.html"
 * >Windows</a>.
 * </p>
 * <p>
 * <b>Run Command</b>
 * </p>
 * <p>
 * Run Command provides an on-demand experience for executing commands. You can
 * use pre-defined Amazon SSM documents to perform the actions listed later in
 * this section, or you can create your own documents. With these documents, you
 * can remotely configure your instances by sending commands using the
 * <b>Commands</b> page in the <a
 * href="http://console.aws.amazon.com/ec2/">Amazon EC2 console</a>, <a href=
 * "http://docs.aws.amazon.com/powershell/latest/reference/items/Amazon_Simple_Systems_Management_cmdlets.html"
 * >AWS Tools for Windows PowerShell</a>, the <a
 * href="http://docs.aws.amazon.com/cli/latest/reference/ssm/index.html">AWS
 * CLI</a>, or AWS SDKs.
 * </p>
 * <p>
 * Run Command reports the status of the command execution for each instance
 * targeted by a command. You can also audit the command execution to understand
 * who executed commands, when, and what changes were made. By switching between
 * different SSM documents, you can quickly configure your instances with
 * different types of commands. To get started with Run Command, verify that
 * your environment meets the prerequisites for remotely running commands on EC2
 * instances (<a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/remote-commands-prereq.html"
 * >Linux</a> or <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/remote-commands-prereq.html"
 * >Windows</a>).
 * </p>
 * <p/>
 * <p>
 * <b>SSM Config</b>
 * </p>
 * <p>
 * SSM Config is a lightweight instance configuration solution. SSM Config is
 * currently only available for Windows instances. With SSM Config, you can
 * specify a setup configuration for your instances. SSM Config is similar to
 * EC2 User Data, which is another way of running one-time scripts or applying
 * settings during instance launch. SSM Config is an extension of this
 * capability. Using SSM documents, you can specify which actions the system
 * should perform on your instances, including which applications to install,
 * which AWS Directory Service directory to join, which Microsoft PowerShell
 * modules to install, etc. If an instance is missing one or more of these
 * configurations, the system makes those changes. By default, the system checks
 * every five minutes to see if there is a new configuration to apply as defined
 * in a new SSM document. If so, the system updates the instances accordingly.
 * In this way, you can remotely maintain a consistent configuration baseline on
 * your instances. SSM Config is available using the AWS CLI or the AWS Tools
 * for Windows PowerShell. For more information, see <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-configuration-manage.html"
 * >Managing Windows Instance Configuration</a>.
 * </p>
 * <p>
 * SSM Config and SSM Run Command include the following pre-defined documents.
 * </p>
 * <p>
 * <b>Linux</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>AWS-RunShellScript</b> to run shell scripts
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-UpdateSSMAgent</b> to update the Amazon SSM agent
 * </p>
 * </li>
 * </ul>
 * <p/>
 * <p>
 * <b>Windows</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>AWS-JoinDirectoryServiceDomain</b> to join an AWS Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-RunPowerShellScript</b> to run PowerShell commands or scripts
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-UpdateEC2Config</b> to update the EC2Config service
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-ConfigureWindowsUpdate</b> to configure Windows Update settings
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallApplication</b> to install, repair, or uninstall software using
 * an MSI package
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallPowerShellModule</b> to install PowerShell modules
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-ConfigureCloudWatch</b> to configure Amazon CloudWatch Logs to monitor
 * applications and systems
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-ListWindowsInventory</b> to collect information about an EC2 instance
 * running in Windows.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-FindWindowsUpdates</b> to scan an instance and determines which
 * updates are missing.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallMissingWindowsUpdates</b> to install missing updates on your
 * EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallSpecificWindowsUpdates</b> to install one or more specific
 * updates.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * The commands or scripts specified in SSM documents run with administrative
 * privilege on your instances because the Amazon SSM agent runs as root on
 * Linux and the EC2Config service runs in the Local System account on Windows.
 * If a user has permission to execute any of the pre-defined SSM documents (any
 * document that begins with AWS-*) then that user also has administrator access
 * to the instance. Delegate access to SSM and Run Command judiciously. This
 * becomes extremely important if you create your own SSM documents. Amazon Web
 * Services does not provide guidance about how to create secure SSM documents.
 * You create SSM documents and delegate access to Run Command at your own risk.
 * As a security best practice, we recommend that you assign access to "AWS-*"
 * documents, especially the AWS-RunShellScript document on Linux and the
 * AWS-RunPowerShellScript document on Windows, to trusted administrators only.
 * You can create SSM documents for specific tasks and delegate access to
 * non-administrators.
 * </p>
 * </important>
 * <p>
 * For information about creating and sharing SSM documents, see the following
 * topics in the SSM User Guide:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/create-ssm-doc.html"
 * >Creating SSM Documents</a> and <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssm-sharing.html"
 * >Sharing SSM Documents</a> (Linux)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/create-ssm-doc.html"
 * >Creating SSM Documents</a> and <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ssm-sharing.html"
 * >Sharing SSM Documents</a> (Windows)
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSSimpleSystemsManagementClient extends AmazonWebServiceClient
        implements AWSSimpleSystemsManagement {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AWSSimpleSystemsManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ssm";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "ssm";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode(
                                            "InvalidInstanceInformationFilterValue")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceInformationFilterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidNextToken")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("AssociatedInstances")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.AssociatedInstancesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("AssociationLimitExceeded")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.AssociationLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("DuplicateInstanceId")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.DuplicateInstanceIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidFilterKey")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterKeyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidParameters")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("AssociationAlreadyExists")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.AssociationAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidCommandId")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidCommandIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidDocument")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidDocumentContent")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentContentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("AssociationDoesNotExist")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("TooManyUpdates")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.TooManyUpdatesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InternalServerError")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("DocumentPermissionLimit")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.DocumentPermissionLimitException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("MaxDocumentSizeExceeded")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.MaxDocumentSizeExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("UnsupportedPlatformType")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.UnsupportedPlatformTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidInstanceId")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("DocumentAlreadyExists")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.DocumentAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidPermissionType")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidPermissionTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidDocumentOperation")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("DocumentLimitExceeded")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.DocumentLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("StatusUnchanged")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.StatusUnchangedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata()
                                    .withErrorCode("InvalidOutputFolder")
                                    .withModeledClass(
                                            com.amazonaws.services.simplesystemsmanagement.model.InvalidOutputFolderException.class)));

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A
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
    public AWSSimpleSystemsManagementClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementClient(
            ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     */
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the
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
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSSimpleSystemsManagementClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ssm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/simplesystemsmanagement/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/simplesystemsmanagement/request.handler2s"));
    }

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return Result of the CancelCommand operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     */
    @Override
    public CancelCommandResult cancelCommand(
            CancelCommandRequest cancelCommandRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCommandRequest> request = null;
        Response<CancelCommandResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCommandRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(cancelCommandRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelCommandResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CancelCommandResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified SSM document with the specified instance.
     * </p>
     * <p>
     * When you associate an SSM document with an instance, the configuration
     * agent on the instance processes the document and configures the instance
     * as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system throws the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return Result of the CreateAssociation operation returned by the
     *         service.
     * @throws AssociationAlreadyExistsException
     *         The specified association already exists.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given
     *         instance ID(s). For example, you sent an SSM document for a
     *         Windows instance to a Linux instance.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM
     *         document. You can only supply values to parameters defined in the
     *         SSM document.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     */
    @Override
    public CreateAssociationResult createAssociation(
            CreateAssociationRequest createAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationRequest> request = null;
        Response<CreateAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(createAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CreateAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified SSM document with the specified instances.
     * </p>
     * <p>
     * When you associate an SSM document with an instance, the configuration
     * agent on the instance processes the document and configures the instance
     * as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an
     * associated document, the system throws the AssociationAlreadyExists
     * exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return Result of the CreateAssociationBatch operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM
     *         document. You can only supply values to parameters defined in the
     *         SSM document.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given
     *         instance ID(s). For example, you sent an SSM document for a
     *         Windows instance to a Linux instance.
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     */
    @Override
    public CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssociationBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationBatchRequest> request = null;
        Response<CreateAssociationBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationBatchRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(createAssociationBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssociationBatchResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CreateAssociationBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an SSM document.
     * </p>
     * <p>
     * After you create an SSM document, you can use CreateAssociation to
     * associate it with one or more running instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return Result of the CreateDocument operation returned by the service.
     * @throws DocumentAlreadyExistsException
     *         The specified SSM document already exists.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of an SSM document is 64 KB.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentContentException
     *         The content for the SSM document is not valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 100 active SSM documents.
     * @sample AWSSimpleSystemsManagement.CreateDocument
     */
    @Override
    public CreateDocumentResult createDocument(
            CreateDocumentRequest createDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(createDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentRequest> request = null;
        Response<CreateDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(createDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDocumentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new CreateDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified SSM document from the specified instance.
     * </p>
     * <p>
     * When you disassociate an SSM document from an instance, it does not
     * change the configuration of the instance. To change the configuration
     * state of an instance after you disassociate a document, you must create a
     * new document with the desired configuration and associate it with the
     * instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return Result of the DeleteAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteAssociation
     */
    @Override
    public DeleteAssociationResult deleteAssociation(
            DeleteAssociationRequest deleteAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssociationRequest> request = null;
        Response<DeleteAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssociationRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(deleteAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the SSM document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the SSM document, we recommend that you use
     * DeleteAssociation to disassociate all instances that are associated with
     * the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You
     *         must stop sharing the document before you can delete it.
     * @throws AssociatedInstancesException
     *         You must disassociate an SSM document from all instances before
     *         you can delete it.
     * @sample AWSSimpleSystemsManagement.DeleteDocument
     */
    @Override
    public DeleteDocumentResult deleteDocument(
            DeleteDocumentRequest deleteDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(deleteDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DeleteDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the
     *         service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @sample AWSSimpleSystemsManagement.DescribeAssociation
     */
    @Override
    public DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationRequest> request = null;
        Response<DescribeAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(describeAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssociationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DescribeAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified SSM document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @sample AWSSimpleSystemsManagement.DescribeDocument
     */
    @Override
    public DescribeDocumentResult describeDocument(
            DescribeDocumentRequest describeDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentRequest> request = null;
        Response<DescribeDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(describeDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new DescribeDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions for an SSM document. If you created the
     * document, you are the owner. If a document is shared, it can either be
     * shared privately (by specifying a user’s AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return Result of the DescribeDocumentPermission operation returned by
     *         the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only
     *         supported permission type.
     * @sample AWSSimpleSystemsManagement.DescribeDocumentPermission
     */
    @Override
    public DescribeDocumentPermissionResult describeDocumentPermission(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentPermissionRequest> request = null;
        Response<DescribeDocumentPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentPermissionRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(describeDocumentPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentPermissionResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            new DescribeDocumentPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get
     * information about instances like the operating system platform, the SSM
     * agent version, status etc. If you specify one or more instance IDs, it
     * returns information for those instances. If you do not specify instance
     * IDs, it returns information for all your instances. If you specify an
     * instance ID that is not valid or an instance that you do not own, you
     * receive an error.
     * </p>
     * 
     * @param describeInstanceInformationRequest
     * @return Result of the DescribeInstanceInformation operation returned by
     *         the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidInstanceInformationFilterValueException
     *         The specified filter value is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceInformation
     */
    @Override
    public DescribeInstanceInformationResult describeInstanceInformation(
            DescribeInstanceInformationRequest describeInstanceInformationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeInstanceInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceInformationRequest> request = null;
        Response<DescribeInstanceInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceInformationRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceInformationResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            new DescribeInstanceInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contents of the specified SSM document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @sample AWSSimpleSystemsManagement.GetDocument
     */
    @Override
    public GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest) {
        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(getDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new GetDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListAssociations
     */
    @Override
    public ListAssociationsResult listAssociations(
            ListAssociationsRequest listAssociationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsRequest> request = null;
        Response<ListAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsRequestMarshaller(protocolFactory)
                        .marshall(super
                                .beforeMarshalling(listAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user executes SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommandInvocations
     */
    @Override
    public ListCommandInvocationsResult listCommandInvocations(
            ListCommandInvocationsRequest listCommandInvocationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listCommandInvocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandInvocationsRequest> request = null;
        Response<ListCommandInvocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandInvocationsRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(listCommandInvocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCommandInvocationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListCommandInvocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return Result of the ListCommands operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommands
     */
    @Override
    public ListCommandsResult listCommands(
            ListCommandsRequest listCommandsRequest) {
        ExecutionContext executionContext = createExecutionContext(listCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandsRequest> request = null;
        Response<ListCommandsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandsRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(listCommandsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCommandsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListCommandsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your SSM documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.ListDocuments
     */
    @Override
    public ListDocumentsResult listDocuments(
            ListDocumentsRequest listDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(listDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new ListDocumentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDocumentsResult listDocuments() {
        return listDocuments(new ListDocumentsRequest());
    }

    /**
     * <p>
     * Share a document publicly or privately. If you share a document
     * privately, you must specify the AWS user account IDs for those people who
     * can use the document. If you share a document publicly, you must specify
     * <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return Result of the ModifyDocumentPermission operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only
     *         supported permission type.
     * @throws DocumentPermissionLimitException
     *         The document cannot be shared with more AWS user accounts. You
     *         can share a document with a maximum of 20 accounts. You can
     *         publicly share up to five documents. If you need to increase this
     *         limit, contact AWS Support.
     * @throws DocumentLimitExceededException
     *         You can have at most 100 active SSM documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     */
    @Override
    public ModifyDocumentPermissionResult modifyDocumentPermission(
            ModifyDocumentPermissionRequest modifyDocumentPermissionRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDocumentPermissionRequest> request = null;
        Response<ModifyDocumentPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDocumentPermissionRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(modifyDocumentPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyDocumentPermissionResult>> responseHandler = protocolFactory
                    .createResponseHandler(
                            new JsonOperationMetadata().withPayloadJson(true)
                                    .withHasStreamingSuccessResponse(false),
                            new ModifyDocumentPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes commands on one or more remote instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return Result of the SendCommand operation returned by the service.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidOutputFolderException
     *         The S3 bucket does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM
     *         document. You can only supply values to parameters defined in the
     *         SSM document.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given
     *         instance ID(s). For example, you sent an SSM document for a
     *         Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of an SSM document is 64 KB.
     * @sample AWSSimpleSystemsManagement.SendCommand
     */
    @Override
    public SendCommandResult sendCommand(SendCommandRequest sendCommandRequest) {
        ExecutionContext executionContext = createExecutionContext(sendCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCommandRequest> request = null;
        Response<SendCommandResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCommandRequestMarshaller(protocolFactory)
                        .marshall(super.beforeMarshalling(sendCommandRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendCommandResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new SendCommandResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of the SSM document associated with the specified
     * instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the
     *         service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws StatusUnchangedException
     *         The updated status is the same as the current status.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one
     *         update at a time.
     * @sample AWSSimpleSystemsManagement.UpdateAssociationStatus
     */
    @Override
    public UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationStatusRequest> request = null;
        Response<UpdateAssociationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationStatusRequestMarshaller(
                        protocolFactory).marshall(super
                        .beforeMarshalling(updateAssociationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssociationStatusResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata()
                            .withPayloadJson(true)
                            .withHasStreamingSuccessResponse(false),
                            new UpdateAssociationStatusResultJsonUnmarshaller());
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

    /**
     * Normal invoke with authentication. Credentials are required and may be
     * overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils
                .getCredentialsProvider(request.getOriginalRequest(),
                        awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any
     * credentials set on the client or request will be ignored for this
     * operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack
     * thereof) have been configured in the ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory
                .createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
