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

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing Amazon SSM asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Simple Systems Manager (SSM) enables you to remotely manage the configuration
 * of your Amazon EC2 instance. Using SSM, you can run scripts or commands using
 * either EC2 Run Command or SSM Config. (SSM Config is currently available only
 * for Windows instances.)
 * </p>
 * <p>
 * </p>
 * <b>Run Command</b>
 * <p>
 * Run Command provides an on-demand experience for executing commands. You can
 * use pre-defined Amazon SSM documents to perform the actions listed later in
 * this section, or you can create your own documents. With these documents, you
 * can remotely configure your instances by sending commands using the
 * <b>Commands</b> page in the <a
 * href="http://console.aws.amazon.com/ec2/">Amazon EC2 console</a>, <a href=
 * "http://docs.aws.amazon.com/powershell/latest/reference/items/Amazon_Simple_Systems_Management_cmdlets.html"
 * >AWS Tools for Windows PowerShell</a>, or the <a
 * href="http://docs.aws.amazon.com/cli/latest/reference/ssm/index.html">AWS
 * CLI</a>.
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
 * <p>
 * </p>
 * <b>SSM Config</b>
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
 * SSM Config and Run Command include the following pre-defined documents.
 * </p>
 * <table>
 * <title>Amazon Pre-defined SSM Documents</title> <tgroup cols="3"> <colspec
 * colnum="1" colname="col1" colwidth="1*"></colspec> <colspec colnum="2"
 * colname="col2" colwidth="1*"></colspec> <colspec colnum="3" colname="col3"
 * colwidth="1*"></colspec> <thead> <row> <entry>Name</entry>
 * <entry>Description</entry> <entry>Platform</entry> </row> </thead> <tbody>
 * <row> <entry>
 * <p>
 * AWS-RunShellScript
 * </p>
 * </entry> <entry>
 * <p>
 * Run shell scripts
 * </p>
 * </entry> <entry>
 * <p>
 * Linux
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-UpdateSSMAgent
 * </p>
 * </entry> <entry>
 * <p>
 * Update the Amazon SSM agent
 * </p>
 * </entry> <entry>
 * <p>
 * Linux
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-JoinDirectoryServiceDomain
 * </p>
 * </entry> <entry>
 * <p>
 * Join an AWS Directory
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-RunPowerShellScript
 * </p>
 * </entry> <entry>
 * <p>
 * Run PowerShell commands or scripts
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-UpdateEC2Config
 * </p>
 * </entry> <entry>
 * <p>
 * Update the EC2Config service
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-ConfigureWindowsUpdate
 * </p>
 * </entry> <entry>
 * <p>
 * Configure Windows Update settings
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-InstallApplication
 * </p>
 * </entry> <entry>
 * <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-InstallPowerShellModule
 * </p>
 * </entry> <entry>
 * <p>
 * Install PowerShell modules
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> <row> <entry>
 * <p>
 * AWS-ConfigureCloudWatch
 * </p>
 * </entry> <entry>
 * <p>
 * Configure Amazon CloudWatch Logs to monitor applications and systems
 * </p>
 * </entry> <entry>
 * <p>
 * Windows
 * </p>
 * </entry> </row> </tbody> </tgroup>
 * </table>
 * <important> <simpara>The commands or scripts specified in SSM documents run
 * with administrative privilege on your instances because the Amazon SSM agent
 * runs as root on Linux and the EC2Config service runs in the Local System
 * account on Windows. If a user has permission to execute any of the
 * pre-defined SSM documents (any document that begins with AWS-*) then that
 * user also has administrator access to the instance. Delegate access to SSM
 * and Run Command judiciously. This becomes extremely important if you create
 * your own SSM documents. Amazon Web Services does not provide guidance about
 * how to create secure SSM documents. You create SSM documents and delegate
 * access to Run Command at your own risk. As a security best practice, we
 * recommend that you assign access to "AWS-*" documents, especially the
 * AWS-RunShellScript document on Linux and the AWS-RunPowerShellScript document
 * on Windows, to trusted administrators only. You can create SSM documents for
 * specific tasks and delegate access to non-administrators.</simpara>
 * </important>
 */
