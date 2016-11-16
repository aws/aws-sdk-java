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
package com.amazonaws.services.simplesystemsmanagement;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing Amazon SSM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagement} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to remotely manage the configuration of your Amazon EC2
 * instances, virtual machines (VMs), or servers in your on-premises environment or in an environment provided by other
 * cloud providers using scripts, commands, or the Amazon EC2 console. SSM includes an on-demand solution called
 * <i>Amazon EC2 Run Command</i> and a lightweight instance configuration solution called <i>SSM Config</i>.
 * </p>
 * <p>
 * This references is intended to be used with the EC2 Run Command User Guide for <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/execute-remote-commands.html">Linux</a> or <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/execute-remote-commands.html">Windows</a>.
 * </p>
 * <note>
 * <p>
 * You must register your on-premises servers and VMs through an activation process before you can configure them using
 * Run Command. Registered servers and VMs are called <i>managed instances</i>. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/managed-instances.html">Setting Up Run Command On Managed
 * Instances (On-Premises Servers and VMs) on Linux</a> or <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/managed-instances.html">Setting Up Run Command On Managed
 * Instances (On-Premises Servers and VMs) on Windows</a>.
 * </p>
 * </note>
 * <p>
 * <b>Run Command</b>
 * </p>
 * <p>
 * Run Command provides an on-demand experience for executing commands. You can use pre-defined SSM documents to perform
 * the actions listed later in this section, or you can create your own documents. With these documents, you can
 * remotely configure your instances by sending commands using the <b>Commands</b> page in the <a
 * href="http://console.aws.amazon.com/ec2/">Amazon EC2 console</a>, <a
 * href="http://docs.aws.amazon.com/powershell/latest/reference/items/Amazon_Simple_Systems_Management_cmdlets.html">AWS
 * Tools for Windows PowerShell</a>, the <a href="http://docs.aws.amazon.com/cli/latest/reference/ssm/index.html">AWS
 * CLI</a>, or AWS SDKs.
 * </p>
 * <p>
 * Run Command reports the status of the command execution for each instance targeted by a command. You can also audit
 * the command execution to understand who executed commands, when, and what changes were made. By switching between
 * different SSM documents, you can quickly configure your instances with different types of commands. To get started
 * with Run Command, verify that your environment meets the prerequisites for remotely running commands on EC2 instances
 * (<a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/remote-commands-prereq.html">Linux</a> or <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/remote-commands-prereq.html">Windows</a>).
 * </p>
 * <p/>
 * <p>
 * <b>SSM Config</b>
 * </p>
 * <p>
 * SSM Config is a lightweight instance configuration solution. SSM Config is currently only available for Windows
 * instances. With SSM Config, you can specify a setup configuration for your instances. SSM Config is similar to EC2
 * User Data, which is another way of running one-time scripts or applying settings during instance launch. SSM Config
 * is an extension of this capability. Using SSM documents, you can specify which actions the system should perform on
 * your instances, including which applications to install, which AWS Directory Service directory to join, which
 * Microsoft PowerShell modules to install, etc. If an instance is missing one or more of these configurations, the
 * system makes those changes. By default, the system checks every five minutes to see if there is a new configuration
 * to apply as defined in a new SSM document. If so, the system updates the instances accordingly. In this way, you can
 * remotely maintain a consistent configuration baseline on your instances. SSM Config is available using the AWS CLI or
 * the AWS Tools for Windows PowerShell. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-configuration-manage.html">Managing Windows Instance
 * Configuration</a>.
 * </p>
 * <p>
 * SSM Config and Run Command include the following pre-defined documents.
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
 * <b>AWS-InstallApplication</b> to install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallPowerShellModule</b> to install PowerShell modules
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-ConfigureCloudWatch</b> to configure Amazon CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-ListWindowsInventory</b> to collect information about an EC2 instance running in Windows.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-FindWindowsUpdates</b> to scan an instance and determines which updates are missing.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallMissingWindowsUpdates</b> to install missing updates on your EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AWS-InstallSpecificWindowsUpdates</b> to install one or more specific updates.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * The commands or scripts specified in SSM documents run with administrative privilege on your instances because the
 * Amazon SSM agent runs as root on Linux and the EC2Config service runs in the Local System account on Windows. If a
 * user has permission to execute any of the pre-defined SSM documents (any document that begins with AWS-*) then that
 * user also has administrator access to the instance. Delegate access to Run Command and SSM Config judiciously. This
 * becomes extremely important if you create your own SSM documents. Amazon Web Services does not provide guidance about
 * how to create secure SSM documents. You create SSM documents and delegate access to Run Command at your own risk. As
 * a security best practice, we recommend that you assign access to "AWS-*" documents, especially the AWS-RunShellScript
 * document on Linux and the AWS-RunPowerShellScript document on Windows, to trusted administrators only. You can create
 * SSM documents for specific tasks and delegate access to non-administrators.
 * </p>
 * </important>
 * <p>
 * For information about creating and sharing SSM documents, see the following topics in the SSM User Guide:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/create-ssm-doc.html">Creating SSM Documents</a> and <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssm-sharing.html">Sharing SSM Documents</a> (Linux)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/create-ssm-doc.html">Creating SSM Documents</a> and <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ssm-sharing.html">Sharing SSM Documents</a> (Windows)
 * </p>
 * </li>
 * </ul>
 */
