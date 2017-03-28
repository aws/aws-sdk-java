/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>Amazon EC2 Systems Manager</fullname>
 * <p>
 * Amazon EC2 Systems Manager is a collection of capabilities that helps you automate management tasks such as
 * collecting system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images
 * (AMIs), and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and
 * securely manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon EC2 instance or
 * on-premises machine in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/">Amazon EC2 Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-prereqs.html">Systems Manager
 * Prerequisites</a>.
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
     * in the <i>Amazon EC2 User Guide</i>.
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
     * @throws TooManyTagsErrorException
     *         The <code>Targets</code> parameter includes too many tags. Remove one or more tags and try the command
     *         again.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * When you associate a document with one or more instances using instance IDs or tags, the SSM Agent running on the
     * instance processes the document and configures the instance as specified.
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
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         You must specify values for all required parameters in the SSM document. You can only supply values to
     *         parameters defined in the SSM document.
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
     * When you associate a document with one or more instances using instance IDs or tags, the SSM Agent running on the
     * instance processes the document and configures the instance as specified.
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
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
     *         </p>
     *         <p>
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
     *         You can have at most 200 active SSM documents.
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
     *         Error returned when an idempotent operation is retried and the parameters don’t match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance
     *         Windows have been created).
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
     * 
     * @param createPatchBaselineRequest
     * @return Result of the CreatePatchBaseline operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don’t match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance
     *         Windows have been created).
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePatchBaselineResult createPatchBaseline(CreatePatchBaselineRequest createPatchBaselineRequest);

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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don’t plan to use Run Command on the server, we suggest uninstalling the SSM Agent first.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     * Describes the associations for the specified Systems Manager document or instance.
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return Result of the DescribeAutomationExecutions operation returned by the service.
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
     * Describes the specified SSM document.
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
     * document is shared, it can either be shared privately (by specifying a user’s AWS account ID) or publicly
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * Retrieves the individual task executions (one per target) for a particular task executed as part of a Maintenance
     * Window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     * For a given Maintenance Window execution, lists the tasks that were executed.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     * Lists the executions of a Maintenance Window (meaning, information about when the Maintenance Window was
     * scheduled to be active and information about tasks registered and run with the Maintenance Window).
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
     * Lists the targets registered with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return Result of the DescribeMaintenanceWindowTargets operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     * Get information about a parameter.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * Retrieves the default patch baseline.
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
     * AWS-ApplyPatchBaseline Systems Manager document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return Result of the GetDeployablePatchSnapshotForInstance operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest);

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
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    GetMaintenanceWindowResult getMaintenanceWindow(GetMaintenanceWindowRequest getMaintenanceWindowRequest);

    /**
     * <p>
     * Retrieves details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return Result of the GetMaintenanceWindowExecution operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Retrieves the details about a specific task executed as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return Result of the GetMaintenanceWindowExecutionTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest);

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
     * @sample AWSSimpleSystemsManagement.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    GetParameterHistoryResult getParameterHistory(GetParameterHistoryRequest getParameterHistoryRequest);

    /**
     * <p>
     * Get details of a parameter.
     * </p>
     * 
     * @param getParametersRequest
     * @return Result of the GetParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    GetParametersResult getParameters(GetParametersRequest getParametersRequest);

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return Result of the GetPatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         You can have at most 200 active SSM documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     *         <code>GetInventorySchema</code> to see the available schema version for each type.
     * @sample AWSSimpleSystemsManagement.PutInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
     *      Documentation</a>
     */
    PutInventoryResult putInventory(PutInventoryRequest putInventoryRequest);

    /**
     * <p>
     * Add one or more paramaters to the system.
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
     * @throws UnsupportedParameterTypeException
     *         The parameter type is not supported.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance
     *         Windows have been created).
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
     *         Error returned when an idempotent operation is retried and the parameters don’t match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance
     *         Windows have been created).
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
     *         Error returned when an idempotent operation is retried and the parameters don’t match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits (e.g. too many Maintenance
     *         Windows have been created).
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
     *         The resource type is not valid. If you are attempting to tag an instance, the instance must be a
     *         registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
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
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
     *         </p>
     *         <p>
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
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InvalidRoleException
     *         The role name can't contain invalid characters. Also verify that you specified an IAM role for
     *         notifications that includes the required trust policy. For information about configuring the IAM role for
     *         Run Command notifications, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *         Amazon SNS Notifications for Run Command</a> in the <i>Amazon EC2 Systems Manager User Guide</i>.
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
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StartAutomationExecutionResult startAutomationExecution(StartAutomationExecutionRequest startAutomationExecutionRequest);

    /**
     * <p>
     * Stop an Automation that is currently executing.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return Result of the StopAutomationExecution operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StopAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StopAutomationExecutionResult stopAutomationExecution(StopAutomationExecutionRequest stopAutomationExecutionRequest);

    /**
     * <p>
     * Updates an association. You can only update the document version, schedule, parameters, and Amazon S3 output of
     * an association.
     * </p>
     * 
     * @param updateAssociationRequest
     * @return Result of the UpdateAssociation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the SSM document. You can only supply values to
     *         parameters defined in the SSM document.
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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * @throws InvalidDocumentContentException
     *         The content for the document is not valid.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
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
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMaintenanceWindowResult updateMaintenanceWindow(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest);

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
     *         The SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is
     *         running. On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         The SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling the SSM Agent
     *         or EC2Config service.
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
     * 
     * @param updatePatchBaselineRequest
     * @return Result of the UpdatePatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource (e.g. a Maintenance Window) doesn’t exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePatchBaselineResult updatePatchBaseline(UpdatePatchBaselineRequest updatePatchBaselineRequest);

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
