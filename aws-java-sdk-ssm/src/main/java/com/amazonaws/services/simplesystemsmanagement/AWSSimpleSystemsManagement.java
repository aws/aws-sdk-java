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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing Amazon SSM.
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
public interface AWSSimpleSystemsManagement {

    /**
     * Overrides the default endpoint for this client
     * ("https://ssm.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ssm.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://ssm.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ssm.us-east-1.amazonaws.com") or a full URL,
     *        including the protocol (ex: "https://ssm.us-east-1.amazonaws.com")
     *        of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSSimpleSystemsManagement#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no
     * guarantee that the command will be terminated and the underlying process
     * stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return Result of the CancelCommand operation returned by the service.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running,
     *         Pending, Stopped, Stopping. Invalid states are: Shutting-down and
     *         Terminated.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     */
    CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest);

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
     *         instance ID(s).
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM
     *         document. You can only supply values to parameters defined in the
     *         SSM document.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     */
    CreateAssociationResult createAssociation(
            CreateAssociationRequest createAssociationRequest);

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
     *         instance ID(s).
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     */
    CreateAssociationBatchResult createAssociationBatch(
            CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Creates an SSM document.
     * </p>
     * <p>
     * After you create an SSM document, you can use <a>CreateAssociation</a> to
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
    CreateDocumentResult createDocument(
            CreateDocumentRequest createDocumentRequest);

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
    DeleteAssociationResult deleteAssociation(
            DeleteAssociationRequest deleteAssociationRequest);

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
     * @throws AssociatedInstancesException
     *         You must disassociate an SSM document from all instances before
     *         you can delete it.
     * @sample AWSSimpleSystemsManagement.DeleteDocument
     */
    DeleteDocumentResult deleteDocument(
            DeleteDocumentRequest deleteDocumentRequest);

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
    DescribeAssociationResult describeAssociation(
            DescribeAssociationRequest describeAssociationRequest);

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
    DescribeDocumentResult describeDocument(
            DescribeDocumentRequest describeDocumentRequest);

    /**
     * Describes one or more of your instances. You can use this to get
     * information about instances like the operating system platform, the SSM
     * agent version, status etc. If you specify one or more instance IDs, it
     * returns information for those instances. If you do not specify instance
     * IDs, it returns information for all your instances. If you specify an
     * instance ID that is not valid or an instance that you do not own, you
     * receive an error.
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
    DescribeInstanceInformationResult describeInstanceInformation(
            DescribeInstanceInformationRequest describeInstanceInformationRequest);

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
    GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest);

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
    ListAssociationsResult listAssociations(
            ListAssociationsRequest listAssociationsRequest);

    /**
     * An invocation is copy of a command sent to a specific instance. A command
     * can apply to one or more instances. A command invocation applies to one
     * instance. For example, if a user executes SendCommand against three
     * instances, then a command invocation is created for each requested
     * instance ID. ListCommandInvocations provide status about command
     * execution.
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the
     *         service.
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
    ListCommandInvocationsResult listCommandInvocations(
            ListCommandInvocationsRequest listCommandInvocationsRequest);

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return Result of the ListCommands operation returned by the service.
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
    ListCommandsResult listCommands(ListCommandsRequest listCommandsRequest);

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
    ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest);

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocuments(ListDocumentsRequest)
     */
    ListDocumentsResult listDocuments();

    /**
     * Executes commands on one or more remote instances.
     * 
     * @param sendCommandRequest
     * @return Result of the SendCommand operation returned by the service.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
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
     *         instance ID(s).
     * @sample AWSSimpleSystemsManagement.SendCommand
     */
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest);

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
    UpdateAssociationStatusResult updateAssociationStatus(
            UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