public interface AWSSimpleSystemsManagement {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ssm";

    /**
     * Overrides the default endpoint for this client ("https://ssm.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ssm.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://ssm.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ssm.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ssm.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSSimpleSystemsManagement#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you assign to your managed
     * instances. Tags enable you to categorize your managed instances in different ways, for example, by purpose,
     * owner, or environment. Each tag consists of a key and an optional value, both of which you define. For example,
     * you could define a set of tags for your account's managed instances that helps you track each instance's owner
     * and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production,
     * Pre-Production, or Test. Each resource can have a maximum of 10 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
     * set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
     * on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string
     * of characters.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. If you are attempting to tag an instance, the instance must be a
     *         registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.AddTagsToResource
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return Result of the CancelCommand operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     */
    CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest);

    /**
     * <p>
     * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
     * Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
     * instance. For more information about activations, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/managed-instances.html">Setting Up Managed Instances
     * (Linux)</a> or <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/managed-instances.html">Setting Up
     * Managed Instances (Windows)</a> in the Amazon EC2 User Guide.
     * </p>
     * 
     * @param createActivationRequest
     * @return Result of the CreateActivation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateActivation
     */
    CreateActivationResult createActivation(CreateActivationRequest createActivationRequest);

    /**
     * <p>
     * Associates the specified SSM document with the specified instance.
     * </p>
     * <p>
     * When you associate an SSM document with an instance, the configuration agent on the instance (SSM agent for Linux
     * and EC2Config service for Windows) processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system throws the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return Result of the CreateAssociation operation returned by the service.
     * @throws AssociationAlreadyExistsException
     *         The specified association already exists.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an SSM
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM document. You can only supply values to
     *         parameters defined in the SSM document.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     */
    CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * Associates the specified SSM document with the specified instances.
     * </p>
     * <p>
     * When you associate an SSM document with an instance, the configuration agent on the instance (SSM agent for Linux
     * and EC2Config service for Windows) processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system throws the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return Result of the CreateAssociationBatch operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM document. You can only supply values to
     *         parameters defined in the SSM document.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an SSM
     *         document for a Windows instance to a Linux instance.
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     */
    CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Creates an SSM document.
     * </p>
     * <p>
     * After you create an SSM document, you can use CreateAssociation to associate it with one or more running
     * instances.
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
     *         You can have at most 200 active SSM documents.
     * @sample AWSSimpleSystemsManagement.CreateDocument
     */
    CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return Result of the DeleteActivation operation returned by the service.
     * @throws InvalidActivationIdException
     *         The activation ID is not valid. Verify the you entered the correct ActivationId or ActivationCode and try
     *         again.
     * @throws InvalidActivationException
     *         The activation is not valid. The activation might have been deleted, or the ActivationId and the
     *         ActivationCode do not match.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteActivation
     */
    DeleteActivationResult deleteActivation(DeleteActivationRequest deleteActivationRequest);

    /**
     * <p>
     * Disassociates the specified SSM document from the specified instance.
     * </p>
     * <p>
     * When you disassociate an SSM document from an instance, it does not change the configuration of the instance. To
     * change the configuration state of an instance after you disassociate a document, you must create a new document
     * with the desired configuration and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return Result of the DeleteAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteAssociation
     */
    DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Deletes the SSM document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the SSM document, we recommend that you use DeleteAssociation to disassociate all instances
     * that are associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
     * @throws AssociatedInstancesException
     *         You must disassociate an SSM document from all instances before you can delete it.
     * @sample AWSSimpleSystemsManagement.DeleteDocument
     */
    DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don’t plan to use Run Command on the server, we suggest uninstalling the SSM agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return Result of the DeregisterManagedInstance operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterManagedInstance
     */
    DeregisterManagedInstanceResult deregisterManagedInstance(DeregisterManagedInstanceRequest deregisterManagedInstanceRequest);

    /**
     * <p>
     * Details about the activation, including: the date and time the activation was created, the expiration date, the
     * IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return Result of the DescribeActivations operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeActivations
     */
    DescribeActivationsResult describeActivations(DescribeActivationsRequest describeActivationsRequest);

    /**
     * <p>
     * Describes the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @sample AWSSimpleSystemsManagement.DescribeAssociation
     */
    DescribeAssociationResult describeAssociation(DescribeAssociationRequest describeAssociationRequest);

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
    DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the permissions for an SSM document. If you created the document, you are the owner. If a document is
     * shared, it can either be shared privately (by specifying a user’s AWS account ID) or publicly (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return Result of the DescribeDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only supported permission type.
     * @sample AWSSimpleSystemsManagement.DescribeDocumentPermission
     */
    DescribeDocumentPermissionResult describeDocumentPermission(DescribeDocumentPermissionRequest describeDocumentPermissionRequest);

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get information about instances like the operating
     * system platform, the SSM agent version (Linux), status etc. If you specify one or more instance IDs, it returns
     * information for those instances. If you do not specify instance IDs, it returns information for all your
     * instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
     * error.
     * </p>
     * 
     * @param describeInstanceInformationRequest
     * @return Result of the DescribeInstanceInformation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidInstanceInformationFilterValueException
     *         The specified filter value is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceInformation
     */
    DescribeInstanceInformationResult describeInstanceInformation(DescribeInstanceInformationRequest describeInstanceInformationRequest);

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
    ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user executes SendCommand against three instances,
     * then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommandInvocations
     */
    ListCommandInvocationsResult listCommandInvocations(ListCommandInvocationsRequest listCommandInvocationsRequest);

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
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
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
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. If you are attempting to tag an instance, the instance must be a
     *         registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Share a document publicly or privately. If you share a document privately, you must specify the AWS user account
     * IDs for those people who can use the document. If you share a document publicly, you must specify <i>All</i> as
     * the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return Result of the ModifyDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only supported permission type.
     * @throws DocumentPermissionLimitException
     *         The document cannot be shared with more AWS user accounts. You can share a document with a maximum of 20
     *         accounts. You can publicly share up to five documents. If you need to increase this limit, contact AWS
     *         Support.
     * @throws DocumentLimitExceededException
     *         You can have at most 200 active SSM documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     */
    ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

    /**
     * <p>
     * Removes all tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. If you are attempting to tag an instance, the instance must be a
     *         registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RemoveTagsFromResource
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

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
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidOutputFolderException
     *         The S3 bucket does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM document. You can only supply values to
     *         parameters defined in the SSM document.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an SSM
     *         document for a Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of an SSM document is 64 KB.
     * @throws InvalidRoleException
     *         The role name can't contain invalid characters. Also verify that you specified an IAM role for
     *         notifications that includes the required trust policy. For information about configuring the IAM role for
     *         SSM notifications, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/rc-sns.html">Configuring SNS Notifications
     *         SSM</a> in the <i>Amazon Elastic Compute Cloud User Guide </i>.
     * @throws InvalidNotificationConfigException
     *         One or more configuration items is not valid. Verify that a valid Amazon Resource Name (ARN) was provided
     *         for an Amazon SNS topic.
     * @sample AWSSimpleSystemsManagement.SendCommand
     */
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Updates the status of the SSM document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws StatusUnchangedException
     *         The updated status is the same as the current status.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.UpdateAssociationStatus
     */
    UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return Result of the UpdateManagedInstanceRole operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateManagedInstanceRole
     */
    UpdateManagedInstanceRoleResult updateManagedInstanceRole(UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
