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

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing Amazon SSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagementAsync} instead.
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
public interface AWSSimpleSystemsManagementAsync extends AWSSimpleSystemsManagement {

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
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return A Java Future containing the result of the CancelCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CancelCommand
     */
    java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest);

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CancelCommand
     */
    java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(CancelCommandRequest cancelCommandRequest,
            com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateActivation
     */
    java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest createActivationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateActivation
     */
    java.util.concurrent.Future<CreateActivationResult> createActivationAsync(CreateActivationRequest createActivationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActivationRequest, CreateActivationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateAssociation
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateAssociation
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateAssociationBatch operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateAssociationBatch
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociationBatch operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateAssociationBatch
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateDocument
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateDocument
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler);

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return A Java Future containing the result of the DeleteActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteActivation
     */
    java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest deleteActivationRequest);

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteActivation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteActivation
     */
    java.util.concurrent.Future<DeleteActivationResult> deleteActivationAsync(DeleteActivationRequest deleteActivationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActivationRequest, DeleteActivationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteAssociation
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteAssociation
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteDocument
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteDocument
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don’t plan to use Run Command on the server, we suggest uninstalling the SSM agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return A Java Future containing the result of the DeregisterManagedInstance operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterManagedInstance
     */
    java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don’t plan to use Run Command on the server, we suggest uninstalling the SSM agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterManagedInstance operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterManagedInstance
     */
    java.util.concurrent.Future<DeregisterManagedInstanceResult> deregisterManagedInstanceAsync(
            DeregisterManagedInstanceRequest deregisterManagedInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterManagedInstanceRequest, DeregisterManagedInstanceResult> asyncHandler);

    /**
     * <p>
     * Details about the activation, including: the date and time the activation was created, the expiration date, the
     * IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return A Java Future containing the result of the DescribeActivations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeActivations
     */
    java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest describeActivationsRequest);

    /**
     * <p>
     * Details about the activation, including: the date and time the activation was created, the expiration date, the
     * IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
     * </p>
     * 
     * @param describeActivationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActivations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeActivations
     */
    java.util.concurrent.Future<DescribeActivationsResult> describeActivationsAsync(DescribeActivationsRequest describeActivationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActivationsRequest, DescribeActivationsResult> asyncHandler);

    /**
     * <p>
     * Describes the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future containing the result of the DescribeAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAssociation
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Describes the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAssociation
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler);

    /**
     * <p>
     * Describes the specified SSM document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future containing the result of the DescribeDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeDocument
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the specified SSM document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeDocument
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions for an SSM document. If you created the document, you are the owner. If a document is
     * shared, it can either be shared privately (by specifying a user’s AWS account ID) or publicly (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return A Java Future containing the result of the DescribeDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeDocumentPermission
     */
    java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest);

    /**
     * <p>
     * Describes the permissions for an SSM document. If you created the document, you are the owner. If a document is
     * shared, it can either be shared privately (by specifying a user’s AWS account ID) or publicly (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeDocumentPermission
     */
    java.util.concurrent.Future<DescribeDocumentPermissionResult> describeDocumentPermissionAsync(
            DescribeDocumentPermissionRequest describeDocumentPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentPermissionRequest, DescribeDocumentPermissionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInstanceInformation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstanceInformation
     */
    java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceInformation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstanceInformation
     */
    java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest describeInstanceInformationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler);

    /**
     * <p>
     * Gets the contents of the specified SSM document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetDocument
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Gets the contents of the specified SSM document.
     * </p>
     * 
     * @param getDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetDocument
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler);

    /**
     * <p>
     * Lists the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListAssociations
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * Lists the associations for the specified SSM document or instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListAssociations
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user executes SendCommand against three instances,
     * then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return A Java Future containing the result of the ListCommandInvocations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListCommandInvocations
     */
    java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest listCommandInvocationsRequest);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user executes SendCommand against three instances,
     * then a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCommandInvocations operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListCommandInvocations
     */
    java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(ListCommandInvocationsRequest listCommandInvocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler);

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return A Java Future containing the result of the ListCommands operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListCommands
     */
    java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest);

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCommands operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListCommands
     */
    java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(ListCommandsRequest listCommandsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your SSM documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListDocuments
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest);

    /**
     * <p>
     * Describes one or more of your SSM documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocuments operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListDocuments
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync();

    /**
     * Simplified method form for invoking the ListDocuments operation with an AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Share a document publicly or privately. If you share a document privately, you must specify the AWS user account
     * IDs for those people who can use the document. If you share a document publicly, you must specify <i>All</i> as
     * the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return A Java Future containing the result of the ModifyDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ModifyDocumentPermission
     */
    java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

    /**
     * <p>
     * Share a document publicly or privately. If you share a document privately, you must specify the AWS user account
     * IDs for those people who can use the document. If you share a document publicly, you must specify <i>All</i> as
     * the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyDocumentPermission operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ModifyDocumentPermission
     */
    java.util.concurrent.Future<ModifyDocumentPermissionResult> modifyDocumentPermissionAsync(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyDocumentPermissionRequest, ModifyDocumentPermissionResult> asyncHandler);

    /**
     * <p>
     * Removes all tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes all tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RemoveTagsFromResource
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Executes commands on one or more remote instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.SendCommand
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Executes commands on one or more remote instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendCommand operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.SendCommand
     */
    java.util.concurrent.Future<SendCommandResult> sendCommandAsync(SendCommandRequest sendCommandRequest,
            com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the SSM document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future containing the result of the UpdateAssociationStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateAssociationStatus
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * <p>
     * Updates the status of the SSM document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssociationStatus operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateAssociationStatus
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler);

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateManagedInstanceRole
     */
    java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest);

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateManagedInstanceRole operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateManagedInstanceRole
     */
    java.util.concurrent.Future<UpdateManagedInstanceRoleResult> updateManagedInstanceRoleAsync(
            UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateManagedInstanceRoleRequest, UpdateManagedInstanceRoleResult> asyncHandler);

}
