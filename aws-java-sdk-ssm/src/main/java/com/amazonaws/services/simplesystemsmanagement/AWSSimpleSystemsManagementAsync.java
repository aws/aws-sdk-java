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
 * Amazon EC2 Systems Manager is a collection of capabilities that helps you automate management tasks such as
 * collecting system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images
 * (AMIs), and configuring operating systems (OSs) and applications at scale. Systems Manager works with managed
 * instances: Amazon EC2 instances and servers or virtual machines (VMs) in your on-premises environment that are
 * configured for Systems Manager.
 * </p>
 * <p>
 * This references is intended to be used with the EC2 Systems Manager User Guide (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/systems-manager.html">Linux</a>) (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/systems-manager.html">Windows</a>).
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/systems-manager-prereqs.html">Linux</a>) (<a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/systems-manager-prereqs.html">Windows</a>).
 * </p>
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
     * Associates the specified SSM document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate an SSM document with one or more instances using instance IDs or tags, the SSM agent running
     * on the instance processes the document and configures the instance as specified.
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
     * Associates the specified SSM document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate an SSM document with one or more instances using instance IDs or tags, the SSM agent running
     * on the instance processes the document and configures the instance as specified.
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
     * Associates the specified SSM document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate an SSM document with one or more instances using instance IDs or tags, the SSM agent running
     * on the instance processes the document and configures the instance as specified.
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
     * Associates the specified SSM document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate an SSM document with one or more instances using instance IDs or tags, the SSM agent running
     * on the instance processes the document and configures the instance as specified.
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
     * Creates a new Maintenance Window.
     * </p>
     * 
     * @param createMaintenanceWindowRequest
     * @return A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.CreateMaintenanceWindow
     */
    java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * <p>
     * Creates a new Maintenance Window.
     * </p>
     * 
     * @param createMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.CreateMaintenanceWindow
     */
    java.util.concurrent.Future<CreateMaintenanceWindowResult> createMaintenanceWindowAsync(CreateMaintenanceWindowRequest createMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMaintenanceWindowRequest, CreateMaintenanceWindowResult> asyncHandler);

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
     * Deletes a Maintenance Window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteMaintenanceWindow
     */
    java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest);

    /**
     * <p>
     * Deletes a Maintenance Window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteMaintenanceWindow
     */
    java.util.concurrent.Future<DeleteMaintenanceWindowResult> deleteMaintenanceWindowAsync(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return A Java Future containing the result of the DeleteParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DeleteParameter
     */
    java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest deleteParameterRequest);

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeleteParameter
     */
    java.util.concurrent.Future<DeleteParameterResult> deleteParameterAsync(DeleteParameterRequest deleteParameterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteParameterRequest, DeleteParameterResult> asyncHandler);

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
     * Removes a target from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterTargetFromMaintenanceWindow
     */
    java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest);

    /**
     * <p>
     * Removes a target from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTargetFromMaintenanceWindow operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterTargetFromMaintenanceWindow
     */
    java.util.concurrent.Future<DeregisterTargetFromMaintenanceWindowResult> deregisterTargetFromMaintenanceWindowAsync(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTargetFromMaintenanceWindowRequest, DeregisterTargetFromMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Removes a task from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DeregisterTaskFromMaintenanceWindow
     */
    java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest);

    /**
     * <p>
     * Removes a task from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTaskFromMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DeregisterTaskFromMaintenanceWindow
     */
    java.util.concurrent.Future<DeregisterTaskFromMaintenanceWindowResult> deregisterTaskFromMaintenanceWindowAsync(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTaskFromMaintenanceWindowRequest, DeregisterTaskFromMaintenanceWindowResult> asyncHandler);

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
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeAutomationExecutions
     */
    java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest);

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutomationExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeAutomationExecutions
     */
    java.util.concurrent.Future<DescribeAutomationExecutionsResult> describeAutomationExecutionsAsync(
            DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutomationExecutionsRequest, DescribeAutomationExecutionsResult> asyncHandler);

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
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeEffectiveInstanceAssociations
     */
    java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest);

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEffectiveInstanceAssociations operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeEffectiveInstanceAssociations
     */
    java.util.concurrent.Future<DescribeEffectiveInstanceAssociationsResult> describeEffectiveInstanceAssociationsAsync(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEffectiveInstanceAssociationsRequest, DescribeEffectiveInstanceAssociationsResult> asyncHandler);

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeInstanceAssociationsStatus
     */
    java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest);

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceAssociationsStatus operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeInstanceAssociationsStatus
     */
    java.util.concurrent.Future<DescribeInstanceAssociationsStatusResult> describeInstanceAssociationsStatusAsync(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAssociationsStatusRequest, DescribeInstanceAssociationsStatusResult> asyncHandler);

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
     * Retrieves the individual task executions (one per target) for a particular task executed as part of a Maintenance
     * Window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
     *         returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutionTaskInvocations
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest);

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task executed as part of a Maintenance
     * Window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTaskInvocations operation
     *         returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutionTaskInvocations
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTaskInvocationsResult> describeMaintenanceWindowExecutionTaskInvocationsAsync(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTaskInvocationsRequest, DescribeMaintenanceWindowExecutionTaskInvocationsResult> asyncHandler);

    /**
     * <p>
     * For a given Maintenance Window execution, lists the tasks that were executed.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutionTasks
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest);

    /**
     * <p>
     * For a given Maintenance Window execution, lists the tasks that were executed.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutionTasks operation returned by
     *         the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutionTasks
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionTasksResult> describeMaintenanceWindowExecutionTasksAsync(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionTasksRequest, DescribeMaintenanceWindowExecutionTasksResult> asyncHandler);

    /**
     * <p>
     * Lists the executions of a Maintenance Window (meaning, information about when the Maintenance Window was
     * scheduled to be active and information about tasks registered and run with the Maintenance Window).
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowExecutions
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest);

    /**
     * <p>
     * Lists the executions of a Maintenance Window (meaning, information about when the Maintenance Window was
     * scheduled to be active and information about tasks registered and run with the Maintenance Window).
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowExecutions operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowExecutions
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowExecutionsResult> describeMaintenanceWindowExecutionsAsync(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowExecutionsRequest, DescribeMaintenanceWindowExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists the targets registered with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowTargets
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest);

    /**
     * <p>
     * Lists the targets registered with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTargets operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowTargets
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTargetsResult> describeMaintenanceWindowTargetsAsync(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTargetsRequest, DescribeMaintenanceWindowTargetsResult> asyncHandler);

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindowTasks
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest);

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindowTasks operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindowTasks
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowTasksResult> describeMaintenanceWindowTasksAsync(
            DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowTasksRequest, DescribeMaintenanceWindowTasksResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Maintenance Windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeMaintenanceWindows
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest);

    /**
     * <p>
     * Retrieves the Maintenance Windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMaintenanceWindows operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeMaintenanceWindows
     */
    java.util.concurrent.Future<DescribeMaintenanceWindowsResult> describeMaintenanceWindowsAsync(
            DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMaintenanceWindowsRequest, DescribeMaintenanceWindowsResult> asyncHandler);

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * 
     * @param describeParametersRequest
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.DescribeParameters
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * 
     * @param describeParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.DescribeParameters
     */
    java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest describeParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler);

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return A Java Future containing the result of the GetAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetAutomationExecution
     */
    java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest getAutomationExecutionRequest);

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetAutomationExecution
     */
    java.util.concurrent.Future<GetAutomationExecutionResult> getAutomationExecutionAsync(GetAutomationExecutionRequest getAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAutomationExecutionRequest, GetAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return A Java Future containing the result of the GetCommandInvocation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetCommandInvocation
     */
    java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest getCommandInvocationRequest);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCommandInvocation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetCommandInvocation
     */
    java.util.concurrent.Future<GetCommandInvocationResult> getCommandInvocationAsync(GetCommandInvocationRequest getCommandInvocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCommandInvocationRequest, GetCommandInvocationResult> asyncHandler);

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
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return A Java Future containing the result of the GetInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetInventory
     */
    java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest);

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetInventory
     */
    java.util.concurrent.Future<GetInventoryResult> getInventoryAsync(GetInventoryRequest getInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetInventoryRequest, GetInventoryResult> asyncHandler);

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return A Java Future containing the result of the GetInventorySchema operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetInventorySchema
     */
    java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest getInventorySchemaRequest);

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInventorySchema operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetInventorySchema
     */
    java.util.concurrent.Future<GetInventorySchemaResult> getInventorySchemaAsync(GetInventorySchemaRequest getInventorySchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetInventorySchemaRequest, GetInventorySchemaResult> asyncHandler);

    /**
     * <p>
     * Retrieves a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return A Java Future containing the result of the GetMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindow
     */
    java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest getMaintenanceWindowRequest);

    /**
     * <p>
     * Retrieves a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindow
     */
    java.util.concurrent.Future<GetMaintenanceWindowResult> getMaintenanceWindowAsync(GetMaintenanceWindowRequest getMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowRequest, GetMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowExecution
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Retrieves details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowExecution operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowExecution
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionResult> getMaintenanceWindowExecutionAsync(
            GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionRequest, GetMaintenanceWindowExecutionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.GetMaintenanceWindowExecutionTask
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest);

    /**
     * <p>
     * Retrieves the details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMaintenanceWindowExecutionTask operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetMaintenanceWindowExecutionTask
     */
    java.util.concurrent.Future<GetMaintenanceWindowExecutionTaskResult> getMaintenanceWindowExecutionTaskAsync(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetMaintenanceWindowExecutionTaskRequest, GetMaintenanceWindowExecutionTaskResult> asyncHandler);

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return A Java Future containing the result of the GetParameterHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParameterHistory
     */
    java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest getParameterHistoryRequest);

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParameterHistory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParameterHistory
     */
    java.util.concurrent.Future<GetParameterHistoryResult> getParameterHistoryAsync(GetParameterHistoryRequest getParameterHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetParameterHistoryRequest, GetParameterHistoryResult> asyncHandler);

    /**
     * <p>
     * Get a list of parameters used by the AWS account.&gt;
     * </p>
     * 
     * @param getParametersRequest
     * @return A Java Future containing the result of the GetParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.GetParameters
     */
    java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest);

    /**
     * <p>
     * Get a list of parameters used by the AWS account.&gt;
     * </p>
     * 
     * @param getParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParameters operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.GetParameters
     */
    java.util.concurrent.Future<GetParametersResult> getParametersAsync(GetParametersRequest getParametersRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersRequest, GetParametersResult> asyncHandler);

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
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return A Java Future containing the result of the ListDocumentVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListDocumentVersions
     */
    java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest listDocumentVersionsRequest);

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocumentVersions operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListDocumentVersions
     */
    java.util.concurrent.Future<ListDocumentVersionsResult> listDocumentVersionsAsync(ListDocumentVersionsRequest listDocumentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentVersionsRequest, ListDocumentVersionsResult> asyncHandler);

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
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return A Java Future containing the result of the ListInventoryEntries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.ListInventoryEntries
     */
    java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(ListInventoryEntriesRequest listInventoryEntriesRequest);

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInventoryEntries operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.ListInventoryEntries
     */
    java.util.concurrent.Future<ListInventoryEntriesResult> listInventoryEntriesAsync(ListInventoryEntriesRequest listInventoryEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInventoryEntriesRequest, ListInventoryEntriesResult> asyncHandler);

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
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return A Java Future containing the result of the PutInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.PutInventory
     */
    java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest);

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInventory operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.PutInventory
     */
    java.util.concurrent.Future<PutInventoryResult> putInventoryAsync(PutInventoryRequest putInventoryRequest,
            com.amazonaws.handlers.AsyncHandler<PutInventoryRequest, PutInventoryResult> asyncHandler);

    /**
     * <p>
     * Add one or more paramaters to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return A Java Future containing the result of the PutParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.PutParameter
     */
    java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest);

    /**
     * <p>
     * Add one or more paramaters to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutParameter operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.PutParameter
     */
    java.util.concurrent.Future<PutParameterResult> putParameterAsync(PutParameterRequest putParameterRequest,
            com.amazonaws.handlers.AsyncHandler<PutParameterRequest, PutParameterResult> asyncHandler);

    /**
     * <p>
     * Registers a target with a Maintenance Window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterTargetWithMaintenanceWindow
     */
    java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest);

    /**
     * <p>
     * Registers a target with a Maintenance Window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTargetWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterTargetWithMaintenanceWindow
     */
    java.util.concurrent.Future<RegisterTargetWithMaintenanceWindowResult> registerTargetWithMaintenanceWindowAsync(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTargetWithMaintenanceWindowRequest, RegisterTargetWithMaintenanceWindowResult> asyncHandler);

    /**
     * <p>
     * Adds a new task to a Maintenance Window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.RegisterTaskWithMaintenanceWindow
     */
    java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest);

    /**
     * <p>
     * Adds a new task to a Maintenance Window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTaskWithMaintenanceWindow operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.RegisterTaskWithMaintenanceWindow
     */
    java.util.concurrent.Future<RegisterTaskWithMaintenanceWindowResult> registerTaskWithMaintenanceWindowAsync(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTaskWithMaintenanceWindowRequest, RegisterTaskWithMaintenanceWindowResult> asyncHandler);

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
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return A Java Future containing the result of the StartAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StartAutomationExecution
     */
    java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest startAutomationExecutionRequest);

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StartAutomationExecution
     */
    java.util.concurrent.Future<StartAutomationExecutionResult> startAutomationExecutionAsync(StartAutomationExecutionRequest startAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartAutomationExecutionRequest, StartAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Stop an Automation that is currently executing.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return A Java Future containing the result of the StopAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.StopAutomationExecution
     */
    java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest stopAutomationExecutionRequest);

    /**
     * <p>
     * Stop an Automation that is currently executing.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAutomationExecution operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.StopAutomationExecution
     */
    java.util.concurrent.Future<StopAutomationExecutionResult> stopAutomationExecutionAsync(StopAutomationExecutionRequest stopAutomationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopAutomationExecutionRequest, StopAutomationExecutionResult> asyncHandler);

    /**
     * <p>
     * Updates an association. You can only update the document version, schedule, parameters, and Amazon S3 output of
     * an association.
     * </p>
     * 
     * @param updateAssociationRequest
     * @return A Java Future containing the result of the UpdateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateAssociation
     */
    java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest updateAssociationRequest);

    /**
     * <p>
     * Updates an association. You can only update the document version, schedule, parameters, and Amazon S3 output of
     * an association.
     * </p>
     * 
     * @param updateAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAssociation operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateAssociation
     */
    java.util.concurrent.Future<UpdateAssociationResult> updateAssociationAsync(UpdateAssociationRequest updateAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationRequest, UpdateAssociationResult> asyncHandler);

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
     * The document you want to update.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateDocument
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest);

    /**
     * <p>
     * The document you want to update.
     * </p>
     * 
     * @param updateDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocument operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateDocument
     */
    java.util.concurrent.Future<UpdateDocumentResult> updateDocumentAsync(UpdateDocumentRequest updateDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentRequest, UpdateDocumentResult> asyncHandler);

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateDocumentDefaultVersion
     */
    java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest);

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDocumentDefaultVersion operation returned by the
     *         service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateDocumentDefaultVersion
     */
    java.util.concurrent.Future<UpdateDocumentDefaultVersionResult> updateDocumentDefaultVersionAsync(
            UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDocumentDefaultVersionRequest, UpdateDocumentDefaultVersionResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Maintenance Window. Only specified parameters are modified.
     * </p>
     * 
     * @param updateMaintenanceWindowRequest
     * @return A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsync.UpdateMaintenanceWindow
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest);

    /**
     * <p>
     * Updates an existing Maintenance Window. Only specified parameters are modified.
     * </p>
     * 
     * @param updateMaintenanceWindowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMaintenanceWindow operation returned by the service.
     * @sample AWSSimpleSystemsManagementAsyncHandler.UpdateMaintenanceWindow
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowResult> updateMaintenanceWindowAsync(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResult> asyncHandler);

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
