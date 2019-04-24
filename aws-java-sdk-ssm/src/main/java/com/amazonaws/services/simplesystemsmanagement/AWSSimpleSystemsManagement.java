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
package com.amazonaws.services.simplesystemsmanagement;

import javax.annotation.Generated;

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
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate management tasks such as collecting
 * system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and securely
 * manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon EC2 instance or
 * on-premises machine in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Systems Manager
 * Prerequisites</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on Amazon EC2 instances, see the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>. For information about how
 * to use a Query API, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API Requests</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "ssm.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://ssm.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your
     * documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable
     * you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
     * consists of a key and an optional value, both of which you define. For example, you could define a set of tags
     * for your account's managed instances that helps you track each instance's owner and stack level. For example:
     * Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
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
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyTagsErrorException
     *         The Targets parameter includes too many tags. Remove one or more tags and try the command again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
     *      Documentation</a>
     */
    CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest);

    /**
     * <p>
     * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have
     * not already starting running. (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return Result of the CancelMaintenanceWindowExecution operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @sample AWSSimpleSystemsManagement.CancelMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMaintenanceWindowExecutionResult cancelMaintenanceWindowExecution(CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
     * Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
     * instance. For more information about activations, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html">Setting
     * Up Systems Manager in Hybrid Environments</a>.
     * </p>
     * 
     * @param createActivationRequest
     * @return Result of the CreateActivation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateActivation" target="_top">AWS API
     *      Documentation</a>
     */
    CreateActivationResult createActivation(CreateActivationRequest createActivationRequest);

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
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
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return Result of the CreateAssociationBatch operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Creates a Systems Manager document.
     * </p>
     * <p>
     * After you create a document, you can use CreateAssociation to associate it with one or more running instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return Result of the CreateDocument operation returned by the service.
     * @throws DocumentAlreadyExistsException
     *         The specified document already exists.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentContentException
     *         The content for the document is not valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 200 active Systems Manager documents.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @sample AWSSimpleSystemsManagement.CreateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Creates a new Maintenance Window.
     * </p>
     * 
     * @param createMaintenanceWindowRequest
     * @return Result of the CreateMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMaintenanceWindowResult createMaintenanceWindow(CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return Result of the CreatePatchBaseline operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePatchBaselineResult createPatchBaseline(CreatePatchBaselineRequest createPatchBaselineRequest);

    /**
     * <p>
     * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation
     * that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the
     * Amazon S3 bucket. To check the status of the sync, use the <a>ListResourceDataSync</a>.
     * </p>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
     * ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
     * restrictive bucket policy. For more information, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring
     * Resource Data Sync for Inventory</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createResourceDataSyncRequest
     * @return Result of the CreateResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncCountExceededException
     *         You have exceeded the allowed maximum sync configurations.
     * @throws ResourceDataSyncAlreadyExistsException
     *         A sync configuration with the same name already exists.
     * @throws ResourceDataSyncInvalidConfigurationException
     *         The specified sync configuration is invalid.
     * @sample AWSSimpleSystemsManagement.CreateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    CreateResourceDataSyncResult createResourceDataSync(CreateResourceDataSyncRequest createResourceDataSyncRequest);

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
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteActivation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteActivationResult deleteActivation(DeleteActivationRequest deleteActivationRequest);

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the configuration of the instance. To
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use <a>DeleteAssociation</a> to disassociate all instances
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
     *         You must disassociate a document from all instances before you can delete it.
     * @sample AWSSimpleSystemsManagement.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDocumentResult deleteDocument(DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory
     * type is also referred to as deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return Result of the DeleteInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidOptionException
     *         The delete inventory option specified is not valid. Verify the option and try again.
     * @throws InvalidDeleteInventoryParametersException
     *         One or more of the parameters specified for the delete operation is not valid. Verify all parameters and
     *         try again.
     * @throws InvalidInventoryRequestException
     *         The request is not valid.
     * @sample AWSSimpleSystemsManagement.DeleteInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInventoryResult deleteInventory(DeleteInventoryRequest deleteInventoryRequest);

    /**
     * <p>
     * Deletes a Maintenance Window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return Result of the DeleteMaintenanceWindow operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMaintenanceWindowResult deleteMaintenanceWindow(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest);

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return Result of the DeleteParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @sample AWSSimpleSystemsManagement.DeleteParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteParameterResult deleteParameter(DeleteParameterRequest deleteParameterRequest);

    /**
     * <p>
     * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return Result of the DeleteParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameters" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteParametersResult deleteParameters(DeleteParametersRequest deleteParametersRequest);

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return Result of the DeletePatchBaseline operation returned by the service.
     * @throws ResourceInUseException
     *         Error returned if an attempt is made to delete a patch baseline that is registered for a patch group.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeletePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeletePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePatchBaselineResult deletePatchBaseline(DeletePatchBaselineRequest deletePatchBaselineRequest);

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on
     * managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not
     * delete data in the target Amazon S3 bucket.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return Result of the DeleteResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncNotFoundException
     *         The specified sync name was not found.
     * @sample AWSSimpleSystemsManagement.DeleteResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourceDataSyncResult deleteResourceDataSync(DeleteResourceDataSyncRequest deleteResourceDataSyncRequest);

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return Result of the DeregisterManagedInstance operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterManagedInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterManagedInstance" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterManagedInstanceResult deregisterManagedInstance(DeregisterManagedInstanceRequest deregisterManagedInstanceRequest);

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return Result of the DeregisterPatchBaselineForPatchGroup operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterPatchBaselineForPatchGroupResult deregisterPatchBaselineForPatchGroup(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * Removes a target from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TargetInUseException
     *         You specified the <code>Safe</code> option for the DeregisterTargetFromMaintenanceWindow operation, but
     *         the target is still referenced in a task.
     * @sample AWSSimpleSystemsManagement.DeregisterTargetFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTargetFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterTargetFromMaintenanceWindowResult deregisterTargetFromMaintenanceWindow(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest);

    /**
     * <p>
     * Removes a task from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterTaskFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTaskFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterTaskFromMaintenanceWindowResult deregisterTaskFromMaintenanceWindow(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivations" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeActivationsResult describeActivations(DescribeActivationsRequest describeActivationsRequest);

    /**
     * <p>
     * Describes the association for the specified target or instance. If you created the association by using the
     * <code>Targets</code> parameter, then you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
     * association by specifying the document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidAssociationVersionException
     *         The version you specified is not valid. Use ListAssociationVersions to view all versions of an
     *         association according to the association ID. Or, use the <code>$LATEST</code> parameter to view the
     *         latest version of the association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @sample AWSSimpleSystemsManagement.DescribeAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAssociationResult describeAssociation(DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Use this API action to view information about a specific execution of a specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return Result of the DescribeAssociationExecutionTargets operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws AssociationExecutionDoesNotExistException
     *         The specified execution ID does not exist. Verify the ID number and try again.
     * @sample AWSSimpleSystemsManagement.DescribeAssociationExecutionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAssociationExecutionTargetsResult describeAssociationExecutionTargets(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest);

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return Result of the DescribeAssociationExecutions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeAssociationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAssociationExecutionsResult describeAssociationExecutions(DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest);

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return Result of the DescribeAutomationExecutions operation returned by the service.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAutomationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutomationExecutionsResult describeAutomationExecutions(DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest);

    /**
     * <p>
     * Information about all active and terminated step executions in an Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return Result of the DescribeAutomationStepExecutions operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAutomationStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutomationStepExecutionsResult describeAutomationStepExecutions(DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest);

    /**
     * <p>
     * Lists all patches that could possibly be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return Result of the DescribeAvailablePatches operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAvailablePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAvailablePatchesResult describeAvailablePatches(DescribeAvailablePatchesRequest describeAvailablePatchesRequest);

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @sample AWSSimpleSystemsManagement.DescribeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
     * document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDocumentPermissionResult describeDocumentPermission(DescribeDocumentPermissionRequest describeDocumentPermissionRequest);

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return Result of the DescribeEffectiveInstanceAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeEffectiveInstanceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectiveInstanceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEffectiveInstanceAssociationsResult describeEffectiveInstanceAssociations(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest);

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
     * that this API applies only to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified is not supported, or the operation is not supported for the operating
     *         system. Valid operating systems include: Windows, AmazonLinux, RedhatEnterpriseLinux, and Ubuntu.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeEffectivePatchesForPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectivePatchesForPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEffectivePatchesForPatchBaselineResult describeEffectivePatchesForPatchBaseline(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest);

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return Result of the DescribeInstanceAssociationsStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceAssociationsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceAssociationsStatusResult describeInstanceAssociationsStatus(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest);

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get information about instances like the operating
     * system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns
     * information for those instances. If you do not specify instance IDs, it returns information for all your
     * instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
     * error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
     * on-premises instances. This call does not return the IAM role for Amazon EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return Result of the DescribeInstanceInformation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidInstanceInformationFilterValueException
     *         The specified filter value is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceInformation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceInformationResult describeInstanceInformation(DescribeInstanceInformationRequest describeInstanceInformationRequest);

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return Result of the DescribeInstancePatchStates operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatchStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStates"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstancePatchStatesResult describeInstancePatchStates(DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest);

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return Result of the DescribeInstancePatchStatesForPatchGroup operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatchStatesForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStatesForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstancePatchStatesForPatchGroupResult describeInstancePatchStatesForPatchGroup(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest);

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and their state relative to the patch baseline
     * being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return Result of the DescribeInstancePatches operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatches" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInstancePatchesResult describeInstancePatches(DescribeInstancePatchesRequest describeInstancePatchesRequest);

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return Result of the DescribeInventoryDeletions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDeletionIdException
     *         The ID specified for the delete operation does not exist or is not valide. Verify the ID and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInventoryDeletions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInventoryDeletions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInventoryDeletionsResult describeInventoryDeletions(DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest);

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task run as part of a Maintenance
     * Window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutionTaskInvocations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTaskInvocations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowExecutionTaskInvocationsResult describeMaintenanceWindowExecutionTaskInvocations(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest);

    /**
     * <p>
     * For a given Maintenance Window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowExecutionTasksResult describeMaintenanceWindowExecutionTasks(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest);

    /**
     * <p>
     * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was
     * scheduled to be active, and information about tasks registered and run with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return Result of the DescribeMaintenanceWindowExecutions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowExecutionsResult describeMaintenanceWindowExecutions(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest);

    /**
     * <p>
     * Retrieves information about upcoming executions of a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return Result of the DescribeMaintenanceWindowSchedule operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowScheduleResult describeMaintenanceWindowSchedule(DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest);

    /**
     * <p>
     * Lists the targets registered with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return Result of the DescribeMaintenanceWindowTargets operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowTargetsResult describeMaintenanceWindowTargets(DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest);

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return Result of the DescribeMaintenanceWindowTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowTasksResult describeMaintenanceWindowTasks(DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest);

    /**
     * <p>
     * Retrieves the Maintenance Windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return Result of the DescribeMaintenanceWindows operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindows" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMaintenanceWindowsResult describeMaintenanceWindows(DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest);

    /**
     * <p>
     * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return Result of the DescribeMaintenanceWindowsForTarget operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowsForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowsForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowsForTargetResult describeMaintenanceWindowsForTarget(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest);

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option is not valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeParametersResult describeParameters(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return Result of the DescribePatchBaselines operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribePatchBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePatchBaselinesResult describePatchBaselines(DescribePatchBaselinesRequest describePatchBaselinesRequest);

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return Result of the DescribePatchGroupState operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribePatchGroupState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePatchGroupStateResult describePatchGroupState(DescribePatchGroupStateRequest describePatchGroupStateRequest);

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return Result of the DescribePatchGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribePatchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePatchGroupsResult describePatchGroups(DescribePatchGroupsRequest describePatchGroupsRequest);

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
     * days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return Result of the GetAutomationExecution operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
     *      Documentation</a>
     */
    GetAutomationExecutionResult getAutomationExecution(GetAutomationExecutionRequest getAutomationExecutionRequest);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return Result of the GetCommandInvocation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidPluginNameException
     *         The plugin name is not valid.
     * @throws InvocationDoesNotExistException
     *         The command ID and instance ID you specified did not match any invocations. Verify the command ID adn the
     *         instance ID and try again.
     * @sample AWSSimpleSystemsManagement.GetCommandInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
     *      Documentation</a>
     */
    GetCommandInvocationResult getCommandInvocation(GetCommandInvocationRequest getCommandInvocationRequest);

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to
     * receive Session Manager connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return Result of the GetConnectionStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetConnectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    GetConnectionStatusResult getConnectionStatus(GetConnectionStatusRequest getConnectionStatusRequest);

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
     * baselines. For example, you can create a default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return Result of the GetDefaultPatchBaseline operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDefaultPatchBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    GetDefaultPatchBaselineResult getDefaultPatchBaseline(GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest);

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
     * AWS-RunPatchBaseline Systems Manager document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return Result of the GetDeployablePatchSnapshotForInstance operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified is not supported, or the operation is not supported for the operating
     *         system. Valid operating systems include: Windows, AmazonLinux, RedhatEnterpriseLinux, and Ubuntu.
     * @sample AWSSimpleSystemsManagement.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest);

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @sample AWSSimpleSystemsManagement.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    GetDocumentResult getDocument(GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return Result of the GetInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidInventoryGroupException
     *         The specified inventory group is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidAggregatorException
     *         The specified aggregator is not valid for inventory groups. Verify that the aggregator uses a valid
     *         inventory type such as <code>AWS:Application</code> or <code>AWS:InstanceInformation</code>.
     * @throws InvalidResultAttributeException
     *         The specified inventory item result attribute is not valid.
     * @sample AWSSimpleSystemsManagement.GetInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventory" target="_top">AWS API
     *      Documentation</a>
     */
    GetInventoryResult getInventory(GetInventoryRequest getInventoryRequest);

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return Result of the GetInventorySchema operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.GetInventorySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
     *      Documentation</a>
     */
    GetInventorySchemaResult getInventorySchema(GetInventorySchemaRequest getInventorySchemaRequest);

    /**
     * <p>
     * Retrieves a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return Result of the GetMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    GetMaintenanceWindowResult getMaintenanceWindow(GetMaintenanceWindowRequest getMaintenanceWindowRequest);

    /**
     * <p>
     * Retrieves details about a specific task run as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return Result of the GetMaintenanceWindowExecution operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return Result of the GetMaintenanceWindowExecutionTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest);

    /**
     * <p>
     * Retrieves a task invocation. A task invocation is a specific task running on a specific target. Maintenance
     * Windows report status for all invocations.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTaskInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocation(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest);

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return Result of the GetMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS
     *      API Documentation</a>
     */
    GetMaintenanceWindowTaskResult getMaintenanceWindowTask(GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't confuse this API action with the
     * <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return Result of the GetParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version was not found. Verify the parameter name and version, and try again.
     * @sample AWSSimpleSystemsManagement.GetParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
     *      Documentation</a>
     */
    GetParameterResult getParameter(GetParameterRequest getParameterRequest);

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return Result of the GetParameterHistory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @sample AWSSimpleSystemsManagement.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    GetParameterHistoryResult getParameterHistory(GetParameterHistoryRequest getParameterHistoryRequest);

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return Result of the GetParameters operation returned by the service.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    GetParametersResult getParameters(GetParametersRequest getParametersRequest);

    /**
     * <p>
     * Retrieve parameters in a specific hierarchy. For more information, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-working.html">Working with
     * Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * <note>
     * <p>
     * This API action doesn't support filtering by tags.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return Result of the GetParametersByPath operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option is not valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.GetParametersByPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParametersByPath" target="_top">AWS API
     *      Documentation</a>
     */
    GetParametersByPathResult getParametersByPath(GetParametersByPathRequest getParametersByPathRequest);

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return Result of the GetPatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    GetPatchBaselineResult getPatchBaseline(GetPatchBaselineRequest getPatchBaselineRequest);

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return Result of the GetPatchBaselineForPatchGroup operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetPatchBaselineForPatchGroupResult getPatchBaselineForPatchGroup(GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>UpdateServiceSetting</a> API action to change the default setting. Or use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest
     *        The request body of the GetServiceSetting API action.
     * @return Result of the GetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @sample AWSSimpleSystemsManagement.GetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceSettingResult getServiceSetting(GetServiceSettingRequest getServiceSettingRequest);

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
     * parameter, Systems Manager automatically saves a new version and increments the version number by one. A label
     * can help you remember the purpose of a parameter when there are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same parameter. For example, if version 1 has the
     * label Production, then you can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach a label to a specific version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a
     * different version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these
     * requirements, then the label is not associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return Result of the LabelParameterVersion operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version was not found. Verify the parameter name and version, and try again.
     * @throws ParameterVersionLabelLimitExceededException
     *         A parameter version can have a maximum of ten labels.
     * @sample AWSSimpleSystemsManagement.LabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LabelParameterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    LabelParameterVersionResult labelParameterVersion(LabelParameterVersionRequest labelParameterVersionRequest);

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return Result of the ListAssociationVersions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @sample AWSSimpleSystemsManagement.ListAssociationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociationVersionsResult listAssociationVersions(ListAssociationVersionsRequest listAssociationVersionsRequest);

    /**
     * <p>
     * Lists the associations for the specified Systems Manager document or instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
     * a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommandInvocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
     *      Documentation</a>
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommands" target="_top">AWS API
     *      Documentation</a>
     */
    ListCommandsResult listCommands(ListCommandsRequest listCommandsRequest);

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
     * Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
     * filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return Result of the ListComplianceItems operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    ListComplianceItemsResult listComplianceItems(ListComplianceItemsRequest listComplianceItemsRequest);

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
     * can return State Manager associations, patches, or custom compliance types according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return Result of the ListComplianceSummaries operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS
     *      API Documentation</a>
     */
    ListComplianceSummariesResult listComplianceSummaries(ListComplianceSummariesRequest listComplianceSummariesRequest);

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return Result of the ListDocumentVersions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @sample AWSSimpleSystemsManagement.ListDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListDocumentVersionsResult listDocumentVersions(ListDocumentVersionsRequest listDocumentVersionsRequest);

    /**
     * <p>
     * Describes one or more of your Systems Manager documents.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocuments" target="_top">AWS API
     *      Documentation</a>
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
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return Result of the ListInventoryEntries operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListInventoryEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
     *      Documentation</a>
     */
    ListInventoryEntriesResult listInventoryEntries(ListInventoryEntriesRequest listInventoryEntriesRequest);

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information about compliant and non-compliant
     * statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return Result of the ListResourceComplianceSummaries operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListResourceComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceComplianceSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceComplianceSummariesResult listResourceComplianceSummaries(ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest);

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
     * the last sync status, and the last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a single call to
     * <code>ListResourceDataSync</code>. You can limit the number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more sync configurations to list, check the
     * value of <code>NextToken</code> in the output. If there are more sync configurations to list, you can request
     * them by specifying the <code>NextToken</code> returned in the call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return Result of the ListResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourceDataSyncResult listResourceDataSync(ListResourceDataSyncRequest listResourceDataSyncRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
     * AWS user account IDs for those people who can use the document. If you share a document publicly, you must
     * specify <i>All</i> as the account ID.
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
     *         You can have at most 200 active Systems Manager documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated resource. This action lets you register
     * custom compliance details with a resource. This call overwrites existing compliance information on the resource,
     * so you must provide a full list of compliance items each time that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example, <code>approved</code> for patches, or <code>Failed</code>
     * for associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example, <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example, <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify
     * the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return Result of the PutComplianceItems operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidItemContentException
     *         One or more content items is not valid.
     * @throws TotalSizeLimitExceededException
     *         The size of inventory data has exceeded the total size limit for the resource.
     * @throws ItemSizeLimitExceededException
     *         The inventory item size has exceeded the size limit.
     * @throws ComplianceTypeCountLimitExceededException
     *         You specified too many custom compliance types. You can specify a maximum of 10 different types.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @sample AWSSimpleSystemsManagement.PutComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    PutComplianceItemsResult putComplianceItems(PutComplianceItemsRequest putComplianceItemsRequest);

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return Result of the PutInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidItemContentException
     *         One or more content items is not valid.
     * @throws TotalSizeLimitExceededException
     *         The size of inventory data has exceeded the total size limit for the resource.
     * @throws ItemSizeLimitExceededException
     *         The inventory item size has exceeded the size limit.
     * @throws ItemContentMismatchException
     *         The inventory item has invalid content.
     * @throws CustomSchemaCountLimitExceededException
     *         You have exceeded the limit for custom schemas. Delete one or more custom schemas and try again.
     * @throws UnsupportedInventorySchemaVersionException
     *         Inventory item type schema version has to match supported versions in the service. Check output of
     *         GetInventorySchema to see the available schema version for each type.
     * @throws UnsupportedInventoryItemContextException
     *         The <code>Context</code> attribute that you specified for the <code>InventoryItem</code> is not allowed
     *         for this inventory type. You can only use the <code>Context</code> attribute with inventory types like
     *         <code>AWS:ComplianceItem</code>.
     * @throws InvalidInventoryItemContextException
     *         You specified invalid keys or values in the <code>Context</code> attribute for <code>InventoryItem</code>
     *         . Verify the keys and values, and try again.
     * @throws SubTypeCountLimitExceededException
     *         The sub-type count exceeded the limit for the inventory type.
     * @sample AWSSimpleSystemsManagement.PutInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
     *      Documentation</a>
     */
    PutInventoryResult putInventory(PutInventoryRequest putInventoryRequest);

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return Result of the PutParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws ParameterLimitExceededException
     *         You have exceeded the number of parameters for this AWS account. Delete one or more parameters and try
     *         again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterAlreadyExistsException
     *         The parameter already exists. You can't create duplicate parameters.
     * @throws HierarchyLevelLimitExceededException
     *         A hierarchy can have a maximum of 15 levels. For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *         >Requirements and Constraints for Parameter Names</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws HierarchyTypeMismatchException
     *         Parameter Store does not support changing a parameter type in a hierarchy. For example, you can't change
     *         a parameter from a String type to a SecureString type. You must create a new, unique parameter.
     * @throws InvalidAllowedPatternException
     *         The request does not meet the regular expression requirement.
     * @throws ParameterMaxVersionLimitExceededException
     *         The parameter exceeded the maximum number of allowed versions.
     * @throws ParameterPatternMismatchException
     *         The parameter name is not valid.
     * @throws UnsupportedParameterTypeException
     *         The parameter type is not supported.
     * @throws PoliciesLimitExceededException
     *         You specified more than the maximum number of allowed policies for the parameter. The maximum is 10.
     * @throws InvalidPolicyTypeException
     *         The policy type is not supported. Parameter Store supports the following policy types: Expiration,
     *         ExpirationNotification, and NoChangeNotification.
     * @throws InvalidPolicyAttributeException
     *         A policy attribute or its value is invalid.
     * @throws IncompatiblePolicyException
     *         There is a conflict in the policies specified for this parameter. You can't, for example, specify two
     *         Expiration policies for a parameter. Review your policies, and try again.
     * @sample AWSSimpleSystemsManagement.PutParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
     *      Documentation</a>
     */
    PutParameterResult putParameter(PutParameterRequest putParameterRequest);

    /**
     * <p>
     * Defines the default patch baseline.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return Result of the RegisterDefaultPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterDefaultPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterDefaultPatchBaselineResult registerDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest);

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return Result of the RegisterPatchBaselineForPatchGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         Error returned if an attempt is made to register a patch group with a patch baseline that is already
     *         registered with a different patch baseline.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterPatchBaselineForPatchGroupResult registerPatchBaselineForPatchGroup(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest);

    /**
     * <p>
     * Registers a target with a Maintenance Window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return Result of the RegisterTargetWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterTargetWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTargetWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTargetWithMaintenanceWindowResult registerTargetWithMaintenanceWindow(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest);

    /**
     * <p>
     * Adds a new task to a Maintenance Window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return Result of the RegisterTaskWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws FeatureNotAvailableException
     *         You attempted to register a LAMBDA or STEP_FUNCTION task in a region where the corresponding service is
     *         not available.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterTaskWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTaskWithMaintenanceWindowResult registerTaskWithMaintenanceWindow(RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest);

    /**
     * <p>
     * Removes all tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Use the <a>UpdateServiceSetting</a> API action to
     * change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest
     *        The request body of the ResetServiceSetting API action.
     * @return Result of the ResetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.ResetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    ResetServiceSettingResult resetServiceSetting(ResetServiceSettingRequest resetServiceSettingRequest);

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
     * sessions, but not terminated sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically reconnect during intermittent network
     * issues. It is not intended for any other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return Result of the ResumeSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ResumeSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResumeSession" target="_top">AWS API
     *      Documentation</a>
     */
    ResumeSessionResult resumeSession(ResumeSessionRequest resumeSessionRequest);

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return Result of the SendAutomationSignal operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws AutomationStepNotFoundException
     *         The specified step name and execution ID don't exist. Verify the information and try again.
     * @throws InvalidAutomationSignalException
     *         The signal is not valid for the current Automation execution.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.SendAutomationSignal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendAutomationSignal" target="_top">AWS API
     *      Documentation</a>
     */
    SendAutomationSignalResult sendAutomationSignal(SendAutomationSignalRequest sendAutomationSignalRequest);

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return Result of the SendCommand operation returned by the service.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidOutputFolderException
     *         The S3 bucket does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InvalidRoleException
     *         The role name can't contain invalid characters. Also verify that you specified an IAM role for
     *         notifications that includes the required trust policy. For information about configuring the IAM role for
     *         Run Command notifications, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *         Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws InvalidNotificationConfigException
     *         One or more configuration items is not valid. Verify that a valid Amazon Resource Name (ARN) was provided
     *         for an Amazon SNS topic.
     * @sample AWSSimpleSystemsManagement.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Use this API action to run an association immediately and only one time. This action can be helpful when
     * troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return Result of the StartAssociationsOnce operation returned by the service.
     * @throws InvalidAssociationException
     *         The association is not valid or does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @sample AWSSimpleSystemsManagement.StartAssociationsOnce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
     *      Documentation</a>
     */
    StartAssociationsOnceResult startAssociationsOnce(StartAssociationsOnceRequest startAssociationsOnceRequest);

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return Result of the StartAutomationExecution operation returned by the service.
     * @throws AutomationDefinitionNotFoundException
     *         An Automation document with the specified name could not be found.
     * @throws InvalidAutomationExecutionParametersException
     *         The supplied parameters for invoking the specified Automation document are incorrect. For example, they
     *         may not match the set of parameters permitted for the specified Automation document.
     * @throws AutomationExecutionLimitExceededException
     *         The number of simultaneously running Automation executions exceeded the allowable limit.
     * @throws AutomationDefinitionVersionNotFoundException
     *         An Automation document with the specified name and version could not be found.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StartAutomationExecutionResult startAutomationExecution(StartAutomationExecutionRequest startAutomationExecutionRequest);

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
     * token that can be used to open a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that requires the Session Manager plugin to
     * be installed on the client machine making the call. For information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html">
     * Install the Session Manager Plugin for the AWS CLI</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return Result of the StartSession operation returned by the service.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws TargetNotConnectedException
     *         The specified target instance for the session is not fully configured for use with Session Manager. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-getting-started.html"
     *         >Getting Started with Session Manager</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    StartSessionResult startSession(StartSessionRequest startSessionRequest);

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return Result of the StopAutomationExecution operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InvalidAutomationStatusUpdateException
     *         The specified update status operation is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StopAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StopAutomationExecutionResult stopAutomationExecution(StopAutomationExecutionRequest stopAutomationExecutionRequest);

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
     * instance. A terminated session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return Result of the TerminateSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateSessionResult terminateSession(TerminateSessionRequest terminateSessionRequest);

    /**
     * <p>
     * Updates an association. You can update the association name and version, the document version, schedule,
     * parameters, and Amazon S3 output.
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return Result of the UpdateAssociation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidUpdateException
     *         The update is not valid.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidAssociationVersionException
     *         The version you specified is not valid. Use ListAssociationVersions to view all versions of an
     *         association according to the association ID. Or, use the <code>$LATEST</code> parameter to view the
     *         latest version of the association.
     * @throws AssociationVersionLimitExceededException
     *         You have reached the maximum number versions allowed for an association. Each association has a limit of
     *         1,000 versions.
     * @sample AWSSimpleSystemsManagement.UpdateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAssociationResult updateAssociation(UpdateAssociationRequest updateAssociationRequest);

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociationStatus" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * <p>
     * The document you want to update.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return Result of the UpdateDocument operation returned by the service.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws DocumentVersionLimitExceededException
     *         The document has too many versions. Delete one or more document versions and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DuplicateDocumentContentException
     *         The content of the association document matches another document. Change the content of the document and
     *         try again.
     * @throws DuplicateDocumentVersionNameException
     *         The version name has already been used in this document. Specify a different version name, and then try
     *         again.
     * @throws InvalidDocumentContentException
     *         The content for the document is not valid.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
     * @sample AWSSimpleSystemsManagement.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDocumentResult updateDocument(UpdateDocumentRequest updateDocumentRequest);

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return Result of the UpdateDocumentDefaultVersion operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @sample AWSSimpleSystemsManagement.UpdateDocumentDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDocumentDefaultVersionResult updateDocumentDefaultVersion(UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest);

    /**
     * <p>
     * Updates an existing Maintenance Window. Only specified parameters are modified.
     * </p>
     * 
     * @param updateMaintenanceWindowRequest
     * @return Result of the UpdateMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMaintenanceWindowResult updateMaintenanceWindow(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest);

    /**
     * <p>
     * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the
     * following:
     * </p>
     * <p>
     * The target from being an ID target to a Tag target, or a Tag target to an ID target.
     * </p>
     * <p>
     * IDs for an ID target.
     * </p>
     * <p>
     * Tags for a Tag target.
     * </p>
     * <p>
     * Owner.
     * </p>
     * <p>
     * Name.
     * </p>
     * <p>
     * Description.
     * </p>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return Result of the UpdateMaintenanceWindowTarget operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMaintenanceWindowTargetResult updateMaintenanceWindowTarget(UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest);

    /**
     * <p>
     * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all
     * fields required by the <a>RegisterTaskWithMaintenanceWindow</a> action are required for this request. Optional
     * fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return Result of the UpdateMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTask(UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return Result of the UpdateManagedInstanceRole operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateManagedInstanceRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateManagedInstanceRoleResult updateManagedInstanceRole(UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest);

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return Result of the UpdatePatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePatchBaselineResult updatePatchBaseline(UpdatePatchBaselineRequest updatePatchBaselineRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Or, use the <a>ResetServiceSetting</a> to change
     * the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest
     *        The request body of the UpdateServiceSetting API action.
     * @return Result of the UpdateServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.UpdateServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateServiceSettingResult updateServiceSetting(UpdateServiceSettingRequest updateServiceSettingRequest);

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