public class AWSSimpleSystemsManagementAsyncClient extends
        AWSSimpleSystemsManagementClient implements
        AWSSimpleSystemsManagementAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSimpleSystemsManagementAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon SSM (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials and executor service.
     * Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials, executor service, and
     * client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials provider. Default client
     * settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the provided AWS account credentials provider and client
     * configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, new com.amazonaws.ClientConfiguration(),
                executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SSM using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(
            CancelCommandRequest request) {

        return cancelCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(
            final CancelCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CancelCommandResult>() {
                    @Override
                    public CancelCommandResult call() throws Exception {
                        CancelCommandResult result;

                        try {
                            result = cancelCommand(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest request) {

        return createAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            final CreateAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateAssociationResult>() {
                    @Override
                    public CreateAssociationResult call() throws Exception {
                        CreateAssociationResult result;

                        try {
                            result = createAssociation(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest request) {

        return createAssociationBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            final CreateAssociationBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateAssociationBatchResult>() {
                    @Override
                    public CreateAssociationBatchResult call() throws Exception {
                        CreateAssociationBatchResult result;

                        try {
                            result = createAssociationBatch(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            CreateDocumentRequest request) {

        return createDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            final CreateDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDocumentResult>() {
                    @Override
                    public CreateDocumentResult call() throws Exception {
                        CreateDocumentResult result;

                        try {
                            result = createDocument(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest request) {

        return deleteAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            final DeleteAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteAssociationResult>() {
                    @Override
                    public DeleteAssociationResult call() throws Exception {
                        DeleteAssociationResult result;

                        try {
                            result = deleteAssociation(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            DeleteDocumentRequest request) {

        return deleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            final DeleteDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteDocumentResult>() {
                    @Override
                    public DeleteDocumentResult call() throws Exception {
                        DeleteDocumentResult result;

                        try {
                            result = deleteDocument(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest request) {

        return describeAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            final DescribeAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeAssociationResult>() {
                    @Override
                    public DescribeAssociationResult call() throws Exception {
                        DescribeAssociationResult result;

                        try {
                            result = describeAssociation(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest request) {

        return describeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            final DescribeDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDocumentResult>() {
                    @Override
                    public DescribeDocumentResult call() throws Exception {
                        DescribeDocumentResult result;

                        try {
                            result = describeDocument(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest request) {

        return describeInstanceInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            final DescribeInstanceInformationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeInstanceInformationResult>() {
                    @Override
                    public DescribeInstanceInformationResult call()
                            throws Exception {
                        DescribeInstanceInformationResult result;

                        try {
                            result = describeInstanceInformation(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            GetDocumentRequest request) {

        return getDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            final GetDocumentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetDocumentResult>() {
                    @Override
                    public GetDocumentResult call() throws Exception {
                        GetDocumentResult result;

                        try {
                            result = getDocument(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest request) {

        return listAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            final ListAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAssociationsResult>() {
                    @Override
                    public ListAssociationsResult call() throws Exception {
                        ListAssociationsResult result;

                        try {
                            result = listAssociations(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            ListCommandInvocationsRequest request) {

        return listCommandInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            final ListCommandInvocationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListCommandInvocationsResult>() {
                    @Override
                    public ListCommandInvocationsResult call() throws Exception {
                        ListCommandInvocationsResult result;

                        try {
                            result = listCommandInvocations(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(
            ListCommandsRequest request) {

        return listCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(
            final ListCommandsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListCommandsResult>() {
                    @Override
                    public ListCommandsResult call() throws Exception {
                        ListCommandsResult result;

                        try {
                            result = listCommands(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            ListDocumentsRequest request) {

        return listDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            final ListDocumentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDocumentsResult>() {
                    @Override
                    public ListDocumentsResult call() throws Exception {
                        ListDocumentsResult result;

                        try {
                            result = listDocuments(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync() {

        return listDocumentsAsync(new ListDocumentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDocuments operation with an
     * AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        return listDocumentsAsync(new ListDocumentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(
            SendCommandRequest request) {

        return sendCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(
            final SendCommandRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<SendCommandResult>() {
                    @Override
                    public SendCommandResult call() throws Exception {
                        SendCommandResult result;

                        try {
                            result = sendCommand(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest request) {

        return updateAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            final UpdateAssociationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateAssociationStatusResult>() {
                    @Override
                    public UpdateAssociationStatusResult call()
                            throws Exception {
                        UpdateAssociationStatusResult result;

                        try {
                            result = updateAssociationStatus(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
